
/*
 * ������ �����ִ� ���α׷�
 * 
 * 1. ������ ���� : ���� ����, ���� ���� , ���� ����, ����, ���
 *
 * 2. �Է��� ����� ���� : Scanner ����; // Ű���� �Է¿� ���
 * 
 * 3. String �Է� ������ ���� ����; // ����ڰ� �Է��� ����,����,���� ������ ����
 * 
 * ��) ���� ���� ���� ������ ���ʴ�� �Է��ϼ��� (�� : 70 80 90)
 * 
 * -> nextLine() �Լ��� ����ؼ� 3���� ������ �Է� �ޱ�!
 * 
 * ù��° ���� ������ �Է��ϼ��� : 100 + ����
 * �ι�° ���� ������ �Է��ϼ��� : 20 + ����
 * ����° ���� ������ �Է��ϼ��� : 70 + ����
 * 
 * -> �� ��� next() �Լ��� �� �� ���
 * 
 */

// �Է� ó���� ����� Scanner Ŭ����
import java.util.Scanner;

public class TestGradeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ������ ��� �غ�
		
		Scanner my_scanner = new Scanner(System.in);
		
		String str_input = "";
		
		String [] str_res = null;
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		 
		int total = 0;
		double avg = 0.0;
		char grade = ' '; // ���� ���� �ѱ��� ���� ����
		// String str_grade = ""; // ���� ������ ���� ���ڷ� ǥ���� �� ���� ����
		
		// ������� �����ϴ� ����
		int count = 3; 
		
		// 2. ���ܻ�Ȳ ����ϱ�
		try {
			
			// 1) ����ڿ��� �Է� ��û �ϱ�
			System.out.print("����, ����, ����, 3���� ������ ���ʴ�� �Է��ϼ��� (�� : 30 40 50) : ");
			
			// 2) �Է� �Լ��� ����ؼ� ����ڰ� ������ �Է��� �� �ֵ��� �ϱ�
			str_input = my_scanner.nextLine();
			
			// 3) split("������ ���ڿ�") �Լ��� ����ؼ� 3���� ������ �ϳ��� ���ڿ� �迭�� �����ϱ�
			str_res = str_input.split(" ");
			
			// 4) 3���� ������ ����Ǿ� �ִ� str_res���� ������ ������ �о�ͼ� ������ ������ �����ϱ�
			
			kor = Integer.parseInt(str_res[0]);
			eng = Integer.parseInt(str_res[1]);
			math = Integer.parseInt(str_res[2]);
			
			// 5) ������ ������ ����� ������ �������� ȭ�鿡 ����ϱ� 
			
			System.out.println("�Էµ� ���� ������ " + kor + "�� �Դϴ�.");
			System.out.println("�Էµ� ���� ������ " + eng + "�� �Դϴ�.");
			System.out.println("�Էµ� ���� ������ " + math + "�� �Դϴ�.");
			
			// 6) ��� �������� �� ���� ������ ���� ������ ���� �� ȭ�鿡 ���
			
			total = kor + eng + math;
			System.out.println("������ " + total + "�Դϴ�.");
			
			// 7) ������ ������� ���� ���� ���ؼ� ����� ���ϰ� ������ ����
			avg = total / (double)count;
			// total, count���� ��� ������ ����(int)�̱� ������ �� �� �ϳ��� �Ǽ��� ������ ���� �� ��ȯ �ؾ���!
			// �� �� �ϳ��� �Ǽ��� ���� �Ǽ��� ������ ����
			
			// 8) ��� ���
			System.out.println("��� ������ " + avg + "�Դϴ�.");
			// printf() �Լ��� ����ؼ� �Ҽ��� �Ʒ� �ڸ����� ���� �� ���� ����
			System.out.printf("��� ������ �Ҽ��� �Ʒ� 2�ڸ� ������ ����ϸ� %.2f\n", avg);
			
			/*
			 * 9) ���� ���ϱ� : ������ ���� ����� ����ؼ� ���� ���ϱ�
			 * 
			 * -> ��Ģ ���ϱ� 
			 * A ���� : ��� ������ 90�̻��̰� 100���� 
			 * -> �̻� �׸��� ���� ������ �ۼ��Ϸ��� �� ������ + �� ������ 
			 * -> if (�񱳽� 1 �������� �񱳽�2 �������� �񱳽� 3)
			 * -> 90 �̻��̰�(�׸��� : and ���� : ���� ����) 100 ����
			 * -> 2���� ���� ����� ��� ���� ��쿡�� ����� ��
			 * 
			 * and ���� : && ��ȣ�� ����ؼ� ����, ��� ���� ���̾�� ���� 
			 * if (�񱳽�1 && �񱳽�2 && �񱳽�3)
			 * 
			 * if(avg >= 90 && avg <= 100)
			 * �Ǵ� ( 90 <= avg && 100 >= 100)
			 *  ���� A�� ���� grade�� �����ϱ� 
			 */
			System.out.println("���� ���ϱ�");
			if(90 <= avg && 100 >= avg) {
				System.out.println("A ������ ���� grade�� ����");
				grade = 'A';
			}
			else if(80 <= avg && 90 > avg) {
				System.out.println("B ������ ���� grade�� ����");
				grade = 'B';
			}
			else if(70 <= avg && 80 > avg) {
				System.out.println("C ������ ���� grade�� ����");
				grade = 'C';
			}
			else if(60 <= avg && 70 > avg) {
				System.out.println("D ������ ���� grade�� ����");
				grade = 'D';
			}
			else if (50 <= avg && 60 > avg) {
				System.out.println("E ������ ���� grade�� ����");
				grade = 'E';
			}
			else if (0 <= avg && 50 > avg) {
				System.out.println("F ������ ���� grade�� ����");
				grade = 'F';
			}
			else {
				System.out.println("��� ���� ����!");
				grade = 'F';
			} // else : ������ ���� ���� ��� ���
				
			/*
			 * B ���� : ��� ������ 80�̻� 90�̸�
			 * C ���� : ��� ������ 70�̻� 80�̸�
			 * D ���� : ��� ������ 60�̻� 70�̸�
			 * E ���� : ��� ������ 50�̻� 60�̸�
			 * F ���� : ��� ������ 50�̸� 
			 * 
			 */
			
			// ������, ������ ������ ȭ�鿡 ���
			System.out.println("���� ������ " + grade);
			
			
			
		}catch(Exception exception) {
			
			System.out.println("���� �߻�!!");
			System.out.println("������ " + exception.getMessage());
		
		}
		// 3. ���α׷� �����ϱ�
		
	}

}
