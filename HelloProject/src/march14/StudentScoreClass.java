package march14;

public class StudentScoreClass {
	
	
	
	// 국어 점수 보관 변수 선언
	private int kor_score = 70;
	
	// 영어 점수 보관 변수 선언
	private int eng_score = 80;
	
	// 수학 점수 보관 변수 선언
	private int math_score = 100;
	
	// 총점 보관 변수 선언
	private int total_score = 0;
	
	// 평균 보관 변수 선언
	private double avg_score = 0.0;
	
	// 과목 수 보관 변수 선언
	private int count = 3;
	

	// 총점 구하는 함수
	public int calc_total(){
		
		total_score = kor_score + eng_score + math_score;
		
		return total_score;		
	}
	
	// 평균 구하는 함수
	
	public double calc_avg() {
		
		avg_score = (kor_score + eng_score + math_score) / count;
		
		return avg_score;
	}
	
	// 각각의 점수를 프린트하는 함수
	
	public String show_score() {
		
		String show_score = kor_score + "," + eng_score + "," + math_score ;
		
		return show_score;
		
	}
	
	
	

	public static void main(String[] args) {
		
		StudentScoreClass sscore = new StudentScoreClass();
		
		// 총점 보관 변수
		int total_score = sscore.calc_total();
		
				
		// 평균 점수 보관 변수
		double avg_score = sscore.calc_avg();
		
		// 각각의 점수를 저장하는 문자열 변수
		String show_score = sscore.show_score();
		
		// 그 점수를 배열로 나눠서 저장
		String [] split_score = show_score.split(",");
		
		// 각각의 점수 출력
		System.out.println("국어 점수는 " + split_score[0]);
		System.out.println("영어 점수는 " + split_score[1]);
		System.out.println("수학 점수는 " + split_score[2]);
		
		// 총점 출력
		System.out.println("총점은 " + total_score);
		
		// 평균 점수 출력
		System.out.println("평균 점수는 " + avg_score);
		
		
		
		
		
	
	
		
	}

}
