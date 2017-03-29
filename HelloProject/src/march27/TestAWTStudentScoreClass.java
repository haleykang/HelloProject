package march27;

/*
 * 학생 성적 등록과 조회를 할 수 있는 프로그램 만들기
 * 1. 학생 성적을 관리할 수 있는 클래스 만들기
 * class MyStudentScoreClass {
 * 		// 이름 보관 변수
 * 		private String m_name;
 * 		// 국어 점수 보관 변수
 * 		private int m_kor ;
 * 		// 영어 점수 보관 변수
 * 		private int m_eng ;
 *		// 수학 점수 보관 변수
 *		private int m_math;
 *		// 총점 보관 변수
 *		private int m_total;
 *		// 평균 보관 변수
 *		private double m_avg;  
 * 
 */

import java.util.*; // 컬렉션 사용
import java.awt.*; // awt 관련 클래스 사용
import java.awt.event.*; // awt 관련 이벤트 처리 클래스 사용
import javax.swing.*; // swing 관련 클래스 사용
import javax.swing.plaf.synth.SynthSeparatorUI;

import myjava.lang.MyTest;





/*
 * 성적 조회 창을 화면에 보여주는 클래스 만들기
 */

class MyShowFindScoreChildFrame extends Dialog implements ActionListener {
	
	/*
	 * 종료 버튼을 눌렀을때 자식창만 꺼지게 변수 선언 
	 */
	Dialog ref_this;
	// 생성자로 이동
	
	/*
	 * 사용자가 초이스 컴포넌트에서 선택한 아이템에 따른 유일한 정수 값을 보관하는 변수 선언
	 * 
	 * 만약 사용자가 번호 검색 아이템을 선택한 경우에는 변수에 정수 1을 저장
	 * 
	 * 국어 점수 아이템을 선택하면 변수에 정수 2를 저장
	 * 
	 * 영어 점수 아이템을 선택하면 변수에 정수 3을 저장
	 * 
	 * 수학 점수 아이템을 선택하면 변수에 정수 4를 저장 
	 *
	 */
	private int key_choice = 0;
	
	
	/*
	 * 성적 조회 창에 보여줄 내용 정하기
	 * 
	 * 1. 사용자가 찾을 데이터를 입력 받는 창
	 * 		1) 라벨 객체 준비 : "검색할 키워드 입력"
	 * 		2) 사용자가 입력할 텍스트필드 준비  
	 * 		3) 검색 버튼 준비
	 * 		4) 사용자가 선택할 번호 검색 아이템, 국어 점수 검색 아이템, 영어 점수 검색 아이템, 
	 * 			수학 점수 검색 아이템을 갖는 Choice 컴포넌트 준비 
	 */
	
	
	// 먼저 Choice 컴포넌트 준비
	private Choice ref_choice = new Choice();
	// 초이스 컴포넌트에 넣을 검색 아이템을 문자열 배열에 저장
	private String str_array [] = {"아이템 선택", "번호", "국어 점수", "영어 점수", "수학 점수"};
	
	// 초기화 블럭을 작성해서 위에서 만든 str_array 배열에 저장되어 있는 모든 문자열 들을
	// 초이스 컴포넌트에 넣기
	{
		System.out.println("초이스 컴포넌트에 검색 아이템 문자열 넣기");
		for(int i =0 ; i < str_array.length; ++i) {
			this.ref_choice.add(str_array[i]);
			System.out.println("초이스 컴포넌트의 " + i + " 위치에 저장된 아이템 문자열은 " +
			str_array[i] + " 입니다.");
			
		}
	}
	
	// Label 컴포넌트 준비하기
	private Label ref_lb1 = new Label("검색할 아이템");
	
	// 검색 요청 라벨...
	
	// 사용자가 번호 또는 점수(국 영 수)를 입력 할 수 있는 입력 창 만들기
	private TextField ref_tf1 = new TextField("", 40);
	
	// 검색 버튼 만들기
	private Button ref_bt1 = new Button("검색");
	
	/*
	 * GridBagLayout 배치 관리 자 사용하기 위한 준비
	 */
	private GridBagLayout ref_grid_bag = new GridBagLayout();
	private GridBagConstraints ref_grid_bag_constraints = new GridBagConstraints();
	
	// 검색 결과를 보여주는 TextArea 컴포넌트 준비
	private TextArea ref_ta1 = new TextArea("",10,80);
	
	// 종료 버튼
	private Button ref_bt2 = new Button("취소");
	
	// 사용자가 입력한 내용과 검색 결과들을 모두 지워주는 버튼
	private Button ref_bt3 = new Button("초기화");
	
	// 폰트 변수
	private Font t = new Font("궁서체", Font.BOLD, 15);
	
	// 위에서 만든 특정 컴포넌트들을 특정 위치에 넣어주는 함수 만들기
	public void add_component(Component ref_component, int row_index, int col_index) {
		// 컴포넌트의 위치 값을 갖는 객체 만들기
		ref_grid_bag_constraints = new GridBagConstraints();
		
		// 컴포넌트 행 위치 번호 저장
		ref_grid_bag_constraints.gridy = row_index;
		
		// 컴포넌트 열 위치 번호 저장
		ref_grid_bag_constraints.gridx = col_index;
		
		// 컴포넌트 비율 조정
		ref_grid_bag_constraints.weightx = 1 / 2.0;
		
		// 컴포넌트와 컴포넌트 사이에 존재하는 빈공간 없애기
		ref_grid_bag_constraints.fill = GridBagConstraints.HORIZONTAL;
		
		// 그리드 백 레이아웃에게 설정 정보를 전달
		ref_grid_bag.setConstraints(ref_component, ref_grid_bag_constraints);
		
		// 컴포넌트를 그리드 백 레이아웃에 넣기
		this.add(ref_component);
		
	}
	
