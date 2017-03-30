package march30;

/*
 * ����Ʈ ����� ���� ������ ���� ���� ������ ���ο� Ŭ���� �����
 * 
 * �̸� : MySharedPrinterServer
 * 
 * ��� : ���ڿ� �����͵��� ����� ȭ�鿡 ����ϴ� ���
 * 
 * -> �̸� : print
 * -> �Է� ������ : ���� ���� ���ڿ� �����͵��� ���� �� �ִ� ���ڿ� �迭 :
 * 			String [] �迭 ���� �̸�;
 * 
 * -> ���� ������� ������� ����� �� �ֵ��� synchronized ��ɾ ���
 * -> ��� : ���� void
 * 
 * public synchronized void print ( String [] ref_data_array) {
 * 
 * }
 */
// ������ ���� Ŭ���� �����
class MySharedPrinterServer {
	

	
	
	
	// ����ȭ ��ɾ ������� ���� print2() �Լ� �����
	public void print2(int ivalue) {
		System.out.println("����ȭ ��ɾ ������� ���� �Լ�");
		System.out.println("���� �ϳ��� ȭ�鿡 ���");
		for(int count = 1; count <= 100; ++count) {
			// ȭ�鿡 ���� ������ 100�� ���
			System.out.println(count + " ��° ��µǴ� ���� " + ivalue);
		}
		
		System.out.println("��� ���� ���");
	}
	
		public synchronized void print_main() {
		System.out.println("print_main() ����");
		print("Hello");
		System.out.println("print_main() ����");
	}
	
	// print() �Լ� : �ϳ��� ���ڿ� ���� �޴� �Լ�
	// -> ���� ������� �ִ� �Լ��� �̸��� ����
	public synchronized void print(String ref_string) {
		
		System.out.println("�ϳ��� ���ڿ����� ����ϴ� �Լ�");
		
		// �Ѳ����� ��� ���ڿ����� ���
		System.out.println(ref_string);
		
		// ���ڿ� �ȿ� ����� ���� �ϳ��� �о�ͼ� ȭ�鿡 ����ϴ� �ݺ���
		for(int i = 0 ; i < ref_string.length(); ++i) {
			System.out.print(ref_string.charAt(i));
		}
		System.out.println("��¿Ϸ�");
	}
	
	// print() �Լ� : �ϳ��� �������� ���
	public synchronized void print(int idata) {
		
		System.out.println("�ϳ��� ������ ���");
		System.out.println(idata);
		System.out.println("��� �Ϸ�");
	}
	// print() �Լ� : ���� ���� ���� �����͵��� ���
	public synchronized void print(int [] ref_idata_array) {
		
		System.out.println("���� ���� �� �� �����͵��� ���");
		
		int size = ref_idata_array.length;
		if(size == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
			return;
		}
		for(int i = 0; i< size ; ++i) {
			System.out.println(ref_idata_array);
			
		}
		System.out.println("��� �Ϸ�");
	}
	// print() �Լ� : �ϳ��� �Ǽ��� ���
	public synchronized void print(double ddata) {
		System.out.println("�ϳ��� �Ǽ��� ���");
		System.out.println(ddata);
		System.out.println("��� �Ϸ�");
	}
	
	// ���� ���� �Ǽ� ���
	public synchronized void print(double [] ref_ddata_array) {
		System.out.println("���� ���� �Ǽ� ���");
		
		int size = ref_ddata_array.length;
		if(size == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
			return;
		}
		for(int i = 0; i < size; ++i) {
		System.out.println(ref_ddata_array);
		}
		
		System.out.println("��� �Ϸ�");
	}
	
	
	// ���� ������� �Բ� ����� �� �ִ� print() �Լ� �����
	public synchronized void print(String [] ref_data_array) {
		
		// for() �ݺ����� �ۼ��ؼ� ���ڿ� �迭�� ����� ���ڵ��� �ϳ��� �о�ͼ�
		// ����� ȭ�鿡 ���
		int size = ref_data_array.length;
		
		if(size == 0) {
			// �����Ͱ� ���� ���
			System.out.println("��µ� �����Ͱ� �����ϴ�.");
			return;
		}
		
		for(int i = 0 ; i < size ; ++i) {
			
			// ���ڿ� �迭���� �ϳ��� ���ڸ� �о�ͼ� ������ �ӽ� ������ ����
			char temp_ch = ref_data_array[i].charAt(i);
			
			System.out.print(temp_ch);
			
		}
		
	}
	
}


/*
 * ���� ����� ��ü�� ������ִ� ���ο� Ŭ���� �����
 */
class MyPersonThread extends Thread {
	
	// ������ ������ ������ ���� Ŭ������ ����ϴ� ������ ���� ����
	private MySharedPrinterServer ref_shared_printer_server ;
	
	// ������ ������ ���� �����͸� ���� �� ������ ����
	// ���� ������
	private int idata = 100;
	
	// �Ǽ� ������
	private double ddata = 3.14;
	
	// �ϳ��� ���ڿ� ������
	private String sdata = "������";
	
	// ���� ���� ���ڿ� �����͵��� �����ϴ� �迭
	private String [] ref_sdata_array = {"�ȳ�?","�ݰ���","�̸��� ����?","����"};
			
