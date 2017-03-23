package march23;


/*
 * ������ ä�� ���α׷� �����
 * 
 * 1. �ó�����(���μ���) ����
 * 
 * 1) ȭ�鿡 �θ� â�� �����
 * �θ� â���� ������ ���� ���ϱ� : ��ǻ�� �ּ� + ��Ʈ ��ȣ + ���� ��ư + ��� ��ư
 * 
 * ��ǻ�� �ּҸ� ǥ���� ������Ʈ �����ϱ� : ��(���) + ����� �Է� â(�ؽ�Ʈ �ʵ�)
 * -> ���� ������ ����ڿ��� �Է��� ������ �˷��� 
 * 
 * ��Ʈ ��ȣ�� ǥ���� ������Ʈ ���� : �� + ����� �Է� â
 * 
 * ���� ��ư�� ǥ���� ������Ʈ ���� : ��ư(������)
 * 
 * ��� ��ư�� ǥ���� ������Ʈ ���� : ��ư(������)
 * 
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/*
 * Frame Ŭ������ ����ϰ� ����ڰ� Ŭ�� �̺�Ʈ�� �߻��ϸ� ������ ��ɹ��� ����
 * ActionListener �������̽��� �����ϴ� �ڽ� Ŭ���� �����
 * 
 * class �ڽ�Ŭ�����̸� extends Frame implements ActionListener {
 * 
 * }
 * class �ڽ�Ŭ�����̸� extends Frame implements ActionListener, TextListener, WindowListener, KeyListener, MouseListener {
 * 
 * }
 * 
 * ������ ���� �̺�Ʈ ó���� ����� �� �ִ� Ŭ���� �Ǵ� �������̽� �̸�
 * Ŭ���� �̸��� WindowAdapter
 * �������̽��̸��� WindowListener
 */

/*
 * ����ڰ� ���� ��ư�� Ŭ���� ��쿡 ����Ǵ� System.exit(0) ��ɹ��� ���� 
 * windowClosing() �Լ��� �����
 * 
 * -> ���� Ŭ������ ���� �Ŀ� windowClosing() �Լ��� ����� System.exit(0) ��ɹ� �ֱ�
 * -> �̸� : �˾ƺ��� ���� -> ���� �ǹ̸� ������ �̸� �����
 * -> MyWindowClosingEventHandler
 */

class MyWindowClosingEventHandler extends WindowAdapter {
	
	// ����ڰ� ���� ��ư(x) Ŭ���� ��� ����Ǵ� ��ɹ� �����
	// windowClosing() �Լ� �ȿ� �ֱ�
	@Override
	public void windowClosing(WindowEvent we) {
		System.exit(0);
		
	}
	
}

/*
 * ������ ���� MyWindowClosingEventHandler Ŭ���� ����Ϸ���
 * new MyWindowClosingEventHandler() ��ü�� �޸𸮿� ������ ��
 * 
 * -> addWindowListener() �޼ҵ� �ȿ� ������ ���� ��ü�� �־��־�� ��
 * 		-> addWindowListener( new MyWindowClosingEventHandler());
 * 
 * �Ǵ� 
 * MyWindowClosingEventHandler �����������̸� = new MyWindowClosingEventHandler();
 * addWindowListener (�����������̸�) ;
 */
// ����(�θ� ������)�� ȭ�鿡 ������ִ� Ŭ���� �����

class MyParentFrame extends Frame implements ActionListener {
	
	/*
	 * 
	 * ����â�� ������ ������Ʈ���� �غ�
	 */
	
	// ��ǻ�� �ּ� ��� �� �غ�
	private Label comp_ip_addr_lb = new Label("��ǻ�� �ּ� : ");
	
	//  ���� ��ǻ�� �ּҸ� �Է� �� �Է� â
	private TextField comp_ip_addr_tf = new TextField("",30);
	
	// ��Ʈ ��ȣ ��� ��
	// ��Ʈ ��ȣ : ���α׷� ���̵�
	private Label comp_port_no_lb = new Label("��Ʈ ��ȣ : ");
	
	// ����ڰ� ��Ʈ ��ȣ�� �Է� �� �� �ִ� �Է� â �����
	private TextField comp_port_no_tf = new TextField("", 10);
	// ������ ��ȣ�� ��Ʈ ��ȣ�� ���߿� ���� ���α׷��� ����ȭ �Ǿ�� ��
	// ���� ���α׷����� ���ϰ� �� ���� �о�ͼ� ���
	// ���α׷����� ����ڰ� ���� ��ư�� Ŭ���ϴ� ��쿡 �� 
	
