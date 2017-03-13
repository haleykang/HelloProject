import java.util.Scanner;

/*
 * if문 작성 프로그램
 * 
 * 사용자로부터 하나의 정수를 입력 받아서 사용자가 입력한 정수가 음수인지
 * 또는 0인지 또는 양수인지를 판단하는 프로그램 만들기
 * 
 */
public class TestIf2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 변수 / 상수 선언과 초기화
		Scanner my_scanner = new Scanner(System.in);
		int inumber = 0;
		String str_number = "";
		
		// 2. 예외상황 처리 try~catch 블럭 작성
		try{
			System.out.print("하나의 정수를 입력하세요(예: 10) : ");
			
			str_number = my_scanner.next();
			
			inumber = Integer.parseInt(str_number);
			
			System.out.println("정수로 변환된 입력 문자열은 " + inumber);
			
			if(inumber < 0) {
				System.out.println("사용자가 입력한 정수는 음수!!");
			}
			else if (inumber == 0) {
				System.out.println("사용자가 입력한 정수는 0!!");
			}
			else if (inumber > 0) {
				System.out.println("사용자가 입력한 정수는 양수!!");
			}
			
		} catch(Exception exception) {
			
			System.out.println("예외상황 발생!");
			System.out.println("내용은 " + exception.getMessage());
			
		}

	}

}
