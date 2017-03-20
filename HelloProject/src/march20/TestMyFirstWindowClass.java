package march20;

/*
 * 창을 만든 다음에 출력하는 방법
 * 
 * 1. import java.awt.*;
 * 또는
 * import java.awt.Button;
 * import java.awt.Frame;
 * 
 * 2. Frame 클래스를 사용해서 새로운 창을 메모리에 만들기
 * -> Frame 변수이름 = new Frame();
 *  	// public Frame() {}
 * 또는 Frame 변수이름 = new Frame("윈도우 창 왼쪽 상단에 보여줄 타이틀");
 *   // 문자열을 받는 생성자를 실행 -> public Frame(String 변수이름) {}
 *   
 *   -> 메모리에 하나의 창(Window)이 생성
 *   1) 타이틀
 *   2) 윈도우 최소화 버튼 생성
 *   3) 윈도우 최대화 버튼 생성
 *   4) 윈도우 종료 버튼 생성
 *   5) 컨테이너도 자동 생성 
 *   	-> 화면에 보여줄 버튼의 부모 역할 객체
 *   		-> 배치 관리자를 갖습니다.
 *   			-> 버튼의 위치와 크기를 정해주는 부모 객체
 *   	-> 창(Window)은 컨테이너를 소유 -> 컨테이너는 배치 관리자를 소유 
 *   	-> 배치 관리자 안에는 버튼이 들어감
 *   
 *   -> Frame 클래스가 갖고 있는 기본 컨테이너를 사용
 *   		-> BorderLayout 배치 관리자 사용 
 * 
 */

// AWT 도구를 사용하기 위한 명령문
import java.awt.*;

// AWT 도구를 사용해서 사용자 이벤트를 처리하기 위한 명령문
import java.awt.event.*;

/*
 * 사용자 이벤트 : 사건(Event)
 * 
 * 예) 사용자가 입력 장치인 키보드 또는 마우스를 사용해서 액션을 하는 경우
 * 
 * 키보드를 사용해서 문자 또는 숫자 등을 입력하는 경우
 * 마우스를 사용해서 클릭 또는 더블클릭 또는 스크롤 등을 하는 경우
 * 
 * -> 사건에 맞게 새로운 명령문을 작성 : 사용자 이벤트 처리 
 */

/*
 * 화면에 창을 출력하는 가장 빠른 방법
 * 1) Frame 클래스를 사용하기
 * 		-> Frame 참조변수이름 = new Frame("my first window");
 * 		-> 창의 크기를 지정하기 : setSize() 라이브러리 함수를 사용
 * 		예) 참조변수이름.setSize(가로 크기, 세로크기);
 * 			참조변수이름.setSize(100,100);
 * 
 *		-> 위처럼 하면 하나의 창이 생성은 되었지만 화면에는 출력되지 않고
 *			메모리에만 있는 상태
 *
 *		-> 메모리에 있는 창을 화면에 출력하는 함수인 setVisible() 함수를 실행
 *			-> 참조변수이름.setVisible(논리값을 작성);
 *			-> 참조변수이름.setVisible(true); // 화면에 창이 출력됨
 *			-> 참조변수이름.setVisible(false); // 화면에 창이 출력 안됨 
 *
 *		-> 화면에 나타난 창을 화면에 사라지게 하는 명령문 작성
 *			-> 사용자가 창의 오른쪽 상단에 있는 X 버튼 클릭하는 경우
 *				-> 프로그램에서 새로운 명령문을 작성해서 클릭 이벤트를 처리 
 *				-> 상속(Inheritace)을 사용해서 클래스를 재사용 해야함
 *				-> WindowAdapter 클래스를 재사용 하기
 *				class 이벤트처리클래스이름 extends WindowAdapter {
 *				
 *				}
 *				-> 클래스와 클래스 간의 상속은 extends 명령머 + 부모 클래스 이름 
 */

// 화면에 출력된 창을  사라지게 해주는 명령문을 갖는 새로운 클래스 만들기 

class MyWindowClosingClass extends WindowAdapter {
	// 창을 사라지게 하는 명령 문은 WindowAdapter 부모 클래스가 물려준
	// windowClosing() 함수에 작성 
	public void windowClosing(WindowEvent windowEvent) {
		
		/*
		 * 여기에 명령문을 작성하면 자바 가상 머신이 알아서 자동으로 실행해줌
		 * 시점은 사용자가 X 버튼을 누르는 경우 
		 * 
		 * WindowEvent windowEvent : 이 변수가 윈도우 종료 이벤트 전체를 받음
		 */
		
		// 프로그램을 종료하는 명령문 작성
		// System 클래스가 갖고있는 exit() 함수를 실행하는 명령문 작 성
		System.exit(0); // 0 : 정상 종료 정수 값 -> 강제로 main() 함수를 종료
		// return main() 함수; 
		
	}
	
}

public class TestMyFirstWindowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 화면에 창을 만들어 주는 Frame 객체를 만들기
		Frame ref_frame = new Frame("my first window");
		
		// 2. setSize (창의 가로 크기, 창의 새로 크기) 함수 실행하기
		ref_frame.setSize(100,100);
		
		// 2-1. 사용자가 윈도우 종료 버튼을 클릭하는 경우
		// 위에서 만든 widowClosing() 함수와 현재 창을 연결해주는 명령문 작성
		// -> Frame 클래스가 갖고 있는 addWindowListener() 함수를 실행
		// 		-> ref_frame.addWindowListener(이벤트 처리 객체 생성);
		ref_frame.addWindowListener(new MyWindowClosingClass());
		
		// 3. setVisible(true) 함수를 실행해서 창을 화면에 출력
		ref_frame.setVisible(true);
				

	}

}
