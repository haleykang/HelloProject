package march13;

/*
 * �޼ҵ�(Method)�� ���� ���� main() �Լ����� ���(���� �Ǵ� ȣ��) �ϱ�
 * -> �޼ҵ忡�� �ۼ��� ��� ��ɹ����� �ϳ��� �����ϱ�
 */
// ���̺귯�� ����ϱ�
import java.util.Scanner;
import java.util.Random;
import java.lang.*; //  ���� �Է����� �ʾƵ� �����Ϸ��� �ڵ����� ����
// -> �⺻ ��Ű�� 

public class TestPrintClass {
	
	// 2���� ���� �� ū �������� ��ȯ�ϴ� �Լ�
	
	static int yourmax(int fir, int sec) {
		
		System.out.println(Math.max(fir,sec));
		
		return 0;
	}
	
	static int mymax(int first, int second) {
		
		int result;
		
		result = first - second;
		
		if (result > 0 ) {
			return first;
		}
		else if (result < 0) {
			return second;
		}
		
		return 0;
	}
	
	static int max(int no1, int no2) {
		
		if(no1>no2)
			return no1;
		else if(no1<no2)
			return no2;
		else return 0;
	
	}
/*	static int inputmax(int a, int b) {
		
		Scanner scanner = new Scanner(System.in);
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		
		return 0;
		
	}
	*/

	
	// �ٷ� ����ϴ� �Լ� ����� : static + ��ȯ�� + �̸� + ( �Է� ) + { }
	static void myprint() {
		// ���� ����ϴ� print() �Լ��� �����ϴ� ��ɹ��� �ۼ�
		System.out.println("�ȳ��ϼ���?");
	}
	
	// new �����ڸ� ����ؾ� ����� �� �ִ� �Լ� �����
	
	void myprint2() {
		System.out.println("�ȳ��Ͻʴϱ�?");
	}
	
	// void : ��ȯ�� -> return data type -> ȣ���� �Լ��� �����ϴ� �������� ����
	// ������ �Լ��� �����ִ� �������� ������ ���
	// main() �Լ����� my_print2() �Լ��� ����
	// ������ ���� ��꿡���� ������ ������� -> int �ڷ����� ���
	// int add_method( int a, int c) {}
	// �Ǽ� �����͸� ��ȯ -> float �Ǵ� double + �Լ��̸�() { }
	// ���� �����͸� ��ȯ -> char + �Լ��̸�() { }
	// ���ڿ�(���� ���� ������) �����͸� ��ȯ -> String + �Լ��̸�() {}
	// �迭 �����͸� ��ȯ -> �ڷ��� + [] + �Լ��̸� () { }

	// �ϳ��� ������ ��ȯ�ϴ� �Լ� �����
	int add_method( int a, int b ) {
		System.out.println("add_method(a,b) �Լ��� ����Ǿ����ϴ�.");
		System.out.println("2���� ������ �����ϰ� �� ����� ��ȯ");
		return a+b;
		// ������ �����ؼ� return ����
		// int result;
		// result = a+b;
		// return result;
	}
	
	// �ϳ��� ���ڸ� ��ȯ�ϴ� �Լ� �����
	char ch_method() {
		System.out.println("�ϳ��� �ҹ��� a�� ��ȯ�ϴ� �Լ�");
		return 'a' ; // �ٸ� ���ڴ� ��ȯ���� �ʴ� �Լ�(���� ���)
	}
	
	// �ϳ��� �Ǽ��� ��ȯ�ϴ� �Լ� �����
	float f_method() {
		System.out.println("�ϳ��� float�� �Ǽ��� ��ȯ�ϴ� �Լ�");
		return 3.14f;
	}
	
	double d_method() {
		System.out.println("�ϳ��� double�� �Ǽ��� ��ȯ�ϴ� �Լ�");
		return java.lang.Math.PI;
		// java.lang ��Ű���� �ִ� Math Ŭ������ ���� �ִ� PI ��� �̸��� �����
		// ���� ���� ��� 
	}
	
