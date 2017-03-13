package march13;

/*
 * [실습] 사람이 주로 사용하는 인픽스 표기법을 순서 그대로 받는 새로운 함수 만들기
 * 
 * 순서 : 첫번째 정수 보관 변수, 연산자 보관 변수, 두번째 정수 보관 변수
 * 
 * 예) 10 '+' 20
 * 
 */

import java.util.*;

public class TestMethodClass {
	
	static int control_calc_method(int a, char op, int b) {
		
		int res = 0;
		
		/*
		 * 다중 if문을 사용해서 연산자 문자를 받는 변수 op를 검사
		 * 변수 op는 연산자 문자를 main() 함수로 부터 전달 받음
		 * char op = '+'; // main() 함수에서 '+' 연산자를 전달한 경우
		 */
		
		System.out.println("main() 함수로 부터 받은 데이터들을 출력");
		System.out.println("첫번째 정수는 " + a);
		System.out.println("연산자는 " + op);
		System.out.println("두번째 정수는 " + b);
		
		// 위에까지 입력해 보고 테스트
		/*
		 * 다중 if 문을 작성 하기 : main() 함수로 부터 받은 연산자가 + 인 경우 덧셈 계산후 
		 * res에 저장 -> 결과값을 반환
		 * 
		 */
		
		
		if( op == '+') {
			System.out.println("두개의 정수를 더합니다.");
			res = a + b;
		}
		else if ( op == '-') {
			System.out.println("두개의 정수를 뺍니다");
			res = a - b;
		}
		else if ( op == '*') {
			System.out.println("두개의 정수를 곱합니다.");
			res = a * b;
		}
		else if ( op == '/' || op == '%') {
			
			if(b == 0) {
				System.out.println("어떤 수를 0으로 나눌 수 없습니다.");
			}
			else {
				System.out.println("두개의 정수를 나눕니다.");
				
				if( op == '/'){
					System.out.println("몫을 구합니다.");
					res = a / b;
				}
				else {
					System.out.println("나머지를 구합니다.");
					res = a % b;
				}
			}
			
			
			
		}
		return res;
		
	}
	
	static int control_calc_method(char op, int a, int b) {
		
		int res =0;
		
		
		
		return res;
	}
	
	static int control_calc_method(int a, int b, char op) {
		
		int res = 0;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 위에서 작성한 control_calc_method() 함수를 실행하기
		// 데이터의 순서는 정수, 하나의 문자, 정수
		
		/*control_calc_method(10,'+',20);
		control_calc_method(10,'-',20);
		control_calc_method(10,'*',20);
		control_calc_method(10,'/',20); // 나눗셈 몫
		control_calc_method(10,'%',20); // 나눗셈 나머지
		control_calc_method(10,'>',20); // 비교 연산 요청
		 */		
		
		// 위에서 작성한 모든 명령문들에서는 무조건 10, 20을 사용 -> 고정 방식

		// 2개의 정수를 사용자로부터 입력 받고 보관하는 변수 선언
		int a = 0, b = 0;
		
		// 계산 결과를 보관한 임시 변수 선언
		int res = 0;
		
		// 연산자 보관 변수
		char op = ' ';
		
		//키보드 입력에 사용할 Scanner 변수 선언과 메모리 생성
		Scanner scanner = new Scanner(System.in);
		
		// 사용자가 입력한 계산식을 문자열로 보관하는 변수 선언과 초기화
		String input = "";
		
		// 예외 처리 try~catch
		try {
		
			/*
			 * 사용자로 부터 계산식을 한줄로 입력 받기
			 * 예) 10 띄어쓰기 연산자 띄어쓰기 20
			 * 예) 10 쉼표 연산자 쉼표 20
			 */
			
			System.out.print("한줄로 계산식을 입력하세요(예 : 3 + 4) : " );
			input = scanner.nextLine();
			
			// split() 함수를 사용해서 사용자가 입력한 2개의 정수와 하나의 연산자 문자를
			// String [] 배열에 저장
			// 첫 번째로 입력한 정수는 String[0] 첫 번째 위치에 저장
			// 두 번째로 입력한 문자는 String[1] 두 번째 위치에 저장
			// 세 번째로 입력한 정수는 String[2] 세 번째 위치에 저장
			
			String str_split [] = input.split(" ");
			
			// 배열에 제대로 저장 됐는지 확인
			
			System.out.println("배열의 첫번째 위치에 " + str_split[0]);
			System.out.println("배열의 두번째 위치에 " + str_split[1]);
			System.out.println("배열의 세번째 위치에 " + str_split[2]);
			
			/*
			 * 우리가 프로그램에서 사용하지 않을 연산자를 걸러내기(필터 기능 추가)
			 * -> 사칙 연산자만 사용할 예정
			 * 
			 * 연산자 문자는  str_split[1] 위치에 문자열 형태로 저장되어 있음 -> 예) "+"
			 * 
			 * 방법 1) 문자열 형태로 비교하기 : equals() 함수를 사용 : equals("비교할 문자열")
			 *  ->  if(str_split[1].equals("+") == true) -> 조건이 참인 경우에응 사용자가 + 연산자를 입력한 경우
			 *  -> 반복
			 *  
			 * 방법 2) charAt() 함수 사용
			 *  "+" 문자열 데이터를 하나의 문자로 바꾼 후에 비교하기 
			 * 연산자를 하나의 문자만 저장할 수 있는 변수를 위에서 선언한 변수 op를 사용
			 * op = 하나의 연산자 글자를 저장;
			 * charAt() -> 문자열에서 특정 위치에 있는 하나의 글자를 가져 올 수 있음
			 * 
			 * str_split[1] -> "+"
			 * 위에서 첫번째 글자인 +를 가져오는 명령문 작성 : 첫번째 글자의 위치는 0(영)
			 * -> 배열에 저장되어 있기 때문
			 * 
			 * op = str_split_array[1].charAt(0);
			 * 
			 * -> if( op == '+') -> 이렇게 조건식을 간략하게 변경 가능
			 * 또는 || 논리 연산자를 사용해서 하나의 조건식으로 작성 가능
			 * 
			 * if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
			 * -> 하나라도 일치하는 경우 실행 
			 * 
			 */
			
			op = str_split[1].charAt(0);
			
			// 프로그램에서 사용할 수 있는 연산자인지를 검사하기
			// 사칙 연산자는 사용, 그외의 연산자는 사용하지 않음
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.println("사용할 수 있는 사칙 연산 입니다.");
				System.out.println("위에서 만든 함수를 실행");
				
				/*
				 * 1. 사용자가 입력한 첫번째 정수 문자열을 정수로 변환한 후에 변수 a에 저장
				 * -> parseInt() 사용
				 * 2. 사용자가 입력한 두번째 정수 문자열을 정수로 변환한 후에 변수 b에 저장
				 * 
				 */
				a = Integer.parseInt(str_split[0]);
				b = Integer.parseInt(str_split[2]);
				
				// 3. 인픽스 표기법을 받는 함수를 실행해서 사칙 연산 하기
				
				res = control_calc_method(a, op, b);
				
				// 4. 계산 결과를 갖고 있는 변수 result의 값을 화면에 출력하기
				System.out.println(a + " " + op + " " + b + " " + "=" + " " + res);
				
			}
				
			else {
				System.out.println("사용할 수 없는 연산자 입니다.");
				}
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문제 발생");
			System.out.println("내용은 " + e.getMessage());
			e.printStackTrace();
		}

	}

}
