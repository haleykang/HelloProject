package march21;

/*
 * ��ġ �����ڸ� ������� �ʴ� ���� �ۼ�
 */
import java.awt.*;
import java.awt.event.*;

/*
 * Frame Ŭ������ �θ� Ŭ������ �����ϰ� ActionListener �������̽��� �����ϴ�
 * ���ο� �ڽ� Ŭ���� �����
 * 
 */
class MyNullLayoutFrame extends Frame implements ActionListener {
	
	
	// 1. 6���� ��ư �غ�
	// 		1) 6���� ������ ��ư ���� �� ����
	private Button button1 = new Button("1");
	private Button button2 = new Button("2");
	private Button button3 = new Button("3");
	private Button button4 = new Button("4");
	private Button button5 = new Button("5");
	private Button button6 = new Button("6");
	
	// 		2) 1���� �迭 ���� ���
/*	private String [] str_array = {"1","2","3","4","5","6"};
	private Button [] button_array = new Button[5];
	{
		for(int i = 0; i< button_array.length; ++i) {
		button_array[i] = ((i+1) + "");
		
		}
		
	}*/

	
	// 		3) 2���� �迭 ���� ���
	
/*	private Button [][] button_array2 = new Button [3][2];
	
	{
		for(int i = 0; i <button_array2.length; ++i) {
			Button [] temp = button_array2[i];
			for(int j = 0 ;  j < temp.length; ++j) {
				temp[j] = new Button();
			}
		}
		
	}*/
	
	// 		4) ��ư�� ���� ũ�⸦ �ٲ� �� ����� ��Ʈ ��ü �����
	private Font font = new Font("�ü�ü", Font.BOLD, 20);
	/*
	 * �ü�ü : �۲� �̸�
	 * Font.BOLD : ��Ÿ��(����)
	 * 20 : ���� ũ�� 
	 * 
	 */
	
	
	// �⺻ ������ �����
	public MyNullLayoutFrame() {
		// �θ� Ŭ������ Frame�� ���� �ִ� ������(Frame(String))�� �����ؼ�
		// ������ ������ Ÿ��Ʋ�� ����
		super("null layout frame");
		
		// add() �Լ� ��� ���� ���� �� !
		this.setLayout(null);
		
		// ù��° ��ư�� ��Ʈ ��ü�� �����ؼ� ���� ũ��� �۲�, ��Ÿ���� �ٲ�
		this.button1.setFont(font);
		this.button2.setFont(font);
		this.button3.setFont(font);
		this.button4.setFont(font);
		this.button5.setFont(font);
		this.button6.setFont(font);
/*		
		this.button1.setBounds(50,50,100,30);
		this.button2.setBounds(50,50,100,30);
		this.button3.setBounds(50,50,100,30);
		this.button4.setBounds(50,50,100,30);
		this.button5.setBounds(50,50,100,30);
		this.button6.setBounds(50,50,100,30);*/
	
		/*
		 * ������ �������� ���� ũ��� ���� ũ�⸦ ����
		 */
		this.setSize(100,100);
		
		/*
		 * ������ ������� ��ư�� ��ư ���̿� �߻��ϴ� �� �������� �����ִ� ��ɹ� 
		 */
		
		this.pack();
		
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		
		
		/*
		 * Ÿ��Ʋ�� ��µǴ� ������ ũ�⸦ ���ϱ�
		 */
		Insets insets = this.getInsets();
		
		System.out.println("Ÿ��Ʋ�� ��µǴ� Ÿ��Ʋ ���� ���̸� ���");
		System.out.println("������ ������ �� �Ʒ� �ִ� ���� �� �β��� " + insets.bottom);
		System.out.println("������ ������ ���� ���� �� �β��� " + insets.left);
		System.out.println("������ ������ ������ ���� �� �β��� " + insets.right);
		System.out.println("������ ������ ��� Ÿ��Ʋ ���� �β��� " + insets.top);
	
		
		
		/*
		 * ����� ȭ���� ũ�� : �ػ�
		 */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("���� ����� ȭ���� ���� ũ��� " + screenSize.width);
		System.out.println("���� ����� ȭ���� ���� ũ��� " + screenSize.height);
		
		this.setSize(screenSize);

		this.button1.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button2.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button3.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button4.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button5.setBounds(10 + insets.left, 20 + insets.top,100,30);
		this.button6.setBounds(10 + insets.left, 20 + insets.top,100,30);
		
		
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
		/*
		 * 6���� ��ư�� Ŭ���ϴ� ��쿡 ����Ǵ� ��ɹ��� �ۼ�
		 */
		/*
		 * ����ڰ� ��ư�� Ŭ���ϸ� Ŭ�� ������ actionEvent ������ ����
		 * �ڹ� ����ӽ��� �ڵ����� �־��� 
		 * 
		 * Button ��ư��ü���������̸��� = new Button("1");
		 * -> "1" : �� �Ǵ� action Command
		 */
		/*
		 * �� �Լ��� ��ư���� �߻��ϰ� TextField ������Ʈ�� ����ϴ� ��쿡�� �߻��ϱ�
		 * ������ ��𿡼� �߻� �ߴ��� �˻����־�� ��
		 * -> getSource() �Լ��� ����ؼ� �̺�Ʈ�� �߻��� ��ü�� �ּҸ� ������
		 * 		-> ��ȯ ���� Object : ��� Ŭ������ �θ� Ŭ����
		 * 		-> ��� �ڽ� Ŭ������ �̵� ���� : �ּҸ� ���� ����
		 * 		-> Object ��ü���������̸� = new Object();
		 * 		-> Object ��ü���������̸� = �ٸ� Ŭ�����̸�();
		 */
		// �̺�Ʈ�� �߻��� ��ü�� �ּҸ� ������
		Object event_object = actionEvent.getSource();
		
		/*
		 * ���� ���� event_object�� ����� ��ü�� Button���� TextField���� ����
		 * -> instanceof ������ 
		 * 		-> ��ư���� �̺�Ʈ �߻��ϸ� true ��ȯ
		 * 		-> ��ư�� �ƴ� ������ �̺�Ʈ�� �߻��ϸ� false ��ȯ 
		 * if(event_object instanceof Button) {}
		 */
		
		if(event_object instanceof Button) {
			System.out.println("��ư���� �̺�Ʈ�� �߻��߽��ϴ�.");
			
			/*
			 * 6���� ��ư �� � ��ư���� �̺�Ʈ�� �߻��ߴ��� �˻�
			 */
			// 1. ����ȯ �������� (Button)�� ����ؼ� Object Ŭ������
			// Button Ŭ������ �����ؾ���
			// event_object ������ ������ Ÿ��(Ŭ���� �̸�)�� Object 
			// Button Ŭ������ ���� �ִ� �Լ��� ����ϱ� ���ؼ���
			// Object -> Button Ŭ������ �ٲ����
			Button clicked_button = (Button)event_object;
			
			// getActionCommand() �Լ��� ����ؼ� ��ư�� ���� �ִ� ��(�ؽ�Ʈ)�� ���� ��
			// -> ���ڿ� -> String
			
			String command = clicked_button.getActionCommand();
			System.out.println("command : " + command);
		}
		else if(event_object instanceof TextField) {
			System.out.println("�ؽ�Ʈ �ʵ� �Է� â���� ���� Ű�� �������ϴ�.");
		}
		
	}
}

public class TestNullLayoutClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNullLayoutFrame a = new MyNullLayoutFrame();
		

	}

}
