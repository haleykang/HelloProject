package march27;

/*
 * �л� ���� ��ϰ� ��ȸ�� �� �� �ִ� ���α׷� �����
 * 1. �л� ������ ������ �� �ִ� Ŭ���� �����
 * class MyStudentScoreClass {
 * 		// �̸� ���� ����
 * 		private String m_name;
 * 		// ���� ���� ���� ����
 * 		private int m_kor ;
 * 		// ���� ���� ���� ����
 * 		private int m_eng ;
 *		// ���� ���� ���� ����
 *		private int m_math;
 *		// ���� ���� ����
 *		private int m_total;
 *		// ��� ���� ����
 *		private double m_avg;  
 * 
 */

import java.util.*; // �÷��� ���
import java.awt.*; // awt ���� Ŭ���� ���
import java.awt.event.*; // awt ���� �̺�Ʈ ó�� Ŭ���� ���
import javax.swing.*; // swing ���� Ŭ���� ���
import javax.swing.plaf.synth.SynthSeparatorUI;

import myjava.lang.MyTest;





/*
 * ���� ��ȸ â�� ȭ�鿡 �����ִ� Ŭ���� �����
 */

class MyShowFindScoreChildFrame extends Dialog implements ActionListener {
	
	/*
	 * ���� ��ư�� �������� �ڽ�â�� ������ ���� ���� 
	 */
	Dialog ref_this;
	// �����ڷ� �̵�
	
	/*
	 * ����ڰ� ���̽� ������Ʈ���� ������ �����ۿ� ���� ������ ���� ���� �����ϴ� ���� ����
	 * 
	 * ���� ����ڰ� ��ȣ �˻� �������� ������ ��쿡�� ������ ���� 1�� ����
	 * 
	 * ���� ���� �������� �����ϸ� ������ ���� 2�� ����
	 * 
	 * ���� ���� �������� �����ϸ� ������ ���� 3�� ����
	 * 
	 * ���� ���� �������� �����ϸ� ������ ���� 4�� ���� 
	 *
	 */
	private int key_choice = 0;
	
	
	/*
	 * ���� ��ȸ â�� ������ ���� ���ϱ�
	 * 
	 * 1. ����ڰ� ã�� �����͸� �Է� �޴� â
	 * 		1) �� ��ü �غ� : "�˻��� Ű���� �Է�"
	 * 		2) ����ڰ� �Է��� �ؽ�Ʈ�ʵ� �غ�  
	 * 		3) �˻� ��ư �غ�
	 * 		4) ����ڰ� ������ ��ȣ �˻� ������, ���� ���� �˻� ������, ���� ���� �˻� ������, 
	 * 			���� ���� �˻� �������� ���� Choice ������Ʈ �غ� 
	 */
	
	
	// ���� Choice ������Ʈ �غ�
	private Choice ref_choice = new Choice();
	// ���̽� ������Ʈ�� ���� �˻� �������� ���ڿ� �迭�� ����
	private String str_array [] = {"������ ����", "��ȣ", "���� ����", "���� ����", "���� ����"};
	
	// �ʱ�ȭ ���� �ۼ��ؼ� ������ ���� str_array �迭�� ����Ǿ� �ִ� ��� ���ڿ� ����
	// ���̽� ������Ʈ�� �ֱ�
	{
		System.out.println("���̽� ������Ʈ�� �˻� ������ ���ڿ� �ֱ�");
		for(int i =0 ; i < str_array.length; ++i) {
			this.ref_choice.add(str_array[i]);
			System.out.println("���̽� ������Ʈ�� " + i + " ��ġ�� ����� ������ ���ڿ��� " +
			str_array[i] + " �Դϴ�.");
			
		}
	}
	
	// Label ������Ʈ �غ��ϱ�
	private Label ref_lb1 = new Label("�˻��� ������");
	
	// �˻� ��û ��...
	
	// ����ڰ� ��ȣ �Ǵ� ����(�� �� ��)�� �Է� �� �� �ִ� �Է� â �����
	private TextField ref_tf1 = new TextField("", 40);
	
	// �˻� ��ư �����
	private Button ref_bt1 = new Button("�˻�");
	
	/*
	 * GridBagLayout ��ġ ���� �� ����ϱ� ���� �غ�
	 */
	private GridBagLayout ref_grid_bag = new GridBagLayout();
	private GridBagConstraints ref_grid_bag_constraints = new GridBagConstraints();
	
	// �˻� ����� �����ִ� TextArea ������Ʈ �غ�
	private TextArea ref_ta1 = new TextArea("",10,80);
	
	// ���� ��ư
	private Button ref_bt2 = new Button("���");
	
	// ����ڰ� �Է��� ����� �˻� ������� ��� �����ִ� ��ư
	private Button ref_bt3 = new Button("�ʱ�ȭ");
	
	// ��Ʈ ����
	private Font t = new Font("�ü�ü", Font.BOLD, 15);
	
	// ������ ���� Ư�� ������Ʈ���� Ư�� ��ġ�� �־��ִ� �Լ� �����
	public void add_component(Component ref_component, int row_index, int col_index) {
		// ������Ʈ�� ��ġ ���� ���� ��ü �����
		ref_grid_bag_constraints = new GridBagConstraints();
		
		// ������Ʈ �� ��ġ ��ȣ ����
		ref_grid_bag_constraints.gridy = row_index;
		
		// ������Ʈ �� ��ġ ��ȣ ����
		ref_grid_bag_constraints.gridx = col_index;
		
		// ������Ʈ ���� ����
		ref_grid_bag_constraints.weightx = 1 / 2.0;
		
		// ������Ʈ�� ������Ʈ ���̿� �����ϴ� ����� ���ֱ�
		ref_grid_bag_constraints.fill = GridBagConstraints.HORIZONTAL;
		
		// �׸��� �� ���̾ƿ����� ���� ������ ����
		ref_grid_bag.setConstraints(ref_component, ref_grid_bag_constraints);
		
		// ������Ʈ�� �׸��� �� ���̾ƿ��� �ֱ�
		this.add(ref_component);
		
	}
	