	// 메인 창에서 전달 받은 성적 정보 벡터를 저장하는 전역 변수 선언
	private Vector<MyStudentScoreClass> ref_score = null;
	
	
	// Dialog 클래스에는 기본 생성자 함수가 없음
	public MyShowFindScoreChildFrame(Frame ref_parent_frame, String ref_title, boolean modal,
			Vector<MyStudentScoreClass> ref_score) {
		
		super(ref_parent_frame, ref_title, modal);
		
		this.ref_this = this; // 자식창만 끄기 이어서 ->
		// 메모리에 생성된 Dialog 객체에 주소값을 저장하는 명령문!
		
		// 메인 창에서 전달 받은 성적 벡터 정보를 전역 변수에 저장
		this.ref_score = ref_score; 
		
		// setLayout() 함수를 사용해서 Dialog 클래스가 갖고 있는 기본 배치 관리자를 바꾸기
		this.setLayout(ref_grid_bag);
		
		/*
		 * 첫번째 행에는 라벨 출력
		 */
		this.add_component(ref_lb1, 0, 0);
		
		/* 
		 * 첫번째 행 두번째 열에는 초이스 출력
		 */
		this.add_component(ref_choice, 0, 1);
		
		/*
		 * 2번째 행, 첫번째 열에는 사용자가 검색할 번호 또는 입력 텍스트 필드
		 */
		this.add_component(ref_tf1, 1, 0);
		
		/*
		 * 2.2 자리에는 검색 버튼 출력
		 */
		this.add_component(ref_bt1, 1, 1);
		
		/*
		 * 3.1 자리에는 검색 결과 출력 아레아
		 */
		this.add_component(ref_ta1, 2, 0);
		
		/*
		 * 3.2 자리에는 종료 버튼 출력
		 */
		this.add_component(ref_bt2, 2, 1);
		
		/*
		 * 4.0 에는 초기화 버튼 출력
		 */
		this.add_component(ref_bt3, 3, 0);
		
		
		// 윈도우 종료
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				// 종료 이벤트 발생한 윈도우의 주소를 알아오기
				Window ref_window = we.getWindow();
				
				// dispose() 함수를 실행해서 현재 창만 종료
				ref_window.dispose();
				
			}
		});
		
		/*
		 * 초이스 컴포넌트에서 발생하는 이벤트는 ItemEvent 
		 * -> 먼저 addItemListener() 함수를 실행해서 이벤트 처리를 리스너 스레드
		 * 		프로그램에 알려줌
		 * 		-> 초이스가 갖고 있는 아이템 문자열을 사용자가 선택하면 발생하는 이벤트 
		 * 		-> 아이템 검색 문자열
		 * 		-> 국어 점수 검색 문자열
		 * 		-> 영어 점수 검색 문자열 등등 
		 * 		-> 사용자가 아이템을 선택하면 ItemEvent 이벤트가 발생하고 리스너 프로그램은
		 * 		ItemEvent 타입의 새로운 객체를 생성
		 * 		새로 만들언지진 ItemEvent 타입의 객체는 itemStateChanged() 함수에 전달 
		 * 
		 * -> 사용자가 아이템을 선택하는 경우에 선택한 아이템을 가져오기 위해서는 
		 * 		itemStateChanged() 함수를 재정의 해야함 
		 * 		-> ItemListener 인터페이스가 갖고 있는 함수
		 * 
		 * ->초이스 변수이름 . addItemListener( new ItemEvent() {
		 * 		@Override
		 * 		public void itemStateChagned(ItemEvent ie) {
		 * 		// 사용자가 아이템을 선택하면 실행될 명령문 작성
		 * 
		 * 		}
		 * });
		 */
		
		ref_choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("사용자가 초이스 컴포넌트에 있는 아이템을 선택");
				String item_value = ref_choice.getSelectedItem();
				
				System.out.println("사용자가 선택한 아이템은 " + item_value);
				
				/*
				 * 사용자가 선택한 아이템에 대한 문자열을 갖고 있는 변수 item_value를 검사
				 */
				if(item_value.trim().equals("번호") == true) {
					System.out.println("사용자가 선택한 번호 검색 아이템을 1로 지정");
					key_choice = 1;
					System.out.println("전역 변수 key_choice에 저장된 정수는 " + key_choice);
				}
				// 사용자가 국어 점수 아이템을 선택 했을때
				else if(item_value.trim().equals("국어 점수") == true) {
					System.out.println("사용자가 선택한 국어 점수 아이템을 2로 지정");
					key_choice = 2;
					System.out.println("key_choice에 저장된 정수는 " + key_choice);
				}
				// 사용자가 영어 점수 아이템을 선택 했을때
				else if(item_value.trim().equals("영어 점수") == true) {
					System.out.println("영어 점수 아이템을 3으로 지정");
					key_choice = 3;
					System.out.println("저장된 정수는 " + key_choice);
				}
				// 사용자가 수학 점수 아이템을 선택 했을 떄
				else if(item_value.trim().equals("수학 점수") == true) {
					System.out.println("수학 점수 아이템을 4로 지정");
					key_choice = 4;
					System.out.println("저장된 정수는 " + key_choice);
				}
				
				
				
				
				
				// 초이스 컴포넌트가 갖고 있는 아이템 총 갯수를 읽어와서 변수에 저장
				int item_count = ref_choice.getItemCount();
				
				System.out.println("초이스 컴포넌트가 갖 고 있는 아이템의 총 갯수는 " + item_count);
				// 아이템이 보관되어 있는 str_array 배열의 크기와 동일함
				int length_str_array = str_array.length;
				System.out.println("배열 str_array의 크기는 " + length_str_array);
				
			}
		});
		
		// 각각의 버튼에서 발생할 수 있는 이벤트 처리 명령문 작성하기
		this.ref_bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("검색 버튼 클릭");
				
				/*
				 *  사용자가 아이템을 선택하지 않은 경우의 처리 부분을 먼저 작성
				 */
				if(key_choice == 0) {
					JOptionPane.showMessageDialog(null, "검색할 아이템을 선택해주세요.");
					// actionPerformed() 함수만 탈출하는 명령문
					return;
				}
				/*
				 * 사용자가 입력한 검색할 내용을 받아오기
				 */
				String input = ref_tf1.getText().trim();
				
				/*
				 * 사용자가 입력을 하지 않고 검색 버튼을 누르는 경우를 처리
				 */
				if(input == null || input.length() == 0) {
					
					JOptionPane.showMessageDialog(null, "입력 오류\n검색할 내용을 입력하세요");
					// 사용자가 내용을 입력할 수 있도록 커서 위치를 텍스트 필드로 이동 시키기
					ref_tf1.setFocusable(true); // 커서를 받을 준비 시키김
					
					// 커서의 위치를 텍스트 필드로 이동시키기 위해 requestFocus() 함수 사용
					ref_tf1.requestFocus();
					return;
					
				}
				/*
				 * 사용자가 입력한 검색 내용을 다이얼로그에 출력
				 */
				JOptionPane.showMessageDialog(null, "사용자가 입력한 검색 내용은 " + input);
				/*
				 * 전역 변수 key_choice가 갖고 있는 값에 따라서 번호 검색을 할 것인지
				 * 국어 점수 검색 할지, 영어 점수 검색 할지, 수학 점수 검색할지 결정하는 조건문 또는 선택문 작성
				 * 
				 * 
				 * 조건문 사용 시 : if 문(여러 개의 조건을 처리할 수 있는 다중 if문)
				 * 선택문 사용지 : switch ~ case 문
				 */
				
				// 아래 조건을 검사하기 전에 먼저 등록된 성적 데이터가 있는지 여부를 검사
				int size_ref_score = ref_score.size();
				if(size_ref_score == 0){
					JOptionPane.showMessageDialog(null, "등록된 성적 데이터가 없습니다.");
					return;
				}
				// 콘솔 화면에서 성적 등록된 성적 갯수 출력
				System.out.println("지금까지 등록된 성적 갯수는 " + size_ref_score);
				
				
				// 조건 문 : 다중 if 문
				
				// switch ~ case 문
				switch (key_choice) {
				case 1: 
					System.out.println("번호 검색 하기");
					
					/*
					 * 번호 검색 하기
					 * 
					 * 1. 반복문이 필요 : 벡터 변수에 저장된 모든 학생 성적 데이터들을 읽어오는 반복문
					 * for(int i = 0; i < size_ref_score; ++i) {
					 * 		// 벡터 변수가 갖고 있는 get() 함수를 사용해서
					 * 		// 벡터 변수가 가진 학생 성적 데이터를 하나씩 가져오기
					 * 		// 벡터 변수 이름.get(위치 번호)
					 */
					// 찾은 학생 성적 정보들을 보관할 수 있는 변수 선언
					String result_str = "";
					
					// 벡터 변수에서 성적 정보를 읽어오고 사용자가 입력한 번호화 비교하는 반복문 작성
					
					for(int i = 0; i < size_ref_score; ++i) {
						
						MyStudentScoreClass ref_student_score = ref_score.get(i);
						
						int s_no = ref_student_score.get_no();
						int i_input = Integer.parseInt(input);
						
						if(s_no == i_input) {
							System.out.println("사용자가 입력한 학생 번호를 찾았습니다.");
							// TextArea 컴포넌트에 보여줄 학생 정보 만들기
							result_str += "이름 : " + ref_student_score.get_name() + 
									"\n국어 점수 : " + ref_student_score.get_kor() +
									"\n영어 점수 : " + ref_student_score.get_eng() +
									"\n수학 점수 : " + ref_student_score.get_math() + "\r\n";
							/*
							 * TextArea 컴포넌트 에서 줄 바꿈을 인식하는 문자는 "\r\n"
							 * "\r" : carriage return 커서의 위치를 현재 줄의 처음으로 이동
							 * \n : new line 커서의 위치를 아래 줄로 이동
							 */
						} // end of if(s_no == i_input)
					} // end of for
					
					// for() 반복문을 벗어난 위치에서 검색에 성공했는지 여부를 화면에 출력
					// 변수 result_str이 갖고 있는 문자열을 읽어와서 비교하기
					if(result_str.equals("") == true) {
						JOptionPane.showMessageDialog(null, "번호 데이터 검색 실패");
						return;
					}
					else {
						JOptionPane.showMessageDialog(null, "번호 데이터 검색 성공");
						// 찾은 학생 성적 정도들을 TextArea 컴포넌트에 넣기
						ref_ta1.setFocusable(true); // 포커스를 TextArea로 이동
						// setText() 함수를 사용해서 화면에 출력
						ref_ta1.setText(result_str);
					}
					
					
					break;
					
				case 2:
					System.out.println("국어 점수 검색 하기");
					break;
				case 3:
					System.out.println("영어 점수 검색 하기");
					break;
				case 4:
					System.out.println("수학 점수 검색 하기");
					
				default:
					System.out.println("오류?");
					break;
				}
				
				
				
				
			}
		});
		this.ref_bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("종료 버튼 클릭");
				
				// 자식 창만 종료하기! 
				Window window_dialog = ref_this;
				
				window_dialog.dispose();
				
				
				
			}
		});
		this.ref_bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("초기화 버튼 클릭");
				
			}
		});
		
		
		this.setSize(500,500);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	
	
}

		@Override
	public void actionPerformed(ActionEvent ae) {
		
		
	}
}

