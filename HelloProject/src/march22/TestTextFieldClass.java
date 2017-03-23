package march22;

/*
 * ���α׷�(����) ���� : java.awt ��Ű���� �ִ� TextField ������Ʈ�� ����ؼ�
 * ����ڷκ��� �Է� �ޱ�
 * 
 */
// import ��ɹ��� Ŭ���� ���� ���� �ۼ��ؾ� ��

import java.awt.*;
// ����ڰ� ����� ���ο� ���(�̺�Ʈ)�� ó���ϴ� ��Ű���� �ִ�
// Ŭ�������� ����ϴ� import ��ɹ� �ۼ� 
import java.awt.event.*;

/*
 * TextField Ŭ������ ����ϴ� ���
 * 
 * -> �������� ���α׷��� -> ���� ������(â)�� ������ �մϴ�.
 * 		-> ���� TextField Ŭ������ ����� �� ���� ����
 * 			-> ������ ���������� ����� �Ұ�
 * 			��) TextField ���������̸� = null;
 * 			���������̸� = new TextField(���ڿ�, ����);
 * 
 * 			����� �Ұ��� : ������ ������� TextField ��ü�� �����쿡 ���� �� ���� ����
 * 
 * -> �������� ���α׷��ֿ��� ����(������ ���)
 * 1. ������ �����
 * 		Frame Ŭ������ ��� ( �ּ�ȭ ��ư, �ִ�ȭ ��ư, ���� ��ư, �޴�, Ÿ�̺v ���)
 * 			1) �ٷ� ����ϱ� ; 
 * 			Frame ���������̸� =null;
 * 			���������̸� = new Frame("Ÿ��Ʋ �ؽ�Ʈ �ۼ�");
 * 
 * 			2) ��� ����� ����ؼ� Frame Ŭ������ ���ο� Ŭ������ �θ� Ŭ������ ����
 * 			��) class ���ο�Ŭ�����̸� extend Frame { }
 * 
 * 			���ο�Ŭ�����̸� Ŭ������ ����ϱ� ���ؼ��� ���������� ����� new �����ڸ�
 * 			����� �޸� ���� ��ɹ��� �߰��� �ۼ��ؾ� �մϴ�.
 * 
 * 			���ο�Ŭ�����̸� ���������̸� = null;
 * 			���������̸� = new ���ο�Ŭ�����̸�();
 * 			
 * 
 * 		
 * 
 * 
 * 2. �����쿡 ���� ������Ʈ �����
 * 3. ���� ������Ʈ�� �����쿡 �ֱ�
 * 4. ����� �̺�Ʈ ó�� �ۼ��ϱ� : ���α׷� ���� �κ� ��ɹ� �ۼ�
 * 5. �����츦 ȭ�鿡 ���
 * 
 */

/* 
 * Frame Ŭ������ �����ؼ� ���ο� Ŭ������ ����� ���
 */
class MyChildFrame extends Frame {
	
}

/*
 * ���ο� Ŭ������ ���鶧 �θ� Ŭ������ �Ѱ�, �������̽��� ���� �� ���
 * -> �������̽� : ����ڰ� ���� ������ִ� ���(�̺�Ʈ) ó��  
 * -> ��) ��ư���� Ŭ�� �̺�Ʈ�� �߻��ϴ� ��쿡 �̷��� �̺�Ʈ�� ���α׷�����
 * 		ó���� �ֱ� ���ؼ��� java.awt.event ��Ű���� �ִ� ActionListener �������̽��� ��� 
 * 		(���� : �������̽��� ���� �ִ� �Լ��� �Ӹ� �κа� ��ü �κ��� �ڽ� Ŭ�������� �ۼ�) 
 * 
 * 		��) ActionListener �������̽��� Button�� TextField ������Ʈ���� ��� ����
 * 		��ư���� �߻��ϴ� Ŭ�� �̺�Ʈ
 * 		�ؽ�Ʈ �ʵ忡���� ���� �̺�Ʈ
 * 
 * class MyFrameEventHandler extends Frame implements ActionListener {
 *		// ActionListener �������̽��� ���� �ִ� �Լ��� �Ӹ� �κа� ������
 *		// �Լ��� ������ �ۼ��ؾ� ��
 *		// �߰��� �Լ��� ��ü �κе� �ۼ� : �Լ��� �Ӹ� �κ� + ��ü �κ�({})
 * }
 */

