package march14;

/*
 * Object Ŭ������ ��� Ŭ������ �θ� Ŭ����
 * 
 * -> ���� : ���Ǽ��迡 �ִ� �θ� ������ �ϴ� Ŭ������ �ʿ�
 * 
 * -> ���� ����� Ŭ���� ȥ�ڼ��� ���ο� �Լ��� ������ �ϱ� ������
 * �θ� Ŭ������ ���� �ִ� �Լ����� �ڵ����� ���(���� ����) �ޱ� ����
 * 
 */
// �л� Ŭ���� �����
class StudentClass extends Object {
	// �θ� Ŭ������ �ڵ����� �޸� �������ִ� �⺻ ������ �Լ� �ۼ�
	
	/*
	 * �л� ��ü�� ���� �����͸� ������ �� �ִ� ���� ����� �ʱ�ȭ ��ɹ� �ۼ�
	 * 
	 * �̸� ���� ���� ����� �ʱ�ȭ
	 * 
	 * ���� ���� ��ɾ� + �ڷ��� + �����̸� = �ʱⰪ;
	 * 
	 */
	// ���� ���� ��ɾ��� ���� : public / private / protected / default
	
	public String name = "ȫ�浿"; // ��� ��Ű������ ��� ����
	// �ٸ� Ŭ�������� �̸��� �ٲ� �� ����
	// �߿��� �����ʹ� ������ public ��ɾ�� ����
	
	public static final String MY_NAME = "ȫ�浿";
	
	// �л��� ���̸� �����ϴ� ���� ����
	private int age = 20;
	// ���� age�� ��� ���� - �ϳ��� Ŭ���������� ��� ����  
	// ���� ��Ű���� �־ Ŭ������ �ٸ��� ����� �� ���� ���� 
	
	// �л��� Ű�� �����ϴ� ���� ����
	
	double height = 178.5;
	/*
	 * ���� ���� ��ɾ �ۼ����� �� ���� default ���� ���� ��ɾ �ڵ� �߰�
	 * ���� ��Ű���� �ִ� ��� Ŭ�������� ��� ����
	 * ��Ű�� �̸��� �ٸ��� ����� �� ���� ����
	 * �θ� ���丮�� ���ƾ� ��� 
	 */
	
	// �л��� �����Ը� �����ϴ� ���� ����
	protected double weight = 76.5;
	// ��� ������ ���� Ŭ���� + �ڽ� Ŭ���� ���� ��� ���� 
	
	
	/*
	 * �Լ� ����� : ��ɺ��� �Լ� ����� -> ��� ����� ���� �Լ�
	 * �л��� �̸��� ��ȯ�ϴ� �Լ� �����
	 * 
	 */
	public String readName() {
		System.out.println("�л��� �̸��� ��ȯ�ϱ�");
		return name;
	}
	
	// ���� �ϳ��� �Լ��� �Ѱ��� ����� ���� �Ϲ���
	// ���̸� ��ȯ�ϴ� �Լ� �����
	
	public int readAge() {
		System.out.println("�л��� ���̸� ��ȯ�ϱ�");
		return age;
	}
	
	public double readHeight() {
		System.out.println("�л��� Ű�� ��ȯ�ϱ�");
		return this.height;
		/*
		 * �޸𸮿� ������ �л� Ŭ������ �ּҸ� this ������ ���� ����
		 * this.�޸𸮿� �ִ� ����/�Լ��̸�();
		 */
	}
	// �л��� �����Ը� ��ȯ�ϴ� �Լ� �����
	public double readWeight() {
		System.out.println("�л��� �����Ը� ��ȯ");
		return this.weight;
	}
	
	/*
	 * main() �Լ����� ������ ���� �Լ��� ����Ϸ��� �ѹ��� �ϳ��� �Լ��� ���
	 * -> �л� Ŭ������ �ּҸ� �����ϰ� �ִ� �����̸�.readAge();
	 * -> �л��� ���̸��� �о���� ��ɹ�
	 * -> �л��� �̸� �о���� : �����̸�.readName();
	 * -> �л��� Ű�� �о���� : �����̸�.readHeight();
	 * -> �л��� �����Ը� �о���� : �����̸�.readWeight();
	 * 
	 */
	
	public StudentClass() {
		super(); // new Object() ��ɹ��� �����ϰ� ǥ���� ��ɹ�
		/*
		 * 1. ���� Object Ŭ������ �޸𸮿� ����
		 * 2. �� ������ StudentClass Ŭ������ �޸𸮿� ����
		 * 
		 */
		
		
	}
	
	/*
	 * ���ο� method1() �Լ� �����
	 * -> this, super ���� �̸��� ��� -> Ŭ���� �ȿ� �ִ� �Լ����� ��� ����
	 * 
	 */
	public void method1() {
		System.out.println("���� ���� method1() �޼ҵ尡 ���� �˴ϴ�.");
		/*
		 * Object Ŭ�������� �������� toString() �Լ��� �����ؼ�
		 * return ���� �������� ��ɹ�
		 * -> ������ ���ڿ��� ��ȯ���ִ� �Լ�
		 * 
		 */
		String str = this.toString();
		// Object Ŭ�������� �������� toString() �Լ��� ��ɹ��� �״�� ���
		System.out.println("toString() �Լ��� ��ȯ�� ���ڿ���" + str); 
	}
	
