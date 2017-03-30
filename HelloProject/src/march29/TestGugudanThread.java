package march29;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * 화면에 창을 출력해주는 클래스 만들기
 */
class GugudanFrameClass extends Frame implements ActionListener {
	
	
	/*
	 * 8개의 TextArea를 배열로 준비
	 */
	private TextArea ref_ta_array [] = new TextArea [8];
	// 8개의 TextArea 참조형 변수를 만든 것
	
	{
		System.out.println("위에서 만든 TextArea 배열에 객체를 만든 다음에 저장");
		for(int i = 0; i < ref_ta_array.length; ++i) {
			ref_ta_array[i] =  new TextArea("",10,10);
			/*
			 * "" : 화면에 보여질 문자열
			 * 10 : 행(가로 줄수)의 갯수
			 * 10 : 컬(세로 칸수)럼 갯수
			 */
			
		} // end of for(int i = 0 ~)
	} // end of block
	
	// 8개의 라벨을 준비 : 구구단 계상하고 출력하는데 소요된 시간을 보여주는 컴포넌트
	private Label [] ref_lb_array = new Label[8];
	// 위에는 변수만 만든거 따로 내용 저장 안함
	// 실제 변수에 값을 저장후 메모리 생성하는는 것은 생성자 함수() , 함수(), 초기화 블럭에서 가능 
	{
		System.out.println("**위에서 생성된 라벨 배열 객체 생성**");
		for(int i = 0; i < ref_lb_array.length; ++i) {
			ref_lb_array[i] = new Label("소요 시간 : 0.0초");
		} // end of for
	} // end of block 2
	
	// 구구단 계산과 출력을 시작하는 버튼 객체 준비
	private Button ref_start_bt = new Button("계산 시작");
	
	// 프로그램 종료 버튼 객체 준비
	private Button ref_exit_bt = new Button("종료");
	
	/*
	 * 화면 구성
	 * 
	 * 첫째줄 : 2단/3단/4단/5단 텍스트 아레아
	 * 둘째줄 : 2단/3단/4단/5단 계산 시간 출력 라벨
	 * 셋째줄 : 6단/7단/8단/9단 텍스트 아레아 
	 * 넷째줄 : 6단/7단/8단/9단 계산 시간 출력 라벨 
	 * 다섯째 : 계산 시작 & 종료 버튼 // 위에 열의 수랑 다름 -> 판넬에 넣어서 조절..? 
	 */
	// 계산 시작 버튼과 종료 버튼이 들어갈 판넬 준비
	private Panel ref_panel = new Panel();
	
	// 그리드 백 레이아웃 준비
	private GridBagLayout ref_gb_layout = new GridBagLayout();
	
	// 그리드 백 컨스트레인츠
	private GridBagConstraints ref_gbc = new GridBagConstraints();
	
	// 표제 추가하기
	private Label title_lb = new Label("Haley's GUGUDAN");
	
	
	
	// 폰트 준비
	private Font f = new Font("굴림체",Font.BOLD, 15);
	
	
	// GridBag Label 출력 & Ta 출력 함수 만들어보자
	
	public void setGridbag(int y, int x, Component a) {
		
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.gridx = x;
	gbc.gridy = y;
	
	ref_gb_layout.setConstraints(a, gbc);
	this.add(a);
	}
	
	public String setgugu(int a) {
		
		// 구구단 출력도 함수로!
		
		String temp_res = "";
		// temp_res = 2 +"*" + 1 + "=" + (2+1) + "\r\n";
		temp_res = "<" + a + "단>\r\n";
		
		for(int i = 1; i <=9 ; ++i) {
			
			if(i == 1) {
				temp_res += "\r\n";
				// 위에서 먼저 temp_res를 "**2단**"으로 지정했으니까
				// temp_res += "\r\n"; -> temp_res = "**2단**" +"\r\n" 
				temp_res += a + "*" + i + "=" + (a*i) + "\r\n" ;
			}
			else {
				/*
				 * i가 2가 되는 시점에 실행되는 명령문 
				 * i가 3이 되는 시점
				 * ...
				 * i가 9가 되는 시점에~~
				 */
				temp_res += a + "*" + i + "=" + (a*i) + "\r\n";
			} // end of else
			
		} // end of for
		
		return temp_res;
		
	}
	
	
	
	
	
	
	
	// 2단 계산&출력에서 사용하는 스레드 클래스 만들기..............
	private class MyTwoDanThread extends Thread {
		
		/*
		 * 1. 처리 시간을 저장할 변수 선언 
		 * 		1) 시작 시간을 저장할 변수 : long start_t = 0L;
		 * 		2) 종료 시간을 저장할 변수 : long end_t = 0L;
		 */
		long start_t = 0L;
		long end_t = 0L;
		
