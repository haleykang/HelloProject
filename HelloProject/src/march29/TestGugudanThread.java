package march29;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * ȭ�鿡 â�� ������ִ� Ŭ���� �����
 */
class GugudanFrameClass extends Frame implements ActionListener {
	
	
	/*
	 * 8���� TextArea�� �迭�� �غ�
	 */
	private TextArea ref_ta_array [] = new TextArea [8];
	// 8���� TextArea ������ ������ ���� ��
	
	{
		System.out.println("������ ���� TextArea �迭�� ��ü�� ���� ������ ����");
		for(int i = 0; i < ref_ta_array.length; ++i) {
			ref_ta_array[i] =  new TextArea("",10,10);
			/*
			 * "" : ȭ�鿡 ������ ���ڿ�
			 * 10 : ��(���� �ټ�)�� ����
			 * 10 : ��(���� ĭ��)�� ����
			 */
			
		} // end of for(int i = 0 ~)
	} // end of block
	
	// 8���� ���� �غ� : ������ ����ϰ� ����ϴµ� �ҿ�� �ð��� �����ִ� ������Ʈ
	private Label [] ref_lb_array = new Label[8];
	// ������ ������ ����� ���� ���� ���� ����
	// ���� ������ ���� ������ �޸� �����ϴ´� ���� ������ �Լ�() , �Լ�(), �ʱ�ȭ ������ ���� 
	{
		System.out.println("**������ ������ �� �迭 ��ü ����**");
		for(int i = 0; i < ref_lb_array.length; ++i) {
			ref_lb_array[i] = new Label("�ҿ� �ð� : 0.0��");
		} // end of for
	} // end of block 2
	
	// ������ ���� ����� �����ϴ� ��ư ��ü �غ�
	private Button ref_start_bt = new Button("��� ����");
	
	// ���α׷� ���� ��ư ��ü �غ�
	private Button ref_exit_bt = new Button("����");
	
	/*
	 * ȭ�� ����
	 * 
	 * ù°�� : 2��/3��/4��/5�� �ؽ�Ʈ �Ʒ���
	 * ��°�� : 2��/3��/4��/5�� ��� �ð� ��� ��
	 * ��°�� : 6��/7��/8��/9�� �ؽ�Ʈ �Ʒ��� 
	 * ��°�� : 6��/7��/8��/9�� ��� �ð� ��� �� 
	 * �ټ�° : ��� ���� & ���� ��ư // ���� ���� ���� �ٸ� -> �ǳڿ� �־ ����..? 
	 */
	// ��� ���� ��ư�� ���� ��ư�� �� �ǳ� �غ�
	private Panel ref_panel = new Panel();
	
	// �׸��� �� ���̾ƿ� �غ�
	private GridBagLayout ref_gb_layout = new GridBagLayout();
	
	// �׸��� �� ����Ʈ������
	private GridBagConstraints ref_gbc = new GridBagConstraints();
	
	// ǥ�� �߰��ϱ�
	private Label title_lb = new Label("Haley's GUGUDAN");
	
	
	
	// ��Ʈ �غ�
	private Font f = new Font("����ü",Font.BOLD, 15);
	
	
	// GridBag Label ��� & Ta ��� �Լ� ������
	
	public void setGridbag(int y, int x, Component a) {
		
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.gridx = x;
	gbc.gridy = y;
	
	ref_gb_layout.setConstraints(a, gbc);
	this.add(a);
	}
	
	public String setgugu(int a) {
		
		// ������ ��µ� �Լ���!
		
		String temp_res = "";
		// temp_res = 2 +"*" + 1 + "=" + (2+1) + "\r\n";
		temp_res = "<" + a + "��>\r\n";
		
		for(int i = 1; i <=9 ; ++i) {
			
			if(i == 1) {
				temp_res += "\r\n";
				// ������ ���� temp_res�� "**2��**"���� ���������ϱ�
				// temp_res += "\r\n"; -> temp_res = "**2��**" +"\r\n" 
				temp_res += a + "*" + i + "=" + (a*i) + "\r\n" ;
			}
			else {
				/*
				 * i�� 2�� �Ǵ� ������ ����Ǵ� ��ɹ� 
				 * i�� 3�� �Ǵ� ����
				 * ...
				 * i�� 9�� �Ǵ� ������~~
				 */
				temp_res += a + "*" + i + "=" + (a*i) + "\r\n";
			} // end of else
			
		} // end of for
		
		return temp_res;
		
	}
	
	
	
	
	
	
	
