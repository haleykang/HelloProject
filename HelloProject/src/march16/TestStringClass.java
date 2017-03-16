package march16;


/*
 * ���� ���� ���ڿ� �����͵��� �迭�� �����ϰ� ����ϴ� ���� �ۼ�
 */

public class TestStringClass {
	
	/*
	 * ���� ���� ���ڿ��� ���� �� �� �ִ� ���ڿ� �迭 ����
	 */
	String [] str_array1 = null;
	/*
	 * ������ ������ �迭�� ����ϴ� ������ �Լ� �����
	 */
	// �⺻ ������ �Լ� -> �����Ϸ��� ���ؼ� �ڵ����� ��������� �Լ�
	public TestStringClass() {
		
		this(5);  // ������ �Լ� �� ������ �Է¹޴� �Լ��� ����, ���� ���� 5�� ��
		/*
		 * this + ��(.) + ���� �Ǵ� �迭 �Ǵ� �Լ��̸�
		 */
		/*
		 * this + �Ұ�ȣ ������ : ������ �Լ��� �����ϴ� ��ɹ� 
		 * this(); // �ڽ��� ������ �Լ��� ���� -> ���� ��Ȳ�� ���� 
		 * -> �ڽ��� ������ �Լ����� �ٽ� �ڽ��� ȣ�� (��� ȣ�� ��� recursive call)
		 * 		-> if���� ����ؼ� ����(�ڽ��� �Լ��� Ż���ϱ�) �κ��� �ۼ��ؾ� ��
		 * 			-> if (����) return;
		 * 
		 * ��) int add(int a, int b) {
		 * 		add(10,20) ; // ������ǥ ����� -> ���������� ���ϴ� ����
		 * 		if(����) return;
		 * }
		 */
		
	}
	
	// �����ڰ� ���� ���� ������ �Լ�
	public TestStringClass(int size) {
		System.out.println("this(5) ��ɹ��� ���ؼ��� ����Ǵ� ������ �Լ�");
		System.out.println("�⺻ �����ڿ��� ȣ���Ͽ����ϴ�.");
		System.out.println("���� size�� ���� ���� " + size ); // this(5) -> 5
		// main() �Լ����� new TestStringClass(10) -> ���� size�� 10�� ����
		// ������ ������ �迭�� �޸𸮿� ����� -> �迭�� ũ��� ���� size�� ���� ������ ����ϱ�
		this.str_array1 = new String[size];
		System.out.println("�ڵ����� ��������� ���� length ���� ���");
		System.out.println("�迭 str_array1�� ũ��� " + this.str_array1.length);
		
		// ���⼭�� ���� ������ �迭�� Ư�� ���� ����Ǿ� ���� ����
		// str_array1[0] = null;
		// str_array1[1] = null;
		// str_array1[2] = null;
	
		
		for(int i = 0; i < this.str_array1.length; ++i) {
			
			this.str_array1[i] = ""+(i+1); // ���� �迭 ��ġ�� 1->2->3->4->5�� ����
			// str_array1[0] = "0 + 1"; -> 1
			// str_array1[1] = "1 + 1"; -> 2
			// str_array1[2] = "2 + 1"; -> 3
			
			System.out.println("�迭 str_array1["+i+"] ��ġ�� ����� ���ڿ���" +
					this.str_array1[i]);
			
		}
			
	}
	public TestStringClass(String [] args) {
		
		
	}
	
	/*
	 * 2���� �̸��� ���ϴ� �Լ�
	 * 
	 * ������ ���� ��ȯ
	 * �ٸ��� ������ ��ȯ -> ��ȯ���� �� �ڷ���
	 * 
	 */
	
