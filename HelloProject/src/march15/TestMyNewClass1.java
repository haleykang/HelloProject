package march15;

// ���ο� Ŭ������ �� ����� 

class MyNewClass2 {
	
	// 1���� �迭 ���� ��ɹ� �ۼ�
	// -> ���߿� ��������� �迭�� ���� �ּҸ� �����ϴ� ����(���� ����)
	int [ ] iarray; // int [] iarray = null;
	// String �̸�; 
	// Ŭ�����̸� �̸�;
	// int a; // ���� ������ ���� -> ���� ���� ����
	// int [] iarray ; // ���� ������ ���� -> �����Ϸ��� �ڵ����� 0�� ä����
	// �迭�� ��ü�� ó���ϱ� ���� 
	
	// �迭 ���� + �޸� ������ �Բ� �ϴ� ��ɹ�
	int [ ] iarray2 = new int [ 5 ];
	//  �޸��� 5���� ������ ������ ���� + �����Ϸ��� 0���� ��� ���� ä����
	// + �迭�� �ּҸ� iarray2 ������ �����ϰ� ����!
	
	int a ; // int a = 0;
	
	int iarray3 [ ] = null;
	
	{
		/*
		 * ���� ���� -> �ʱ�ȭ �� -> ���� ���� ������ ���� ���� ����
		 * ���� ���� �����ڿ��� ���� �и���� �߶󳻱� �ؼ� ���� �ۼ�
		 */
		System.out.println("������ �Լ����� ���� ����Ǵ� ��ɹ�");
		
		/*
		 * ������ �Լ��� ���� ���� ���
		 * public Ŭ�����̸�() {
		 * 		��ɹ�1;
		 * }
		 * public Ŭ�����̸� (�Է� ���� ����) {
		 * 		��ɹ�2;
		 * }
		 * 
		 *  -> ��ɹ� 1, 2���� �ߺ��Ǵ� ��ɹ��� { } �� ������ �ۼ�
		 *  ��ɹ��� �ѹ��� �ۼ��ϸ� ����Ǵ� ����
		 *  
		 *  System.out.println("�޽����� ���");
		 *  
		 *  = ��ȣ�� ����ϴ� �κ��� ������ ������ �ȿ��� �ۼ�
		 *  
		 *  int iarray [ ]  = new int [ 5 ];
		 *  
		 *  iarray[0] = 0;
		 *  iarray[1] = 0;
		 *  iarray[2] = 0;
		 *  iarray[3] = 0;
		 *  iarray[4] = 0;
		 *  
		 *  for ( int i = 0; i<5 ; ++i)
		 *  iarray[i] = i+1;
		 *  
		 */
		
		iarray = new int [ 100 ];
		iarray3 = new int [ 50 ];
		
		for(int i = 0; i < iarray.length; ++i) {
			iarray[i] = i+1;
			System.out.println("�迭 iarray["+i+"] ��ġ�� ����� ������ " +
				iarray[i]);
			/*
			 * �迭�� ����� ������ �����Ϸ��� �迭�̸�[��ġ ��ȣ]
			 * ��ġ ��ȣ�� ������ 0 ~ �迭�̸�.length -1 ����
			 * ��ġ ��ȣ�� Ʋ���� ���ܻ�Ȱ �߻�!
			 */
		}
		/*
		 * �迭�̸�.length : �ڵ� ���� : �����Ϸ��� ������ִ� ����
		 * -> �迭�� ũ�⸦ ���� �ִ� ����
		 */
		
	}
	
	public void method1() {
		
		int a; // ���� ���� - �����Ϸ��� 0�� �������� ����! ��������
		int a2 = 0; // ���������� ����ϱ� ���� �� ���� �����ϴ� ����!
		a = 0;
		System.out.println("���� a�� ���� �����Դϴ�.");
	}
	
}


// ���ο� Ŭ������ �� �����
// public class ���ο�Ŭ�����̸� {} -> ����

class MyNewClass1 {
	
	// ��� �̸� ���� ���� ����� �ʱ�ȭ (���� �̸��� ����)
	String name = "ȫ�浿";
	String name2; // �����Ϸ��� �ڵ����� null ���� ����
	// String name2 = null; -> ���� ����  -> �����Ϸ��� ������ ���� å���� ��
	// ���� ���� : �����ڰ� å���� ������ -> ������ ����ϱ� ���� ���� ����
	// -> ���� ��Ȳ �߻� ���� -> NullPointerException
	String name3 = "";  // �� ���ڿ� -> ���ڿ�(������)�� ���� ���� ǥ�� 
	
	/*
	 * ������ �Լ��� ���� �� ���� �� �ֽ��ϴ� -> �Լ� �ߺ�(�Լ� �̸� �ߺ� :
	 * Function Overloading �Ǵ� Function Name Overloading) -> �Լ� �̸� ����
	 * -> �Լ��̸� + �Է� �������� ���ļ� Ű(Key)�� ó��
	 * -> �Լ��̸� ( int a ) { }
	 * -> �Լ��̸� ( int b ) { } // ���� -> �Ű�����(parameter : �ٸ� ���� ����)
	 * -> �Լ��̸�( char a ) { } // ����
	 * -> �Լ��̸� ( double a ) { } // ����
	 * -> �Լ��̸� ( String a ) { } // ����
	 * -> �Լ��̸� ( float a ) { } // ����
	 * 
	 * -> �̸� ���� �ڷ����� �� �߿� 
	 */
	
	
	// ù��° ������ �Լ� �����
	public MyNewClass1() {
		// �ٸ� �Լ��κ��� ���� ���� �ʴ� ������
		
		// this. ����(�������� ����)
		this.name = "������";
		this.name2 = "������";
		this.name3 = "������";
		
	/*	System.out.println("���� name�� ���� " + this.name);
		System.out.println("���� name2�� ���� " + this.name2);
		System.out.println("���� name3�� ���� " + this.name3);
		*/
		
		this.println(); // this.�Լ�() -> ���� Ŭ�������� ����(this.) println() �Լ��� ���ڴ�!
	}
	
