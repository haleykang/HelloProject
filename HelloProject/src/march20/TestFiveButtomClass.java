package march20;

/*
 * Frame Ŭ������ �⺻ ���̾ƿ� ��ġ �������� BorderLayout Ŭ������ ����ؼ�
 * ������ ���⿡ 5���� ��ư�� �����ִ� ����
 */

import java.awt.*;
import java.awt.event.*;

/*
 * ���α׷� ����(������ �ݱ� ����)�� ���ִ� Ŭ���� �����
 */
class MytFiveButtomWindowClosing extends WindowAdapter {
	
	// �ڹ� ���� �ӽ��� �����ϴ� windowClosing(�̺�Ʈ ������ �޴� ���� ����)
	// �Լ��� ������
	public void windowClosing(WindowEvent windowEvent) {
		System.exit(0);
	}
}

/*
 * Frame Ŭ������ ��� �޴� ���ο� �ڽ� Ŭ���� �����
 * -> Frame Ŭ������ �����ϴ� ��� 
 * : Frame Ŭ������ ���� �ִ� ����/���/�Լ� ���� �����.
 */

class MyChildFrame extends Frame {
	
	/*
	 *  5���� ��ư ��ü�� ����� ��ɹ� �ۼ�
	 */
	private Button button1 = new Button("butotn1");
	private Button button2 = new Button("butotn2");
	private Button button3 = new Button("butotn3");
	private Button button4 = new Button("butotn4");
	private Button button5 = new Button("butotn5");
	

	
	private String window_title = "";
	/*
	 * �⺻ ������ �Լ��� ����� new Ŭ�����̸�() ��ɾ ����Ǵ� ������
	 * �ڹ� ���� �ӽſ� ���ؼ� �ڵ����� ���� 
	 */
	
	public MyChildFrame() {
		
		// super() -> �θ� Ŭ������ ���� �ִ� �����ڸ� ���� -> �θ� Ŭ�������� 
		// ������ Ÿ��Ʋ ���ڿ��� ����
		super("my five button window");
		this.window_title = "my five button window";
		
		// ù��° ��ư�� ��� ��ġ�� �ֱ�
		this.add(BorderLayout.CENTER, this.button1);
		this.add(BorderLayout.WEST, this.button2);
		this.add(BorderLayout.EAST, this.button3);
		this.add(BorderLayout.NORTH, this.button4);
		this.add(BorderLayout.SOUTH, this.button5);

	}
	
	public MyChildFrame(String window_title) {
		// �ڵ����� ������� �ʰ� new Ŭ�����̸�(���ڿ�) -> ����
		this.window_title = window_title;
		
	}
	
}

public class TestFiveButtomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyChildFrame ref_frame = new MyChildFrame();
		
		
		ref_frame.setSize(100,100);
		ref_frame.addWindowListener(new MyWindowClosingClass());
	
		ref_frame.pack(); // �ڵ����� ũ�� ���ڰ�
		ref_frame.setVisible(true);
	
	}

}
