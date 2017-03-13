package march13;

/*
 * [�ǽ�] 2���� ���� �߿��� ���� ������ ��ȯ�ϴ� min() �Լ� �����
 * 1. ������ 2���� �������� �޴� �Լ� min (int a, int b)
 * 2. ������ 2���� �Ǽ����� �޴� �Լ� min (float a, float b) / min(double a, double b)
 * 3. ��� ���� �����͸� �޴� �Լ� min (String a, String b)		
 * �� �Լ� �����ε�
 */


import java.util.*;

public class SelfTest {
	
/*	// 1. 2���� �������� �޴� min() �Լ�
	static int min(int a, int b) {
		
		if(a<b)
			return a;
		else if(a>b)
			return b;
		else return 0;
	}
	// 2. 2���� �Ǽ����� �޴� min() �Լ�
	static float min(float a, float b) {
		
		if(a<b)
			return a;
		else if(a>b)
			return b;
		else return 0;
	}
	
	static double min(double a, double b) {
		
		if(a<b)
			return a;
		else if(a>b)
			return b;
		else return 0;
	}*/
	// ��� ���� �����͸� �޴� min() �Լ�
	//
	static String min(String a, String b) {
		
		double ia = Double.parseDouble(a);
		double ib = Double.parseDouble(b);
		// pareInt�� �� ��� ���� ó��!
		// �� ū ���� parseDouble�� ��ȯ �ؾ� �Ǽ�, ���� �� �� �� ���� 
		
		if(ia<ib)
			return a;
		else if(ia>ib)
			return b;
		else return null;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
/*		int da = 0;
		int db = 0;
		
		float fa = 0.0f;
		float fb = 0.0f;
		
		double lfa = 0.0;
		double lfb = 0.0;
		*/
		String stra;
		String strb;
		
		try {
			
			System.out.print("ù��° �����͸� �Է��ϼ��� : ");
			stra = scanner.next();
			
			System.out.print("�ι�° �����͸� �Է��ϼ��� : ");
			strb = scanner.next();
			
			System.out.println("�Էµ� ������ �� ���� ���� " + min(stra, strb));
			
		} catch (Exception e) {
			
			System.out.println("���� �߻�");
			System.out.println("������ " + e.getMessage());
			e.printStackTrace();
			
		}
	
	}

}
