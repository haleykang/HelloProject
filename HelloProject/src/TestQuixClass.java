
/*
 *  ���� ������ ����ڿ��� ���� ����ڰ� ���� �Է��մϴ�!!
 *  
 *  �����̸� - �����Դϴ�! ����� õ���Դϴ�!
 *  Ʋ������ - �����Դϴ�! ���� ��ȸ�� �ٽ� �����غ�����! 
 * 
 */

// ��ĳ�� Ŭ������ ����ϱ� ���� ��ɹ�
import java.util.Scanner;

// ���� ���� ������ ���� ��ɹ�
import java.util.Random;

public class TestQuixClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. �ʿ��� �������� �غ��ϱ�
		Scanner my_scanner = new Scanner(System.in);
		int user_input = 0; // ���� ���� ���� : ����ڰ� �Է��� ���� ����
		
		// ���� ���� ���� ������ ���� ����
		// ����1 + ����2
		int dap = 0;
		
		// ������ ���Ǵ� ù��° ������ ������ ���� ���� & �ʱ�ȭ
		int no1 = 0;
		// �ι�° ����
		int no2 = 0;
		
		// ���� ������ ���鶧 ����� Random ���� ���� new �����ڸ�
		// ����� �޸𸮿� Random Ŭ������ ���� �����
		Random random = new Random();
		

		
		// 2. ���� ��Ȳ ����ϱ�
		
		try {
			
		/*	no1 = random.nextInt(10) + 1; // 1~10 ������ ���� ����
			no2 = random.nextInt(20) + 1; // 1~20 ������ ���� ���� 
			
			System.out.print(no1 + "+ " + no2 + " ? ");
			user_input = my_scanner.nextInt();
			dap = no1 + no2;
			if (dap == user_input) {
				System.out.println("�����Դϴ�. ����� õ���Դϴ�.");
			}
			else {
				System.out.println("�����Դϴ�. ����� �ٺ��Դϴ�.");
			}
			*/
			// �� 5�� ���� ������ Ǫ�� �ݺ���
			int count ;
			
			// ���� ������ �����ϴ� ���� ����
			int cor = 0; // ������ ��쿡�� 1�� ����
			
			// Ʋ�� ���� �����ϴ� ���� ����
			int wr = 0; // ������ ��쿡�� 1�� ����
			
			// ���� ����
			int score;
			
			for(count = 1; count <=5; ++count) {
				
				no1 = random.nextInt(10) + 1;
				no2 = random.nextInt(10) + 1;
				
				dap = no1 + no2;
				
				System.out.print(count + "�� �����Դϴ�.\n"+no1+"+"+no2+"?");
				user_input = my_scanner.nextInt();
				
				if(user_input == dap) {
					System.out.println("õ��!");
					++cor;
				}
				else {
					System.out.println("�ٺ�!");
					++wr;
				}
				
				// ������� ���� ������ Ʋ�� ������ �о�ͼ� ��� 
				System.out.println("������� ���� ������ " + cor + "��, Ʋ�� ������ " + wr + "�� �Դϴ� ");
			}
			
			// ���� ��� : 100�� ����
			score = (cor * 20);
			
			System.out.println("������ " + score + "�� �Դϴ�.");
			
		} catch(Exception exception) {
			
			System.out.println("���� �߻�");
			System.out.println("������ " + exception.getMessage()); 
		}
	}

}
