package march16;

import java.util.*;

public class ArrayEx12 {
	
	// 여러 개의 문자열을 저장할 수 있는 문자열 배열 선언
	String [] str_array1 = null;
	
	// 새로운 여러 개의 문자열을 보관 할 수 있는 배열 선언과 임의의 문자열 저장
	String [] str_array2 = {"김길동", "나길동","다길동","라길동","마길동"};
	
	// 위에서 만든 str_array2 배열이 갖고 이쓴ㄴ 모든 이름들이 복사될 배열 준비
	
	String [] str_copy_array2 = new String[str_array2.length];
	
		
	/*
	 * 새로운 함수인 copy()를 만든 다음에 이름을 갖고 있는 배열 str_array2의 값을
	 * 읽어와서 새로운 배열인 str_copy_array2에 저장하기
	 */
	public void copy() {
		
		System.out.println("사람이 이름을 읽어와서 다른 배열에 저장하기");
		
		for(int i = 0; i<this.str_array2.length; ++i) {
			this.str_copy_array2[i] = this.str_array2[i];
			System.out.println(i + " 위치에 복사된 이름은 " +
				this.str_copy_array2[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayEx12 ref_ob = new ArrayEx12();
		ref_ob.copy();
		
/*		
		// 여러 개의 문자열을 저장할 수 있는 문자열 배열 선언
		String [] str_array1 = null;
		
		// 새로운 여러 개의 문자열을 보관 할 수 있는 배열 선언과 임의의 문자열 저장
		String [] str_array2 = {"김길동", "나길동","다길동","라길동","마길동"};
		
		// 위에서 만든 str_array2 배열이 갖고 이쓴ㄴ 모든 이름들이 복사될 배열 준비
		
		String [] str_copy_array2 = new String[str_array2.length];
		
		
			 
		
		 * 새로운 함수인 copy()를 만든 다음에 이름을 갖고 있는 배열 str_array2의 값을
		 * 읽어와서 새로운 배열인 str_copy_array2에 저장하기
		 
		public void copy() {
			
			System.out.println("사람이 이름을 읽어와서 다른 배열에 저장하기");
			
		}*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		String [] name = new String [3];
		name[0] = "Kim";
		name[1] = "Park";
		name[2] = "Yi";
		
		String [] name1 = new String[] {"Kim", "Park", "Yi"};
		
		String [] names = {"Kim", "Park", "Yi"};
		
		///////////////////////// 내가 한거 /////////////////////////////
		// 좋아하는 과일을 사용자로부터 입력 받고 배열에 저장 후 출력
		
		String [] fruit = null;
		
		try{
		System.out.println("좋아하는 과일을 띄어쓰기와 함께 입력해주세요"
				+ "(예 : 사과 포도)");
		String input_fruits = scanner.nextLine();
		fruit = input_fruits.split(" ");
		
		System.out.print("입력하신 과일은");
		
		// for(int i = 0; i < fruit.length; ++i ) {
		
		for(String upfor : fruit) { // 향상된 for문 사용
			
			System.out.print(" " + upfor);
		}
		
		System.out.println(" 입니다.");
		
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
			
		}
		
		System.out.println("*************위에는 내가 한거***************");
		
		for(int i = 0; i <names.length; ++i) {
			System.out.println("names["+i+"] : " + names[i]);
		}
		
		String tmp = names[2]; // 배열 names의 세 번째 요소를 tmp에 저장
		System.out.println("tmp : " + tmp);
		
		names[0] = "Yu"; // 배열 names의 첫 번쨰 요소를 "Yu"로 변경
	
		for(String str : names) // 향상된  for문
			System.out.println(str);

	} // out of main

}