	// ���ο� ������ �Լ��� ���� main() �Լ� �Ǵ� �ٸ� Ŭ�����κ��� ������ ����
	// ��ü�� �ּҿ� ����� ȭ�鿡 ����� �����͵��� �޾ƿ���
	// �Ű� ������ MySharedPrinterServer Ŭ���� �̸��� ����� ���
	// MySharedPrinterServer Ŭ������ ����ϴ� Ŭ�������� �� new Ŭ�����̸�()�� �� �Ŀ�
	// ���� ������� �޸��� �ּҸ� ���� �ؾ���
	// ��) new MyPersonThread(10,3.14,"Hello", new String [] {"","",""})
	
	public MyPersonThread(int ivalue, 
			double dvalue, 
			String svalue, 
			String [] ref_svalue_array, 
			MySharedPrinterServer ref_shared_print_server_value) {
		// ref_shared_print_server_value = new MySharedPrinterServer(); 
		// �̰� �׻� �޸𸮿� ������ �ִ� ���� 
		
		// �ٸ� Ŭ�����κ��� ���� ����, �Ǽ�, ���ڿ�, ���ڿ� �迭��, �׸���
		// �޸𸮿� ������ ������ ���� ��ü�� �ּҸ� ���� ������ �����ؾ� ���߿�
		// �ٸ� �Լ������� ��� ����
		// this.���� ���� �̸� = ���� ���� �̸�;
		System.out.println("��� ��ü�� �����");
		this.idata = ivalue;
		this.ddata = dvalue;
		this.sdata = svalue;
		this.ref_sdata_array = ref_svalue_array;
		this.ref_shared_printer_server = ref_shared_print_server_value;
		
		System.out.println("�Ϸ�");
		
	}
	
	// �� run() �Լ��� �ۼ��ؾ� ������ ��ü���� �����̰� �� �� ����
	@Override
	public void run() {
		
		System.out.println("****run() �Լ��� ��� ��ü���� ����****");
		
		// getName() �Լ��� ����ϸ� ���� run() �Լ��� ����ϰ� �ִ� ������ ��ü�� �̸���
		// �� �� �ֽ��ϴ�.
		String name_thread = this.getName();
		System.out.println("���� ������ ������ ����ϰ� �ִ� ����� " + name_thread);
		
		// ����Ϳ� ������ ����ϱ� ���ؼ� print(����) �Լ��� ����
		this.ref_shared_printer_server.print(1030);
		
		// ����Ϳ� �Ǽ� ���
		this.ref_shared_printer_server.print(3.1334);
		
		// ����Ϳ� ���ڿ� ���
		this.ref_shared_printer_server.print("Hello");
		
		// ���� ������ ����� ���� ���� ����ؼ� ����� ȭ�鿡 ���
		this.ref_shared_printer_server.print(this.idata);
		
		// ���� ������ ����� �Ǽ� ����
		this.ref_shared_printer_server.print(this.ddata);
		
		// ���� ���� ���ڿ�
		this.ref_shared_printer_server.print(this.sdata);
		
		// ���ڿ� �迭�� ����� ���ڿ����� �迭�� ����ؼ� ���
		for(int i = 0 ; i < this.ref_sdata_array.length; ++i ) {
			System.out.println(i + " ��ġ�� ����� ���ڿ��� " + this.ref_sdata_array[i]);
			// ���ڿ� �迭�� ����� ���ڿ��� ������ ������ �ִ� print() �� ���� ����
			this.ref_shared_printer_server.print(this.ref_sdata_array[i]);
			
		}
		
		// ����ȭ ���� ���� print2() �Լ� �����ϱ�
		this.ref_shared_printer_server.print2(28);
		
		
		
		System.out.println("****run() �Լ��� ��� ��ü���� ���� �Ϸ�****");
		this.ref_shared_printer_server.print_main();
	}
	
}


public class TestPrinterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ��� ������� �Բ� ����� �� �ִ� ������ ���� ��ü�� �����ϰ�
		// ������ �޸��� �ּҸ� ������ ����
		
		MySharedPrinterServer ref_shared_print_server = new MySharedPrinterServer();
		// ��� ��ü�� ���� ������ ������ ����
		MyPersonThread ref_person_thread = 
				new MyPersonThread(28, 163.2,"������", 
						new String[] {"�ȳ�","�ݰ���","����?"}, ref_shared_print_server );
		
		// �ι�° ��� ��ü�� ���� ����
		MyPersonThread ref_person_thread2 =
				new MyPersonThread(27, 168.7, "������", new String[] {"�޷�", "�ٺ�","�л�"}, ref_shared_print_server);
		
		// ����° ��� ��ü
		MyPersonThread ref_person_thread3 = 
				new MyPersonThread(21, 160.2, "������", new String [] {"����", "�ٹ�", "����"}, ref_shared_print_server);
		
		// ������ ���� ������ ������ ��ü�鿡 ���ο� �̸� ����
		// ���� ���� �̸�.setName("�̸�");
		
		ref_person_thread.setName("������");
		ref_person_thread2.setName("������");
		ref_person_thread3.setName("������");
		
		// start() �Լ��� �����ؼ� ���� ������ ������ ��ü���� run() �Լ��� ���� �� �� �ֵ��� �ϤӤ�
		
		ref_person_thread.start();
	
		ref_person_thread2.start();
		
		ref_person_thread3.start();
		
		
		
		

	}

}
