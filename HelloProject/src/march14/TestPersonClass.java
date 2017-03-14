package march14;

/*
 * ���� ���迡 �����ϴ� ����� ǥ���� �� �ִ� Ŭ���� �����
 * 
 * ����� �м��ؼ� �Ӽ��� ����(�ൿ)���� �и�
 * 
 */

// ���ο� ��� Ŭ���� ����� 

class PersonClass { // public class ���ο��̸� {} // ���� �߻�
	// public class �̸��� ���� �̸��� ���� ���� -> ���� �̸��� ����(�Ѱ�)
		// ���α׷��� �ĺ���
	
	// 1. �Ӽ�(Attribute) : �����͸� �����ϴ� ����/���/�迭 �κ�
	
	//non-static : ������ �����! ��� ��ü�� ���� ��������� ������
	// �� �޸𸮿� �����Ǵ� ���� 
	// ��) Ŭ���� �̸� ���ο�������(��ü) �̸� ; 
	// ���ο�������(��ü)�̸� = new Ŭ���� �̸�();
	// �޸𸮿� Ŭ������ ���� + non-static ������ �� ����
	// PersonClass kim = new PersonClass (); // String name = "ȫ�浿";
	// PersonClass lee = new PersonClass (); // String name = "ȫ�浿";
	// PersonClass choi = new PersonClass (); // String name = "ȫ�浿";
	// �̷������� new�� �� �� ���� �� �޸𸮿� ���ο� Ŭ������ ����, ���� �����Ϳ���
	// -> ���� ���� �Ǵ� ���� ����
	
	String name = "ȫ�浿";
	
	// static : ������ ���� -> �Ѱ��� �޸𸮿� ����
	// �ڹ� ���� �ӽſ� ���ؼ� �ѹ��� �޸𸮿� ���� -> �ּҰ� ������ ����
	// -> ���� ���� �Ǵ� ���� ���� : final�� ��� ��ɾ�
	// �Ϲ������� ����� static�� ����
	static final String MY_NAME = "ȫ�浿";
	
	// ���� ���� �Ǵ� ���� ����
	
	static String name2 = "ȫ�浿";
	
	
	
	// 2. ���� �Ǵ� �ൿ(Action �Ǵ� Function �Ǵ� Method) : �����͸� ����ϴ� �޼ҵ�
	
	// ��� ����, ����� ����ϴ� ���ο� �޼ҵ� ����� -> non-static �Լ�
	public void show_name_method() {
		// �ٸ� �θ� ���丮(��Ű��)������ ���̴� �޼ҵ�
		
		// �ν��Ͻ� ������ name�� ����ؼ� ���� �޸𸮿� ����� �̸��� 
		// �о���� ȭ�鿡 ����ϴ� ��ɹ�
		System.out.println("�ν��Ͻ� ���� name�� ���� �ִ� �̸��� " + name);
		
		// Ŭ���� ������ ��� ����
		// -> name2 ���� �̸��� ���
		System.out.println("Ŭ���� ���� name2�� ���� �ִ� �̸��� " + name2);
		
		// Ŭ���� ������ Ŭ�����̸�.�̸�
		// -> �ٸ� Ŭ���������� �׻� Ŭ�����̸�.�̸�
		System.out.println("Ŭ���� ���� name2�� Ŭ�����̸�.name2�� ���� �ϸ� "
				 + PersonClass.name2);
		
	}
	void show_name2_method() {
		// ���� �θ� ���丮(��Ű��)������ ���̴� �޼ҵ�
		// 1) non-static ��� ����/ �Լ� �̸�
		// 2) static ��� ����/ ���/ �Լ��̸�
	
	}
	
	static void show_name3_method() {
		// static ����, ���, �Լ� �̸��� ��� ������ �޼ҵ�
		// non-static ����, �Լ��̸��� ��� �Ұ���
		
		System.out.println("Ŭ���� ������ name2�� ����ؼ� �̸��� ����ϸ� " + name2);
		
	}
	
}

public class TestPersonClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