	// ������ �� ��ǻ�Ͱ� Ŭ���̾�Ʈ + ���� 
	// ������ �ּ� : localhost -> 127.0.0.1 -> �� �ڽ� ��ǻ�͸� �������ִ� ������ ��ȣ
	// -> �ܺο� �ִ� ��ǻ�Ϳ� �����ϴ� ��쿡�� ����� �� ���� ������ ��ȣ 
	
	// �����ϱ� ��ư �����
	private Button connect_bt = new Button("���� ����");
	
	// ������� ��ư �����
	private Button connect_cancel_bt = new Button("���� ���");
	
	// ������Ʈ���� ���� ũ�⸦ �����ϱ� ���� ��Ʈ �غ�
	private Font font = new Font("�ü�ü",Font.BOLD, 20);
	{
		this.comp_ip_addr_lb.setFont(font);
		this.comp_port_no_lb.setFont(font);
		this.connect_bt.setFont(font);
		this.connect_cancel_bt.setFont(font);
		this.comp_ip_addr_tf.setFont(font);
		this.comp_port_no_tf.setFont(font);
	}
	
	//�׸��� ���̾ƿ� ��ġ ������ ���
	private GridLayout grid_layout = new GridLayout(3,2,3,3);
	
	// �׸��� �� ���̾ƿ� ��ġ ������ : �÷�(ĭ) ������ ũ�⸦ ���� ����
	
	/*
	 * �׸��� ���̾ƿ� �ܵ� ���
	 * 
	 * �׸��� ���̾ƿ� + �ǳ� ȥ�� ���
	 * 
	 * �׸��� �� ���̾ƿ� = �׸��� ���̾ƿ� + �ǳ� ȥ��
	 */
	
