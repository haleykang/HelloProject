package march10;

/*
 * 
 * do~while 반복문 작성하고 실행하기
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class TestDoWhileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input_str = "YES";
		
		try {
			System.out.println("위에서 준비한 변수 input_str 값을 소문자로 바꾸기");
			input_str = input_str.toLowerCase();
			System.out.println("변경된 소문자는" + input_str);
			input_str = input_str.toUpperCase();
			System.out.println("다시 대문자로 변경 " + input_str);
			
			Scanner scanner = new Scanner(System.in);
			
			// do ~ while 반복문을 사용해서 계속해서 사용자로부터 yes 또는 no 문자열
			// 입력 받기
			
			do {
				
				System.out.print("yes 또는 no를 입력하세요 :");
				input_str = scanner.next();
				input_str = input_str.toLowerCase(); // 입력받은 문자를 소문자로!
				
				System.out.println("입력한 글자가 모두 소문자로 변경되었습니다.");
				System.out.println("변경된 소문자는 " + input_str);
				
				if(input_str.equals("yes") == true) {
					System.out.println("계속해서 위에서 실행했던 명령문을 실행!");
					continue; // while() 반복문의 조건식으로 강제 이동하는 명령문!!!
					// while(true) 로 이동해서 명령문 재 실행
				}
				else if(input_str.equals("no") == true) {
					System.out.println("사용자가 no를 입력했습니다.");
					System.out.println("더 이상 반복 실행하지 않습니다.");
					break; // do~while(true) : 명령문 전체를 탈출!
					// 가장 가까운 반복문 1개를 탈출하는 명령문 !
					// while(true) 아래로 탈출
				}
				else{
					System.out.println("yes또는 no가 아닌 문자를 입력하셨습니다.");
					continue; // 다시 do 명령문으로 이동
				}
				
			} while(true);
			
			System.out.println("do~while 반복문을 탈출");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문제발생");
			System.out.println("내용은" + e.getMessage());
		}

	}

}
