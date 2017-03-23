package march21;

/*
 * Panel 컨테이너를 사용해서 3행 2열 표를 만들고 그 안에 6개의 버튼을 넣기 
 * -> 만든 Panel 객체를 마지막에는 BorderLayout 배치 관리자의 특정 위치에 넣기
 * 		-> this.add(BorderLayout.CENTER, 위에서 만든 판넬 참조 변수 이름);
 */
// 1. Panel 컨테이너에서 사용할 배치 관리자를 먼저 분비하기
// -> GridLayout 참조 변수 이름 = new GridLayout(행 과 열);

import java.awt.*;
import java.awt.event.*;

import javax.xml.soap.Text;

class MyPanelFrame extends Frame implements ActionListener {
	
	// 1. 판넬 컨테이너에서 사용할 그리드 레이아웃 배치 관리자 준비
	private GridLayout gridLayout = new GridLayout(4,4,5,5) ;
	
	// 2. 판넬 컨테이너 준비하기
	private Panel panel = new Panel(gridLayout);
	
	private TextField res_tf = new TextField("",20);
	
	// 3. 6개의 버튼 준비하기 + 준비한 버튼은 panel.add(버튼 참조 변수 이름 );
	// -> 최종 판넬 컨테이너는 Frame 윈도우(창)의 특정 위치에 넣어야함 
	// -> this.add(panel);
	// -> 또는 this.add(BorderLayout.CENTER, panel);
	// -> 각가의 버튼에 사용자 클릭 이벤트 처리를 위한 명령문 ;
	// -> 버튼 참조 변수이름.addActionListener(this);
	// -> this : ActionListener 인터페이스를 상속
	// this : Frame 클래스로부터 상속받은 상수/ 메소드
	// this : 현재 클래스에서 추가한 멤버 변수 / 메소드
	
	
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
	
	// 2차원 배열로 해보기
	
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
	
	// 4. 생성자 함수
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
		
		// 계산기는 어렵네
		
		
		
	}
}

public class TestPanelClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyPanelFrame a = new MyPanelFrame();
	}

}
