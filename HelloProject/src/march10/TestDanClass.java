package march10;

/*
 * ������ ���� �ۼ��ϱ�
 * 
 */

import java.util.Scanner;
import java.util.Random;

public class TestDanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ȭ�� ��� ���� �׸��� 
		 * 
		 * 1. ȭ�鿡 2�ܸ� ����ϱ� 
		 * 
		 *  ***2�� ���***(Ÿ��Ʋ ���) + �� �ٲ�
		 *  2*1=2 + �ٹٲ�
		 *  2*2=4 + �ٹٲ�
		 *  ...
		 *  2*9=18 + �ٹٲ�
		 *  
		 *  2. ���ϴ� �����Ϳ� ������ �ʴ� �����͸� ����
		 *  ���ϴ� ������ : ���� ��� 
		 *  ������ �ʴ� ������ : ��� ��� 
		 *  
		 *  2*1=2 -> 2, *, = ��ü���� ������ �ʴ� ������ 
		 *  1-> ��ü���� ���ϴ� ������ 
		 *  2 -> ��ü���� ���ϴ� ������
		 *  
		 *  ������ �ʴ� �κ��� ����� ��� : final int DAN = 2;
		 *  * ��ȣ�� ���� �� �� �ִ� ��� ���� : final char OP = '*';
		 *  = ��ȣ�� ���� �� �� �ִ� ��� ���� : final char EQ = '=';
		 *  ����� ������ ���� : int res;
		 *  
		 */
		
		final int DAN = 2;
		final char OP = '*';
		final char EQ = '=';
		
		int num = 0;
		int res = 0;
		Scanner scanner = new Scanner(System.in);
		
		// Ÿ��Ʋ�� �ѹ��� ���� ���
		/*System.out.println("****" + DAN + "�� ���****");
		
		for(num=1; num<=9; ++num) {
			// 2*1=2
			res = DAN * num;
			System.out.println(DAN+" "+OP+" "+num+" "+EQ+" "+res);
			
		}*/
		
		int dan;
		try{
		System.out.print("1~9������ ���� �� �ϳ��� �Է����ּ��� : ");
		
		dan = scanner.nextInt();
		
		while(dan <=9){
			int i = 1;
			System.out.println("***" + dan + "�� ���***");
			while(i<=9){
				res = dan * i;
				System.out.println(dan + " " +OP+" "+i+" "+EQ+" "+res);
				++i;	
			}
			++dan;
		}
		
		// ����ڰ� �Է��� ������ �����ܸ� ����ϰ� ���� ��
		
		System.out.print("1��~9�ܱ��� Ȯ���ϰ� ���� �������� �Է����ּ���(�� : 1) :");
		
		dan = scanner.nextInt();
		
		System.out.println("***" + dan + "�� ���***");
		int j = 1;
		
		while( j <= 9) {
			res = dan * j ;
			System.out.println(dan + " "+ OP + " " + j + " " + EQ + " " + res);
			++j;
		}
		
		}catch(Exception e){
			System.out.println("�����߻�");
			System.out.println("������ " + e.getMessage());
		}
	}

}