	// ���� â���� ���� ���� ���� ���� ���͸� �����ϴ� ���� ���� ����
	private Vector<MyStudentScoreClass> ref_score = null;
	
	
	// Dialog Ŭ�������� �⺻ ������ �Լ��� ����
	public MyShowFindScoreChildFrame(Frame ref_parent_frame, String ref_title, boolean modal,
			Vector<MyStudentScoreClass> ref_score) {
		
		super(ref_parent_frame, ref_title, modal);
		
		this.ref_this = this; // �ڽ�â�� ���� �̾ ->
		// �޸𸮿� ������ Dialog ��ü�� �ּҰ��� �����ϴ� ��ɹ�!
		
		// ���� â���� ���� ���� ���� ���� ������ ���� ������ ����
		this.ref_score = ref_score; 
		
		// setLayout() �Լ��� ����ؼ� Dialog Ŭ������ ���� �ִ� �⺻ ��ġ �����ڸ� �ٲٱ�
		this.setLayout(ref_grid_bag);
		
		/*
		 * ù��° �࿡�� �� ���
		 */
		this.add_component(ref_lb1, 0, 0);
		
		/* 
		 * ù��° �� �ι�° ������ ���̽� ���
		 */
		this.add_component(ref_choice, 0, 1);
		
		/*
		 * 2��° ��, ù��° ������ ����ڰ� �˻��� ��ȣ �Ǵ� �Է� �ؽ�Ʈ �ʵ�
		 */
		this.add_component(ref_tf1, 1, 0);
		
		/*
		 * 2.2 �ڸ����� �˻� ��ư ���
		 */
		this.add_component(ref_bt1, 1, 1);
		
		/*
		 * 3.1 �ڸ����� �˻� ��� ��� �Ʒ���
		 */
		this.add_component(ref_ta1, 2, 0);
		
		/*
		 * 3.2 �ڸ����� ���� ��ư ���
		 */
		this.add_component(ref_bt2, 2, 1);
		
		/*
		 * 4.0 ���� �ʱ�ȭ ��ư ���
		 */
		this.add_component(ref_bt3, 3, 0);
		
		
		// ������ ����
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				// ���� �̺�Ʈ �߻��� �������� �ּҸ� �˾ƿ���
				Window ref_window = we.getWindow();
				
				// dispose() �Լ��� �����ؼ� ���� â�� ����
				ref_window.dispose();
				
			}
		});
		
		/*
		 * ���̽� ������Ʈ���� �߻��ϴ� �̺�Ʈ�� ItemEvent 
		 * -> ���� addItemListener() �Լ��� �����ؼ� �̺�Ʈ ó���� ������ ������
		 * 		���α׷��� �˷���
		 * 		-> ���̽��� ���� �ִ� ������ ���ڿ��� ����ڰ� �����ϸ� �߻��ϴ� �̺�Ʈ 
		 * 		-> ������ �˻� ���ڿ�
		 * 		-> ���� ���� �˻� ���ڿ�
		 * 		-> ���� ���� �˻� ���ڿ� ��� 
		 * 		-> ����ڰ� �������� �����ϸ� ItemEvent �̺�Ʈ�� �߻��ϰ� ������ ���α׷���
		 * 		ItemEvent Ÿ���� ���ο� ��ü�� ����
		 * 		���� ��������� ItemEvent Ÿ���� ��ü�� itemStateChanged() �Լ��� ���� 
		 * 
		 * -> ����ڰ� �������� �����ϴ� ��쿡 ������ �������� �������� ���ؼ��� 
		 * 		itemStateChanged() �Լ��� ������ �ؾ��� 
		 * 		-> ItemListener �������̽��� ���� �ִ� �Լ�
		 * 
		 * ->���̽� �����̸� . addItemListener( new ItemEvent() {
		 * 		@Override
		 * 		public void itemStateChagned(ItemEvent ie) {
		 * 		// ����ڰ� �������� �����ϸ� ����� ��ɹ� �ۼ�
		 * 
		 * 		}
		 * });
		 */
		
		ref_choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("����ڰ� ���̽� ������Ʈ�� �ִ� �������� ����");
				String item_value = ref_choice.getSelectedItem();
				
				System.out.println("����ڰ� ������ �������� " + item_value);
				
				/*
				 * ����ڰ� ������ �����ۿ� ���� ���ڿ��� ���� �ִ� ���� item_value�� �˻�
				 */
				if(item_value.trim().equals("��ȣ") == true) {
					System.out.println("����ڰ� ������ ��ȣ �˻� �������� 1�� ����");
					key_choice = 1;
					System.out.println("���� ���� key_choice�� ����� ������ " + key_choice);
				}
				// ����ڰ� ���� ���� �������� ���� ������
				else if(item_value.trim().equals("���� ����") == true) {
					System.out.println("����ڰ� ������ ���� ���� �������� 2�� ����");
					key_choice = 2;
					System.out.println("key_choice�� ����� ������ " + key_choice);
				}
				// ����ڰ� ���� ���� �������� ���� ������
				else if(item_value.trim().equals("���� ����") == true) {
					System.out.println("���� ���� �������� 3���� ����");
					key_choice = 3;
					System.out.println("����� ������ " + key_choice);
				}
				// ����ڰ� ���� ���� �������� ���� ���� ��
				else if(item_value.trim().equals("���� ����") == true) {
					System.out.println("���� ���� �������� 4�� ����");
					key_choice = 4;
					System.out.println("����� ������ " + key_choice);
				}
				
				
				
				
				
				// ���̽� ������Ʈ�� ���� �ִ� ������ �� ������ �о�ͼ� ������ ����
				int item_count = ref_choice.getItemCount();
				
				System.out.println("���̽� ������Ʈ�� �� �� �ִ� �������� �� ������ " + item_count);
				// �������� �����Ǿ� �ִ� str_array �迭�� ũ��� ������
				int length_str_array = str_array.length;
				System.out.println("�迭 str_array�� ũ��� " + length_str_array);
				
			}
		});
		
		// ������ ��ư���� �߻��� �� �ִ� �̺�Ʈ ó�� ��ɹ� �ۼ��ϱ�
		this.ref_bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("�˻� ��ư Ŭ��");
				
				/*
				 *  ����ڰ� �������� �������� ���� ����� ó�� �κ��� ���� �ۼ�
				 */
				if(key_choice == 0) {
					JOptionPane.showMessageDialog(null, "�˻��� �������� �������ּ���.");
					// actionPerformed() �Լ��� Ż���ϴ� ��ɹ�
					return;
				}
				/*
				 * ����ڰ� �Է��� �˻��� ������ �޾ƿ���
				 */
				String input = ref_tf1.getText().trim();
				
				/*
				 * ����ڰ� �Է��� ���� �ʰ� �˻� ��ư�� ������ ��츦 ó��
				 */
				if(input == null || input.length() == 0) {
					
					JOptionPane.showMessageDialog(null, "�Է� ����\n�˻��� ������ �Է��ϼ���");
					// ����ڰ� ������ �Է��� �� �ֵ��� Ŀ�� ��ġ�� �ؽ�Ʈ �ʵ�� �̵� ��Ű��
					ref_tf1.setFocusable(true); // Ŀ���� ���� �غ� ��Ű��
					
					// Ŀ���� ��ġ�� �ؽ�Ʈ �ʵ�� �̵���Ű�� ���� requestFocus() �Լ� ���
					ref_tf1.requestFocus();
					return;
					
				}
				/*
				 * ����ڰ� �Է��� �˻� ������ ���̾�α׿� ���
				 */
				JOptionPane.showMessageDialog(null, "����ڰ� �Է��� �˻� ������ " + input);
				/*
				 * ���� ���� key_choice�� ���� �ִ� ���� ���� ��ȣ �˻��� �� ������
				 * ���� ���� �˻� ����, ���� ���� �˻� ����, ���� ���� �˻����� �����ϴ� ���ǹ� �Ǵ� ���ù� �ۼ�
				 * 
				 * 
				 * ���ǹ� ��� �� : if ��(���� ���� ������ ó���� �� �ִ� ���� if��)
				 * ���ù� ����� : switch ~ case ��
				 */
				
				// �Ʒ� ������ �˻��ϱ� ���� ���� ��ϵ� ���� �����Ͱ� �ִ��� ���θ� �˻�
				int size_ref_score = ref_score.size();
				if(size_ref_score == 0){
					JOptionPane.showMessageDialog(null, "��ϵ� ���� �����Ͱ� �����ϴ�.");
					return;
				}
				// �ܼ� ȭ�鿡�� ���� ��ϵ� ���� ���� ���
				System.out.println("���ݱ��� ��ϵ� ���� ������ " + size_ref_score);
				
				
				// ���� �� : ���� if ��
				
				// switch ~ case ��
				switch (key_choice) {
				case 1: 
					System.out.println("��ȣ �˻� �ϱ�");
					
					/*
					 * ��ȣ �˻� �ϱ�
					 * 
					 * 1. �ݺ����� �ʿ� : ���� ������ ����� ��� �л� ���� �����͵��� �о���� �ݺ���
					 * for(int i = 0; i < size_ref_score; ++i) {
					 * 		// ���� ������ ���� �ִ� get() �Լ��� ����ؼ�
					 * 		// ���� ������ ���� �л� ���� �����͸� �ϳ��� ��������
					 * 		// ���� ���� �̸�.get(��ġ ��ȣ)
					 */
					// ã�� �л� ���� �������� ������ �� �ִ� ���� ����
					String result_str = "";
					
					// ���� �������� ���� ������ �о���� ����ڰ� �Է��� ��ȣȭ ���ϴ� �ݺ��� �ۼ�
					
					for(int i = 0; i < size_ref_score; ++i) {
						
						MyStudentScoreClass ref_student_score = ref_score.get(i);
						
						int s_no = ref_student_score.get_no();
						int i_input = Integer.parseInt(input);
						
						if(s_no == i_input) {
							System.out.println("����ڰ� �Է��� �л� ��ȣ�� ã�ҽ��ϴ�.");
							// TextArea ������Ʈ�� ������ �л� ���� �����
							result_str += "�̸� : " + ref_student_score.get_name() + 
									"\n���� ���� : " + ref_student_score.get_kor() +
									"\n���� ���� : " + ref_student_score.get_eng() +
									"\n���� ���� : " + ref_student_score.get_math() + "\r\n";
							/*
							 * TextArea ������Ʈ ���� �� �ٲ��� �ν��ϴ� ���ڴ� "\r\n"
							 * "\r" : carriage return Ŀ���� ��ġ�� ���� ���� ó������ �̵�
							 * \n : new line Ŀ���� ��ġ�� �Ʒ� �ٷ� �̵�
							 */
						} // end of if(s_no == i_input)
					} // end of for
					
					// for() �ݺ����� ��� ��ġ���� �˻��� �����ߴ��� ���θ� ȭ�鿡 ���
					// ���� result_str�� ���� �ִ� ���ڿ��� �о�ͼ� ���ϱ�
					if(result_str.equals("") == true) {
						JOptionPane.showMessageDialog(null, "��ȣ ������ �˻� ����");
						return;
					}
					else {
						JOptionPane.showMessageDialog(null, "��ȣ ������ �˻� ����");
						// ã�� �л� ���� �������� TextArea ������Ʈ�� �ֱ�
						ref_ta1.setFocusable(true); // ��Ŀ���� TextArea�� �̵�
						// setText() �Լ��� ����ؼ� ȭ�鿡 ���
						ref_ta1.setText(result_str);
					}
					
					
					break;
					
				case 2:
					System.out.println("���� ���� �˻� �ϱ�");
					break;
				case 3:
					System.out.println("���� ���� �˻� �ϱ�");
					break;
				case 4:
					System.out.println("���� ���� �˻� �ϱ�");
					
				default:
					System.out.println("����?");
					break;
				}
				
				
				
				
			}
		});
		this.ref_bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���� ��ư Ŭ��");
				
				// �ڽ� â�� �����ϱ�! 
				Window window_dialog = ref_this;
				
				window_dialog.dispose();
				
				
				
			}
		});
		this.ref_bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("�ʱ�ȭ ��ư Ŭ��");
				
			}
		});
		
		
		this.setSize(500,500);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	
	
}

		@Override
	public void actionPerformed(ActionEvent ae) {
		
		
	}
}

