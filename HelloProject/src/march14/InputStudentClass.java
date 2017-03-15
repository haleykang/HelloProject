package march14;

import java.util.*;

public class InputStudentClass {
	
	/* 
	 * 구상 
	 * - 사용자가 과목수 입력 : String count; // -> 취소
	 * - 사용자가 과목 이름 입력 : String subject; // -> 취소
	 * - 입력 요청 함수 
	 * - 사용자가 점수 입력 : int score;
	 * - 점수 나타내기
	 * - 총점 구하기
	 * - 평균 구하기
	 * 
	 */
	
	// 스캐너 변수 선언
	Scanner scanner = new Scanner(System.in);
	
/*	// 과목 수 변수 선언
	private String count = "";
	*/
	
//	// 과목 이름 변수 선언
//	private String subject = "";
//	
	// 점수 변수 선언
	private int score = 0;
	
	private String s_score = "";
	private String [] str_score = null;

	
	
/*	// 사용자가 과목수 입력하는 함수
	
	public String input_count() {
		
		count = scanner.next();
		return count;
	
	}*/
	
	// 사용자가 과목 이름 적는 함수
	
	// 점수 입력 함수 
	public String input_score() {
		
		// 점수를 3 4 5 이렇게 입력받기!
		s_score = scanner.nextLine();
		
		return s_score;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 새로 만들어진 함수 사용 선언
		InputStudentClass isclass = new InputStudentClass();
		
		// 점수 입력 요청
		
		
		// try~catch
		try {
			
			System.out.print("국어 수학 사회 영어 점수를 입력해주세요 : ");
			String my_score = isclass.input_score();
			String [] str_score = my_score.split(" ");
			
			
			
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			System.out.println("내용은 " + e.getMessage());
			e.printStackTrace();
		}

		
	
	}
}

	

					
		
///*		try {
//			
//			// 과목수 입력 요청
//			System.out.print("과목 수를 입력해주세요 : ");
//		
//			// 과목수 입력 받고 저장할 변수 선언
//			String scount = isclass.input_count();
//			
//			// 입력받은 과목수를 정수 값으로 변경 후 저장할 변수 선언
//			int icount = Integer.parseInt(scount);
//			
//			if(icount > 0 ){
//			
//			// 제대로 처리됐는지 확인하기
//			System.out.println(icount);
//			
//			}
//			
//			else {
//				
//				System.out.println("잘못 입력했습니다.");
//				
//			}*/
		
		

	

