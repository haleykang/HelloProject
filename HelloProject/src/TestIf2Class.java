import java.util.Scanner;

/*
 * if�� �ۼ� ���α׷�
 * 
 * ����ڷκ��� �ϳ��� ������ �Է� �޾Ƽ� ����ڰ� �Է��� ������ ��������
 * �Ǵ� 0���� �Ǵ� ��������� �Ǵ��ϴ� ���α׷� �����
 * 
 */
public class TestIf2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ���� / ��� ����� �ʱ�ȭ
		Scanner my_scanner = new Scanner(System.in);
		int inumber = 0;
		String str_number = "";
		
		// 2. ���ܻ�Ȳ ó�� try~catch �� �ۼ�
		try{
			System.out.print("�ϳ��� ������ �Է��ϼ���(��: 10) : ");
			
			str_number = my_scanner.next();
			
			inumber = Integer.parseInt(str_number);
			
			System.out.println("������ ��ȯ�� �Է� ���ڿ��� " + inumber);
			
			if(inumber < 0) {
				System.out.println("����ڰ� �Է��� ������ ����!!");
			}
			else if (inumber == 0) {
				System.out.println("����ڰ� �Է��� ������ 0!!");
			}
			else if (inumber > 0) {
				System.out.println("����ڰ� �Է��� ������ ���!!");
			}
			
		} catch(Exception exception) {
			
			System.out.println("���ܻ�Ȳ �߻�!");
			System.out.println("������ " + exception.getMessage());
			
		}

	}

}
