package march10;

/*
 *  while �ݺ��� ����� + ����ϱ�
 */
import java.util.Scanner;
import java.util.Random;
// ����� �������� import java.util.*; -> util ��Ű�� �ȿ� ��� �Լ� ��밡��

public class TestWhileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��ɹ� �ۼ�
		
		// 1. ���α׷����� ����� ����/�迭/����� �غ��ϱ�
		int inumber; // main() �Լ� �ȿ����� ���� ����(Global Variable)
		// ���� �Լ� �� ��� ��ɹ����� ����� �� �ִ� ����
		
		Scanner scanner = new Scanner(System.in);
		// ����ڰ� �Է��� yes �Ǵ� no ���ڿ��� ������ ����
		
		String yes_no = "";
		
		
		
		try { // try  + ctrl + space
			
			// for �ݺ����� ����ؼ� ����� ȭ�鿡 ���� 1~10������ ���
			for(inumber = 1; inumber <=10; ++inumber) {
				System.out.print(inumber + " ");
			}
			
			System.out.println("\n��� �Ϸ�");
			
			// while �ݺ����� �ۼ��ؼ� ���� 1~10���� ȭ�鿡 ���
			// 1) �ʱ�� ��ɹ� �ۼ�
			inumber = 1;
			
			// 2) while(���ǽ�) ��ɾ� �ۼ�
			
			// 3) �߰�ȣ ����� {}
			
			// 4) �߰�ȣ �ȿ��� �ݺ� ������ ��ɹ� �ۼ�
						
			// 5) �߰�ȣ �ȿ��� ������ ���� ��ȭ��Ű�� ��(������)�� �� �ۼ� 
			
			/*
			 * while �ݺ����� ����ؼ� ���� �ݺ��� ������ �����
			 */
			
			while(true){
				
				// �ݺ� ������ ��ɹ��� �ۼ�
				System.out.println("Hello");
				
				// ��� ���θ� �����
				System.out.print("����Ϸ��� yes �ߴ��Ϸ��� no�� �Է� : ");
				
				// ����ڰ� ���ڿ��� �Է��� �� �ֵ��� next() �Լ��� ����
				yes_no = scanner.next();
				
				// ����ڰ� �Է��� yes �Ǵ� no �Ǵ� �� ���� ���ڿ��� �����Ǿ� �ִ�
				// ���� yes_no ���� �˻��ϱ�
				
				// String Ŭ������ ���� �ִ� equals() �Լ��� ����ϸ�
				// ����ڰ� �Է��� ���ڿ��� �ٸ� ���ڿ��� �������� �� ����
				// ��� ��� ) 
				// ����ڰ� �Է��� ���ڿ��� ���� �Ǿ��ִ� �����̸�.equals("������ ���� ���ڿ�");
				// ��� ���ڰ� ������ ��
				// ���� ������ ������ ����
				// yes_no.equals("yes") 
				
				// equals() �Լ��� ���� ������ �����ϴ� ���� ����
				// equal() �Լ��� �����ϴ� ��ɹ� �ۼ�
				
				boolean chk = yes_no.equals("yes");
				
				if(chk == true) {
					
					System.out.println("����ڴ� yes�� �Է��߽��ϴ�.");
				} else {
					
					System.out.println("����ڴ� yes�� �ƴ� ���ڿ��� �Է��߽��ϴ�.");
					// ����ڰ� no�� �Է��� ��������� �˻��ϱ�
					
					chk = yes_no.equals("no");
					
					if(chk == true) {
						
						System.out.println("����ڰ� no�� �Է��߽��ϴ�.");
						System.out.println("�ݺ��� Ż��");
						break;
					}
					else {
						System.out.println("����ڰ� no�� �ƴ� ���ڿ��� �Է��߽��ϴ�.");	
						/*
						 * 1. �ٽ� ����ڿ��� �Է��� ��û�ϴ� �޼��� ���
						 * System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						 * System.out.println("�� yes �Ǵ� no���� �Է��ϼ���");
						 * 2. �ٽ� �Է� �ޱ�
						 * yes_no = scanner.next();
						 */
						
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						System.out.print("yes �Ǵ� no�� �Է��ϼ��� : ");
						
						yes_no = scanner.next();
						
						chk = yes_no.equals("yes") || yes_no.equals("no");
						
						if(chk == true) {
							break;
						} 
					
						
					}
			
				}
				}
				
			
	/*		 while(inumber<=10) {
				 
				 System.out.print(inumber + " ");
				 
				 ++inumber;
				 
				 
				  * System.out.print(inumber++ + " "); �̷��� �ѹ��� �ۼ� ���� 
				  * 
				  
				 
			 }
			*/
			
		} catch (Exception e) { 
		
			System.out.println("���� �߻�");
			System.out.println("�߻��� ������ " + e.getMessage());
			
			e.printStackTrace(); // �� �ڼ��� �������� 
			
		}
		
		// 2. ���ܻ�Ȳ ����ϱ� (try~catch �� �ۼ�)
		
		// 3. ���α׷� ���� ó�� (������)

	}

}
