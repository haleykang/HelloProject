/*
 * �ּ� ��ɹ� : ������� ��Ÿ���� �ʴ� ��ɹ�
 * ���α׷��� ���� ���� ����
 *  ���� �� �ۼ� ����
 *  
 */

// ���� �ּ� ��ɹ� : ���ٸ� ������ ����


public class HelloClass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// 3 + 4 ���� ����ϵ� : 3 + 4 -> 7 �޸�
		// ����� ȭ�鿡 ��� : prinfln() �޼ҵ�� �Բ� ���
		System.out.println("3 + 4 �� " + (3+4));
		// �Ұ�ȣ ������ -> ��� ������ ���� ���� �ϰ� �ϴ� ������
		
		int first = 3, second = 4;
		System.out.println(first + "+"+ second+"="
				+ (first + second));
		
		// = ��ȣ�� ����ؼ� ������ �� 3�� 5�� 4�� 6���� ����
		first = 5;
		second = 6;
		System.out.println(first + "+"+ second+"="
				+ (first + second)); // 5+6
		int third = 11;
		
		System.out.println(first+"+"+second+"+"
				+third+"=" + (first + second + third));
	
		System.out.printf("���� ���̴� %d(10����)\n", 20);
		System.out.printf("���� ���̴� %x(16����)\n", 20); // 20�� 16������ �ٲ㼭 ���
		System.out.printf("���� ���̴� %o(8����)\n", 20); // 20�� 8������ �ٲ㼭!
		System.out.printf("10������ 5�ڸ��� ����ϸ� %5d\n", 20); // 20�տ� �����̽� 3ĭ ����
		System.out.printf("10������ 5�ڸ��� ����ϸ� %-5d\n", 20); // 20�ڿ� �����̽� 3ĭ ����
		// %5d -> ���� ��� �ڸ����� ���� : 1 2 3 4 5  -> 20�̴ϱ� 4��° 5��° �ڸ��� ���� ��ġ��
		// (��ĭ)(��ĭ)(��ĭ)20
		// %-5d -> ���� ���ʿ� ��ĭ ���� -> 5 4 3 2 1 -> 5, 4 ĭ�� 20(��ĭ)(��ĭ)(��ĭ)
		System.out.printf("�ϳ��� ���ڸ� ��� %c\n", 'a');
		System.out.printf("���� ���� ���ڸ� ��� %s\n", "���ڿ�");
		// %c�� ����ؼ� abc�� ����ϱ� : %c%c%c �� �� ���� ���
		System.out.printf("ȭ�鿡 abc �������� ��� %c%c%c\n", 'a','b','c');
		
		// �Ǽ��� ȭ�鿡 ����ϱ� : %f ���� ���ڸ� ���
		System.out.printf("ȭ�鿡 �Ǽ��� ����ϸ� %f\n", 3.14f);
		
		// �Ҽ��� �Ʒ� �ڸ����� �����ϱ� : %.�ڸ���f
		System.out.printf("ȭ�鿡 �Ҽ��� 2�ڸ����� �Ǽ� ��� %.2f\n", 3.14f);
		System.out.println("30"+"20"); // 3020
		System.out.println(30+20); // 50
		
		
	
			
		// ���� ���� ���̸� �����ϴ� ���� ����
		// �ڷ���(int) + ���� �̸� (�ĺ���) = ����;
		int age = 20;
		
		// ��� ���� : final + �ڷ��� + ����̸�
		final int age2 = 30;
		
		System.out.println("��� age2�� ���� �ִ� ���̴� " +age2);
		// "" : ���ڿ�, ����̸� age2�� int �̹Ƿ� + ��ȣ�� ����ؼ� ����
		
		// �� ������ ���� �޸𸮿� �����ϱ�
		boolean b = true;
		System.out.println("�޸𸮿� ����� �� �����ʹ� "+b);
		
		// ������ false�� ǥ��
		b = false;
		System.out.println("�޸𸮿� ����� �� �����ʹ� "+b);
		
		// �Ǽ��� float �Ǵ� double �ڷ���
		float f = 3.14f;
		System.out.println("�޸𸮿� ����� �Ǽ� �����ʹ� " +f);
		
		double d = 3.14;
		System.out.println("�޸𸮿� ����� �Ǽ� �����ʹ� " +d);
		
		// ���ڴ� char
		char ch = 'a';
		System.out.println("�޸𸮿� ����� ���� �����ʹ� " +ch);
		
		// ���ڿ��� java.lang ��Ű���� ������� �ִ� String Ŭ������ ���
		String str = "���� �˴ϴ�.";
		System.out.println("�޸𸮿� ����� ���ڿ� �����ʹ� " +str);
	
		// ������ �޸𸮿� ����� ���̸� Ȯ���ϱ�
		// -> ����� ȭ�鿡 ����ϱ�
		// -> ��� ��� : "���� ���̴� "+age+"�� �Դϴ�."
		System.out.print(
				"���� ���̴� "+age+"���Դϴ�.\n");
		// + ��ȣ�� ���� ��ȣ 
		// ���ʿ� �ִ� "���� ���̴�" ���ڿ��� 
		// ���� age�� ���� �ִ� �� 20�� ����(����)
		// ���� "��" ���ڿ��� �������� �߰�
		
		age = 30;
		
		// ������ ������ 20�� ������� 30�� �����
		System.out.print("����� ���̴� " +age+"\n");
		
		System.out.println("float �ڷ������� ������ �� �ִ� �ִ� ����" + Float.MAX_VALUE);
		System.out.println("double �ڷ������� ������ �� �ִ� �ִ� ����" + Double.MAX_VALUE);
		// MAX_VALUE : �ִ밪�� ���� �ִ� ��� �̸�
		
		// ��ɹ� �ۼ�
		// ȭ�鿡 Hello�� ����ϴ� ��ɹ� : print() �޼ҵ带 ����
		
		java.lang.System.out.print("Hello\n");
		System.out.print("�ȳ��ϼ���?\n"); 
		System.out.print("������� �����Դϱ�?\n"); 
		System.out.println("�ȳ��ϼ��� ���� �������Դϴ�.");
		System.out.println("��𰡼���?");
		// �����Ϸ��� java.lang ��Ű�� �̸��� �ڵ����� ����
		
		/*
		 * java.lang : ��Ű�� �̸�
		 * System : Ŭ���� �̸�
		 * out : ��ü(����) �̸�
		 * print : �޼ҵ� �̸�
		 * 
		 */
	}

}
