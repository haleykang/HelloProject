package march10;

/*
 * 45개의 번호를 만들어서 배열에 저장하고
 * 그 중 6개의 로또 번호를 화면에 출력 하기 예제 
 */
import java.util.Scanner;
import java.util.Random;


public class TestLottoClass {
	
	/*
	 * 2개의 정수를 main() 함수로부터 받아와서 덧셈 계산을 하고
	 * 그 결과를 return 명령문에 의해서 main() 함수로 전달하는 
	 * 새로운 사용자 정의 함수 만들기
	 * 
	 * 1. 이름 : add_method
	 * 2. main() 함수로 부터 받는 2개의 정수를 보관하는 변수 선언
	 * 		자료형 + 변수이름 1, 자료형 + 변수이름 2
	 * 		int a, int b
	 * 3. main() 함수로 돌려주는 값의 자료형을 작성 -> 정수 -> int
	 * 
	 * 4. 프로그램이 시작된 후에 바로 사용하기 위해서 static 명령어를 사용
	 * 
	 */
	static int add_method(int a, int b){
		System.out.println("새로 만든 덧셈 함수가 실행되었습니다.");
		System.out.println("main() 함수로부터 받은 첫번째 값은 " + a);
		System.out.println("main() 함수로부터 받은 두번째 값은 " + b);
		return (a+b); // 덧셈 계산을 한 후에 결과를 다시 main()함수, 즉 자신을 부른 함수로 전달
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 45개의 번호가 저장될 수 있는 배열 선언
		// -> 메모리의 주소를 저장할 수 있는 배열
		int lotto1[];
		
		// 2. new 연산자를 사용해서 45개의 메모리 공간을 만듭니다.
		lotto1 = new int[45];
		// 컴파일러가 자동으로 0을 45개 저장해줌
		// 컴파일러가 자동으로 순서 번호를 부여( 0~(45-1))
		// 컴파일러가 자동을 Object 클래스를 부모 클래스로 지정
		// 컴파일러가 자동으로 변수 length를 생성
		// 컴파일러가 자동으로 변수 length에 45(배열의 크기)를 저장
		// -> 45개의 변수를 한꺼번에 만들어주는 느낌
		
		// 두번째 로또 번호 저장 배열 선언과 메모리 생성을 동시에 하기
		int lotto2[ ] = new int[45];
		// = 왼쪽에 있는 대괄호 연산자 안에는 숫자를 작성할 수 없음!!!!
		
		// 사용자로부터 입력 받은 배열의 크기(45)를 보관할 수 있는 변수
		int count = 0;
		
		// 세번째 로또 번호 저장 배열 선언
		int lotto3[ ];
		// int [] lotto3; 사용자로부터 입력 받은 45 숫자를 사용해서
		// 배열을 만들예정 -> lotto3 = new int [ count ];
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("배열의 크기를 숫자로 입력 하세요 : ");
			count = scanner.nextInt();
			
			if(count > 0) {
			lotto3 = new int[count];
			System.out.println("동적 배열 만들기 완료!");
			
			} else {
				System.out.println("배열의 크기 입력 오류!");
			}
			
			// 위에서 만든 add_method() 함수를 실행하기
			// -> 2개의 정수를 꼭 전달해야 동작함
			// -> add_method(첫번째 정수 : 변수 a로 전달할 정수, 두번째 정수 : 변수 b)
			// -> add_method(10,20); 
			
			System.out.println("10 + 20 결과는 " + add_method(10,20));
			// 출력 함수에서 add_method() 함수를 실행하고
			// return 명령문에 의해서 만들어진 덧셈 결과를 화면에 출력 
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문제 발생");
			e.printStackTrace();
		}

	}

}
