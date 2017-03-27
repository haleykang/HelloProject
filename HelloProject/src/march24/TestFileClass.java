package march24;

/*
 * ���� �����͸� �Է� �޴� ȭ�� �����
 * 
 * ���� �����͸� ���Ͽ� �����ϴ� ��ư �ֱ�
 * 
 * ���Ͽ� ����� ���� �����͸� �о�ͼ� ȭ�鿡 �����ִ� ��ư �ֱ�
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

// ���� ���� �Է°� ��� ó���ÿ��� java io ��Ű��(input, output) ���
// �Է� : ���Ͽ��� ���α׷����� �����͸� �о���� ��
// ��� : ���α׷����� �߻��ϴ� �����͸� ���Ͽ� ���� ��

import java.io.*;

// ȭ�鿡 ������ �����츦 ����� ������ִ� Ŭ���� �����


	

class MyFileFrame extends Frame implements ActionListener, TextListener {

	/*
	 * �Էµ� ������ �ϳ��� ���ڰ� ������ false, �����Ͱ� ��� false
	 *  �����̸� true ��ȯ�ϴ� �Լ�
	 *  
	 */
	public static boolean check_digit(String score){
		
		// �����(�� �Ǵ� ����)�� �����ϴ� ���� ����
		// ���� : ������ ���� �����͸� �߰����� ���� ���·� ǥ�� 
		boolean result = true;
		
		// ���� ���ڿ� �߿��� �ϳ��� ���ڸ� �о�ͼ� ������ ���� ����
		char temp_ch = ' ';
		
		// ���� ���� ���� ���ڿ� �ȿ� �ִ� ������ ������ ������ ���� ����
		int length = 0;
		
		// ���� ���� ���� ���ڿ��� ���� ������ ���� ���� ���� length�� ����
		length = score.length();
		
		// ���� ������ ���ų� ������ ��쿡�� ���� ��ȯ
		if(length <= 0) {
			result = false;
			return result;
		}
		System.out.println("���޹��� ������ ���� ������ " + length + "�� �Դϴ�");
		
		// �ݺ��� + Character.isDigit() �Լ��� ����ؼ� ���ڰ� �ƴ� ���ڰ� �ִ��� �˻�
		// -> ���ڸ� �߰��ϸ� ���� result�� false ���� ������ �Ŀ� �ݺ����� Ż���ϰų�
		// �Լ��� ����(return result)
		for(int i =0 ; i < length; ++i) {
			
			/*
			 * charAt(��ġ ��ȣ) �Լ��� �����ؼ� ���ڿ� ������ �ִ� score ��������
			 * �ϳ��� ���ڸ� �о�ͼ� ���� temp_ch�� ���� 
			 */
			temp_ch = score.charAt(i);
			/*
			 * isDigit() �Լ��� �����ؼ� �ϳ��� ���ڸ� ���� �ִ� temp_ch ������ ���� ����
			 * -> isDigit() �Լ��� ���� ���� ���ڰ� ������ ��쿡�� ��
			 * �� ���� ��쿡�� ������ ��ȯ 
			 */
			boolean temp_result = Character.isDigit(temp_ch);
			/*
			 * isDigit() �Լ��� ��ȯ�� ���� ���� �ִ� ���� temp_result�� �˻��ϱ�
			 * ���� false ���� ���� �ִٸ� ���ڰ� ���ԵǾ� �ִ� ��� �̹Ƿ�
			 * ���� result�� �������� �����ϰ� ���� �Լ��� ����(Ż��)
			 */
			if(temp_result == false) {
				result = false;
				return result;
			}
			
			return result;
		}
		
		// ��� ���ڰ� ������ ��쿡�� ����Ǵ� ��ɹ� 
		return result;
		
	}
	
	
// �̰� ���о� �ʹ� �������ϰ� �������!!!
	
public void check_length(String a) {
	
	int length = a.length();
	
	if(length > 0 && length < 4) {
		// �ڸ����� 3�ڸ��� ����
	System.out.println("����ڰ� �Է��� ���ڴ�" + a);
	System.out.println("�ڸ����� " + length);	
	} else {
		
		System.out.println("�߸� �Է� �߽��ϴ�.");
		JOptionPane.showMessageDialog(this, "3�ڸ��� ������ �Է��ϼ���.");
	}
}

// �ٽ� �Լ� �����

public static boolean check_score_length(String value) {
	// 1~3�ڸ��� true, 4�ڸ� �̻��̸� false
	
	int length = value.length();
	
	if(length > 0 && length < 4) return true;
	else return false;
	
}

