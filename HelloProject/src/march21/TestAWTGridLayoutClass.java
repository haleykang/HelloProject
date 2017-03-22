package march21;

/*
 * �׸��巹�̾ƿ� ��ġ �����ڸ� ����ϴ� �������� ���α׷�
 */

import java.awt.*;
import java.awt.event.*;

/*
 * ��� ����� ����ؼ� Frame Ŭ������ �θ� Ŭ������ �����ϱ�
 * ����ڰ� ��ư�� Ŭ���� ��쿡 �����ϴ� �̺�Ʈ ó���� ���� 
 * ActionListener �������̽� �����ϴ� ���ο� Ŭ���� �����
 * 
 *  class ���ο�Ŭ�����̸� extends Frame implements ActionListener {
 *  
 *  	// ����ڰ� ��ư�� Ŭ���� ��쿡 �����ϴ� actionPerformed() �޼ҵ带
 *  	// ������ �ϱ�
 *  	@Override
 *  	public void actionPerformed(ActionEvent �����̸�) {
 *  	
 *  	}
 * 
 */

class MyAWTGridLayoutFrame extends Frame implements ActionListener {
	
	/*
	 * 1. ��ư �غ��ϱ�
	 * 		1) �׸��� ���̾ƿ� ��ġ �����ڿ� ���� 6���� ��ư �غ��ϱ�
	 * 		
	 * 		��. ���� 6���� �غ��ϱ�
	 * 
	 * 		��. �迭�� �����ϰ� ����ϱ�
	 * 			a. 1���� �迭
	 * 			b. 2���� �迭
	 */
	// 1. ���� 6�� �غ��ϱ�
	Button button1 = new Button("1");
	Button button2 = new Button("2");
	Button button3 = new Button("3");
	Button button4 = new Button("4");
	Button button5 = new Button("5");
	Button button6 = new Button("6");
	
	// a. 1���� �迭
	// ����� �޸� ������ ���ÿ� �ϱ�
	Button button_array1[] = new Button[6];
	
	{
		/*
		 * �ʱ�ȭ �� -> ������ �Լ� ���� ���� ����Ǵ� ��
		 * �߰�ȣ�� �� �־����
		 */
		for(int i = 0; i < button_array1.length; ++i) {
			button_array1[i] = new Button((i+1)+"");
		}
		
	}
	
	// b. 2���� �迭
	/*
	 * 1) Button Ŭ���� ���
	 * 2) �迭 �̸� ���� �����
	 * 3) 2���� �迭 : ���ȣ ��ȣ�� �ι� �ۼ�
	 * 4) �ʱⰪ(�迭�� ���̸�) : "1","2","3","4","5","6"
	 * 
	 */
	Button [][] button_array2 = new Button[3][2];
	{
		// ������ ���� 2���� �迭�� ����ؼ� 6���� ��ư�� �޸𸮿� ����
		for(int i = 0; i < button_array2.length; ++i) {
			// ���� ����
			for( int j = 0; j < button_array2[i].length; ++j) {
				// ���� ����
				/*
				 * new Button ( ���ڿ� ) ��ɾ ����ϴ� ��ɹ� �ۼ�
				 */
				button_array2[i][j] = new Button((i+1) + "");
			}
		}
	}
	// Frame Ŭ������ ���� �ִ� �⺻ ��ġ �����ڴ� BorderLayout
	// ����ϰ��� �ϴ� ��ġ �����ڴ� GridLayout ������
	// BorderLayout -> GridLayout�� ���� �ؾ��� 
	// : Frame Ŭ������ ���� �ִ� setLayout() �Լ��� ����ؼ�!
	
	// 1. GridLayout ��ġ ������ �����
	GridLayout gridLayout = new GridLayout(3,2,5,5);
	/*
	 * 
	 * 3 : ���� ����
	 * 2 : ���� ����
	 * 5 : ��ġ ������ �ȿ� ���� ��ư���� ���� ����(����)
	 * 5 : ��ġ ������ �ȿ� ���� ��ư���� ���� ����(����)	
	 * 
	 */
	// �����ڸ� ���� ���� �ʱ�ȭ ���� ��ɹ����� ��� ����
	public MyAWTGridLayoutFrame() {
		// ������ ������ Ÿ��Ʋ�� Frame Ŭ������ �ִ� �����ڸ� �����ؼ� ����
		super("gridlayout test frame");
		
		// setLayout() �Լ��� �����ؼ� Frame Ŭ������ �⺻ ��ġ ��������
		// BorderLayout -> GridLayout���� ����
		this.setLayout(gridLayout);
		
		/*
		 * add() �Լ��� ����ؼ� 6���� ��ư���� GridLayout ��ġ �����ڿ�
		 * �ϳ��� �ֱ�
		 */
		// 1. 6���� ������ �ֱ�
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);

		// 2. 1���� �迭 �ֱ�
		
		for ( int i = 0 ; i < button_array1.length; ++i ){
			this.add(button_array1[i]);
			
		}
		
		
		// 3. 2���� �迭 �ֱ�
		for(int i = 0 ; i < button_array2.length; ++i) {
			for(int j = 0; j < button_array2[i].length; ++j) {
				
				this.add(button_array2[i][j]);
			}
		} // �̷��� �ϸ� �ȵ� 1 1 2 2 3 3 �̷��� ���� 
		
		// 4. ������ ���� �̺�Ʈ ó���� ���� addWindowListener �޼ҵ� ����
		// + �̺�Ʈ ó�� ��ü �����(new WindowAdapter())
		// + �̺�Ʈ ó�� ��ɹ� �ۼ��ϱ�
		/*
		 * @Override
		 * public void windowClosing(WindowEvent windowEvent) {
		 * System.exit(0);
		 * }
		 */
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing (WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		this.setSize(500, 500);
		this.setVisible(true);
		
	} 
	
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
	}
}

class MyAWTGridLayout2Frame extends Frame implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
	}
}

public class TestAWTGridLayoutClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAWTGridLayoutFrame a = new MyAWTGridLayoutFrame();
		
		

	}

}
