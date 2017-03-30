package march30;

/*
 * 실제 현실세계에서 은행을 방문해서 할 수 있는 일들을 미리
 * 시뮬레이션 할 수 있는 프로그램을 만들어보자 !
 */
// 프로그램에서 사용할 AWT 컴포넌트들을 임포트하기
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

// 화면에 윈도우 출력해주는 클래스 만들기 
class GUIBankFrameClass extends Frame implements ActionListener {
	

	
	
	// 통장 개설 버튼 준비
	private Button create_acct_bt = new Button("통장 개설") ;
	
	// 입금 일을 해주는 버튼 준비
	private Button deposit_bt = new Button("입금");
	
	// 출금 일을 해주는 버튼
	private Button withdraw_bt = new Button("출금");
	
	// 잔액 조회 일을 해주는 버튼
	private Button search_balance_bt = new Button("잔액 조회");
	
	// 프로그램 종료 버튼
	private Button exit_bt = new Button("종료");
	
	
		
	
	// 그리드 백 레이아웃 준비
	private GridBagLayout gbl = new GridBagLayout();
	
	// 폰트
	private Font f = new Font("굴림체", Font.BOLD, 15);
	
	
	MyBankAcctClass ref_new_acct_ob ;
	// 전역 변수로 바꿈 
	
	// 새로운 계좌번호를 만들어주는 스레드 클래스를 *내*부*클*래*스*로 만들기
	private class CreateNewAcctNoThreadClass extends Thread {
		
		// 임시로 계좌번호를 보관하는 변수 선언!
		// 계좌번호 형식 : 4자리 - 4자리 - 4자리 - 4자리
		
		// 첫번째 4자리 계좌번호 보관 변수
		private String temp_acct_no1 = "";
		
		// 두번째 4자리 계좌번호 보관 변수
		private String temp_acct_no2 = "";
		
		// 세번째 4자리 계좌번호 보관 변수
		private String temp_acct_no3 = "";
		
		// 네번째 4자리 계좌번호 보관 변수 
		private String temp_acct_no4 = "";
		
		// 하나의 난수(정수)를 만들어서 반환하는 함수 만들기
		private int create_new_no() {
			int temp_no = (int)(Math.random() * 9) +1;	
			return temp_no;
		}
		
		private String create_four_no() {
			
			int temp_no ; 
			String temp_sno = "";
		
			for(int i = 0; i < 4 ; ++i) {
				temp_no = (int)(Math.random() * 9) +1; 
				temp_sno += "" + temp_no;
			}
			
			return temp_sno;
			
		}
		
		
		
		
		
		@Override
		public void run() {
			
			/*
			 * 1. 새로운 계좌 번호 생성
			 * 2. 만들어진 계좌번호를 전역 변수 ref_new_acct_ob에 넣어주기
			 */
			
			/*temp_acct_no1 = create_four_no();
			temp_acct_no2 = create_four_no();
			temp_acct_no3 = create_four_no();
			temp_acct_no4 = create_four_no();*/
			
			/*ref_new_acct_ob = */
			
		
		}
		
		
	}
	
	
	
	
	/*
	 * 새로운 통장을 개설할 때 사용자로부터 이름을 입력 받고
	 * 승인 버튼(OK 버튼)과 취소 버튼이 있응 다이얼로그 클래스 만들기
	 */
	private class MyNewAcctDialog extends Dialog {
		
		// 종료 버튼 클릭시 자식창만 꺼지게 하기 위한 다이얼로그 변수 선언
		Dialog new_acct_this ;
		// 생성자 함수로 이동
		
		
		// 고객 이름을 저장할 변수 선언
		private String client_name ; // 사용자가 입력한 이름을 저장할 예정
		
		// 고객 이름을 입력 받는 라벨 &텍스트 필드 선언
		private Label client_name_lb = new Label("성함");
		private TextField client_name_tf = new TextField("강진주", 30);
		
		// 승인 & 취소 버튼
		private Button ok_bt = new Button("승인");
		private Button cancle_bt = new Button("취소");
		
		// 그리드 레이아웃 선언
	//	GridLayout grd_layout = new GridLayout(2,2,2,2);
		