// Dialog 클래스를 상속 받는 자식 윈도우 클래스 만들기
/*
 * 사용자가 메인 창에서 성적 등록 버튼을 클릭하는 경우에만 사용되는 클래스
 */
class MyShowRegChildFrame extends Dialog {
	
	/*
	 * 종료 버튼 클릭시 자식 창만 종료 될 수 있도록 변수 먼저 선언
	 * -> 선언 후 생성자로 이동
	 */
	Dialog ref_reg_this;

	/*
	 * 다른 함수에서도 사용할 수 있는 전역 변수 선언 
	 */
	// 사용자가 입력한 이름 변관하는 변수 선언
	private String ref_name = "";
	
	// 사용자가 입력한 국어 이름
	private int ikor_score = 0;
	private String skor_score = "";
	
	// 사용자가 입력한 영어 점수
	private int ieng_score = 0;
	private String seng_score = "";
	
	// 사용자가 입력한 수학 점수
	private int imath_score = 0;
	private String smath_score = "";
	
	// 총점
	private int itotal_score = 0;
	// private String stotal_score = "";
	
	// 평균
	private double davg_score = 0.0;
	

	/*
	 * Dialog 클래스에는 기본 생성자 함수가 없음
	 * -> Dialog 클래스에서 사용할 생성자인 
	 * public Dialog(Frame ref_parent_frame, String ref_title , boolean modal) {
	 * 
	 * }
	 * 함수와 현재 클래스를 연결해주는 super() 명령문 작성 
	 * -> super : 변수 -> 부모 클래스의 메모리 주소를 갖고 있는 자동 변수
	 * -> super() : 부모 클래스에 있는 생성자 함수를 실행 !
	 * -> super.함수이름() : 부모 클래스에 있는 일반 함수를 실행 
	 * 
	 * -> super(메인창의 주소, 다이얼로그에 보여줄 타이틀 문자열, 모달 여부를 참, 거짓으로 작성);
	 * 
	 *  -> super(Frame, "title", true 또는 false);
	 *  
	 *  // 아래에서 작성한 생성자 함수를 통해서 전달 받는 메인 창의 주소를 보관하는 변수 선언
	 */
	
