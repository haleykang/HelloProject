package march10;

/*
 * 구구단 예제 작성하기
 * 
 */

import java.util.Scanner;
import java.util.Random;

public class TestDanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 화면 출력 내용 그리기 
		 * 
		 * 1. 화면에 2단만 출력하기 
		 * 
		 *  ***2단 출력***(타이틀 출력) + 줄 바꿈
		 *  2*1=2 + 줄바꿈
		 *  2*2=4 + 줄바꿈
		 *  ...
		 *  2*9=18 + 줄바꿈
		 *  
		 *  2. 변하는 데이터와 변하지 않는 데이터를 구별
		 *  변하는 데이터 : 변수 사용 
		 *  변하지 않는 데이터 : 상수 사용 
		 *  
		 *  2*1=2 -> 2, *, = 전체에서 변하지 않는 데이터 
		 *  1-> 전체에서 변하는 데이터 
		 *  2 -> 전체에서 변하는 데이터
		 *  
		 *  변하지 않는 부분은 상수로 사용 : final int DAN = 2;
		 *  * 기호를 보관 할 수 있는 상수 정의 : final char OP = '*';
		 *  = 기호를 보관 할 수 있는 상수 정의 : final char EQ = '=';
		 *  결과는 변수에 보관 : int res;
		 *  
		 */
		
		final int DAN = 2;
		final char OP = '*';
		final char EQ = '=';
		
		int num = 0;
		int res = 0;
		Scanner scanner = new Scanner(System.in);
		
		// 타이틀은 한번만 먼저 출력
		/*System.out.println("****" + DAN + "단 출력****");
		
		for(num=1; num<=9; ++num) {
			// 2*1=2
			res = DAN * num;
			System.out.println(DAN+" "+OP+" "+num+" "+EQ+" "+res);
			
		}*/
		
		int dan;
		try{
		System.out.print("1~9까지의 숫자 중 하나를 입력해주세요 : ");
		
		dan = scanner.nextInt();
		
		while(dan <=9){
			int i = 1;
			System.out.println("***" + dan + "단 출력***");
			while(i<=9){
				res = dan * i;
				System.out.println(dan + " " +OP+" "+i+" "+EQ+" "+res);
				++i;	
			}
			++dan;
		}
		
		// 사용자가 입력한 숫자의 구구단만 출력하고 싶을 때
		
		System.out.print("1단~9단까지 확인하고 싶은 구구단을 입력해주세요(예 : 1) :");
		
		dan = scanner.nextInt();
		
		System.out.println("***" + dan + "단 출력***");
		int j = 1;
		
		while( j <= 9) {
			res = dan * j ;
			System.out.println(dan + " "+ OP + " " + j + " " + EQ + " " + res);
			++j;
		}
		
		}catch(Exception e){
			System.out.println("문제발생");
			System.out.println("내용은 " + e.getMessage());
		}
	}

}
