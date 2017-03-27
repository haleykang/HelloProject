package march22;

/*
 * �α��� ȭ���� ����� ����ڰ� ���̵�� ��й�ȣ�� �Է� �� �� �ֵ��� ��
 * 
 * ����ڰ� �Է��� ���̵�� ���� ���� ���̵� ���� ����� �̸� ����
 * -> public static final String ID = "id1";
 * 
 * ����ڰ� �Է��� ��й�ȣ�� ���� ���� ��й�ȣ ���� ����� �̸� ����
 * -> public static final String PWD = "pwd1";
 */

import java.awt.*;
import java.awt.event.*;

/*
 * Frame Ŭ������ ��� �ް� ActionListener �������̽��� ������ 
 * ���ο� �ڽ� Ŭ���� �����
 */
class LoginFrame extends Frame implements ActionListener {
	
	/*
	 * ��� ȭ�� �����ϱ�
	 * 
	 * ù��° �� - ID : ��� �󺧰� ���̵� �Է� �ؽ�Ʈ �ʵ� ���
	 * �ι�° �� - Password : ��� �󺧰� ��й�ȣ �Է� �ؽ�Ʈ �ʵ� ���
	 * ����° �� - Login ��ư / Logout ��� ��ư
	 *
	 * -> ����� ��ġ �����ڸ� ����
	 * 		1) setLayout(null)
	 * 		2) �׸��巹�̾ƿ�
	 *		3) �� �� ��� 
	 */
	
	
	// ù��° �ٿ��� ����� ID : �� �غ�
	private Label id_label = new Label("ID");
	
	
	// ù��° �ٿ��� ����� ���̵� �Է� â �غ��ϱ� 
	private TextField id_tf = new TextField("",20);
	
	// �ι�° �ٿ��� ����� Password : �� �غ�
	private Label pw_label = new Label("Password");
	
	
	// �ι�° �ٿ��� ����� ��й�ȣ �Է� â �غ�
	private TextField pw_tf = new TextField("",20);
	
	// ����° �ٿ��� ����� �α��� ��ư
	private Button login_bt = new Button("Login");
	
	
	// ����° �ٿ��� ����� �α׾ƿ� ��ư
	private Button cancel_bt = new Button("Cancel");
	
	// �׸��� ���̾ƿ� ��ġ ������ �غ�(3�� 2�� ǥ�� �����
	// �ȿ� ���� ������Ʈ�� ���� ������ 2��
	private GridLayout gridLayout = new GridLayout(3,2,2,2);
	
	// ����ڰ� �Է��� ���̵�� ���� �� ����� ���̵�� ����� ����
	public static final String ID = "kjj8032";
	
	// ����ڰ� �Է��� ��й�ȣ�� ���� �� ����� ��й�ȣ�� ����� ����
	public static final String PWD = "20857819";
	
	// ����ڰ� �Է��� ���̵� �����Ѵ� ���� ����� �ʱ�ȭ
	private String input_id = "";
	
	// ����ڰ� �Է��� ��й�ȣ�� �����ϴ� ���� & �ʱ�ȭ
	private String input_pw = "";
	
	// ���� ȭ�� ũ�⸦ �����ϴ� ���� ����
	private Dimension screen_size = null;
	
	// ��Ʈ ����

	private Font font = new Font("����", Font.PLAIN, 13);
		{
			this.id_label.setFont(font);
			this.pw_label.setFont(font);
			this.login_bt.setFont(font);
			this.cancel_bt.setFont(font);
			
		}
	
	/*
	 * Dimension : ȭ���� �簢�� ũ�⸦ �����ϰ� �������ִ� Ŭ����
	 * // -> ���� ũ��� int width ������ ����
	 *  // - > ���� ũ��� int height ������ ����
	 *   
	 */
	
	// �⺻ ������ �����
	
