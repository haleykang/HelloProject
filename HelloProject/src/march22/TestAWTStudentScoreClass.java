package march22;


/*
 * �׸��巹�̾ƿ� �̿��� - �迭 5�� 2��(�׸��� ���̾ƿ� + �ǳ�) ���� ����
���� �Է� + ���� ���ϴ�
ȭ�� ���� 
1��° �� : �������� ��� �� + �������� �Է� �ؽ�Ʈ �ʵ�
2��° �� : �������� ��� �� + �������� �Է� �ؽ�Ʈ �ʵ�
3��° �� : �������� ��� �� + �������� �Է� ����
4��° �� : ���� ���ϱ� ��ư 
 * 5��° �� : ���� ��� ��� �Ǹ� ����
 * 
 */

// �ϴ� �ʿ��� Ŭ���� import

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class MyScoreFrame extends Frame implements ActionListener {
	
	/* 
	 * 2.�ʿ��� ���� : �Էµ� ���� ����, �Էµ� ���� ����, �Էµ� ���� ����, ���� ���� ����
	 * 1.�ʿ��� �� & �ؽ�Ʈ �ʵ� ����
	 */
	
	// ���� ���� �Է� â
	private Label kor_label = new Label("���� ����");
	private TextField kor_tf = new TextField("",20);
	
	// ���� ���� �Է� â
	private Label eng_label = new Label("���� ����");
	private TextField eng_tf = new TextField("", 20);
	
	// ���� ���� �Է� â
	private Label math_label = new Label("���� ����");
	private TextField math_tf = new TextField("",20);
	
	// ���� ���ϱ� ��ư ����
	
	Button total_bt = new Button("���� ���ϱ�");
	
	// ������ ���Ǿ ������ â ����� 
	// -> ���???????
	// �ϴ� ���� �� & �ؽ�Ʈ�ʵ�
	
	private Label total_label = new Label("����");
	private TextField total_tf = new TextField("",20);
	
	
	// �׸��� ���̾ƿ� ��ġ ������ �غ�(5�� 2�� ǥ�� �����
	// �ȿ� ���� ������Ʈ�� ���� ������ 2��
	private GridLayout gridLayout = new GridLayout(5,2,2,2);
	
	// �׸��� ���̾ƿ��� ����ϴ� �ǳ� ����
	//private Panel panel = new Panel();
	
	// ����ڰ� �Է��� ���� ���� ���� ���� ���� ����
	
	int kor_score = 0;	
	int eng_score = 0;
	int math_score = 0;
	
	// ������ ���� ���� ����
	int total_score = 0;
	
	// ��Ʈ �ٲܼ��� �����ϱ� ��Ʈ �ϴ� ����
	private Font font = new Font("����ü", Font.BOLD,20);
	{
		this.kor_label.setFont(font);
		this.kor_tf.setFont(font);
		this.eng_label.setFont(font);
		this.eng_tf.setFont(font);
		this.math_label.setFont(font);
		this.math_tf.setFont(font);
		this.total_bt.setFont(font);
		this.total_label.setFont(font);
		this.total_tf.setFont(font);
	}
	
	
	
	// �Լ� �����
	
public void my_score_event() {
	

	// System.out.println("��ư Ŭ�� �̺�Ʈ �׽�Ʈ");
	
	/*
	 * ���� 
	 * 1) �� �� �� �ϳ��� �Է� ���ϰ� ����  -> �ٽ� �Է��϶�� â ���� �Է� �ȵ� ������ Ŀ�� �̵�
	 * 2) �� �� �� �Է� �ϰ� ����  -> ���� ���ϱ� 
	 */
	
	// (1) ����ڰ� �Է��� ���� ������ �о�� �ӽ� ������ ����
	String temp_kor = kor_tf.getText().trim();
	
	// (2) ����ڰ� �Է��� ���� ���� ����
	String temp_eng = eng_tf.getText().trim();
	
	// (3) ����ڰ� �Է��� ���� ���� �ӽ� ����
	String temp_math = math_tf.getText().trim();
	
			
	// ������ ������ �� �Է��ϰ� ��ư Ŭ���� ���
	if(temp_kor.equals("") == false && temp_eng.equals("") == false &&
			temp_math.equals("") == false){
		// System.out.println("����ڰ� 3���� ������ �� �Է� �߽��ϴ�.");
		
		// �� ���� �Է� ���� ��!
		
		// �ùٸ��� �Է� �����ϱ� 
		// ���� ������ ����ڰ� �Էµ� ���ڿ��� ���������� �ٲ㼭 ����
		
		// try~catch ���� ���� ���� �̿ܿ� �ٸ� ���ڸ� �Է� �� ��� ���� �߻� ���� �ȳ�!
		
	try{
		kor_score = Integer.parseInt(temp_kor);

		// ���� ����
		eng_score = Integer.parseInt(temp_eng);
		
		// ���� ����
		math_score = Integer.parseInt(temp_math);
		} catch(Exception e) {
			
		System.out.println("���� �߻�");
		System.out.println("������ " + e.getMessage());
			
	}
		
		
		
		// 0~100 ������ ������ �Է��ؾ���! �ƴϸ� �ٽ� �Է��ش޶�� â�� �ѱ�
		
		if(kor_score > 0 && kor_score <= 100 && eng_score > 0 && eng_score <= 100 &&
				math_score > 0 && math_score <= 100) {
			
			// ���� ����
			total_score = kor_score + eng_score + math_score;
			
			// System.out.println(total_score);
			// �� ����� �� ��� â�� �������!!! -> ���...?
			// setText() �Լ��� ����!!! ��, �� �Լ��� ���ڿ��� �����ϱ� 
			// total_score + "" �̷��� ���ڿ��� ������ֱ�!!!!
			
			total_tf.setText(total_score + "");
		} else {
			// 0~100 ������ ������ �Է� ������ ��,
			
			JOptionPane.showMessageDialog(this,"0~100�� ������ ������ �Է��ϼ���.");
			kor_tf.setFocusable(true);


			
			//requestFocus() �Լ��� ����ؼ� ������ Ŀ���� ��ġ��
			// TextField ������Ʈ�� �̵�
			kor_tf.requestFocus();
			
			return;
		}
			
		
		

	} else if (temp_kor.equals("") == true ) {
		
		
		JOptionPane.showMessageDialog(this,"���� ������ �Է��ϼ���.");
		kor_tf.setFocusable(true);


		
		//requestFocus() �Լ��� ����ؼ� ������ Ŀ���� ��ġ��
		// TextField ������Ʈ�� �̵�
		kor_tf.requestFocus();
		
		return;
		
	} 
	else if (temp_eng.equals("") == true) {
		
		JOptionPane.showMessageDialog(this,"���� ������ �Է��ϼ���.");
		// Ŀ���� ���� �Է� â����
		eng_tf.setFocusable(true);
		eng_tf.requestFocus();
	
		
		
	} 
	else if (temp_math.equals("") == true ) {
		
		JOptionPane.showMessageDialog(this,"���� ������ �Է��ϼ���.");
		// Ŀ���� ���� �Է� â����
		math_tf.setFocusable(true);
		math_tf.requestFocus();
	}
	
	else {
		// ����ڰ� �� ������ �� �Ѱ����� �Է����� ���� ���
		// �߸��� �Է��Դϴ�. �ٽ� �Է����ּ���. â ����
		// �̰͵� �ٲ� ����..?

		JOptionPane.showMessageDialog(this,"������ ������ ��� ������ �Է��ϼ���.");
		
		
		// setFocusable () �Լ��� ����ؼ� TextField ������Ʈ�� 
		// Ŀ���� �� �� �ֵ��� �غ�
		kor_tf.setFocusable(true);
		
		//requestFocus() �Լ��� ����ؼ� ������ Ŀ���� ��ġ��
		// TextField ������Ʈ�� �̵�
		kor_tf.requestFocus();
		
		return;
		
	}

	
}


	
	public MyScoreFrame() {
		// �⺻ ������
		// super() �̿��ؼ� ��ܹ� �ۼ�
		super("Haley's Score Program");
		
		// setLayout �Լ��� ����ؼ� Frame Ŭ�������� ���� �ִ� 
		// �⺻ ��ġ �������� BorderLayout�� GridLayout���� �ٲٱ�
		this.setLayout(gridLayout);
		
		
		// ù��° �� ���� ���� �� & �ؽ�Ʈ �ʵ�
		this.add(this.kor_label);
		this.add(this.kor_tf);
		
		// �ι�° �� ���� ���� �� & �ؽ�Ʈ �ʵ�
		this.add(this.eng_label);
		this.add(this.eng_tf);
		
		// ����° �� ���� ���� �� & �ؽ�Ʈ �ʵ�
		this.add(this.math_label);
		this.add(this.math_tf);
		
		// �׹�° �� ���� ��
		this.add(this.total_label);
		this.add(this.total_tf);
		
		
		// �ټ���° ���� ���ϱ� ��ư 
		this.add(this.total_bt); 
	//	this.add(panel);
		// �̰� ��� �ø� �� ������ !!!!!!!!!!!!!! -> �ǳ� ���
		
		// ���� ��� ������ â�� ���??????????????????????????????????
		
		
		// ����ڰ� ������ ���� ��ư�� ������ ��쿡 â�� ��������
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		// ����ڰ� ������ ������ �Է��ϰ� ����Ű�� ������ ��쿡 �߻��ϴ�
		// ActionEvent �̺�Ʈ�� ó���ϱ� ���� ��ɹ� �ۼ�
		
		this.kor_tf.addActionListener(this);
		this.eng_tf.addActionListener(this);
		this.math_tf.addActionListener(this);
		
		// ����ڰ� ���� ���ϱ� ��ư�� Ŭ�� ���� ��쿡 �߻��ϴ� �̺�Ʈ��
		// ó���ϱ� ���� ��ɹ� �ۼ�
		
		this.total_bt.addActionListener(this);
	

		// �ϴ� â�� ���̰� �ϴ� setSize�Լ��� setVisible �Լ� ���
		this.setSize(300, 200);
		this.setVisible(true);
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		// 1. ���� getSource() �Լ��� �̿��Ͽ� �̺�Ʈ�� �߻��� ��ü�� �ּҸ� �����ͼ�
		// ������ ���� �ϱ�
		Object ref_event = e.getSource();
		
		// 2. instanceof �����ڷ� �̺�Ʈ�� ��ư���� �߻����� ���, �ؽ�Ʈ �ʵ忡�� �߻�����
		// ��츦 ������ if�� �����
		
		// 2-1.�̺�Ʈ�� ��ư���� �߻��ϴ� ���
		if(ref_event instanceof Button) {
			
			my_score_event(); // �Լ� ó��
		/*	System.out.println("��ư Ŭ�� �̺�Ʈ �׽�Ʈ");
			
			
			 * ���� 
			 * 1) �� �� �� �ϳ��� �Է� ���ϰ� ����  -> �ٽ� �Է��϶�� â ���� �Է� �ȵ� ������ Ŀ�� �̵�
			 * 2) �� �� �� �Է� �ϰ� ����  -> ���� ���ϱ� 
			 
			
			// (1) ����ڰ� �Է��� ���� ������ �о�� �ӽ� ������ ����
			String temp_kor = kor_tf.getText().trim();
			
			// (2) ����ڰ� �Է��� ���� ���� ����
			String temp_eng = eng_tf.getText().trim();
			
			// (3) ����ڰ� �Է��� ���� ���� �ӽ� ����
			String temp_math = math_tf.getText().trim();
			
					
			// ������ ������ �� �Է��ϰ� ��ư Ŭ���� ���
			if(temp_kor.equals("") == false && temp_eng.equals("") == false &&
					temp_math.equals("") == false){
				System.out.println("����ڰ� 3���� ������ �� �Է� �߽��ϴ�.");
				
				// �ùٸ��� �Է� �����ϱ� 
				// ���� ������ ����ڰ� �Էµ� ���ڿ��� ���������� �ٲ㼭 ����
				kor_score = Integer.parseInt(temp_kor);
				
				// ���� ����
				eng_score = Integer.parseInt(temp_eng);
				
				// ���� ����
				math_score = Integer.parseInt(temp_math);
				
				// ���� ����
				total_score = kor_score + eng_score + math_score;
				
				System.out.println(total_score);
				// �� ����� �� ��� â�� �������!!! -> ���...?
				// setText() �Լ��� ����!!! ��, �� �Լ��� ���ڿ��� �����ϱ� 
				// total_score + "" �̷��� ���ڿ��� ������ֱ�!!!!
				
				total_tf.setText(total_score + "");
	
			} else {
				// ����ڰ� �� ������ �� �Ѱ����� �Է����� ���� ���
				// �߸��� �Է��Դϴ�. �ٽ� �Է����ּ���. â ����
			
				JOptionPane.showMessageDialog(this,"������ ������ ��� ������ �Է��ϼ���.");
				
				
				// setFocusable () �Լ��� ����ؼ� TextField ������Ʈ�� 
				// Ŀ���� �� �� �ֵ��� �غ�
				kor_tf.setFocusable(true);
				
				//requestFocus() �Լ��� ����ؼ� ������ Ŀ���� ��ġ��
				// TextField ������Ʈ�� �̵�
				kor_tf.requestFocus();
				
				return;
				
			}
		*/}
	
		
		// 2-2. �̺�Ʈ�� �ؽ�Ʈ�ʵ忡�� �߻��ϴ� ���
		else if (ref_event instanceof TextField) {
		//	System.out.println("�ؽ�Ʈ �ʵ忡�� ���� Ŭ�� �̺�Ʈ �׽�Ʈ ");
			
			my_score_event();
			
		}
	
	}

	
	
	
}

public class TestAWTStudentScoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		MyScoreFrame myscoreframe = new MyScoreFrame();
	
	}

}
