
// if���� �ۼ��ϴ� ���α׷�

// �Է� ó���� ����� Scanner Ŭ����
import java.util.Scanner;

public class TestIfControlClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ɹ� �ۼ�
		// 1. ���� �Ǵ� ��� ����(�޸� �غ��ϱ�) 
		// 2. ���ܻ�Ȳ�� ����ϱ� ���� try~catch �� �ۼ�
		// 3. �Է� ó���� ����� Scanner ���� ����� �����ϱ�
		Scanner my_scanner = new Scanner(System.in);
		// -> main() �޼ҵ� �ȿ� �ִ� ��� ��ġ���� ��� ������ ����
		
		// 4. ����ڰ� �Է��� ���� ��ü�� �����ϴ� ���ڿ� ���� ����
		String user_input_line = "";
		
		// 5. split() �Լ��� ���ؼ� ����Ǵ� ���� 2���� �����ڸ� �����ϴ� �迭 ����
		String [ ] result = null; // null : �ּҰ� ������ ǥ���ϴ� ��ɾ�
		// ���� split() �Լ��� ����ϱ� ���� ǥ��
		
		// 6. ����ڰ� �Է��� ù��° ������ ������ ���� ����
		int first = 0;
		
		// 7. ����ڰ� �Է��� �ι��� ������ ������ ���� ����
		int sec = 0;
		
		// 8. ����ڰ� �Է��� ������ ��ȣ �ѱ��ڸ� ������ ���� ����
		char op = ' ';
		
		// 9. ��� ����� ������ �� �ִ� ���� ����
		int res = 0;
		
		
		try { // �߰�ȣ : ��
			
		System.out.print("������ �Է��ϰ� ���͸� ��������(�� : 3 + 4) : ");	
		
		user_input_line = my_scanner.nextLine();
		
		result = user_input_line.split(" ");
		
		System.out.println("����ڰ� �Է��� ù��° ������ " + result[0]);
		System.out.println("����ڰ� �Է��� �����ڴ� " + result[1]);
		System.out.println("����ڰ� �Է��� �ι�° ������ " + result[2]);
		
		op = result[1].charAt(0);
		
		System.out.println("���ڿ����� ������ ������ �ѱ��ڴ� " + op);
		
		// ���ڿ� �迭�� ����� ù���� ������ �о�ͼ� ������ ������ first�� �����Ͻ�
		// ��ȯ�Լ��� parseInt() �Լ��� ���
		first = java.lang.Integer.parseInt(result[0]);
		sec = java.lang.Integer.parseInt(result[2]);
		
		System.out.println("������ ��ȯ�� ù��° ���ڿ��� " + first);
		System.out.println("������ ��ȯ�� �ι�° ���ڿ��� " + sec);
		
		// if���� ����ؼ� �����ڸ� ���� �ִ� ���� op�� �Ǵ��ϱ�
		/*
		 *  ���α׷����� ����� �� �ִ� �������� ���� ���� : + - * / %
		 *  �� ���� �����ڴ� ó������ �ʱ�
		 *  
		 */
		/*
		 * ��� 1. if���� ���� �� �ۼ��ϱ�
		 * 
		 * if ( ù��° ����)
		 *  ��ɹ�1;
		 * 
		 * if (�ι�° ����)
		 *  ��ɹ� 2;
		 *  ...
		 *  
		 */
		if(op == '+') {
			System.out.println("���� �Ի��� �ϰ� ����� ���");
			res = first + sec;
			System.out.println(first + " + " + sec + " = " + res);
		}
		if(op == '-') {
			System.out.println("���� ����� �ϰ� ����� ���");
			res = first - sec;
			System.out.println(first + " - " + sec + " = " + res);
			
			// ���� ���� ����� ����õ! 
		}
			
		} catch(Exception exception) {
			
			System.out.println("���ܻ�Ȳ �߻�!!");
			System.out.println("������ " + exception.getMessage()); 
		}
		
		}
		
	}


