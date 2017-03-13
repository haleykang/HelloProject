package march10;

/*
 * 반복문에 이름(라벨 이름)을 사용한 예제 작성
 */

import java.util.*;


public class TestLabelCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2개의 반복문을 중첩되게 만들기
		 * -> 반복문 안에 반복문 만들기 
		 */
		
		// 첫번째 반복문에서 사용하는 변수 선언
		int i; // 배열의 위치를 기억할때 많이 사용하는 변수 -> index의 i
		
		// 두번째 반복문에서 사용하는 변수 선언
		int j;
	
		try {
			
			// 천번째 반복문을 작성하기 전에 위치 이름 작성
			Loop1 :
				for(i = 1; 1 <= 10; ++i) {
					
					// 두번째 반복문을 작성하기 전에 위치 이름을 작성
					Loop2 :
						for(j = 1; 1 <= 20; ++j){
							
							// 조건을 만족하는 경우에  break 명령문 작성하기
							
							if(j == 10) {
								System.out.println("변수 j의 값이 10이됨");
								System.out.println("break를 사용해서 안쪽 반복문만 탈출");
								// break; // Loop2 반복문은 벗어나서 Loop1 반복문으로 감
								break Loop1;
							}
							else {
								// 화면에 변수 i와 j의 값을 출력
								System.out.println("현재 변수 i의 값은 " + i + ", 변수 j의 값은 "+ j);
		
							} // end of else
							
						} // end of for(j=0...)
		
/*System.out.println("break; 명령문을 만났습니다.");
System.out.println("두번째 반복문을 벗어났습니다.");*/

				}
		
System.out.println("첫번째 반복문을 벗어났습니다.");
// 자바에서 자료 구조 
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문제 발생");
			System.out.println("내용은 " + e.getMessage()); 
			e.printStackTrace(); // 더 자세한 문제내용
		}

	}

}
