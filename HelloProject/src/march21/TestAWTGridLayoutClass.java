package march21;

/*
 * 그리드레이아웃 배치 관리자를 사용하는 윈도우즈 프로그램
 */

import java.awt.*;
import java.awt.event.*;

/*
 * 상속 방법을 사용해서 Frame 클래스를 부모 클래스로 지정하기
 * 사용자가 버튼을 클릭한 경우에 반응하는 이벤트 처리를 위한 
 * ActionListener 인터페이스 구현하는 새로운 클래스 만들기
 * 
 *  class 새로운클래스이름 extends Frame implements ActionListener {
 *  
 *  	// 사용자가 버튼을 클릭한 경우에 동작하는 actionPerformed() 메소드를
 *  	// 재정의 하기
 *  	@Override
 *  	public void actionPerformed(ActionEvent 변수이름) {
 *  	
 *  	}
 * 
 */

class MyAWTGridLayoutFrame extends Frame implements ActionListener {
	
	/*
	 * 1. 버튼 준비하기
	 * 		1) 그리드 레이아웃 배치 관리자에 넣을 6개의 버튼 준비하기
	 * 		
	 * 		가. 변수 6개를 준비하기
	 * 
	 * 		나. 배열을 선언하고 사용하기
	 * 			a. 1차원 배열
	 * 			b. 2차원 배열
	 */
	// 1. 변수 6개 준비하기
	Button button1 = new Button("1");
	Button button2 = new Button("2");
	Button button3 = new Button("3");
	Button button4 = new Button("4");
	Button button5 = new Button("5");
	Button button6 = new Button("6");
	
	// a. 1차원 배열
	// 선언과 메모리 생성을 동시에 하기
	Button button_array1[] = new Button[6];
	
	{
		/*
		 * 초기화 블럭 -> 생성자 함수 보다 먼저 실행되는 블럭
		 * 중괄호가 꼭 있어야함
		 */
		for(int i = 0; i < button_array1.length; ++i) {
			button_array1[i] = new Button((i+1)+"");
		}
		
	}
	
	// b. 2차원 배열
	/*
	 * 1) Button 클래스 사용
	 * 2) 배열 이름 새로 만들기
	 * 3) 2차원 배열 : 대괄호 기호를 두번 작성
	 * 4) 초기값(배열의 라벨이름) : "1","2","3","4","5","6"
	 * 
	 */
	Button [][] button_array2 = new Button[3][2];
	{
		// 위에서 만들 2차원 배열을 사용해서 6개의 버튼을 메모리에 생성
		for(int i = 0; i < button_array2.length; ++i) {
			// 행의 갯수
			for( int j = 0; j < button_array2[i].length; ++j) {
				// 열의 갯수
				/*
				 * new Button ( 문자열 ) 명령어를 사용하는 명령문 작성
				 */
				button_array2[i][j] = new Button((i+1) + "");
			}
		}
	}
	// Frame 클래스가 갖고 있는 기본 배치 관리자는 BorderLayout
	// 사용하고자 하는 배치 관리자는 GridLayout 관리자
	// BorderLayout -> GridLayout로 변경 해야함 
	// : Frame 클래스가 갖고 있는 setLayout() 함수를 사용해서!
	
	// 1. GridLayout 배치 관리자 만들기
	GridLayout gridLayout = new GridLayout(3,2,5,5);
	/*
	 * 
	 * 3 : 행의 갯수
	 * 2 : 열의 갯수
	 * 5 : 배치 관리자 안에 들어간느 버튼들의 가로 여백(간격)
	 * 5 : 배치 관리자 안에 들어가는 버튼들의 세로 여백(간격)	
	 * 
	 */
	// 생성자를 새로 만들어서 초기화 관련 명령문들을 모아 놓기
	public MyAWTGridLayoutFrame() {
		// 프레임 윈도우 타이틀을 Frame 클래스에 있는 생성자를 실행해서 저장
		super("gridlayout test frame");
		
		// setLayout() 함수를 실행해서 Frame 클래스의 기본 배치 관리자인
		// BorderLayout -> GridLayout으로 변경
		this.setLayout(gridLayout);
		
		/*
		 * add() 함수를 사용해서 6개의 버튼들을 GridLayout 배치 관리자에
		 * 하나씩 넣기
		 */
		// 1. 6개의 변수를 넣기
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);

		// 2. 1차원 배열 넣기
		
		for ( int i = 0 ; i < button_array1.length; ++i ){
			this.add(button_array1[i]);
			
		}
		
		
		// 3. 2차원 배열 넣기
		for(int i = 0 ; i < button_array2.length; ++i) {
			for(int j = 0; j < button_array2[i].length; ++j) {
				
				this.add(button_array2[i][j]);
			}
		} // 이렇게 하면 안됨 1 1 2 2 3 3 이렇게 나옴 
		
		// 4. 윈도우 종료 이벤트 처리를 위한 addWindowListener 메소드 실행
		// + 이벤트 처리 객체 만들기(new WindowAdapter())
		// + 이벤트 처리 명령문 작성하기
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
