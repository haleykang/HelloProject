package march23;
/*
 * ������ ���� ���� �����
 * 
 * 1. �������� �����ؼ� ���ο� Ŭ���� �����
 * 
 * 2. �������� �������� ���� ���ο� Ŭ���� �����
 */
/*
 * ��� Ŭ�������� ����� �� �ִ� �θ� Ŭ���� �����
 * 
 * 1. class Ŭ�����̸� {} // �θ� �ڰ��� �ִ� Ŭ����
 * 2. final class Ŭ�����̸� {} // �θ� �ڰ��� ���� Ŭ���� 
 * 		-> final : ������ �Ǵ� ����(�ڽ��� Ŭ���� ��ġ�� ���� �Ʒ� �ְ� ����)
 * 
 * ��) final class Ŭ�����̸� {}
 * 		class Ŭ�����̸�2 extends final_Ŭ�����̸�{} // ����
 */
// ��� ��ǰ ��ü���� ���������� ����� �� �ִ� �θ� Ŭ���� �����
class ProductBaseClass {
	// ��ǰ�� �̸��� ������ �� �ִ� ���� ����
	protected String name;
	// ��ǰ�� ������ ������ �� �ִ� ���� ����
	protected int price;

}

// ������ ���� �θ� Ŭ������ ��� �޴� ���ο� �ڽ� Ŭ���� ����� : �ð� ��ü�� ���
class Watch1Class extends ProductBaseClass {
	// String name;
	// int price;
	
}

// ������ ���� �θ� Ŭ������ ��� �޴� ���ο� �ڽ� Ŭ���� ����� : ���� ��ü ���
class Bag1Class extends ProductBaseClass {
	// String name;
	// int price;
}

//������ ���� �θ� Ŭ������ ��� �޴� ���ο� �ڽ� Ŭ���� ����� : ��ǻ�� ��ü ���
class Computer1Class extends ProductBaseClass {
	// String name;
	// int price;
	
}

// ������ ������ ������ �Һ��� Ŭ���� �����
class PolyConsumerClass {
	// ��� ��ǰ�� ����� �� �ִ� ������ �޼ҵ� �����
	// -> �Ű� ������ ����Ǵ� ������ Ŭ������ ProductBaseClass Ŭ������ �Ǿ�� ��
	// -> ��� ��ǰ�� Ŭ������ �θ� Ŭ����
	public void buy_product(ProductBaseClass ref_product_ob){
		//  instanceof �����ڸ� ����� �޸𸮿� ������ �� �ִ� ��ü�� Ŭ������ �Ǵ�(����)
		if(ref_product_ob instanceof Watch1Class) {
			// �Һ��ڰ� �ð踦 ������ ��쿡 ����Ǵ� ��ɹ����� �ۼ�
			System.out.println("�ð踦 �����ϼ̽��ϴ�.");
		}
		else if(ref_product_ob instanceof Bag1Class) {
			// �Һ��ڰ� ������ �����ϴ� ��쿡 ����Ǵ� ��ɹ���
			System.out.println("������ �����ϼ̽��ϴ�.");
		}
		else if(ref_product_ob instanceof Computer1Class) {
			// �Һ��ڰ� ��ǻ�͸� �����ϴ� ��� ����Ǵ� ��ɹ���
			System.out.println("��ǻ�͸� �����ϼ̽��ϴ�.");
		}
		else {
			// ���� ���θ����� ��޵��� �ʴ� ��ǰ ó��
			System.out.println("���� ��ϵ��� �ʴ� ��ǰ�Դϴ�.");
		}
	}
	
	
}
// ������ ������ �������� ���� �Һ��� Ŭ���� �����
class ConsumerClass {
	
	/*
	 * ��ǰ ���� ���� �޼ҵ带 ����ϴ�.
	 * 
	 * 1. �Һ��ڰ� �ð���ǰ�� ������ ��쿡�� ����Ǵ� �޼ҵ� �����
	 * -> public void buy_product (Watch1Class ����) { }
	 * 
	 * 2. �Һ��ڰ� ���� ������ ��� ���� �޼ҵ�
	 * -> public void buy_product ( Bag1Class ���� ����) { }
	 * 
	 * 3. �Һ��ڰ� ��ǻ�� ������ ��� ���� �޼ҵ�
	 * -> public void buy_product(Computer1Class ���� ����) { }
	 */
	public void buy_product (Watch1Class ref_watch_product) {
		
		System.out.println("�Һ��ڰ� �ð踦 �����߽��ϴ�.");
	}
	