// Dialog Ŭ������ ��� �޴� �ڽ� ������ Ŭ���� �����
/*
 * ����ڰ� ���� â���� ���� ��� ��ư�� Ŭ���ϴ� ��쿡�� ���Ǵ� Ŭ����
 */
class MyShowRegChildFrame extends Dialog {
	
	/*
	 * ���� ��ư Ŭ���� �ڽ� â�� ���� �� �� �ֵ��� ���� ���� ����
	 * -> ���� �� �����ڷ� �̵�
	 */
	Dialog ref_reg_this;

	/*
	 * �ٸ� �Լ������� ����� �� �ִ� ���� ���� ���� 
	 */
	// ����ڰ� �Է��� �̸� �����ϴ� ���� ����
	private String ref_name = "";
	
	// ����ڰ� �Է��� ���� �̸�
	private int ikor_score = 0;
	private String skor_score = "";
	
	// ����ڰ� �Է��� ���� ����
	private int ieng_score = 0;
	private String seng_score = "";
	
	// ����ڰ� �Է��� ���� ����
	private int imath_score = 0;
	private String smath_score = "";
	
	// ����
	private int itotal_score = 0;
	// private String stotal_score = "";
	
	// ���
	private double davg_score = 0.0;
	

	/*
	 * Dialog Ŭ�������� �⺻ ������ �Լ��� ����
	 * -> Dialog Ŭ�������� ����� �������� 
	 * public Dialog(Frame ref_parent_frame, String ref_title , boolean modal) {
	 * 
	 * }
	 * �Լ��� ���� Ŭ������ �������ִ� super() ��ɹ� �ۼ� 
	 * -> super : ���� -> �θ� Ŭ������ �޸� �ּҸ� ���� �ִ� �ڵ� ����
	 * -> super() : �θ� Ŭ������ �ִ� ������ �Լ��� ���� !
	 * -> super.�Լ��̸�() : �θ� Ŭ������ �ִ� �Ϲ� �Լ��� ���� 
	 * 
	 * -> super(����â�� �ּ�, ���̾�α׿� ������ Ÿ��Ʋ ���ڿ�, ��� ���θ� ��, �������� �ۼ�);
	 * 
	 *  -> super(Frame, "title", true �Ǵ� false);
	 *  
	 *  // �Ʒ����� �ۼ��� ������ �Լ��� ���ؼ� ���� �޴� ���� â�� �ּҸ� �����ϴ� ���� ����
	 */
	
