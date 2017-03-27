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
	
	// �⺻ ������ �����
	
	public MyMainFrame() {
		
		this.add(BorderLayout.NORTH, show_reg_score_bt);
		this.add(BorderLayout.CENTER, show_find_score_bt);
		this.add(BorderLayout.SOUTH, exit_bt);
		
		
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
		 * �������� ũ�⸦ ����ڰ� �ٲ��� ���ϵ��� �ϱ�
		 * -> setResizable() �Լ� ���
		 * -> setResizable(false) : ����ڰ� �� �ٲ�
		 */
		this.setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		

		
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
		return m_name;
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
		
		// ù ��° �л� ��ü ����� 
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
		
		/*
		 *  String Ŭ������ format�̶�� �Լ��� ����ؼ� �Ҽ��� �ڸ� ���� ����
		 *  -> String.format("�Ҽ��� �Ʒ� �ڸ��� �������� ���� �ۼ�", �Ǽ�);
		 *  -> String.fotmat("%.2f", avg);
		 *  -> avg�� �����Ǿ��ִ� �Ǽ��� ���ڿ��� �ٲ��Ŀ� ���ڿ��� ��ȯ 
		 */
		
		String str_value = String.format("%.3f",avg);
		System.out.println("����� �Ҽ��� 3�ڸ����� ǥ���ϸ� " + str_value);
		
		
	
		

	}

}
