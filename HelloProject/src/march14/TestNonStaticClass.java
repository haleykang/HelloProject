package march14;

/*
 * non-static �׽�Ʈ Ŭ���� �����
 * 
 */

import java.util.*;

public class TestNonStaticClass {
	
	int no = 0;
	Scanner scanner = new Scanner(System.in);
	String read = "";
	
	
	public void method() {
		
		System.out.println("���� no�� ���� �ִ� ������ " + no);
	}
	
	public int add(int a, int b) {
		return a + b;	
	}
	public String my_scanner() {
		
		read = scanner.next();
		
		return read;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// non-static �Լ��� method()�� ����ϱ� ���� ����
		// 1. ���� ���� : Ŭ�����̸� + �����̸�;
		// ���߿� �޸𸮿� ��������� Ŭ������ �ּҸ� �����ϴ� ����
		// (new �����ڿ� ���ؼ� ����)
		
		TestNonStaticClass a;
		a = new TestNonStaticClass();
		// �Ǵ� �׳� TestNonStaticClass a = new TestNonStaticClass();
		
		a.method();
		System.out.println("10 + 20�� ����� " + a.add(10, 20));
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String input = a.my_scanner();
		System.out.println(input);
		
		
		
	}

}