		// OK 버튼과 CANCEL 버튼이 들어가는 판넬 컨테이너 만들기
		private Panel ref_ok_cancel_pl = new Panel();
		// 판넬은 기본적으로 flowLayout을 가지고 있음!
		// 모든 컴포넌트를 한줄로 나열함 !!! 
		
		// 이름 요청 라벨 & 텍스트필드를 넣을 판넬 ! 
		private Panel ref_name_pl = new Panel();
		
		
		/*
		 * 
		 * 화면 구성
		 * 1. 이름 요청 라벨 / 이름 입력 텍스트 필드
		 * 2. 승인 버튼 / 취소 버튼 
		 * -> GridLayout 쓸래
		 */
		/*
		 * 가운데 위치에 고객 이름 입력 받는 부분 작성
		 * 아래 위치에는 판넬 객체를 사용해서 OK&Cancel 버튼 넣는 방법도 이씀
		 */
		
		
		// 생성자 함수 만들기
		/*
		 * 외부 클래스에 있는 함수로부터 부모 윈도우 창의 주소와 다이얼로그 창에 
		 * 보여줄 타이틀 그리고 모달 여부를 받아오는 생성자!
		 */
		private MyNewAcctDialog(Frame ref_parent_frame,
				String ref_title_dialog,
				boolean modal) {
			// Dialog 클래스에 있는 Dialog(Frame, String,boolean) 생성자 함수를 실행
			super(ref_parent_frame,ref_title_dialog,modal);
			
			/*
			 * 자식창만 꺼질수 있도록 
			 * 메모리에 생성된 Dialog 객체의 주소값을 저장하는 명령문 작성
			 */
			this.new_acct_this = this;
			
			/*
			 * 판넬에 사용자에게 이름을 요청하는 라벨과 사용자가 이름을 입력할 수
			 * 있는 텍스트필드 컴포넌트 넣기
			 */
			// 판네의 주소를 갖고 있는 변수이름 .add();
			ref_name_pl.add(client_name_lb);
			ref_name_pl.add(client_name_tf);
			// Ok 버튼과 calcel 버튼을 판넬에 넣기!
			ref_ok_cancel_pl.add(ok_bt);
			ref_ok_cancel_pl.add(cancle_bt);
			
			// 위쪽에 만든 판넬을 보더 레이아웃에 넣기
			// 가운데에 넣기
			this.add(ref_name_pl);
			// 가운데 위치는 BorderLayout.CENTER 생략 가능 
			
			// 아래쪽에 넣기
			this.add(BorderLayout.SOUTH,ref_ok_cancel_pl);
			
			// 버튼 클릭 이벤트 처리를 위한 명령문 작성
			// new 버튼클릭 이벤트를 받는 리스너 인터페이스 이름() 
			// -> new Act ionListener()
			// 원래 new 인터페이스이름 -> 불가, new 다음에는 클래스 이름만 올 수 있음
			/*
			 * new 인터페이스이름() {
			 * actionPerfomed() 메소드 재정의
			 * }
			 *		// 위의 경우에는 new 다음 인터페이스 이름이 올 수 이씀!!
			 *		-> 메모리에 actionPerfomed() 함수가 만들어지고 메모리에 만들어진
			 *		actionPerformed() 함수의 주소를 인터페이스 이름 ActionListener가 받아오는 문법
			 *		-> 임시 객체를 메모리에 생성하면서 이벤트가 발생할때 실행되는 메소드를  메모리에 넣는 방법 
			 *
			 *
			 */
			// 승인 버튼 클릭시! 이벤트!
			ok_bt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					/*
					 * OK 버튼 클릭시
					 * 1. 다이얼로그 창 꺼지고
					 * 2. 계좌번호 생성
					 */
					
				}
			});
			
			// 캔슬 버튼 클릭시 발생하는 이벤트!
			cancle_bt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// 통장 개설 창만 꺼지게 만들자!!
					
					Window new_acct_window = new_acct_this;
					new_acct_window.dispose();
					
			
				}
				
				
			});
			
			
		}
		
		
		
	}
	
	
	
	
	private class MyBankAcctClass {
		
		/*
		1. 통장 주인 이름 보관 변수 필요
		*/
		private String name;
		
		/*
		2. 계좌 번호를 보관할 수 있는 변수 필요
		*/
		
		private String acct_no;
		// 어차피 산술계산 필요하지 않으니까 String으로!
		
		/*
		3. 계좌 비밀번호 보관할 수 있는 변수 필요 
		*/
		private String acct_pw;
		
		/*
		4.현재 예금액을 보관할 수 있는 변수
		*/
		private int balance;
		
		// 외부 클래스에 있는 많은 종류의 컴포넌트들을 그대로 사용 가능
		// -> 외부 클래스는 현재 메모리에 생성된 상태이기 때문
		
		// 5. 생성자를 만들어서 다른 클래스에서 위에 선언한 전역 변수로 값을 저장하기
		private MyBankAcctClass(
				String name_value, 
				String acct_no_value,
				String acct_pw_value,
				int init_balance) {
			
			System.out.println("통장을 개설합니다.");
			
			// 다른 클래스로부터 받은 이름, 계좌번호, 비밀번호, 초기 예금액을
			// 위에서 선언한 전역 변수에 각각 저장
			this.name = name_value;
			this.acct_no = acct_no_value;
			this.acct_pw = acct_pw_value;
			this.balance = init_balance;
			
			System.out.println(this.name + "님 반갑습니다.");
			System.out.println("새로운 계좌 번호는 " + this.acct_no + " 입니다.");
			System.out.println("초기 예금액은 " + this.balance + "원 입니다.");
			System.out.println("***통장 개설을 축하드립니다.***");
			
			
		}
	
	}

	
	
	
	// 새로운 함수를 만들어서 그리드 백 레이아웃에 새로운 컴포넌트 넣기
	/*
	 * 다른 함수로부터 그리드 백 레이아웃에 넣 을 객 체의 주소를 받기
	 * -> 모든 컴포넌트의 부모 클래스 Component 사용
	 * Component ref_new_component
	 * 
	 * 두번째 매개 변수는 행 위치 값 받는 변수 선언 : int row_index;
	 * 세번째 - 열 위치 값 받는 변수 선언 : int col_index;
	 * 네번째 : 컴포넌트 컴포넌트 사이 여백 채워주는 fill 값 가져오는 변수 선언 : int fill_index
	 * 다섯번쨰 컴포넌트 창 크기 바꿀때 마다 컴포넌트의 크기를 일정하게
	 * 유지시켜주기 위한 비율(비중) 값을 실술로 받는 변수 선언 : double weightx
	 * -> 가로 윈도우 크기에 대한 비중 값
	 * 
	 * 에섯번째 - 세로 비중값 변수 선어 ㄴ: double weighty;
	 * -> 세로 윈도우 크기에 대한 비중(비율) 값
	 * 
	 */
	
	public void add_component(Component new_component,
			int row_index,
			int col_index,
			int fill_value,
			double weightx,
			double weighty) {
		// 모든 컴포넌트 객체의 주소를 받을 수 있음
		// Component : 모든 컴포넌트들의 부모 클래스(다형성 개념을 사용)
		// 부모 클래스 객체의 주소를 사용해서 모든 자 식 클래스로 이동 가능
		System.out.println("새로운 컴포넌트를 그리드 백 레이아웃에 넣습니다.");
		
		// 위치 값을 보관하기 위한 GridBagConstraints 클래스를 사용한 새로운 객체 만들기
		GridBagConstraints ref_gbc = new GridBagConstraints();
		ref_gbc.gridx = col_index;
		ref_gbc.gridy = row_index;
		ref_gbc.fill = fill_value;
		ref_gbc.weightx = weightx;
		ref_gbc.weighty = weighty;
		
		// 위치 값을 그리드 백 레이아웃에 전달
		this.gbl.setConstraints(new_component, ref_gbc);
		this.add(new_component);
		
		
	}
	
	public void add_component(Component new_component,
			int row_index,
			int col_index,
			int gridwith_value,
			int fill_value,
			double weightx,
			double weighty) {
		// 모든 컴포넌트 객체의 주소를 받을 수 있음
		// Component : 모든 컴포넌트들의 부모 클래스(다형성 개념을 사용)
		// 부모 클래스 객체의 주소를 사용해서 모든 자 식 클래스로 이동 가능
		System.out.println("새로운 컴포넌트를 그리드 백 레이아웃에 넣습니다.");
		
		// 위치 값을 보관하기 위한 GridBagConstraints 클래스를 사용한 새로운 객체 만들기
		GridBagConstraints ref_gbc = new GridBagConstraints();
		ref_gbc.gridx = col_index;
		ref_gbc.gridy = row_index;
		ref_gbc.fill = fill_value;
		ref_gbc.weightx = weightx;
		ref_gbc.weighty = weighty;
		ref_gbc.gridwidth = gridwith_value;
		
		// 위치 값을 그리드 백 레이아웃에 전달
		this.gbl.setConstraints(new_component, ref_gbc);
		this.add(new_component);
		
		
	}
	
	
	
