package march14;

/*
 * non-static 테스트 클래스 만들기
 * 
 */

import java.util.*;

public class TestNonStaticClass {
	
	int no = 0;
	Scanner scanner = new Scanner(System.in);
	String read = "";
	
	
	public void method() {
		
		System.out.println("변수 no가 갖고 있는 정수는 " + no);
	}
	
	public int add(int a, int b) {
		return a + b;	
	}
	public String my_scanner() {
		
		read = scanner.next();
		
		return read;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// non-static 함수인 method()를 사용하기 위한 절차
		// 1. 변수 선언 : 클래스이름 + 변수이름;
		// 나중에 메모리에 만들어지는 클래스의 주소를 저장하는 변수
		// (new 연산자에 의해서 받음)
		
		TestNonStaticClass a;
		a = new TestNonStaticClass();
		// 또는 그냥 TestNonStaticClass a = new TestNonStaticClass();
		
		a.method();
		System.out.println("10 + 20의 결과는 " + a.add(10, 20));
		System.out.print("문자열을 입력해주세요 : ");
		String input = a.my_scanner();
		System.out.println(input);
		
		
		
	}

}