	private Frame ref_parent_frame ; // Ŭ���� �ȿ� �ִ� ��� �Լ����� ��� ������ ���� ���� 
	/*
	 * ȭ�� ����
	 * 
	 * ���̾�α� â�� ������ ������Ʈ���� �غ��ϱ�
	 * 
	 * 1. �л� �̸� �Է� â ����� 
	 * 		1) �� : Label �����̸� = new Label("�̸� �Է�"); 
	 * 		2) �ؽ�Ʈ �ʵ� : TextField �����̸� = new TextField("ȫ�浿",10);
	 * 2. ���� ���� �Է� â �����
	 * 		1) ��
	 * 		2) �ؽ�Ʈ �ʵ�
	 * 3. ���� ���� �Է� â �����
	 * 		1) ��
	 * 		2) �ؽ�Ʈ �ʵ�
	 * 4. ���� ���� �Է� â �����
	 * 		1) ��
	 * 		2) �ؽ�Ʈ �ʵ� 
	 * 5. ���� ��� â �����
	 * 		-> ����ڰ� �̸� & ������ ���� �Է� �� ���� Ŭ������ �� �ڵ����� ���� ����ؼ� 
	 * 		-> ��� â�� ���� ���(��ư ����)
	 * 		1) �� : Label �����̸� = new Label("����");
	 * 		2) �� :  Label �����̸� = new Label("0"); -> ���߿� ������ ���⿡ ��� �ǵ���!
	 * 6. ��� ��� â �����
	 * 		-> ������ ��� â�� ������ �Ŀ� ������ �о�ͼ� ��� ���� ����� �� 
	 * 		��� â�� ��� ���� ���
	 * 		1) �� -> ��� 
	 * 		2) �� -> ���� ��� ("0.0");
	 * 7. ������ �Էµ� ��� �������� ���� �÷��� Ŭ������ �������ִ� ��ư �����
	 * 		1) ��ư : "���� ����"
	 * 8. ��� ��ư(���α׷� ����) 
	 * 
	 */
	
	// 1, �̸� �Է�â �����
	private Label input_name_lb1 = new Label("�л� �̸�");
	private TextField input_name_tf1 = new TextField("", 10);
	
	// 2. ���� ���� �Է�â �����
	private Label input_kor_score_lb1 = new Label("���� ����");
	private TextField input_kor_score_tf1 = new TextField("", 10);
	
	// 3. ���� ���� �Է�â �����
	private Label input_eng_score_lb1 = new Label("���� ����");
	private TextField input_eng_score_tf1 = new TextField("", 10);
	
	// 4. ���� ���� �Է�â �����
	private Label input_math_score_lb1 = new Label("���� ����");
	private TextField input_math_score_tf1 = new TextField("", 10);
	
	// 5. ���� ��� â
	private Label total_lb1 = new Label("����");
	private Label print_total_lb1 = new Label("0");
	
	// 6. ��� ��� â 
	private Label avg_lb1 = new Label("��� ����");
	private Label print_avg_lb1 = new Label("0.0");
	
	// 7. ���� ���� ��ư
	private Button child_save_score_bt = new Button("���� ����");
	
	// 8. ���α׷� ���� ��ư
	private Button child_exit_bt = new Button("���");
	
	
	// ���Ӱ� ����� GridBagLayout ��ġ �����ڸ� ����ϱ� ���� ��ü �غ�
	private GridBagLayout ref_grid_bag_layout = new GridBagLayout();
	
	// �׸��� �� ���̾ƿ��� Ư�� ��ġ�� ���� ������Ʈ�� ��ġ ������ ���ԵǴ�
	// GridBagConstraints Ķ������ ����� ��ü ���� 
	private GridBagConstraints ref_grid_bag_constraints = null;
	
	// ���� â���� �������� ���� ���� ���� ����
	private Vector<MyStudentScoreClass> ref_score = null;
	
