package march22;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 * ������ ���� ���� �����
 * 
 */
// ��� ��ǰ���� ���� �ִ� ����� �Ӽ��� �ൿ���� �����س� �θ� Ŭ���� �����
class ProductBaseClass {
	// ��ǰ �̸��� ������ �� �ִ� ���� ����
	protected String name; // m_(���λ�) : member ��) m_name;
	// m_name -> �Լ����� ����� ���� ���� �̸��� �浹�Ǵ� �κ��� �ּ�ȭ
	// ���� ���� -> �ӽ� ���� -> �ش� �Լ��� ����� ���ȸ� ��� ����
	// ��ǰ ������ ������ �� �ִ� ���� ����
	protected int price;
}
// �ð� Ŭ���� ����� : ������ ���� ProductBaseClass Ŭ������ �θ� Ŭ������ ����
// class WatchClass(�ڽ� Ŭ�����̸�) extends �θ� Ŭ���� �̸�

class WatchClass extends ProductBaseClass {
	// �θ� Ŭ������ �ִ� name, price ������ ��ӵ� - > �ٷ� ��� ����
	/*
	 * 1. ���� ��ɹ� : �ڷ��� �Ǵ� Ŭ�����̸� + �����̸�/�迭�̸�/����̸� ;
	 * 2. ��� ��ɹ� : �ڷ����� ���� �̸��� �ۼ� 
	 * ��) a (���) // �޸� ���(����)
	 */
	// �� ��ġ���� ������ ����
	// int a; // ���� (ok)
	// �����̸��� �ٷ� ���� ��쿡�� ����
	// ��ӹ��� ���� �̸� name �Ǵ� price�� ���� ����ϴ� ���
	// name �Ǵ� price = ��; // ���� 
	// ����� �߰�ȣ { } �� �ȿ� �ְų� ������ �Լ� �Ǵ� �Ϲ� �Լ��ȿ� �־����!
	
	// �߰�ȣ �� 
	{
		
		// ��� ���� ���� name�� ���
		name = "�ð�1";
		// ��ӹ��� ���� price�� ���
		price = 5000;
		
		// �Լ� ���๮ �ۼ� ����
		System.out.println("��� ���� ���� name�� ������ ���� " + name);
		System.out.println("��� ���� ���� price�� ������ ���� " + price);
		
		// �ݺ����� �ۼ� ����
		// -> �迭�� �ʱ�ȭ ��ɹ� �ۼ� ����
		
		// if ���� �ۼ� ���� 
		
		// ������ �Լ��� �������� ��쿡 �ߺ��� ��ɹ��� ���� �ۼ��ؼ�
		// ��� ������ �Լ����� ���� ��� (���� �Ǵ� ����)
		
		
	}
	
	// ������ �Լ� 
	public WatchClass() {
		
		System.out.println("������ �Լ��� ���� �Ǿ����ϴ�[WatchClass] ");
		
	}
	// �Ϲ� �Լ� 
	public void use_method() {
		System.out.println("���� �߰��� use_method() �Լ��� ���� �Ǿ����ϴ�[WatchClass]");
		
	}
	
	// �߰�ȣ �� -> ������ �Լ� -> �Ϲ� �Լ� ������ ���� (��ġ�� �߿����� ����)
	
}

// ���� Ŭ���� �����
class BagClass extends ProductBaseClass {
	
	{
		name = "����Ʈ��";
		price = 1300000;
		
		System.out.println("���� �Ͻ� ��ǰ�� " + name + "�Դϴ�.");
		System.out.println("������ " + price + "�� �Դϴ�.");
	}
	
	public BagClass() {
		
		System.out.println("������ �Լ��� ���� �Ǿ����ϴ�[BagClass]");
	}
	
	public void use_method() {
		
		System.out.println("���� �߰��� use_method() �Լ��� ���� �Ǿ����ϴ�[BagClass]");
	}
	
}

// ��ǻ�� Ŭ���� �����
class ComputerClass extends ProductBaseClass {
	
	{
		name = "�ƺ�";
		price = 2500000;
		
	}
	
	public ComputerClass() {
		System.out.println("���� �Ͻ� ��ǰ�� " + name + "�Դϴ�.");
		System.out.println("������ " + price + "�� �Դϴ�.");
	}
	
	public void use_method() {
		
		System.out.println("���Ͻô� ���� ����� �������ּ���. ");
	}
	
}

public class TestProductClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� WatchClass Ŭ������ ����ؼ� ��ü�� �ּҸ� �����ϴ� ������
		// ���� ����
		WatchClass ref_watch_ob = null;
		BagClass ref_bag_ob = null;
		ComputerClass ref_computer_ob = null;
		
		ref_computer_ob = new ComputerClass();
		ref_computer_ob.use_method();
		
		
		System.out.println("********************************");
		
		ref_bag_ob = new BagClass();
		ref_bag_ob.use_method();
		
		System.out.println("********************************");
		
		// new �����ڸ� ����ؼ� �޸𸮿� WatchClass ����
		// ������ ���� �θ� Ŭ������ �޸𸮿� ���� -> super() ��ɹ��� ����
		// -> �� ������ �ڽ� Ŭ������ WatchClass�� �޸𸮿� ����
		// public WatchClass() {
		// super(); // �����Ϸ��� ���ؼ� ������ ���ԵǴ� ��ɹ�
		// 	// �θ� Ŭ������ �ִ� �⺻ ������ �Լ��� �����ϴ� ��ɹ�
		// // ���� ������ �ʴ� ��ɹ�
		// }
		
		ref_watch_ob = new WatchClass();
		
		// WatchClass Ŭ������ ���� �߰��� use_method() �Լ��� ����
		// WatchClass�� �޸� �ּҸ� ���� �ִ� ������ ������ ref_watch_ob��
		// ����ؾ� �޸𸮿� ���� ���� -> �������̸�.use_method();
		ref_watch_ob.use_method();
		
		
		

	}

}