	private Frame ref_parent_frame ; // 클래스 안에 있는 모든 함수에서 사용 가능한 전역 변수 
	/*
	 * 화면 구성
	 * 
	 * 다이얼로그 창에 보여줄 컴포넌트들을 준비하기
	 * 
	 * 1. 학생 이름 입력 창 만들기 
	 * 		1) 라벨 : Label 변수이름 = new Label("이름 입력"); 
	 * 		2) 텍스트 필드 : TextField 변수이름 = new TextField("홍길동",10);
	 * 2. 국어 점수 입력 창 만들기
	 * 		1) 라벨
	 * 		2) 텍스트 필드
	 * 3. 영어 점수 입력 창 만들기
	 * 		1) 라벨
	 * 		2) 텍스트 필드
	 * 4. 수학 점수 입력 창 만들기
	 * 		1) 라벨
	 * 		2) 텍스트 필드 
	 * 5. 총점 출력 창 만들기
	 * 		-> 사용자가 이름 & 국영수 점수 입력 후 엔터 클릭했을 때 자동으로 총점 계산해서 
	 * 		-> 출력 창에 총점 출력(버튼 없이)
	 * 		1) 라벨 : Label 변수이름 = new Label("총점");
	 * 		2) 라벨 :  Label 변수이름 = new Label("0"); -> 나중에 총점이 여기에 출력 되도록!
	 * 6. 평균 출력 창 만들기
	 * 		-> 총점이 출력 창에 보여진 후에 총점을 읽어와서 평균 값을 계산한 후 
	 * 		출력 창에 평균 값을 출력
	 * 		1) 라벨 -> 평균 
	 * 		2) 라벨 -> 점수 출력 ("0.0");
	 * 7. 위에서 입력된 모든 정보들을 벡터 컬렉션 클래스에 저장해주는 버튼 만들기
	 * 		1) 버튼 : "성적 저장"
	 * 8. 취소 버튼(프로그램 종료) 
	 * 
	 */
	
	// 1, 이름 입력창 만들기
	private Label input_name_lb1 = new Label("학생 이름");
	private TextField input_name_tf1 = new TextField("", 10);
	
	// 2. 국어 점수 입력창 만들기
	private Label input_kor_score_lb1 = new Label("국어 점수");
	private TextField input_kor_score_tf1 = new TextField("", 10);
	
	// 3. 영어 점수 입력창 만들기
	private Label input_eng_score_lb1 = new Label("영어 점수");
	private TextField input_eng_score_tf1 = new TextField("", 10);
	
	// 4. 수학 점수 입력창 만들기
	private Label input_math_score_lb1 = new Label("수학 점수");
	private TextField input_math_score_tf1 = new TextField("", 10);
	
	// 5. 총점 출력 창
	private Label total_lb1 = new Label("총점");
	private Label print_total_lb1 = new Label("0");
	
	// 6. 평균 출력 창 
	private Label avg_lb1 = new Label("평균 점수");
	private Label print_avg_lb1 = new Label("0.0");
	
	// 7. 성적 저장 버튼
	private Button child_save_score_bt = new Button("성적 저장");
	
	// 8. 프로그램 종료 버튼
	private Button child_exit_bt = new Button("취소");
	
	
	// 새롭게 사용할 GridBagLayout 배치 관리자를 사용하기 위한 객체 준비
	private GridBagLayout ref_grid_bag_layout = new GridBagLayout();
	
	// 그리드 백 레이아웃의 특정 위치에 들어가는 컴포넌트의 위치 정보를 갖게되는
	// GridBagConstraints 캘래스를 사용한 객체 선언 
	private GridBagConstraints ref_grid_bag_constraints = null;
	
	// 메인 창에서 전달해줌 성적 벡터 변수 보관
	private Vector<MyStudentScoreClass> ref_score = null;
	
