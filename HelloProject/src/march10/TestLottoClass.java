package march10;

/*
 * 45���� ��ȣ�� ���� �迭�� �����ϰ�
 * �� �� 6���� �ζ� ��ȣ�� ȭ�鿡 ��� �ϱ� ���� 
 */
import java.util.Scanner;
import java.util.Random;


public class TestLottoClass {
	
	/*
	 * 2���� ������ main() �Լ��κ��� �޾ƿͼ� ���� ����� �ϰ�
	 * �� ����� return ��ɹ��� ���ؼ� main() �Լ��� �����ϴ� 
	 * ���ο� ����� ���� �Լ� �����
	 * 
	 * 1. �̸� : add_method
	 * 2. main() �Լ��� ���� �޴� 2���� ������ �����ϴ� ���� ����
	 * 		�ڷ��� + �����̸� 1, �ڷ��� + �����̸� 2
	 * 		int a, int b
	 * 3. main() �Լ��� �����ִ� ���� �ڷ����� �ۼ� -> ���� -> int
	 * 
	 * 4. ���α׷��� ���۵� �Ŀ� �ٷ� ����ϱ� ���ؼ� static ��ɾ ���
	 * 
	 */
	static int add_method(int a, int b){
		System.out.println("���� ���� ���� �Լ��� ����Ǿ����ϴ�.");
		System.out.println("main() �Լ��κ��� ���� ù��° ���� " + a);
		System.out.println("main() �Լ��κ��� ���� �ι�° ���� " + b);
		return (a+b); // ���� ����� �� �Ŀ� ����� �ٽ� main()�Լ�, �� �ڽ��� �θ� �Լ��� ����
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 45���� ��ȣ�� ����� �� �ִ� �迭 ����
		// -> �޸��� �ּҸ� ������ �� �ִ� �迭
		int lotto1[];
		
		// 2. new �����ڸ� ����ؼ� 45���� �޸� ������ ����ϴ�.
		lotto1 = new int[45];
		// �����Ϸ��� �ڵ����� 0�� 45�� ��������
		// �����Ϸ��� �ڵ����� ���� ��ȣ�� �ο�( 0~(45-1))
		// �����Ϸ��� �ڵ��� Object Ŭ������ �θ� Ŭ������ ����
		// �����Ϸ��� �ڵ����� ���� length�� ����
		// �����Ϸ��� �ڵ����� ���� length�� 45(�迭�� ũ��)�� ����
		// -> 45���� ������ �Ѳ����� ������ִ� ����
		
		// �ι�° �ζ� ��ȣ ���� �迭 ����� �޸� ������ ���ÿ� �ϱ�
		int lotto2[ ] = new int[45];
		// = ���ʿ� �ִ� ���ȣ ������ �ȿ��� ���ڸ� �ۼ��� �� ����!!!!
		
		// ����ڷκ��� �Է� ���� �迭�� ũ��(45)�� ������ �� �ִ� ����
		int count = 0;
		
		// ����° �ζ� ��ȣ ���� �迭 ����
		int lotto3[ ];
		// int [] lotto3; ����ڷκ��� �Է� ���� 45 ���ڸ� ����ؼ�
		// �迭�� ���鿹�� -> lotto3 = new int [ count ];
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("�迭�� ũ�⸦ ���ڷ� �Է� �ϼ��� : ");
			count = scanner.nextInt();
			
			if(count > 0) {
			lotto3 = new int[count];
			System.out.println("���� �迭 ����� �Ϸ�!");
			
			} else {
				System.out.println("�迭�� ũ�� �Է� ����!");
			}
			
			// ������ ���� add_method() �Լ��� �����ϱ�
			// -> 2���� ������ �� �����ؾ� ������
			// -> add_method(ù��° ���� : ���� a�� ������ ����, �ι�° ���� : ���� b)
			// -> add_method(10,20); 
			
			System.out.println("10 + 20 ����� " + add_method(10,20));
			// ��� �Լ����� add_method() �Լ��� �����ϰ�
			// return ��ɹ��� ���ؼ� ������� ���� ����� ȭ�鿡 ��� 
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� �߻�");
			e.printStackTrace();
		}

	}

}
