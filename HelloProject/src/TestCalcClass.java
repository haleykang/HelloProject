/*
 *  간단한 계산기 프로그램 만들기
 */

import java.util.Scanner ;

public class TestCalcClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 프로그램에서 사용할 변수/상수 준비하기
		 */
		
		int first = 0;
		int sec = 0;
		int res =0;
		char op = ' '; // 띄어쓰기를 작성할 것!
		
		int a = '3' - '0';
		System.out.println("문자 3 - 문자 0 을 빼면" + a); 

		
		Scanner my_scanner; // 스캐너 선언
		
		my_scanner = new Scanner(System.in);
		
		String user_input_line = "";
		
		// 10개의 정수 데이터를 저장할 수 있는 배열 선언과 10개의 변수 만들기
		int iarray [ ] = new int[10];
		/*
		 * 10개의 변수가 자동으로 생성되며, 각각의 값은 0이라는 데이터가 저장됨
		 * 
		 * 변수의 이름은 1개 -> 구분하기 위해 위치 번호(순서 번호)가 자동 생성됨
		 * iarray + 위치 번호
		 * 
		 * iarray[0] - 첫 번째 변수는 번호 0이 부여
		 * iarray[1] - 두 번째 변수는 1
		 * ...
		 * iarray[9] - 마지막 변수는 9(데이터 갯수 -1)
		 * 
		 *  여기서 발생 할 수 있는 예외 사항은 ? 
		 *   0~9를 벗어나는 변수 번호를 입력
		 *    iarray [ -1 ], iarray[ 10 ] 등등
		 *    
		 *    제어문을 함께 사용 -> 변수의 값을 검사( 0 ~ 9 )
		 * 
		 */
		
		try {
			
			// 위에서 만든 배열의 첫번째 변수에 100을 저장하기
			iarray[0] = 100;
			System.out.println("배열의 첫번째 변수의 값은 " + iarray[0]); 
			
			System.out.print("정수 띄어쓰기 연산자 띄어쓰기 정수를 입력(예 3 + 4) : ");
			
			user_input_line = my_scanner.nextLine();
			
			System.out.println("사용자가 입력한 데이터는 " + user_input_line);
			
			// split() 함수를 사용해서 사용자가 입력한 데이터 중 숫자, 연산자, 숫자를 배열로 가져오기
			String [ ] str_result = user_input_line.split(" ");
			
			// 배열로 저장된 첫번째 숫자를 화면에 출력
			System.out.println("사용자가 입력한 첫번째 숫자는 " + str_result[0]);
			
			// 배열로 저장된 연산자를 화면에 출력
			System.out.println("사용자가 입력한 연산자는 " + str_result[1]);
			
			// 배열로 저장된 두번째 숫자를 화면에 출력
			System.out.println("사용자가 입력한 두번쨰 숫자는 " + str_result[2]);
		
		} catch(Exception exception) {
			
			System.out.println("예외상황 발생!!");
			System.out.println("내용은 " + exception.getMessage());
		}
		

	}

}