	/*
	 * �л� ��ü�� ���� �ִ� ��� �����͵��� �ϳ��� ���ڿ��� ��ȯ�ϴ� �Լ�
	 * public String toString() { }
	 */
	
	public String toString() {
		
		String result = "";
		
		result = this.readName() + "," + this.readAge() + "," + this.readHeight()
					+ "," + this.readWeight();
		
		return result;
		
		
	}
	
}

public class TestStudentClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� StudentClass(�л� Ŭ����)�� ����ϱ� ���� ���� ����
		// new �����ڿ� ���� �޸𸮿� ���� ��������� StudentClass Ŭ������ 
		// �ּҸ� �����ϱ� ���� ����
		StudentClass student1 = null;
		
		// StudentClass Ŭ������ �޸𸮿� ����
		// -> �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ����
		// -> public StudentClass() {
		// 			super();
		// 		}
		// -> �⺻ ������ �ȿ� �ִ� super() ��ɹ��� ����ǰ�
		// -> Object Ŭ������ ���� �ִ� �⺻ �����ڰ� �����
		// -> Object Ŭ������ ����
		// -> StudentClass Ŭ������ �⺻ �����ڷ� ���ƿͼ� 
		// -> StudentClass Ŭ������ �޸𸮿� ����
		student1 = new StudentClass();
		// new Ŭ�����̸�(); -> �Ұ�ȣ �ȿ� �����Ͱ� ������ �⺻ �����ڰ� ����
		
		// �޸𸮿� ������� StudentClass Ŭ������ ���� �ִ� Object Ŭ�����κ���
		// ��� ���� hashCode() �Լ��� ����ؼ� �ڽ� Ŭ������ �޸� �ּҸ�
		// �� �� ����
		
		System.out.println("�ڽ� Ŭ������ �ּҴ� " + student1.hashCode());
		
		/*
		 * super ��ɾ�� Object Ŭ����(�θ� Ŭ����)�� �޸� �ּҸ� �����ϰ� �ִ� ����
		 * -> super = new Object();
		 * -> super.�Լ��̸�() -> Object Ŭ����(�θ� Ŭ����)�� �Լ�
		 * -> �����Ϸ��� �ڽ� Ŭ���� �ȿ� �θ� Ŭ�������� ���� ���� ����
		 * -> �θ� Ŭ������ �޸𸮿� ��������� �޸��� �ּҸ� super ������ ����
		 * 
		 * this ���� : ���� Ŭ������ �޸� �ּҸ� �����ϴ� ���� 
		 * -> this = new ���� Ŭ�����̸�();
		 * -> this = new StudentClass();
		 * -> this : ���� ������ �ڵ�(�����Ϸ��� �˾Ƽ� ����)
		 * -> new StudentClass() -> �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ȣ�� 
		 * 
		 * super ������ ���� ����
		 * �� ������ this ������ ���� -> �����Ϸ��� �θ�� �ڽ� ���踦 �ξ��ֱ� ����
		 * Ŭ������ �߰����ִ� ����
		 * 
		 * super : �θ� Ŭ������ �޸� �ּ� ���� ���� -> �����Ϸ��� �������ִ� �ڵ� ����
		 * this : �ڽ� Ŭ������ �޸� �ּ� ���� ����  -> �����Ϸ��� �������ִ� �ڵ� ����
		 * 
		 */
		student1.method1();
		
		// println() �Լ��� ������ ���� read~�Լ��� �Բ� ����ؼ� �л��� �̸��� ȭ�鿡 ����ϱ�
		
		System.out.println(student1.readAge());
		System.out.println(student1.readHeight());
		System.out.println(student1.readName());
		System.out.println(student1.readWeight());
		
		// �������� toString() �Լ� ����غ���
		
		String str_result = student1.toString();
		System.out.println(str_result);
		
		// ������ toString() �Լ��� �����͸� split(",")�� ������ �迭�� ����
		String [] result_array = str_result.split(",");
		
		// �迭 Ȯ��
		/*
		 * �迭�� ��ü�� ó�� -> �����Ϸ��� �ڵ� ������ length�� �߰����ݴϴ�.
		 * �� ������ ������ �־���  -> �̸�. ����. 
		 */
		if(result_array.length > 0) {
			
			if(result_array.length == 4) {
				
				System.out.println("�л��� �̸��� " + result_array[0]);
				System.out.println("�л��� ���̴� " + result_array[1]);
				System.out.println("�л��� Ű�� " + result_array[2]);
				System.out.println("�л��� �����Դ� " + result_array[3]); 
		
			}
		
		}
		 
		

	}

}
