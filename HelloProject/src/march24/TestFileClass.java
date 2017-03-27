package march24;

/*
 * 성적 데이터를 입력 받는 화면 만들기
 * 
 * 성적 데이터를 파일에 저장하는 버튼 넣기
 * 
 * 파일에 저장된 성적 데이터를 읽어와서 화면에 보여주는 버튼 넣기
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// 파일 관련 입력과 출력 처리시에는 java io 패키지(input, output) 사용
// 입력 : 파일에서 프로그램으로 데이터를 읽어오는 것
// 출력 : 프로그램에서 발생하는 데이터를 파일에 쓴느 것

import java.io.*;

// 화면에 프레임 윈도우를 만들고 출력해주는 클래스 만들기


	

class MyFileFrame extends Frame implements ActionListener, TextListener {

	/*
	 * 입력된 점수중 하나라도 문자가 있으면 false, 데이터가 없어도 false
	 *  숫자이면 true 반환하는 함수
	 *  
	 */
	public static boolean check_digit(String score){
		
		// 결과값(참 또는 거짓)을 보관하는 변수 선언
		// 가정 : 아직은 문자 데이터를 발견하지 못한 상태로 표현 
		boolean result = true;
		
		// 점수 문자열 중에서 하나의 문자를 읽어와서 보관할 변수 선언
		char temp_ch = ' ';
		
		// 전달 받은 점수 문자열 안에 있는 문자의 갯수를 보관할 변수 선언
		int length = 0;
		
		// 전달 받은 점수 문자열의 문자 갯수를 구한 다음 변수 length에 저장
		length = score.length();
		
		// 문자 갯수가 없거나 음수인 경우에는 거짓 반환
		if(length <= 0) {
			result = false;
			return result;
		}
		System.out.println("전달받은 점수의 문자 갯수는 " + length + "개 입니다");
		
		// 반복문 + Character.isDigit() 함수를 사용해서 숫자가 아닌 문자가 있는지 검사
		// -> 문자를 발견하면 변수 result에 false 값을 저장한 후에 반복문을 탈출하거나
		// 함수를 종료(return result)
		for(int i =0 ; i < length; ++i) {
			
			/*
			 * charAt(위치 번호) 함수를 실행해서 문자열 점수가 있는 score 변수에서
			 * 하나의 문자를 읽어와서 변수 temp_ch에 저장 
			 */
			temp_ch = score.charAt(i);
			/*
			 * isDigit() 함수를 실행해서 하나의 문자를 갖고 있는 temp_ch 변수의 값을 전달
			 * -> isDigit() 함수는 전달 받은 문자가 숫자인 경우에만 참
			 * 그 외의 경우에는 거짓을 반환 
			 */
			boolean temp_result = Character.isDigit(temp_ch);
			/*
			 * isDigit() 함수가 반환한 값을 갖고 있는 변수 temp_result를 검사하기
			 * 만약 false 값을 갖고 있다면 문자가 포함되어 있는 경우 이므로
			 * 변수 result에 거짓값을 저장하고 현재 함수를 종료(탈출)
			 */
			if(temp_result == false) {
				result = false;
				return result;
			}
			
			return result;
		}
		
		// 모든 문자가 숫자인 경우에만 실행되는 명령문 
		return result;
		
	}
	
	
// 이건 실패야 너무 광범위하게 만들었어!!!
	
public void check_length(String a) {
	
	int length = a.length();
	
	if(length > 0 && length < 4) {
		// 자릿수가 3자리면 실행
	System.out.println("사용자가 입력한 숫자는" + a);
	System.out.println("자릿수는 " + length);	
	} else {
		
		System.out.println("잘못 입력 했습니다.");
		JOptionPane.showMessageDialog(this, "3자리의 정수를 입력하세요.");
	}
}

// 다시 함수 만들기

public static boolean check_score_length(String value) {
	// 1~3자리면 true, 4자리 이상이면 false
	
	int length = value.length();
	
	if(length > 0 && length < 4) return true;
	else return false;
	
}