/*	public void add_component(Button ref_new_bt,
			int row_index,
			int col_index,
			int fill_value,
			double weightx,
			double weighty) {
		// 이 함수는 버튼 객체의 주소만 받음
	}
	
	public void add_component(TextField ref_new_tf,
			int row_index,
			int col_index,
			int fill_value,
			double weightx,
			double weighty) {
		// 이 함수는 텍스트필드 객체 전용 함수
	}
	
	public void add_component(TextArea ref_new_ta,
			int row_index,
			int col_index,
			int fill_value,
			double weightx,
			double weighty) {
		// 텍스트 아레아 전용 함수 
		
	}*/
	/*
	 * 내부 클래스 만들기 : 내부 전용 클래스 만들기 : 다른 클레스에서는 사용할 수 없는 클래스
	 * private 접근 제한자를 사용한 클래스 : 현재클레스에서만 사용 가능
	 * private class 내부 클래스 이름 { } 
	 */
	// 이벤트 처리만을 전담하는 클래스 만들기 : 사용자가 윈도우 종료 버튼(x)을 클릭하는
	// 경우에만 동작하는 windowClosing() 함수를 갖는 클래스
	private class MyWindowHandler extends WindowAdapter {
		
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
	
	/*
	 * class 내부 클래스 이름 { } 
	 *  	// visible 클래스-> 다른 클래스에서 사용할 수 있는 클래스 
	 * 
	 */
	
	//   기본 생성자 만든 다음에 버튼 컴포넌트들을 add_component() 함수를 사용해서 
	// 그리드 백 레이아웃에 넣기
	
	public GUIBankFrameClass() {
		// super() 명령문을 작성해서 부모 클래스인 Frame에서 갖고 있는
		// 생성자를 실행해서 윈도우에 보여질 타이틀을 전달 
		super("Haley's Bank Window");
		// setLayout으로 배치 관리자 변경
		this.setLayout(gbl);
		// 폰트 적용 
		this.create_acct_bt.setFont(f);
		this.deposit_bt.setFont(f);
		this.exit_bt.setFont(f);
		this.withdraw_bt.setFont(f);
		this.search_balance_bt.setFont(f);
	
		// 이벤트 처리 명령문 작성하기
		// 버튼에서 발생할 수 있는 클릭 이벤트 처리시에 자동으로 actionPerformed()
		// 함수가 실행 될 수 있는 ActionListener 스레드 프로그램에게 버튼의 존재를 알림
		this.create_acct_bt.addActionListener(this);
		this.deposit_bt.addActionListener(this);
		this.exit_bt.addActionListener(this);
		this.withdraw_bt.addActionListener(this);
		this.search_balance_bt.addActionListener(this);
		
		// 윈도우 종료 이벤트 처리
		// 윈도우 종료 이벤트 발생할 떄 windowClosing() 함수가 실행 될 수 있도록
		// 현재 프레임 윈도우의 존재를 WindowListener 스레드 프로그램에게 알림
		// 현재 프레임 윈도우 주소를 갖고 있는 this변수. addWindowListener();
		// () 소괄호 안에는 위에서 만든 new 내부 클래스이름();;
		this.addWindowListener(new MyWindowHandler());
		// new 클래스이름() -> 임시 객체를 생성(일회용 객체)
		
	
		
		
		/*
		 * 위에서 만든 add_component() 함수를 사용해서 5개의 버튼들을 
		 * 그리드 백 레이아웃에 넣기
		 * 
		 * 1. 컴포넌트 객체의 주소
		 * 2. row_index : 행의 위치
		 * 3. col_index : 열의 위치
		 * 4. fill_value 
		 * 		: 가로 방향으로 컴포넌트 크기를 크게 하려면 HORIZONTAL
		 * 		: 세로 방향으로 컴포넌트 크기를 크게 하려면 VERTICAL
		 * 		: 가로, 세로 방향 모두 크기를 크게 : BOTH
		 * 5. weightx : 가로 방향의 가중치(비율 또는 비중) : 실수 값
		 * 6. weighty : 세로 방향의 가중치(비율 또는 비중) : 실수 값
		 * 		-> 예) 1.0 또는 weightx : 한 줄에 들어가는 컴포넌트 갯수응 사용
		 */
		
		this.add_component(create_acct_bt, 0, 0,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		this.add_component(deposit_bt, 0,1,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		this.add_component(withdraw_bt,1,0,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		this.add_component(search_balance_bt,1,1,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		this.add_component(exit_bt, 2, 0, 2,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		
		// -> 마지막 버튼은 gridwidth = 2 로 해야함 
		
		// 위의 버튼들을 setActionCommand로 쉽게 바꾸기
		/*
		 * 1. 통장개설버튼 "1"
		 * 2. 입금 버튼 "2"
		 * 3. 인출 버튼 "3"
		 * 4. 잔액조회 버튼 "4"
		 * 5. 종료 버튼 "5"
		 */
		
		this.create_acct_bt.setActionCommand("1");
		this.deposit_bt.setActionCommand("2");
		this.withdraw_bt.setActionCommand("3");
		this.search_balance_bt.setActionCommand("4");
		this.exit_bt.setActionCommand("5");
		
		// 윈도우의 크기를 변경하기 -> 젤 크게 
		// this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setSize(250, 250);
		this.setResizable(false); // 윈도우 크기 변경 불가
		this.setVisible(true); // 화면에 윈도우 출력 
		
		
	}
	
	/*
	 * 사용자가 5개 버튼 중 하나의 버튼을 클릭하는 경우에 자동으로 실행되는 
	 * 콜백 함수 -> 자바 가상머신에 의해서 실행되는 함수 
	 * 
	 */
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// 이벤트 발생한 곳의 메모리 주소 알아오기
		Object ref_event = ae.getSource();
		if(ref_event instanceof Button) {
			System.out.println("사용자가 버튼 클릭");
			
			// 5개의 버튼중 어떤 버튼을 클릭했는지
			
			// 버튼 형 변환
			Button ref_clicked = (Button)ref_event;
			// 위에서 지정한 번호를 getActionCommand() 함수를 사용해서 설정
			String action_command = ref_clicked.getActionCommand();
			
			// 버튼별로 이름줘서하자 귀찮..
			
			if(action_command.equals("1") == true) {
				System.out.println("사용자가 통장 개설 버튼 클릭");
				// 위에서 만든 내부 클래스 MyBankAccClass를 사용해서 새로운 객체 만들기
				
				// ref_new_acct_ob 지역 참조 객체 -> 현재 블럭에서만 사용할 수 있는 객체 
				ref_new_acct_ob = new MyBankAcctClass("강진주","123456789","12345", 500000);
				
				
				
			}
			else if(action_command.equals("2") == true ) {
				System.out.println("입금 버튼 클릭");
			}
			else if(action_command.equals("3") == true) {
				System.out.println("출금 버튼 클릭");
			}
			else if(action_command.equals("4") == true) {
				System.out.println("잔액 조회 버튼 클릭");
			}
			else if(action_command.equals("5") == true) {
				System.out.println("프로그램 종료 버튼 클릭");
				JOptionPane.showMessageDialog(this,"프로그램을 종료합니다.");
				System.exit(0);
			}
			else {
				System.out.println("아직 처리할 수 없는 버튼 입니다.");
			}
			
			
			
			
		}
		else if ( ref_event instanceof TextField) {
			System.out.println("사용자가 텍스트 필드에 입력");
		}
		
		
		
	}
	
}

public class TestGUIBankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 위에서 만든 GUI 클래스를 사용해서 새로운 객체를 만든 다음 만들어진 객체의 주소를
		// 참조형 변수에 저장하기 
		GUIBankFrameClass ref_gui_ob = new GUIBankFrameClass();
		
		

	}

}
