
/*
 * ������ ����ؼ� ���� �޴��� ����ڿ��� ��õ�ϴ� ���α׷� 
 */

import java.util.Scanner;
public class TestRandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner my_scanner = new Scanner(System.in);
		
		// ������ �Ǽ��� �����ϴ� ���� ����
		double drandom = 0.0;
		
		// ������ ������ ������ ���� ����
		int irandom = 0;
		
		// ���α׷����� ��õ�� �޴��� ���� ����� ����ڰ� �Է�
		String user_input = "";
		
		// ������� �Է��� �� ���ڸ��� ���� -> y �Ǵ� n
		char y_n = ' ';
		
		// ����ڿ��� ������ �޴��� �迭�� ���� �ϱ�
		// �޴� ��� : �ܹ���, ������ġ, �Ľ�Ÿ, �׿� 
		// -> �޴��� ���� �� �� �ִ� �迭 �غ�
		String [ ] str_menu = new String[4];
		
		// ù��° �޴� �ܹ��Ŵ� str_menu[0] �� ����
		str_menu[0] = "�ܹ���";
		str_menu[1] = "������ġ";
		str_menu[2] = "�Ľ�Ÿ";
		str_menu[3] = "�� �� �޴�";
		
		/*
		 * 1. ������ ����ϴ� -> �Ǽ� ���� -> Math.random()
		 */
		System.out.println("���ο� �Ǽ� ������ ����");
		System.out.println("������ ������ " + Math.random());
		System.out.printf("�ι�°�� ������ ������ %.2f\n", Math.random());
		
		drandom = Math.random();
		
		System.out.println("����° ������ " + drandom);
		
		// ������ ���� �Ǽ� ������ ������ �ٲٱ�
		// (int) drandom
		// ������ ������ ����� �����ϱ�
		
		irandom = (int)(drandom * 15);
		// ���� ������� ������ 0.5 -> (int)0.5 -> 0 
		// ���� 15�� ����
		
		System.out.println("������ ������ " + irandom);
		
		
	/*
	 * ����ڿ��� ������ �޴��� ����Ǿ� �ִ� string �迭�� ���� ��ȣ��
	 * ������ ���� -> 4���� �޴� ���� -> 0~3 ���̿� �ִ� ������
	 * ������ ���ؾ� �� 
	 * -> (int)(Math.random() * 4) -> 0~3 ������ �ִ� �ϳ��� ������ ��ȯ
	 *  ��? 0.0 ������ �������� *4 -> 0
	 *  0.99 ������ �������� *4 -> 3.9999 -> 3
	 * 
	 * 	str_menu[0] = "�ܹ���";
	 * str_menu[1] = "������ġ";
	 * str_menu[2] = "�Ľ�Ÿ";
	 * str_menu[3] = "�� ��";
	 * 
	 */
		System.out.println("(0~3) ���������ϳ��� ������ ���ϸ� " + (int)(Math.random() *4)); 
	
		irandom = (int)(Math.random() *4); 
		
		if(irandom == 0) {
			System.out.println("���� ���� ������ ������ 0");
			System.out.println("�޴����� ù���� �ܹ��Ÿ� ��������");
			System.out.println(str_menu[0]);
		}
		else if(irandom == 1) {
			System.out.println("���� ���� ������ ������ 1");
			System.out.println("�޴����� �ι�° ������ġ�� ��������");
			System.out.println(str_menu[1]);
		}
		else if(irandom == 2) {
			System.out.println("���� ���� ������ ������ 2");
			System.out.println("�޴����� ����° �Ľ�Ÿ�� ��������");
			System.out.println(str_menu[2]);
		}
		else if(irandom ==3) {
			System.out.println("���� ���� ������ ������ 3");
			System.out.println("�޴����� �� �ܸ� ��������");
			System.out.println(str_menu[3]);
		}
		else{
			System.out.println("�޴��� ���� ��ȣ ����");
		}
		
		// switch~case Ȱ���غ���
		switch(irandom) {
			case 0 :
				System.out.println("0");
				break;
			case 1 : 
				System.out.println("1");
				break;
			case 2 :
				System.out.println("2");
				break;
			case 3 :
				System.out.println("3");
				break;
				
				default :
					System.out.println("�޴��� ���� ��ȣ");
		}
		
		try {
			
			// 1. ������ ������ ������ ������ ����ؼ�
			// �޴��� ����ڿ��� �����ֱ�
			
			System.out.println("���� �޴��� " + str_menu[irandom] + "��(��) ����?");
			System.out.print("�ֹ��� ���Ͻø� y, ������ �����ø� n�� �Է����ּ��� : ");
			
			user_input = my_scanner.next();
			
			// ����ڰ� �Է��� y �Ǵ� n �� ���ڸ� �о�ͼ� y_n ������ ����
			y_n = user_input.charAt(0);
			
			if(y_n == 'y' ) {
				System.out.println("y�� �Է��ϼ̽��ϴ�.");
			}
			else if (y_n == 'n') {
				System.out.println("n�� �Է��ϼ̽��ϴ�.");
			}
			else {
				System.out.println("�ٸ� ���ڸ� �Է� �ϼ̽��ϴ�.");
			}
			
		}catch (Exception exception) {
			
			System.out.println("���� �߻�");
			System.out.println("������ " + exception.getMessage()); 
			
		}
		
	}

}