	// ������ �Լ��� �̵��� ���� â Ŭ�������� �������� ���� ���͸� ref_score ������ 
	// �����ϴ� ��ɹ� �ۼ��ϱ�
	// this.ref_score = ������ �Լ����� ������ ���� ���� �̸� ; 
	
	
	// ���ο� ������Ʈ�� �׸��� �� ���̾ƿ��� Ư�� ��ġ(�� ��ġ, �� ��ġ)�� �־��ִ�
	// ���ο� �Լ� �����
	/*
	 * ��� ������Ʈ���� �θ� Ŭ������ Component�� ����ϸ�
	 * �ϳ��� �Լ��� ���� �ٸ� Ÿ����(Button, Label, TextField, TextArea ...)����
	 * ó���� �� �ִ� ������ �Լ��� ��
	 */
	public void add_compenent(
			Component ref_component, int row_index,
			int col_index) {
		
	//	System.out.println("���ο� ������Ʈ�� ���̾ƿ��� �ֱ�");
		this.ref_grid_bag_constraints = new GridBagConstraints();
		
		this.ref_grid_bag_constraints.gridx = col_index;
		this.ref_grid_bag_constraints.gridy = row_index;
		
		this.ref_grid_bag_constraints.weightx = 1 / 2.0;
		this.ref_grid_bag_constraints.fill = GridBagConstraints.HORIZONTAL;
		
		 this.ref_grid_bag_layout.setConstraints(ref_component, ref_grid_bag_constraints);
		 this.add(ref_component);
		 
		
	}
	
	
	/*
	 * ����ڰ� �Է��� ���� ������ �޴� �Լ� �����
	 */
	public boolean
		save_score(String name_value, int kor_value,
				int eng_value, int math_value) {
		System.out.println("�̸��� " + name_value);
		System.out.println("���� ������ " + kor_value);
		System.out.println("���� ������ " + eng_value);
		System.out.println("���� ������ " + math_value);
		
		// ����ڰ� �Է��� �������� ����ؼ� ���� ���ϱ�
		int temp_total = kor_value + eng_value + math_value;
		System.out.println("������ " + temp_total);
		
		// ��� ���ϱ�
		double temp_avg = temp_total / 3.0;
		System.out.printf("����� %.2f\n ",  temp_avg );
		
		// ���� ������ ȭ�鿡 �����
		print_total_lb1.setText(temp_total + "");
		
		// ����� ����ϱ����� String.format �Լ��� ����ؼ� �Ҽ��� �ڸ��� ����
		// String.format("%.2f", temp_avg);
		String temp_res_avg = String.format("%.2f", temp_avg);
		
		print_avg_lb1.setText(temp_res_avg);
		
		return true;
		
	}
	
	
	public MyShowRegChildFrame(
			Frame ref_parent_frame_object,
			String ref_title,
			boolean modal, Vector<MyStudentScoreClass> ref_score) {
		//Vector<MyStudentScoreClass> ref_score 
		
		// super() ��ɹ��� �ٸ� ��ɹ� ���� ���� �ۼ�
		super(ref_parent_frame_object, ref_title, modal);
		
		/*
		 * �ڽ�â�� ���� �� �ֵ��� �̾
		 */
		this.ref_reg_this = this;
		// �ڽ�â�� �ּҸ� ���⿡ ����?
		// �̾ ���� ��ư �̺�Ʈ�� �̵�!
		
		
		/*
		 * super() ��ɹ��� Dialog Ŭ������ �ִ� Dialog(Frame, String,boolean) ������ �Լ� ����
		 */
		
		
		// ���� â Ŭ�������� �������� ���� ���͸� ���� ������ �����ϴ� ��ɹ� 
		this.ref_score =ref_score;
		
		
		
		
		// actionPerformed() �Լ��� ���� ���޵Ǵ� ���� â�� �ּҸ� ������ ������ ���� ������
		// ref_parent_frame_object �� �����ϴ� ��ɹ�
		this.ref_parent_frame = ref_parent_frame_object;
		// this. Ŭ������ �ִ� ���� ����, ������ ���� ����
		
		// setLayout() �Լ��� ����� Dialog Ŭ������ ���� �ִ� �⺻ ��ġ�����ڸ�
		// BorgerLayout-> GridBagLayout ���� ����
		this.setLayout(ref_grid_bag_layout);
		
		
		/*
		 * ����ڰ� ���� ���� ��ư�� Ŭ���ϴ� ���
		 * ����ڰ� �Է��� ���� ��������
		 * 
		 */
		
		
		
		// ����ڰ� ���� ���� ��ư�� Ŭ���� ��쿡 ������ ��ɹ����� �ۼ� 
		this.child_save_score_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("����ڰ� ���� ���� ��ư�� Ŭ��");
				
				/*
				 * ��� ���� save_score() �Լ��� �����ϴ� ��ɹ� �ۼ�
				 * 
				 * save_score( �̸� ���ڿ�, ���� ����, ���� ����, ���� ����);
				 * �̸� ���ڿ��� input_name_tf.getText().trim();
				 * ���� ���� Integer.parseInt(input_kor_score_tf.getText().trim());
				 * 
				 */
				
				String temp_name = input_name_tf1.getText().trim();
				int temp_kor = Integer.parseInt(input_kor_score_tf1.getText().trim());
				int temp_eng = Integer.parseInt(input_eng_score_tf1.getText().trim());
				int temp_math = Integer.parseInt(input_math_score_tf1.getText().trim());
				
				
				boolean check_save_score = save_score(temp_name, temp_kor, temp_eng, temp_math);
				System.out.println("save_score() �Լ����� ��ȯ�� ���� " + check_save_score);
			
				
				
				MyStudentScoreClass ref_student_score = new MyStudentScoreClass(temp_name);
				ref_score.add(ref_student_score);
				
				
				// ����ڰ� �Է��� ������� ���Ϳ� ����
				ref_student_score.set_kor(temp_kor);
				ref_student_score.set_eng(temp_eng);
				ref_student_score.set_math(temp_math);

				// ���� ���ϱ� get_total () g������ ���� �� �ӽú��� ����
				int total = ref_student_score.get_total();
				System.out.println("���� ������ " + total);
				
				// ��� ���ϱ� get_avg() �Լ� ���� �� ���� ����
				double avg = ref_student_score.get_avg();
				System.out.printf("���� ����� %.2f\n", avg);
				
				// ���� Ŭ������ ���� �ִ� size() �Լ��� �����ؼ� ���ݱ��� ���� ������ �����
				// �л� ���� ������ �� �� ����
				int count = ref_score.size();
				System.out.println("���ݱ��� ����� �л� ���� ������ " + count + " �Դϴ�.");
				
			}
		});
		
		// ����ڰ� ��� ��ư�� Ŭ���� ��켼 ������ ��ɹ�!!!!
		this.child_exit_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// �ڽ�â�� ���� �;��!
				
				Window dialog_window = ref_reg_this;
				
				dialog_window.dispose();
			
			}
		});
		
		// ����ڰ� ��� ��ư�� Ŭ���� ��쿡 ������ ��ɹ����� �ۼ�..?
		
		/*this.child_exit_bt.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				// TODO Auto-generated method stub
				
						
						 * �ڹ� ���� �ӽ��� we ������ ���� �̺�Ʈ�� �߻��� ������ ������ ����
						 * 
						 * ������ ���� �̺�Ʈ�� �߻��� ������ ��ü�� �ּҸ� ��������
						 * -> getWindow() �Լ� ���
						 
						Window ref_window_ob = we.getWindow();
						// JOptionPane.showMessageDialog(this,"���� �Է��� ����մϴ�.");
						
						// ���� ȭ�鿡 �������� �ִ� ���̾�α� â�� �ݱ�
						// -> Window Ŭ������ ���� �ִ� dispose() �Լ� �ǻ�
						ref_window_ob.dispose();
						// System.exit(0);
					}
					
				});*/
			

		
		/*
		 * �̸� ��� �� ������Ʈ�� �׸��� �� ���̾ƿ��� ǥ �ȿ� �ֱ�
		 * 
		 * 1. ��ġ ������ : ���� ��ġ ��ȣ, ���� ��ġ ��ȣ�� ���ؾ� ��
		 *  	�� gridy , �� gridx ������ ����
		 *  ���� �׸��� �� ����Ʈ�������� �޸𸮿� ��������
		 */
	//	this.ref_grid_bag_constraints = new GridBagConstraints();
		/*
		 * input_name_lb1 �̸� ��� �� ������Ʈ�� ���� ��ġ ��ȣ�� ���� ���� gridy ������ ����
		 */
		
	//	this.ref_grid_bag_constraints.gridy = 0; // ù��° ��
		//this.ref_grid_bag_constraints.gridx = 0; // ù��° ��
		
		/*
		 * ������ ���� �� ���� ��ġ�� �׸��� �� ���̾ƿ� ��ü�� ���� -> setConstraints() �Լ� ���
		 */
		//this.ref_grid_bag_layout.setConstraints(this.input_name_lb1, ref_grid_bag_constraints);
		
		/*
		 * this.input_name_lb1 ������Ʈ�� �ֱ�
		 */
//		this.add(this.input_name_lb1);
		/*
		 * ù��° ��, �ι�° ĭ�� ���� �̸� �Է� ������Ʈ ����
		 */
		// 1. GridBagConstraints()
	//	this.ref_grid_bag_constraints = new GridBagConstraints();
		
		// 2. �� 0, �� 1
	//	this.ref_grid_bag_constraints.gridy = 0;
	//	this.ref_grid_bag_constraints.gridx = 1;
		
		// 3. setConstraints()s
	//	this.ref_grid_bag_layout.setConstraints(this.input_name_tf1, 	ref_grid_bag_constraints);
		
		// 4. add()
	//	this.add(this.input_name_tf1);
		
		// ��� ���� add_compenent() ����ϱ�
		// ù��° �� ù��° ������ ��� ��
		this.add_compenent(this.input_name_lb1,0,0);
		this.add_compenent(this.input_name_tf1, 0, 1);
		
		// �ι�° ���������� & �ؽ�Ʈ �ʵ�
		this.add_compenent(this.input_kor_score_lb1, 1, 0);
		this.add_compenent(this.input_kor_score_tf1, 1, 1);
		
		// ����° �������� ��& �ؽ�Ʈ
		this.add_compenent(this.input_eng_score_lb1,2, 0);
		this.add_compenent(this.input_eng_score_tf1, 2, 1);
		
		// �׹��� ���� ���� �� & �ؽ�Ʈ
		this.add_compenent(this.input_math_score_lb1, 3, 0);
		this.add_compenent(this.input_math_score_tf1,3,1);
		
		// �ټ����� ���� �� & ���� ��� ��
		this.add_compenent(this.total_lb1,4, 0);
		this.add_compenent(this.print_total_lb1, 4, 1);
		
		// ������° ��� �� & ��� ��
		this.add_compenent(this.avg_lb1, 5, 0);
		this.add_compenent(this.print_avg_lb1,5, 1);
		
		// 7��° ���� ��ư
		this.add_compenent(this.child_save_score_bt, 6, 0);
		
		// 8��° ��� ��ư
		this.add_compenent(this.child_exit_bt,6, 1);
		
		// ���̾�α� â�� ũ�� ����
		this.setSize(new Dimension(300,300));
		// this.setSize(int width, int height);
		this.pack(); // �� ���� ������
		
		// ���̾�α� â ����
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				
				/*
				 * �ڹ� ���� �ӽ��� we ������ ���� �̺�Ʈ�� �߻��� ������ ������ ����
				 * 
				 * ������ ���� �̺�Ʈ�� �߻��� ������ ��ü�� �ּҸ� ��������
				 * -> getWindow() �Լ� ���
				 */
				Window ref_window_ob = we.getWindow();
				
				// ���� ȭ�鿡 �������� �ִ� ���̾�α� â�� �ݱ�
				// -> Window Ŭ������ ���� �ִ� dispose() �Լ� �ǻ�
				ref_window_ob.dispose();
				// System.exit(0);
			}
			
		});
		
		// ���̾�α� ������ â�� ũ�⸦ ����ڰ� �ٲ��� ���ϵ��� �Ϸ��� 
		// setResizable() �Լ��� false �� ���� �ϸ��
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
}



