package march22;

/*
 * 프로그램(예제) 제목 : java.awt 패키지에 있는 TextField 컴포넌트를 사용해서
 * 사용자로부터 입력 받기
 * 
 */
// import 명령문은 클래스 보다 먼저 작성해야 함

import java.awt.*;
// 사용자가 만드는 새로운 사건(이벤트)을 처리하는 패키지에 있는
// 클래스들을 사용하는 import 명령문 작성 
import java.awt.event.*;

/*
 * TextField 클래스를 사용하는 방법
 * 
 * -> 윈도우즈 프로그래밍 -> 먼저 윈도우(창)를 만들어야 합니다.
 * 		-> 현재 TextField 클래스를 사용할 수 없는 상태
 * 			-> 선언은 가능하지만 사용은 불가
 * 			예) TextField 참조변수이름 = null;
 * 			참조변수이름 = new TextField(문자열, 정수);
 * 
 * 			사용은 불가능 : 위에서 만들어진 TextField 객체를 윈도우에 넣을 수 없는 상태
 * 
 * -> 윈도우즈 프로그래밍에서 절차(순서와 방법)
 * 1. 윈도우 만들기
 * 		Frame 클래스를 사용 ( 최소화 버튼, 최대화 버튼, 종료 버튼, 메뉴, 타이틍 출력)
 * 			1) 바로 사용하기 ; 
 * 			Frame 참조변수이름 =null;
 * 			참조변수이름 = new Frame("타이틀 텍스트 작성");
 * 
 * 			2) 상속 방법을 사용해서 Frame 클래스를 새로운 클래스의 부모 클래스로 지정
 * 			예) class 새로운클래스이름 extend Frame { }
 * 
 * 			새로운클래스이름 클래스를 사용하기 위해서는 참조변수의 선언과 new 연산자를
 * 			사용한 메모리 생성 명령문을 추가로 작성해야 합니다.
 * 
 * 			새로운클래스이름 참조변수이름 = null;
 * 			참조변수이름 = new 새로운클래스이름();
 * 			
 * 
 * 		
 * 
 * 
 * 2. 윈도우에 넣을 컴포넌트 만들기
 * 3. 만든 컴포넌트를 윈도우에 넣기
 * 4. 사용자 이벤트 처리 작성하기 : 프로그램 종료 부분 명령문 작성
 * 5. 윈도우를 화면에 출력
 * 
 */

/* 
 * Frame 클래스를 재사용해서 새로운 클래스를 만드는 경우
 */
class MyChildFrame extends Frame {
	
}

/*
 * 새로운 클래스를 만들때 부모 클래스는 한개, 인터페이스는 여러 개 상속
 * -> 인터페이스 : 사용자가 새로 만들어주는 사건(이벤트) 처리  
 * -> 예) 버튼에서 클릭 이벤트가 발생하는 경우에 이러한 이벤트를 프로그램에서
 * 		처리해 주기 위해서는 java.awt.event 패키지에 있는 ActionListener 인터페이스를 상속 
 * 		(구현 : 인터페이스가 갖고 있는 함수의 머리 부분과 몸체 부분을 자식 클래스에서 작성) 
 * 
 * 		예) ActionListener 인터페이스는 Button과 TextField 컴포넌트에도 사용 가능
 * 		버튼에서 발생하는 클릭 이벤트
 * 		텍스트 필드에서는 엔터 이벤트
 * 
 * class MyFrameEventHandler extends Frame implements ActionListener {
 *		// ActionListener 인터페이스가 갖고 있는 함수의 머리 부분과 동일한
 *		// 함수를 무조건 작성해야 함
 *		// 추가로 함수의 몸체 부분도 작성 : 함수의 머리 부분 + 몸체 부분({})
 * }
 */

class MyFrameEventHandler extends Frame implements ActionListener {

	
	// 새로운 버튼을 준비하기
	private Button ref_button1_ob = new Button("1");
	
	// 새로운 버튼을 추가해볼까?
	private Button ref_button2_ob = new Button("2");
	private Button ref_button3_ob = new Button("3");
	private Button ref_button4_ob = new Button("4");
	
	// 새로운 텍스트 필드 준비하기
	private TextField ref_textfield_ob = 
			new TextField("input your name : ", 50);
	
