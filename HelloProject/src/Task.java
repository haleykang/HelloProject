
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***������ ���� �����***");
		System.out.println("1. ���� �����ϱ�");
		System.out.println("2. ���� �����ϱ�");
		System.out.println("3. ���� �����ϱ�");
		System.out.println("4. ���� ������ �� ���ϱ�");
		System.out.println("5. ���� ������ ������ ���ϱ�");
		System.out.print("���� �ִ� �޴��� ��ȣ�� �Է��ϼ��� : ");
		
		// �޴��� ��ȣ(1~5)�� ���ڷ� ������ �� �ִ� ���� ����
		
		char menu_no = ' ';
		
		try{
			menu_no = (char)System.in.read();
			System.out.println("����ڰ� �Է��� �޴� ��ȣ�� " + menu_no); 
		} catch(Exception exception) {
			
			System.out.println("�߸��� ��ȣ�� �Է� �ϼ̽��ϴ�.");
			System.out.println("������" + exception.getMessage());
			
		}
		
	}

}