// ȭ�鿡 ���� ��� ��ư�� ���� ��ȸ ��ư �׸��� ���α׷� ���� ��ư�� ������ִ� Ŭ���� �����
class MyMainFrame extends Frame implements ActionListener {
	
	// ���� ��� �ڽ� â�� ȭ�鿡 �����ִ� ��ư �����
	private Button show_reg_score_bt = new Button("���� ���");
	
	// ���� ��ȸ �ڽ� â�� ȭ�鿡 �����ִ� ��ư �����
	private Button show_find_score_bt = new Button("���� ��ȸ");
	
	// ���α׷� ���� ��ư
	private Button exit_bt = new Button("���α׷� ����");
	
	// ��� �ڽ� â���� �����ϴ� Vector ���� �غ� ! �� !!!!!!!!!!!!!!!
	// �ϳ��� �����ϱ� ���� static���� �غ� 
	private static Vector<MyStudentScoreClass> ref_student_score_ob 
							= new Vector<MyStudentScoreClass>();
	
	// ���� ũ�� Ű�ﶧ ����� ��Ʈ ����
	private static Font f = new Font("�ü�ü", Font.BOLD, 15); 
	
	
	/*
	 * setLocation() �Լ����� ����� x ��ǥ ���� ���� �˻��ϴ� �Լ�
	 * 
	 * x ��ǥ ���� ���� 0 ���� ���� ��쿡�� ����(false) ��ȯ
	 * �ƴ� ��쿡�� ��(true) ��ȯ
	 * 
	 * non-static �Լ��� �����
	 */
	public boolean check_x_positio(int x_position) {
		System.out.println("x ��ǥ ���� �˻��մϴ�.");
		if(x_position<0) {
			System.out.println("x ��ǥ ���� ���� ����");
			return false;
		}
		else {
			System.out.println("x ��ǥ ���� ���� ���");
			return true;
		}
	}
	// static �Լ��� �����
	public static boolean check_x_position2(int x_position) {
		System.out.println("x ��ǥ �� �˻�");
		if(x_position < 0) {
			System.out.println("x ��ǥ �� ����");
			return false;
		}
		else {
			System.out.println("x ��ǥ �� ���");
			return true;
		}
	}
	
	// y ��ǥ �˻� static �Լ� �����
	public static boolean check_y_positio(int y_position) {
	//	System.out.println("y ��ǥ �� �˻�");
		if(y_position < 0) {
			//System.out.println("y ��ǥ ���� ����");
			return false;
		}
		else {
			//System.out.println("y ��ǥ ���� 0 �̻�");
			return true;
		}
	}
	// ���ÿ� x ��ǥ�� y ��ǥ�� �˻��ϴ� static �Լ� �����
	public static boolean check_xy_position(int x_position, int y_position) {
		
		// ������ ���� check_x_position2() �Լ��� �����ؼ� x ��ǥ ���� ���� �˻�
		boolean result_check_x_position2 = check_x_position2(x_position);
		if(result_check_x_position2 == false) {
			return false;
		}
		// ������ ���� check_y_position() �Լ� ����
		boolean result_check_y_position = check_y_positio(y_position);
		if(result_check_y_position == false) {
			return false;
		}
		
		// ���α׷����� ����� �� �ִ� x, y ��ǥ ���� ȭ�鿡 ���
		System.out.println("x ��ǥ�� " + x_position);
		System.out.println("y ��ǥ�� " + y_position);
		return true; // �������� ���
		
	}
	
	
	/*
	 * ���� ����� ȭ���� ũ�⸦ ���ؼ� Dimension Ŭ���� ������ ��ȯ�ϴ� �Լ�
	 */
	public static Dimension get_screen_size() {
		// ����� ũ�⸦ �ӽ� �����ϴ� ���� ����
		Dimension temp_dimension;
		
		System.out.println("���� ����� ũ�⸦ ���մϴ�.");
		
		// getScreenSize() �Լ� ����
		// -> ������ ����� ũ��� �ӽ� ������ temp_dimension�� ����
		temp_dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		System.out.println("������� ���� ũ��� " + temp_dimension.width);
		System.out.println("������� ���� ũ��� " + temp_dimension.height);
		
		// ������� ���� & ���� ũ�⸦ �����ִ� �ӽú��� ��ȯ
		return temp_dimension;
		
	}
	
	
	// �⺻ ������ �����
	
