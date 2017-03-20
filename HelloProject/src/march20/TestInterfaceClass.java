package march20;

import java.awt.*;
import java.awt.event.*;

/*
 * 인터페이스 예제 만들기 : 다중 상속을 지원 - 상수 + 메소드의 원형(머리 부분)
 * -> 명령문을 상속 받는 것이 아님 
 * 
 */

class MyClass10 {
	
	// 일반 변수
	int a = 10;
	// 상수
	static final int b = 20;
	// 함수
	public void method() {
		//일반적인 메소드에서는 명령문을 갖고 있음
		System.out.println("method() in MyClass10");
	}
	
}

class MyChildClass10 extends MyClass10 {
	
	// 상속 받은 변수 a, 상수 b, 메소드 method() 를 사용 가능
	public void new_method() {
		System.out.println("상속 받은 변수 a의 값은 " + a);
		System.out.println("상속 받은 상수 b의 값은 " + b);
		System.out.println("상속 받은 method() 를 실행");
		this.method();
	}
	
}


/*
 * 인터페이스의 규칙 : 상수와 추상 메소드(명령문이 없는 메소드)만 작성 
 * 추상 메소드 :메소드의 머리 부분만 있는 메소드(아직 명령문이 없는 메소드)
 * 예) 일반 메소드 : 머리와 몸체
 * public void method() // 머리
 * {// 몸체의 시작
 *   // 명령문 작성
 *   } // 몸체의 종료
 *
 *
 * 추상 메소드 : abstract 명령어를 사용해서 메소드를 선언
 * -> public abstract 명령어 + 반환형 + 이름(입력 변수 선언);
 * 
 * 예) public abstract void abs_method1();
 *  // 추상 메소드는 중괄호 기호를 갖지 못함
 *  	// 이 시점에서는 명령문이 없는 메소드
 *  
 *  
 *   public abstract void abs_method2();
 *   public abstract int abs_add(int a, int b);
 *   public int add(int a, int b) {
 *    // 일반 메소드는 중괄호를 가져야 함 
 *    
 *    
 *    new 인터페이스이름() -> 오류
 *    new 일반클래스이름() -> 정상
 *    
 *    메모리의 주소를 저장하는데 사용할 수 있음 
 *    -> 인터페이스이름 변수이름 = new 일반클래스이름(); // 가능
 *    -> 인터페이스이름 변수이름 = new 인터페이스이름(); // 오류
 *    
 *   }
 */

/*
 * 정수 덧셈 계산기 + 실수 덧셈 계산기
 * 2개의 인터페이스를 만들어서 계산에 사용할 메소드의 표준을 정하기
 * 
 * 메소드의 반환형 + 이름 + 입력 변수 
 * 
 * int iadd_method( int a, int b) ; // 정수 덧셈 함수
 * double dadd_method(double a , double b) ; // 실수 덧셈 함수
 * double idadd_method(double a , int b); // 싱수 + 정수 덧셈
 */
// 정수 덧셈 계산에 사용할 메소드들을 추상 메소드로 선언
interface I1 {
	// 2개의 정수 덧셈에 사용할 메소드의 머리 부분만 선언
	public abstract int iadd_method(int a, int b);
	
	// 2개의 정수 뺄셈에 사용할 메소드 머리 선언
	public abstract int isub_method(int a, int b);
	
	// 2개의 정수 곱셈
	public abstract int imul_method(int a, int b);
	

	
}

// 실수 덧셈 계산에 사용할 메소드들을 추상 메소드로 선언
interface I2{
	// 실수 덧셈 메소드 원형 선언
	public abstract double dadd_method(double a, double b);
	// 실수 뺼셈
	public abstract double dsub_method(double a, double b);
	// 실수 곱셈
	public abstract double dmul_method(double a, double b);

	
}

// 새로운 계산기 클래스를 만드는데 다중 상속을 사용해 위에서 만든
// 2개의 인터페이스에서 정한 메소드의 선언 부분들을 그대로 복사 받기

class MyMultiCalcClass implements I1,I2 {
	
	// 인터 페이스에 있던 메소드의 머리 부분과 몸체 부분을 꼭 작성
	// -> abstract 명령어는 빼고
	public int iadd_method(int a, int b) {
		System.out.println("정수 덧셈 함수");
		return a+b;
	}
	public int isub_method(int a, int b) {
		System.out.println("정수 뺄셈 함수");
		return a-b;
	}
	public int imul_method(int a, int b) {
		System.out.println("정수 곱셈 함수");
		return a*b;
	}
	
	
	public double dadd_method(double a, double b) {
		System.out.println("실수 덧셈 함수");
		return a+b;
	}
	public double dsub_method(double a, double b) {
		System.out.println("실수 뺄센 함수");
		return a-b;
	}
	public double dmul_method(double a, double b) {
		System.out.println("실수 곱셈 함수");
		return a*b;
	}
	
	
}
/*

 * 프로그램 종료(윈도우 닫기 포함)를 해주는 클래스 만들기
 
class MyMultiCalcWindowClosing extends WindowAdapter {
	
	// 자바 가상 머신이 실행하는 windowClosing(이벤트 정보를 받는 변수 선언)
	// 함수를 재정의
	public void windowClosing(WindowEvent windowEvent) {
		System.exit(0);
	}
}*/

class MyButton extends Frame {
	
	
	Button button1 = new Button ("1");
	Button button2 = new Button ("2");
	Button button3 = new Button ("3");
	Button button4 = new Button ("4");
	Button button5 = new Button ("5"); 
	
	public MyButton(){
	
	this.add(BorderLayout.CENTER, this.button1);
	this.add(BorderLayout.WEST, this.button2);
	this.add(BorderLayout.EAST, this.button3);
	this.add(BorderLayout.NORTH, this.button4);
	this.add(BorderLayout.SOUTH, this.button5);
	
	}
	
}

class MyButton2 extends Frame {
	
	// Button [] mybutton = new Button [5];
	

	/*for(int i = 0; i < 5; ++i) {
		
		String res = "button" + (i +1);
		
		mybutton[i] = new Button(res);*/
		
		
	//}
	
	
}



/*class MyButton extends Frame {
	
	String [] array = new String [5];
	Button [] button = new Button [];
	
	
	
	// Button [] button = new Button [5]
	
	for(int i = 0; i < this.array.length; ++i) {
	
		array[i] = "button" + (i+1);
		
		
	}

	
	this.add(BorderLayout.CENTER, button[0]);
	this.add(BorderLayout.WEST, button[1]);
	this.add(BorderLayout.EAST, this.button[2]);
	this.add(BorderLayout.NORTH, this.button[3]);
	this.add(BorderLayout.SOUTH, this.button[4]);
	
}
*/



public class TestInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyButton ref_button = new MyButton();
		ref_button.setSize(100,100);
		ref_button.addWindowListener(new MyWindowClosingClass());
		
		ref_button.pack(); // 자동으로 크기 예쁘게
		ref_button.setVisible(true);
		
		
		MyMultiCalcClass ref_calc = new MyMultiCalcClass();
		
		double res = 0;
		res = ref_calc.iadd_method(10, 20);
		System.out.println(res);
		
		
		
	
	}

}
