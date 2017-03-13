
/*
 * ���� �������� �ִ밪�� �ּҰ��� ȭ�鿡 ����ϴ� ���α׷�
 */


import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Ű���� �Է¿� ����� Scanner ������ ����
		Scanner my_scanner;
		
		// 2. new �����ڿ� = �����ڸ� ����ؼ�
		// �޸𸮿� Scanner Ŭ������ ����� ���� �޸��� �ּҸ� ��������
		my_scanner = new Scanner(System.in);
		
		// 3. ���ܻ�Ȳ�� ����� try ~ catch �� �ۼ�
		try {
			
			// next() �Լ��� ����ؼ� �Ѱ��� ���ڿ� �����͸� �Է� �ޱ�
			
			System.out.println("�ϳ��� ���ڿ� �����͸� �Է��ϼ��� :");
			String one_str = my_scanner.next();
			System.out.println("����ڰ� �Է��� ���ڿ� �����ʹ� " + one_str);
			
			System.out.println("���� ���� ���ڿ� �����͸� ����� �Բ� �Է��ϼ��� : ");
			String strings = my_scanner.nextLine();
			System.out.println("����ڰ� �Է��� ���� ���� ���ڿ� �����ʹ� " + strings);
			
			/*System.out.print("�ϳ��� ������ �Է��ϼ��� : ");
			
			int inumber = my_scanner.nextInt();
			
			System.out.println("����ڰ� �Է��� ������ " + inumber);
			*/
			
			// �Ǽ� �Է� �ޱ�
			
			System.out.println("�ϳ��� �Ǽ��� �Է��ϼ��� : ");
			
			double dnumber = my_scanner.nextDouble();
			
			System.out.println("����ڰ� �Է��� �Ǽ��� " + dnumber);
			
		} catch(Exception exception) {
			
			// sysout + ctrl + space Ű�� ������ �ڵ����� �Էµ�!
			// System.out.println();
			System.out.println("���ܻ�Ȳ �߻�");
			System.out.println("�ڼ��� ������ " + exception.getMessage());
		
		}
		
		
		// 1. ����ڰ� �Է��� �ϳ��� ���ڸ� ������ �� �ִ� ����
		char user_input_ch = 'a';
		// char user_input_ch = '5';
		// char user_input_ch = ''; // �ȵ�
		// char user_input_ch = ' '; // �̷��Դ� ����, ���鹮��(������)
		
		// 2. ����ڰ� �Է��� ���� ���� ���ڵ�(���ڿ�)�� ������ �� �ִ� ����
		String user_input_str = "abc";
		// String user_input_str = "100";
		// String user_input_str = ""; -> �̷��Ե� ����, �� ���ڿ�(Empty String)
		// -> �����Ͱ� ������ ǥ�� ����
		
		
		// 1. ���� �Ǵ� ��� ���� ��ɹ�
		
		int ia = 3;
		int ib = 4;
		
		double da = 3.0;
		double db = 4.0;
		
		// ��� ����� �����ϴ� ���� ���� 
		
		int ic = 0; // ������ ó�� ���� �����ϴ� �� : �ʱ�ȭ
		double dc = 0.0; 
		
		/*
		 * ���ܻ�Ȳ�� ����� try ~ catch �� �ۼ��ϱ�
		 * 
		 */
		
		try {
			
			// ����ڿ��� �Է� ��û�ϱ�
			System.out.print("�ϳ��� ���ڸ� �Է��ϼ��� : ");
			
			// ����ڿ��� �ϳ��� ���� �Է��� ��û�ϱ�
			user_input_ch = (char)System.in.read();
			
			// ����ڰ� �Է��� ���ڸ� ȭ�鿡 ���
			System.out.println("����ڰ� �Է��� ���ڴ� " + user_input_ch);
			
			// ��ȯ �Լ��� ����ؼ� ���ܻ�Ȳ�� �����
			// parseInt() �Լ��� �����ؼ� ����ڰ� �ѱ��� �Է��� ���
			// ������ ���ܻ�Ȳ�� �߻���Ű�� catch() ������ ���� ������ �̵�
			
			ia = Integer.parseInt(user_input_ch + "");
			
			// �ѱ��� �Է��� ��� -> parseInt('��' +"");
			// -> parseInt("��") -> ���ܻ�Ȳ �߻� -> ó�� �Ҵ�
			// -> parseInt() �Լ����� ���� ������ catch() ������ �̵� ��
			
			// ����ڰ� ���� 1�� �Է��� ��쿡�� ����Ǵ� ��ɹ� �ۼ�
			System.out.println("����ڰ� �Է��� ���ڴ� " + ia);
		
		} catch(Exception exception) {
			// Exception : ���ܻ�Ȱ�� ó���� �ִ� Ŭ����
			// exception : ���� �̸�, ���� ������ �޴� ����
			System.out.println("���ܻ�Ȳ �߻�");
		}
		
		// + ��ȣ�� ����ؼ� ���� ������ �� �Ŀ� ���� ic�� �����ϱ�
		ic = ia + ib;
		System.out.println(ia+"+"+ib+"="+ic);
		
		dc = da + db;
		System.out.println(da+"+"+db+"="+dc);
		
		// ++ ������ ����ϱ�
		ia = 1;
		
	
		System.out.println("���� ia�� ���� " +ia); // 1
		
		// ���� ia�� ���� 1��ŭ ũ�� �ϱ�
		// 1) ia = ia +1;
		// 2) ++ia; �Ǵ� ia++;
		
		++ia;
		System.out.println("���� ia�� ���� " +ia);
		
		ia++;
		System.out.println("���� ia�� ���� " +ia);
		
		--ia; // ia = ia - 1
		System.out.println("���� ia�� ���� " +ia);
		System.out.println("���� ia�� ���� " + ++ia);
		
		int test = 0;
		System.out.println("test ���� " + ++test);
		System.out.println("test ���� " + --test);
		
		
		// ��ɹ� �ۼ�
		
		// ��� �Լ��� ����ؼ� ������ �ִ밪�� �ٷ� ȭ�鿡 ����ϱ�
		System.out.println("int �ڷ��� ������ �ִ밪�� " + java.lang.Integer.MAX_VALUE);
		
		// ��� �Լ��� ����ؼ� ������ �ּҰ��� �ٷ� ȭ�鿡 ����ϱ�
		System.out.println("int �ڷ��� ������ �ּҰ���" + java.lang.Integer.MIN_VALUE);
		
		// int �ڷ����� ������ ũ�⸦ �Ѿ�� ��쿡�� long �ڷ����� ��� �ؾ��� 
		// ��� �Լ��� ����ؼ� long �ڷ��� ������ �ִ밪 ����ϱ�
		System.out.println("long �ڷ��� ������ �ִ밪�� " + java.lang.Long.MAX_VALUE);
		
		long a = java.lang.Long.MIN_VALUE;
		System.out.println("long �ڷ��� ������ �ּҰ��� " + a);
		
	}

}