class MyFrameEventHandler extends Frame implements ActionListener {

	
	// ���ο� ��ư�� �غ��ϱ�
	private Button ref_button1_ob = new Button("1");
	
	// ���ο� ��ư�� �߰��غ���?
	private Button ref_button2_ob = new Button("2");
	private Button ref_button3_ob = new Button("3");
	private Button ref_button4_ob = new Button("4");
	
	// ���ο� �ؽ�Ʈ �ʵ� �غ��ϱ�
	private TextField ref_textfield_ob = 
			new TextField("input your name : ", 50);
	
	// �⺻ ������ ����� - > �ڹ� ���� �ӽſ� ���ؼ� ���� ���� ����Ǵ� �Լ�
	// {} ���� ������ �ι�°�� ����
	// public Ŭ�����̸�() { } 
	public MyFrameEventHandler() {
		super("Haley's Test Window"); // ���⿡ �Էµ� ���ڰ� ������ ���� â�� ���
		// super(); �� �⺻���� �����Ϸ��� �ۼ��ϴ� ��ɹ�
		// super(���ڿ�); -> Frame Ŭ������ �ִ� ������ �߿��� �ϳ��� ���ڿ��� �޴� �����ڸ� ����
		// public Frame(String value) { }
		
		// ������ ���� �̺�Ʈ ��ɹ� �ۼ��ϱ�
		/*
		 * addWindowListener() �Լ��� ����
		 * + new �̺�Ʈ ó�� Ŭ���� �Ǵ� �������̽� �̸� ()
		 * + ���� ���α׷� ���� ��ɹ�(System.exit(0))�� ����
		 * public void windowClosing(WindowEvent ref_window_event) {
		 * 
		 *  } �Լ� �ۼ�
		 *  
		 *  1. ������ ���� �̺�Ʈ ó�� ��ɹ� �ۼ�
		 *  -> addWindowListener() ��ɾ�
		 *  	-> ������ : �̺�Ʈ �߻� ���θ� üũ�ϴ� ���α׷�
		 *  		-> ������(Thread)�� �ٷ� �� �ڼ��� 
		 *  
		 *  2. ������ ���� �̺�Ʈ�� �߻��ϴ� ��쿡 ����Ǵ� 
		 *  new ������ ���� �̺�Ʈ ��� Ŭ���� �Ǵ� �������̽��̸� ()
		 *  -> �̺�Ʈ �߻��� �޸𸮿� ����
		 *  
		 *  3. ���� ���α׷��� �����Ű�� System.exit(0) ��ɹ��� ���� windowClosing()  �Լ� �ۼ�
		 *  
		 */
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent ref_window_event) {
				// ���α׷� ��ü�� �������ִ� ��ɹ� �ۼ� 
				System.exit(0);
			}
		});
		
		// add() �Լ��� ����ؼ� ������ ���� ��ư�� �ؽ�Ʈ �ʵ带
		// ������ �����쿡 �ֱ�
		// -> ������ �����찡 ����ϴ� ��ġ �����ڴ�BorderLayout
		// - > ��) ��� ��ġ�� �ִ� ��쿡�� ��ġ�� �ۼ����� �ʾƵ� �˴ϴ�.
		
		
		this.add(this.ref_textfield_ob);
		// �ؽ�Ʈ �ʵ�� BorderLayout ��ġ �����ڰ� ���� �ִ� ��� ��ġ�� �ֱ�
		
		// ��ư�� �Ʒ� ��ġ�� �ֱ� -> ��ġ �̸��� BorderLayout.SOUTH
		this.add(BorderLayout.SOUTH, this.ref_button1_ob);
		/*this.add(BorderLayout.NORTH, this.ref_button2_ob);
		this.add(BorderLayout.EAST, this.ref_button3_ob);
		this.add(BorderLayout.WEST, this.ref_button4_ob);*/
		
		// ��ư�� �ؽ�Ʈ �ʵ忡�� �߻��ϴ� �̺�Ʈ�� ���α׷����� ó���ϱ�
		// ���ؼ� ������ ������Ʈ���� �̺�Ʈ �����ʿ� ���
		// -> ��ư ��ü ���� �����̸� . addActionListener(this);
		this.ref_textfield_ob.addActionListener(this);
		this.ref_button1_ob.addActionListener(this);
	/*	this.ref_button2_ob.addActionListener(this);
		this.ref_button3_ob.addActionListener(this); 
		this.ref_button4_ob.addActionListener(this);
	*/
		// �̰� �ؾ��� ��ư�� Ŭ������ �� ���� ���ڰ� ����
		
		// this -> �޸��� �ּ�   �ϴ� ��
		
		/*
		 * �� �ۼ��ؾ��ϴ� ��ɹ� Ȯ��
		 * 1) ������(â) ũ�� �����ϱ�
		 * -> setSize( �������� ���� ũ��, �������� ���� ũ��);
		 */
		this.setSize(500,500);
		
		/*
		 * 2) �����츦 ȭ�鿡 ����ϱ� 
		 * -> setVisible() �Լ� ���
		 * -> setVisible(true);
		 */
		this.setVisible(true);

		
		
	}
	// ActionListener �������̽��� ���� �ִ� �Լ��� �Ӹ� �κа� ��ü �κ���
		// �ۼ� -> ������ �Լ� -> �θ��ʿ��� ������ ��ɹ��� ������� �ʰ� 
		// ���ο� ��ɹ��� �ۼ��ϴ� ��
	@Override // ��� �� - �������̵� �ߴٰ� �����Ϸ��� �˷��� 

	public void actionPerformed(ActionEvent actionEvent) {
		
		System.out.println("***�̺�Ʈ �߻�***");
		/*
		 * 1. �̺�Ʈ�� �߻��� ���� �о����
		 * -> actionEvent ������ ���� �ִ� getSource() �Լ��� ����
		 * -> getSource() �Լ��� ��ȯ���� Object(��� Ŭ������ ������ �� �ִ� �θ� Ŭ�����̸�)
		 * 												-> ��� Ŭ������ �ڵ� �θ� Ŭ������ Object
		 * 												-> �θ� Ŭ������ �Ѱ��� ����
		 * 												-> Object Ŭ������ ����ؼ��� ��� �ڽ� Ŭ������ �̵� ����
		 * 												-> �޸𸮿� ������ ��� �ڽ� Ŭ������ ���� ���� 
		 * 			��) Object ���������̸� = new Object();
		 * 		        Object ���������̸�2 = new �ٸ� �ڽ� Ŭ�����̸�();
		 * 				Object ���������̸�3 = new �ٸ� �ڽ� Ŭ�����̸�2();
		 *  �θ� Ŭ������ ���� ���� ��� : �θ� Ŭ���� ���� ���� ������ �ʿ�
		 *  	�θ� Ŭ�����̸�1 ���������̸�1 = null;
		 *  	�θ� Ŭ�����̸�2 ���������̸�2 = null;
		 *  	�θ� Ŭ�����̸�3 ���������̸�3 = null;
		 */
		
		// getSource() �Լ��� �����ؼ� �̺�Ʈ�� �߻��� ���� �ּҸ� ��������
		Object ref_event_ob = actionEvent.getSource();
		
		// instanceof ������ ��ɾ ����ؼ� �̺�Ʈ�� �߻��� ����
		// ��ư����, �ؽ�Ʈ �ʵ� ������ ��������
		
		// if (  ���������̸� instanceof Ŭ�����̸� ) 
		if(ref_event_ob instanceof Button) {
			
			/*
			 * instanceof �����ڴ� ���� ������ ref_event_ob�� ����ؼ� �޸𸮿� �����ؼ� 
			 * �޸𸮿� Ŭ������ �˾� ��
			 * 
			 * ���� �޸��� Ŭ������ Button�� ��� ��(true) ��ȯ(����)
			 * �޸��� Ŭ������ Button�� �ƴ� ��� ����(false) ��ȯ(����)
			 */
			System.out.println("����ڰ� ��ư�� �������ϴ�.");
			
			/*
			 * �� �ۼ��ؾ��ϴ� ��ɹ��� ����ȯ �����ڸ� ����ؼ�
			 * Object Ŭ������ Button Ŭ������ �ٲپ� �־�� �մϴ�.
			 * (Button) ���� ���� �̸�
			 * 
			 * 		-> �� ? ���� ���� ���� �̸��� ����ؼ��� Object Ŭ������ �ִ�
			 * 			�޼ҵ常 ���డ���ϱ� ����
			 * 			Button Ŭ������ �ٲٸ� Button Ŭ������ �ִ� �޼ҵ带 ���� ���� 
			 * 	
			 */
			Button ref_clicked_button = (Button)ref_event_ob;
			
			/*
			 * Button Ŭ������ ���� �ִ� getActionCommand() �Լ��� �����ؼ�
			 * ��ư�� ���� �ִ� ��(�ؽ�Ʈ �Ǵ� ���ڿ�)�� �����ɴϴ�.
			 * -> ��ư�� �����ϱ� ���ؼ� 
			 */
			String ref_action_command = ref_clicked_button.getActionCommand();
			
			/*
			 * ��ư���� ������ ���� Ȯ���ϱ� ���ؼ� ȭ�鿡 ���
			 * 
			 * ��) Button ���������̸� = new Button("1");
			 * getActionCommand() �Լ��� "1" ���ڿ��� ��ȯ(�о��)
			 * 
			 */
			System.out.println("����ڰ� Ŭ���� ��ư�� " + ref_action_command);
			
			
			
		} else if (ref_event_ob instanceof TextField) {
			
			System.out.println("����ڰ� �ؽ�Ʈ�� �Է��߽��ϴ�.");
			/*
			 * ����ڰ� �Է��� �ؽ�Ʈ�� �����ͼ� �ܼ� ȭ�鿡 ���
			 */
			// 1. ����ȯ ������(Ŭ���� �̸�)�� ����ؼ�
			// Object Ŭ������ TextField Ŭ������ �ٲٱ�
			// -> TextField ������ ���� ���� = (TextField)ref_event_ob;
			
			TextField ref_textfield_ob = (TextField)ref_event_ob;
			
			// 2. TextField Ŭ������ ���� �ִ� getText() �Լ��� �����ؼ�
			// ����ڰ� �Է��� �ؽ�Ʈ�� ��������
			String input_text = ref_textfield_ob.getText();
			
			// 3. Ȯ���ϱ� ���ؼ� �ܼ� ȭ�鿡 ����ڰ� �Է��� �ؽ�Ʈ�� ����ϱ�
			System.out.println("����ڰ� �Է��� �ؽ�Ʈ�� " + input_text);
			
			// 4. ����ڰ� �Է��� �ؽ�Ʈ�� ������� setText() �Լ��� ����ϸ� ��
			// -> setText(���ڿ�) -> setText("");
			ref_textfield_ob.setText("select");
			
			if(ref_textfield_ob.getText().equals("") == false) {
				
			
			
			// 5. ����ڰ� �Է��� �ؽ�Ʈ ��ü�� �����Ϸ��� selectAll() �Լ� ���
			ref_textfield_ob.selectAll();
			
			// 6. ���õ� �ؽ�Ʈ�� ���������� getSelectedText() �Լ� ���
			String seleted_text = ref_textfield_ob.getSelectedText();
			
			// 7. ���õ� ��� �ؽ�Ʈ�� �����ͼ� ȭ�鿡 ����ϱ�
			System.out.println("���õ� ��� �ؽ�Ʈ�� "  + seleted_text);
			
			// 8. ����ڰ� �Է��� �ؽ�Ʈ�� ȭ�鿡 �������� ��������
			// setEchoChar() �Լ��� ���
			// -> setEchoChar(����) -> setEchoChar('*') -> ����ڰ� �Է���
			// �ؽ�Ʈ�� ��ǥ ���ڷ� �ٲ� ȭ�鿡 ���
			ref_textfield_ob.setEchoChar('*');
			
			} // end of if
			
		}
		
	}
	
}
	

public class TestTextFieldClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� MyFrameEventHandler Ŭ������ ����ϱ�
		// 1. ���� ���� ����
		MyFrameEventHandler ref_frame_ob = null;
		
		// 2. new �����ڸ� ����ؼ� MyFrameEventHandler Ŭ������ �޸𸮿� ����
		// ������ �޸��� �ּҸ� ���� ������ ����( = ��ȣ ���);
		// ���� ���� �̸� = new MyFrameEventHandler();
		ref_frame_ob = new MyFrameEventHandler();
		

	}

}