	public LoginFrame() {
		super("Haley's Window");
		
		// setLayout �Լ��� ����� Frame Ŭ�������� ���� �ִ�
		// ���� �������� BorderLayout�� GridLayout ���� �ٲٱ�
		this.setLayout(gridLayout);
		
		// add() �Լ��� ����� ������ ���� ������Ʈ���� �׸��� ���̾ƿ����� �־���
		
		// �α��� ��ư���� ���ο� ����̸� 1�� ���� -> ��ư�̸�.setActionCommand("1");
		this.login_bt.setActionCommand("1");
		this.cancel_bt.setActionCommand("0");
		
		this.pw_tf.setEchoChar('��');
		
		
		this.add(this.id_label);
		this.add(this.id_tf);
		
		// �ι��� ��
		this.add(this.pw_label);
		this.add(this.pw_tf);
		
		// ������ ��
		this.add(this.login_bt);
		this.add(this.cancel_bt);
		
		/*
		 * ����ڰ� ������ ���� ��ư�� Ŭ���ϴ� ��쿡 ����Ǵ� ��ɹ� �ۼ�
		 */
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
		
		// ����ڰ� ���̵� �Է��ϰ� ���� Ű�� ������ ��쿡 �߻��ϴ�
		// ActionEvent �̺�Ʈ�� ó���ϱ� ���� ��ɹ� �ۼ�
		this.id_tf.addActionListener(this);

		// ����ڰ� ��й�ȣ �Է��� ����Ű ������ ���
		this.pw_tf.addActionListener(this);
		
		// ����ڰ� �α��� ��ư Ŭ���ϴ� ���
		this.login_bt.addActionListener(this);
		
		// ����ڰ� ��� ��ư Ŭ���ϴ� ���
		this.cancel_bt.addActionListener(this);
		
		this.setSize(250,100);
		//this.pack();
		this.setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		/*
		 * 1. ���� �̺�Ʈ�� �߻��� ��ü�� �ּҸ� �����ͼ� ������ ����
		 * -> Object ���������̸� = ae.getSource();
		 */
		Object ref_event_ob = ae.getSource();
		
		/*
		 * 2. instanceof �����ڸ� ����ؼ� �̺�Ʈ�� �߻��� ���� �˻�
		 */
		if(ref_event_ob instanceof Button) {
			
			System.out.println("����ڰ� ��ư Ŭ��");
			/*
			 * Button Ŭ������ ���� �ִ� �Լ����� ����ϱ� ���ؼ� ����ȯ �ϱ�
			 */
			Button ref_clicked_button = (Button)ref_event_ob;
			
			/*
			 * ����ڰ� Ŭ���� ��ư�� �α��� ��ư���� �α��� ��� ��ư������ �Ǵ��ϱ� 
			 * -> ��ư ���� ���ο� ��� �̸�(������ �̸�)�� �ο��ϱ�
			 * 		-> setActionCommand("���ο� ����̸�(������ �̸�)")
			 * 		-> �α��� ��ư�� ���ο� ����̸����� ���� 1�� �����ϱ�
			 * 		-> login_btn.setActionCommand("1")
			 * 			-> �Ʒ� �κп����� login_btn == "1"(����)
			 */
			// ������ ��ư���� ���� �ο��� ��� �̸��� �˾ƿ���
			// -> getActionCommand() �Լ� ���
			String action_command = ref_clicked_button.getActionCommand();
			
			// ������ ��ư���� �о�� ��� �̸��� ���ؼ� �α��� ��ư(1) ����
			// �α��� ��� ��ư(0) ������ �����ϱ� // 0�̳� 1�� ���� �����ϴ°�
			if(action_command.equals("1") == true) {
				System.out.println("����ڰ� �α��� ��ư�� Ŭ��");
				
				/*
				 * ����ڰ� �Է��� ���̵� ���� �о�ͼ� �ӽ� ������ ����
				 */
				
				
				String temp_id = id_tf.getText().trim();
				String temp_pw = pw_tf.getText().trim();
				
				
				// if���� ����ؼ� ����� �Է��ߴ��� ���θ� �˻�
				if(temp_id.equals("") == true && temp_pw.equals("") == true) {
					// ���̵�� ��й�ȣ �Ѵ� �Է��� �ȵ� ���
					System.out.println("���̵�� �н����带 �Է����� �����̽��ϴ�.");
					System.out.println("����ڰ� ���̵� �Է� �� �� �ֵ���");
					System.out.println("������ id_tf �ؽ�Ʈ �ʵ� �Է� â���� �̵�");
					
					javax.swing.JOptionPane.showMessageDialog(this,"���̵�� ��й�ȣ�� �Է��ϼ���.");
					// setFocusable () �Լ��� ����ؼ� TextField ������Ʈ�� 
					// Ŀ���� �� �� �ֵ��� �غ�
					id_tf.setFocusable(true);
					
					//requestFocus() �Լ��� ����ؼ� ������ Ŀ���� ��ġ��
					// TextField ������Ʈ�� �̵�
					id_tf.requestFocus();
					
					//actionPerformed() �Լ��� Ż��
					return;
					
				} else if(temp_id.equals("") == false && temp_pw.equals("") == true) {
					// ���̵�� �Է��ߴµ� ��й�ȣ�� �Է� ����
					System.out.println("����ڰ� �н����带 �Է����� �ʾҽ��ϴ�.");
					// ��й�ȣ �Է� ��û â ���� Ŀ���� ��й�ȣ��...
					javax.swing.JOptionPane.showMessageDialog(this,"��й�ȣ�� �Է��ϼ���");
					
					pw_tf.setFocusable(true);
					pw_tf.requestFocus();
					return;
					
				} else if(temp_id.equals("") == true && temp_pw.equals("") == false) {
					// ��й�ȣ�� �Է��ϰ� ���̵�� �Է� ����
					System.out.println("����ڰ� ���̵� �Է����� �ʾҽ��ϴ�.");
					// Ŀ���� ���̵� â���� // �̰� �ð��Ǹ� �Լ��� ������..
			
					id_tf.setFocusable(true);
					id_tf.requestFocus();
					return;
				} else if (temp_id.equals("") == false && temp_pw.equals("") == false){
					// ����ڰ� ���̵�� �н����带 �Ѵ� �Է��� 
					// ���� ����� ���̵�� ��й�ȣ�� ����� ��
					
					System.out.println("����ڰ� �Է��� ���̵�� " + temp_id);
					System.out.println("����ڰ� �Է��� ��й�ȣ�� " + temp_pw);
					
					System.out.println("���� ������ �����ϱ�");
					input_id = temp_id;
					input_pw = temp_pw;
					
					
					
					
					
					/*System.out.println("����ڰ� ��й�ȣ�� �Է� �� �� �ֵ���");
					System.out.println("Ŀ���� ��ġ�� �Է� â���� �̵��ϱ�");*/
					
					/*pw_tf.setFocusable(true);
					pw_tf.requestFocus();*/
					
					//public static final String ID = "id1";
					// public static final String PWD = "pwd1";
					
					// �´� ID�� PW�� �´��� Ȯ��
					/*
					 * ����� �� (2������)
					 * 
					 * 1. id�� pw�� ���� -> ��...�α����� �Ǿ����ϴ�.
					 * 2. ���� �ϳ��� �ٸ� -> Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ��� -> 5�� �ݺ��Ŀ� ���̻� �Է� ����. 
					 * 
					 */
					
					if(input_id.equals(ID) == true && input_pw.equals(PWD) == true) {
						
						System.out.println("����ڰ� ���̵�� ��й�ȣ�� ����� �Է��߽��ϴ�.");
						javax.swing.JOptionPane.showMessageDialog(this,"�α��� �Ǿ����ϴ�.");
						System.exit(0);
						
					} else {
						System.out.println("���̵�� ��й�ȣ�� ���� �ʽ��ϴ�.");
						javax.swing.JOptionPane.showMessageDialog(this,"�߸� �Է� �ϼ̽��ϴ�.");
						
					}
					
					
					return;
				} 
				// ��й�ȣ
				
			
				
			} else if(action_command.equals("0") == true) {
				System.out.println("����ڰ� ��� ��ư�� Ŭ��");
				// â�� ����
				System.exit(0);
				
				
			} else {
				System.out.println("�� �� ���� ��ư �Դϴ�.");
			}
			
		} else if (ref_event_ob instanceof TextField) {
			System.out.println("����ڰ� �ؽ�Ʈ �ʵ� �Է� â���� ���� Ű�� �������ϴ�.");
			
			TextField ref_text_field = (TextField)ref_event_ob;
			
			///////////////////////////////
			
			String temp_id = id_tf.getText().trim();
			String temp_pw = pw_tf.getText().trim();
			
			
			// if���� ����ؼ� ����� �Է��ߴ��� ���θ� �˻�
			if(temp_id.equals("") == true && temp_pw.equals("") == true) {
				// ���̵�� ��й�ȣ �Ѵ� �Է��� �ȵ� ���
				System.out.println("���̵�� �н����带 �Է����� �����̽��ϴ�.");
				System.out.println("����ڰ� ���̵� �Է� �� �� �ֵ���");
				System.out.println("������ id_tf �ؽ�Ʈ �ʵ� �Է� â���� �̵�");
				
				javax.swing.JOptionPane.showMessageDialog(this,"���̵�� ��й�ȣ�� �Է��ϼ���.");
				// setFocusable () �Լ��� ����ؼ� TextField ������Ʈ�� 
				// Ŀ���� �� �� �ֵ��� �غ�
				id_tf.setFocusable(true);
				
				//requestFocus() �Լ��� ����ؼ� ������ Ŀ���� ��ġ��
				// TextField ������Ʈ�� �̵�
				id_tf.requestFocus();
				
				//actionPerformed() �Լ��� Ż��
				return;
				
			} else if(temp_id.equals("") == false && temp_pw.equals("") == true) {
				// ���̵�� �Է��ߴµ� ��й�ȣ�� �Է� ����
				System.out.println("����ڰ� �н����带 �Է����� �ʾҽ��ϴ�.");
				// ��й�ȣ �Է� ��û â ���� Ŀ���� ��й�ȣ��...
				javax.swing.JOptionPane.showMessageDialog(this,"��й�ȣ�� �Է��ϼ���");
				
				pw_tf.setFocusable(true);
				pw_tf.requestFocus();
				return;
				
			} else if(temp_id.equals("") == true && temp_pw.equals("") == false) {
				// ��й�ȣ�� �Է��ϰ� ���̵�� �Է� ����
				System.out.println("����ڰ� ���̵� �Է����� �ʾҽ��ϴ�.");
				// Ŀ���� ���̵� â���� // �̰� �ð��Ǹ� �Լ��� ������..
				id_tf.setFocusable(true);
				id_tf.requestFocus();
				return;
			} else if (temp_id.equals("") == false && temp_pw.equals("") == false){
				// ����ڰ� ���̵�� �н����带 �Ѵ� �Է��� 
				// ���� ����� ���̵�� ��й�ȣ�� ����� ��
				
				System.out.println("����ڰ� �Է��� ���̵�� " + temp_id);
				System.out.println("����ڰ� �Է��� ��й�ȣ�� " + temp_pw);
				
				System.out.println("���� ������ �����ϱ�");
				input_id = temp_id;
				input_pw = temp_pw;
				
				
				/*System.out.println("����ڰ� ��й�ȣ�� �Է� �� �� �ֵ���");
				System.out.println("Ŀ���� ��ġ�� �Է� â���� �̵��ϱ�");*/
				
				/*pw_tf.setFocusable(true);
				pw_tf.requestFocus();*/
				
				//public static final String ID = "id1";
				// public static final String PWD = "pwd1";
				
				// �´� ID�� PW�� �´��� Ȯ��
				/*
				 * ����� �� (2������)
				 * 
				 * 1. id�� pw�� ���� -> ��...�α����� �Ǿ����ϴ�.
				 * 2. ���� �ϳ��� �ٸ� -> Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ��� -> 5�� �ݺ��Ŀ� ���̻� �Է� ����. 
				 * 
				 */
				
				if(input_id.equals(ID) == true && input_pw.equals(PWD) == true) {
					
					System.out.println("����ڰ� ���̵�� ��й�ȣ�� ����� �Է��߽��ϴ�.");
					javax.swing.JOptionPane.showMessageDialog(this,"�α��� �Ǿ����ϴ�.");
					System.exit(0);
					
				} else {
					System.out.println("���̵�� ��й�ȣ�� ���� �ʽ��ϴ�.");
					javax.swing.JOptionPane.showMessageDialog(this,"�߸� �Է� �ϼ̽��ϴ�.");
					
				}
				
				
				return;
			} 
			
			
			////////////////////////////
			
			
			
			
			
			
			
			// ���� Ű �̺�Ʈ�� �߻��� ���� �˾Ƴ���
/*			if(ref_text_field == id_tf) {
				System.out.println("����ڰ� ���̵� �Է��ϰ� ���� Ű�� �������ϴ�.");
				
				// ����ڰ� �Է��� ���̵� �����ͼ� ������ ����
				String temp_id = id_tf.getText().trim();
				
				// ����ڰ� �Է��� ���̵� ���� ��쿡��
				// �ٽ� Ŀ���� ��ġ�� ���̵� �Է� �� �� �ִ� �Է� â���� ���� �̵�
				
				if(temp_id.equals("") == true) {
					
					
					 * �޽��� �ڽ� ����
					 * javax.swing ��Ű���� �ִ� JOptionPane  Ŭ������ ����ؼ�
					 * ����ڿ��� �Է� ��û �޽��� ���̾�α� �ڽ��� ������
					 
					javax.swing.JOptionPane.showMessageDialog(this,"���̵� �Է��ϼ���.");
					
					
					 * Ŀ���� ��ġ�� ������ ���̵� �Է�â���� �̵�
					 
					id_tf.setFocusable(true);
					id_tf.requestFocus();
					return;
					
				}
				
			} else if (ref_text_field == pw_tf) {
				
				System.out.println("����ڰ� ��й�ȣ�� �Է��ϰ� ���� Ű�� �������ϴ�.");
				String temp_pw = pw_tf.getText().trim();
				
				if(temp_pw.equals("") == true) {
					
					javax.swing.JOptionPane.showMessageDialog(this,"��й�ȣ�� �Է��ϼ���.");
					pw_tf.setFocusable(true);
					pw_tf.requestFocus();
					return;
					
				}
			}*/
			
			
		}
	
		
	}
}

public class TestLoginFrameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginFrame ref_login_ob = null;
		
		ref_login_ob = new LoginFrame();

	}

}
