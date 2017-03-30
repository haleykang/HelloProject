package march29;


/*
 * ���࿡�� �ϳ��� ������ ���� �� ATM ��踦 ���� 5���� �Ա��ϱ� ����
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ������ �������ִ� Ŭ���� �����
/*
 * 1. ������ ������ �� �ʿ��� ������ ����
 * 2. ������ ����ؼ� �� �� �ִ� �Ա�, ���, �ܾ� ��ȸ ��� ����
 * 
 */
class MyBankClass {
	
	// �̸��� �����ϴ� ���� ����
	private String m_name ;
	
	// ���� ��ȣ�� �����ϴ� ���� ����
	private String account_no ;
	
	// ���� ��й�ȣ�� �����ϴ� ���� ����
	private String m_password ;
	
	// ������ �ܾ� ������ �����ϴ� ���� ����
	private int m_balance;
	
	// ���� ������ ����� ������ �Լ� �����
	
	public MyBankClass(String name_value, String acct_no_value, 
			String pw_value, int balance_value) { 
		System.out.println(name_value + " ������ ���ο� ������ �����մϴ�.");
		System.out.println("���� ��ȣ�� " + acct_no_value + " �Դϴ�.");
		System.out.println("�ʱ� ���ݾ��� " + balance_value + "�� �Դϴ�.");
		
		// main() �Լ��� ���� ���� �������� ���� ������ �����ϱ�
		this.m_name = name_value;
		this.account_no = acct_no_value;
		this.m_password = pw_value;
		this.m_balance = balance_value;
		System.out.println("������ �����Ǿ����ϴ�.");

	}
	
	/*
	 * ���� ���� ������ ��ü���� ���� ������ ����� �������� ����Ϸ��� �ϴ� ��쿡
	 * ���� ������ ����� �������� ��ȣ�ϱ� ���ؼ��� ����ȭ ��ɾ �ۼ��ؼ� �Լ��� ������ ��
	 * 
	 * ����ȭ ��ɾ ����ϸ� �ѹ��� �ϳ��� �����常�� ���� ������ ����� ������ ��� ���� 
	 * 
	 * -> ���� ���� ������ ��ü���� ���ÿ� ���� ������ ����� �������� ����ϴ� ��쿡��
	 * �������� �ϰ����� �����Ǳ� ����� ����
	 * 
	 * -> ����ȭ ��ɾ� : synchronized ����� ���
	 */
	
	// ȫ�浿 ���� ���忡 �Ա��ϴ� ��쿡 �����ϴ� ����ȭ �Լ�
	public synchronized int withdraw(int deposit_value) throws Exception {
		
		
		/*
		 * �Աݾ��� ��ȿ�� �˻��ϱ�(����ϰ�)
		 */
		if(deposit_value <=0) {
			
			System.out.println("�Աݾ��� 0�� �����Դϴ�.");
			throw new Exception("�Աݾ��� 0�� �����Դϴ�. �Ա� ���� �Ұ�");
		}
		/*
		 * �Աݾ��� ���� �˻� : -21�� ~ 21�� �˻�
		 */
	/*	if(deposit_value < Integer.MIN_VALUE ) {
			System.out.println("�Աݾ��� ������ �ּҰ����� �� �۽��ϴ�.");
			throw new Exception("�Աݾ� ����÷ο�");
		}*/
		if(deposit_value > 0 && deposit_value <= Integer.MAX_VALUE) {
			System.out.println("�Աݾ� ����");
		} else {
			
		}
		
		// �Աݾ��� �ݿ��� �ܾ� ������ main() �Լ��� �ݿ�
		return this.m_balance;
	}
	
	
}


public class TestBankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