	// 기본 생성자 만들기 - > 자바 가상 머신에 의해서 제일 먼저 실행되는 함수
	// {} 블럭이 있으면 두번째로 실행
	// public 클래스이름() { } 
	public MyFrameEventHandler() {
		super("Haley's Test Window"); // 여기에 입력된 문자가 윈도우 제목 창에 뜬당
		// super(); 은 기본으로 컴파일러가 작성하는 명령문
		// super(문자열); -> Frame 클래스에 있는 생성자 중에서 하나의 문자열을 받는 생성자를 실행
		// public Frame(String value) { }
		
		// 윈도우 종료 이벤트 명령문 작성하기
		/*
		 * addWindowListener() 함수를 실행
		 * + new 이벤트 처리 클래스 또는 인터페이스 이름 ()
		 * + 실제 프로그램 종료 명령문(System.exit(0))을 갖는
		 * public void windowClosing(WindowEvent ref_window_event) {
		 * 
		 *  } 함수 작성
		 *  
		 *  1. 윈도우 종료 이벤트 처리 명령문 작성
		 *  -> addWindowListener() 명령어
		 *  	-> 리스너 : 이벤트 발생 여부를 체크하는 프로그램
		 *  		-> 스레드(Thread)를 다룰 때 자세히 
		 *  
		 *  2. 윈도우 종료 이벤트가 발생하는 경우에 실행되는 
		 *  new 윈도우 종료 이벤트 담당 클래스 또는 인터페이스이름 ()
		 *  -> 이벤트 발생을 메모리에 저장
		 *  
		 *  3. 실제 프로그램을 종료시키는 System.exit(0) 명령문을 갖는 windowClosing()  함수 작성
		 *  
		 */
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent ref_window_event) {
				// 프로그램 전체를 종료해주는 명령문 작성 
				System.exit(0);
			}
		});
		
		// add() 함수를 사용해서 위에서 만든 버튼과 텍스트 필드를
		// 프레임 윈도우에 넣기
		// -> 프레임 윈도우가 사용하는 배치 관리자는BorderLayout
		// - > 예) 가운데 위치에 넣는 경우에는 위치를 작성하지 않아도 됩니다.
		
		
		this.add(this.ref_textfield_ob);
		// 텍스트 필드는 BorderLayout 배치 관리자가 갖고 있는 가운데 위치에 넣기
		
		// 버튼은 아래 위치에 넣기 -> 위치 이름은 BorderLayout.SOUTH
		this.add(BorderLayout.SOUTH, this.ref_button1_ob);
		/*this.add(BorderLayout.NORTH, this.ref_button2_ob);
		this.add(BorderLayout.EAST, this.ref_button3_ob);
		this.add(BorderLayout.WEST, this.ref_button4_ob);*/
		
		// 버튼과 텍스트 필드에서 발생하는 이벤트를 프로그램에서 처리하기
		// 위해서 각각의 컴포넌트들을 이벤트 리스너에 등록
		// -> 버튼 객체 참조 변수이름 . addActionListener(this);
		this.ref_textfield_ob.addActionListener(this);
		this.ref_button1_ob.addActionListener(this);
	/*	this.ref_button2_ob.addActionListener(this);
		this.ref_button3_ob.addActionListener(this); 
		this.ref_button4_ob.addActionListener(this);
	*/
		// 이걸 해야지 버튼을 클릭했을 때 뭔가 문자가 나옴
		
		// this -> 메모리의 주소   하는 것
		
		/*
		 * 꼭 작성해야하는 명령문 확인
		 * 1) 윈도우(창) 크기 지정하기
		 * -> setSize( 윈도우의 가로 크기, 윈도우의 세로 크기);
		 */
		this.setSize(500,500);
		
		/*
		 * 2) 윈도우를 화면에 출력하기 
		 * -> setVisible() 함수 사용
		 * -> setVisible(true);
		 */
		this.setVisible(true);

		
		
	}
	// ActionListener 인터페이스가 갖고 있는 함수의 머리 부분과 몸체 부분을
		// 작성 -> 재정의 함수 -> 부모쪽에서 물려준 명령문을 사용하지 않고 
		// 새로운 명령문을 작성하는 것
	@Override // 없어도 됨 - 오버라이드 했다고 컴파일러에 알려줌 

	public void actionPerformed(ActionEvent actionEvent) {
		
		System.out.println("***이벤트 발생***");
		/*
		 * 1. 이벤트가 발생한 곳을 읽어오기
		 * -> actionEvent 변수가 갖고 있는 getSource() 함수를 실행
		 * -> getSource() 함수의 반환형은 Object(모든 클래스에 접근할 수 있는 부모 클래스이름)
		 * 												-> 모든 클래스의 자동 부모 클래스는 Object
		 * 												-> 부모 클래스를 한개로 고정
		 * 												-> Object 클래스를 사용해서는 모든 자식 클래스로 이동 가능
		 * 												-> 메모리에 생성된 모든 자식 클래스에 접근 가능 
		 * 			예) Object 참조변수이름 = new Object();
		 * 		        Object 참조변수이름2 = new 다른 자식 클래스이름();
		 * 				Object 참조변수이름3 = new 다른 자식 클래스이름2();
		 *  부모 클래스가 여러 개인 경우 : 부모 클래스 별로 참조 변수가 필요
		 *  	부모 클래스이름1 참조변수이름1 = null;
		 *  	부모 클래스이름2 참조변수이름2 = null;
		 *  	부모 클래스이름3 참조변수이름3 = null;
		 */
		
		// getSource() 함수를 실행해서 이벤트가 발생한 곳의 주소를 가져오기
		Object ref_event_ob = actionEvent.getSource();
		
		// instanceof 연산자 명령어를 사용해서 이벤트가 발생한 곳이
		// 버튼인지, 텍스트 필드 인지를 가려내기
		
		// if (  참조변수이름 instanceof 클래스이름 ) 
		if(ref_event_ob instanceof Button) {
			
			/*
			 * instanceof 연산자는 참조 변수인 ref_event_ob를 사용해서 메모리에 접근해서 
			 * 메모리에 클래스를 알아 냄
			 * 
			 * 만약 메모리의 클래스가 Button인 경우 참(true) 반환(생성)
			 * 메모리의 클래스가 Button이 아닌 경우 거짓(false) 반환(생성)
			 */
			System.out.println("사용자가 버튼을 눌렀습니다.");
			
			/*
			 * 꼭 작성해야하는 명령문은 형변환 연산자를 사용해서
			 * Object 클래스를 Button 클래스로 바꾸어 주어야 합니다.
			 * (Button) 참조 변수 이름
			 * 
			 * 		-> 왜 ? 현재 참조 변수 이름을 사용해서는 Object 클래스에 있는
			 * 			메소드만 실행가능하기 때문
			 * 			Button 클래스로 바꾸면 Button 클래스에 있는 메소드를 실행 가능 
			 * 	
			 */
			Button ref_clicked_button = (Button)ref_event_ob;
			
			/*
			 * Button 클래스가 갖고 있는 getActionCommand() 함수를 실행해서
			 * 버튼이 갖고 있는 라벨(텍스트 또는 문자열)을 가져옵니다.
			 * -> 버튼을 구분하기 위해서 
			 */
			String ref_action_command = ref_clicked_button.getActionCommand();
			
			/*
			 * 버튼에서 가져온 라벨을 확인하기 위해서 화면에 출력
			 * 
			 * 예) Button 참조변수이름 = new Button("1");
			 * getActionCommand() 함수는 "1" 문자열을 반환(읽어옴)
			 * 
			 */
			System.out.println("사용자가 클릭한 버튼은 " + ref_action_command);
			
			
			
		} else if (ref_event_ob instanceof TextField) {
			
			System.out.println("사용자가 텍스트를 입력했습니다.");
			/*
			 * 사용자가 입력한 텍스트를 가져와서 콘솔 화면에 출력
			 */
			// 1. 형변환 연산자(클래스 이름)를 사용해서
			// Object 클래스를 TextField 클래스로 바꾸기
			// -> TextField 참조형 변수 선언 = (TextField)ref_event_ob;
			
			TextField ref_textfield_ob = (TextField)ref_event_ob;
			
			// 2. TextField 클래스가 갖고 있는 getText() 함수를 실행해서
			// 사용자가 입력한 텍스트를 가여오기
			String input_text = ref_textfield_ob.getText();
			
			// 3. 확인하기 위해서 콘솔 화면에 사용자가 입력한 텍스트를 출력하기
			System.out.println("사용자가 입력한 텍스트는 " + input_text);
			
			// 4. 사용자가 입력한 텍스트를 지우려면 setText() 함수를 사용하면 됨
			// -> setText(문자열) -> setText("");
			ref_textfield_ob.setText("select");
			
			if(ref_textfield_ob.getText().equals("") == false) {
				
			
			
			// 5. 사용자가 입력한 텍스트 전체를 선택하려면 selectAll() 함수 사용
			ref_textfield_ob.selectAll();
			
			// 6. 선택된 텍스트만 가져오려면 getSelectedText() 함수 사용
			String seleted_text = ref_textfield_ob.getSelectedText();
			
			// 7. 선택된 모든 텍스트를 가져와서 화면에 출력하기
			System.out.println("선택된 모든 텍스트는 "  + seleted_text);
			
			// 8. 사용자가 입력한 텍스트를 화면에 보여주지 않으려면
			// setEchoChar() 함수를 사용
			// -> setEchoChar(문자) -> setEchoChar('*') -> 사용자가 입력한
			// 텍스트가 별표 문자로 바뀌어서 화면에 출력
			ref_textfield_ob.setEchoChar('*');
			
			} // end of if
			
		}
		
	}
	
}
	

public class TestTextFieldClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 위에서 만든 MyFrameEventHandler 클래스를 사용하기
		// 1. 참조 변수 선언
		MyFrameEventHandler ref_frame_ob = null;
		
		// 2. new 연산자를 사용해서 MyFrameEventHandler 클래스를 메모리에 생성
		// 생성된 메모리의 주소를 참조 변수에 저장( = 기호 사용);
		// 참조 변수 이름 = new MyFrameEventHandler();
		ref_frame_ob = new MyFrameEventHandler();
		

	}

}