	// 생성자 함수도 이동해 메인 창 클래스에서 전달해준 성적 벡터를 ref_score 변수에 
	// 저장하는 명령문 작성하기
	// this.ref_score = 생성자 함수에서 선언한 지역 변수 이름 ; 
	
	
	// 새로운 컴포넌트를 그리드 백 레이아웃의 특정 위치(행 위치, 열 위치)에 넣어주는
	// 새로운 함수 만들기
	/*
	 * 모든 컴포넌트들의 부모 클래스인 Component를 사용하면
	 * 하나의 함수로 서로 다름 타입의(Button, Label, TextField, TextArea ...)들을
	 * 처리할 수 있는 다형성 함수가 됨
	 */
	public void add_compenent(
			Component ref_component, int row_index,
			int col_index) {
		
	//	System.out.println("새로운 컴포넌트를 레이아웃에 넣기");
		this.ref_grid_bag_constraints = new GridBagConstraints();
		
		this.ref_grid_bag_constraints.gridx = col_index;
		this.ref_grid_bag_constraints.gridy = row_index;
		
		this.ref_grid_bag_constraints.weightx = 1 / 2.0;
		this.ref_grid_bag_constraints.fill = GridBagConstraints.HORIZONTAL;
		
		 this.ref_grid_bag_layout.setConstraints(ref_component, ref_grid_bag_constraints);
		 this.add(ref_component);
		 
		
	}
	
	
	/*
	 * 사용자가 입력한 성적 정보를 받는 함수 만들기
	 */
	public boolean
		save_score(String name_value, int kor_value,
				int eng_value, int math_value) {
		System.out.println("이름은 " + name_value);
		System.out.println("국어 점수는 " + kor_value);
		System.out.println("영어 점수는 " + eng_value);
		System.out.println("수학 점수는 " + math_value);
		
		// 사용자가 입력한 점수들을 사용해서 총점 구하기
		int temp_total = kor_value + eng_value + math_value;
		System.out.println("총점은 " + temp_total);
		
		// 평균 구하기
		double temp_avg = temp_total / 3.0;
		System.out.printf("평균은 %.2f\n ",  temp_avg );
		
		// 구한 총점을 화면에 출력할
		print_total_lb1.setText(temp_total + "");
		
		// 평균을 출력하기전에 String.format 함수를 사용해서 소숫점 자릿수 지정
		// String.format("%.2f", temp_avg);
		String temp_res_avg = String.format("%.2f", temp_avg);
		
		print_avg_lb1.setText(temp_res_avg);
		
		return true;
		
	}
	
	
	public MyShowRegChildFrame(
			Frame ref_parent_frame_object,
			String ref_title,
			boolean modal, Vector<MyStudentScoreClass> ref_score) {
		//Vector<MyStudentScoreClass> ref_score 
		
		// super() 명령문은 다른 명령문 보다 먼저 작성
		super(ref_parent_frame_object, ref_title, modal);
		
		/*
		 * 자식창만 닫을 수 있도록 이어서
		 */
		this.ref_reg_this = this;
		// 자식창의 주소를 여기에 저장?
		// 이어서 종료 버튼 이벤트로 이동!
		
		
		/*
		 * super() 명령문이 Dialog 클래스에 있는 Dialog(Frame, String,boolean) 생성사 함수 실행
		 */
		
		
		// 메인 창 클래스에서 전달해준 성적 벡터를 전역 변수에 저장하는 명령문 
		this.ref_score =ref_score;
		
		
		
		
		// actionPerformed() 함수를 통해 전달되는 메인 창의 주소를 위에서 선언한 전역 변우인
		// ref_parent_frame_object 에 저장하는 명령문
		this.ref_parent_frame = ref_parent_frame_object;
		// this. 클래스에 있는 전역 변수, 없으면 지역 변수
		
		// setLayout() 함수를 사용해 Dialog 클래스가 갖고 있는 기본 배치관리자를
		// BorgerLayout-> GridBagLayout 으로 변경
		this.setLayout(ref_grid_bag_layout);
		
		
		/*
		 * 사용자가 성적 저장 버튼을 클릭하는 경우
		 * 사용자가 입력한 정보 가져오기
		 * 
		 */
		
		
		
		// 사용자가 성적 저장 버튼을 클릭한 경우에 실행할 명령문들을 작성 
		this.child_save_score_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("사용자가 성적 저장 버튼을 클릭");
				
				/*
				 * 방금 만든 save_score() 함수를 실행하는 명령문 작성
				 * 
				 * save_score( 이름 문자열, 국어 점수, 영어 점수, 수학 점수);
				 * 이름 문자열은 input_name_tf.getText().trim();
				 * 국어 점수 Integer.parseInt(input_kor_score_tf.getText().trim());
				 * 
				 */
				
				String temp_name = input_name_tf1.getText().trim();
				int temp_kor = Integer.parseInt(input_kor_score_tf1.getText().trim());
				int temp_eng = Integer.parseInt(input_eng_score_tf1.getText().trim());
				int temp_math = Integer.parseInt(input_math_score_tf1.getText().trim());
				
				
				boolean check_save_score = save_score(temp_name, temp_kor, temp_eng, temp_math);
				System.out.println("save_score() 함수에서 반환된 값은 " + check_save_score);
			
				
				
				MyStudentScoreClass ref_student_score = new MyStudentScoreClass(temp_name);
				ref_score.add(ref_student_score);
				
				
				// 사용자가 입력한 점수들고 벡터에 저장
				ref_student_score.set_kor(temp_kor);
				ref_student_score.set_eng(temp_eng);
				ref_student_score.set_math(temp_math);

				// 총점 구하기 get_total () gㅏㅁ수 실행 후 임시변수 저작
				int total = ref_student_score.get_total();
				System.out.println("계산된 총점은 " + total);
				
				// 평균 구하기 get_avg() 함수 실행 후 변수 저장
				double avg = ref_student_score.get_avg();
				System.out.printf("계산된 평균은 %.2f\n", avg);
				
				// 벡터 클래스가 갖고 있는 size() 함수를 실행해서 지금까지 벡터 변수에 저장된
				// 학생 성적 갯수를 알 수 있음
				int count = ref_score.size();
				System.out.println("지금까지 저장된 학생 성적 갯수는 " + count + " 입니다.");
				
			}
		});
		
		// 사용자가 취소 버튼을 클릭한 경우세 실행할 명령문!!!!
		this.child_exit_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// 자식창만 끄고 싶어요!
				
				Window dialog_window = ref_reg_this;
				
				dialog_window.dispose();
			
			}
		});
		
		// 사용자가 취소 버튼을 클릭한 경우에 실행항 명령문들을 작성..?
		
		/*this.child_exit_bt.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				// TODO Auto-generated method stub
				
						
						 * 자바 가상 머신이 we 변수에 종료 이벤트가 발생한 윈도우 정보를 전달
						 * 
						 * 윈도우 종료 이벤트가 발생한 윈도우 객체의 주소를 가져오기
						 * -> getWindow() 함수 사용
						 
						Window ref_window_ob = we.getWindow();
						// JOptionPane.showMessageDialog(this,"성적 입력을 취소합니다.");
						
						// 현재 화면에 보여지고 있는 다이얼로그 창을 닫기
						// -> Window 클래스가 갖고 있는 dispose() 함수 실생
						ref_window_ob.dispose();
						// System.exit(0);
					}
					
				});*/
			

		
		/*
		 * 이름 출력 라벨 컴포넌트를 그리드 백 레이아웃의 표 안에 넣기
		 * 
		 * 1. 위치 정차기 : 행의 위치 번호, 열의 위치 번호를 정해야 함
		 *  	행 gridy , 열 gridx 변수로 지정
		 *  먼저 그리드 백 컨스트레인츠를 메모리에 생성하지
		 */
	//	this.ref_grid_bag_constraints = new GridBagConstraints();
		/*
		 * input_name_lb1 이름 출력 라벨 컴포넌트의 행의 위치 번호를 정한 다음 gridy 변수에 저장
		 */
		
	//	this.ref_grid_bag_constraints.gridy = 0; // 첫번째 행
		//this.ref_grid_bag_constraints.gridx = 0; // 첫번째 열
		
		/*
		 * 위에서 정한 행 열의 위치를 그리드 백 레이아웃 객체에 전달 -> setConstraints() 함수 사용
		 */
		//this.ref_grid_bag_layout.setConstraints(this.input_name_lb1, ref_grid_bag_constraints);
		
		/*
		 * this.input_name_lb1 컴포넌트를 넣기
		 */
//		this.add(this.input_name_lb1);
		/*
		 * 첫번째 행, 두번째 칸에 들어가는 이름 입력 컴포넌트 설정
		 */
		// 1. GridBagConstraints()
	//	this.ref_grid_bag_constraints = new GridBagConstraints();
		
		// 2. 행 0, 열 1
	//	this.ref_grid_bag_constraints.gridy = 0;
	//	this.ref_grid_bag_constraints.gridx = 1;
		
		// 3. setConstraints()s
	//	this.ref_grid_bag_layout.setConstraints(this.input_name_tf1, 	ref_grid_bag_constraints);
		
		// 4. add()
	//	this.add(this.input_name_tf1);
		
		// 방금 만든 add_compenent() 사용하기
		// 첫번째 행 첫번째 열에는 출력 라벨
		this.add_compenent(this.input_name_lb1,0,0);
		this.add_compenent(this.input_name_tf1, 0, 1);
		
		// 두번째 국어점수라벨 & 텍스트 필드
		this.add_compenent(this.input_kor_score_lb1, 1, 0);
		this.add_compenent(this.input_kor_score_tf1, 1, 1);
		
		// 세번째 영어점수 라벨& 텍스트
		this.add_compenent(this.input_eng_score_lb1,2, 0);
		this.add_compenent(this.input_eng_score_tf1, 2, 1);
		
		// 네번쨰 수학 점수 라벨 & 텍스트
		this.add_compenent(this.input_math_score_lb1, 3, 0);
		this.add_compenent(this.input_math_score_tf1,3,1);
		
		// 다섯번쨰 총점 라벨 & 총점 출력 라벨
		this.add_compenent(this.total_lb1,4, 0);
		this.add_compenent(this.print_total_lb1, 4, 1);
		
		// 여섯번째 평균 라벨 & 출력 라벨
		this.add_compenent(this.avg_lb1, 5, 0);
		this.add_compenent(this.print_avg_lb1,5, 1);
		
		// 7번째 저장 버튼
		this.add_compenent(this.child_save_score_bt, 6, 0);
		
		// 8번째 취소 버튼
		this.add_compenent(this.child_exit_bt,6, 1);
		
		// 다이얼로그 창의 크기 결정
		this.setSize(new Dimension(300,300));
		// this.setSize(int width, int height);
		this.pack(); // 빈 공간 없애줌
		
		// 다이얼로그 창 종료
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				
				/*
				 * 자바 가상 머신이 we 변수에 종료 이벤트가 발생한 윈도우 정보를 전달
				 * 
				 * 윈도우 종료 이벤트가 발생한 윈도우 객체의 주소를 가져오기
				 * -> getWindow() 함수 사용
				 */
				Window ref_window_ob = we.getWindow();
				
				// 현재 화면에 보여지고 있는 다이얼로그 창을 닫기
				// -> Window 클래스가 갖고 있는 dispose() 함수 실생
				ref_window_ob.dispose();
				// System.exit(0);
			}
			
		});
		
		// 다이얼로그 윈도우 창의 크기를 사용자가 바꾸지 못하도록 하려면 
		// setResizable() 함수에 false 값 전달 하면된
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
}



