package march21;

/*
 * ���� ��� ���� �����
 * 
 * 1. �θ� Ŭ����
 * 2. �θ� �������̽�
 * 3. ��� ����� ����ؼ� ������ ���� �θ� Ŭ������ �������̽��� ���
 * 
 * 4. ����
 * 
 * class ���� ����� �ڽ� Ŭ���� �̸� extends ��ɾ� �θ� Ŭ���� �̸�
 * 				implements �θ� �������̽� �̸� {
 * 
 *  }
 * 
 */

// �θ� Ŭ���� �����
class MyParentClass1 {
	// �θ� Ŭ�������� �޼ҵ� �����
	public void method() {
		System.out.println("method() in MyParentClass1");
	}
	// ���ο� �޼ҵ� �߰��ϱ� -> ����Ǿ� �ִ� �ڽ� Ŭ���������� ���
	public void method2() {
		System.out.println("method2() in MyParentClass1");
	}
	
}

// �θ� �������̽� �����

interface MyParentInterface1 {
	
	// ��ӹ��� �ڽ� Ŭ�������� ������ �����ǵǾ�� �ϴ� �޼ҵ�
	// ������ -> Overriding -> �������̽��� �ִ� �޼ҵ��� �Ӹ� �κа�
	// ��ü �κ��� �ڽ� Ŭ�������� �ۼ��ϴ� ��
	// �������̽��� �ִ� �޼ҵ��� �Ӹ��κа� �����ϰ� �ۼ�
	public void pub_interface() ;
	
}

// ���ο� �ڽ� Ŭ���� ����� : ������ ���� Ŭ������ �������̽��� ����(���)
class MyFirstChildClass extends MyParentClass1 implements MyParentInterface1 {
	
	// MyParentInterface1 �������̽����� ���� �߰��� �޼ҵ��� �Ӹ� �κа�
	// ��ü �κ��� �ۼ�
	@Override // ������̼�(annotation) : �Ƚᵵ ������ �����Ϸ����� �������̵� �ߴٰ� �˷��ִ� �� 
	public void pub_interface() {
		System.out.println("�ڽ� Ŭ�������� �������� pub_interface()");
	}
	
	// ��� ����� ����߱� ������ �θ� Ŭ������ �ִ� method() �޼ҵ尡 �����
	// method() �޼ҵ带 �ٷ� ��� ����
	public void use_method() {
		// ��� ���� method() �޼ҵ带 �̸����� �ٷ� ��� ����
		method(); // this.method(); // this : new �����ڿ� ���ؼ� �޸𸮿� ������
		// MyFirstChildClass Ŭ������ �ּ� ���� ���� 
		System.out.println("use_method() in MyFirstChildClass");
	}
	
	// ���ο� �޼ҵ� method3() �����
	public void method3() {
		System.out.println("method3() in MyFirstChildClass");
	}
	
}

public class TestInhClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���α׷��� ���۵Ǵ� Ŭ������ �ִ� main() �޼ҵ�
		System.out.println("���α׷��� ���۵Ǿ����ϴ�.");
		
		// ��ɹ� �߰�
		/*
		 * 1. �θ� Ŭ���� �̸��� ���
		 * 
		 * 2. �ڽ� Ŭ���� �̸��� ���
		 * 
		 * 3. �θ� �������̽� �̸��� ���
		 * 
		 */
		// �θ� Ŭ���� �̸��� ����ؼ� ������ ����(�޸��� �ּҸ� �����ϴ�
		// ������ ����
		MyParentClass1 ref_parent_ob = null;
		
		// 2. �ڽ� Ŭ���� �̸��� ����ؼ� ������ ���� ����
		MyFirstChildClass ref_child_ob = null;
		
		// 3. �θ� �������̽� �̸��� ����ؼ� ������ ���� ����
		MyParentInterface1 ref_ob = null;
		
		// = ��ȣ�� �߽����� �ؼ� ���� �κ��� Ŭ���� �̸� + �������̽� �̸� 
		
		// 4. �θ� Ŭ������ �޸𸮿� ����(new Ŭ�����̸�() )
		
		// 5. �޸𸮿� ������ �θ� Ŭ����(��ü)
		// -> ������ ���� �̸� = new �θ�Ŭ�����̸�();
		// -> new �θ�Ŭ�����̸�(); // ��ȸ�� ��ü �Ǵ� �ӽ� ��ü �Ǵ� �̾� ��ü 
		
		/*
		 * ��ü�� �ѹ��� ����ϴ� ���
		 * -> AWT���� ����� ������ ���� �̺�Ʈ ó�� ��ɹ� �ۼ�
		 * -> new WindowAdapter()
		 * 
		 * -> new WindowAdaper()
		 */
		
		ref_parent_ob = new MyParentClass1();
		
		
		// ��(.) �����ڸ� ����ؼ� �޸𸮿� �ִ� method() �޼ҵ带 ����
		
		ref_parent_ob.method();
		
		// �ڽ� Ŭ������ �޸𸮿� ����(new �ڽ�Ŭ�����̸�()) �ϰ�
		// ������ ������ �����ϱ�
		ref_child_ob = new MyFirstChildClass();
		
		// �޸𸮿��� method() �޼ҵ�. use_method() �޼ҵ尡 ������� �ִ� ����
		// ���߿� ����ϰ� ���� �޼ҵ带 ����
		ref_child_ob.use_method();
		
		// ��� ���� method()�� ����
		ref_child_ob.method();
		
		// �θ� Ŭ�������� ��� �߰��� method2()�� ����
		ref_child_ob.method2(); // ����� ���� ������ �ʽ��ϴ�.
		
		ref_parent_ob.method2();
		
		// ���� �������� pub_interface() �޼ҵ� ����
		ref_child_ob.pub_interface();
	

		System.out.println("���α׷��� ����˴ϴ�.");

	}

}
