package march16;



/*
 * ���� �˻� �˰����� �޼ҵ�� �����
 * 
 *  1) ���� ������ ����� : �迭 �غ� - int �迭�̸� [];
 *  2) �Ǽ� ������ ����� : �迭 �غ� - double �迭�̸� [];
 *  3) ���ڿ� ������ ����� : �迭 �غ� = String �迭�̸� [];
 */

import java.util.*;

public class TestSeqSearchClass {
	
	// ���� ���� ���� �����͵��� ������ �� �ִ� �迭 ����
	int iarray [];
	
	// ���� ���� �Ǽ� �����͵��� ������ �� �ִ� �迭 ����
	double darray [];
	
	// ���� ���� ���ڿ� �����͵��� ������ �� �ִ� �迭 ����
	String sarray [];
	
	Random random = new Random();
	
	/*
	 * ������ ����� : �⺻ ������ ���� �����
	 */
	
	public TestSeqSearchClass() {

		// this(ù��° �迭�� ũ��, �ι�° �迭�� ũ��, ����° �迭�� ũ��);
		// -> �Ʒ��� �ִ� �ι�° �����ڸ� ����
		
		this(3, 4, 5);
		
	}
	
	/*
	 * �ι�° ������ ����� : main() �Լ��κ��� ������ ������ 3���� �迭
	 * ũ�� ������ �޾ƿ��� ������
	 */
	
	public TestSeqSearchClass(int size1, int size2, int size3) {
	//	System.out.println("3���� �迭 ũ�⸦ �޴� ������ �Լ�");
		// �� ������ �ȿ��� �迭�� �����մϴ�.
		/*
		 * ���� size1�� ù��° �迭�� ũ��� ���
		 */
		this.iarray = new int[size1];
		/*
		 * ���� size2�� �ι��� �迭�� ũ��� ���
		 */
		this.darray = new double[size2];
		/*
		 * ���� size3�� ����° �迭�� ũ��� ���
		 */
		this.sarray = new String[size3];
		
		// �Ϲ� �Լ� ���� ����
		// �Ʒ����� ���� 3���� �Լ����� �����ϱ�
		input_date();
		create_data1();
		create_data2();
		create_data3();
		
		
	}
	
	
	
	/*
	 * iarray �迭�� ���� �����͸� ���� �������ִ� �޼ҵ� �����
	 */
	private void create_data1() {
		System.out.println("******************************************");
		System.out.println("���� ���� ���� �����͸� �����");
		
		/* 
		 * ������ ���� : �迭�̸�.length
		 */
		int size = this.iarray.length;
		
		/*
		 * �ݺ����� ����ؼ� ���� �����͸� size ������ ���� �ִ� ���� ��ŭ 
		 * ������ ���� �Ŀ� iarray �迭�� ���������� ����
		 * ù��° ������ �迭�� ù��° ��ġ��
		 */
		if(size > 0) {
			
			System.out.println(size + "���� ������ ���� ������ �迭�� ����");

			for (int i = 0; i < size ; ++i) {
				
				int value = random.nextInt(100); // 0 ~ 99 �� ���� 
				this.iarray[i] = value;
				System.out.println(i + " ��ġ�� ����� ���� ������ " + this.iarray[i]);
				
			}
		}
	
	}
		
	/*
	 * darray �迭�� �Ǽ� �����͸� ���� �������ִ� �޼ҵ� �����
	 */
	private void create_data2() {
		System.out.println("******************************************");
		System.out.println("���� ���� �Ǽ� �����͸� �����");
		
		
		int size = this.darray.length;
		
		if(size > 0) {
			
			for ( int i = 0 ; i < size; ++i ) {
				
				double value = (Math.random() * 100);
				this.darray[i] = value;
				System.out.print(i);
				System.out.printf(" ��ġ�� ����� �Ǽ��� %.2f%n", value);
		
			}
			
		}
		
	/*	int size = this.darray.length;
		
		if(size > 0) {
			
			for()
		}
		*/
	

	}
	/*
	 * sarray �迭�� ���ڿ� �����͸� ���� �������ִ� �޼ҵ� �����
	 */
	private void create_data3() {
		
		System.out.println("******************************************");
		System.out.println("���� ���� ���ڿ� �����͸� �����");
		
		int size = this.sarray.length;
		
		if(size > 0) {
			
			for(int i = 0; i < size ; ++i) {
				String value = random.nextInt(100) + "";
				this.sarray[i] = value;
				System.out.println(i + " ��ġ�� ����� ���ڿ��� " + value);	
			}
		}
		
	
		// "" + ���� -> "����"
		// nextInt( 100 ) + "" -> "99"

	
	}
	
