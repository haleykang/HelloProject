package march21;

/*
 * Panel �����̳ʸ� ����ؼ� 3�� 2�� ǥ�� ����� �� �ȿ� 6���� ��ư�� �ֱ� 
 * -> ���� Panel ��ü�� ���������� BorderLayout ��ġ �������� Ư�� ��ġ�� �ֱ�
 * 		-> this.add(BorderLayout.CENTER, ������ ���� �ǳ� ���� ���� �̸�);
 */
// 1. Panel �����̳ʿ��� ����� ��ġ �����ڸ� ���� �к��ϱ�
// -> GridLayout ���� ���� �̸� = new GridLayout(�� �� ��);

import java.awt.*;
import java.awt.event.*;

import javax.xml.soap.Text;

class MyPanelFrame extends Frame implements ActionListener {
	
	// 1. �ǳ� �����̳ʿ��� ����� �׸��� ���̾ƿ� ��ġ ������ �غ�
	private GridLayout gridLayout = new GridLayout(4,4,5,5) ;
	
	// 2. �ǳ� �����̳� �غ��ϱ�
	private Panel panel = new Panel(gridLayout);
	
	private TextField res_tf = new TextField("",20);
	
	// 3. 6���� ��ư �غ��ϱ� + �غ��� ��ư�� panel.add(��ư ���� ���� �̸� );
	// -> ���� �ǳ� �����̳ʴ� Frame ������(â)�� Ư�� ��ġ�� �־���� 
	// -> this.add(panel);
	// -> �Ǵ� this.add(BorderLayout.CENTER, panel);
	// -> ������ ��ư�� ����� Ŭ�� �̺�Ʈ ó���� ���� ��ɹ� ;
	// -> ��ư ���� �����̸�.addActionListener(this);
	// -> this : ActionListener �������̽��� ���
	// this : Frame Ŭ�����κ��� ��ӹ��� ���/ �޼ҵ�
	// this : ���� Ŭ�������� �߰��� ��� ���� / �޼ҵ�
	
	
/*	Button [] button = new Button [10];
	{
		
	for(int i = 0; i < this.button.length; ++i) {
	
		button[i] = new Button(i+"");
	}
	
	panel.add(button[9]);
	panel.add(button[8]);
	panel.add(button[7]);
	panel.add(button[6]);
	panel.add(button[5]);
	panel.add(button[4]);
	panel.add(button[3]);
	panel.add(button[2]);
	panel.add(button[1]);
	panel.add(button[0]);
	
	Button button2 = new Button("+");
	Button button3 = new Button("-");
	
	panel.add(button2);
	panel.add(button3);
	
	}*/
	
	// 2���� �迭�� �غ���
	
	/*Button [][] button_array = new Button [4] [4];
	String [][] str_array = new String [][] 
	{ {"7" , "8" , "9" , "/"},
		{"4" , "5" , "6" , "*"},
		{"1" , "2" , "3" , "-"},
		{"0" , "." , "+" , "="}
		};*/
	


/*	Button [][] button_array = new Button [4] [4];
	String [][] str_array = new String [][] 
	{ {"7" , "8" , "9" , "/"},
		{"4" , "5" , "6" , "*"},
		{"1" , "2" , "3" , "-"},
		{"0" , "." , "+" , "="}
		};

		{
			for(int i = 0; i < this.button_array.length; ++ i){
				for ( int j = 0 ; j < this.button_array.length; ++j) {
					
					button_array[i][j] = new Button(str_array[i][j]);
					panel.add(button_array[i][j]);
				}
				
			}
			
		//	button_array[0][0] = new Button(str_array[0][0]);
		//	button_array[0][1] = new Button(str_array[0][1]);
		}*/
		
		
/*		{	
		for(int i = 0; i < this.button_array.length; ++i){
			for(int j =0; j < this.button_array[i].length; ++j) {
				panel.add(button_array[i][j]);
				
			}
		}
		}*/
	
	// 4. ������ �Լ�
	public MyPanelFrame() {
		super("panel frame");
		
	//	Button buttonc_1 = new Button();
		
		
		Button [][] button_array = new Button [4] [4];
		String [][] str_array = new String [][] 
		{ {"7" , "8" , "9" , "/"},
			{"4" , "5" , "6" , "*"},
			{"1" , "2" , "3" , "-"},
			{"0" , "." , "+" , "="}
			};

			{
				for(int i = 0; i < button_array.length; ++ i){
					for ( int j = 0 ; j < button_array.length; ++j) {
						
						button_array[i][j] = new Button(str_array[i][j]);
						panel.add(button_array[i][j]);
					}
					
				}
				
			//	button_array[0][0] = new Button(str_array[0][0]);
			//	button_array[0][1] = new Button(str_array[0][1]);
			}
		
/*		Button [][] button_array = new Button [4] [4];
		String [][] str_array = new String [][] 
		{ {"7" , "8" , "9" , "/"},
			{"4" , "5" , "6" , "*"},
			{"1" , "2" , "3" , "-"},
			{"0" , "." , "+" , "="}
			};
			
			for(int i = 0; i < this.str_array.length; ++i){
				for(int j =0; j < this.button_array[i].length; ++j) {
					
				}
			}*/
		
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		
		
		this.setSize(500,500);
		
		this.add(BorderLayout.NORTH, res_tf);
		
		// this.add(BorderLayout.NORTH, buttonc_1);
		this.add(panel);
		// this.add(button2);
		// this.add(button3);
		
		this.pack();
		
		
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
		// ����� ��Ƴ�
		
		
		
	}
}

public class TestPanelClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyPanelFrame a = new MyPanelFrame();
	}

}
