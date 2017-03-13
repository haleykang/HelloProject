package march10;

import java.util.*;

public class TestNew {
	
	static void myprint() {
		
		String string [] = new String [7];
		int i = 0; 
		
		string[0] = "***간단한 사칙 연산 예제 작성***\n";
		string[1] = "1.	정수 덧셈 하기\n";
		string[2] = "2.	정수 뺄셈 하기\n";
		string[3] = "3.	정수 곱셈 하기\n";
		string[4] = "4.	정수 나눗셈 몫 구하기\n";
		string[5] = "5.	정수 나눗셈 나머지 구하기\n";
		string[6] = "위에 있는 메뉴 번호를 입력하세요 : ";
		
		for(i = 0; i <= 6; ++i) {
			System.out.print(string[i]);
		}
	}
	
	static void myscanner() {
		
			// 사용자가 입력한 숫자를 받을 변수 선언
			int user_input = 0;
			Scanner scanner = new Scanner(System.in);
			user_input = scanner.nextInt();
			System.out.println(user_input + "번을 선택 하셨습니다.");
		
	}
	
	
	
	static int add(int a, int b) {
		
		return (a+b);
	}
	
	static int minus(int a, int b) {
		
		return (a-b);
	}
	
	static int gop(int a, int b) {
		
		return (a*b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myprint();
		myscanner();
		
	
	}

}
