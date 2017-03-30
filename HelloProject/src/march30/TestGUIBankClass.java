package march30;

/*
 * ���� ���Ǽ��迡�� ������ �湮�ؼ� �� �� �ִ� �ϵ��� �̸�
 * �ùķ��̼� �� �� �ִ� ���α׷��� ������ !
 */
// ���α׷����� ����� AWT ������Ʈ���� ����Ʈ�ϱ�
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

// ȭ�鿡 ������ ������ִ� Ŭ���� ����� 
class GUIBankFrameClass extends Frame implements ActionListener {
	

	
	
	// ���� ���� ��ư �غ�
	private Button create_acct_bt = new Button("���� ����") ;
	
	// �Ա� ���� ���ִ� ��ư �غ�
	private Button deposit_bt = new Button("�Ա�");
	
	// ��� ���� ���ִ� ��ư
	private Button withdraw_bt = new Button("���");
	
	// �ܾ� ��ȸ ���� ���ִ� ��ư
	private Button search_balance_bt = new Button("�ܾ� ��ȸ");
	
	// ���α׷� ���� ��ư
	private Button exit_bt = new Button("����");
	
	
		
	
	// �׸��� �� ���̾ƿ� �غ�
	private GridBagLayout gbl = new GridBagLayout();
	
	// ��Ʈ
	private Font f = new Font("����ü", Font.BOLD, 15);
	
	
	MyBankAcctClass ref_new_acct_ob ;
	// ���� ������ �ٲ� 
	
	// ���ο� ���¹�ȣ�� ������ִ� ������ Ŭ������ *��*��*Ŭ*��*��*�� �����
	private class CreateNewAcctNoThreadClass extends Thread {
		
		// �ӽ÷� ���¹�ȣ�� �����ϴ� ���� ����!
		// ���¹�ȣ ���� : 4�ڸ� - 4�ڸ� - 4�ڸ� - 4�ڸ�
		
		// ù��° 4�ڸ� ���¹�ȣ ���� ����
		private String temp_acct_no1 = "";
		
		// �ι�° 4�ڸ� ���¹�ȣ ���� ����
		private String temp_acct_no2 = "";
		
		// ����° 4�ڸ� ���¹�ȣ ���� ����
		private String temp_acct_no3 = "";
		
		// �׹�° 4�ڸ� ���¹�ȣ ���� ���� 
		private String temp_acct_no4 = "";
		
		// �ϳ��� ����(����)�� ���� ��ȯ�ϴ� �Լ� �����
		private int create_new_no() {
			int temp_no = (int)(Math.random() * 9) +1;	
			return temp_no;
		}
		
		private String create_four_no() {
			
			int temp_no ; 
			String temp_sno = "";
		
			for(int i = 0; i < 4 ; ++i) {
				temp_no = (int)(Math.random() * 9) +1; 
				temp_sno += "" + temp_no;
			}
			
			return temp_sno;
			
		}
		
		
		
		
		
		@Override
		public void run() {
			
			/*
			 * 1. ���ο� ���� ��ȣ ����
			 * 2. ������� ���¹�ȣ�� ���� ���� ref_new_acct_ob�� �־��ֱ�
			 */
			
			/*temp_acct_no1 = create_four_no();
			temp_acct_no2 = create_four_no();
			temp_acct_no3 = create_four_no();
			temp_acct_no4 = create_four_no();*/
			
			/*ref_new_acct_ob = */
			
		
		}
		
		
	}
	
	
	
	
	/*
	 * ���ο� ������ ������ �� ����ڷκ��� �̸��� �Է� �ް�
	 * ���� ��ư(OK ��ư)�� ��� ��ư�� ���� ���̾�α� Ŭ���� �����
	 */
	private class MyNewAcctDialog extends Dialog {
		
