
// if문을 작성하는 프로그램

// 입력 처리에 사용할 Scanner 클래스
import java.util.Scanner;

public class TestIfControlClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 명령문 작성
		// 1. 변수 또는 상수 선언(메모리 준비하기) 
		// 2. 예외상황을 대비하기 위한 try~catch 블럭 작성
		// 3. 입력 처리에 사용할 Scanner 변수 선언과 생성하기
		Scanner my_scanner = new Scanner(System.in);
		// -> main() 메소드 안에 있는 모든 위치에서 사용 가능한 변수
		
		// 4. 사용자가 입력한 수식 전체를 보관하는 문자열 변수 선언
		String user_input_line = "";
		
		// 5. split() 함수에 의해서 추출되는 숫자 2개와 연산자를 보관하는 배열 선언
		String [ ] result = null; // null : 주소가 없음을 표현하는 명령어
		// 현재 split() 함수를 사용하기 전을 표시
		
		// 6. 사용자가 입력한 첫번째 정수를 보관할 변수 선언
		int first = 0;
		
		// 7. 사용자가 입력한 두번쨰 정수를 보관할 변수 선언
		int sec = 0;
		
		// 8. 사용자가 입력한 연산자 기호 한글자를 보관할 변수 선언
		char op = ' ';
		
		// 9. 계산 결과를 보관할 수 있는 변수 선언
		int res = 0;
		
		
		try { // 중괄호 : 블럭
			
		System.out.print("계산식을 입력하고 엔터를 누르세요(예 : 3 + 4) : ");	
		
		user_input_line = my_scanner.nextLine();
		
		result = user_input_line.split(" ");
		
		System.out.println("사용자가 입력한 첫번째 정수는 " + result[0]);
		System.out.println("사용자가 입력한 연산자는 " + result[1]);
		System.out.println("사용자가 입력한 두번째 정수는 " + result[2]);
		
		op = result[1].charAt(0);
		
		System.out.println("문자열에서 가져온 연산자 한글자는 " + op);
		
		// 문자열 배열에 저장된 첫번쨰 정수를 읽어와서 정수형 변수인 first에 저장하시
		// 변환함수인 parseInt() 함수를 사용
		first = java.lang.Integer.parseInt(result[0]);
		sec = java.lang.Integer.parseInt(result[2]);
		
		System.out.println("정수로 변환된 첫번째 문자열은 " + first);
		System.out.println("정수로 변환된 두번째 문자열은 " + sec);
		
		// if문을 사용해서 연산자를 갖고 있는 변수 op를 판단하기
		/*
		 *  프로그램에서 사용할 수 있는 연산자의 종류 결정 : + - * / %
		 *  그 외의 연산자는 처리하지 않기
		 *  
		 */
		/*
		 * 방법 1. if문을 여러 개 작성하기
		 * 
		 * if ( 첫번째 조건)
		 *  명령문1;
		 * 
		 * if (두번째 조건)
		 *  명령문 2;
		 *  ...
		 *  
		 */
		if(op == '+') {
			System.out.println("덧셈 게산을 하고 결과를 출력");
			res = first + sec;
			System.out.println(first + " + " + sec + " = " + res);
		}
		if(op == '-') {
			System.out.println("뺄셈 계산을 하고 결과를 출력");
			res = first - sec;
			System.out.println(first + " - " + sec + " = " + res);
			
			// 위와 같은 방식은 비추천! 
		}
			
		} catch(Exception exception) {
			
			System.out.println("예외상황 발생!!");
			System.out.println("내용은 " + exception.getMessage()); 
		}
		
		}
		
	}