		// 바깥 클래스에서 선언한 ta와 라벨 사용
		// -> ta 배열의 첫번쨰 요소 ref_ta_array[0] -> 2단 출력
		// -> 라벨 배열 첫번째 요소 : ref_lb_array[0] -> 시간 출력
		
		
		// main() 함수와 동등하게 실행되는 run() 함수 재정의
		@Override
		public void run() {
			
			
			// 함수 써보기
			start_t = System.nanoTime();
			
			String temp_res = setgugu(2);
			/*// ref_ta_array[0] 에 문자열로 2단 결과를 출력할 때 사용할 임시 변수 선언
			String temp_res = "";
			// temp_res = 2 +"*" + 1 + "=" + (2+1) + "\r\n";
			temp_res = "**2단**\r\n";
			
			start_t = System.nanoTime();
			for(int i = 1; i <=9 ; ++i) {
				
				if(i == 1) {
					temp_res += "\r\n";
					// 위에서 먼저 temp_res를 "**2단**"으로 지정했으니까
					// temp_res += "\r\n"; -> temp_res = "**2단**" +"\r\n" 
					temp_res += 2 + "*" + i + "=" + (2*i) + "\r\n" ;
				}
				else {
					
					 * i가 2가 되는 시점에 실행되는 명령문 
					 * i가 3이 되는 시점
					 * ...
					 * i가 9가 되는 시점에~~
					 
					temp_res += 2 + "*" + i + "=" + (2*i) + "\r\n";
				} // end of else
				
			} // end of for
*/			
			// 2단을 모두 계산한 후에는 2단을 계산하는데 소요된 시간을 구해서 end_t 에 저장
			end_t = System.nanoTime();
			// 소요 시간 계산 : 실수 값으로
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			
			
			String temptime = String.format("%.11f초", elapsed_t);
			
			// 텍스트 아레아 & 라벨 컴포넌트에 2단과 소요 시간 출력
			ref_ta_array[0].setText(temp_res);
			ref_lb_array[0].setText(temptime);
		
		} // end of run()
	} // end of class MyTwoDanThread
	
	
	// 3단 계산 출력 스레드 클래스
	private class MyThreeDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
		
			start_t = System.nanoTime();
			String temp_res = setgugu(3);
			
			end_t = System.nanoTime();
			// 소요 시간 계산 : 실수 값으로
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f초", elapsed_t);
			