// 화면에 성적 등록 버튼과 성적 조회 버튼 그리고 프로그램 종료 버튼을 출력해주는 클래스 만들기
class MyMainFrame extends Frame implements ActionListener {
	
	// 성적 등록 자식 창을 화면에 보여주는 버튼 만들기
	private Button show_reg_score_bt = new Button("성적 등록");
	
	// 성적 조회 자식 창을 화면에 보여주는 버튼 만들기
	private Button show_find_score_bt = new Button("성적 조회");
	
	// 프로그램 종료 버튼
	private Button exit_bt = new Button("프로그램 종료");
	
	// 모든 자식 창에서 공유하는 Vector 변수 준비 ! 꼭 !!!!!!!!!!!!!!!
	// 하나로 관리하기 위해 static으로 준비 
	private static Vector<MyStudentScoreClass> ref_student_score_ob 
							= new Vector<MyStudentScoreClass>();
	
	// 글자 크기 키울때 사용할 폰트 변수
	private static Font f = new Font("궁서체", Font.BOLD, 15); 
	
	
	/*
	 * setLocation() 함수에서 사용할 x 좌표 정수 값을 검사하는 함수
	 * 
	 * x 좌표 정수 값이 0 보다 작은 경우에는 거짓(false) 반환
	 * 아닌 경우에는 참(true) 반환
	 * 
	 * non-static 함수로 만들기
	 */
	public boolean check_x_positio(int x_position) {
		System.out.println("x 좌표 값을 검사합니다.");
		if(x_position<0) {
			System.out.println("x 좌표 정수 값이 음수");
			return false;
		}
		else {
			System.out.println("x 좌표 정수 값이 양수");
			return true;
		}
	}
	// static 함수로 만들기
	public static boolean check_x_position2(int x_position) {
		System.out.println("x 좌표 값 검사");
		if(x_position < 0) {
			System.out.println("x 좌표 값 음수");
			return false;
		}
		else {
			System.out.println("x 좌표 값 양수");
			return true;
		}
	}
	
	// y 좌표 검사 static 함수 만들기
	public static boolean check_y_positio(int y_position) {
	//	System.out.println("y 좌표 값 검사");
		if(y_position < 0) {
			//System.out.println("y 좌표 값이 음수");
			return false;
		}
		else {
			//System.out.println("y 좌표 값이 0 이상");
			return true;
		}
	}
	// 동시에 x 좌표와 y 좌표를 검사하는 static 함수 만들기
	public static boolean check_xy_position(int x_position, int y_position) {
		
		// 위에서 만든 check_x_position2() 함수를 재사용해서 x 좌표 정수 값을 검사
		boolean result_check_x_position2 = check_x_position2(x_position);
		if(result_check_x_position2 == false) {
			return false;
		}
		// 위에서 만든 check_y_position() 함수 재사용
		boolean result_check_y_position = check_y_positio(y_position);
		if(result_check_y_position == false) {
			return false;
		}
		
		// 프로그램에서 사용할 수 있는 x, y 좌표 값을 화면에 출력
		System.out.println("x 좌표는 " + x_position);
		System.out.println("y 좌표는 " + y_position);
		return true; // 정상적인 경우
		
	}
	
	
	/*
	 * 현재 모니터 화면의 크기를 구해서 Dimension 클래스 형으로 반환하는 함수
	 */
	public static Dimension get_screen_size() {
		// 모니터 크기를 임시 보관하는 변수 선언
		Dimension temp_dimension;
		
		System.out.println("현재 모니터 크기를 구합니다.");
		
		// getScreenSize() 함수 실행
		// -> 구해진 모니터 크기는 임시 변수인 temp_dimension에 저장
		temp_dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		System.out.println("모니터의 가로 크기는 " + temp_dimension.width);
		System.out.println("모니터의 세로 크기는 " + temp_dimension.height);
		
		// 모니터의 가로 & 세로 크기를 갖고있는 임시변수 반환
		return temp_dimension;
		
	}
	
	
	// 기본 생성자 만들기
	
