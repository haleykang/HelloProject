package march10;

import java.util.*;

public class TestNew {
	
	static void myprint() {
		
		String string [] = new String [7];
		int i = 0; 
		
		string[0] = "***������ ��Ģ ���� ���� �ۼ�***\n";
		string[1] = "1.	���� ���� �ϱ�\n";
		string[2] = "2.	���� ���� �ϱ�\n";
		string[3] = "3.	���� ���� �ϱ�\n";
		string[4] = "4.	���� ������ �� ���ϱ�\n";
		string[5] = "5.	���� ������ ������ ���ϱ�\n";
		string[6] = "���� �ִ� �޴� ��ȣ�� �Է��ϼ��� : ";
		
		for(i = 0; i <= 6; ++i) {
			System.out.print(string[i]);
		}
	}
	
	static void myscanner() {
		
			// ����ڰ� �Է��� ���ڸ� ���� ���� ����
			int user_input = 0;
			Scanner scanner = new Scanner(System.in);
			user_input = scanner.nextInt();
			System.out.println(user_input + "���� ���� �ϼ̽��ϴ�.");
		
	}
	
	
	
	static int add(int a, int b) {
		
		return (a+b);
	}
	
	static int minus(int a, int b) {
		
		return (a-b);
	}
	
	static int gop(int a, int b) {
		
		return (a*b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myprint();
		myscanner();
		
	
	}

}
