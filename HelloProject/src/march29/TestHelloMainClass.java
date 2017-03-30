package march29;

/*
 * Thread Ŭ������ ��ӹ޴� �ڽ� Ŭ���� �����
 * -> Thread Ŭ������ java.lang ��Ű���� ����
 */
class MyChildThreadClass extends Thread {
	
	// ��� run() �Լ��� ������ ���ص� ���� �ȳ�
	@Override
	public void run() {
		System.out.println("MyChildThreadClass Ŭ�������� �������� run()�Լ�");
	}
	
}

/*
 * Runnable �������̽��� ������ ���ο� �ڽ� Ŭ���� �����
 */
class MyChildRunnableClass implements Runnable {
	// ��� �������̽��� ��� �ޱ� ������ run() �Լ��� �� ������ �ؾ���
	// ��!!!!!!!!!!!!!!! run() �Լ� �������ؾ��� -> Runnable �������̽� �̹Ƿ�
	// (�߻� �޼ҵ带 ���� �ִ� Ŭ����)
	@Override
	public void run() {
		System.out.println("MyChildRunnableClass Ŭ�������� �������� run()�Լ�");
		
	}
	
}


public class TestHelloMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� ������ Ŭ������ ����ϱ� ���� ������ ���� ����
		MyChildThreadClass ref_thread_ob;
		
		// new ��ɾ� ����ؼ� �޸𸮿� ����
		ref_thread_ob = new MyChildThreadClass();
		
		// start() �Լ��� �����ؾ� �ڹ� ���� �ӽſ� ���ؼ� run() �Լ��� �����!
		// �����ڰ� ���� x
		
		ref_thread_ob.start();
		
		/*
		 * ������ ���� Runnable �������̽��� ������ ���ο� �ڽ� Ŭ������ ����Ϸ���
		 * 
		 * 1. ��ü ������ ������ ���� : Ŭ���� �̸� ���������̸�;
		 * 
		 */
		MyChildRunnableClass ref_runnable_ob ;
		//2. new Ŭ�����̸�() ��ɾ�� �޸𸮿� Ŭ���� �����
		ref_runnable_ob = new MyChildRunnableClass();
		
		// 3. Thread Ŭ������ ����� ���ο� ������ ������ �����ϰ� ������ �Ŀ�
		// ������ ���� ref_runnable_ob�� Thread Ŭ������ ���� �ؾ���
		Thread ref_another_thread_ob = new Thread(ref_runnable_ob);
		
		// 4. Thread Ŭ������ ���� �ִ� start() �Լ��� �����ؼ�
		// �ڹ� ���� �ӽ��� MyChildRunnableClass Ŭ������ ���� �ִ� run() �Լ��� ���� �� �� �ֵ��� ��
		ref_another_thread_ob.start();
		
		
		// ȭ�鿡 Hello �޽����� 100���� ����ϴ� ���� �ۼ�
		
		// nanoTime() �Լ��� ����ؼ� ���� �ð�(���α׷��� ���۵� ���� �ð�)
		long start_time = System.nanoTime();
		// ���� �ð��� ������ �����ϱ� : � ����(��ɹ�) ó���ϱ� ���� �ð� ����
		
		
		for(int i = 0 ; i < 100 ; ++i) {
			System.out.println((i+1) + " Hello");
		}
		
		
		
		// ���(��ɹ�)�� �� ó���� ���� �ð��� ������ ����
		long end_time = System.nanoTime();
		
		// �� �ɸ� �ð� ����
		// (end_time - start_time) / 10��.0 
		double elapsed_time = (end_time - start_time)/1000000000.0;
		System.out.println("�� �ҿ� �ð��� " + elapsed_time + "�� �Դϴ�.");
		

	}
	
	
	

}
