/*
 *  ������ ���� ���α׷� �����
 */

import java.util.Scanner ;

public class TestCalcClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ���α׷����� ����� ����/��� �غ��ϱ�
		 */
		
		int first = 0;
		int sec = 0;
		int res =0;
		char op = ' '; // ���⸦ �ۼ��� ��!
		
		int a = '3' - '0';
		System.out.println("���� 3 - ���� 0 �� ����" + a); 

		
		Scanner my_scanner; // ��ĳ�� ����
		
		my_scanner = new Scanner(System.in);
		
		String user_input_line = "";
		
		// 10���� ���� �����͸� ������ �� �ִ� �迭 ����� 10���� ���� �����
		int iarray [ ] = new int[10];
		/*
		 * 10���� ������ �ڵ����� �����Ǹ�, ������ ���� 0�̶�� �����Ͱ� �����
		 * 
		 * ������ �̸��� 1�� -> �����ϱ� ���� ��ġ ��ȣ(���� ��ȣ)�� �ڵ� ������
		 * iarray + ��ġ ��ȣ
		 * 
		 * iarray[0] - ù ��° ������ ��ȣ 0�� �ο�
		 * iarray[1] - �� ��° ������ 1
		 * ...
		 * iarray[9] - ������ ������ 9(������ ���� -1)
		 * 
		 *  ���⼭ �߻� �� �� �ִ� ���� ������ ? 
		 *   0~9�� ����� ���� ��ȣ�� �Է�
		 *    iarray [ -1 ], iarray[ 10 ] ���
		 *    
		 *    ����� �Բ� ��� -> ������ ���� �˻�( 0 ~ 9 )
		 * 
		 */
		
		try {
			
			// ������ ���� �迭�� ù��° ������ 100�� �����ϱ�
			iarray[0] = 100;
			System.out.println("�迭�� ù��° ������ ���� " + iarray[0]); 
			
			System.out.print("���� ���� ������ ���� ������ �Է�(�� 3 + 4) : ");
			
			user_input_line = my_scanner.nextLine();
			
			System.out.println("����ڰ� �Է��� �����ʹ� " + user_input_line);
			
			// split() �Լ��� ����ؼ� ����ڰ� �Է��� ������ �� ����, ������, ���ڸ� �迭�� ��������
			String [ ] str_result = user_input_line.split(" ");
			
			// �迭�� ����� ù��° ���ڸ� ȭ�鿡 ���
			System.out.println("����ڰ� �Է��� ù��° ���ڴ� " + str_result[0]);
			
			// �迭�� ����� �����ڸ� ȭ�鿡 ���
			System.out.println("����ڰ� �Է��� �����ڴ� " + str_result[1]);
			
			// �迭�� ����� �ι�° ���ڸ� ȭ�鿡 ���
			System.out.println("����ڰ� �Է��� �ι��� ���ڴ� " + str_result[2]);
		
		} catch(Exception exception) {
			
			System.out.println("���ܻ�Ȳ �߻�!!");
			System.out.println("������ " + exception.getMessage());
		}
		

	}

}