	// 3���� ������ �Ѳ����� �Է� �޾Ƽ� ���� ������ �����ϴ� �Լ�
	
	static void input_date() {
		
		int size1 = 0;
		int size2 = 0;
		int size3 = 0;
		String user_input = "";
		String [] str_input = null;
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.print("3���� ������ �Է����ּ���(�� : 3 4 5) : ");
			user_input = scanner.nextLine();
			str_input = user_input.split(" ");
			
			size1 = Integer.parseInt(str_input[0]);
			size2 = Integer.parseInt(str_input[1]);
			size3 = Integer.parseInt(str_input[2]);
			
	

	}
	
	
/*	static String input_int() {
		Scanner scanner = new Scanner(System.in);
		String input_data = "";
		String [] data_array = null;
		
		System.out.print("3���� ������ �Է����ּ��� : ");
		input_data = scanner.nextLine();
		data_array = input_data.split(" ");
		*/
		
	/*	a = Integer.parseInt(data_array[0]);
		b = Integer.parseInt(data_array[1]);
		c = Integer.parseInt(data_array[2]);*/
		
		// return a, b, c;
		
	/*	int size = data_array.length;
		
		if(size > 0) {
		for(int i = 0; i < size ; ++i ) {
			
			data_array[i] = 
		}
	}*/
	
	/*
	 * ����ڿ��� ��� ���θ� �����
	 * 1) y �Ǵ� n �ѱ��� �Է��� ��û char y_n = ' ';
	 * 2) yes �Ǵ� no ���ڿ� �Է��� ��û String yes_no = "";
	 * 
	 * -> �̰� �Լ��� 
	 */
/*	
	static void choice() {
		
		char y_n = ' ';
		String str_yn = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��� �����Ͻ÷��� y�� �׸� �Ͻ÷��� n�� �Է����ּ��� : ");
		str_yn = scanner.next();
		y_n = str_yn.charAt(0);
	
	}
	*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSeqSearchClass ref_ob = null;	
		
		/*int size1 = 0;
		int size2 = 0;
		int size3 = 0;
		String user_input = "";
		String [] str_input = null;
		
		Scanner scanner = null;*/
		
		try {
			
			/*scanner = new Scanner(System.in);
			System.out.print("3���� ������ �Է����ּ���(�� : 3 4 5) : ");
			user_input = scanner.nextLine();
			str_input = user_input.split(" ");
			
			size1 = Integer.parseInt(str_input[0]);
			size2 = Integer.parseInt(str_input[1]);
			size3 = Integer.parseInt(str_input[2]);
			*/
			// size1 = scanner.nextInt();
		
			/*
			 * 3���� ���� �����͸� ����ڷ� ���� �Է� �ޱ�
			 */
			// ref_ob = new TestSeqSearchClass(10,20,30);
		// ���� �ݺ������� ���α׷� ��ü ������ �ٲٱ�
			Loop1 :
			while(true) {
			ref_ob = new TestSeqSearchClass();
			
			/*
			 * ����ڿ��� ��� ���θ� �����
			 * 1) y �Ǵ� n �ѱ��� �Է��� ��û char y_n = ' ';
			 * 2) yes �Ǵ� no ���ڿ� �Է��� ��û String yes_no = "";
			 * 
			 * -> �̰� �Լ��� 
			 */
			
			char y_n = ' ';
			String str_yn = "";
			
			Scanner scanner = new Scanner(System.in);
			
			Loop2 :
			do{
			System.out.print("��� �����Ͻ÷��� y�� �׸� �Ͻ÷��� n�� �Է����ּ��� : ");
			str_yn = scanner.next();
			y_n = str_yn.charAt(0);
			
			if(y_n == 'y' || y_n == 'Y')
				break Loop2;
			else if (y_n == 'n' || y_n == 'N')
				break Loop1;
			else {
				
				System.out.println("y�� n�� �ƴ� ���ڸ� �Է��ϼ̽��ϴ�.");
				continue;
				
			}
			} while(true);
			
		} // end of while
			
		} catch (Exception e) {
			System.out.println("���� �߻�");
			System.out.println("������ " + e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("���� ������ ���� ����");
		
	

	}

}
