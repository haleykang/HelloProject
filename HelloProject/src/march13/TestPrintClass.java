package march13;

/*
 * 메소드(Method)를 새로 만들어서 main() 함수에서 사용(실행 또는 호출) 하기
 * -> 메소드에서 작성한 모든 명령문들을 하나씩 실행하기
 */
// 라이브러리 사용하기
import java.util.Scanner;
import java.util.Random;
import java.lang.*; //  내가 입력하지 않아도 컴파일러가 자동으로 삽입
// -> 기본 패키지 

public class TestPrintClass {
	
	// 2개의 정수 중 큰 정수만을 반환하는 함수
	
	static int yourmax(int fir, int sec) {
		
		System.out.println(Math.max(fir,sec));
		
		return 0;
	}
	
	static int mymax(int first, int second) {
		
		int result;
		
		result = first - second;
		
		if (result > 0 ) {
			return first;
		}
		else if (result < 0) {
			return second;
		}
		
		return 0;
	}
	
	static int max(int no1, int no2) {
		
		if(no1>no2)
			return no1;
		else if(no1<no2)
			return no2;
		else return 0;
	
	}
/*	static int inputmax(int a, int b) {
		
		Scanner scanner = new Scanner(System.in);
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		
		return 0;
		
	}
	*/

	
	// 바로 사용하는 함수 만들기 : static + 반환형 + 이름 + ( 입력 ) + { }
	static void myprint() {
		// 자주 사용하는 print() 함수를 실행하는 명령문을 작성
		System.out.println("안녕하세요?");
	}
	
	// new 연산자를 사용해야 사용할 수 있는 함수 만들기
	
	void myprint2() {
		System.out.println("안녕하십니까?");
	}
	
	// void : 반환형 -> return data type -> 호출한 함수로 전달하는 데이터의 종류
	// 실행한 함수로 돌려주는 데이터의 종류를 기술
	// main() 함수에서 my_print2() 함수를 실행
	// 정수의 덧셈 계산에서는 정수가 만들어짐 -> int 자료형을 사용
	// int add_method( int a, int c) {}
	// 실수 데이터를 반환 -> float 또는 double + 함수이름() { }
	// 문자 데이터를 반환 -> char + 함수이름() { }
	// 문자열(여러 개의 데이터) 데이터를 반환 -> String + 함수이름() {}
	// 배열 데이터를 반환 -> 자료형 + [] + 함수이름 () { }

	// 하나의 정수를 반환하는 함수 만들기
	int add_method( int a, int b ) {
		System.out.println("add_method(a,b) 함수가 실행되었습니다.");
		System.out.println("2개의 정수를 덧셈하고 그 결과를 반환");
		return a+b;
		// 변수를 선언해서 return 가능
		// int result;
		// result = a+b;
		// return result;
	}
	
	// 하나의 문자를 반환하는 함수 만들기
	char ch_method() {
		System.out.println("하나의 소문자 a를 반환하는 함수");
		return 'a' ; // 다른 문자는 반환하지 않는 함수(고정 방식)
	}
	
	// 하나의 실수를 반환하는 함수 만들기
	float f_method() {
		System.out.println("하나의 float형 실수를 반환하는 함수");
		return 3.14f;
	}
	
	double d_method() {
		System.out.println("하나의 double형 실수를 반환하는 함수");
		return java.lang.Math.PI;
		// java.lang 패키지에 있는 Math 클래스가 갖고 있는 PI 상수 이름을 사용해
		// 파이 값을 출력 
	}
	
	// 하나의 문자열을 반환하는 함수 만들기
	String str_method() {
		System.out.println("하나의 문자열을 반환하는 함수");
		return "문자열";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 2개의 정수를 보관할 수 있는 변수 선언
		int a = 0; int b = 0;
		
		//2. 사용자로부터 2개의 정수를 입력 받기
		// -> 키보드를 사용하는 함수가 필요 -> 정수면 nextInt()
		// -> 문자열인 경우 next() 또는 nextLine() 함수
		// -> 실수인 경우 nextDouble() 함수
		
		// 3. Scanner 변수가 필요 -> 사용하고자 하는 함수인 nextLine() 가
		// non-static 함수이기 때문! -> 사용 전에 메모리에 먼저 생성
		Scanner scanner = new Scanner(System.in);
		
		// 4. 입력 데이터 처리 -> 돌발 상황에 대한 대비
		try {
			
			// 첫번쨰 정수를 사용자로부터 입력 받기
			System.out.print("첫번째 정수를 입력하세요 : ");
			a = scanner.nextInt();
			
			System.out.print("두번째 정수를 입력하세요 : ");
			b = scanner.nextInt();
			
			System.out.println("사용자가 입력한 2개의 정수 확인하기");
			System.out.println("첫 번째 정수는 " + a + "두 번째 정수는 " + b);
			
			// 입력받은 2개의 정수를 max() 함수에 전달하고 출력
			System.out.println("두 정수 중 큰 정수는 " + max(a,b));
			// max() 함수가 만든 return 큰 정수를 받아와서 println() 함수가 화면에 출력
			
			// 이렇게도 가능
			int result = max(a,b);
			System.out.println("두 정수 중 큰 정수는 " + result);
		
			
			
			
			// 먼저 실행
			System.out.println("진주님 안녕하세요?"); 
			// 나중에 실행 
			myprint(); 
			
			// myprint2() 함수 실행 : non-static 함수
			// new 연산자로 메모리 생성 후 변수(객체) 이름을 사용해서 실행
			// 클래스이름 + 변수이름 ; -> 선언
			TestPrintClass object;
			
			// new 연산자를 사용해서 메모리에 TestPrintClass 클래스 만들고
			// 클래스가 갖고 있는 모든 non-static 함수들을 만들기
			// new 클래스이름 ();
			// -> 새로 만들어진 메모리의 시작 주소가 생성
			// -> 시작  주소를 사용하기 위해서는 = 기호를 사용해서 주소를 변수에 저장
			// 변수이름 = new 클래스이름 ();
			object = new TestPrintClass();
			// TestPrintClass object = new TestPrintClass(); 이렇게 통합도 가능
			
			// 메모리에 만들어진 myprint2() 함수를 선택 -> 점(.) 연산자를 사용
			// 변수이름.함수이름();
			
			System.out.println("20, 50 중 큰 정수는 " + mymax(50,20));
			
			System.out.print("크기를 비교할 2개의 정수를 입력해주세요 : ");
		
			int ma = scanner.nextInt();
			int mb = scanner.nextInt();
			System.out.println("입력한 값 중 큰 정수는 " + max(ma,mb) + " 입니다.");
			
		} catch (Exception e) {
			System.out.println("돌발 상황 발생");
			System.out.println("내용은 " + e.getMessage());
			e.printStackTrace(); // 더 자세한 내용은 
			// 현재 스택 메모리에 있는 모든 내용을 화면에 출력 
			
		}
		
	

		
	}

}