	// �⺻ ������ �����
	public MyParentFrame() {
		// �θ��� Ÿ��Ʋ ���ϱ�
		super("Haley's Chatting Window");
		
		this.setLayout(grid_layout);
		
		
		// ��ư �̸��� ���� �������ؼ� �������
		// ���� ��ư�� "1"
		this.connect_bt.setActionCommand("1");
		// ���� ��� ��ư�� "0"
		this.connect_cancel_bt.setActionCommand("0");
	
		/*
		 * add �Լ� �̿��ؼ� ������ ���� ������Ʈ���� 
		 * �׸��� ���̾ƿ� �� �ֱ�
		 */
		this.add(comp_ip_addr_lb);
		this.add(comp_ip_addr_tf);
	
		this.add(comp_port_no_lb);
		this.add(comp_port_no_tf);
		
		this.add(connect_bt);
		this.add(connect_cancel_bt);
		
		
		// ������ â ���� �� �� �ְ� ���� �����
		
		// MyWindowClosingEventHandler window_closing = new MyWindowClosingEventHandler();
		// this.addWindowListener(window_closing);
		// �Ǵ� �̷��Ե� ���� 
		this.addWindowListener(new MyWindowClosingEventHandler());
	
		// ������ �ؽ�Ʈ �ʵ� & ��ư�� addActionListener�� ����
		
		this.comp_ip_addr_tf.addActionListener(this);
		this.comp_port_no_tf.addActionListener(this);
		this.connect_bt.addActionListener(this);
		this.connect_cancel_bt.addActionListener(this);
		
		// ���� ����� �ƴ��� Ȯ�� �ϱ� ���� ActionEvent�� �̵� 
		
		
		this.setSize(300,130);
		this.setVisible(true);
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		/*
		 * ����ڰ� �����ϱ� ��ư�� ���� ��쿡�� ȭ�鿡 �޽����� ģ������
		 * �Է��ϰ� ������ �� �ִ� ���̾�α� â�� ����ؾ���
		 * 
		 */

		// �ϴ� �̺�Ʈ �߻��� ��ġ�� �ּҸ� �����ϴ� ���� ����
		Object event_source = e.getSource();
		
		// instanceof�� �̿��ؼ� �̺�Ʈ�� ��ư���� �߻��ߴ���
		// �ؽ�Ʈ �ʵ忡�� �߻��ߴ��� if���� �Բ� Ȯ��
		
		if(event_source instanceof Button) {
			// ����ڰ� ��ư�� Ŭ�� ���� ��
	
		
			// �ϴ� ���� ���� ���
			System.out.println("��ư Ŭ��");
			
			// Button Ŭ������ ���� �ִ� �Լ����� �� ��� �ϱ� ���ؼ� 
			// Button ���� ���� ��, event_source�� Button ������ ����ȯ �ϱ�
			
			Button clicked_bt = (Button)event_source;
			
			// ��ư ���� ������ ���� �ο��ϱ�
			// ���� -> 1, ��� -> 0���� �̸� �ο�!!
			// ������ ��ư���� ���� �ο��� �̸��� �˾ƿ��� �Լ�
			String action_command = clicked_bt.getActionCommand();
			// �ٸ� ���! 
			/*
			 * if(clicked_bt == connect_bt) { } 
			 *	// ������ ������ ������ ���� �ᵵ �� 
			 *
			 *�� �ٸ� ��� : Button Ŭ������ ���� �ִ� getLabel() �Լ� ����ؼ� �� �ؽ�Ʈ ���� ���� �� �� ����
			 * new Button("�� �ؽ�Ʈ")
			 * 		-> setLabel() �Լ��� ����ؼ� �� �ؽ�Ʈ�� �ٸ� �ؽ�Ʈ�� ���� ����
			 * 			-> ��ư�����̸� .setLabel("���ο� �� �ؽ�Ʈ");
			 *
			 */
			
			
			// if���� ����ؼ� ����ڰ� Ŭ���� ��ư�� 1(����)���� 0(���)���� Ȯ��
			if(action_command.equals("1") == true) {
				// ����ڰ� ���� ���� ��ư�� Ŭ������ �� �����ϴ� ��ɹ� �ۼ�
				System.out.println("����ڰ� ���� ��ư�� �Է�");
				
				/*
				 * Dialog Ŭ������ ����ؼ� ȭ�鿡 ����� �ڽ� â�� �����
				 * 
				 * 1. ���� �θ� â�� �ּҴ� this�� ���� ����
				 * 2. ���̾�α� Ÿ��Ʋ ���ڿ� ���� : ģ������ �޽��� ���� â
				 * 3. ��� ���� ���� ���� : ����� true, �ƴϸ� false
				 * 
				 * Dialog ���ο��ڽ�â�ּҺ������� = new Dialog(this, "Ÿ��Ʋ", true);
				 * 		-> ���ο� �ڽ� â�� ��� â���� ����
				 * 
				 * Dialog ���ο��ڽ�â�ּҺ������� = new Dialog(this, "Ÿ��Ʋ", false);
				 * 		-> ���ο� �ڽ� â�� ��޸��� â���� ����
				 * 
				 */

				
				Dialog child_dialog_ob = new Dialog(this,"Send Message Window", true);
				
				/*
				 * Dialog�� ���� �ִ� �⺻ ��ġ �����ڴ� BorderLayout
				 */
				// ��� ��ġ�� ���ο� ��ư�� �ֱ�
				Button ref_new_bt = new Button("Send Message");
				child_dialog_ob.add(BorderLayout.SOUTH, ref_new_bt);
				
				// ���� �ؽ�Ʈ �ʵ� �����
				TextField input_ms = new TextField("", 50);
				child_dialog_ob.add(BorderLayout.CENTER,input_ms);
	
		
				// ���̾�α� ���� �̺�Ʈ ó��
				child_dialog_ob.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent we) {
					// ���� �ڽ�â�� �ּҸ� �˾ƿͼ� ������ ����
						Window ref_window = we.getWindow();
						
						// ���� �ڽ�â�� ȭ�鿡 ������� �ϱ�
						// dispose() �Լ��� ����
						ref_window.dispose();
					}
				});
				
				// ����ڰ� ref_new_bt�� Ŭ���� ��쿡�� ȭ��� �޽��� ��� â�� ����
				// javax.swing ��Ű���� �ִ� JOptionPane Ŭ������ ���� �ִ� showMessageDialog() ���
				ref_new_bt.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent ae) {
						JOptionPane.showMessageDialog(null,"����ڰ� ��ư�� �Է�");
					}
				});
				
				// ���̾�α��� ũ�� ����
				
				child_dialog_ob.setSize(300,300);
				child_dialog_ob.setVisible(true);
				
			}
			else if(action_command.equals("0") == true) {
				// ����ڰ� ���� ��� ��ư�� Ŭ������ �� �����ϴ� ��ɹ� �ۼ� 
				// ���α׷��� �����ϰڽ��ϴ�. ��� �˾�â �߰� ����
				System.out.println("����ڰ� ��� ��ư�� �Է�");
				JOptionPane.showMessageDialog(this,"���α׷��� �����ϰڽ��ϴ�.");
				System.exit(0);
				
			}
			
		}
		else if ( event_source instanceof TextField){
			// �̺�Ʈ�� �ؽ�Ʈ �ʵ忡�� �߻� ���� �� 
			
			// �ϴ� ���蹮�� ���
			System.out.println("�ؽ�Ʈ �ʵ忡 �Է�");
		}
		else {
			System.out.println("�߸��� ���� �Դϴ�.");
		}
		
	}
}

public class TestChattingProgramClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyParentFrame a = new MyParentFrame();

	}

}