	// �ι�° ������ �Լ� �����
	public MyNewClass1(String name_value) {
		// �ٸ� �Լ��κ��� ���ڿ� ���� �޴� ������
		// main() �Լ��κ��� ���ο� �̸��� ���� name_value�� �޾ƿ�
		// this.�����̸�(���� ���� : Ŭ�������� ������ ���� �̸�)
		// = name_value(���� ���� : ������ �Լ����� ������ ����)
		this.name = name_value;
		this.name2 = name_value;
		this.name3 = name_value;
		
		this.println();
		
/*		System.out.println("���� name�� ���� " + this.name);
		System.out.println("���� name2�� ���� " + this.name2);
		System.out.println("���� name3�� ���� " + this.name3);	
		*/
		
	}
	// ������ 3���� �������� ���� �ִ� �̸��� ȭ�鿡 ����ϴ� ���ο� �Լ�
	
	public void println() {
		
	System.out.println("���� name�� ���� " + this.name);
	System.out.println("���� name2�� ���� " + this.name2);
	System.out.println("���� name3�� ���� " + this.name3);
	
	}
	// 3��° ������ �Լ� �����
	
	public MyNewClass1(String name1_value, String name2_value) {
		
		System.out.println("2���� �̸��� �޾ƿ��� ������ �Լ�");
		System.out.println("�޾ƿ� �̸����� ���� ������ ����");
		this.name = name1_value;
		this.name2 = name2_value;
		this.name3 = "������";
		
		this.println();
		
	}
	
	// 4��° ������ �Լ� �����
	public MyNewClass1(String name1_value, String name2_value, String name3_value) {
		
		System.out.println("3���� �̸��� �޾ƿ��� ������ �Լ�");
		System.out.println("�޾ƿ� �̸����� ���� ������ ����");
		this.name = name1_value;
		this.name2 = name2_value;
		this.name3 = name3_value;
		
		this.println();
		
	}
	
	// 5��° ������ �Լ� �����
	public MyNewClass1(String [] str_array) {
		
		System.out.println("�迭�� �޾ƿ��� ������ �Լ�");
		 if(str_array.length == 3) {
			 System.out.println("���� 3���� �̸��� ���");
			 // �迭�� ù��° �̸��� ���� ������ name�� ����
			 this.name = str_array[0];
			 // �迭�� �ι�° �̸��� ���� ������ name2�� ����
			 this.name2 = str_array[1];
			 // �迭�� ����° �̸��� ���� ������ name3�� ����
			 this.name3 = str_array[2];
			 
			this.println();
		 }
		 else {
			 System.out.println("�迭�� ������� ����");
		 }
	
	}
	
	
}

// �ٸ� Ŭ������ ����ϴ� Ŭ����(���� Ŭ����)
public class TestMyNewClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***main() �Լ��� ���۵Ǿ����ϴ�!!***");	
		
		// ��ɹ��� �ۼ��ϴ� ��ġ
		// ������ ���� ������ �Լ����� �ڵ� �����ϱ� ���� ��ɹ��� �ۼ�
		// new Ŭ�����̸�() -> �⺻ �����ڸ� ȣ��
		// new Ŭ�����̸�( �� ��� ) -> �� ��Ͽ� �´� ������ �Լ��� ȣ��
		new MyNewClass1(); 
		// �� �޸� ���� -> ��ȸ�� ��ü�� �޸𸮿� ����
		// �Ʒ� ��ġ������ ����� �� ���� �޸� -> �ּҸ� �������� �ʾұ� ����
		// -> �ٽô� ��� �� �� ���� ��ü(�̾� ��ü)
		
		
		// Ŭ���� �̸� �����̸� = new Ŭ�����̸�();
		// -> ������ �޸��� �ּҸ� ���� -> �ٸ� ��ɹ����� ����� �� �ִ� ��ü ����
		// -> ��ü�� ���� -> Ŭ������ ����(Ŭ������ ���� �ִ� ���� / �Լ�)
		// -> non-static ��� ����/�Լ���
		
		// static ��� ���� / �Լ����� Ŭ�����̸�.�̸� ���� ��� ���� 
		// ��� -> static final �ڷ��� ����̸� = ������;
		
		new MyNewClass1("���ο� �̸�");
		
		String [] str_array = {"������", "������", "������"};
		
		// �迭�� �޴� �����ڸ� ����
		new MyNewClass1(str_array);
		
		// 3���� �̸��� �޴� �����ڸ� ����
		new MyNewClass1("������","������","������");
		
		// 2���� �̸��� �޴� �����ڸ� ����
		
		new MyNewClass1("��浿", "���浿");
		
		
		
		
		System.out.println("***main() �Լ��� ����Ǿ����ϴ�!!***");

	} // �ݴ� �߰�ȣ ��ȣ�� ������ ���α׷� ��ü�� ����
	// �Ǵ� return ��ɹ��� ������ ���α׷� ��ü�� ����

}
