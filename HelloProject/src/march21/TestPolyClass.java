package march21;


/*
 * ������ ���� ����
 */
class MyParentClass {
	public void method() {
		System.out.println("method() in MyParentClass");
	}
	
}

class MyChildClass extends MyParentClass {
	// ��� ���� method() �Լ��� �� ������ �ؾ���
	@Override
	public void method() {
		System.out.println("method() in MyChildClass");
		System.out.println("�����ǵ� �޼ҵ�");
	}
	
}

class MyChild2Class extends MyParentClass {
	// ��� ���� method() �Լ��� ������ �ϱ�
	@Override
	public void method() {
		System.out.println("method() in MyChild2Class");
		System.out.println("�����ǵ� �޼ҵ�");
	}
	
}


public class TestPolyClass {
	
	/*
	 * ������ ���� Ŭ���� ���� �޼ҵ带 �����
	 * 
	 * 1. �θ� Ŭ������ �ּҸ��� ���� �� �ִ� ���ο� �޼ҵ� �����
	 * 
	 */
	public void method1(MyParentClass red_parent_ob) {
		System.out.println("method1() �Լ��� ���� �Ǿ����ϴ�.");
		System.out.println("main() �Լ����� �θ� Ŭ������ �ּҸ� ����");
	
	}
	
	/*
	 * 2. �ڽ� Ŭ������ MyChildClass�� �ּҸ��� ���� �� �ִ� ���ο� �޼ҵ�
	 */
	public void method2(MyChildClass ref_child_ob) {
		System.out.println("method2() �Լ��� ���� �Ǿ����ϴ�.");
		System.out.println("main() �Լ����� MyChildClass�� �ּҸ� ����");
		
	}
	
	/*
	 * 3. �ڽ� Ŭ������ MyChild2Class�� �ּҸ��� ���� �� �ִ� ���ο� �޼ҵ�
	 */
	public void method3(MyChild2Class ref_child2_ob) {
		System.out.println("method3() �Լ��� ���� �Ǿ����ϴ�.");
		System.out.println("main() �Լ����� MyChild2Class�� �ּҸ� ����");
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyChildClass ref_ob1 = new MyChildClass();
		MyChild2Class ref_ob2 = new MyChild2Class();
		
		ref_ob1.method();
		ref_ob2.method();
		
		
		MyParentClass ref_ob = new MyParentClass();
		ref_ob.method();
		
		/*
		 * MyChildClass Ŭ����(�ڽ� Ŭ����)�� �ּҸ� ���� �ͼ� ������ ����
		 */
		ref_ob = new MyChildClass();
		
		/*
		 * ref_ob = ���� �޸𸮿� ������ �ڽ� Ŭ������ ���� �ּ�;
		 */
		ref_ob.method(); // MyChildClass
		
		ref_ob = new MyChild2Class();
		/*
		 * MyChild2Class Ŭ�������� �������� method() �޼ҵ带 ���� 
		 */
		ref_ob.method(); // MyChild2Class
		
		

	}

}
