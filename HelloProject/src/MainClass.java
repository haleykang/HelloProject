
/*
 * 정수 데이터의 최대값과 최소값을 화면에 출력하는 프로그램
 */


import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 키보드 입력에 사용할 Scanner 변수를 선언
		Scanner my_scanner;
		
		// 2. new 연산자와 = 연산자를 사용해서
		// 메모리에 Scanner 클래스를 만들고 만든 메모리의 주소를 가져오기
		my_scanner = new Scanner(System.in);
		
		// 3. 예외상황을 고려한 try ~ catch 블럭 작성
		try {
			
			// next() 함수를 사용해서 한개의 문자열 데이터만 입력 받기
			
			System.out.println("하나의 문자열 데이터를 입력하세요 :");
			String one_str = my_scanner.next();
			System.out.println("사용자가 입력한 문자열 데이터는 " + one_str);
			
			System.out.println("여러 개의 문자열 데이터를 띄어쓰기와 함께 입력하세요 : ");
			String strings = my_scanner.nextLine();
			System.out.println("사용자가 입력한 여러 개의 문자열 데이터는 " + strings);
			
			/*System.out.print("하나의 정수를 입력하세요 : ");
			
			int inumber = my_scanner.nextInt();
			
			System.out.println("사용자가 입력한 정수는 " + inumber);
			*/
			
			// 실수 입력 받기
			
			System.out.println("하나의 실수를 입력하세요 : ");
			
			double dnumber = my_scanner.nextDouble();
			
			System.out.println("사용자가 입력한 실수는 " + dnumber);
			
		} catch(Exception exception) {
			
			// sysout + ctrl + space 키를 누르면 자동으로 입력됨!
			// System.out.println();
			System.out.println("예외상황 발생");
			System.out.println("자세한 내용은 " + exception.getMessage());
		
		}
		
		
		// 1. 사용자가 입력한 하나의 문자를 보관할 수 있는 변수
		char user_input_ch = 'a';
		// char user_input_ch = '5';
		// char user_input_ch = ''; // 안됨
		// char user_input_ch = ' '; // 이렇게는 가능, 공백문자(데이터)
		
		// 2. 사용자가 입력한 여러 개의 문자들(문자열)을 보관할 수 있는 변수
		String user_input_str = "abc";
		// String user_input_str = "100";
		// String user_input_str = ""; -> 이렇게도 가능, 빈 문자열(Empty String)
		// -> 데이터가 없음을 표현 가능
		
		
		// 1. 변수 또는 상수 선언 명령문
		
		int ia = 3;
		int ib = 4;
		
		double da = 3.0;
		double db = 4.0;
		
		// 계산 결과를 보관하는 변수 선언 
		
		int ic = 0; // 변수에 처음 값을 지정하는 것 : 초기화
		double dc = 0.0; 
		
		/*
		 * 예외상황을 고려한 try ~ catch 블럭 작성하기
		 * 
		 */
		
		try {
			
			// 사용자에게 입력 요청하기
			System.out.print("하나의 문자를 입력하세요 : ");
			
			// 사용자에게 하나의 문자 입력을 요청하기
			user_input_ch = (char)System.in.read();
			
			// 사용자가 입력한 문자를 화면에 출력
			System.out.println("사용자가 입력한 문자는 " + user_input_ch);
			
			// 변환 함수를 사용해서 예외상황을 만들기
			// parseInt() 함수를 실행해서 사용자가 한글을 입력한 경우
			// 강제로 예외상황을 발생시키며 catch() 블럭으로 실행 순서를 이동
			
			ia = Integer.parseInt(user_input_ch + "");
			
			// 한글을 입력한 경우 -> parseInt('가' +"");
			// -> parseInt("가") -> 예외상황 발생 -> 처리 불능
			// -> parseInt() 함수에서 실행 순서를 catch() 블럭으로 이동 됨
			
			// 사용자가 정수 1을 입력한 경우에는 실행되는 명령문 작성
			System.out.println("사용자가 입력한 숫자는 " + ia);
		
		} catch(Exception exception) {
			// Exception : 예외상활을 처리해 주는 클래스
			// exception : 변수 이름, 예외 내용을 받는 변수
			System.out.println("예외상황 발생");
		}
		
		// + 기호를 사용해서 정수 덧셈을 한 후에 변수 ic에 저장하기
		ic = ia + ib;
		System.out.println(ia+"+"+ib+"="+ic);
		
		dc = da + db;
		System.out.println(da+"+"+db+"="+dc);
		
		// ++ 연산자 사용하기
		ia = 1;
		
	
		System.out.println("변수 ia의 값은 " +ia); // 1
		
		// 변수 ia의 값을 1만큼 크게 하기
		// 1) ia = ia +1;
		// 2) ++ia; 또는 ia++;
		
		++ia;
		System.out.println("변수 ia의 값은 " +ia);
		
		ia++;
		System.out.println("변수 ia의 값은 " +ia);
		
		--ia; // ia = ia - 1
		System.out.println("변수 ia의 값은 " +ia);
		System.out.println("변수 ia의 값은 " + ++ia);
		
		int test = 0;
		System.out.println("test 값은 " + ++test);
		System.out.println("test 값은 " + --test);
		
		
		// 명령문 작성
		
		// 출력 함수를 사용해서 정수의 최대값을 바로 화면에 출력하기
		System.out.println("int 자료형 정수의 최대값은 " + java.lang.Integer.MAX_VALUE);
		
		// 출력 함수를 사용해서 정수의 최소값을 바로 화면에 출력하기
		System.out.println("int 자료형 정수의 최소값은" + java.lang.Integer.MIN_VALUE);
		
		// int 자료형의 데이터 크기를 넘어서는 경우에는 long 자료형을 사용 해야함 
		// 출력 함수를 사용해서 long 자료형 정수의 최대값 출력하기
		System.out.println("long 자료형 정수의 최대값은 " + java.lang.Long.MAX_VALUE);
		
		long a = java.lang.Long.MIN_VALUE;
		System.out.println("long 자료형 정수의 최소값은 " + a);
		
	}

}