public static void focus_change(TextField a) {
	
	// �Էµ� ���ڸ� �� �����ؼ� "" �������� ���� 
	a.selectAll();
	a.setText("");
	
	// �׸��� Ŀ���� a��ġ�� �����δ� �Լ�
	a.setFocusable(true);
	a.requestFocus();
	return;
	
}
	
	
	// TextListener �������̽��� ������ �ִ� �Լ��� �Ӹ��κ�!
 	// �����ͼ� ������
	@Override
	public void textValueChanged(TextEvent te) {
		System.out.println("�Է���...");
		
		/*
		  ��� ������Ʈ���� ������ �Է��ϰ� �ִ� ������ �Ǵ�
		 */
		
		Object t_event = te.getSource();
		
		if(t_event instanceof TextField ) {
			
			System.out.println("�ؽ�Ʈ �ʵ忡�� �Է���...");
			
			// �ϴ� getSource()�� �ؽ�Ʈ �ʵ�� ����ȯ
			TextField tf_ob = (TextField)t_event;
			
			// ���� ���� �Է� �������� �Ǵ��ϱ�
			if(tf_ob == kor_tf){
				
				System.out.println("���� ���� �Է���...");
				
				/*
				 * ����ڰ� �Է��� ���� ������ �ڸ��� �˾ƿ���
				 * 
				 * 1. ���� ����ڰ� �Է��� ���� ���� ��������
				 * -> TextField Ŭ������ ���� �ִ� getText() �Լ� ����
				 */
				String kor_value = tf_ob.getText().trim();
				
				if(kor_value.equals("") == false) {
					
				//	System.out.println("����ڰ� �Է��� ���ڴ�" + kor_value);
					// ����ڰ� �Է��� ���� ������ �ڸ��� �˾ƿ���
					
					
					// check_length(kor_value);
					/////////////////////////////////////// �ٽ� ���� ���� �Լ� ����ϱ�
					boolean temp = check_score_length(kor_value);
					
					if(temp == true) {
						System.out.println("1~3�ڸ� ������ ���� �Է�");
						
						
						
					} else {
						
						System.out.println("4�ڸ� �̻��� ���� �Է�");
						JOptionPane.showMessageDialog(this,"1~3�ڸ��� ������ �Է��ϼ���.");
						// kor_tf.setFocusable(true);
						// kor_tf.requestFocus(); 
						// return; -> �Լ��� �������
						focus_change(kor_tf);
					}
					/* int length = kor_value.length();
					// System.out.println("���� ������ �ڸ����� " + length);
					
					// ���߿� �Լ��� ����� -> �ϴ� �����
					if(length > 0 && length < 4) {
						// �ڸ����� 3�ڸ��� ����
					System.out.println("����ڰ� �Է��� ���ڴ�" + kor_value);
					System.out.println("���� ������ �ڸ����� " + length);	
					} else {
						
						System.out.println("�߸� �Է� �߽��ϴ�.");
						JOptionPane.showMessageDialog(this, "3�ڸ��� ������ �Է��ϼ���.");
						
						
						kor_tf.setFocusable(true);
						kor_tf.requestFocus();
						*/
						// �Լ��� �����
			
					} 
			}
			else if(tf_ob == eng_tf) {
				System.out.println("���� ���� �Է���...");
				
				String eng_value = tf_ob.getText().trim();
				
				if(eng_value.equals("") == false){
				
					// check_length(eng_value);
					boolean temp = check_score_length(eng_value);
					
					if(temp == true){
						
					} else {
						JOptionPane.showMessageDialog(this,"1~3�ڸ��� ������ �Է��ϼ���.");
						focus_change(eng_tf);
					}
				}
				
			}
			else if(tf_ob == math_tf) {
				System.out.println("���� ���� �Է���...");
				
				String math_value = tf_ob.getText().trim();
				
				if(math_value.equals("") == false){
					// check_length(math_value);
					boolean temp = check_score_length(math_value);
					
					if(temp == true) {
						
					}
					else {
						JOptionPane.showMessageDialog(this,"1~3�ڸ��� ������ �Է��ϼ���.");
						focus_change(math_tf);
					}
	
				}
			}
			else{
				System.out.println("��Ÿ...");
			}
		}
		else if(t_event instanceof TextArea) {
			
			System.out.println("�ؽ�Ʈ �Ʒ��ƿ��� �Է���...");
			
		}
		else {
			System.out.println("�ٸ� ������...");
		}
		
	}
	
	
	/*
	 * 1. ������ �����쿡 ���� ������Ʈ���� �غ��ϱ�
	 * 
	 * -> ȭ�� ���� : ù��° �� - ���� ���� �Է� �κ�
	 * �ι�° �� - ���� ���� �Է� �κ�
	 * ����° �� - ���� ���� �Է� �κ�
	 * �׹�° �� - ������ �Է��� �����͵��� ���Ͽ� �����ϴ� �κ� �����(��ư)
	 * & ���Ͽ� ����� ���� �����͵��� �ٽ� ȭ�鿡 ������ִ� �κ�
	 * �ټ����� �� - ������ �ʱ�ȭ ��ư / ��� ��ư ���� ���α׷� ����
	 * 
	 * ��) ���������Է� : (��) / ���� ���� ���� �Է��� �ؽ�Ʈ�ʵ�
	 * private Label kor_lb = new Label("���� ���� �Է�");
	 * private TextField kor_tf = new TextField("",50);
	 * 
	 */
	
	// ���� ���� �Է�
	private Label kor_lb = new Label("���� ����");
	private TextField kor_tf = new TextField("",20);
	
	// ���� ���� �Է�
	private Label eng_lb = new Label("���� ����");
	private TextField eng_tf = new TextField("",20);
	
	// ���� ���� �Է�
	private Label math_lb = new Label("���� ����");
	private TextField math_tf = new TextField("",20);
	
	//���Ͽ� ����� ���� ������ ���� ��ư & ����� ������ ���
	private Button save_bt = new Button("���� �����ϱ�");
	// private TextField save_tf =  new TextField("",50);
	
	// ����� ���� �ҷ�����
	private Button print_bt = new Button("���� �ҷ�����");
	
	// �л��� �Է��� ���� �����͸� �ʱ�ȭ �ϴ� ��ư
	private Button reset_bt = new Button("���� �����");
	
	// ���α׷��� �������ִ� ��ư �����
	private Button cancel_bt = new Button("����");
	
	// 2. �⺻ ������ �Լ� �����
	
	public MyFileFrame() {
		// Ÿ��Ʋ �����
		super("���� �Է�/���� ����/ ���� �б� ������ ������");
		
		// ��ġ �����ڴ� �׸��� ���̾ƿ� ���
		this.setLayout(new GridLayout(5,2,2,2));
		
		this.add(this.kor_lb);
		this.add(this.kor_tf);
		
		this.add(this.eng_lb);
		this.add(this.eng_tf);
		
		this.add(this.math_lb);
		this.add(this.math_tf);
		
		this.add(this.save_bt);
		//this.add(this.save_tf);
		this.add(this.print_bt);
		
		this.add(this.reset_bt);
		this.add(this.cancel_bt);
		
		
		// ���� �Լ�
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
			
	
		// ������ ��ư, �ؽ�Ʈ �ʵ� �� �̺�Ʈ ó�� ����
		this.kor_tf.addActionListener(this);
		this.eng_tf.addActionListener(this);
		this.math_tf.addActionListener(this);
		this.save_bt.addActionListener(this);
		this.reset_bt.addActionListener(this);
		this.cancel_bt.addActionListener(this);
		this.print_bt.addActionListener(this);
		
		// ������ ���� �߰��� textValueChanged() �Լ��� 
		// ����ڰ� ���� ������ �Է��ϴ� TextField ������Ʈ�� ����
		this.kor_tf.addTextListener(this);
		eng_tf.addTextListener(this);
		math_tf.addTextListener(this);
		
		
		
		this.setSize(200,200);
		// this.pack(); // �� ���� ������
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 1. �̺�Ʈ�� �߻��� ��ü �ּҸ� �о�ͼ� ����������
		Object event_source = e.getSource();
		
		// 2. �̺�Ʈ�� ��� �߻��ߴ��� Ȯ��
		if(event_source instanceof Button) {
			// ����ڰ� ��ư Ŭ��
			System.out.println("����ڰ� ��ư�� Ŭ��");
			
			// ���� �θ� Ŭ���� ������ ������ Ÿ���� �ڽ� Ŭ������ ����
			Button clicked_bt = (Button)event_source;
			
			//���� ���� ��ư Ŭ��
			if(clicked_bt == save_bt) {
				
				System.out.println("���� ���� ��ư Ŭ��");
				
				/*
				 * ��� ���� check_digit() �Լ���  �����ؼ�
				 * ���� ������ ���ڿ� �ȿ� �ִ� ���ڰ� �ִ��� ���θ� �˻�
				 * ���ڰ� �ִ� ��� ����ڿ��� �˷��ֱ�
				 */
				
				boolean check_kor = check_digit(kor_tf.getText().trim());
				boolean check_eng = check_digit(eng_tf.getText().trim());
				boolean check_math = check_digit(math_tf.getText().trim());
				
				if(check_kor == false) {
					// ���� ���� �ȿ� ���ڰ� �ִ� ��� �����ϴ� ��ɹ� �ۼ�
					JOptionPane.showMessageDialog(this,"���� ���� �ȿ� ���� �߰�! \n���ڸ� �Է��ϼ���.");
					focus_change(kor_tf); 
			
				} else if(check_eng == false) {
					JOptionPane.showMessageDialog(this,"���� ���� �ȿ� ���� �߰�! \n���ڸ� �Է��ϼ���.");
					focus_change(eng_tf); 
					
				} else if(check_math == false) {
					
					JOptionPane.showMessageDialog(this,"���� ���� �ȿ� ���� �߰�! \n���ڸ� �Է��ϼ���.");
					focus_change(math_tf); 
				} else {
					System.out.println("���̷����?");
				}
			
				
				int kor_score = Integer.parseInt(kor_tf.getText().trim());
				int eng_score =  Integer.parseInt(eng_tf.getText().trim());
				int math_score = Integer.parseInt(math_tf.getText().trim());
				
				System.out.println("���ڸ� �ִ� ���� ������ " + kor_score);
				System.out.println("���ڸ� �ִ� ���� ������ " + eng_score);
				System.out.println("���ڸ� �ִ� ���� ������ " + math_score);
				
				/*
				 * 
				 * 
				 * ���� �����͵��� ���Ͽ� �����ϱ�
				 * 
				 * ���Ͽ� ������ �����͵��� ��� ����
				 * 
				 * ���� ���� ���� ��� ����� ���� �ִ� Ŭ���� ��� : FileWriter Ŭ���� ���
				 * ����Ʈ ������ ���Ͽ� �����͸� �����ϰ� ���� ��쿡�� FileOutputStream
				 * 
				 *  ������ �����ؾ� �ϴ� ������
				 *  1) ���� �̸� : score_file.txt
				 *  2) ���� ���� ��ġ : ���� �̸��� ����ϸ� ���� ��ġ�� ������ ������
				 *  
				 *  �ڹ� ��ũ �����̽� �۾� ���丮 �ȿ� �ִ� ������Ʈ ��� �ȿ� ������ ����
				 *  -> FileWriter ������ �ּ� ���� ���� �̸� = nwe FileWriter("���� ���� ���� �̸� �ۼ�");
				 *  
				 *  ��) FileWriter ref_file = new FileWriter("score_file.txt");
				 *  -> ��Ŭ�������� �˰� �ִ� ��ũ �����̽� ���丮���� ���� -> �� �ȿ��� ���� �ҽ� ������ �ִ� ������Ʈ�� �̵�
				 *  -> �̰��� ���ο� ������ ����� ��
				 *  
				 *  ��) FileWriter ref_file2 = new FileWriter("C:\\ �θ� ���丮 �̸� \\ ���丮�̸�\\score_file.txt");
				 *  
				 *  -> �θ� ���丮�̸�, ���丮�̸� ���丮�� �ִ� ���¿��� ����
				 *  -> ������ IQException ���ܻ�Ȳ�� �߻��Ǿ� ���α׷� ��ü ���� 
				 *  
				 *  -> FileWriter Ŭ���� : ���� ���� + ���� �ȿ� �����͵� ������
				 *  ���ο� ���ϸ� �����ϰ��� �ϴ� ��쿡�� File Ŭ������ ����ص� ��
				 *  -> File Ŭ���� : ���� �Ǵ� ���丮�� ����(������ ������ ����) 
				 *  
				 *  1) FileWriter ���� ���� ���� �̸� = new FileWriter("���� ���� �̸� �ۼ�");
				 *  2) FileWriter Ŭ������ ���� �ִ� wirte() �Լ��� ����ؼ� �����͸� ���Ͽ� �����ϱ�
				 *  	-> ���� ���������̸� . write(������);
				 *  3) ���Ͽ� ��� �����͸� ������ �Ŀ��� close()�Լ��� ����ؼ� �� �ݾ������(���ϸ� ������ �ս��� ���� �� ����)
				 *   	-> ���� ���� ���� �̸� . close();
				 *   
				 *   2. File Ŭ������ ���
				 *   1) File ���� ���� ���� �̸� = new File("���� ���� �̸� �ۼ�");
				 *   2) File Ŭ������ ���� �ִ� createNewFile() �Լ��� ����ؼ� ������ ����
				 *   		-> boolean check = ���� ���� �̸�.createNewFile();
				 *   		if(check == true) {
				 *   		System.out.println("���ο� ������ ��������ϴ�.");
				 *   		} else {
				 *   		System.out.println("���ο� ������ ������ ���߽��ϴ�.");
				 *   		}
				 */
				
				
				FileWriter ref_file_ob = null;
				String ref_file_name = "score_file.txt";
				try {
					
					System.out.println("���ο� ������ " + ref_file_name + "�� ����ϴ�.");
					
					ref_file_ob = new FileWriter(ref_file_name);
					// write() �Լ��� ����� ���� �����͵��� ���Ͽ� ����
					
					System.out.println("���Ͽ� ������ ���� ������ " + kor_score + "��, ���� ������ " + eng_score + "��, ���� ������ " + math_score);
					
					ref_file_ob.write(kor_score + "," + eng_score + "," + math_score);
					
					//���Ͽ� ��� ���� �����͵��� ������ �������� �� ������ �ݾƾ���
					
					ref_file_ob.close();
					System.out.println("���Ͽ� ���� �����͵��� �����߽��ϴ�.");
					
					
				} catch(IOException e1) {
					System.out.println("���� ���� �Է°� ��¿��� ���ܻ�Ȳ �߻�");
					System.out.println("������ " + e1.getMessage());
					
				} catch (Exception e2) {
					System.out.println("���� ��Ȳ �߻�");
					System.out.println("������ " + e2.getMessage());
					
				}
				
			}
			else if(clicked_bt == print_bt) {
				// ���� �ҷ����� ��ư Ŭ��
				System.out.println("���� �ҷ����� ��ư Ŭ��");
				
				
				/*
				 * 1.FileReader Ŭ������ ����� ���� ���� ���� : read() �Լ� ���(2����Ʈ��)
				 * 2. BufferedReader Ŭ������ ����� ���� ���� ���� : readLine() (���پ�)�Լ��� ���
				 * 3. readLine() �Լ��� ���ؼ� �о�� ���� ������ ���� ������ ���� ����
				 *  -> String line = "";
				 */
				FileReader ref_file_reader = null;
				
				BufferedReader ref_burffered_reader =null;
				
				String line = "";
				try {
					
					ref_file_reader = new FileReader("score_file.txt");
					ref_burffered_reader = new BufferedReader(ref_file_reader);
					
					// ���� 3���� ���� �����Ͱ� ����Ǵ� �迭 
					String [] str_array = null;
					
					
					while((line = ref_burffered_reader.readLine()) != null) {
						
						System.out.println("���Ͽ��� �о�� ���� �����͵��� " + line + " �Դϴ�.");
						
						str_array = line.split(",");
						
						// ������ �������� TextField �Է� â�� ���
						if(str_array.length > 0 ) {
							
							// ���� ����
							kor_tf.setText(str_array[0]);
							// ���� ����
							eng_tf.setText(str_array[1]);
							// ���� ����
							math_tf.setText(str_array[2]);
							
							System.out.println("���� ���� : " + str_array[0] + "\n" + "���� ���� : " + str_array[1] + "\n" +
							"���� ���� : " + str_array[2]);
					
							
						} else {
							System.out.println("���Ͽ��� ���� �����͸� �������� ���߽��ϴ�.");
							break;
						}
						
						
						
					}
					// ���Ͽ��� ��� �����͵��� �о�� ��쿡 ������ new �����ڿ� ���ؼ� �޸𸮷� ���� 
					// ��ü���� ����
					if(ref_burffered_reader != null) {
						ref_burffered_reader.close();
					}
					if(ref_file_reader != null) {
						ref_file_reader.close();
					}
					
				} catch(IOException e4) {
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
				
				
			}
			else if(clicked_bt == reset_bt ) {
				// ���� ����� ��ư Ŭ��
				System.out.println("���� ����� ��ư Ŭ��");
				
			}
			else if(clicked_bt == cancel_bt) {
				System.out.println("���� ��ư Ŭ��");
				// ���α׷� �����ϰڽ��ϴ�. â ���� ���α׷� ����
				
				JOptionPane.showMessageDialog(this,"���α׷��� �����մϴ�.");
				System.exit(0);
				
			}
			else {
				System.out.println("�߸��� ����");
			}
			
		}
		else if (event_source instanceof TextField) {
			// ����ڰ� �ؽ�Ʈ�ʵ忡 �Է�
			System.out.println("����ڰ� �ؽ�Ʈ �ʵ忡 �Է�");
			
			
			
		}
		else {
			System.out.println("�߸��� ���� �Դϴ�.");
		}
		
		
		
	}


}




public class TestFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFileFrame a = new MyFileFrame();

	}

}
