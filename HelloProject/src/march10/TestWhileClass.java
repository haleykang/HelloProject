package march10;

/*
 *  while 반복문 만들기 + 사용하기
 */
import java.util.Scanner;
import java.util.Random;
// 사용이 많아지면 import java.util.*; -> util 패키지 안에 모든 함수 사용가능

public class TestWhileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 명령문 작성
		
		// 1. 프로그램에서 사용할 변수/배열/상수를 준비하기
		int inumber; // main() 함수 안에서는 전역 변수(Global Variable)
		// 메인 함수 내 모든 명령문에서 사용할 수 있는 변수
		
		Scanner scanner = new Scanner(System.in);
		// 사용자가 입력한 yes 또는 no 문자열을 보관할 변수
		
		String yes_no = "";
		
		
		
		try { // try  + ctrl + space
			
			// for 반복문을 사용해서 모니터 화면에 숫자 1~10까지를 출력
			for(inumber = 1; inumber <=10; ++inumber) {
				System.out.print(inumber + " ");
			}
			
			System.out.println("\n출력 완료");
			
			// while 반복문을 작성해서 숫자 1~10까지 화면에 출력
			// 1) 초기식 명령문 작성
			inumber = 1;
			
			// 2) while(조건식) 명령어 작성
			
			// 3) 중괄호 만들기 {}
			
			// 4) 중괄호 안에서 반복 실행할 명령문 작성
						
			// 5) 중괄호 안에서 변수의 값을 변화시키는 식(증감식)을 꼭 작성 
			
			/*
			 * while 반복문을 사용해서 무한 반복문 구조를 만들기
			 */
			
			while(true){
				
				// 반복 실행할 명령문을 작성
				System.out.println("Hello");
				
				// 계속 여부를 물어보기
				System.out.print("계속하려면 yes 중단하려면 no를 입력 : ");
				
				// 사용자가 문자열을 입력할 수 있도록 next() 함수를 실행
				yes_no = scanner.next();
				
				// 사용자가 입력한 yes 또는 no 또는 그 밖의 문자열이 보관되어 있는
				// 변수 yes_no 값을 검사하기
				
				// String 클래스가 갖고 있는 equals() 함수를 사용하면
				// 사용자가 입력한 문자열과 다른 문자열이 같은지를 비교 가능
				// 사용 방법 ) 
				// 사용자가 입력한 문자열이 보관 되어있는 변수이름.equals("같은지 비교항 문자열");
				// 모든 글자가 같으면 참
				// 같지 않으면 거짓을 생성
				// yes_no.equals("yes") 
				
				// equals() 함수가 만든 논리값을 저장하는 변수 선언
				// equal() 함수를 실행하는 명령문 작성
				
				boolean chk = yes_no.equals("yes");
				
				if(chk == true) {
					
					System.out.println("사용자는 yes를 입력했습니다.");
				} else {
					
					System.out.println("사용자는 yes가 아닌 문자열을 입력했습니다.");
					// 사용자가 no를 입력한 경우인지를 검사하기
					
					chk = yes_no.equals("no");
					
					if(chk == true) {
						
						System.out.println("사용자가 no를 입력했습니다.");
						System.out.println("반복문 탈출");
						break;
					}
					else {
						System.out.println("사용자가 no가 아닌 문자열을 입력했습니다.");	
						/*
						 * 1. 다시 사용자에게 입력을 요청하는 메세지 출력
						 * System.out.println("잘못 입력하셨습니다.");
						 * System.out.println("꼭 yes 또는 no만을 입력하세요");
						 * 2. 다시 입력 받기
						 * yes_no = scanner.next();
						 */
						
						System.out.println("잘못 입력하셨습니다.");
						System.out.print("yes 또는 no를 입력하세요 : ");
						
						yes_no = scanner.next();
						
						chk = yes_no.equals("yes") || yes_no.equals("no");
						
						if(chk == true) {
							break;
						} 
					
						
					}
			
				}
				}
				
			
	/*		 while(inumber<=10) {
				 
				 System.out.print(inumber + " ");
				 
				 ++inumber;
				 
				 
				  * System.out.print(inumber++ + " "); 이렇게 한번에 작성 가능 
				  * 
				  
				 
			 }
			*/
			
		} catch (Exception e) { 
		
			System.out.println("문제 발생");
			System.out.println("발생한 문제는 " + e.getMessage());
			
			e.printStackTrace(); // 더 자세한 문제내용 
			
		}
		
		// 2. 예외상황 대비하기 (try~catch 블럭 작성)
		
		// 3. 프로그램 종료 처리 (마무리)

	}

}