		// ���� ��ư Ŭ���� �ڽ�â�� ������ �ϱ� ���� ���̾�α� ���� ����
		Dialog new_acct_this ;
		// ������ �Լ��� �̵�
		
		
		// �� �̸��� ������ ���� ����
		private String client_name ; // ����ڰ� �Է��� �̸��� ������ ����
		
		// �� �̸��� �Է� �޴� �� &�ؽ�Ʈ �ʵ� ����
		private Label client_name_lb = new Label("����");
		private TextField client_name_tf = new TextField("������", 30);
		
		// ���� & ��� ��ư
		private Button ok_bt = new Button("����");
		private Button cancle_bt = new Button("���");
		
		// �׸��� ���̾ƿ� ����
	//	GridLayout grd_layout = new GridLayout(2,2,2,2);
		
		// OK ��ư�� CANCEL ��ư�� ���� �ǳ� �����̳� �����
		private Panel ref_ok_cancel_pl = new Panel();
		// �ǳ��� �⺻������ flowLayout�� ������ ����!
		// ��� ������Ʈ�� ���ٷ� ������ !!! 
		
		// �̸� ��û �� & �ؽ�Ʈ�ʵ带 ���� �ǳ� ! 
		private Panel ref_name_pl = new Panel();
		
		
		/*
		 * 
		 * ȭ�� ����
		 * 1. �̸� ��û �� / �̸� �Է� �ؽ�Ʈ �ʵ�
		 * 2. ���� ��ư / ��� ��ư 
		 * -> GridLayout ����
		 */
		/*
		 * ��� ��ġ�� �� �̸� �Է� �޴� �κ� �ۼ�
		 * �Ʒ� ��ġ���� �ǳ� ��ü�� ����ؼ� OK&Cancel ��ư �ִ� ����� �̾�
		 */
		
		
		// ������ �Լ� �����
		/*
		 * �ܺ� Ŭ������ �ִ� �Լ��κ��� �θ� ������ â�� �ּҿ� ���̾�α� â�� 
		 * ������ Ÿ��Ʋ �׸��� ��� ���θ� �޾ƿ��� ������!
		 */
		private MyNewAcctDialog(Frame ref_parent_frame,
				String ref_title_dialog,
				boolean modal) {
			// Dialog Ŭ������ �ִ� Dialog(Frame, String,boolean) ������ �Լ��� ����
			super(ref_parent_frame,ref_title_dialog,modal);
			
			/*
			 * �ڽ�â�� ������ �ֵ��� 
			 * �޸𸮿� ������ Dialog ��ü�� �ּҰ��� �����ϴ� ��ɹ� �ۼ�
			 */
			this.new_acct_this = this;
			
			/*
			 * �ǳڿ� ����ڿ��� �̸��� ��û�ϴ� �󺧰� ����ڰ� �̸��� �Է��� ��
			 * �ִ� �ؽ�Ʈ�ʵ� ������Ʈ �ֱ�
			 */
			// �ǳ��� �ּҸ� ���� �ִ� �����̸� .add();
			ref_name_pl.add(client_name_lb);
			ref_name_pl.add(client_name_tf);
			// Ok ��ư�� calcel ��ư�� �ǳڿ� �ֱ�!
			ref_ok_cancel_pl.add(ok_bt);
			ref_ok_cancel_pl.add(cancle_bt);
			
			// ���ʿ� ���� �ǳ��� ���� ���̾ƿ��� �ֱ�
			// ����� �ֱ�
			this.add(ref_name_pl);
			// ��� ��ġ�� BorderLayout.CENTER ���� ���� 
			
			// �Ʒ��ʿ� �ֱ�
			this.add(BorderLayout.SOUTH,ref_ok_cancel_pl);
			
			// ��ư Ŭ�� �̺�Ʈ ó���� ���� ��ɹ� �ۼ�
			// new ��ưŬ�� �̺�Ʈ�� �޴� ������ �������̽� �̸�() 
			// -> new Act ionListener()
			// ���� new �������̽��̸� -> �Ұ�, new �������� Ŭ���� �̸��� �� �� ����
			/*
			 * new �������̽��̸�() {
			 * actionPerfomed() �޼ҵ� ������
			 * }
			 *		// ���� ��쿡�� new ���� �������̽� �̸��� �� �� �̾�!!
			 *		-> �޸𸮿� actionPerfomed() �Լ��� ��������� �޸𸮿� �������
			 *		actionPerformed() �Լ��� �ּҸ� �������̽� �̸� ActionListener�� �޾ƿ��� ����
			 *		-> �ӽ� ��ü�� �޸𸮿� �����ϸ鼭 �̺�Ʈ�� �߻��Ҷ� ����Ǵ� �޼ҵ带  �޸𸮿� �ִ� ��� 
			 *
			 *
			 */
			// ���� ��ư Ŭ����! �̺�Ʈ!
			ok_bt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					/*
					 * OK ��ư Ŭ����
					 * 1. ���̾�α� â ������
					 * 2. ���¹�ȣ ����
					 */
					
				}
			});
			
			// ĵ�� ��ư Ŭ���� �߻��ϴ� �̺�Ʈ!
			cancle_bt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// ���� ���� â�� ������ ������!!
					
					Window new_acct_window = new_acct_this;
					new_acct_window.dispose();
					
			
				}
				
				
			});
			
			
		}
		
		
		
	}
	
	
	
	
	private class MyBankAcctClass {
		
		/*
		1. ���� ���� �̸� ���� ���� �ʿ�
		*/
		private String name;
		
		/*
		2. ���� ��ȣ�� ������ �� �ִ� ���� �ʿ�
		*/
		
		private String acct_no;
		// ������ ������ �ʿ����� �����ϱ� String����!
		
		/*
		3. ���� ��й�ȣ ������ �� �ִ� ���� �ʿ� 
		*/
		private String acct_pw;
		
		/*
		4.���� ���ݾ��� ������ �� �ִ� ����
		*/
		private int balance;
		
		// �ܺ� Ŭ������ �ִ� ���� ������ ������Ʈ���� �״�� ��� ����
		// -> �ܺ� Ŭ������ ���� �޸𸮿� ������ �����̱� ����
		
		// 5. �����ڸ� ���� �ٸ� Ŭ�������� ���� ������ ���� ������ ���� �����ϱ�
		private MyBankAcctClass(
				String name_value, 
				String acct_no_value,
				String acct_pw_value,
				int init_balance) {
			
			System.out.println("������ �����մϴ�.");
			
			// �ٸ� Ŭ�����κ��� ���� �̸�, ���¹�ȣ, ��й�ȣ, �ʱ� ���ݾ���
			// ������ ������ ���� ������ ���� ����
			this.name = name_value;
			this.acct_no = acct_no_value;
			this.acct_pw = acct_pw_value;
			this.balance = init_balance;
			
			System.out.println(this.name + "�� �ݰ����ϴ�.");
			System.out.println("���ο� ���� ��ȣ�� " + this.acct_no + " �Դϴ�.");
			System.out.println("�ʱ� ���ݾ��� " + this.balance + "�� �Դϴ�.");
			System.out.println("***���� ������ ���ϵ帳�ϴ�.***");
			
			
		}
	
	}

	
	
	
	// ���ο� �Լ��� ���� �׸��� �� ���̾ƿ��� ���ο� ������Ʈ �ֱ�
	/*
	 * �ٸ� �Լ��κ��� �׸��� �� ���̾ƿ��� �� �� �� ü�� �ּҸ� �ޱ�
	 * -> ��� ������Ʈ�� �θ� Ŭ���� Component ���
	 * Component ref_new_component
	 * 
	 * �ι�° �Ű� ������ �� ��ġ �� �޴� ���� ���� : int row_index;
	 * ����° - �� ��ġ �� �޴� ���� ���� : int col_index;
	 * �׹�° : ������Ʈ ������Ʈ ���� ���� ä���ִ� fill �� �������� ���� ���� : int fill_index
	 * �ټ����� ������Ʈ â ũ�� �ٲܶ� ���� ������Ʈ�� ũ�⸦ �����ϰ�
	 * ���������ֱ� ���� ����(����) ���� �Ǽ��� �޴� ���� ���� : double weightx
	 * -> ���� ������ ũ�⿡ ���� ���� ��
	 * 
	 * ������° - ���� ���߰� ���� ���� ��: double weighty;
	 * -> ���� ������ ũ�⿡ ���� ����(����) ��
	 * 
	 */
	
	public void add_component(Component new_component,
			int row_index,
			int col_index,
			int fill_value,
			double weightx,
			double weighty) {
		// ��� ������Ʈ ��ü�� �ּҸ� ���� �� ����
		// Component : ��� ������Ʈ���� �θ� Ŭ����(������ ������ ���)
		// �θ� Ŭ���� ��ü�� �ּҸ� ����ؼ� ��� �� �� Ŭ������ �̵� ����
		System.out.println("���ο� ������Ʈ�� �׸��� �� ���̾ƿ��� �ֽ��ϴ�.");
		
		// ��ġ ���� �����ϱ� ���� GridBagConstraints Ŭ������ ����� ���ο� ��ü �����
		GridBagConstraints ref_gbc = new GridBagConstraints();
		ref_gbc.gridx = col_index;
		ref_gbc.gridy = row_index;
		ref_gbc.fill = fill_value;
		ref_gbc.weightx = weightx;
		ref_gbc.weighty = weighty;
		
		// ��ġ ���� �׸��� �� ���̾ƿ��� ����
		this.gbl.setConstraints(new_component, ref_gbc);
		this.add(new_component);
		
		
	}
	
	public void add_component(Component new_component,
			int row_index,
			int col_index,
			int gridwith_value,
			int fill_value,
			double weightx,
			double weighty) {
		// ��� ������Ʈ ��ü�� �ּҸ� ���� �� ����
		// Component : ��� ������Ʈ���� �θ� Ŭ����(������ ������ ���)
		// �θ� Ŭ���� ��ü�� �ּҸ� ����ؼ� ��� �� �� Ŭ������ �̵� ����
		System.out.println("���ο� ������Ʈ�� �׸��� �� ���̾ƿ��� �ֽ��ϴ�.");
		
		// ��ġ ���� �����ϱ� ���� GridBagConstraints Ŭ������ ����� ���ο� ��ü �����
		GridBagConstraints ref_gbc = new GridBagConstraints();
		ref_gbc.gridx = col_index;
		ref_gbc.gridy = row_index;
		ref_gbc.fill = fill_value;
		ref_gbc.weightx = weightx;
		ref_gbc.weighty = weighty;
		ref_gbc.gridwidth = gridwith_value;
		
		// ��ġ ���� �׸��� �� ���̾ƿ��� ����
		this.gbl.setConstraints(new_component, ref_gbc);
		this.add(new_component);
		
		
	}
	
	
	
