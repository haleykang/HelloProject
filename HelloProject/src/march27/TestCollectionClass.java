package march27;

/*
 * �÷����� ����
 */
// �÷��ǿ� �ִ� ��� Ŭ������ �������̽����� ����ϱ� ���� ��ɹ�
import java.util.*;


/*
 * ��� �����͸� ������ �� �ִ� Ŭ���� �����
 * 
 */
class MyObjectClass extends Object {
	
	// �����͸� �����ϴ� ������ �ڷ����� �θ� Ŭ������
	Object ref_parent_ob = null;
	/*
	 * null : ���� �޸𸮸� ������ ���� ����
	 * -> ������ �Լ� �Ǵ� �ʱ�ȭ ������ new Ŭ�����̸�() ��ɾ ����ؼ�
	 * 		�޸𸮸� ���� ������ ��� ���� 
	 */
	// �⺻ ������ �����
	public MyObjectClass() {
		ref_parent_ob = new Object();
		
		
	}
	// main() �Լ����� Integer Ŭ������ �޴� ������ �����
	public MyObjectClass(Integer ref_int_ob) {
		
		ref_parent_ob = ref_int_ob;
		/*
		 * ���������δ� ����ȯ ������ �Ͼ
		 * ref_parent_ob = (Object)ref_int_object;
		 */
		System.out.println("MyObjectClass(Integer ref_int_ob) ������ �Լ� ����");
	}
	
	// main() �Լ����� �ϳ��� ������ �޴� ������ �����
	public MyObjectClass(int value) {
		System.out.println("MyObjectClass(int value) ������ �Լ� ����");
		ref_parent_ob = new Integer(value);
		/*
		 * public Integer(int value) {
		 *  Integer Ŭ������ ���� �ִ� ������ ���� �̸� = value;
		 * }
		 * �����ڸ� �����ϴ� ��ɹ� 
		 */
		
	}
	
	// main() �Լ����� �ϳ��� ���ڿ��� �޴� ������ �Լ� �����
	// -> public Ŭ�����̸�(String �����̸�) { }
	public MyObjectClass(String value) {
		System.out.println("main() �Լ��κ��� �ϳ��� ���ڿ��� �޴� ������ �Լ�");
		ref_parent_ob = value;
		// ���������� ����ȯ ������ �Ͼ
		// ref_parent_ob = (Object)value;
	}
	
	/*
	 * main() �Լ����� �ϳ��� �Ǽ��� �޴� ���ο� ������ �Լ� �����
	 * -> �Ǽ� : float �ڷ��� �Ǽ� �Ǵ� double �ڷ��� �Ǽ� �Ǵ� Wrapper Ŭ����
	 * -> Float �Ǵ� Double Wrapper
	 */
	public MyObjectClass(float value) {
		System.out.println("main() �Լ��κ��� �ϳ��� float �ڷ��� �Ǽ��� �޴� ������ �Լ�");
		ref_parent_ob = value;
	}
	public MyObjectClass(double value) {
		System.out.println("main() �Լ��κ��� �ϳ��� double �ڷ��� �Ǽ��� �޴� ������ �Լ�");
		ref_parent_ob = value;
	}
	
	/*
	 * main() �Լ����� Float Wrapper Ŭ���� �ڷ����� ��ü �ּҸ� �޴� ���ο� ������ �Լ� 
	 */
	
	public MyObjectClass(Float value) {
		System.out.println("main() �Լ��κ��� �ϳ��� Float Wrapper Ŭ���� �ڷ����� ��ü");
		System.out.println("�ּҸ� �޴� ������ �Լ�");
		ref_parent_ob = value;
	}
	
	public MyObjectClass(Double value) {
		System.out.println("Double Wrapper Ŭ���� ������ �Լ�");
		ref_parent_ob = value;
	}
	
	public MyObjectClass(char value) {
		System.out.println("main() �Լ��κ��� �ϳ��� char ���ڸ� �޴� ������ �Լ�");
		ref_parent_ob = value;
	}
	
}




public class TestCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// ��� ���� MyObjectClass Ŭ������ ����ϴ� ��ɹ� �޼�
		
		// �⺻ �����ڸ� �����ϴ� ��ɹ�
		MyObjectClass ref_ob = new MyObjectClass();
		
		// �ι�° �����ڸ� �����ϴ� ��ɹ�
		MyObjectClass ref_ob2 = new MyObjectClass(100);
		
		// ����° �����ڸ� �����ϴ� ��ɹ� 
		MyObjectClass ref_ob3 = new MyObjectClass(new Integer(100));
		
		MyObjectClass ref_ob4 = new MyObjectClass("100");
		
		MyObjectClass ref_ob5 = new MyObjectClass(3.14f);
		
		MyObjectClass ref_ob6 = new MyObjectClass(4.14);
		
		// Float Wrapper ������ ���
		MyObjectClass ref_ob7 = new MyObjectClass(new Float(6.14f));
		
		// Double Wrapper ������ ���
		MyObjectClass ref_ob8 = new MyObjectClass(new Double(7.14));
		
		// ���ڿ� ������ "100"�� MyObjectClass Ŭ������ �����ϱ�
		// new MyObjectClass("100") -> �ϳ��� ���ڿ��� �޴� ������ �Լ��� �־�� ����!
		// public MyObjectClass(String value) { } 
		
		System.out.println("*********************************************");
		
		// ���� 100�� Integer Ŭ������ �����ϱ� ���� ��ɹ� �ۼ�
		// -> ���� 100�� �ܺ� Ŭ�����κ��� ��ȣ
		// -> ���� 100�� ��üȭ
		java.lang.Integer ref_int_ob = new java.lang.Integer(100);
		
		// ���ڿ� 100�� IntegerŬ������ ����
		java.lang.Integer ref_int_ob2 = new java.lang.Integer("100");
		
		/*
		 * ���� + ���ڿ�("") -> ���� ���ڿ� 
		 * �Ǽ� + ���ڿ�("") -> �Ǽ� ���ڿ� 
		 */
		
		String str_value = 100 + "";
		java.lang.Integer ref_int_ob3 = new java.lang.Integer(str_value);
		
		String str_value2 = 3.14 + "";
		Double ref_double_ob = new Double(str_value2);
		System.out.println("ref_int_ob ���� ������ ������ �� �ִ� ������ " + ref_int_ob.intValue());
		System.out.println("ref_int_ob2 ���� ������ ������ �� �ִ� ������ " + ref_int_ob2.intValue());
		
		// toString() �Լ��� ����ϸ� Integer Ŭ������ ��ȣ�ϰ� �ִ� �������� ���ڿ��� ��ȯ
		
		String str_int_value1 = ref_int_ob.toString();
		System.out.println("ref_int_ob ���� ������ ������ ���� ���ڿ��� " + str_int_value1);
	
		// Double Ŭ������ �������� �Ǽ� ���� �о���� �Լ� : doubleValue()
		// double �Ǽ� ���� ������ ���� �̸� = ���������̸�.doubleValue();
		double dvalue = ref_double_ob.doubleValue();
		
		System.out.println("ref_double_ob ���� ������ ���� �ִ� �Ǽ� ���� " + dvalue);
		
		// Double Ŭ������ �������� �Ǽ����� ���ڿ��� �о���� �Լ� : toString()
		String str_dvalue = ref_double_ob.toString();
		System.out.println("ref_double_ob ���� ������ ������ ���ڿ� �Ǽ� ���� " + str_dvalue);

	}

}
