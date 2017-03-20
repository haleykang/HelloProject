package march20;

import java.awt.*;
import java.awt.event.*;

/*
 * FlowLayout ��ġ �����ڸ� ����ϴ� ����
 * BorderLayout ��ġ �����ڸ� FlowLayout ��ġ �����ڷ� �ٲٱ�
 * 
 * -> Frame Ŭ������ ���� �ִ� setLayout() �Լ��� ����ؾ� ��ġ �����ڸ� ���� ����
 * 
 * ��) 
 * 1. Frame ref_frame = new Frame("������ Ÿ��Ʋ");
 * 2. ref_frame.setLayout(���ο� FlowLayout() ��ü ����);
 * -> �⺻������ Frame Ŭ������ ���� �ִ� BorderLayout ��ġ �����ڰ�
 * FlowLayout ��ġ �����ڷ� ���� �� 
 * 
 * -> ref_frame.setLayout(null); // ��ư�� ��ġ�� ũ�⸦ �����ؾ���
 * 
 * 
 */

// ���α׷� ���Ḧ ó�����ִ� Ŭ���� �����
/*
class MyWindowClosingClass777 extends java.awt.event.WindowAdapter {
	public void windowClosing(java.awt.event.WindowEvent we) {
		System.exit(0);
	}
}*/
/*
 * ��ó�� �ϸ� �׻� �θ� Ŭ���� ���� + �����ϴ� �Լ� + ��ɹ� �ۼ�
 */
/*
 * �� �����ϰ� �ϴ� ��� : new Ŭ�����̸�() -> ��ȸ�� ��ü�� ���� ������
 * ���� ���� ��ü�� �ּҸ� Ư�� �޼ҵ忡 �����ϴ� ���
 * 
 * thi.addWindowListener(new WindowAdapter() {
 * public void windowClosing(WindowEvent we) {
 * System.exit(0);
 * }
 * });
 * 
 * 1. new WindowAdapter() ��ɾ� ���� -> �޸𸮿� WindowAdapter Ŭ������ ����
 * 2. �޸𸮿� �� ��ɹ��� ���� �޼ҵ带 ������ ->public void �޼ҵ��̸�(�Է� ���� ����) {}
 * 3. {} �߰�ȣ �ȿ� ��ɹ� �ۼ� 
 * -> extends ��ɾ�� �θ� Ŭ������ ���� ���� 
 */

import java.awt.*;
import java.awt.event.*;

public class TestFlowLayoutClass extends Frame {
	// ���� ���� ��ư���� ���� �� �ִ� FlowLayout ��ġ ������ �����
	FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT, 5, 5);
	
	// 5���� ��ư���� ������ �� �ִ� �迭 ����� 5���� �ּҸ� ������ �� �ִ� ���� �����
	Button [] button_array = new Button [5];
	
	// �����ڸ� ���� ������ 5���� ��ư���� ����
	public TestFlowLayoutClass() {
		for(int i = 0 ; i < button_array.length; ++i) {
			button_array[i] = new Button((i+1) + ""); // "1","2"...
		}
		
		
		// setLayout() �Լ��� �����ؼ� BorderLayout -> FlowLayout���� ����
		this.setLayout(flowLayout);
		// ������ 5���� ������ ����� �� ����
		// ������ ������ ��ġ �����ڸ� ���
		
		// ������ ��ġ �����ڿ� 5���� ��ư���� �ֱ�
		for(int i = 0; i < button_array.length; ++i) {
			this.add(button_array[i]);
			
		}
		
		// ������ ���� �̺�Ʈ
		// new Ŭ�����̸�() ��ɾ ���� ��� 
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		// ������ ��ư���� �߻��ϴ� Ŭ�� �̺�Ʈ�� �ޱ� ���� ��ɹ� �ۼ�
		for(int i = 0; i < button_array.length; ++i) {
			button_array[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent ae) {
					// TODO Auto-generated method stub
					System.out.println("����ڰ� ��ư�� Ŭ���߽��ϴ�.");
					
				}
			});
		}
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestFlowLayoutClass ref_frame = new TestFlowLayoutClass(); 

	}

}
