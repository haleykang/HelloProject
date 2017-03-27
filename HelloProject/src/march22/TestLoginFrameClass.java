package march22;

/*
 * 로그인 화면을 만들고 사용자가 아이디와 비밀번호를 입력 할 수 있도록 함
 * 
 * 사용자가 입력한 아이디와 비교할 정상 아이디 값은 상수로 미리 저장
 * -> public static final String ID = "id1";
 * 
 * 사용자가 입력한 비밀번호와 비교할 정상 비밀번호 값은 상수로 미리 저장
 * -> public static final String PWD = "pwd1";
 */

import java.awt.*;
import java.awt.event.*;

/*
 * Frame 클래스를 상속 받고 ActionListener 인터페이스를 구현한 
 * 새로운 자식 클래스 만들기
 */
class LoginFrame extends Frame implements ActionListener {
	
	/*
	 * 출력 화면 구상하기
	 * 
	 * 첫번째 줄 - ID : 출력 라벨과 아이디 입력 텍스트 필드 사용
	 * 두번째 줄 - Password : 출력 라벨과 비밀번호 입력 텍스트 필드 사용
	 * 세번째 줄 - Login 버튼 / Logout 취소 버튼
	 *
	 * -> 사용할 배치 관리자를 결정
	 * 		1) setLayout(null)
	 * 		2) 그리드레이아웃
	 *		3) 그 외 방법 
	 */
	
	
	// 첫번째 줄에서 사용할 ID : 라벨 준비
	private Label id_label = new Label("ID");
	
	
	// 첫번째 줄에서 사용할 아이디 입력 창 준비하기 
	private TextField id_tf = new TextField("",20);
	
	// 두번째 줄에서 사용할 Password : 라벨 준비
	private Label pw_label = new Label("Password");
	
	
	// 두번째 줄에서 사용할 비밀번호 입력 창 준비
	private TextField pw_tf = new TextField("",20);
	
	// 세번째 줄에서 사용할 로그인 버튼
	private Button login_bt = new Button("Login");
	
	
	// 세번째 줄에서 사용할 로그아웃 버튼
	private Button cancel_bt = new Button("Cancel");
	
	// 그리드 레이아웃 배치 관리자 준비(3행 2열 표를 만들고
	// 안에 들어가는 컴포넌트들 간의 간격은 2씩
	private GridLayout gridLayout = new GridLayout(3,2,2,2);
	
	// 사용자가 입력한 아이디와 비교할 때 사용할 아이디는 상수로 보관
	public static final String ID = "kjj8032";
	
	// 사용자가 입력한 비밀번호와 비교할 때 사용할 비밀번호는 상수로 보관
	public static final String PWD = "20857819";
	
	// 사용자가 입력한 아이디를 보관한느 변수 선언과 초기화
	private String input_id = "";
	
	// 사용자가 입력한 비밀번호를 보관하는 변수 & 초기화
	private String input_pw = "";
	
	// 현재 화면 크기를 보관하는 변수 선언
	private Dimension screen_size = null;
	
	// 폰트 조절

	private Font font = new Font("굴림", Font.PLAIN, 13);
		{
			this.id_label.setFont(font);
			this.pw_label.setFont(font);
			this.login_bt.setFont(font);
			this.cancel_bt.setFont(font);
			
		}
	
	/*
	 * Dimension : 화면의 사각형 크기를 보관하고 관리해주는 클래스
	 * // -> 가로 크기는 int width 변수에 저장
	 *  // - > 세로 크기는 int height 변수에 저장
	 *   
	 */
	
	// 기본 생성자 만들기
	