	public void buy_product (Bag1Class ref_bag_product) {
		System.out.println("�Һ��ڰ� ������ �����߽��ϴ�.");
		
	}
	
	public void buy_product (Computer1Class ref_computer_product) {
		System.out.println("�Һ��ڰ� ��ǻ�͸� �����߽��ϴ�.");
	
	}
	
	// �Լ� �̸��� ���� -> �Լ� �̸� �ߺ�(Function Name Overloading) ��ü ���� ���� ���
	/*
	 * -> ���� ������� �ϴ� �Լ��� ����� ���� ����ϰ� �ִ� �Լ��� ������ ��쿡 ���
	 * -> �Լ� �̸��� ������ �� �־ �ٸ� �κп� �ð��� �� �Ҿ��� �� ����
	 * 
	 * 		-> �Ű� ������ ���� �κ�(�ٸ� �Լ����� ���� �����)
	 * 		-> �Լ��� ��ȯ�� �κ�(�Լ� �̸� �ߺ��� ����ؼ� ����) 
	 * 		-> ��ɹ��� ���Ӱ� �����ؼ� �ۼ��ϸ� ��
	 * 			-> ��ɹ� : �˰��� �ۼ��� �ð��� �� ���� �� �ִ� ����
	 * 
	 *  ��) ���� ����ϰ� �ִ� �޼ҵ��� ����(�Լ��� �Ӹ� �κ�)
	 *  public void buy_product ( �ð�Ŭ���� ���������̸�) {}
	 *  public void buy_product ( �ð�Ŭ���� ���������̸�) {} // �ߺ�
	 *  
	 *  public void buy_product ( �ð�Ŭ���� ���������̸�, ���� ���� �߰�) {} // �̷��Դ� ��� ����
	 * public void buy_product ( �ð�Ŭ���� ���������̸�, int dummy) {}
	 * 		int dummy_variable : ���� ���� , ����� ���� �ְ� ������� ���� ���� �ִ� -> ���� �� �� �ִ� ����
	 * 		int temp_variable : �ӽ� ���� 
	 *  
	 *  
	 */
	
}


public class TestPolyClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Watch1Class Ŭ������ �޸𸮿� �����
		
		Watch1Class watch_ref = null;
		watch_ref = new Watch1Class();
		
		// 2. Bag1Class Ŭ���� �����
		
		Bag1Class bag_ref = null;
		bag_ref = new Bag1Class();
		
		// 3. Computer1Class �޸𸮿� �����
		Computer1Class computer_ref = null;
		computer_ref = new Computer1Class();
		
		/*
		 * �ݺ� ������ ����ؼ� ���� �Һ��ڰ� ���� ���迡�� �����ϴ� ��ó�� 
		 * -> while( true ) �Ǵ� thile(���� �����̸� == true)
		 */
		
		// 5. �Һ��� ��ü�� �޸𸮿� �����ϰ� �޸𸮿� ������� ��ü�� �ּҸ� ������ ����
		
		PolyConsumerClass consumer_ref = new PolyConsumerClass();
		
		// 6. ��(.) �����ڸ� ����ؼ� �޸𸮿� ������� buy_product() �Լ� ����
		consumer_ref.buy_product(watch_ref);
		
		// �Һ��ڰ� ������ ������ ���
		consumer_ref.buy_product(bag_ref);
		
		// �Һ��ڰ� ��ǻ�͸� ������ ���
		consumer_ref.buy_product(computer_ref);
		
		// �������� �������� ���� �Һ��� Ŭ������ ����ؼ� �޸𸮿� ��ü�� �����
		// �޸𸮿� ������� ��ü�� �ּҸ� ������ ������ �����ϱ�
		ConsumerClass consumer_ref2 = new ConsumerClass();
		
		// ������ ������ �������� ���� Ŭ������ �̿��� buy_product �Լ� ����
		consumer_ref2.buy_product(watch_ref);
		consumer_ref2.buy_product(bag_ref);
		consumer_ref2.buy_product(computer_ref);
		
		//buy_product() �޼ҵ带 �����ϴ� ������ new Watch1Class ��ɾ �ۼ��ؼ�
		// �ӽ� ��ü(��ȸ�� ��ü)�� �޸𸮿� ���� ������ buy_product() �Լ��� �����ϴ� ����� ����
		consumer_ref2.buy_product(new Watch1Class());
		

	}

}
