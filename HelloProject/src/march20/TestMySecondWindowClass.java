package march20;

/*
 * 화면에 새로운 창을 출력하는 예제 + 배경 색상 지정
 * 
 */

import java.awt.*;
import java.awt.event.*;


// 윈도우 종료 이벤트를 처리해주는 명령문(System.exit(종료 정수 값))을 갖는
// 클래스 만들기
// 자바 가상 머신이 알고 있는 함수 이름은 windowClosing()
// 함수 생성시 대소문자 구별해서 작성 할 것 : windowClosing
// 새로운 명령문을 갖는 부모 클래스 만들기

class MySecondWindowClosing extends WindowAdapter {
	// 상속 방법을 사용해서 새로운 자식 클래스를 생성
	// 자바 가상 머신이 찾는 클래스 이름은 WindowAdapter
	// 클래스가 갖고 있는 여러 개의 함수 중 windowClosing을 찾음
	// 1. 먼저 클래스 찾기 WindowAdapter
	// 2. 그 다음에 함수 찾기 windowClosing
	public void windowClosing(WindowEvent windowEvent) {
		System.exit(0); // 정수 0은 정상적으로 프로그램이 종료되었다는 사실을
		// 시스템에 알려줌 
	}
	
	
}

/*
 * class 새로운 클래스 이름 {
 *	// 이 클래스는 자바 가상 머신이 실행하지 않는 클래스  
 *
 * }
 */

class MyParentClass {
	public void method() {
		System.out.println("method() 함수 [부모 클래스]");
	}
}

class MyChildClass extends MyParentClass {
	
	// 아무런 내용을 작성하지 않으면 부코 클래스에서 물려준 명령문을 그대로 사용
	// System.out.println("method() 함수[부모 클래스]"); 명령문을 사용 
}

// 2차원 좌표를 관리하는 클래스
class PointClass {
	
	private int x = 10;
	private int y = 20;
	
	public void show() {
		System.out.println("현재 x 좌표는 " + x + ", y 좌표는 " + y);
	}
}

// 3차원 좌표를 관리하는 클래스
class Point3Class {
	
	private int x = 10;
	private int y = 20;
	private int z = 30;
	public void show() {
		System.out.println("현재 x 좌표는 " + x + ", y 좌표는 " + y + ", z 좌표는 " + z);
	}
}

// 상속 방법을 사용해서 새로운 자식 클래스 만들기
class Point32Class extends PointClass {
	
	private int z = 30;
	
	/*
	 * 현재 클래스에는 변수 z와 show() 함수가 있음
	 * 
	 * 부모 클래스인 PointClass에는 x,y,show() 함수가 있음 
	 * 
	 */
	public void show() {
		// super.show() 부모 클래스가 갖고 있는 show() 함수를 실행
		super.show();
		// this.show(); // 자신의 show() 함수를 실행 -> 재귀호출 방식
		// -> 무한 반복문에 빠짐 -> 스택 메모리가 부족한 예외상황이 발생
		// -> 다른 함수이름();
		
		System.out.println("새로 추가한 변수 z의 값은 " + z);
		
		
	}
}

public class TestMySecondWindowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모 클래스를 메모리에 생성하고 method() 함수 사용
		MyParentClass ref_parent_ob = new MyParentClass();
		ref_parent_ob.method();
		
		// 자식 클래스를 메모리에 생성하고 상속받은 method() 함수 사용
		MyChildClass ref_child_ob = new MyChildClass();
		ref_child_ob.method();

	}

}