	public MyMainFrame() {
		
		GridLayout grid_layout = new GridLayout(3,1,2,2);
		this.setLayout(grid_layout);
		this.add(show_reg_score_bt);
		this.add(show_find_score_bt);
		this.add(exit_bt);
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});	
		
		// 버튼별 이벤트 연결
		this.show_reg_score_bt.addActionListener(this);
		this.show_find_score_bt.addActionListener(this);
		this.exit_bt.addActionListener(this);
		
		// 각각의 버튼에 폰트 적용
		this.show_reg_score_bt.setFont(f);
		this.show_find_score_bt.setFont(f);
		this.exit_bt.setFont(f);
		
		this.setSize(500,500);
		this.pack();
		this.setResizable(false);
		
		/*
		 * 위에서 만든 check_x_position2() 함수를 실행해서 setLocation() 함수에서 사용할 x 좌표를 미리 검사
		 */
		boolean check_position = check_x_position2(50);
		if(check_position == true) {
			//JOptionPane.showMessageDialog(this,"x 좌표 정수 값은 사용할 수 있습니다.");
		} 
		else {
			//JOptionPane.showMessageDialog(this,"x 좌표 정수 값은 사용할 수 없습니다.");
		}
		check_position = check_y_positio(-50);
		if(check_position == true) {
			//JOptionPane.showMessageDialog(this, "y 좌표 정수 값은 사용할 수 있습니다.");
		}
		else {
			//JOptionPane.showMessageDialog(this, "y 좌표 정수 값은 사용할 수 없습니다.");
		}
		
		
		/*
		 * 방금 만든 get_screen_size() 함수를 실행해서 모니터 크기를 구한 다음에
		 * 구해진 모니터 크기를 임시 변수에 저장하는 명령문
		 */
		Dimension temp_screen_size = get_screen_size();
		
		// 임시 변수인 temp_screen_size에 모니터 크기를 보관
		// 이 위치에서도 모니터 크기를 확인 할 수 있음
		System.out.println("가로 크기 " + temp_screen_size.width);
		System.out.println("세로 크기 " + temp_screen_size.height);
		
		/*
		 * 모니터의 가로 크기는 1920
		 * 모니터의 세로 크기는 1080
		 */
		
		/*
		 * 화면에 모니터의 가운데 위치 구하기
		 * x 좌표 값 구하기 : 모니터 가로 크기 / 2 - 윈도우의 가로 크기 /2;
		 */
		int x_center_position ;
		// 화면에 출력할 메인 창(윈도우)의 가로 크기를 구한 다음 임시 변수에 저장
		// Frame 클래스의 getSize() 함수 사용
		
		// 메인 창의 가로 크기만 가져오는 명령문 
		int temp_width_frame = this.getSize().width;
		
		// 메인 창의 가로 크기와 세로 크기 전체를 가져오는 명령문
		Dimension temp_frame = this.getSize();
		
		// 메인 창의 세로 크기만 가져오는 명령문
		int temp_height_frame = this.getSize().height;
		
		// 콘솔 화면에 메인 창의 가로 크기와, 세로 크기를 출력
		System.out.println("메인 창의 가로 크기 " + temp_width_frame);
		System.out.println("메인 창의 세로 크기 " + temp_height_frame);

		// 화면에 모니터의 가운데 위치에 출력할 윈도우의 왼쪽 상단 x 좌표 값을 구하기
		// -> (모니터의 가로 크기 / 2) - ( 윈도우의 가로 크기 /2)
		
		x_center_position = (temp_screen_size.width/2) - (temp_width_frame / 2);
		int x_left_top_position = (temp_screen_size.width/2) - (temp_width_frame / 2);
		
		// 왼쪽 상단의 y 좌표 값 구하기
		// (모니터의 세로 크기 / 2 ) - ( 윈도우의 세로 크기 /2)
		int y_left_top_position = (temp_screen_size.height / 2) - (temp_height_frame/2);
		
		System.out.println("화면에 출력할 메인 윈도우의 왼쪽 상단 좌표 구하기 완료");
		System.out.println("x 좌표는 " + x_left_top_position);
		System.out.println("y 좌표는 " + y_left_top_position);
				
		/*
		 *모니터의 가로 크기는 1920
		 *모니터의 세로 크기는 1080
		 *메인 창의 가로 크기 132
		 *메인 창의 세로 크기 116
		 */
		
		/*
		 * 윈도우의 크기를 사용자가 바꾸지 못하도록 하기
		 * -> setResizable() 함수 사용
		 * -> setResizable(false) : 사용자가 못 바꿈
		 */
		// setLocation 함수를 사용해서 윈도우의 위치를 모니터의 가운데 위치로 이동
		this.setLocation(x_left_top_position, y_left_top_position);
		this.setVisible(true);
		
	}
	
	
	/*
	 * 사용자가 버튼을 클릭하는 경우 또는 텍스트 필드에서 엔터를 누르는 경우에
	 * 자바 가상 머신에 의해서 자동으로 실행되는 이벤트 처리 함수 
	 */
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		/*
		 * 이벤트가 발생한 곳(객체)의 주소를 가져오기
		 * -> ActionEvent 이벤트가 갖고  있는 getSource() 함수 실행
		 */
		Object ref_event = ae.getSource();
		
		/*
		 * 만약 사용자가 버튼을 클릭하는 경우 : 위쪽에서 버튼 참조 변수 이름.addActionListener(this)가
		 * 있는지 먼저 확인)
		 */
		if(ref_event instanceof Button) {
			System.out.println("사용자가 버튼을 클릭");
			// Object 부모 클래스 참조형 변수인 ref_event를 Button 자식 클래스 
			// 참조형으로 강제 형 변환 해주기 : 왜? 자식 클래스에 있는 함수들을 실행하기 위해
			// (Button 클래스에는 있고 Object 클래스에는 없는 함수들)
			
			
			Button ref_clicked_bt = (Button)ref_event;
			
			// 버튼 중에서 어떤 버튼이지 여부를 판단하기
			// 1. 성적 등록 버튼인 경우
			if(ref_clicked_bt == show_reg_score_bt) {
				System.out.println("성적 등록 버튼 클릭");
				
				MyShowRegChildFrame ref_show_reg_child_frame = 
						new MyShowRegChildFrame(this, "성적 등록 창", true, ref_student_score_ob);
				// 생성자에 Vector가 추가되서..
				/*ref_show_reg_child_frame.setSize(500,500);
			
				ref_show_reg_child_frame.setVisible(true);*/
			}
			// 2. 성적 조회 버튼 
			else if ( ref_clicked_bt == show_find_score_bt) {
				System.out.println("성적 조회 버튼 클릭");
				
				new MyShowFindScoreChildFrame(this, "성적 조회 창", true, ref_student_score_ob);
				
				
			}
			else if ( ref_clicked_bt == exit_bt) {
				System.out.println("프로그램 종료 버튼 클릭");
				JOptionPane.showMessageDialog(this,"프로그램을 종료합니다.");
				System.exit(0);
			}
			else {
				System.out.println("검토 후에 처리하겠습니다.");
				
			}
			
			
		}
		
		/*
		 * 만약 사용자가 텍스트 필드에서 엔터를 누르는 경우
		 */
		else if (ref_event instanceof TextField) {
			System.out.println("사용자가 텍스트 필드 안에서 엔터 클릭");
		}
		
		

		
	}
	
	
}


// 학생 성적 관리 클래스 만들기 

class MyStudentScoreClass {
	
	
	
	// 각종 변수 선언
	// 국어 성적 보관 변수 
	private int m_kor = 0;
	// 영어 성적 보관 변수
	private int m_eng = 0;
	// 수학 성적 보관 변수
	private int m_math = 0;
	// 총점 보관 변수
	private int m_total = 0;
	// 평균 점수 보관 변수 
	private double m_avg = 0.0;
	
	// 학생 이름 보관 변수 선언
	private String m_name;
	
	// 학생 객체 별로 관리되는 번호 저장 변수 선언 : 인스턴스 변수 선언 -> non-static 변수
	private int m_no;
	
