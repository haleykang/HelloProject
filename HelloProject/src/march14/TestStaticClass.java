package march14;

import java.util.*;


public class TestStaticClass {
	
	// static ���� ����
	// ��) static int s_no = 0;
	
	static Scanner scanner = new Scanner(System.in);
	static int s_age = 0;
	static final String s_name = "������";
	static final int birth_year = 1990;
	static int now_year = 0;
	int y_birth_year = 0;
	String y_name = "";
	final int n_year = 2017;
	
	
	public static void s_my_info() {
		
		System.out.print("���� �⵵�� �Է����ּ��� (�� : 2001) : ");
		now_year = scanner.nextInt();
		
		System.out.println("���� �̸��� " + s_name + "�Դϴ�.");
		System.out.println("���� " + birth_year + "�⿡ �¾���ϴ�.");
		
		s_age = (now_year - birth_year)+1 ;
		System.out.println("���� ���̴� " + s_age + "�� �Դϴ�.");
		
	}
	
	public void n_your_info() {
		
		System.out.print("����� �̸��� �Է����ּ��� : ");
		y_name = scanner.next();
		
		System.out.print("����� �¾ �⵵�� �Է����ּ���(�� : 1990) : ");
		y_birth_year = scanner.nextInt();
		
		System.out.println("���� �⵵�� " + n_year + "�� �Դϴ�.");
		System.out.println("����� �̸��� " + y_name + "�Դϴ�.");
		
		s_age = (n_year - y_birth_year) +1;
		
		System.out.println("����� " + s_age + "�� �Դϴ�.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestStaticClass your_info = new TestStaticClass();
		your_info.n_your_info();
		s_my_info();
	
	}

}
