package march17;

/*
 * ���� 235p ����
 */
import java.util.*;

class Tv {
	
	// Tv �Ӽ�(��� ����)
	String color; // ����
	boolean power; // ��������(on/off)
	int channel; // ä��
	Scanner scanner = null;
	
	// TV�� ���(�޼���)
	void power() {power = !power;} // TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; } // TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel; } // TV�� ä���� ���ߴ� ����� �ϴ� �޼���
	void input() {
		System.out.print("���Ͻô� ä���� �Է����ּ��� : ");
		scanner = new Scanner(System.in);
		channel = scanner.nextInt();
	}
	void channelCheck() {
		System.out.println("���� ä���� " + channel + " �Դϴ�.");
	}
	
	public Tv() {
		
		this(0);
	}
	public Tv(int a) {
	
		this.channel = a;
	}
	
}
 
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Tv t = null; // Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv(); // t �ν��Ͻ��� �����Ѵ�
*/		Scanner scanner = new Scanner(System.in);
		String user_input = "";
		char y_n = ' ';

		Tv t = new Tv();
		//if(t.power == false) {
			
			System.out.println("������ ���ּ���");
			
			do{
			System.out.print("������ �ѽ÷��� y��, ��ġ �����ø� n�� �Է����ּ��� : ");
			user_input = scanner.next();
			y_n = user_input.charAt(0);
			
			if(y_n == 'y' || y_n == 'Y') {
				
				t.power = true;
				break;
				
			}else if (y_n == 'n' || y_n == 'N') {
				
				System.out.println("������ ���� �ʾҽ��ϴ�.");
				break;
				
			}else {
				System.out.println("�����Դϴ�.");
				System.out.println("y �Ǵ� n�� �ƴ� ���ڸ� �Է��ϼ̽��ϴ�.");
				continue;
			}
			} while(true);
			
			
			
	//	}
			if(t.power == true) {
			
			try {
				
				t.input();
				t.channelCheck();
				
				
			} catch (Exception e) {
				
				System.out.println("���� �߻�");
				System.out.println("������ " + e.getMessage());
				
			}
		/*System.out.println(t.power);
		t.power();
		System.out.println(t.power);*/
	/*
		t.channel = 7; // Tv�ν��Ͻ��� ������� channel1�� ���� 7�� �Ѵ�
		t.channelDown(); // Tv �ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�
		t.channelCheck();
		t.channelUp();
		t.channelCheck();
		
		Tv t2 = new Tv(10);
		t2.channelCheck();
		
		t2.channel = 20;
		t2.channelCheck();
		
		
		t.input();
		t.channelCheck();*/
	
	
	}


	}

}
