package march14;

import java.util.*;

public class InputStudentClass {
	
	/* 
	 * ���� 
	 * - ����ڰ� ����� �Է� : String count; // -> ���
	 * - ����ڰ� ���� �̸� �Է� : String subject; // -> ���
	 * - �Է� ��û �Լ� 
	 * - ����ڰ� ���� �Է� : int score;
	 * - ���� ��Ÿ����
	 * - ���� ���ϱ�
	 * - ��� ���ϱ�
	 * 
	 */
	
	// ��ĳ�� ���� ����
	Scanner scanner = new Scanner(System.in);
	
/*	// ���� �� ���� ����
	private String count = "";
	*/
	
//	// ���� �̸� ���� ����
//	private String subject = "";
//	
	// ���� ���� ����
	private int score = 0;
	
	private String s_score = "";
	private String [] str_score = null;

	
	
/*	// ����ڰ� ����� �Է��ϴ� �Լ�
	
	public String input_count() {
		
		count = scanner.next();
		return count;
	
	}*/
	
	// ����ڰ� ���� �̸� ���� �Լ�
	
	// ���� �Է� �Լ� 
	public String input_score() {
		
		// ������ 3 4 5 �̷��� �Է¹ޱ�!
		s_score = scanner.nextLine();
		
		return s_score;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� ������� �Լ� ��� ����
		InputStudentClass isclass = new InputStudentClass();
		
		// ���� �Է� ��û
		
		
		// try~catch
		try {
			
			System.out.print("���� ���� ��ȸ ���� ������ �Է����ּ��� : ");
			String my_score = isclass.input_score();
			String [] str_score = my_score.split(" ");
			
			
			
			
		} catch (Exception e) {
			System.out.println("���� �߻�");
			System.out.println("������ " + e.getMessage());
			e.printStackTrace();
		}

		
	
	}
}

	

					
		
///*		try {
//			
//			// ����� �Է� ��û
//			System.out.print("���� ���� �Է����ּ��� : ");
//		
//			// ����� �Է� �ް� ������ ���� ����
//			String scount = isclass.input_count();
//			
//			// �Է¹��� ������� ���� ������ ���� �� ������ ���� ����
//			int icount = Integer.parseInt(scount);
//			
//			if(icount > 0 ){
//			
//			// ����� ó���ƴ��� Ȯ���ϱ�
//			System.out.println(icount);
//			
//			}
//			
//			else {
//				
//				System.out.println("�߸� �Է��߽��ϴ�.");
//				
//			}*/
		
		

	