	public LoginFrame() {
		super("Haley's Window");
		
		// setLayout 함수를 사용해 Frame 클래스에서 갑고 있는
		// 배피 관리자인 BorderLayout을 GridLayout 으로 바꾸기
		this.setLayout(gridLayout);
		
		// add() 함수를 사용해 위에서 만든 컴포넌트들을 그리드 레이아웃으로 넣어줌
		
		// 로그인 버튼에는 새로운 명령이름 1로 지정 -> 버튼이름.setActionCommand("1");
		this.login_bt.setActionCommand("1");
		this.cancel_bt.setActionCommand("0");
		
		this.pw_tf.setEchoChar('♡');
		
		
		this.add(this.id_label);
		this.add(this.id_tf);
		
		// 두번쨰 줄
		this.add(this.pw_label);
		this.add(this.pw_tf);
		
		// 세번쨰 줄
		this.add(this.login_bt);
		this.add(this.cancel_bt);
		
		/*
		 * 사용자가 윈도우 종료 버튼을 클릭하는 경우에 실행되는 명령문 작성
		 */
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
		
		// 사용자가 아이디를 입력하고 엔터 키를 누르는 경우에 발생하는
		// ActionEvent 이벤트를 처리하기 위한 명령문 작성
		this.id_tf.addActionListener(this);

		// 사용자가 비밀번호 입력후 엔터키 누르는 경우
		this.pw_tf.addActionListener(this);
		
		// 사용자가 로그인 버튼 클릭하는 경우
		this.login_bt.addActionListener(this);
		
		// 사용자가 취소 버튼 클릭하는 경우
		this.cancel_bt.addActionListener(this);
		
		this.setSize(250,100);
		//this.pack();
		this.setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		/*
		 * 1. 먼저 이벤트가 발생한 객체의 주소를 가져와서 변수에 저장
		 * -> Object 참조변수이름 = ae.getSource();
		 */
		Object ref_event_ob = ae.getSource();
		
		/*
		 * 2. instanceof 연산자를 사용해서 이벤트가 발생한 곳을 검사
		 */
		if(ref_event_ob instanceof Button) {
			
			System.out.println("사용자가 버튼 클릭");
			/*
			 * Button 클래스가 갖고 있는 함수들을 사용하기 위해서 형변환 하기
			 */
			Button ref_clicked_button = (Button)ref_event_ob;
			
			/*
			 * 사용자가 클릭한 버튼이 로그인 버튼인지 로그인 취소 버튼인지를 판단하기 
			 * -> 버튼 별로 새로운 명령 이름(간단한 이름)을 부여하기
			 * 		-> setActionCommand("새로운 명령이름(간단한 이름)")
			 * 		-> 로그인 버튼은 새로운 명령이름으로 숫자 1을 지정하기
			 * 		-> login_btn.setActionCommand("1")
			 * 			-> 아래 부분에서는 login_btn == "1"(동격)
			 */
			// 각각의 버튼별로 새로 부여한 명령 이름을 알아오기
			// -> getActionCommand() 함수 사용
			String action_command = ref_clicked_button.getActionCommand();
			
			// 각각의 버튼별로 읽어온 명령 이름을 비교해서 로그인 버튼(1) 인지
			// 로그인 취소 버튼(0) 인지를 구별하기 // 0이나 1은 내가 지정하는거
			if(action_command.equals("1") == true) {
				System.out.println("사용자가 로그인 버튼을 클릭");
				
				/*
				 * 사용자가 입력한 아이디 값을 읽어와서 임시 변수에 저장
				 */
				
				
				String temp_id = id_tf.getText().trim();
				String temp_pw = pw_tf.getText().trim();
				
				
				// if문을 사용해서 사용자 입력했는지 여부를 검사
				if(temp_id.equals("") == true && temp_pw.equals("") == true) {
					// 아이디와 비밀번호 둘다 입력이 안된 경우
					System.out.println("아이디와 패스워드를 입력하지 않으셨습니다.");
					System.out.println("사용자가 아이디를 입력 할 수 있도록");
					System.out.println("강제로 id_tf 텍스트 필드 입력 창으로 이동");
					
					javax.swing.JOptionPane.showMessageDialog(this,"아이디와 비밀번호를 입력하세요.");
					// setFocusable () 함수를 사용해서 TextField 컴포넌트에 
					// 커서가 올 수 있도록 준비
					id_tf.setFocusable(true);
					
					//requestFocus() 함수를 사용해서 강제로 커서의 위치를
					// TextField 컴포넌트로 이동
					id_tf.requestFocus();
					
					//actionPerformed() 함수를 탈출
					return;
					
				} else if(temp_id.equals("") == false && temp_pw.equals("") == true) {
					// 아이디는 입력했는데 비밀번호는 입력 안함
					System.out.println("사용자가 패스워드를 입력하지 않았습니다.");
					// 비밀번호 입력 요청 창 띄우고 커서를 비밀번호로...
					javax.swing.JOptionPane.showMessageDialog(this,"비밀번호를 입력하세요");
					
					pw_tf.setFocusable(true);
					pw_tf.requestFocus();
					return;
					
				} else if(temp_id.equals("") == true && temp_pw.equals("") == false) {
					// 비밀번호는 입력하고 아이디는 입력 안함
					System.out.println("사용자가 아이디를 입력하지 않았습니다.");
					// 커서는 아이디 창으로 // 이거 시간되면 함수로 만들자..
			
					id_tf.setFocusable(true);
					id_tf.requestFocus();
					return;
				} else if (temp_id.equals("") == false && temp_pw.equals("") == false){
					// 사용자가 아이디랑 패스워드를 둘다 입력함 
					// 이제 저장된 아이디와 비밀번호를 상수랑 비교
					
					System.out.println("사용자가 입력한 아이디는 " + temp_id);
					System.out.println("사용자가 입력한 비밀번호는 " + temp_pw);
					
					System.out.println("전역 변수에 저장하기");
					input_id = temp_id;
					input_pw = temp_pw;
					
					
					
					
					
					/*System.out.println("사용자가 비밀번호를 입력 할 수 있도록");
					System.out.println("커서의 위치를 입력 창으로 이동하기");*/
					
					/*pw_tf.setFocusable(true);
					pw_tf.requestFocus();*/
					
					//public static final String ID = "id1";
					// public static final String PWD = "pwd1";
					
					// 맞는 ID랑 PW가 맞는지 확인
					/*
					 * 경우의 수 (2가지로)
					 * 
					 * 1. id랑 pw가 맞음 -> 음...로그인이 되었습니다.
					 * 2. 둘중 하나라도 다름 -> 틀렸습니다. 다시 입력하세요 -> 5번 반복후엔 더이상 입력 못함. 
					 * 
					 */
					
					if(input_id.equals(ID) == true && input_pw.equals(PWD) == true) {
						
						System.out.println("사용자가 아이디와 비밀번호를 제대로 입력했습니다.");
						javax.swing.JOptionPane.showMessageDialog(this,"로그인 되었습니다.");
						System.exit(0);
						
					} else {
						System.out.println("아이디와 비밀번호가 맞지 않습니다.");
						javax.swing.JOptionPane.showMessageDialog(this,"잘못 입력 하셨습니다.");
						
					}
					
					
					return;
				} 
				// 비밀번호
				
			
				
			} else if(action_command.equals("0") == true) {
				System.out.println("사용자가 취소 버튼을 클릭");
				// 창이 꺼짐
				System.exit(0);
				
				
			} else {
				System.out.println("알 수 없는 버튼 입니다.");
			}
			
		} else if (ref_event_ob instanceof TextField) {
			System.out.println("사용자가 텍스트 필드 입력 창에서 엔터 키를 눌렀습니다.");
			
			TextField ref_text_field = (TextField)ref_event_ob;
			
			///////////////////////////////
			
			String temp_id = id_tf.getText().trim();
			String temp_pw = pw_tf.getText().trim();
			
			
			// if문을 사용해서 사용자 입력했는지 여부를 검사
			if(temp_id.equals("") == true && temp_pw.equals("") == true) {
				// 아이디와 비밀번호 둘다 입력이 안된 경우
				System.out.println("아이디와 패스워드를 입력하지 않으셨습니다.");
				System.out.println("사용자가 아이디를 입력 할 수 있도록");
				System.out.println("강제로 id_tf 텍스트 필드 입력 창으로 이동");
				
				javax.swing.JOptionPane.showMessageDialog(this,"아이디와 비밀번호를 입력하세요.");
				// setFocusable () 함수를 사용해서 TextField 컴포넌트에 
				// 커서가 올 수 있도록 준비
				id_tf.setFocusable(true);
				
				//requestFocus() 함수를 사용해서 강제로 커서의 위치를
				// TextField 컴포넌트로 이동
				id_tf.requestFocus();
				
				//actionPerformed() 함수를 탈출
				return;
				
			} else if(temp_id.equals("") == false && temp_pw.equals("") == true) {
				// 아이디는 입력했는데 비밀번호는 입력 안함
				System.out.println("사용자가 패스워드를 입력하지 않았습니다.");
				// 비밀번호 입력 요청 창 띄우고 커서를 비밀번호로...
				javax.swing.JOptionPane.showMessageDialog(this,"비밀번호를 입력하세요");
				
				pw_tf.setFocusable(true);
				pw_tf.requestFocus();
				return;
				
			} else if(temp_id.equals("") == true && temp_pw.equals("") == false) {
				// 비밀번호는 입력하고 아이디는 입력 안함
				System.out.println("사용자가 아이디를 입력하지 않았습니다.");
				// 커서는 아이디 창으로 // 이거 시간되면 함수로 만들자..
				id_tf.setFocusable(true);
				id_tf.requestFocus();
				return;
			} else if (temp_id.equals("") == false && temp_pw.equals("") == false){
				// 사용자가 아이디랑 패스워드를 둘다 입력함 
				// 이제 저장된 아이디와 비밀번호를 상수랑 비교
				
				System.out.println("사용자가 입력한 아이디는 " + temp_id);
				System.out.println("사용자가 입력한 비밀번호는 " + temp_pw);
				
				System.out.println("전역 변수에 저장하기");
				input_id = temp_id;
				input_pw = temp_pw;
				
				
				/*System.out.println("사용자가 비밀번호를 입력 할 수 있도록");
				System.out.println("커서의 위치를 입력 창으로 이동하기");*/
				
				/*pw_tf.setFocusable(true);
				pw_tf.requestFocus();*/
				
				//public static final String ID = "id1";
				// public static final String PWD = "pwd1";
				
				// 맞는 ID랑 PW가 맞는지 확인
				/*
				 * 경우의 수 (2가지로)
				 * 
				 * 1. id랑 pw가 맞음 -> 음...로그인이 되었습니다.
				 * 2. 둘중 하나라도 다름 -> 틀렸습니다. 다시 입력하세요 -> 5번 반복후엔 더이상 입력 못함. 
				 * 
				 */
				
				if(input_id.equals(ID) == true && input_pw.equals(PWD) == true) {
					
					System.out.println("사용자가 아이디와 비밀번호를 제대로 입력했습니다.");
					javax.swing.JOptionPane.showMessageDialog(this,"로그인 되었습니다.");
					System.exit(0);
					
				} else {
					System.out.println("아이디와 비밀번호가 맞지 않습니다.");
					javax.swing.JOptionPane.showMessageDialog(this,"잘못 입력 하셨습니다.");
					
				}
				
				
				return;
			} 
			
			
			////////////////////////////
			
			
			
			
			
			
			
			// 엔터 키 이벤트가 발생한 곳을 알아내기
/*			if(ref_text_field == id_tf) {
				System.out.println("사용자가 아이디를 입력하고 엔터 키를 눌렀습니다.");
				
				// 사용자가 입력한 아이디를 가져와서 변수에 저장
				String temp_id = id_tf.getText().trim();
				
				// 사용자가 입력한 아이디가 없는 경우에는
				// 다시 커서의 위치를 아이디를 입력 할 수 있는 입력 창으로 강제 이동
				
				if(temp_id.equals("") == true) {
					
					
					 * 메시지 박스 띄우기
					 * javax.swing 패키지에 있는 JOptionPane  클래스를 사용해서
					 * 사용자에게 입력 요청 메시지 다이얼로그 박스를 보여줌
					 
					javax.swing.JOptionPane.showMessageDialog(this,"아이디를 입력하세요.");
					
					
					 * 커서의 위치는 강제로 아이디 입력창으로 이동
					 
					id_tf.setFocusable(true);
					id_tf.requestFocus();
					return;
					
				}
				
			} else if (ref_text_field == pw_tf) {
				
				System.out.println("사용자가 비밀번호를 입력하고 엔터 키를 눌렀습니다.");
				String temp_pw = pw_tf.getText().trim();
				
				if(temp_pw.equals("") == true) {
					
					javax.swing.JOptionPane.showMessageDialog(this,"비밀번호를 입력하세요.");
					pw_tf.setFocusable(true);
					pw_tf.requestFocus();
					return;
					
				}
			}*/
			
			
		}
	
		
	}
}

public class TestLoginFrameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginFrame ref_login_ob = null;
		
		ref_login_ob = new LoginFrame();

	}

}
