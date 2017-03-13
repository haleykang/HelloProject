/*
 * 주석 명령문 : 결과에는 나타나지 않는 명령문
 * 프로그램에 대한 보조 설명
 *  여러 줄 작성 가능
 *  
 */

// 한줄 주석 명령문 : 한줄만 실행을 안함


public class HelloClass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// 3 + 4 덧셈 계산하디 : 3 + 4 -> 7 메모리
		// 모니터 화면에 출력 : prinfln() 메소드와 함께 사용
		System.out.println("3 + 4 는 " + (3+4));
		// 소괄호 연산자 -> 계산 순서를 제일 먼저 하게 하는 연산자
		
		int first = 3, second = 4;
		System.out.println(first + "+"+ second+"="
				+ (first + second));
		
		// = 기호를 사용해서 위에서 준 3을 5로 4를 6으로 변경
		first = 5;
		second = 6;
		System.out.println(first + "+"+ second+"="
				+ (first + second)); // 5+6
		int third = 11;
		
		System.out.println(first+"+"+second+"+"
				+third+"=" + (first + second + third));
	
		System.out.printf("나의 나이는 %d(10진수)\n", 20);
		System.out.printf("나의 나이는 %x(16진수)\n", 20); // 20을 16진수로 바꿔서 출력
		System.out.printf("나의 나이는 %o(8진수)\n", 20); // 20을 8진수로 바꿔서!
		System.out.printf("10진수를 5자리로 출력하면 %5d\n", 20); // 20앞에 스페이스 3칸 생김
		System.out.printf("10진수를 5자리로 출력하면 %-5d\n", 20); // 20뒤에 스페이스 3칸 생김
		// %5d -> 먼저 출력 자릿수를 설정 : 1 2 3 4 5  -> 20이니까 4번째 5번째 자리에 숫자 위치함
		// (빈칸)(빈칸)(빈칸)20
		// %-5d -> 숫자 뒤쪽에 빈칸 생성 -> 5 4 3 2 1 -> 5, 4 칸에 20(빈칸)(빈칸)(빈칸)
		System.out.printf("하나의 글자만 출력 %c\n", 'a');
		System.out.printf("여러 개의 글자를 출력 %s\n", "문자열");
		// %c를 사용해서 abc를 출력하기 : %c%c%c 세 번 연속 사용
		System.out.printf("화면에 abc 연속으로 출력 %c%c%c\n", 'a','b','c');
		
		// 실수를 화면에 출력하기 : %f 형식 문자를 사용
		System.out.printf("화면에 실수를 출력하면 %f\n", 3.14f);
		
		// 소숫점 아래 자릿수를 지정하기 : %.자릿수f
		System.out.printf("화면에 소숫점 2자리까지 실수 출력 %.2f\n", 3.14f);
		System.out.println("30"+"20"); // 3020
		System.out.println(30+20); // 50
		
		
	
			
		// 현재 나의 나이를 보관하는 변수 선언
		// 자료형(int) + 변수 이름 (식별자) = 나이;
		int age = 20;
		
		// 상수 선언 : final + 자료형 + 상수이름
		final int age2 = 30;
		
		System.out.println("상수 age2가 갖고 있는 나이는 " +age2);
		// "" : 문자열, 상수이름 age2는 int 이므로 + 기호를 사용해서 연결
		
		// 논리 데이터 참을 메모리에 저장하기
		boolean b = true;
		System.out.println("메모리에 저장된 논리 데이터는 "+b);
		
		// 거짓은 false로 표현
		b = false;
		System.out.println("메모리에 저장된 논리 데이터는 "+b);
		
		// 실수는 float 또는 double 자료형
		float f = 3.14f;
		System.out.println("메모리에 저장된 실수 데이터는 " +f);
		
		double d = 3.14;
		System.out.println("메모리에 저장된 실수 데이터는 " +d);
		
		// 문자는 char
		char ch = 'a';
		System.out.println("메모리에 저장된 문자 데이터는 " +ch);
		
		// 문자열은 java.lang 패키지에 만들어져 있는 String 클래스를 사용
		String str = "몰라도 됩니다.";
		System.out.println("메모리에 저장된 문자열 데이터는 " +str);
	
		// 위에서 메모리에 저장된 나이를 확인하기
		// -> 모니터 화면에 출력하기
		// -> 출력 모양 : "나의 나이는 "+age+"살 입니다."
		System.out.print(
				"나의 나이는 "+age+"살입니다.\n");
		// + 기호는 연결 기호 
		// 왼쪽에 있는 "나의 나이는" 문자열과 
		// 변수 age가 갖고 있는 값 20을 연결(결합)
		// 최종 "살" 문자열을 마지막에 추가
		
		age = 30;
		
		// 위에서 저장한 20은 사라지고 30이 저장됨
		System.out.print("변경된 나이는 " +age+"\n");
		
		System.out.println("float 자료형으로 저장할 수 있는 최대 값은" + Float.MAX_VALUE);
		System.out.println("double 자료형으로 저장할 수 있는 최대 값은" + Double.MAX_VALUE);
		// MAX_VALUE : 최대값을 갖고 있는 상수 이름
		
		// 명령문 작성
		// 화면에 Hello를 출력하는 명령문 : print() 메소드를 실행
		
		java.lang.System.out.print("Hello\n");
		System.out.print("안녕하세요?\n"); 
		System.out.print("저녁밥은 무엇입니까?\n"); 
		System.out.println("안녕하세요 저는 강진주입니다.");
		System.out.println("어디가세요?");
		// 컴파일러가 java.lang 패키지 이름은 자동으로 삽입
		
		/*
		 * java.lang : 패키지 이름
		 * System : 클래스 이름
		 * out : 객체(변수) 이름
		 * print : 메소드 이름
		 * 
		 */
	}

}
