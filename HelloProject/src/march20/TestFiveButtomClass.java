package march20;

/*
 * Frame 클래스의 기본 레이아웃 배치 관리자인 BorderLayout 클래스를 사용해서
 * 각각의 방향에 5개의 버튼을 보여주는 예제
 */

import java.awt.*;
import java.awt.event.*;

/*
 * 프로그램 종료(윈도우 닫기 포함)를 해주는 클래스 만들기
 */
class MytFiveButtomWindowClosing extends WindowAdapter {
	
	// 자바 가상 머신이 실행하는 windowClosing(이벤트 정보를 받는 변수 선언)
	// 함수를 재정의
	public void windowClosing(WindowEvent windowEvent) {
		System.exit(0);
	}
}

/*
 * Frame 클래슬르 상속 받는 새로운 자식 클래스 만들기
 * -> Frame 클래스를 재사용하는 방법 
 * : Frame 클래스가 갖고 있는 변수/상수/함수 들이 복사됨.
 */

class MyChildFrame extends Frame {
	
	/*
	 *  5개의 버튼 객체를 만드는 명령문 작성
	 */
	private Button button1 = new Button("butotn1");
	private Button button2 = new Button("butotn2");
	private Button button3 = new Button("butotn3");
	private Button button4 = new Button("butotn4");
	private Button button5 = new Button("butotn5");
	

	
	private String window_title = "";
	/*
	 * 기본 생성자 함수를 만들면 new 클래스이름() 명령어가 실행되는 시점에
	 * 자바 가상 머신에 의해서 자동으로 실행 
	 */
	
	public MyChildFrame() {
		
		// super() -> 부모 클래스가 갖고 있는 생성자를 실행 -> 부모 클래스에서 
		// 윈도우 타이틀 문자열을 저장
		super("my five button window");
		this.window_title = "my five button window";
		
		// 첫번째 버튼은 가운데 위치에 넣기
		this.add(BorderLayout.CENTER, this.button1);
		this.add(BorderLayout.WEST, this.button2);
		this.add(BorderLayout.EAST, this.button3);
		this.add(BorderLayout.NORTH, this.button4);
		this.add(BorderLayout.SOUTH, this.button5);

	}
	
	public MyChildFrame(String window_title) {
		// 자동으로 실행되지 않고 new 클래스이름(문자열) -> 실행
		this.window_title = window_title;
		
	}
	
}

public class TestFiveButtomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyChildFrame ref_frame = new MyChildFrame();
		
		
		ref_frame.setSize(100,100);
		ref_frame.addWindowListener(new MyWindowClosingClass());
	
		ref_frame.pack(); // 자동으로 크기 예쁘게
		ref_frame.setVisible(true);
	
	}

}
