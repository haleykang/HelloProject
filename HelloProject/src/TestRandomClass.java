
/*
 * 난수를 사용해서 점심 메뉴를 사용자에게 추천하는 프로그램 
 */

import java.util.Scanner;
public class TestRandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner my_scanner = new Scanner(System.in);
		
		// 난수를 실수로 보관하는 변수 선언
		double drandom = 0.0;
		
		// 난수를 정수로 보관할 변수 선언
		int irandom = 0;
		
		// 프로그램에서 추천한 메뉴의 선택 결과를 사용자가 입력
		String user_input = "";
		
		// 사용자의 입력은 한 글자만을 받음 -> y 또는 n
		char y_n = ' ';
		
		// 사용자에게 보여줄 메뉴를 배열에 저장 하기
		// 메뉴 목록 : 햄버거, 샌드위치, 파스타, 그외 
		// -> 메뉴를 저장 할 수 있는 배열 준비
		String [ ] str_menu = new String[4];
		
		// 첫번째 메뉴 햄버거는 str_menu[0] 에 저장
		str_menu[0] = "햄버거";
		str_menu[1] = "샌드위치";
		str_menu[2] = "파스타";
		str_menu[3] = "그 외 메뉴";
		
		/*
		 * 1. 난수를 만듭니다 -> 실수 난수 -> Math.random()
		 */
		System.out.println("새로운 실수 난수를 생성");
		System.out.println("생성된 난수는 " + Math.random());
		System.out.printf("두번째로 생선된 난수는 %.2f\n", Math.random());
		
		drandom = Math.random();
		
		System.out.println("세번째 난수는 " + drandom);
		
		// 위에서 만든 실수 난수를 정수로 바꾸기
		// (int) drandom
		// 정수형 변수에 결과를 저장하기
		
		irandom = (int)(drandom * 15);
		// 새로 만들어진 난수가 0.5 -> (int)0.5 -> 0 
		// 따라서 15를 곱함
		
		System.out.println("정수형 난수는 " + irandom);
		
		
	/*
	 * 사용자에게 보여줄 메뉴가 저장되어 있는 string 배열의 순서 번호를
	 * 난수로 구함 -> 4개의 메뉴 저장 -> 0~3 사이에 있는 정수를
	 * 난수로 구해야 함 
	 * -> (int)(Math.random() * 4) -> 0~3 범위에 있는 하나의 정수를 반환
	 *  왜? 0.0 난수가 나왔을때 *4 -> 0
	 *  0.99 난수가 나왔을깨 *4 -> 3.9999 -> 3
	 * 
	 * 	str_menu[0] = "햄버거";
	 * str_menu[1] = "샌드위치";
	 * str_menu[2] = "파스타";
	 * str_menu[3] = "그 외";
	 * 
	 */
		System.out.println("(0~3) 범위에서하나의 난수를 구하면 " + (int)(Math.random() *4)); 
	
		irandom = (int)(Math.random() *4); 
		
		if(irandom == 0) {
			System.out.println("새로 만든 정수형 난수는 0");
			System.out.println("메뉴에서 첫번쨰 햄버거를 가져오기");
			System.out.println(str_menu[0]);
		}
		else if(irandom == 1) {
			System.out.println("새로 만든 정수형 난수는 1");
			System.out.println("메뉴에서 두번째 샌드위치를 가져오기");
			System.out.println(str_menu[1]);
		}
		else if(irandom == 2) {
			System.out.println("새로 만든 정수형 난수는 2");
			System.out.println("메뉴에서 세번째 파스타를 가져오기");
			System.out.println(str_menu[2]);
		}
		else if(irandom ==3) {
			System.out.println("새로 만든 정수형 난수는 3");
			System.out.println("메뉴에서 그 외를 가져오기");
			System.out.println(str_menu[3]);
		}
		else{
			System.out.println("메뉴에 없는 번호 생성");
		}
		
		// switch~case 활용해보기
		switch(irandom) {
			case 0 :
				System.out.println("0");
				break;
			case 1 : 
				System.out.println("1");
				break;
			case 2 :
				System.out.println("2");
				break;
			case 3 :
				System.out.println("3");
				break;
				
				default :
					System.out.println("메뉴에 없는 번호");
		}
		
		try {
			
			// 1. 위에서 구해진 정수형 난수를 사용해서
			// 메뉴를 사용자에게 보여주기
			
			System.out.println("점심 메뉴로 " + str_menu[irandom] + "은(는) 어떨까요?");
			System.out.print("주문을 원하시면 y, 원하지 않으시면 n을 입력해주세요 : ");
			
			user_input = my_scanner.next();
			
			// 사용자가 입력한 y 또는 n 한 글자를 읽어와서 y_n 변수에 저장
			y_n = user_input.charAt(0);
			
			if(y_n == 'y' ) {
				System.out.println("y를 입력하셨습니다.");
			}
			else if (y_n == 'n') {
				System.out.println("n을 입력하셨습니다.");
			}
			else {
				System.out.println("다른 문자를 입력 하셨습니다.");
			}
			
		}catch (Exception exception) {
			
			System.out.println("문제 발생");
			System.out.println("내용은 " + exception.getMessage()); 
			
		}
		
	}

}