/*	public void add_component(Button ref_new_bt,
			int row_index,
			int col_index,
			int fill_value,
			double weightx,
			double weighty) {
		// �� �Լ��� ��ư ��ü�� �ּҸ� ����
	}
	
	public void add_component(TextField ref_new_tf,
			int row_index,
			int col_index,
			int fill_value,
			double weightx,
			double weighty) {
		// �� �Լ��� �ؽ�Ʈ�ʵ� ��ü ���� �Լ�
	}
	
	public void add_component(TextArea ref_new_ta,
			int row_index,
			int col_index,
			int fill_value,
			double weightx,
			double weighty) {
		// �ؽ�Ʈ �Ʒ��� ���� �Լ� 
		
	}*/
	/*
	 * ���� Ŭ���� ����� : ���� ���� Ŭ���� ����� : �ٸ� Ŭ���������� ����� �� ���� Ŭ����
	 * private ���� �����ڸ� ����� Ŭ���� : ����Ŭ���������� ��� ����
	 * private class ���� Ŭ���� �̸� { } 
	 */
	// �̺�Ʈ ó������ �����ϴ� Ŭ���� ����� : ����ڰ� ������ ���� ��ư(x)�� Ŭ���ϴ�
	// ��쿡�� �����ϴ� windowClosing() �Լ��� ���� Ŭ����
	private class MyWindowHandler extends WindowAdapter {
		
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
	
	/*
	 * class ���� Ŭ���� �̸� { } 
	 *  	// visible Ŭ����-> �ٸ� Ŭ�������� ����� �� �ִ� Ŭ���� 
	 * 
	 */
	
	//   �⺻ ������ ���� ������ ��ư ������Ʈ���� add_component() �Լ��� ����ؼ� 
	// �׸��� �� ���̾ƿ��� �ֱ�
	
	public GUIBankFrameClass() {
		// super() ��ɹ��� �ۼ��ؼ� �θ� Ŭ������ Frame���� ���� �ִ�
		// �����ڸ� �����ؼ� �����쿡 ������ Ÿ��Ʋ�� ���� 
		super("Haley's Bank Window");
		// setLayout���� ��ġ ������ ����
		this.setLayout(gbl);
		// ��Ʈ ���� 
		this.create_acct_bt.setFont(f);
		this.deposit_bt.setFont(f);
		this.exit_bt.setFont(f);
		this.withdraw_bt.setFont(f);
		this.search_balance_bt.setFont(f);
	
		// �̺�Ʈ ó�� ��ɹ� �ۼ��ϱ�
		// ��ư���� �߻��� �� �ִ� Ŭ�� �̺�Ʈ ó���ÿ� �ڵ����� actionPerformed()
		// �Լ��� ���� �� �� �ִ� ActionListener ������ ���α׷����� ��ư�� ���縦 �˸�
		this.create_acct_bt.addActionListener(this);
		this.deposit_bt.addActionListener(this);
		this.exit_bt.addActionListener(this);
		this.withdraw_bt.addActionListener(this);
		this.search_balance_bt.addActionListener(this);
		
		// ������ ���� �̺�Ʈ ó��
		// ������ ���� �̺�Ʈ �߻��� �� windowClosing() �Լ��� ���� �� �� �ֵ���
		// ���� ������ �������� ���縦 WindowListener ������ ���α׷����� �˸�
		// ���� ������ ������ �ּҸ� ���� �ִ� this����. addWindowListener();
		// () �Ұ�ȣ �ȿ��� ������ ���� new ���� Ŭ�����̸�();;
		this.addWindowListener(new MyWindowHandler());
		// new Ŭ�����̸�() -> �ӽ� ��ü�� ����(��ȸ�� ��ü)
		
	
		
		
		/*
		 * ������ ���� add_component() �Լ��� ����ؼ� 5���� ��ư���� 
		 * �׸��� �� ���̾ƿ��� �ֱ�
		 * 
		 * 1. ������Ʈ ��ü�� �ּ�
		 * 2. row_index : ���� ��ġ
		 * 3. col_index : ���� ��ġ
		 * 4. fill_value 
		 * 		: ���� �������� ������Ʈ ũ�⸦ ũ�� �Ϸ��� HORIZONTAL
		 * 		: ���� �������� ������Ʈ ũ�⸦ ũ�� �Ϸ��� VERTICAL
		 * 		: ����, ���� ���� ��� ũ�⸦ ũ�� : BOTH
		 * 5. weightx : ���� ������ ����ġ(���� �Ǵ� ����) : �Ǽ� ��
		 * 6. weighty : ���� ������ ����ġ(���� �Ǵ� ����) : �Ǽ� ��
		 * 		-> ��) 1.0 �Ǵ� weightx : �� �ٿ� ���� ������Ʈ ������ ���
		 */
		
		this.add_component(create_acct_bt, 0, 0,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		this.add_component(deposit_bt, 0,1,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		this.add_component(withdraw_bt,1,0,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		this.add_component(search_balance_bt,1,1,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		this.add_component(exit_bt, 2, 0, 2,
				GridBagConstraints.BOTH, 1/2.0, 1/3.0);
		
		// -> ������ ��ư�� gridwidth = 2 �� �ؾ��� 
		
		// ���� ��ư���� setActionCommand�� ���� �ٲٱ�
		/*
		 * 1. ���尳����ư "1"
		 * 2. �Ա� ��ư "2"
		 * 3. ���� ��ư "3"
		 * 4. �ܾ���ȸ ��ư "4"
		 * 5. ���� ��ư "5"
		 */
		
		this.create_acct_bt.setActionCommand("1");
		this.deposit_bt.setActionCommand("2");
		this.withdraw_bt.setActionCommand("3");
		this.search_balance_bt.setActionCommand("4");
		this.exit_bt.setActionCommand("5");
		
		// �������� ũ�⸦ �����ϱ� -> �� ũ�� 
		// this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setSize(250, 250);
		this.setResizable(false); // ������ ũ�� ���� �Ұ�
		this.setVisible(true); // ȭ�鿡 ������ ��� 
		
		
	}
	
	/*
	 * ����ڰ� 5�� ��ư �� �ϳ��� ��ư�� Ŭ���ϴ� ��쿡 �ڵ����� ����Ǵ� 
	 * �ݹ� �Լ� -> �ڹ� ����ӽſ� ���ؼ� ����Ǵ� �Լ� 
	 * 
	 */
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// �̺�Ʈ �߻��� ���� �޸� �ּ� �˾ƿ���
		Object ref_event = ae.getSource();
		if(ref_event instanceof Button) {
			System.out.println("����ڰ� ��ư Ŭ��");
			
			// 5���� ��ư�� � ��ư�� Ŭ���ߴ���
			
			// ��ư �� ��ȯ
			Button ref_clicked = (Button)ref_event;
			// ������ ������ ��ȣ�� getActionCommand() �Լ��� ����ؼ� ����
			String action_command = ref_clicked.getActionCommand();
			
			// ��ư���� �̸��༭���� ����..
			
			if(action_command.equals("1") == true) {
				System.out.println("����ڰ� ���� ���� ��ư Ŭ��");
				// ������ ���� ���� Ŭ���� MyBankAccClass�� ����ؼ� ���ο� ��ü �����
				
				// ref_new_acct_ob ���� ���� ��ü -> ���� �������� ����� �� �ִ� ��ü 
				ref_new_acct_ob = new MyBankAcctClass("������","123456789","12345", 500000);
				
				
				
			}
			else if(action_command.equals("2") == true ) {
				System.out.println("�Ա� ��ư Ŭ��");
			}
			else if(action_command.equals("3") == true) {
				System.out.println("��� ��ư Ŭ��");
			}
			else if(action_command.equals("4") == true) {
				System.out.println("�ܾ� ��ȸ ��ư Ŭ��");
			}
			else if(action_command.equals("5") == true) {
				System.out.println("���α׷� ���� ��ư Ŭ��");
				JOptionPane.showMessageDialog(this,"���α׷��� �����մϴ�.");
				System.exit(0);
			}
			else {
				System.out.println("���� ó���� �� ���� ��ư �Դϴ�.");
			}
			
			
			
			
		}
		else if ( ref_event instanceof TextField) {
			System.out.println("����ڰ� �ؽ�Ʈ �ʵ忡 �Է�");
		}
		
		
		
	}
	
}

public class TestGUIBankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� GUI Ŭ������ ����ؼ� ���ο� ��ü�� ���� ���� ������� ��ü�� �ּҸ�
		// ������ ������ �����ϱ� 
		GUIBankFrameClass ref_gui_ob = new GUIBankFrameClass();
		
		

	}

}
