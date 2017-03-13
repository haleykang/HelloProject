
/*
 * 학점을 구해주는 프로그램
 * 
 * 1. 점수의 종류 : 국어 점수, 영어 점수 , 수학 점수, 총점, 평균
 *
 * 2. 입력헤 사용할 변수 : Scanner 변수; // 키보드 입력에 사용
 * 
 * 3. String 입력 데이터 저장 변수; // 사용자가 입력한 국어,영어,수학 점수를 보관
 * 
 * 예) 국어 영어 수학 점수를 차례대로 입력하세요 (예 : 70 80 90)
 * 
 * -> nextLine() 함수를 사용해서 3개의 점수를 입력 받기!
 * 
 * 첫번째 국어 점수를 입력하세요 : 100 + 엔터
 * 두번째 영어 점수를 입력하세요 : 20 + 엔터
 * 세번째 수학 점수를 입력하세요 : 70 + 엔터
 * 
 * -> 이 경우 next() 함수를 세 번 사용
 * 
 */

// 입력 처리에 사용할 Scanner 클래스
import java.util.Scanner;

public class TestGradeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 변수와 상수 준비
		
		Scanner my_scanner = new Scanner(System.in);
		
		String str_input = "";
		
		String [] str_res = null;
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		 
		int total = 0;
		double avg = 0.0;
		char grade = ' '; // 최종 학점 한글자 보관 변수
		// String str_grade = ""; // 최종 학점을 여러 글자로 표현할 때 보관 변수
		
		// 과목수를 보관하는 변수
		int count = 3; 
		
		// 2. 예외상황 대비하기
		try {
			
			// 1) 사용자에게 입력 요청 하기
			System.out.print("국어, 영어, 수학, 3개의 점수를 차례대로 입력하세요 (예 : 30 40 50) : ");
			
			// 2) 입력 함수를 사용해서 사용자가 점수를 입력할 수 있도록 하기
			str_input = my_scanner.nextLine();
			
			// 3) split("구분자 문자열") 함수를 사용해서 3개의 점수를 하나씩 문자열 배열에 저장하기
			str_res = str_input.split(" ");
			
			// 4) 3개의 점수가 저장되어 있는 str_res에서 각가의 점수를 읽어와서 정수형 변수에 저장하기
			
			kor = Integer.parseInt(str_res[0]);
			eng = Integer.parseInt(str_res[1]);
			math = Integer.parseInt(str_res[2]);
			
			// 5) 정수형 변수에 저장된 각가의 점수들을 화면에 출력하기 
			
			System.out.println("입력된 국어 점수는 " + kor + "점 입니다.");
			System.out.println("입력된 영어 점수는 " + eng + "점 입니다.");
			System.out.println("입력된 수학 점수는 " + math + "점 입니다.");
			
			// 6) 모든 점수들을 다 더한 다음에 총합 변수에 저장 후 화면에 출력
			
			total = kor + eng + math;
			System.out.println("총점은 " + total + "입니다.");
			
			// 7) 총점을 과목수로 나눈 몫을 구해서 평균을 구하고 변수에 저장
			avg = total / (double)count;
			// total, count변수 모두 정수형 변수(int)이기 때문에 둘 중 하나를 실수형 변수로 강제 형 변환 해야함!
			// 둘 중 하나라도 실수면 값은 실수로 나오기 때문
			
			// 8) 평균 출력
			System.out.println("평균 점수는 " + avg + "입니다.");
			// printf() 함수를 사용해서 소숫점 아래 자리수를 지정 할 수도 있음
			System.out.printf("평균 점수는 소숫점 아래 2자리 까지만 출력하면 %.2f\n", avg);
			
			/*
			 * 9) 학점 구하기 : 위에서 구한 평균을 사용해서 학점 구하기
			 * 
			 * -> 규칙 정하기 
			 * A 학점 : 평균 점수가 90이상이고 100이하 
			 * -> 이상 그리고 이하 범위를 작성하려면 비교 연산자 + 논리 연산자 
			 * -> if (비교식 1 논리연산자 비교식2 논리연산자 비교식 3)
			 * -> 90 이상이고(그리고 : and 연산 : 곱셈 연산) 100 이하
			 * -> 2개의 식의 결과가 모두 참인 경우에만 결과가 참
			 * 
			 * and 연산 : && 기호를 사용해서 수행, 모든 식이 참이어야 실행 
			 * if (비교식1 && 비교식2 && 비교식3)
			 * 
			 * if(avg >= 90 && avg <= 100)
			 * 또는 ( 90 <= avg && 100 >= 100)
			 *  학점 A를 변수 grade에 저장하기 
			 */
			System.out.println("학점 구하기");
			if(90 <= avg && 100 >= avg) {
				System.out.println("A 학점을 변수 grade에 저장");
				grade = 'A';
			}
			else if(80 <= avg && 90 > avg) {
				System.out.println("B 학점을 변수 grade에 저장");
				grade = 'B';
			}
			else if(70 <= avg && 80 > avg) {
				System.out.println("C 학점을 변수 grade에 저장");
				grade = 'C';
			}
			else if(60 <= avg && 70 > avg) {
				System.out.println("D 학점을 변수 grade에 저장");
				grade = 'D';
			}
			else if (50 <= avg && 60 > avg) {
				System.out.println("E 학점을 변수 grade에 저장");
				grade = 'E';
			}
			else if (0 <= avg && 50 > avg) {
				System.out.println("F 학점을 변수 grade에 저장");
				grade = 'F';
			}
			else {
				System.out.println("평균 점수 오류!");
				grade = 'F';
			} // else : 지정한 조건 외의 모든 경우
				
			/*
			 * B 학점 : 평균 점수가 80이상 90미만
			 * C 학점 : 평균 점수가 70이상 80미만
			 * D 학점 : 평균 점수가 60이상 70미만
			 * E 학점 : 평균 점수가 50이상 60미만
			 * F 학점 : 평균 점수가 50미만 
			 * 
			 */
			
			// 마지막, 구해진 학점을 화면에 출력
			System.out.println("최종 학점은 " + grade);
			
			
			
		}catch(Exception exception) {
			
			System.out.println("문제 발생!!");
			System.out.println("내용은 " + exception.getMessage());
		
		}
		// 3. 프로그램 종료하기
		
	}

}