	// 2�� ���&��¿��� ����ϴ� ������ Ŭ���� �����..............
	private class MyTwoDanThread extends Thread {
		
		/*
		 * 1. ó�� �ð��� ������ ���� ���� 
		 * 		1) ���� �ð��� ������ ���� : long start_t = 0L;
		 * 		2) ���� �ð��� ������ ���� : long end_t = 0L;
		 */
		long start_t = 0L;
		long end_t = 0L;
		
		// �ٱ� Ŭ�������� ������ ta�� �� ���
		// -> ta �迭�� ù���� ��� ref_ta_array[0] -> 2�� ���
		// -> �� �迭 ù��° ��� : ref_lb_array[0] -> �ð� ���
		
		
		// main() �Լ��� �����ϰ� ����Ǵ� run() �Լ� ������
		@Override
		public void run() {
			
			
			// �Լ� �Ẹ��
			start_t = System.nanoTime();
			
			String temp_res = setgugu(2);
			/*// ref_ta_array[0] �� ���ڿ��� 2�� ����� ����� �� ����� �ӽ� ���� ����
			String temp_res = "";
			// temp_res = 2 +"*" + 1 + "=" + (2+1) + "\r\n";
			temp_res = "**2��**\r\n";
			
			start_t = System.nanoTime();
			for(int i = 1; i <=9 ; ++i) {
				
				if(i == 1) {
					temp_res += "\r\n";
					// ������ ���� temp_res�� "**2��**"���� ���������ϱ�
					// temp_res += "\r\n"; -> temp_res = "**2��**" +"\r\n" 
					temp_res += 2 + "*" + i + "=" + (2*i) + "\r\n" ;
				}
				else {
					
					 * i�� 2�� �Ǵ� ������ ����Ǵ� ��ɹ� 
					 * i�� 3�� �Ǵ� ����
					 * ...
					 * i�� 9�� �Ǵ� ������~~
					 
					temp_res += 2 + "*" + i + "=" + (2*i) + "\r\n";
				} // end of else
				
			} // end of for
*/			
			// 2���� ��� ����� �Ŀ��� 2���� ����ϴµ� �ҿ�� �ð��� ���ؼ� end_t �� ����
			end_t = System.nanoTime();
			// �ҿ� �ð� ��� : �Ǽ� ������
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			
			
			String temptime = String.format("%.11f��", elapsed_t);
			
			// �ؽ�Ʈ �Ʒ��� & �� ������Ʈ�� 2�ܰ� �ҿ� �ð� ���
			ref_ta_array[0].setText(temp_res);
			ref_lb_array[0].setText(temptime);
		
		} // end of run()
	} // end of class MyTwoDanThread
	
	
	// 3�� ��� ��� ������ Ŭ����
	private class MyThreeDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
		
			start_t = System.nanoTime();
			String temp_res = setgugu(3);
			
			end_t = System.nanoTime();
			// �ҿ� �ð� ��� : �Ǽ� ������
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f��", elapsed_t);
			