			// 텍스트 아레아 & 라벨 컴포넌트에 3단과 소요 시간 출력
			ref_ta_array[1].setText(temp_res);
			ref_lb_array[1].setText(temptime);
		}
	}
	
	// 4단 클래스
	
	private class MyFourDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(4);
			
			end_t = System.nanoTime();
			// 소요 시간 계산 : 실수 값으로
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f초", elapsed_t);
			
			// 텍스트 아레아 & 라벨 컴포넌트에 4단과 소요 시간 출력
			ref_ta_array[2].setText(temp_res);
			ref_lb_array[2].setText(temptime);
			
		}
	}
	
	// 5단 클래스
	private class MyFiveDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(5);
			
			end_t = System.nanoTime();
			// 소요 시간 계산 : 실수 값으로
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f초", elapsed_t);
			
			
			// 텍스트 아레아 & 라벨 컴포넌트에 5단과 소요 시간 출력
			ref_ta_array[3].setText(temp_res);
			ref_lb_array[3].setText(temptime);
			
		}
	}
	
	// 6단 클래스
	private class MySixDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(6);
			
			end_t = System.nanoTime();
			// 소요 시간 계산 : 실수 값으로
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f초", elapsed_t);
			
			// 텍스트 아레아 & 라벨 컴포넌트에 6단과 소요 시간 출력
			ref_ta_array[4].setText(temp_res);
			ref_lb_array[4].setText(temptime);
			
			
		}
	}
	// 7단 클래스
	
	private class MySevenDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(7);
			
			end_t = System.nanoTime();
			// 소요 시간 계산 : 실수 값으로
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f초", elapsed_t);
			
			// 텍스트 아레아 & 라벨 컴포넌트에 7단과 소요 시간 출력
			ref_ta_array[5].setText(temp_res);
			ref_lb_array[5].setText(temptime);
			
		}
	}
	
	// 8단 클래스
	private class MyEightDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(8);
			end_t = System.nanoTime();
			
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f초", elapsed_t);
			
			ref_ta_array[6].setText(temp_res);
			ref_lb_array[6].setText(temptime);
			
		}
	}
	// 9단 클래스
	private class MyNineDanThread extends Thread {
		
		long start_t = 0L;
		long end_t = 0L;
		
		@Override
		public void run() {
			
			start_t = System.nanoTime();
			String temp_res = setgugu(9);
			end_t = System.nanoTime();
			
			double elapsed_t = (end_t - start_t) / 1000000000.0f;
			String temptime = String.format("%.11f초", elapsed_t);
			// 소숫점 5자리까지만 출력하고 싶음
			
			//String t_t = String.format("%.5", elapsed_t);
		
			
			ref_ta_array[7].setText(temp_res);
			ref_lb_array[7].setText(temptime);
			
		}
	}
	
	
	
	
	// 현재 창을 닫아주는 windowClosing() 함수를 갖는 내부 클래스 만들기
	private class MyInnerWindowHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
	
	
	
	// 생성자 함수 준비
	// 기본 생성자 함수
	public GugudanFrameClass() {
		
		super("MyGugudan Window");
		
		/*
		 * SetLayout() 함수 사용해 기본 배치 관리자 바꾸기
		 */
		this.setLayout(ref_gb_layout);
		/*
		 * 윈도우 종료 이벤트 처리
		 */
		this.addWindowListener(new MyInnerWindowHandler());
		
		/*
		 * 구구단 계산을 시작시켜주는 start 버튼에서 발생되는 클릭 이벤트 처리 명령문 작성
		 */
		this.ref_start_bt.addActionListener(this);
		/*
		 * 종료 버튼 클릭 이벤트
		 */
		this.ref_exit_bt.addActionListener(this);
		
		/*
		 * 위에서 만든 폰트각각 컴포넌트에 적용
		 */
		this.ref_start_bt.setFont(f);
		this.ref_exit_bt.setFont(f);
		this.title_lb.setFont(new Font("궁서체",Font.BOLD, 58));
		
		
		
		/*
		 * 8개의 ta 컴포넌트 폰트 처리
		 */
		for(int i =0; i < ref_ta_array.length; ++i) {
			ref_ta_array[i].setFont(f);
		}
		/*
		 * 8개의 라벨도 폰트 조정
		 */
		for(int i = 0; i < ref_lb_array.length; ++i) {
			ref_lb_array[i].setFont(f);
		}
		// 2개의 버튼이 들어갈 판넬 객체도 폰드 적용
		this.ref_panel.setFont(f);
		
		// 판넬에 시작 버튼 & 종료 버튼 넣기
		this.ref_panel.add(ref_start_bt);
		this.ref_panel.add(ref_exit_bt);
		
		/*
		 * 첫번째 줄 -> gridx = 0 ;
		 * 첫번째 칸 -> gridy = 0;
		 * 2단 결과 출력 ref_ta_array[0]
		 */
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridx = 0;
		gbc_title.gridy = 0;
		gbc_title.gridwidth = 4;
		ref_gb_layout.setConstraints(title_lb, gbc_title);
		this.add(title_lb);
		
		
		// 내가 만든 함수 써보기
		setGridbag(1,0,this.ref_ta_array[0]);
		
	/*	GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		
		ref_gb_layout.setConstraints(this.ref_ta_array[0], gbc1);
		this.add(this.ref_ta_array[0]);*/
		
		/*
		 * 두번째 칸 x = 1 ;
		 * 첫번째 줄 y = 0 ;
		 * 3단
		 */
		
		// 함수로 바꾸기
		setGridbag(1,1,this.ref_ta_array[1]);
		
		/*GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 1;
		gbc2.gridy = 0;
		
		ref_gb_layout.setConstraints(this.ref_ta_array[1], gbc2);
		this.add(this.ref_ta_array[1]);*/
		
		/*
		 * 4단
		 *  x= 2; y = 0 (첫번째 줄 세번째 칸)
		 */
		
		setGridbag(1,2,this.ref_ta_array[2]);
		/*
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.gridx = 2;
		gbc3.gridy = 0;
		
		ref_gb_layout.setConstraints(this.ref_ta_array[2], gbc3);
		this.add(this.ref_ta_array[2]);*/
		
		/*
		 * 5단
		 * x = 3, y=0 (4번째 칸, 첫번째 중)
		 */
		
		setGridbag(1,3,this.ref_ta_array[3]);
	/*	GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.gridx = 3;
		gbc4.gridy = 0;
		
		ref_gb_layout.setConstraints(this.ref_ta_array[3], gbc4);
		this.add(this.ref_ta_array[3]);
		*/
		/*
		 * 2단 라벨
		 * x = 0
		 * y = 1 ( 두번째 줄, 첫번째 칸)
		 */
		
		/*
		 * 2번째 줄 함수로 다 출력 
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
		
		
		 * 3단 소요시간 라벨
		 * x=1
		 * y=1
		 
		
		GridBagConstraints gbc6 = new GridBagConstraints();
		gbc6.gridx = 1;
		gbc6.gridy = 1;
		
		ref_gb_layout.setConstraints(this.ref_lb_array[1], gbc6);
		this.add(this.ref_lb_array[1]);
		
		
		 * 4단 소요시간 라벨
		 * x=2
		 * y=1 
		 
		GridBagConstraints gbc7 = new GridBagConstraints();
		gbc7.gridx = 2;
		gbc7.gridy = 1;
		
		ref_gb_layout.setConstraints(this.ref_lb_array[2], gbc7);
		this.add(this.ref_lb_array[2]);
		
		
		 * 5단 라벨
		 
		GridBagConstraints gbc8 = new GridBagConstraints();
		gbc8.gridx = 3;
		gbc8.gridy = 1;
		
		ref_gb_layout.setConstraints(this.ref_lb_array[3], gbc8);
		this.add(this.ref_lb_array[3]);
		*/
		
		/*
		 * 구구단을 시작시켜주는 시작 버튼과 프로그램 종료 버튼은 판넬에 있는 상태
		 * 판넬을 그리드 백 레이아웃에 넣기
		 */
		
		/*
		 * 3번째 줄 : 6~9단 출력 Ta 컴포넌트
		 * y = 2
		 * x = 0 ~
		 * 배열 위치 4~7
		 * 
		 */
		setGridbag(3,0,this.ref_ta_array[4]);
		setGridbag(3,1,this.ref_ta_array[5]);
		setGridbag(3,2,this.ref_ta_array[6]);
		setGridbag(3,3,this.ref_ta_array[7]);
		
		
		/*
		 * 4번째 줄 : 6~9단 소요시간 라벨
		 * y = 3
		 * x = 0 ~
		 * 라벨 배열 4 ~7
		 */
		setGridbag(4,0,this.ref_lb_array[4]);
		setGridbag(4,1,this.ref_lb_array[5]);
		setGridbag(4,2,this.ref_lb_array[6]);
		setGridbag(4,3,this.ref_lb_array[7]);
		
		/*
		 * 5번째 줄에는 판넬 넣기
		 * gridy : 4
		 * 
		 * GridBagConstraints 클래스 안에는 gridwidth 변수가 있당
		 * -> 이 판넬이 4개의 칸을 사용하도록 하려면 gridwidth = 4; 
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
		// 윈도우 크기는 모니터 크기로 !!!! 
		//this.pack();
		this.setVisible(true);
	}
	
	// 다른 클래스에서 문자열을 받는 생성자 함수
	public GugudanFrameClass(String window_title) {
		super(window_title);
	}
	
	
	
	/*
	 * 전역 함수 : 모든 버튼 객체에서 사용할 수 있는 이벤트 처리 함수
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// 사용자가 버튼을 클릭하는 경우에 발생하는 이벤트 작성
		
		// 이벤트가 발생한 곳의 주소를 가져오기
		Object ref_event = ae.getSource();
		
		// 이벤트가 발생한 곳이 버튼인지 검사
		if(ref_event instanceof Button) {
			
			// Button 클래스 함수 사용하기 위해 형변환
			Button ref_clicked = (Button)ref_event;
			
			// 클릭이 발생한 버튼이 시작인지 검사
			if(ref_clicked == ref_start_bt) {
				System.out.println("구구단 계산 시작");
				// 2단 계산 시작하고 출력하는 일을 하는 스레드 객체 만들기
				
				MyTwoDanThread ref_two_thread = new MyTwoDanThread();
				// 스레드 이름을 주려면 setName() 함수 사용
				// 이름을 따로 안주면 Thread-0 -> Thread-1 -> 이런식으로 순차적으로 배부
				ref_two_thread.setName("2단스레드");
				// run() 함수를 실행하기 위해 start() 함수 실행
				// 그럼 자바 가상머신이 run() 함수를 실행함
				ref_two_thread.run();
				
				MyThreeDanThread ref_three_thread = new MyThreeDanThread();
				ref_three_thread.setName("3단스레드");
				ref_three_thread.run();
				
				MyFourDanThread ref_four_thread = new MyFourDanThread();
				ref_four_thread.setName("4단스레드");
				ref_four_thread.run();
				
				MyFiveDanThread ref_five = new MyFiveDanThread();
				ref_five.setName("5단스레드");
				ref_five.run();
				
				MySixDanThread ref_six = new MySixDanThread();
				ref_six.setName("6단스레드");
				ref_six.run();
				
				MySevenDanThread ref_seven = new MySevenDanThread();
				ref_seven.setName("7단스레드");
				ref_seven.run();
				
				MyEightDanThread ref_eight = new MyEightDanThread();
				ref_eight.setName("8단스레드");
				ref_eight.run();
				
				MyNineDanThread ref_nine = new MyNineDanThread();
				ref_nine.setName("9단스레드");
				ref_nine.run();
				
				
				
			}
			else if(ref_clicked == ref_exit_bt) {
				System.out.println("프로그램 종료 버튼 클릭");
				System.exit(0);
			}
			else {
				System.out.println("잘못된 접근");
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