	public MyMainFrame() {
		
		GridLayout grid_layout = new GridLayout(3,1,2,2);
		this.setLayout(grid_layout);
		this.add(show_reg_score_bt);
		this.add(show_find_score_bt);
		this.add(exit_bt);
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});	
		
		// ��ư�� �̺�Ʈ ����
		this.show_reg_score_bt.addActionListener(this);
		this.show_find_score_bt.addActionListener(this);
		this.exit_bt.addActionListener(this);
		
		// ������ ��ư�� ��Ʈ ����
		this.show_reg_score_bt.setFont(f);
		this.show_find_score_bt.setFont(f);
		this.exit_bt.setFont(f);
		
		this.setSize(500,500);
		this.pack();
		this.setResizable(false);
		
		/*
		 * ������ ���� check_x_position2() �Լ��� �����ؼ� setLocation() �Լ����� ����� x ��ǥ�� �̸� �˻�
		 */
		boolean check_position = check_x_position2(50);
		if(check_position == true) {
			//JOptionPane.showMessageDialog(this,"x ��ǥ ���� ���� ����� �� �ֽ��ϴ�.");
		} 
		else {
			//JOptionPane.showMessageDialog(this,"x ��ǥ ���� ���� ����� �� �����ϴ�.");
		}
		check_position = check_y_positio(-50);
		if(check_position == true) {
			//JOptionPane.showMessageDialog(this, "y ��ǥ ���� ���� ����� �� �ֽ��ϴ�.");
		}
		else {
			//JOptionPane.showMessageDialog(this, "y ��ǥ ���� ���� ����� �� �����ϴ�.");
		}
		
		
		/*
		 * ��� ���� get_screen_size() �Լ��� �����ؼ� ����� ũ�⸦ ���� ������
		 * ������ ����� ũ�⸦ �ӽ� ������ �����ϴ� ��ɹ�
		 */
		Dimension temp_screen_size = get_screen_size();
		
		// �ӽ� ������ temp_screen_size�� ����� ũ�⸦ ����
		// �� ��ġ������ ����� ũ�⸦ Ȯ�� �� �� ����
		System.out.println("���� ũ�� " + temp_screen_size.width);
		System.out.println("���� ũ�� " + temp_screen_size.height);
		
		/*
		 * ������� ���� ũ��� 1920
		 * ������� ���� ũ��� 1080
		 */
		
		/*
		 * ȭ�鿡 ������� ��� ��ġ ���ϱ�
		 * x ��ǥ �� ���ϱ� : ����� ���� ũ�� / 2 - �������� ���� ũ�� /2;
		 */
		int x_center_position ;
		// ȭ�鿡 ����� ���� â(������)�� ���� ũ�⸦ ���� ���� �ӽ� ������ ����
		// Frame Ŭ������ getSize() �Լ� ���
		
		// ���� â�� ���� ũ�⸸ �������� ��ɹ� 
		int temp_width_frame = this.getSize().width;
		
		// ���� â�� ���� ũ��� ���� ũ�� ��ü�� �������� ��ɹ�
		Dimension temp_frame = this.getSize();
		
		// ���� â�� ���� ũ�⸸ �������� ��ɹ�
		int temp_height_frame = this.getSize().height;
		
		// �ܼ� ȭ�鿡 ���� â�� ���� ũ���, ���� ũ�⸦ ���
		System.out.println("���� â�� ���� ũ�� " + temp_width_frame);
		System.out.println("���� â�� ���� ũ�� " + temp_height_frame);

		// ȭ�鿡 ������� ��� ��ġ�� ����� �������� ���� ��� x ��ǥ ���� ���ϱ�
		// -> (������� ���� ũ�� / 2) - ( �������� ���� ũ�� /2)
		
		x_center_position = (temp_screen_size.width/2) - (temp_width_frame / 2);
		int x_left_top_position = (temp_screen_size.width/2) - (temp_width_frame / 2);
		
		// ���� ����� y ��ǥ �� ���ϱ�
		// (������� ���� ũ�� / 2 ) - ( �������� ���� ũ�� /2)
		int y_left_top_position = (temp_screen_size.height / 2) - (temp_height_frame/2);
		
		System.out.println("ȭ�鿡 ����� ���� �������� ���� ��� ��ǥ ���ϱ� �Ϸ�");
		System.out.println("x ��ǥ�� " + x_left_top_position);
		System.out.println("y ��ǥ�� " + y_left_top_position);
				
		/*
		 *������� ���� ũ��� 1920
		 *������� ���� ũ��� 1080
		 *���� â�� ���� ũ�� 132
		 *���� â�� ���� ũ�� 116
		 */
		
		/*
		 * �������� ũ�⸦ ����ڰ� �ٲ��� ���ϵ��� �ϱ�
		 * -> setResizable() �Լ� ���
		 * -> setResizable(false) : ����ڰ� �� �ٲ�
		 */
		// setLocation �Լ��� ����ؼ� �������� ��ġ�� ������� ��� ��ġ�� �̵�
		this.setLocation(x_left_top_position, y_left_top_position);
		this.setVisible(true);
		
	}
	
	
	/*
	 * ����ڰ� ��ư�� Ŭ���ϴ� ��� �Ǵ� �ؽ�Ʈ �ʵ忡�� ���͸� ������ ��쿡
	 * �ڹ� ���� �ӽſ� ���ؼ� �ڵ����� ����Ǵ� �̺�Ʈ ó�� �Լ� 
	 */
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		/*
		 * �̺�Ʈ�� �߻��� ��(��ü)�� �ּҸ� ��������
		 * -> ActionEvent �̺�Ʈ�� ����  �ִ� getSource() �Լ� ����
		 */
		Object ref_event = ae.getSource();
		
		/*
		 * ���� ����ڰ� ��ư�� Ŭ���ϴ� ��� : ���ʿ��� ��ư ���� ���� �̸�.addActionListener(this)��
		 * �ִ��� ���� Ȯ��)
		 */
		if(ref_event instanceof Button) {
			System.out.println("����ڰ� ��ư�� Ŭ��");
			// Object �θ� Ŭ���� ������ ������ ref_event�� Button �ڽ� Ŭ���� 
			// ���������� ���� �� ��ȯ ���ֱ� : ��? �ڽ� Ŭ������ �ִ� �Լ����� �����ϱ� ����
			// (Button Ŭ�������� �ְ� Object Ŭ�������� ���� �Լ���)
			
			
			Button ref_clicked_bt = (Button)ref_event;
			
			// ��ư �߿��� � ��ư���� ���θ� �Ǵ��ϱ�
			// 1. ���� ��� ��ư�� ���
			if(ref_clicked_bt == show_reg_score_bt) {
				System.out.println("���� ��� ��ư Ŭ��");
				
				MyShowRegChildFrame ref_show_reg_child_frame = 
						new MyShowRegChildFrame(this, "���� ��� â", true, ref_student_score_ob);
				// �����ڿ� Vector�� �߰��Ǽ�..
				/*ref_show_reg_child_frame.setSize(500,500);
			
				ref_show_reg_child_frame.setVisible(true);*/
			}
			// 2. ���� ��ȸ ��ư 
			else if ( ref_clicked_bt == show_find_score_bt) {
				System.out.println("���� ��ȸ ��ư Ŭ��");
				
				new MyShowFindScoreChildFrame(this, "���� ��ȸ â", true, ref_student_score_ob);
				
				
			}
			else if ( ref_clicked_bt == exit_bt) {
				System.out.println("���α׷� ���� ��ư Ŭ��");
				JOptionPane.showMessageDialog(this,"���α׷��� �����մϴ�.");
				System.exit(0);
			}
			else {
				System.out.println("���� �Ŀ� ó���ϰڽ��ϴ�.");
				
			}
			
			
		}
		
		/*
		 * ���� ����ڰ� �ؽ�Ʈ �ʵ忡�� ���͸� ������ ���
		 */
		else if (ref_event instanceof TextField) {
			System.out.println("����ڰ� �ؽ�Ʈ �ʵ� �ȿ��� ���� Ŭ��");
		}
		
		

		
	}
	
	
}


// �л� ���� ���� Ŭ���� ����� 

class MyStudentScoreClass {
	
	
	
	// ���� ���� ����
	// ���� ���� ���� ���� 
	private int m_kor = 0;
	// ���� ���� ���� ����
	private int m_eng = 0;
	// ���� ���� ���� ����
	private int m_math = 0;
	// ���� ���� ����
	private int m_total = 0;
	// ��� ���� ���� ���� 
	private double m_avg = 0.0;
	
	// �л� �̸� ���� ���� ����
	private String m_name;
	
	// �л� ��ü ���� �����Ǵ� ��ȣ ���� ���� ���� : �ν��Ͻ� ���� ���� -> non-static ����
	private int m_no;
	