	// �ϳ��� ���ڿ��� ��ȯ�ϴ� �Լ� �����
	String str_method() {
		System.out.println("�ϳ��� ���ڿ��� ��ȯ�ϴ� �Լ�");
		return "���ڿ�";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 2���� ������ ������ �� �ִ� ���� ����
		int a = 0; int b = 0;
		
		//2. ����ڷκ��� 2���� ������ �Է� �ޱ�
		// -> Ű���带 ����ϴ� �Լ��� �ʿ� -> ������ nextInt()
		// -> ���ڿ��� ��� next() �Ǵ� nextLine() �Լ�
		// -> �Ǽ��� ��� nextDouble() �Լ�
		
		// 3. Scanner ������ �ʿ� -> ����ϰ��� �ϴ� �Լ��� nextLine() ��
		// non-static �Լ��̱� ����! -> ��� ���� �޸𸮿� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		// 4. �Է� ������ ó�� -> ���� ��Ȳ�� ���� ���
		try {
			
			// ù���� ������ ����ڷκ��� �Է� �ޱ�
			System.out.print("ù��° ������ �Է��ϼ��� : ");
			a = scanner.nextInt();
			
			System.out.print("�ι�° ������ �Է��ϼ��� : ");
			b = scanner.nextInt();
			
			System.out.println("����ڰ� �Է��� 2���� ���� Ȯ���ϱ�");
			System.out.println("ù ��° ������ " + a + "�� ��° ������ " + b);
			
			// �Է¹��� 2���� ������ max() �Լ��� �����ϰ� ���
			System.out.println("�� ���� �� ū ������ " + max(a,b));
			// max() �Լ��� ���� return ū ������ �޾ƿͼ� println() �Լ��� ȭ�鿡 ���
			
			// �̷��Ե� ����
			int result = max(a,b);
			System.out.println("�� ���� �� ū ������ " + result);
		
			
			
			
			// ���� ����
			System.out.println("���ִ� �ȳ��ϼ���?"); 
			// ���߿� ���� 
			myprint(); 
			
			// myprint2() �Լ� ���� : non-static �Լ�
			// new �����ڷ� �޸� ���� �� ����(��ü) �̸��� ����ؼ� ����
			// Ŭ�����̸� + �����̸� ; -> ����
			TestPrintClass object;
			
			// new �����ڸ� ����ؼ� �޸𸮿� TestPrintClass Ŭ���� �����
			// Ŭ������ ���� �ִ� ��� non-static �Լ����� �����
			// new Ŭ�����̸� ();
			// -> ���� ������� �޸��� ���� �ּҰ� ����
			// -> ����  �ּҸ� ����ϱ� ���ؼ��� = ��ȣ�� ����ؼ� �ּҸ� ������ ����
			// �����̸� = new Ŭ�����̸� ();
			object = new TestPrintClass();
			// TestPrintClass object = new TestPrintClass(); �̷��� ���յ� ����
			
			// �޸𸮿� ������� myprint2() �Լ��� ���� -> ��(.) �����ڸ� ���
			// �����̸�.�Լ��̸�();
			
			System.out.println("20, 50 �� ū ������ " + mymax(50,20));
			
			System.out.print("ũ�⸦ ���� 2���� ������ �Է����ּ��� : ");
		
			int ma = scanner.nextInt();
			int mb = scanner.nextInt();
			System.out.println("�Է��� �� �� ū ������ " + max(ma,mb) + " �Դϴ�.");
			
		} catch (Exception e) {
			System.out.println("���� ��Ȳ �߻�");
			System.out.println("������ " + e.getMessage());
			e.printStackTrace(); // �� �ڼ��� ������ 
			// ���� ���� �޸𸮿� �ִ� ��� ������ ȭ�鿡 ��� 
			
		}
		
	

		
	}

}
