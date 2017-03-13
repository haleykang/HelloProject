
/*
 *  점심 메뉴를 사용자가 고르는 프로그램
 */

// 입력 처리에 사용할 Scanner 클래스
import java.util.Scanner;

public class TestSwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 변수 상수 준비
		
		Scanner my_scanner = new Scanner(System.in);
		String str_input = "";
		// 최종 정수로 메뉴 번호를 보관하는 변수 선언과 초기화
		int menu_no = 0;
		
		// 2. 예외상황 대비
		
		try{
			
			// 1) 메뉴를 사용자에게 보여주기
			
			System.out.println("***점심 메뉴 고르기***");
			System.out.println("1. 햄버거\n2. 피자\n3. 짜장면\n4. 그 외");
			System.out.print("원하시는 메뉴 번호를 입력 하세요 : ");
			
			str_input = my_scanner.next(); // 입력되는 데이터가 한 글자(숫자) 이니까 next()를 사용 
			
			menu_no = Integer.parseInt(str_input);
			
			// 다중 if문으로 작성
			if(menu_no == 1) {
				System.out.println("햄버거를 선택 하셨습니다.");
				System.out.println("가격은 3000원 입니다.");
			}
			else if(menu_no == 2) {
				System.out.println("피자를 선택 하셨습니다.");
				System.out.println("가격은 5000원 입니다.");
			}
			else if(menu_no == 3) {
				System.out.println("짜장면을 선택 하셨습니다.");
				System.out.println("가격은 4000원 입니다");
			}
			else if(menu_no == 4) {
				System.out.println("그 외 메뉴를 선택 하셨습니다.");
				System.out.println("그 외 메뉴는 없습니다.");
			}
			else {
				System.out.println("메뉴에 없는 번호를 입력 하셨습니다.");
			}
			
			/*
			 *  위에서 작성한 다중 if문을 switch~case 문으로 바꾸기
			 *  
			 *  1. 다중 if문의 조건에서 사용한 변수 이름을 switch(변수이름)
			 *  switch(변수이름) // 변수 이름을 한번만 먼저 작성
			 *  
			 *  2. 무조건 블럭{}을 만들어야 함.
			 *  switch(변수이름) {
			 *  
			 *  3. 여러 개의 경우의 수를 처리하는 case 문을 삽입
			 *  -> case 위에서 작성한 변수 값과 비교할 값을 작성 + :(콜론)
			 *  -> case + 띄어쓰기 + 값 + 콜론 + 명령문 작성  + break; 명령문 작성 선택
			 *  -> case 1 :
			 *  	명령문;
			 * 		break; 명령문 작성하거나 하지 않거나 
			 * 	 break; // 아래에 있는 모든 명령문들을 실행하지 않고 switch~case문 전체를 탈출
			 * -> break; 명령문을 만나지 않으면 계속해서 아래에 있는 case 명령문들을 실행 
			 *  }
			 *  
			 */
			
			switch(menu_no) {
			case 1 :
				System.out.println("사용자가 입력한 메뉴 번호는 1");
				System.out.println("가격은 3000원 입니다.");
				
				// 중괄호를 생략해도 case1이  참이면 두개의 명령문이 실행 됨
			
				break;
				
			case 2 : 
				System.out.println("사용자가 입력한 메뉴 번호는 2");
				System.out.println("가격은 5000원 입니다.");
				
				break;
				
			case 3 :
				System.out.println("사용자가 입력한 메뉴 번호는 3");
				System.out.println("가격은 4000원 입니다.");
				
				break;
				
			case 4 :
				System.out.println("사용자가 입력한 메뉴 번호는 4");
				System.out.println("그 외 메뉴는 없습니다.");
				
				break;
			/*
			 * 다중 if문에서 작성한 else 부분을 default : 에 작성
			 */
			default :
				System.out.println("메뉴에 없는 번호를 선택 하셨습니다.");
			}
			
			
		}catch(Exception exception) {
			
			System.out.println("예외상황 발생!!");
			System.out.println("내용은 " + exception.getMessage());
		}
	}
	// 3. 프로그램 종료

}
