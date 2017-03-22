package march21;
/*
 * ���θ����� ����ϴ� ���� ���� �Լ�(�޼ҵ�) �����
 */
// ���θ����� ����ϴ� ������ ���� ���� Ŭ���� �����

class ShoesClass {
	// �Ź� �̸��� �����ϴ� ���� ����
	private String name;
	// �Ź� ������ �����ϴ� ���� ����
	private int price;
	// ������ �Լ��� ���� ������ ������ ���� ������ Ư�� ���� �����ϱ�
	// �⺻ ������ �Լ� ���� �����
	public ShoesClass() {
		// this() : ��ɹ��� �ۼ��ؼ� �Ʒ��� �ִ� ������ �Լ��� ����
		this("",0);
		
	}
	// �ٸ� �޼ҵ�κ��� �Ź� �̸��� ������ �޴� ������ �Լ�
	public ShoesClass(String name_value, int price_value) {
		// ���� ��ɹ��� �ۼ��ؼ� �ٸ� �޼ҵ�κ��� ���� �Ź� �̸��� ������
		// ������ ������ ���� ������ name�� price�� ����
		this.name = name_value;
		this.price = price_value;
	}
	// �Һ��ڰ� ������ �Ź� �̸��� ������ ȭ�鿡 ����ϴ� �Լ�
	public void show() {
		// System.out.println("�Һ��ڰ� ������ �Ź� ������ ���");
		System.out.println("�Ź� �̸��� " + this.name);
		System.out.println("�Ź� ������ " + this.price);
	}
}

class BagClass {
	// ���� �̸��� �����ϴ� ���� ����
	private String name;
	// ���� ������ �����ϴ� ���� ����
	private int price;
	// ������ �Լ��� ���� ������ ������ ���� ������ Ư�� ���� �����ϱ�
	// �⺻ ������ �Լ� ���� �����
	public BagClass() {
		
		this("",0);
	}
	// �ٸ� �޼ҵ�κ��� ���� �̸��� ������ �޴� ������ �Լ�
	public BagClass(String name_value, int price_value) {
		
		this.name = name_value;
		this.price = price_value;
	}
	public void show() {
		System.out.println("���� �̸��� " + this.name);
		System.out.println("���� ������ " + this.price);
	}
	
	
}

class WatchClass {
	
}

class ComputerClass {
	
}


public class TestShopClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� ShoesClass Ŭ������ ����ϱ� 
		// �Һ��ڰ� 3���� �Ź��� ������ ���
		
		ShoesClass ref_shoes1_ob = new ShoesClass("�Ź�1", 30000);
		ShoesClass ref_shoes2_ob = new ShoesClass("�Ź�2", 40000);
		ShoesClass ref_shoes3_ob = new ShoesClass("�Ź�3", 20000);
		
		BagClass ref_bag1 = new BagClass("����1", 200000);
		BagClass ref_bag2 = new BagClass("����2", 100000);
		BagClass ref_bag3 = new BagClass("����3", 150000);
		
		// �Һ��ڰ� ������ �Ź� ����� ȭ�鿡 ���
		System.out.println("***�Һ��ڰ� ������ �Ź� ��� ���***");
		ref_shoes1_ob.show();
		ref_shoes2_ob.show();
		ref_shoes3_ob.show();
		
		System.out.println("***�Һ��ڰ� ������ ���� ��� ���***");
		ref_bag1.show();
		ref_bag2.show();
		ref_bag3.show();
		
		System.out.println("��� ������ ���ƽ��ϴ�.");
		System.out.println("�ȳ������ʽÿ�");

	}

}
