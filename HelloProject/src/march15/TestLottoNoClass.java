package march15;

import java.util.*;

/*
 * 45���� �ζ� ��ȣ�� ���� �� �� �ִ� �迭�� �غ��ϰ� ����ϴ� ����
 */
 
// 45���� �ζ� ��ȣ ���� Ŭ���� �����
class LottoNoClass {
	
	// 45���� ������ �����ϴ� �迭 ����
	int lotto_array [];
	
	// 45���� ����(�� �Ǵ� ����)�� �����ϴ� �迭 ����
	/*
	 *  ���� lotto_array �迭�� ����Ǿ� �ִ� �ζ� ��ȣ�� �̾� �Դ��� ���θ�
	 *  �����ϴ� �迪 
	 *  
	 *  true  -> �ش� ��ġ(����)�� �ִ� �ζ� ��ȣ�� �̾ƿ� ���
	 *  false -> �ش� ��ġ(����)�� �ִ� �ζ� ��ȣ�� ���� �� �̾ƿ�
	 */
	
	///////////////////////////////////���⼭ ���� ���� �Ѱ� /////////////////////////////////////////////////////
	
	static final Random random = new Random();
	
	int my_random = random.nextInt(45);
	
	
	// 0~44 �ϳ��� ������ ����� ��ȯ�ϴ� �Լ�
	public int random_one() {
		
		int random_no = random.nextInt(45);
		
		return random_no;
	}
	
	// ���ο� Ŭ������ ���� �ϱ� TestMyLottoNoClass
	
	/*
	 * 45���� �ζ� ��ȣ�� �ڵ����� ���� ������ lotto_array �迭�� ����������
	 * ù��° ��ġ���� 1�� �ι�° ��ġ���� 2��...�����ϴ� �Լ� ����� 
	 */
	public void creat_no() {
		
		System.out.println("***45���� �ζ� ��ȣ�� ����ϴ�.***");
		/*
		 * for() �ݺ����� �ۼ� : �迭�� ��ġ�� �����ϴ� ���� i�� �����ϰ�
		 * ù��° ��ġ�� 0���� �����ϰ� ù��° ��ġ�� �����ϴ� �ζ� ��ȣ��
		 * ���� ���� i ���� 1�� ���� i+1
		 */
		for(int i = 0; i <= (this.lotto_array.length - 1); ++i) {
			System.out.println(i + " ��ġ�� ������ �ζ� ��ȣ �����");
			this.lotto_array[i] = i+1;
			System.out.println("���� �Ϸ�");
		}
		
	}
	
	// ������ �Լ��� ����� �Լ� �ȿ��� �ζ� �迭 �����ϱ�
	// new int [45] �Ǵ� new int [�����̸�]
	
	// 1. �⺻ �����ڿ����� ������ 45���� ������ ���� ����
	public LottoNoClass() {
		System.out.println("������ 45���� ������ ������ �����ϴ� ������ �Լ�");
		if(lotto_array == null) {
			this.lotto_array = new int [45];
			System.out.println("�迭 ����� �Ϸ�");
		}
		else {
			System.out.println("�̹� �迭�� �����Ǿ� �ֽ��ϴ�.");
		}
	}
	
	// 2. main() �Լ��κ��� �迭�� ũ�⸦ �޴� 2��° ������
	public LottoNoClass(int size) { 
		System.out.println("main() �Լ��κ��� �迭�� ũ�⸦ �޴� ������ �Լ�");
		// main() �Լ��� ���� ���� �迭�� ũ�Ⱑ 45�� �� ��쿡�� �迭 ����
		if(size == 45){
			if(this.lotto_array == null) {
				System.out.println("���ο� �迭�� ����ϴ�.");
				this.lotto_array = new int [size];
				System.out.println(size + " ũ�⸦ ���� �迭 ���� �Ϸ�");
			}
		}	
	}
	
	/*
	 * 45���� �ζ� ��ȣ�� ȭ�鿡 ����ϴ� �Լ�
	 */
	public void show_no() {
		
		System.out.println("***45���� �ζ� ��ȣ�� ȭ�鿡 ����ϱ�***");
		
		/*
		 * 45���� �ζ� ��ȣ�� �����Ǿ� �ִ� �迭 lotto_array�� ù��° ��ġ ����
		 * �湮�Ͽ� ������� ��ġ�� �����ϸ鼭 ��ȣ�� �о�ͼ� ȭ�鿡 ���
		 * 
		 * ���� i�� �����ؼ� ��ġ ��ȣ�� �����ϱ� : int 1 = 0;
		 * ���� ������ lotto_array �迭�� ũ�� -1 ���� 
		 * i<=(lotto_array.length -1)
		 * �迭�� ��ġ ��ȣ�� 1�� �����ϱ� : ++i
		 */
		for(int i = 0; i <= (lotto_array.length -1); ++i) {
			System.out.println(i + " ��ġ�� ����� �ζ� ��ȣ�� " + this.lotto_array[i]);
		}
			
	}
	
}

public class TestLottoNoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. ������ ���� �ٸ� Ŭ������ LottoNoClass�� ����ϱ� ���� ���� ����
		 */
		LottoNoClass ref_lotto_object = null;
		// ref : reference(����) = �޸��� �ּ�
		
		/*
		 * 2. new �����ڸ� ����ؼ� LottoNoClass Ŭ������ �޸𸮿� �����
		 */
		
		try{
		ref_lotto_object = new LottoNoClass();
		/*
		 * new LottoNoClass() -> �⺻ �����ڸ� ���� 
		 */
		
		/*
		 *  3. �迭 ũ�⸦ �޴� 2��° �����ڸ� �����ϱ�
		 */
		/*
		 *  4. ���� ���� �޸��� �ּҸ� ������ ���� ����
		 */
		LottoNoClass ref_lotto2_object = null;
		// 5. new �����ڸ� ����ؼ� �迭�� ũ�⸦ �޴� �����ڸ� ����
		ref_lotto2_object = new LottoNoClass(45);
		
		/*
		 * show_no() �Լ��� �����ؼ� ���ݱ��� ������� �ζǹ�ȣ(45)��
		 * ȭ�鿡 ����ϱ�
		 */
		
		System.out.println("*****************************************************");
		
		System.out.println("ù��° �ζ� �迭 ���� ���");
		
		ref_lotto_object.show_no();
		
		System.out.println("*****************************************************");
		
		System.out.println("%�� ��° �ζ� �迭 ���� ���");
		
		ref_lotto2_object.show_no();
		
		System.out.println("*****************************************************");
		
		/*
		 *  ��� ���� creat_no() �Լ��� �����ؼ� 45���� �ζ� ��ȣ�� ���� ������
		 *  �迭 lotto_array�� �����ϱ�
		 */
		
		ref_lotto_object.creat_no();
		
		System.out.println("-------------------------------------------------------");
		
		ref_lotto2_object.creat_no();
		
		System.out.println("-------------------------------------------------------");
		
		ref_lotto_object.show_no();
		
		System.out.println("-------------------------------------------------------");
		
		ref_lotto2_object.show_no();
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println(ref_lotto2_object.random_one());
		
		} catch (Exception e) {
			
			System.out.println("�����߻�");
			e.printStackTrace();
		}
		
	}

}
