/*
 * for �ݺ��� ����
 * 
 */

import java.util.Scanner;
		
public class TestForclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  ȭ�鿡 5�� Hello�� ����ϴ� �ݺ��� �����
		 *  
		 *  �ݺ� Ƚ���� �ʱ�� + ���ǽ� + ������
		 *  
		 *  1) ���� = ������ ; ���� <= ��������(ū��) ; ++�����̸�
		 *  2) ���� = ū��; ���� >= ��������(������) ; --�����̸�
		 *  
		 */
		// for �ݺ������� ����� ���� ���� : �ݺ� Ƚ���� �����ִ� ����
		
		int count;
		
		for(count=1; count <=5; ++count) {
		
			// ���� ����� ȭ�鿡 Hello �޼����� ���
			System.out.println("Hello");
			// ���� count ���� Ȯ���ϱ� ���ؼ� ���
			System.out.println(count);
		}
		for(count=5; count >=1; --count) {
			
			System.out.println("�ȳ��ϼ���");
			System.out.println(count);
		}
		
		// 1~10 ���̿� �ִ� ���� �߿��� Ȧ������ ����ϴ� �ݺ���
		int inumber;
		
		// ���1.
		
		for(inumber = 1; inumber <=10; inumber +=2) {
			System.out.print(inumber + " ");
		}
		
		System.out.println("\n�ݺ����� ��� ��ġ���� ���� inumber�� ���� " + inumber); 
	
		/*
		 * ��� 2. 
		 * �Ϲ������� for �ݺ��� �ȿ��� if���� ���
		 * -> if(���� inumber�� ���� ���� Ȧ�������� ����)
		 * 	-> if((inumber % 2) !=0) // inumber % 2�� �������� 0�� �ƴϸ� �� (��, Ȧ��)
		 *
		 */
		
		for(inumber = 1; inumber <=10; ++inumber) {
			
			// ���� ���� inumber ���� Ȧ�������� if���� ����ؼ� �����ϱ�
			if((inumber % 2) != 0) {
				System.out.print(inumber + " ");
			}
		}
		
		System.out.println(); // ��µǴ� ������� �ٹٲ޸� ��.
		
		/*
		 * �ʱ�Ŀ��� ����ϴ� ���� ����ڷκ��� �Է� �ޱ�
		 * 
		 * for ( �����̸� = �����̸�2 ;
		 * 
		 * for ( inumber = �����̸�1(����ڰ� �Է��� ���ڰ� ����) ; inumber <= �����̸�2(����ڰ� �Է��� ���ڰ� ����)
		 * 
		 * ����ڰ� ù��° ���� 1�� �Է��ϸ�
		 * int user_intput_number1 = 1;
		 * 
		 * ����ڰ� �ι�° ���� 100���� �Է��ϸ�
		 * int uesr_input_number2 = 100;
		 * 
		 * for(inumber = user_input_number1; inumber <= user_input_number2; ++inumber)
		 * 
		 * ��, ����ڰ� ù��° ���ڸ� �� ū ������ �Է��Ѵٸ�
		 * 
		 * user_input_number1 = 100
		 * user_input_number2 = 1
		 * 
		 * ��ɹ� ���� �ȵ�.
		 * 
		 * ���� -> ����ڰ� �Է��� 2���� ���ڸ� ���ؼ� ū ���� ���� ���� �����Ͽ�
		 * 
		 * ���� ���� int min_number ������ ����
		 * ū ���� int max_number ������ ����
		 * 
		 * for(innumber = min_number; inumber <= max_number; ++ inumber) ��ɹ�;
		 * 
		 * 1. ���̺귯�� �Լ��� ��� 
		 * -> java.lang ��Ű���� ���� �ִ� Math Ŭ������ max() �Լ��� ����ϸ�
		 * 		ū ���� ���� �� ����!
		 * 		
		 * 		int max_number = Math.max(10,20);
		 * 
		 * 2. java.lang.Math.min() �Լ��� ����ϸ� ���� ���� ���� �� ����.
		 * 
		 * 		int min_number = Math.min(10,20);
		 * 
		 * 10, 20 -> ����ڷ� ���� �Է� �޾ƾ� �� -> ���� �ʿ� -> int user1, user2
		 *
		 *  ����ڷκ��� 2���� ������ �Է� �ޱ� : nextInt() �Լ��� ���
		 *  
		 *  user1 = my_scanner.nextInt();
		 *  user2 = my_scanner.nextInt();
		 *
		 * int max_number = Math.max(user1,user2);
		 * int min_number = Math.min(user1,user2);
		 * 
		 * for(innumber = min_number; inumber <= max_number; ++ inumber) ��ɹ�;
		 * 
		 */
		
		/*
		 * �߰��� �ʿ��� �������� �غ�
		 */
		int user1 = 0, user2 =0;
		int max_number = 0, min_number = 0;
		
		Scanner my_scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("ù��° ������ �Է��ϼ��� : ");
			user1 = my_scanner.nextInt();
			
			System.out.print("�ι�° ������ �Է��ϼ��� : ");
			user2 = my_scanner.nextInt();
			
			max_number = Math.max(user1,user2);
			min_number = Math.min(user1,user2);
			
			System.out.println("ù��° ������ " + user1 + " �ι�° ������ " + user2);
			System.out.println("ū ������ " + max_number + " ���� ������ " + min_number);
			
			for(inumber = min_number; inumber <= max_number; ++inumber) {
				System.out.print(inumber +  " ");
			}
			System.out.println("\n�ݺ��� Ż�� �� inumber �� " + inumber);
			
		}catch(Exception exception) {
			System.out.println("���� �߻�");
			System.out.println("������" + exception.getMessage());
		}
	
		
		
		
		
	}

}