			// �ؽ�Ʈ �Ʒ��� & �� ������Ʈ�� 3�ܰ� �ҿ� �ð� ���
			ref_ta_array[1].setText(temp_res);
			ref_lb_array[1].setText(temptime);
		}
	}
	
	// 4�� Ŭ����
	
	private class MyFourDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(4);
			
			end_t = System.nanoTime();
			// �ҿ� �ð� ��� : �Ǽ� ������
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f��", elapsed_t);
			
			// �ؽ�Ʈ �Ʒ��� & �� ������Ʈ�� 4�ܰ� �ҿ� �ð� ���
			ref_ta_array[2].setText(temp_res);
			ref_lb_array[2].setText(temptime);
			
		}
	}
	
	// 5�� Ŭ����
	private class MyFiveDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(5);
			
			end_t = System.nanoTime();
			// �ҿ� �ð� ��� : �Ǽ� ������
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f��", elapsed_t);
			
			
			// �ؽ�Ʈ �Ʒ��� & �� ������Ʈ�� 5�ܰ� �ҿ� �ð� ���
			ref_ta_array[3].setText(temp_res);
			ref_lb_array[3].setText(temptime);
			
		}
	}
	
	// 6�� Ŭ����
	private class MySixDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(6);
			
			end_t = System.nanoTime();
			// �ҿ� �ð� ��� : �Ǽ� ������
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f��", elapsed_t);
			
			// �ؽ�Ʈ �Ʒ��� & �� ������Ʈ�� 6�ܰ� �ҿ� �ð� ���
			ref_ta_array[4].setText(temp_res);
			ref_lb_array[4].setText(temptime);
			
			
		}
	}
	// 7�� Ŭ����
	
	private class MySevenDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(7);
			
			end_t = System.nanoTime();
			// �ҿ� �ð� ��� : �Ǽ� ������
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f��", elapsed_t);
			
			// �ؽ�Ʈ �Ʒ��� & �� ������Ʈ�� 7�ܰ� �ҿ� �ð� ���
			ref_ta_array[5].setText(temp_res);
			ref_lb_array[5].setText(temptime);
			
		}
	}
	
	// 8�� Ŭ����
	private class MyEightDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(8);
			end_t = System.nanoTime();
			
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f��", elapsed_t);
			
			ref_ta_array[6].setText(temp_res);
			ref_lb_array[6].setText(temptime);
			
		}
	}
	// 9�� Ŭ����
	private class MyNineDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(9);
			end_t = System.nanoTime();
			
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f��", elapsed_t);
			// �Ҽ��� 5�ڸ������� ����ϰ� ����
			
			//String t_t = String.format("%.5", elapsed_t);
		
			
			ref_ta_array[7].setText(temp_res);
			ref_lb_array[7].setText(temptime);
			
		}
	}
	
	
	
	
	// ���� â�� �ݾ��ִ� windowClosing() �Լ��� ���� ���� Ŭ���� �����
	private class MyInnerWindowHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
	
	
	
	// ������ �Լ� �غ�
	// �⺻ ������ �Լ�
	public GugudanFrameClass() {
		
		super("MyGugudan Window");
		
		/*
		 * SetLayout() �Լ� ����� �⺻ ��ġ ������ �ٲٱ�
		 */
		this.setLayout(ref_gb_layout);
		/*
		 * ������ ���� �̺�Ʈ ó��
		 */
		this.addWindowListener(new MyInnerWindowHandler());
		
		/*
		 * ������ ����� ���۽����ִ� start ��ư���� �߻��Ǵ� Ŭ�� �̺�Ʈ ó�� ��ɹ� �ۼ�
		 */
		this.ref_start_bt.addActionListener(this);
		/*
		 * ���� ��ư Ŭ�� �̺�Ʈ
		 */
		this.ref_exit_bt.addActionListener(this);
		
		/*
		 * ������ ���� ��Ʈ���� ������Ʈ�� ����
		 */
		this.ref_start_bt.setFont(f);
		this.ref_exit_bt.setFont(f);
		this.title_lb.setFont(new Font("�ü�ü",Font.BOLD, 58));
		
		
		
		/*
		 * 8���� ta ������Ʈ ��Ʈ ó��
		 */
		for(int i =0; i < ref_ta_array.length; ++i) {
			ref_ta_array[i].setFont(f);
		}
		/*
		 * 8���� �󺧵� ��Ʈ ����
		 */
		for(int i = 0; i < ref_lb_array.length; ++i) {
			ref_lb_array[i].setFont(f);
		}
		// 2���� ��ư�� �� �ǳ� ��ü�� ���� ����
		this.ref_panel.setFont(f);
		
		// �ǳڿ� ���� ��ư & ���� ��ư �ֱ�
		this.ref_panel.add(ref_start_bt);
		this.ref_panel.add(ref_exit_bt);
		
		/*
		 * ù��° �� -> gridx = 0 ;
		 * ù��° ĭ -> gridy = 0;
		 * 2�� ��� ��� ref_ta_array[0]
		 */
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridx = 0;
		gbc_title.gridy = 0;
		gbc_title.gridwidth = 4;
		ref_gb_layout.setConstraints(title_lb, gbc_title);
		this.add(title_lb);
		
		
		// ���� ���� �Լ� �Ẹ��
		setGridbag(1,0,this.ref_ta_array[0]);
		
	/*	GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		
		ref_gb_layout.setConstraints(this.ref_ta_array[0], gbc1);
		this.add(this.ref_ta_array[0]);*/
		
		/*
		 * �ι�° ĭ x = 1 ;
		 * ù��° �� y = 0 ;
		 * 3��
		 */
		
		// �Լ��� �ٲٱ�
		setGridbag(1,1,this.ref_ta_array[1]);
		
		/*GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 1;
		gbc2.gridy = 0;
		
		ref_gb_layout.setConstraints(this.ref_ta_array[1], gbc2);
		this.add(this.ref_ta_array[1]);*/
		
		/*
		 * 4��
		 *  x= 2; y = 0 (ù��° �� ����° ĭ)
		 */
		
		setGridbag(1,2,this.ref_ta_array[2]);
		/*
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.gridx = 2;
		gbc3.gridy = 0;
		
		ref_gb_layout.setConstraints(this.ref_ta_array[2], gbc3);
		this.add(this.ref_ta_array[2]);*/
		
		/*
		 * 5��
		 * x = 3, y=0 (4��° ĭ, ù��° ��)
		 */
		
		setGridbag(1,3,this.ref_ta_array[3]);
	/*	GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.gridx = 3;
		gbc4.gridy = 0;
		
		ref_gb_layout.setConstraints(this.ref_ta_array[3], gbc4);
		this.add(this.ref_ta_array[3]);
		*/
		/*
		 * 2�� ��
		 * x = 0
		 * y = 1 ( �ι�° ��, ù��° ĭ)
		 */
		
		/*
		 * 2��° �� �Լ��� �� ��� 
		 */
		setGridbag(2,0,this.ref_lb_array[0]);
		setGridbag(2,1,this.ref_lb_array[1]);
		setGridbag(2,2,this.ref_lb_array[2]);
		setGridbag(2,3,this.ref_lb_array[3]);
		
		
		/*
		GridBagConstraints gbc5 = new GridBagConstraints();
		gbc5.gridx = 0;
		gbc5.gridy = 1;
		
		ref_gb_layout.setConstraints(this.ref_lb_array[0], gbc5);
		this.add(this.ref_lb_array[0]);
		
		
		 * 3�� �ҿ�ð� ��
		 * x=1
		 * y=1
		 
		
		GridBagConstraints gbc6 = new GridBagConstraints();
		gbc6.gridx = 1;
		gbc6.gridy = 1;
		
		ref_gb_layout.setConstraints(this.ref_lb_array[1], gbc6);
		this.add(this.ref_lb_array[1]);
		
		
		 * 4�� �ҿ�ð� ��
		 * x=2
		 * y=1 
		 
		GridBagConstraints gbc7 = new GridBagConstraints();
		gbc7.gridx = 2;
		gbc7.gridy = 1;
		
		ref_gb_layout.setConstraints(this.ref_lb_array[2], gbc7);
		this.add(this.ref_lb_array[2]);
		
		
		 * 5�� ��
		 
		GridBagConstraints gbc8 = new GridBagConstraints();
		gbc8.gridx = 3;
		gbc8.gridy = 1;
		
		ref_gb_layout.setConstraints(this.ref_lb_array[3], gbc8);
		this.add(this.ref_lb_array[3]);
		*/
		
		/*
		 * �������� ���۽����ִ� ���� ��ư�� ���α׷� ���� ��ư�� �ǳڿ� �ִ� ����
		 * �ǳ��� �׸��� �� ���̾ƿ��� �ֱ�
		 */
		
		/*
		 * 3��° �� : 6~9�� ��� Ta ������Ʈ
		 * y = 2
		 * x = 0 ~
		 * �迭 ��ġ 4~7
		 * 
		 */
		setGridbag(3,0,this.ref_ta_array[4]);
		setGridbag(3,1,this.ref_ta_array[5]);
		setGridbag(3,2,this.ref_ta_array[6]);
		setGridbag(3,3,this.ref_ta_array[7]);
		
		
		/*
		 * 4��° �� : 6~9�� �ҿ�ð� ��
		 * y = 3
		 * x = 0 ~
		 * �� �迭 4 ~7
		 */
		setGridbag(4,0,this.ref_lb_array[4]);
		setGridbag(4,1,this.ref_lb_array[5]);
		setGridbag(4,2,this.ref_lb_array[6]);
		setGridbag(4,3,this.ref_lb_array[7]);
		
		/*
		 * 5��° �ٿ��� �ǳ� �ֱ�
		 * gridy : 4
		 * 
		 * GridBagConstraints Ŭ���� �ȿ��� gridwidth ������ �ִ�
		 * -> �� �ǳ��� 4���� ĭ�� ����ϵ��� �Ϸ��� gridwidth = 4; 
		 * 
		 */
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridy = 5;
		gbc_panel.gridx = 0;
		gbc_panel.gridwidth = 4;
		ref_gb_layout.setConstraints(this.ref_panel, gbc_panel);
		this.add(this.ref_panel);
	
		
		
		
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setResizable(false);
		// ������ ũ��� ����� ũ��� !!!! 
		//this.pack();
		this.setVisible(true);
	}
	
	// �ٸ� Ŭ�������� ���ڿ��� �޴� ������ �Լ�
	public GugudanFrameClass(String window_title) {
		super(window_title);
	}
	
	
	
	/*
	 * ���� �Լ� : ��� ��ư ��ü���� ����� �� �ִ� �̺�Ʈ ó�� �Լ�
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// ����ڰ� ��ư�� Ŭ���ϴ� ��쿡 �߻��ϴ� �̺�Ʈ �ۼ�
		
		// �̺�Ʈ�� �߻��� ���� �ּҸ� ��������
		Object ref_event = ae.getSource();
		
		// �̺�Ʈ�� �߻��� ���� ��ư���� �˻�
		if(ref_event instanceof Button) {
			
			// Button Ŭ���� �Լ� ����ϱ� ���� ����ȯ
			Button ref_clicked = (Button)ref_event;
			
			// Ŭ���� �߻��� ��ư�� �������� �˻�
			if(ref_clicked == ref_start_bt) {
				System.out.println("������ ��� ����");
				// 2�� ��� �����ϰ� ����ϴ� ���� �ϴ� ������ ��ü �����
				
				MyTwoDanThread ref_two_thread = new MyTwoDanThread();
				// ������ �̸��� �ַ��� setName() �Լ� ���
				// �̸��� ���� ���ָ� Thread-0 -> Thread-1 -> �̷������� ���������� ���
				ref_two_thread.setName("2�ܽ�����");
				// run() �Լ��� �����ϱ� ���� start() �Լ� ����
				// �׷� �ڹ� ����ӽ��� run() �Լ��� ������
				ref_two_thread.run();
				
				MyThreeDanThread ref_three_thread = new MyThreeDanThread();
				ref_three_thread.setName("3�ܽ�����");
				ref_three_thread.run();
				
				MyFourDanThread ref_four_thread = new MyFourDanThread();
				ref_four_thread.setName("4�ܽ�����");
				ref_four_thread.run();
				
				MyFiveDanThread ref_five = new MyFiveDanThread();
				ref_five.setName("5�ܽ�����");
				ref_five.run();
				
				MySixDanThread ref_six = new MySixDanThread();
				ref_six.setName("6�ܽ�����");
				ref_six.run();
				
				MySevenDanThread ref_seven = new MySevenDanThread();
				ref_seven.setName("7�ܽ�����");
				ref_seven.run();
				
				MyEightDanThread ref_eight = new MyEightDanThread();
				ref_eight.setName("8�ܽ�����");
				ref_eight.run();
				
				MyNineDanThread ref_nine = new MyNineDanThread();
				ref_nine.setName("9�ܽ�����");
				ref_nine.run();
				
				
				
			}
			else if(ref_clicked == ref_exit_bt) {
				System.out.println("���α׷� ���� ��ư Ŭ��");
				System.exit(0);
			}
			else {
				System.out.println("�߸��� ����");
			}
			
			
		}
		
		
	
	}
	

	
}

public class TestGugudanThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GugudanFrameClass test = new GugudanFrameClass();

	}

}
