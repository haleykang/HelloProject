package march15;

/* 
 * 45���� �ζ� ��ȣ ����
 * -> 6���� ��ȣ ���� �� ���
 * -> 1���� ��ȣ ����
 */

import java.util.*;



class HelloMyLotto {
	
	// ���� ���� ���� ����
	static final Random random = new Random();
	
	// 1~45���� ���� ������ �迭 ����
	int [] my_array = null;
	
	int random_no1 = 0;
	
	// 6�� �迭 ����
	int [] isix_array = new int [6];
	
	// 6�� �迭 ��� �׽�Ʈ
	public void show_test() {
		
		for(int i = 0; i <=(isix_array.length-1); ++i) {
			System.out.println(i + " ��ġ�� ����� �ζ� ��ȣ�� " + this.isix_array[i]);
		}
	}
	// 6�� ���� 45���� �� �� �ϳ��� ���ÿ��� isix_array�� �����ϱ�
	public void choice_no() {
		
		for(int i = 0; i <=(isix_array.length-1); ++i) {
			
			isix_array[i] = my_array[create_random_no()];
			// System.out.println(isix_array[i]); // �ߺ��Ǵ� ���� ����
			
			
			for(int j = 0; j <= i; ++j) {
			
				if (isix_array[i] ==isix_array[j]) {
					System.out.println(isix_array[i]);
					--j;
					break;
				} // �� �𸣰Ե�..
			}
			
			
		}
		
/*		isix_array[0] = my_array[i];
		i = create_random_no();
		isix_array[1] = my_array[i];
		i = create_random_no();
		isix_array[2] = my_array[i];
		i = create_random_no();
		isix_array[3] = my_array[i];
		i = create_random_no();
		isix_array[4] = my_array[i];
		i = create_random_no();
		isix_array[5] = my_array[i];
		
	
		System.out.println(isix_array[0] + " " + isix_array[1]+ " " +isix_array[2]+ " "
		+ isix_array[3] + " " + isix_array[4] + " " + isix_array[5]);*/
		
		
	}
	
	
	
	// �迭�� 1~45���� ���� �������ִ� �Լ�
	 public void create_no() {
		
		for(int i = 0; i <= (this.my_array.length-1); ++i ) {
			
			this.my_array[i] = i + 1;
		}
	}
	
	// ����� �ζ� ��ȣ�� ������ִ� �Լ�
	
	public void show_no() {
		
		for(int i = 0; i <= (my_array.length -1); ++i) {
			System.out.println(i + " ��ġ�� ����� �ζ� ��ȣ�� " + this.my_array[i]);
		}
			
	}
	
	// ���� 0~44 ���� ��  1�� �����ϴ� �Լ�
	public int create_random_no() {
		
		random_no1 = random.nextInt(45);
		return random_no1;
	}
	
	

	public HelloMyLotto() {
		
		if (my_array == null) {
			this.my_array = new int [45];
		}
		else {
			System.out.println("�迭�� �̹� �����Ǿ� �ֽ��ϴ�.");
		}
	}

	public HelloMyLotto(int size) {
		
		if(size == 45) {
			if(this.my_array == null) {
				
				this.my_array = new int [size];
			}
		}
		
	}
		
}

public class TestMyLottoNoClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloMyLotto ref_lotto  = new HelloMyLotto();
		
		
		try {
			
			// �迭�� ���� ��
			ref_lotto.show_no();
			
			// �迭�� ���� ����
			ref_lotto.create_no();
			
			// �迭�� ���� �� 
			ref_lotto.show_no();
			
			// ������ ���� ���� Ȯ��
			System.out.println(ref_lotto.create_random_no());
			
			ref_lotto.show_test();
			
			ref_lotto.choice_no();
			
			
			
	
	
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}

	}

}
