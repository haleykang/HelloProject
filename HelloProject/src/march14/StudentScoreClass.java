package march14;

public class StudentScoreClass {
	
	
	
	// ���� ���� ���� ���� ����
	private int kor_score = 70;
	
	// ���� ���� ���� ���� ����
	private int eng_score = 80;
	
	// ���� ���� ���� ���� ����
	private int math_score = 100;
	
	// ���� ���� ���� ����
	private int total_score = 0;
	
	// ��� ���� ���� ����
	private double avg_score = 0.0;
	
	// ���� �� ���� ���� ����
	private int count = 3;
	

	// ���� ���ϴ� �Լ�
	public int calc_total(){
		
		total_score = kor_score + eng_score + math_score;
		
		return total_score;		
	}
	
	// ��� ���ϴ� �Լ�
	
	public double calc_avg() {
		
		avg_score = (kor_score + eng_score + math_score) / count;
		
		return avg_score;
	}
	
	// ������ ������ ����Ʈ�ϴ� �Լ�
	
	public String show_score() {
		
		String show_score = kor_score + "," + eng_score + "," + math_score ;
		
		return show_score;
		
	}
	
	
	

	public static void main(String[] args) {
		
		StudentScoreClass sscore = new StudentScoreClass();
		
		// ���� ���� ����
		int total_score = sscore.calc_total();
		
				
		// ��� ���� ���� ����
		double avg_score = sscore.calc_avg();
		
		// ������ ������ �����ϴ� ���ڿ� ����
		String show_score = sscore.show_score();
		
		// �� ������ �迭�� ������ ����
		String [] split_score = show_score.split(",");
		
		// ������ ���� ���
		System.out.println("���� ������ " + split_score[0]);
		System.out.println("���� ������ " + split_score[1]);
		System.out.println("���� ������ " + split_score[2]);
		
		// ���� ���
		System.out.println("������ " + total_score);
		
		// ��� ���� ���
		System.out.println("��� ������ " + avg_score);
		
		
		
		
		
	
	
		
	}

}