	// 학생 번호를 만들때만 사용되는 변수 : 클래스 변수 선언 -> static 변수 
	// 왜 ? 학생 번호가 일정하게 유지되어야 하며, 모든 학생 객체들은 공유(공통)
	private static int s_no = 0;
	// 0 -> 첫번째 학생의 번호를 만들려면 ++s_no;
	// private static int s_no = 1; // 바로 사용 가능 -> 그 후에는 증가 
	
	
	
	// 무조건 새로운 학생 객체가 만들어지는 시점에 새로운 학생 번호를 만들고 
	// 만든 학생 번호를 반환(실행한 함수로 전달)하는 static 함수 만들기
	public static int create_no() {
		
		++s_no; // m_no 변수 쓰면 오류(non-static 변수라서)
		System.out.println("새로 만든 학생 번호는 " + s_no);
		return s_no;
		// 현재 생성자와 연결 
		// 현재 생성자에 있는 ++s_no 삭제(중복되니까)
		
	}
	
	
	
	// 기본 생성자 만들기
	public MyStudentScoreClass() {
		
		
		System.out.println("기본 생성자 실행");
		System.out.println("학생 번호 만들기");
		// ++s_no;
		// System.out.println("만들어진 학생 번호는 " + s_no + "번"); // 0 -> 1
		
		m_no = create_no();
		System.out.println("저장된 학생 번호는 " + m_no + "번");
		m_name = "무명학생";
		System.out.println("학생의 이름은 " + m_name);
		
		
		
	
	
	}
	// 다른 클래스들로 부터 이름을 받는 생성자 함수 만들기
	public MyStudentScoreClass(String name) {
		System.out.println("이름을 받는 생성자 함수 실행");
		this.m_name = name;
		System.out.println("이름이 전역 변수에 저장됨");
		// ++s_no;
		this.m_no = create_no();
		System.out.println(this.m_name + " 학생의 번호는 " + this.m_no + "번 입니다.");
		
		
	}
	// 새로운 함수를 추가해서 기본 생성자를 사용하는 다른 클래스에서 학생 이름을 바꿀 수 있도록
	// 해주는 함수 만들기 main() 함수로 부터 바꿀 학생 이름을 받는 일반 함수 
	public void change_name(String value) {
		System.out.println("main() 함수에서 새로운 바꿀 이름을 입력 받기");
		System.out.println("현재 이름은 " + m_name);
		System.out.println("바꿀 이름은 " + value);
		System.out.println("전역 변수에 저장합니다.");
		m_name = value;
	}
	
	/*
	 * 새로 추가한 변수 한개달 get(), set() 함수 만들기
	 */
	// private 변수인 m_kor에서 사용할 get() 함수 만들기
	public int get_kor() {
		System.out.println("현재 국어 점수를 읽어오는 함수");
		return m_kor;
	}
	// private 변수인 m_kor 에서 사용할 set(새로운 국어 점수) 함수 만들기
	public void set_kor(int new_score) {
		System.out.println("현재 국어 점수를 바꿉니다.");
		m_kor = new_score;
	}
	
	// m_eng 변수에 대한 get(), set() 함수 만들기
	public int get_eng() {
		return m_eng;
	}
	public void set_eng(int new_score) {
		m_eng = new_score;
	}
	
	// m_math 변수에 대한 get(), set() 함수 만들기
	public int get_math() {
		return m_math;
	}
	public void set_math(int new_score) {
		m_math = new_score;
	}
	
	// private 변수인 m_total에 대한 get(), set() 함수 만들기
	// total은 굳이 set() 함수 안필요할 듯
	public int get_total() {
		
		this.m_total = get_kor() + get_eng() + get_math();
		// 만든 함수를 재사용해서 총점을 구하고 난 뒤 반환
		return this.m_total;
	}
	/*public void set_total(int new_score) {
		
		m_total = new_score;
	}
	*/ 
	// private 변수인 m_avg에 대한 get(), set() 함수 만들기
	public double get_avg() {
		
		this.m_avg = get_total()/3.0; // 평균 구하고 반환 
		return this.m_avg;
	}
	/*public void set_avg(double new_score) {
		m_avg = new_score;
	}*/
	// 아까 change_name() 함수 만든거는 set()함수!
	// private 변수인 m_name에 대한 get 함수 만들기
	public String get_name() {
		return this.m_name;
	}
	
	public int get_no() {
		return m_no;
	}
	
	
	// 아래 함수는 그냥 내가 만든거
	public void input_name(String name) {
		
		this.m_name = name;
		++s_no;
		this.m_no = s_no;
		System.out.println(m_name + " 학생의 번호는 " + m_no + "번 입니다.");
		
	}
	
	
	
	
	
}

public class TestAWTStudentScoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			MyMainFrame ref_frame = new MyMainFrame();
		
	/*	// 첫 번째 학생 객체 만들기 
		MyStudentScoreClass ref_child_student1 = new MyStudentScoreClass();

		ref_child_student1.change_name("강웅구");
		
	//	System.out.println("**********************************************");
		// 두 번째 학생 객체 만들기
		MyStudentScoreClass ref_child_student2 = new MyStudentScoreClass();
	//	System.out.println("**********************************************");
		ref_child_student2.change_name("김진주");
		
	//	System.out.println("**********************************************");
		MyStudentScoreClass ref_child_student3 = new MyStudentScoreClass("이진주");
	//	ref_child_student1.input_name("강진주");
	// ref_child_student2.input_name("강진영");
	//	System.out.println("**********************************************");
		ref_child_student1.create_no();
	//	System.out.println("**********************************************");
		
		MyStudentScoreClass ref_child_student4 = new MyStudentScoreClass("배은화");
	//	System.out.println("**********************************************");
		
		// 강진주 학생의 국어 점수는 70
		ref_child_student3.set_kor(70);
		// 영어 점수는 100
		ref_child_student3.set_eng(100);
		
		// 수학 점수는 50;
		ref_child_student3.set_math(50);
		
		// 총점은 
		int total = ref_child_student3.get_total();
		System.out.println("총점은 " + total);
		
		// 평균
		double avg = ref_child_student3.get_avg();
		System.out.printf("평균은 %.2f \n",avg);
		
		
		 *  String 클래스의 format이라는 함수를 사용해서 소숫점 자리 조정 가능
		 *  -> String.format("소숫점 아래 자릿수 지정형식 문자 작성", 실수);
		 *  -> String.fotmat("%.2f", avg);
		 *  -> avg에 보관되어있는 실수를 문자열로 바꾼후에 문자열로 반환 
		 
		
		String str_value = String.format("%.3f",avg);
		System.out.println("평균을 소숫점 3자리까지 표현하면 " + str_value);
		
		*/
	
		

	}

}
