package march10;

/*
 * 
 * do~while �ݺ��� �ۼ��ϰ� �����ϱ�
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class TestDoWhileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input_str = "YES";
		
		try {
			System.out.println("������ �غ��� ���� input_str ���� �ҹ��ڷ� �ٲٱ�");
			input_str = input_str.toLowerCase();
			System.out.println("����� �ҹ��ڴ�" + input_str);
			input_str = input_str.toUpperCase();
			System.out.println("�ٽ� �빮�ڷ� ���� " + input_str);
			
			Scanner scanner = new Scanner(System.in);
			
			// do ~ while �ݺ����� ����ؼ� ����ؼ� ����ڷκ��� yes �Ǵ� no ���ڿ�
			// �Է� �ޱ�
			
			do {
				
				System.out.print("yes �Ǵ� no�� �Է��ϼ��� :");
				input_str = scanner.next();
				input_str = input_str.toLowerCase(); // �Է¹��� ���ڸ� �ҹ��ڷ�!
				
				System.out.println("�Է��� ���ڰ� ��� �ҹ��ڷ� ����Ǿ����ϴ�.");
				System.out.println("����� �ҹ��ڴ� " + input_str);
				
				if(input_str.equals("yes") == true) {
					System.out.println("����ؼ� ������ �����ߴ� ��ɹ��� ����!");
					continue; // while() �ݺ����� ���ǽ����� ���� �̵��ϴ� ��ɹ�!!!
					// while(true) �� �̵��ؼ� ��ɹ� �� ����
				}
				else if(input_str.equals("no") == true) {
					System.out.println("����ڰ� no�� �Է��߽��ϴ�.");
					System.out.println("�� �̻� �ݺ� �������� �ʽ��ϴ�.");
					break; // do~while(true) : ��ɹ� ��ü�� Ż��!
					// ���� ����� �ݺ��� 1���� Ż���ϴ� ��ɹ� !
					// while(true) �Ʒ��� Ż��
				}
				else{
					System.out.println("yes�Ǵ� no�� �ƴ� ���ڸ� �Է��ϼ̽��ϴ�.");
					continue; // �ٽ� do ��ɹ����� �̵�
				}
				
			} while(true);
			
			System.out.println("do~while �ݺ����� Ż��");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����߻�");
			System.out.println("������" + e.getMessage());
		}

	}

}
