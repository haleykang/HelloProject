
/*
 *  ���� �޴��� ����ڰ� ���� ���α׷�
 */

// �Է� ó���� ����� Scanner Ŭ����
import java.util.Scanner;

public class TestSwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ���� ��� �غ�
		
		Scanner my_scanner = new Scanner(System.in);
		String str_input = "";
		// ���� ������ �޴� ��ȣ�� �����ϴ� ���� ����� �ʱ�ȭ
		int menu_no = 0;
		
		// 2. ���ܻ�Ȳ ���
		
		try{
			
			// 1) �޴��� ����ڿ��� �����ֱ�
			
			System.out.println("***���� �޴� ����***");
			System.out.println("1. �ܹ���\n2. ����\n3. ¥���\n4. �� ��");
			System.out.print("���Ͻô� �޴� ��ȣ�� �Է� �ϼ��� : ");
			
			str_input = my_scanner.next(); // �ԷµǴ� �����Ͱ� �� ����(����) �̴ϱ� next()�� ��� 
			
			menu_no = Integer.parseInt(str_input);
			
			// ���� if������ �ۼ�
			if(menu_no == 1) {
				System.out.println("�ܹ��Ÿ� ���� �ϼ̽��ϴ�.");
				System.out.println("������ 3000�� �Դϴ�.");
			}
			else if(menu_no == 2) {
				System.out.println("���ڸ� ���� �ϼ̽��ϴ�.");
				System.out.println("������ 5000�� �Դϴ�.");
			}
			else if(menu_no == 3) {
				System.out.println("¥����� ���� �ϼ̽��ϴ�.");
				System.out.println("������ 4000�� �Դϴ�");
			}
			else if(menu_no == 4) {
				System.out.println("�� �� �޴��� ���� �ϼ̽��ϴ�.");
				System.out.println("�� �� �޴��� �����ϴ�.");
			}
			else {
				System.out.println("�޴��� ���� ��ȣ�� �Է� �ϼ̽��ϴ�.");
			}
			
			/*
			 *  ������ �ۼ��� ���� if���� switch~case ������ �ٲٱ�
			 *  
			 *  1. ���� if���� ���ǿ��� ����� ���� �̸��� switch(�����̸�)
			 *  switch(�����̸�) // ���� �̸��� �ѹ��� ���� �ۼ�
			 *  
			 *  2. ������ ��{}�� ������ ��.
			 *  switch(�����̸�) {
			 *  
			 *  3. ���� ���� ����� ���� ó���ϴ� case ���� ����
			 *  -> case ������ �ۼ��� ���� ���� ���� ���� �ۼ� + :(�ݷ�)
			 *  -> case + ���� + �� + �ݷ� + ��ɹ� �ۼ�  + break; ��ɹ� �ۼ� ����
			 *  -> case 1 :
			 *  	��ɹ�;
			 * 		break; ��ɹ� �ۼ��ϰų� ���� �ʰų� 
			 * 	 break; // �Ʒ��� �ִ� ��� ��ɹ����� �������� �ʰ� switch~case�� ��ü�� Ż��
			 * -> break; ��ɹ��� ������ ������ ����ؼ� �Ʒ��� �ִ� case ��ɹ����� ���� 
			 *  }
			 *  
			 */
			
			switch(menu_no) {
			case 1 :
				System.out.println("����ڰ� �Է��� �޴� ��ȣ�� 1");
				System.out.println("������ 3000�� �Դϴ�.");
				
				// �߰�ȣ�� �����ص� case1��  ���̸� �ΰ��� ��ɹ��� ���� ��
			
				break;
				
			case 2 : 
				System.out.println("����ڰ� �Է��� �޴� ��ȣ�� 2");
				System.out.println("������ 5000�� �Դϴ�.");
				
				break;
				
			case 3 :
				System.out.println("����ڰ� �Է��� �޴� ��ȣ�� 3");
				System.out.println("������ 4000�� �Դϴ�.");
				
				break;
				
			case 4 :
				System.out.println("����ڰ� �Է��� �޴� ��ȣ�� 4");
				System.out.println("�� �� �޴��� �����ϴ�.");
				
				break;
			/*
			 * ���� if������ �ۼ��� else �κ��� default : �� �ۼ�
			 */
			default :
				System.out.println("�޴��� ���� ��ȣ�� ���� �ϼ̽��ϴ�.");
			}
			
			
		}catch(Exception exception) {
			
			System.out.println("���ܻ�Ȳ �߻�!!");
			System.out.println("������ " + exception.getMessage());
		}
	}
	// 3. ���α׷� ����

}
