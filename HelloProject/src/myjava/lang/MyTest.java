package myjava.lang;

import java.util.Scanner;
import java.util.Random;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 먹을 메뉴 랜덤하게 작성 
		 * 
		 */
		// 1. 필요한 변수 선언 
		Scanner my_scanner = new Scanner(System.in);
		
//		double drandom_no = 0.0; // 랜덤 실수 저장 변수
		int irandom_no = 0; // 랜덤 정수 저장 변수
		
		Random random = new Random();
		
		// 메뉴 저장할 변수 선언
		String [] menu_name = new String [8];
		
		menu_name[0] = "아메리카노";
		menu_name[1] = "라떼";
		menu_name[2] = "바닐라라떼";
		menu_name[3] = "카페 모카";
		menu_name[4] = "카라멜 마끼아또";
		menu_name[5] = "카푸치노";
		menu_name[6] = "딸기주스";
		menu_name[7] = "키위주스";	
		
		// 랜덤 난수 생성
		
		/*drandom_no = Math.random();
		irandom_no = (int)(Math.random()* 8);*/
		
		String user_choice = "";
		char Y_N = ' ';
		int c_c = ' ';
		
		try{
			Loop1 :
			do{
			irandom_no = random.nextInt(8);
			System.out.println("주문 하실 음료로 " + menu_name[irandom_no] + "는 어떠신가요?" );
			System.out.print(menu_name[irandom_no] + "를 원하시면 Y, 다른 음료를 원하시면 N을 입력해주세요 : ");
			
			user_choice = my_scanner.next();
			user_choice = user_choice.toLowerCase();
			
			Y_N = user_choice.charAt(0);
			
			if(Y_N == 'y') {
				System.out.println(menu_name[irandom_no] + "를 선택 하셨습니다.");
				System.out.println("원하시는 결제 방법을 선택해주세요.");
				
				// 카드 결제 현금 결제 선택 
				do{
				System.out.print("1. 카드 결제\n2. 현금 결제\n");
				
				c_c = my_scanner.nextInt();
				
				if(c_c == 1) {
					
					System.out.println("카드 결제를 선택 하셨습니다.");
					System.out.println("단말기에 카드를 태그해주세요.");
					break Loop1;
				} 
				else if(c_c == 2) {
					
					System.out.println("현금 결제를 선택 하셨습니다.");
					System.out.println("단말기에 현금을 투입해주세요.");
					break Loop1;
				}
				else {
					System.out.println("잘못된 입력하셨습니다.");
					continue;
				}
				
				} while(true);
			 }
			else if (Y_N == 'n'){
				continue;
				
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			} while(true); 
			
			// 금액까지 표시하고 싶은데..
			
		/*	while(Y_N == 'N' || Y_N == 'n') {
				
				irandom_no = (int)(Math.random()* 8); // 다시 다른 랜덤 메뉴 
				
				System.out.println("주문 하실 음료로 " + menu_name[irandom_no] + "는 어떠신가요?" );
				System.out.print(menu_name[irandom_no] + "를 원하시면 Y, 다른 음료를 원하시면 N을 입력해주세요 : ");
				
				user_choice = my_scanner.next();
				
				Y_N = user_choice.charAt(0);
				
				// 반복문 더 배우고 나서 n을 누르면 계속 반복되는걸로 해야겠당.
				// while 반복문으로 N을 누르면 계속하기
				
				// ***** 랜덤 import java.util.Random; 사용해서 정수난수 랜덤 다시 확인하고 선언하자
				// do~while 반복문에서 break; continue; 사용해서 위로 보내기
*/	
			
			// else if 로 N 선택 했을때 다시 랜덤 선택 할 수 있게
			// else 잘못 입력했을때 다시 Y나 N 클릭
			
		}catch(Exception exception) {
			
			System.out.println("오류");
			System.out.println("내용은 " + exception.getMessage());
			System.out.println("가까운 직원에게 문의하세요.");
			exception.printStackTrace(); // 더 자세한 문제내용
		}
	}

}
