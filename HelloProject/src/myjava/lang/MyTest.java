package myjava.lang;

import java.util.Scanner;
import java.util.Random;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * ���� �޴� �����ϰ� �ۼ� 
		 * 
		 */
		// 1. �ʿ��� ���� ���� 
		Scanner my_scanner = new Scanner(System.in);
		
//		double drandom_no = 0.0; // ���� �Ǽ� ���� ����
		int irandom_no = 0; // ���� ���� ���� ����
		
		Random random = new Random();
		
		// �޴� ������ ���� ����
		String [] menu_name = new String [8];
		
		menu_name[0] = "�Ƹ޸�ī��";
		menu_name[1] = "��";
		menu_name[2] = "�ٴҶ��";
		menu_name[3] = "ī�� ��ī";
		menu_name[4] = "ī��� �����ƶ�";
		menu_name[5] = "īǪġ��";
		menu_name[6] = "�����ֽ�";
		menu_name[7] = "Ű���ֽ�";	
		
		// ���� ���� ����
		
		/*drandom_no = Math.random();
		irandom_no = (int)(Math.random()* 8);*/
		
		String user_choice = "";
		char Y_N = ' ';
		int c_c = ' ';
		
		try{
			Loop1 :
			do{
			irandom_no = random.nextInt(8);
			System.out.println("�ֹ� �Ͻ� ����� " + menu_name[irandom_no] + "�� ��Ű���?" );
			System.out.print(menu_name[irandom_no] + "�� ���Ͻø� Y, �ٸ� ���Ḧ ���Ͻø� N�� �Է����ּ��� : ");
			
			user_choice = my_scanner.next();
			user_choice = user_choice.toLowerCase();
			
			Y_N = user_choice.charAt(0);
			
			if(Y_N == 'y') {
				System.out.println(menu_name[irandom_no] + "�� ���� �ϼ̽��ϴ�.");
				System.out.println("���Ͻô� ���� ����� �������ּ���.");
				
				// ī�� ���� ���� ���� ���� 
				do{
				System.out.print("1. ī�� ����\n2. ���� ����\n");
				
				c_c = my_scanner.nextInt();
				
				if(c_c == 1) {
					
					System.out.println("ī�� ������ ���� �ϼ̽��ϴ�.");
					System.out.println("�ܸ��⿡ ī�带 �±����ּ���.");
					break Loop1;
				} 
				else if(c_c == 2) {
					
					System.out.println("���� ������ ���� �ϼ̽��ϴ�.");
					System.out.println("�ܸ��⿡ ������ �������ּ���.");
					break Loop1;
				}
				else {
					System.out.println("�߸��� �Է��ϼ̽��ϴ�.");
					continue;
				}
				
				} while(true);
			 }
			else if (Y_N == 'n'){
				continue;
				
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			} while(true); 
			
			// �ݾױ��� ǥ���ϰ� ������..
			
		/*	while(Y_N == 'N' || Y_N == 'n') {
				
				irandom_no = (int)(Math.random()* 8); // �ٽ� �ٸ� ���� �޴� 
				
				System.out.println("�ֹ� �Ͻ� ����� " + menu_name[irandom_no] + "�� ��Ű���?" );
				System.out.print(menu_name[irandom_no] + "�� ���Ͻø� Y, �ٸ� ���Ḧ ���Ͻø� N�� �Է����ּ��� : ");
				
				user_choice = my_scanner.next();
				
				Y_N = user_choice.charAt(0);
				
				// �ݺ��� �� ���� ���� n�� ������ ��� �ݺ��Ǵ°ɷ� �ؾ߰ڴ�.
				// while �ݺ������� N�� ������ ����ϱ�
				
				// ***** ���� import java.util.Random; ����ؼ� �������� ���� �ٽ� Ȯ���ϰ� ��������
				// do~while �ݺ������� break; continue; ����ؼ� ���� ������
*/	
			
			// else if �� N ���� ������ �ٽ� ���� ���� �� �� �ְ�
			// else �߸� �Է������� �ٽ� Y�� N Ŭ��
			
		}catch(Exception exception) {
			
			System.out.println("����");
			System.out.println("������ " + exception.getMessage());
			System.out.println("����� �������� �����ϼ���.");
			exception.printStackTrace(); // �� �ڼ��� ��������
		}
	}

}
