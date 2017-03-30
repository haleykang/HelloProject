package march29;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ���� �������� Ŭ���� �����
class MyOuterFrameClass extends Frame {
	
	Button bt1 = new Button("1");
	
	
	// �ϳ��� ��ư Ŭ�� �̺�Ʈ ���� ó�� �Լ��� ���� ���� Ŭ���� �����
	private class MyInnerClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ae) {
			// � ��ư���� ������ �ʿ� ����
			
			System.out.println("��ư 1������ ����ϴ� ��ɹ�");
		}
	}
	
	// ���� Ŭ������ ����ϱ� ���ؼ��� new�� ����ؼ� ���ο� ��ü�� �������
	// ��ư�� ����
	// ��ư ���� ����.addActionListener(new Ŭ�����̸�() ��ɾ��� �ּҸ� �޴� ����);
	// 1. MyInnerClass �����̸�1 = new MyInnerClass();
	// 2. Button ��ư�����̸�1 = new Button("�ȳ�");
	// 3. ��ư�����̸�1.addActionListener(�����̸�1);
	
	// �ٸ� ��ü������ ����� �� �ִ� ���� Ŭ���� ��ü
	MyInnerClass ref_inner_ob = new MyInnerClass();
	//  ����ϴ� ��ɹ��̱⶧���� ������ �Լ� �Ǵ� �Լ� �Ǵ� �߰�ȣ ������ ������ 
	// �켱 ���⼭�� �߰�ȣ ������!
	{
		bt1.addActionListener(ref_inner_ob);
	}
	
	Button bt2 = new Button ("2");
	{
		bt2.addActionListener(new MyInnerClass());
		// ��ư2������!!! ���⼭�� ��� �� �� �ְ� �����
	}
	
}

// ���ݱ��� �ַ� �ۼ��ߴ� Ŭ���� ����

class MyChildFrame extends Frame implements ActionListener {
	
	// ��� ��ư ��ü���� ����� �� �ִ� actionPerformed() ���� �Լ�
	@Override
	public void actionPerformed (ActionEvent ae) {
		// �Ʒ��� �ִ� ���� ���� ��ư���� �����ϴ� ���ǹ��� �� �ʿ�
		
		Object ref_event = ae.getSource();
		if(ref_event instanceof Button) {
			Button ref_clicked = (Button)ref_event;
			
			if(ref_clicked == bt1) {
				System.out.println("ù ��° ��ư Ŭ��");
			} 
			else if (ref_clicked == bt2) {
				System.out.println("�� ��° ��ư Ŭ��");
			}
			else if (ref_clicked == bt3) {
				System.out.println("�� ��° ��ư Ŭ��");
			}
			else if (ref_clicked == bt4) {
				System.out.println("�� ��° ��ư Ŭ��");
			}
			else {
				System.out.println("�߸��� ����");
			}
		}
		
	}
	
	Button bt1 = new Button("1");
	Button bt2 = new Button("2");
	Button bt3 = new Button("3");
	Button bt4 = new Button("4");
}

public class TestInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
