
/*
 *  퀴즈 문제를 사용자에게 내고 사용자가 답을 입력합니다!!
 *  
 *  정답이면 - 정답입니다! 당신은 천재입니다!
 *  틀렸으면 - 오답입니다! 다음 기회에 다시 도전해보세요! 
 * 
 */

// 스캐너 클래스를 사용하기 위한 명령문
import java.util.Scanner;

// 정수 난수 생성을 위한 명령문
import java.util.Random;

public class TestQuixClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 필요한 변수들을 준비하기
		Scanner my_scanner = new Scanner(System.in);
		int user_input = 0; // 정수 덧셈 퀴즈 : 사용자가 입력한 답을 보관
		
		// 실제 덧셈 답을 보관할 변수 생선
		// 난수1 + 난수2
		int dap = 0;
		
		// 문제에 사용되는 첫번째 난수를 보관할 변수 선언 & 초기화
		int no1 = 0;
		// 두번째 난수
		int no2 = 0;
		
		// 정수 난수를 만들때 사용할 Random 변수 선언 new 연산자를
		// 사용해 메모리에 Random 클래스를 새로 만들기
		Random random = new Random();
		

		
		// 2. 예외 상황 대비하기
		
		try {
			
		/*	no1 = random.nextInt(10) + 1; // 1~10 까지의 랜덤 숫자
			no2 = random.nextInt(20) + 1; // 1~20 까지의 랜덤 숫자 
			
			System.out.print(no1 + "+ " + no2 + " ? ");
			user_input = my_scanner.nextInt();
			dap = no1 + no2;
			if (dap == user_input) {
				System.out.println("정답입니다. 당신은 천재입니다.");
			}
			else {
				System.out.println("오답입니다. 당신은 바보입니다.");
			}
			*/
			// 총 5번 퀴즈 문제를 푸는 반복문
			int count ;
			
			// 정답 갯수를 보관하는 변수 선언
			int cor = 0; // 정답인 경우에만 1씩 증가
			
			// 틀린 갯수 보관하는 변수 선언
			int wr = 0; // 오답인 경우에만 1씩 증가
			
			// 점수 변수
			int score;
			
			for(count = 1; count <=5; ++count) {
				
				no1 = random.nextInt(10) + 1;
				no2 = random.nextInt(10) + 1;
				
				dap = no1 + no2;
				
				System.out.print(count + "번 문제입니다.\n"+no1+"+"+no2+"?");
				user_input = my_scanner.nextInt();
				
				if(user_input == dap) {
					System.out.println("천재!");
					++cor;
				}
				else {
					System.out.println("바보!");
					++wr;
				}
				
				// 현재까지 맞은 갯수와 틀린 갯수를 읽어와서 출력 
				System.out.println("현재까지 맞은 갯수는 " + cor + "개, 틀린 갯수는 " + wr + "개 입니다 ");
			}
			
			// 점수 출력 : 100점 만점
			score = (cor * 20);
			
			System.out.println("점수는 " + score + "점 입니다.");
			
		} catch(Exception exception) {
			
			System.out.println("문제 발생");
			System.out.println("내용은 " + exception.getMessage()); 
		}
	}

}