	// �л� ��ȣ�� ���鶧�� ���Ǵ� ���� : Ŭ���� ���� ���� -> static ���� 
	// �� ? �л� ��ȣ�� �����ϰ� �����Ǿ�� �ϸ�, ��� �л� ��ü���� ����(����)
	private static int s_no = 0;
	// 0 -> ù��° �л��� ��ȣ�� ������� ++s_no;
	// private static int s_no = 1; // �ٷ� ��� ���� -> �� �Ŀ��� ���� 
	
	
	
	// ������ ���ο� �л� ��ü�� ��������� ������ ���ο� �л� ��ȣ�� ����� 
	// ���� �л� ��ȣ�� ��ȯ(������ �Լ��� ����)�ϴ� static �Լ� �����
	public static int create_no() {
		
		++s_no; // m_no ���� ���� ����(non-static ������)
		System.out.println("���� ���� �л� ��ȣ�� " + s_no);
		return s_no;
		// ���� �����ڿ� ���� 
		// ���� �����ڿ� �ִ� ++s_no ����(�ߺ��Ǵϱ�)
		
	}
	
	
	
	// �⺻ ������ �����
	public MyStudentScoreClass() {
		
		
		System.out.println("�⺻ ������ ����");
		System.out.println("�л� ��ȣ �����");
		// ++s_no;
		// System.out.println("������� �л� ��ȣ�� " + s_no + "��"); // 0 -> 1
		
		m_no = create_no();
		System.out.println("����� �л� ��ȣ�� " + m_no + "��");
		m_name = "�����л�";
		System.out.println("�л��� �̸��� " + m_name);
		
		
		
	
	
	}
	// �ٸ� Ŭ������� ���� �̸��� �޴� ������ �Լ� �����
	public MyStudentScoreClass(String name) {
		System.out.println("�̸��� �޴� ������ �Լ� ����");
		this.m_name = name;
		System.out.println("�̸��� ���� ������ �����");
		// ++s_no;
		this.m_no = create_no();
		System.out.println(this.m_name + " �л��� ��ȣ�� " + this.m_no + "�� �Դϴ�.");
		
		
	}
	// ���ο� �Լ��� �߰��ؼ� �⺻ �����ڸ� ����ϴ� �ٸ� Ŭ�������� �л� �̸��� �ٲ� �� �ֵ���
	// ���ִ� �Լ� ����� main() �Լ��� ���� �ٲ� �л� �̸��� �޴� �Ϲ� �Լ� 
	public void change_name(String value) {
		System.out.println("main() �Լ����� ���ο� �ٲ� �̸��� �Է� �ޱ�");
		System.out.println("���� �̸��� " + m_name);
		System.out.println("�ٲ� �̸��� " + value);
		System.out.println("���� ������ �����մϴ�.");
		m_name = value;
	}
	
	/*
	 * ���� �߰��� ���� �Ѱ��� get(), set() �Լ� �����
	 */
	// private ������ m_kor���� ����� get() �Լ� �����
	public int get_kor() {
		System.out.println("���� ���� ������ �о���� �Լ�");
		return m_kor;
	}
	// private ������ m_kor ���� ����� set(���ο� ���� ����) �Լ� �����
	public void set_kor(int new_score) {
		System.out.println("���� ���� ������ �ٲߴϴ�.");
		m_kor = new_score;
	}
	
	// m_eng ������ ���� get(), set() �Լ� �����
	public int get_eng() {
		return m_eng;
	}
	public void set_eng(int new_score) {
		m_eng = new_score;
	}
	
	// m_math ������ ���� get(), set() �Լ� �����
	public int get_math() {
		return m_math;
	}
	public void set_math(int new_score) {
		m_math = new_score;
	}
	
	// private ������ m_total�� ���� get(), set() �Լ� �����
	// total�� ���� set() �Լ� ���ʿ��� ��
	public int get_total() {
		
		this.m_total = get_kor() + get_eng() + get_math();
		// ���� �Լ��� �����ؼ� ������ ���ϰ� �� �� ��ȯ
		return this.m_total;
	}
	/*public void set_total(int new_score) {
		
		m_total = new_score;
	}
	*/ 
	// private ������ m_avg�� ���� get(), set() �Լ� �����
	public double get_avg() {
		
		this.m_avg = get_total()/3.0; // ��� ���ϰ� ��ȯ 
		return this.m_avg;
	}
	/*public void set_avg(double new_score) {
		m_avg = new_score;
	}*/
	// �Ʊ� change_name() �Լ� ����Ŵ� set()�Լ�!
	// private ������ m_name�� ���� get �Լ� �����
	public String get_name() {
		return this.m_name;
	}
	
	public int get_no() {
		return m_no;
	}
	
	
	// �Ʒ� �Լ��� �׳� ���� �����
	public void input_name(String name) {
		
		this.m_name = name;
		++s_no;
		this.m_no = s_no;
		System.out.println(m_name + " �л��� ��ȣ�� " + m_no + "�� �Դϴ�.");
		
	}
	
	
	
	
	
}

public class TestAWTStudentScoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			MyMainFrame ref_frame = new MyMainFrame();
		
	/*	// ù ��° �л� ��ü ����� 
		MyStudentScoreClass ref_child_student1 = new MyStudentScoreClass();

		ref_child_student1.change_name("������");
		
	//	System.out.println("**********************************************");
		// �� ��° �л� ��ü �����
		MyStudentScoreClass ref_child_student2 = new MyStudentScoreClass();
	//	System.out.println("**********************************************");
		ref_child_student2.change_name("������");
		
	//	System.out.println("**********************************************");
		MyStudentScoreClass ref_child_student3 = new MyStudentScoreClass("������");
	//	ref_child_student1.input_name("������");
	// ref_child_student2.input_name("������");
	//	System.out.println("**********************************************");
		ref_child_student1.create_no();
	//	System.out.println("**********************************************");
		
		MyStudentScoreClass ref_child_student4 = new MyStudentScoreClass("����ȭ");
	//	System.out.println("**********************************************");
		
		// ������ �л��� ���� ������ 70
		ref_child_student3.set_kor(70);
		// ���� ������ 100
		ref_child_student3.set_eng(100);
		
		// ���� ������ 50;
		ref_child_student3.set_math(50);
		
		// ������ 
		int total = ref_child_student3.get_total();
		System.out.println("������ " + total);
		
		// ���
		double avg = ref_child_student3.get_avg();
		System.out.printf("����� %.2f \n",avg);
		
		
		 *  String Ŭ������ format�̶�� �Լ��� ����ؼ� �Ҽ��� �ڸ� ���� ����
		 *  -> String.format("�Ҽ��� �Ʒ� �ڸ��� �������� ���� �ۼ�", �Ǽ�);
		 *  -> String.fotmat("%.2f", avg);
		 *  -> avg�� �����Ǿ��ִ� �Ǽ��� ���ڿ��� �ٲ��Ŀ� ���ڿ��� ��ȯ 
		 
		
		String str_value = String.format("%.3f",avg);
		System.out.println("����� �Ҽ��� 3�ڸ����� ǥ���ϸ� " + str_value);
		
		*/
	
		

	}

}
