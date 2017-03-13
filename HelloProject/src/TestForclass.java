/*
 * for 반복문 기초
 * 
 */

import java.util.Scanner;
		
public class TestForclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  화면에 5번 Hello를 출력하는 반복문 만들기
		 *  
		 *  반복 횟수는 초기식 + 조건식 + 증감식
		 *  
		 *  1) 변수 = 작은값 ; 변수 <= 마지막값(큰값) ; ++변수이름
		 *  2) 변수 = 큰값; 변수 >= 마지막값(작은값) ; --변수이름
		 *  
		 */
		// for 반복문에서 사용할 변수 선언 : 반복 횟수를 세어주는 변수
		
		int count;
		
		for(count=1; count <=5; ++count) {
		
			// 먼저 모니터 화면에 Hello 메세지를 출력
			System.out.println("Hello");
			// 변수 count 값을 확인하기 위해서 출력
			System.out.println(count);
		}
		for(count=5; count >=1; --count) {
			
			System.out.println("안녕하세요");
			System.out.println(count);
		}
		
		// 1~10 사이에 있는 정수 중에서 홀수만을 출력하는 반복문
		int inumber;
		
		// 방법1.
		
		for(inumber = 1; inumber <=10; inumber +=2) {
			System.out.print(inumber + " ");
		}
		
		System.out.println("\n반복문을 벗어난 위치에서 변수 inumber의 값은 " + inumber); 
	
		/*
		 * 방법 2. 
		 * 일반적으로 for 반복문 안에서 if문을 사용
		 * -> if(변수 inumber의 현재 값이 홀수인지를 조사)
		 * 	-> if((inumber % 2) !=0) // inumber % 2의 나머지가 0이 아니면 참 (즉, 홀수)
		 *
		 */
		
		for(inumber = 1; inumber <=10; ++inumber) {
			
			// 현재 변수 inumber 값이 홀수인지를 if문을 사용해서 조사하기
			if((inumber % 2) != 0) {
				System.out.print(inumber + " ");
			}
		}
		
		System.out.println(); // 출력되는 내용없이 줄바꿈만 함.
		
		/*
		 * 초기식에서 사용하는 값을 사용자로부터 입력 받기
		 * 
		 * for ( 변수이름 = 변수이름2 ;
		 * 
		 * for ( inumber = 변수이름1(사용자가 입력한 숫자가 보관) ; inumber <= 변수이름2(사용자가 입력한 숫자가 보관)
		 * 
		 * 사용자가 첫번째 값을 1로 입력하면
		 * int user_intput_number1 = 1;
		 * 
		 * 사용자가 두번째 값을 100으로 입력하면
		 * int uesr_input_number2 = 100;
		 * 
		 * for(inumber = user_input_number1; inumber <= user_input_number2; ++inumber)
		 * 
		 * 단, 사용자가 첫번째 숫자를 더 큰 값으로 입력한다면
		 * 
		 * user_input_number1 = 100
		 * user_input_number2 = 1
		 * 
		 * 명령문 실행 안됨.
		 * 
		 * 보완 -> 사용자가 입력한 2개의 숫자를 비교해서 큰 값과 작은 값을 구분하여
		 * 
		 * 작은 값은 int min_number 변수에 저장
		 * 큰 값은 int max_number 변수에 저장
		 * 
		 * for(innumber = min_number; inumber <= max_number; ++ inumber) 명령문;
		 * 
		 * 1. 라이브러리 함수를 사용 
		 * -> java.lang 패키지가 갖고 있는 Math 클래스의 max() 함수를 사용하면
		 * 		큰 값을 구할 수 있음!
		 * 		
		 * 		int max_number = Math.max(10,20);
		 * 
		 * 2. java.lang.Math.min() 함수를 사용하면 작은 값을 구할 수 있음.
		 * 
		 * 		int min_number = Math.min(10,20);
		 * 
		 * 10, 20 -> 사용자로 부터 입력 받아야 함 -> 변수 필요 -> int user1, user2
		 *
		 *  사용자로부터 2개의 정수를 입력 받기 : nextInt() 함수를 사용
		 *  
		 *  user1 = my_scanner.nextInt();
		 *  user2 = my_scanner.nextInt();
		 *
		 * int max_number = Math.max(user1,user2);
		 * int min_number = Math.min(user1,user2);
		 * 
		 * for(innumber = min_number; inumber <= max_number; ++ inumber) 명령문;
		 * 
		 */
		
		/*
		 * 추가로 필요한 변수들을 준비
		 */
		int user1 = 0, user2 =0;
		int max_number = 0, min_number = 0;
		
		Scanner my_scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("첫번째 정수를 입력하세요 : ");
			user1 = my_scanner.nextInt();
			
			System.out.print("두번째 정수를 입력하세요 : ");
			user2 = my_scanner.nextInt();
			
			max_number = Math.max(user1,user2);
			min_number = Math.min(user1,user2);
			
			System.out.println("첫번째 정수는 " + user1 + " 두번째 정수는 " + user2);
			System.out.println("큰 정수는 " + max_number + " 작은 정수는 " + min_number);
			
			for(inumber = min_number; inumber <= max_number; ++inumber) {
				System.out.print(inumber +  " ");
			}
			System.out.println("\n반복문 탈출 후 inumber 값 " + inumber);
			
		}catch(Exception exception) {
			System.out.println("오류 발생");
			System.out.println("내용은" + exception.getMessage());
		}
	
		
		
		
		
	}

}