	public static boolean compare(String first_name, String second_name) {
		// 2���� �̸� �� ����� ������ ���� ����
		boolean result;
		
		if(first_name.equals(second_name) == true) {
		 result = true;
		} else {
		result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result2 = compare("������", "������");
		
		String test_name = " ������ ";
		
		System.out.println(test_name.trim());
		
	
		if(result2 == true) {
			System.out.println("������ �̸��� ������ �̸��� �����ϴ�.");
		} else {
			System.out.println("������ �̸��� ������ �̸��� �ٸ��ϴ�.");
		}
		
		result2 = compare("������", "������");
		if(result2 == true) {
			System.out.println("������ �̸��� ������ �̸��� �����ϴ�.");
		} else {
			System.out.println("������ �̸��� ������ �̸��� �ٸ��ϴ�.");
		}
		
		
		// "��浿"�� "�ٱ浿"�� �̸��� �������� equals() �Լ��� ����ؼ� ��
		boolean result = "��浿".equals("�ٱ浿");
		
		if(result == true) {
			System.out.println("��浿�� �ٱ浿�� ���� �̸�");
		} else {
			System.out.println("��浿�� �ٱ浿�� �ٸ� �̸�");
		}
		
		String first_name = "��浿";
		String sec_name = "���浿";
		
		result = first_name.equals(sec_name);
		
		if(result == true) {
			System.out.println(first_name + " �̸��� " + sec_name + " �̸��� ���� �̸�");
		} else {
			System.out.println(first_name + " �̸��� " + sec_name + " �̸��� �ٸ� �̸�");
			
		}
		// ��� Ŭ�������� ���� �⺻ �����ڸ� �����ϴ� ��ɹ� �ۼ�
		TestStringClass ref_object1 = new TestStringClass();
		
		System.out.println("******************************************");
		
		// ��� Ŭ�������� ���� �迭�� ũ�⸦ �޴� �����ڸ� �����ϴ� ��ɹ�
		TestStringClass ref_object2 = new TestStringClass(3);
		
		System.out.println("******************************************");
		 
		// 5���� ���ڿ��� ������ �� �ִ� String �迭�� Ŭ������ �ִ�
		// ���� �迭�� ����� ���ڿ� "1", "2", "3", "4", "5"�� ������ �迭�� ����
		TestStringClass ref_object3 = new TestStringClass(5);
		
		System.out.println("******************************************");
		
	
		// �ϳ��� ���ڿ����� ������ �� �ִ� ���� ����� �ʱ�ȭ
		String name = "������";
		
		// ���� ���� ���ڿ�(�̸�)���� �����ϴ� ���� ����� �ʱ�ȭ
		String name2 = "������ ������ ȫ����";
		// ���� ���ڸ� ����ؼ� ���� ���� �̸����� �и�(����߸�)
		
		// ù��° ������ name�� ����ؼ� �޸𸮿� ����Ǿ� �ִ� �̸��� �о����
		// ����� ȭ�鿡 �̸��� ����ϱ� ���� ��� �Լ��� println()�� ���
		System.out.println("���ڿ� ���� name�� ���� �ִ� �̸��� " + name);
		
		// ���� name2�� ����ϸ� 3�� ����� �̸� ��ü�� �Ѳ����� �о�ͼ�
		// ȭ�鿡 ���
		System.out.println("���ڿ� ���� name2�� ���� �ִ� �̸����� " + name2);
		
		/*
		 *  String Ŭ������ ���� �ִ� split() �Լ��� ����ϸ�
		 *  ���ڿ� �迭�� ������ �̸����� �ϳ��� �и��ؼ� ������ �� ����!
		 *  -> ����(Extraction)
		 *  
		 *  name2 = "������ ������ ȫ����";
		 *  
		 *  3���� �̸����� ���ڿ� �迭�� �����ϱ� ���� �迭 ����
		 *  
		 *  String [] �迭�̸� = null; 
		 *  String [] �迭�̸� = new String[3]; 
		 *  -> ���� ��� 
		 *  
		 */
		String [] name_array = null;
		name_array = name2.split(" ");
		// String [] name_array = name2.split(" "); 
		// ��ó�� ��൵ ����
		// split("������ ���ڿ�") -> ������ ���ڿ��� ������ ���� name2�� 
		// ���� �ִ� �����ڿ� �����ؾ���! -> Ʋ���� ���ܻ�Ȳ�� �߻�
		// String name2 ="������,������,ȫ����"; -> ��ǥ�� �����ߴٸ� �����ڴ� split(",");
		
		// �迭�� �����ϸ� �޸𸮿� �迭�� ��������� ������ �����Ϸ���
		// �ڵ����� int length ������ ����� �迭�� ũ�⸦ ������ ��
		// 3���� �̸� -> int length = 3;
		
		if (name_array.length == 3) {
			System.out.println("���ڿ� ���� name2���� ������ �̸����� ���");
			
			System.out.println("ù��° �̸��� " + name_array[0]);
			System.out.println("�ι�° �̸��� " + name_array[1]);
			System.out.println("����° �̸��� " + name_array[2]);
			
		}
		
	////////// �Ʒ��� ���� �Ѱ� ////////////////////
		
		for(int i = 0; i < name_array.length; ++i) {
			
			System.out.println(name_array[i]);
			// �̷��� �ϸ� ���� name2 �迭�� ��� �ᵵ �ڵ����� ��µ�
			
		}
		
		

	}

}
