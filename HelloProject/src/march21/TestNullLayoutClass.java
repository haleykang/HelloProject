package march21;

/*
 * 배치 관리자를 사용하지 않는 예제 작성
 */
import java.awt.*;
import java.awt.event.*;

/*
 * Frame 클래스를 부모 클래스로 지정하고 ActionListener 인터페이스를 구현하는
 * 새로운 자식 클래스 만들기
 * 
 */
class MyNullLayoutFrame extends Frame implements ActionListener {
	
	
	// 1. 6개의 버튼 준비
	// 		1) 6개의 변수로 버튼 선언 후 생성
	private Button button1 = new Button("1");
	private Button button2 = new Button("2");
	private Button button3 = new Button("3");
	private Button button4 = new Button("4");
	private Button button5 = new Button("5");
	private Button button6 = new Button("6");
	
	// 		2) 1차원 배열 선언 사용
/*	private String [] str_array = {"1","2","3","4","5","6"};
	private Button [] button_array = new Button[5];
	{
		for(int i = 0; i< button_array.length; ++i) {
		button_array[i] = ((i+1) + "");
		
		}
		
	}*/

	
	// 		3) 2차원 배열 선언 사용
	
/*	private Button [][] button_array2 = new Button [3][2];
	
	{
		for(int i = 0; i <button_array2.length; ++i) {
			Button [] temp = button_array2[i];
			for(int j = 0 ;  j < temp.length; ++j) {
				temp[j] = new Button();
			}
		}
		
	}*/
	
	// 		4) 버튼의 글자 크기를 바꿀 때 사용할 폰트 객체 만들기
	private Font font = new Font("궁서체", Font.BOLD, 20);
	/*
	 * 궁서체 : 글꼴 이름
	 * Font.BOLD : 스타일(굵게)
	 * 20 : 글자 크기 
	 * 
	 */
	
	
	// 기본 생성자 만들기
	public MyNullLayoutFrame() {
		// 부모 클래스인 Frame이 갖고 있는 생성자(Frame(String))를 실행해서
		// 프레임 윈도우 타이틀을 저장
		super("null layout frame");
		
		// add() 함수 사용 전에 먼저 꼭 !
		this.setLayout(null);
		
		// 첫번째 버튼에 폰트 객체를 적용해서 글자 크기와 글꼴, 스타일을 바꿈
		this.button1.setFont(font);
		this.button2.setFont(font);
		this.button3.setFont(font);
		this.button4.setFont(font);
		this.button5.setFont(font);
		this.button6.setFont(font);
/*		
		this.button1.setBounds(50,50,100,30);
		this.button2.setBounds(50,50,100,30);
		this.button3.setBounds(50,50,100,30);
		this.button4.setBounds(50,50,100,30);
		this.button5.setBounds(50,50,100,30);
		this.button6.setBounds(50,50,100,30);*/
	
		/*
		 * 프레임 윈도우의 가로 크기와 세로 크기를 지정
		 */
		this.setSize(100,100);
		
		/*
		 * 프레임 윈도우와 버튼과 버튼 사이에 발생하는 빈 공간들을 없애주는 명령문 
		 */
		
		this.pack();
		
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		
		
		/*
		 * 타이틀이 출력되는 공간의 크기를 구하기
		 */
		Insets insets = this.getInsets();
		
		System.out.println("타이틀이 출력되는 타이틀 바의 높이를 출력");
		System.out.println("프레임 윈도우 맨 아래 있는 상태 바 두께는 " + insets.bottom);
		System.out.println("프레임 윈도우 왼쪽 도구 바 두께는 " + insets.left);
		System.out.println("프레임 윈도우 오른쪽 도구 바 두께는 " + insets.right);
		System.out.println("프레임 윈도우 상단 타이틀 바의 두께는 " + insets.top);
	
		
		
		/*
		 * 모니터 화면의 크기 : 해상도
		 */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("현재 모니터 화면의 가로 크기는 " + screenSize.width);
		System.out.println("현재 모니터 화면의 세로 크기는 " + screenSize.height);
		
		this.setSize(screenSize);

		this.button1.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button2.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button3.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button4.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button5.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button6.setBounds(10 + insets.left, 20 + insets.top,100,30);
		
		
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
		/*
		 * 6개의 버튼을 클릭하는 경우에 실행되는 명령문을 작성
		 */
		/*
		 * 사용자가 버튼을 클릭하면 클릭 정보가 actionEvent 변수에 저장
		 * 자바 가상머신이 자동으로 넣어줌 
		 * 
		 * Button 버튼객체참조변수이름ㅂ = new Button("1");
		 * -> "1" : 라벨 또는 action Command
		 */
		/*
		 * 이 함수는 버튼에도 발생하고 TextField 컴포넌트를 사용하는 경우에도 발생하기
		 * 때문에 어디에서 발생 했는지 검사해주어야 함
		 * -> getSource() 함수를 사용해서 이벤트가 발생한 객체의 주소를 가져옴
		 * 		-> 반환 값은 Object : 모든 클래스의 부모 클래스
		 * 		-> 모든 자식 클래스에 이동 가능 : 주소를 저장 가능
		 * 		-> Object 객체참조변수이름 = new Object();
		 * 		-> Object 객체참조변수이름 = 다른 클래스이름();
		 */
		// 이벤트가 발생한 객체의 주소를 가져옴
		Object event_object = actionEvent.getSource();
		
		/*
		 * 현재 변수 event_object에 저장된 객체가 Button인지 TextField인지 구별
		 * -> instanceof 연산자 
		 * 		-> 버튼에서 이벤트 발생하면 true 반환
		 * 		-> 버튼이 아닌 곳에서 이벤트가 발생하면 false 반환 
		 * if(event_object instanceof Button) {}
		 */
		
		if(event_object instanceof Button) {
			System.out.println("버튼에서 이벤트가 발생했습니다.");
			
			/*
			 * 6개의 버튼 중 어떤 버튼에서 이벤트가 발생했는지 검사
			 */
			// 1. 형변환 연산자인 (Button)을 사용해서 Object 클래스를
			// Button 클래스로 변경해야함
			// event_object 참조형 변수의 타입(클래스 이름)이 Object 
			// Button 클래스가 갖고 있는 함수를 사용하기 위해서는
			// Object -> Button 클래스로 바꿔야함
			Button clicked_button = (Button)event_object;
			
			// getActionCommand() 함수를 사용해서 버튼이 갖고 있는 라벨(텍스트)을 갖고 옴
			// -> 문자열 -> String
			
			String command = clicked_button.getActionCommand();
			System.out.println("command : " + command);
		}
		else if(event_object instanceof TextField) {
			System.out.println("텍스트 필드 입력 창에서 엔터 키를 눌렀습니다.");
		}
		
	}
}

public class TestNullLayoutClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNullLayoutFrame a = new MyNullLayoutFrame();
		

	}

}