public static void focus_change(TextField a) {
	
	// 입력된 문자를 다 선택해서 "" 공백으로 변경 
	a.selectAll();
	a.setText("");
	
	// 그리고 커서를 a위치로 돌려두는 함수
	a.setFocusable(true);
	a.requestFocus();
	return;
	
}
	
	
	// TextListener 인터페이스가 가지고 있는 함수의 머리부분!
 	// 가져와서 재정의
	@Override
	public void textValueChanged(TextEvent te) {
		System.out.println("입력중...");
		
		/*
		  어느 컴포넌트에서 점수를 입력하고 있는 중인지 판단
		 */
		
		Object t_event = te.getSource();
		
		if(t_event instanceof TextField ) {
			
			System.out.println("텍스트 필드에서 입력중...");
			
			// 일단 getSource()를 텍스트 필드로 형변환
			TextField tf_ob = (TextField)t_event;
			
			// 국어 점수 입력 중인지를 판단하기
			if(tf_ob == kor_tf){
				
				System.out.println("국어 점수 입력중...");
				
				/*
				 * 사용자가 입력한 국어 점수의 자릿수 알아오기
				 * 
				 * 1. 먼저 사용자가 입력한 국어 점수 가져오기
				 * -> TextField 클래스가 갖고 있는 getText() 함수 실행
				 */
				String kor_value = tf_ob.getText().trim();
				
				if(kor_value.equals("") == false) {
					
				//	System.out.println("사용자가 입력한 숫자는" + kor_value);
					// 사용자가 입력한 국어 점수의 자릿수 알아오기
					
					
					// check_length(kor_value);
					/////////////////////////////////////// 다시 새로 만든 함수 사용하기
					boolean temp = check_score_length(kor_value);
					
					if(temp == true) {
						System.out.println("1~3자리 범위의 정수 입력");
						
						
						
					} else {
						
						System.out.println("4자리 이상의 정수 입력");
						JOptionPane.showMessageDialog(this,"1~3자리의 정수를 입력하세요.");
						// kor_tf.setFocusable(true);
						// kor_tf.requestFocus(); 
						// return; -> 함수로 만들었다
						focus_change(kor_tf);
					}
					/* int length = kor_value.length();
					// System.out.println("국어 점수의 자릿수는 " + length);
					
					// 나중에 함수로 만들기 -> 일단 만들기
					if(length > 0 && length < 4) {
						// 자릿수가 3자리면 실행
					System.out.println("사용자가 입력한 숫자는" + kor_value);
					System.out.println("국어 점수의 자릿수는 " + length);	
					} else {
						
						System.out.println("잘못 입력 했습니다.");
						JOptionPane.showMessageDialog(this, "3자리의 정수를 입력하세요.");
						
						
						kor_tf.setFocusable(true);
						kor_tf.requestFocus();
						*/
						// 함수로 만들기
			
					} 
			}
			else if(tf_ob == eng_tf) {
				System.out.println("영어 점수 입력중...");
				
				String eng_value = tf_ob.getText().trim();
				
				if(eng_value.equals("") == false){
				
					// check_length(eng_value);
					boolean temp = check_score_length(eng_value);
					
					if(temp == true){
						
					} else {
						JOptionPane.showMessageDialog(this,"1~3자리의 정수를 입력하세요.");
						focus_change(eng_tf);
					}
				}
				
			}
			else if(tf_ob == math_tf) {
				System.out.println("수학 점수 입력중...");
				
				String math_value = tf_ob.getText().trim();
				
				if(math_value.equals("") == false){
					// check_length(math_value);
					boolean temp = check_score_length(math_value);
					
					if(temp == true) {
						
					}
					else {
						JOptionPane.showMessageDialog(this,"1~3자리의 정수를 입력하세요.");
						focus_change(math_tf);
					}
	
				}
			}
			else{
				System.out.println("기타...");
			}
		}
		else if(t_event instanceof TextArea) {
			
			System.out.println("텍스트 아레아에서 입력중...");
			
		}
		else {
			System.out.println("다른 곳에서...");
		}
		
	}
	
	
	/*
	 * 1. 프레임 윈도우에 넣을 컴포넌트들을 준비하기
	 * 
	 * -> 화면 구성 : 첫번째 줄 - 국어 점수 입력 부분
	 * 두번째 줄 - 영어 점수 입력 부분
	 * 세번째 줄 - 수학 점수 입력 부분
	 * 네번째 줄 - 위에서 입력한 데이터들을 파일에 저장하는 부분 만들기(버튼)
	 * & 파일에 저장된 성적 데이터들을 다시 화면에 출력해주는 부분
	 * 다섯번쨰 줄 - 데이터 초기화 버튼 / 취소 버튼 만들어서 프로그램 종료
	 * 
	 * 예) 국어점수입력 : (라벨) / 실제 국어 점수 입력은 텍스트필드
	 * private Label kor_lb = new Label("국어 점수 입력");
	 * private TextField kor_tf = new TextField("",50);
	 * 
	 */
	
	// 국어 점수 입력
	private Label kor_lb = new Label("국어 점수");
	private TextField kor_tf = new TextField("",20);
	
	// 영어 점수 입력
	private Label eng_lb = new Label("영어 점수");
	private TextField eng_tf = new TextField("",20);
	
	// 수학 점수 입력
	private Label math_lb = new Label("수학 점수");
	private TextField math_tf = new TextField("",20);
	
	//파일에 저장된 성적 데이터 저장 버튼 & 저장된 데이터 출력
	private Button save_bt = new Button("성적 저장하기");
	// private TextField save_tf =  new TextField("",50);
	
	// 저장된 파일 불러오기
	private Button print_bt = new Button("성적 불러오기");
	
	// 학생이 입력한 성적 데이터를 초기화 하는 버튼
	private Button reset_bt = new Button("성적 지우기");
	
	// 프로그램을 종료해주는 버튼 만들기
	private Button cancel_bt = new Button("종료");
	
	// 2. 기본 생성자 함수 만들기
	
	public MyFileFrame() {
		// 타이틀 만들기
		super("성적 입력/파일 저장/ 파일 읽기 프레임 윈도우");
		
		// 배치 관리자는 그리드 레이아웃 사용
		this.setLayout(new GridLayout(5,2,2,2));
		
		this.add(this.kor_lb);
		this.add(this.kor_tf);
		
		this.add(this.eng_lb);
		this.add(this.eng_tf);
		
		this.add(this.math_lb);
		this.add(this.math_tf);
		
		this.add(this.save_bt);
		//this.add(this.save_tf);
		this.add(this.print_bt);
		
		this.add(this.reset_bt);
		this.add(this.cancel_bt);
		
		
		// 종료 함수
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
			
	
		// 각각의 버튼, 텍스트 필드 상 이벤트 처리 연결
		this.kor_tf.addActionListener(this);
		this.eng_tf.addActionListener(this);
		this.math_tf.addActionListener(this);
		this.save_bt.addActionListener(this);
		this.reset_bt.addActionListener(this);
		this.cancel_bt.addActionListener(this);
		this.print_bt.addActionListener(this);
		
		// 위에서 새로 추가한 textValueChanged() 함수와 
		// 사용자가 실제 점수를 입력하는 TextField 컴포넌트와 연결
		this.kor_tf.addTextListener(this);
		eng_tf.addTextListener(this);
		math_tf.addTextListener(this);
		
		
		
		this.setSize(200,200);
		// this.pack(); // 빈 공간 없애줌
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 1. 이벤트가 발생한 객체 주소를 읽어와서 변수에저장
		Object event_source = e.getSource();
		
		// 2. 이벤트가 어디서 발생했는지 확인
		if(event_source instanceof Button) {
			// 사용자가 버튼 클릭
			System.out.println("사용자가 버튼을 클릭");
			
			// 먼저 부모 클래스 참조형 변수의 타입을 자식 클래스로 변경
			Button clicked_bt = (Button)event_source;
			
			//성적 저장 버튼 클릭
			if(clicked_bt == save_bt) {
				
				System.out.println("성적 저장 버튼 클릭");
				
				/*
				 * 방금 만든 check_digit() 함수를  실행해서
				 * 국어 점수가 문자열 안에 있는 문자가 있는지 여부를 검사
				 * 문자가 있는 경우 사용자에게 알려주기
				 */
				
				boolean check_kor = check_digit(kor_tf.getText().trim());
				boolean check_eng = check_digit(eng_tf.getText().trim());
				boolean check_math = check_digit(math_tf.getText().trim());
				
				if(check_kor == false) {
					// 국어 점수 안에 문자가 있는 경우 실행하는 명령문 작성
					JOptionPane.showMessageDialog(this,"국어 점수 안에 문자 발견! \n숫자만 입력하세요.");
					focus_change(kor_tf); 
			
				} else if(check_eng == false) {
					JOptionPane.showMessageDialog(this,"영어 점수 안에 문자 발견! \n숫자만 입력하세요.");
					focus_change(eng_tf); 
					
				} else if(check_math == false) {
					
					JOptionPane.showMessageDialog(this,"수학 점수 안에 문자 발견! \n숫자만 입력하세요.");
					focus_change(math_tf); 
				} else {
					System.out.println("왜이럴까요?");
				}
			
				
				int kor_score = Integer.parseInt(kor_tf.getText().trim());
				int eng_score =  Integer.parseInt(eng_tf.getText().trim());
				int math_score = Integer.parseInt(math_tf.getText().trim());
				
				System.out.println("숫자만 있는 국어 점수는 " + kor_score);
				System.out.println("숫자만 있는 영어 점수는 " + eng_score);
				System.out.println("숫자만 있는 수학 점수는 " + math_score);
				
				/*
				 * 
				 * 
				 * 성적 데이터들을 파일에 저장하기
				 * 
				 * 파일에 저장할 데이터들은 모두 숫자
				 * 
				 * 문자 관련 파일 출력 기능을 갖고 있는 클래스 사용 : FileWriter 클래스 사용
				 * 바이트 단위로 파일에 데이터를 저장하고 싶은 경우에는 FileOutputStream
				 * 
				 *  무조건 결정해야 하는 데이터
				 *  1) 파일 이름 : score_file.txt
				 *  2) 파일 저장 위치 : 파일 이름만 사용하면 현재 위치에 파일이 생성됨
				 *  
				 *  자바 워크 스페이스 작업 디렉토리 안에 있는 프로젝트 경로 안에 파일이 생성
				 *  -> FileWriter 파일의 주소 참조 변수 이름 = nwe FileWriter("새로 만들 파일 이름 작성");
				 *  
				 *  예) FileWriter ref_file = new FileWriter("score_file.txt");
				 *  -> 이클립스에서 알고 있는 워크 스페이스 디렉토리에서 시작 -> 그 안에서 현재 소스 파일이 있는 프로젝트로 이동
				 *  -> 이곳에 새로운 파일을 만들어 줌
				 *  
				 *  예) FileWriter ref_file2 = new FileWriter("C:\\ 부모 디렉토리 이름 \\ 디렉토리이름\\score_file.txt");
				 *  
				 *  -> 부모 디렉토리이름, 디렉토리이름 디렉토리가 있는 상태에서 실행
				 *  -> 없으면 IQException 예외상황이 발생되어 프로그램 전체 종료 
				 *  
				 *  -> FileWriter 클래스 : 파일 생성 + 파일 안에 데이터도 저장함
				 *  새로운 파일만 생성하고자 하는 경우에는 File 클래스만 사용해도 됨
				 *  -> File 클래스 : 파일 또는 디렉토리만 생성(데이터 저장은 안함) 
				 *  
				 *  1) FileWriter 파일 참조 변수 이름 = new FileWriter("만들 파일 이름 작성");
				 *  2) FileWriter 클래스가 갖고 있는 wirte() 함수를 사용해서 데이터를 파일에 저장하기
				 *  	-> 파일 참조변수이름 . write(데이터);
				 *  3) 파일에 모든 데이터를 저장한 후에는 close()함수를 사용해서 꼭 닫아줘야함(안하면 데이터 손실이 있을 수 있음)
				 *   	-> 파일 참조 변수 이름 . close();
				 *   
				 *   2. File 클래스의 사용
				 *   1) File 파일 참조 변수 이름 = new File("만들 파일 이름 작성");
				 *   2) File 클래스가 갖고 있는 createNewFile() 함수를 사용해서 파일을 생성
				 *   		-> boolean check = 참조 변수 이름.createNewFile();
				 *   		if(check == true) {
				 *   		System.out.println("새로운 파일을 만들었습니다.");
				 *   		} else {
				 *   		System.out.println("새로운 파일을 만들지 못했습니다.");
				 *   		}
				 */
				
				
				FileWriter ref_file_ob = null;
				String ref_file_name = "score_file.txt";
				try {
					
					System.out.println("새로운 파일인 " + ref_file_name + "을 만듭니다.");
					
					ref_file_ob = new FileWriter(ref_file_name);
					// write() 함수를 사용해 성적 데이터들을 파일에 저장
					
					System.out.println("파일에 저장할 국어 점수는 " + kor_score + "점, 영어 점수는 " + eng_score + "점, 수학 점수는 " + math_score);
					
					ref_file_ob.write(kor_score + "," + eng_score + "," + math_score);
					
					//파일에 모든 성적 데이터들을 저장한 다음에는 꼭 파일을 닫아야함
					
					ref_file_ob.close();
					System.out.println("파일에 성적 데이터들을 저장했습니다.");
					
					
				} catch(IOException e1) {
					System.out.println("파일 관련 입력과 출력에서 예외상황 발생");
					System.out.println("내용은 " + e1.getMessage());
					
				} catch (Exception e2) {
					System.out.println("예외 상황 발생");
					System.out.println("내용은 " + e2.getMessage());
					
				}
				
			}
			else if(clicked_bt == print_bt) {
				// 성적 불러오기 버튼 클릭
				System.out.println("성적 불러오기 버튼 클릭");
				
				
				/*
				 * 1.FileReader 클래스를 사용한 참조 변수 선언 : read() 함수 사용(2바이트씩)
				 * 2. BufferedReader 클래스를 사용한 참조 변수 선언 : readLine() (한줄씩)함수를 사용
				 * 3. readLine() 함수에 의해서 읽어온 성적 데이터 들을 보관할 변수 선언
				 *  -> String line = "";
				 */
				FileReader ref_file_reader = null;
				
				BufferedReader ref_burffered_reader =null;
				
				String line = "";
				try {
					
					ref_file_reader = new FileReader("score_file.txt");
					ref_burffered_reader = new BufferedReader(ref_file_reader);
					
					// 최종 3개의 성적 데이터가 저장되는 배열 
					String [] str_array = null;
					
					
					while((line = ref_burffered_reader.readLine()) != null) {
						
						System.out.println("파일에서 읽어온 성적 데이터들은 " + line + " 입니다.");
						
						str_array = line.split(",");
						
						// 각각의 점수들을 TextField 입력 창에 출력
						if(str_array.length > 0 ) {
							
							// 국어 점수
							kor_tf.setText(str_array[0]);
							// 영어 점수
							eng_tf.setText(str_array[1]);
							// 수학 점수
							math_tf.setText(str_array[2]);
							
							System.out.println("국어 점수 : " + str_array[0] + "\n" + "영어 점수 : " + str_array[1] + "\n" +
							"수학 점수 : " + str_array[2]);
					
							
						} else {
							System.out.println("파일에서 성적 데이터를 가져오지 못했습니다.");
							break;
						}
						
						
						
					}
					// 파일에서 모든 데이터들을 읽어온 경우에 위에서 new 연산자에 의해서 메모리레 만든 
					// 객체들을 삭제
					if(ref_burffered_reader != null) {
						ref_burffered_reader.close();
					}
					if(ref_file_reader != null) {
						ref_file_reader.close();
					}
					
				} catch(IOException e4) {
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
				
				
			}
			else if(clicked_bt == reset_bt ) {
				// 성적 지우기 버튼 클릭
				System.out.println("성적 지우기 버튼 클릭");
				
			}
			else if(clicked_bt == cancel_bt) {
				System.out.println("종료 버튼 클릭");
				// 프로그램 종료하겠습니다. 창 띄우고 프로그램 종료
				
				JOptionPane.showMessageDialog(this,"프로그램을 종료합니다.");
				System.exit(0);
				
			}
			else {
				System.out.println("잘못된 접근");
			}
			
		}
		else if (event_source instanceof TextField) {
			// 사용자가 텍스트필드에 입력
			System.out.println("사용자가 텍스트 필드에 입력");
			
			
			
		}
		else {
			System.out.println("잘못된 접근 입니다.");
		}
		
		
		
	}


}




public class TestFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFileFrame a = new MyFileFrame();

	}

}
