package march23;


/*
 * 간단한 채팅 프로그램 만들기
 * 
 * 1. 시나리오(프로세스) 설계
 * 
 * 1) 화면에 부모 창을 만들기
 * 부모 창에서 보여줄 내용 정하기 : 컴퓨터 주소 + 포트 번호 + 접속 버튼 + 취소 버튼
 * 
 * 컴퓨터 주소를 표현할 컴포넌트 결정하기 : 라벨(출력) + 사용자 입력 창(텍스트 필드)
 * -> 라벨의 역할은 사용자에게 입력할 내용을 알려줌 
 * 
 * 포트 번호를 표현할 컴포넌트 결정 : 라벨 + 사용자 입력 창
 * 
 * 접속 버튼을 표현할 컴포넌트 결정 : 버튼(라벨포함)
 * 
 * 취소 버튼을 표형할 컴포넌트 결정 : 버튼(라벨포함)
 * 
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/*
 * Frame 클래스를 상속하고 사용자가 클릭 이벤트를 발생하면 실행할 명령문을 갖는
 * ActionListener 인터페이스를 구현하는 자식 클래스 만들기
 * 
 * class 자식클래스이름 extends Frame implements ActionListener {
 * 
 * }
 * class 자식클래스이름 extends Frame implements ActionListener, TextListener, WindowListener, KeyListener, MouseListener {
 * 
 * }
 * 
 * 윈도우 종료 이벤트 처리에 사용할 수 있는 클래스 또는 인터페이스 이름
 * 클래스 이름은 WindowAdapter
 * 인터페이스이름은 WindowListener
 */

/*
 * 사용자가 종료 버튼을 클릭한 경우에 실행되는 System.exit(0) 명령문을 갖는 
 * windowClosing() 함수를 만들기
 * 
 * -> 먼저 클래스를 만든 후에 windowClosing() 함수를 만들고 System.exit(0) 명령문 넣기
 * -> 이름 : 알아보기 쉽게 -> 종료 의미를 포함한 이름 만들기
 * -> MyWindowClosingEventHandler
 */

class MyWindowClosingEventHandler extends WindowAdapter {
	
	// 사용자가 종료 버튼(x) 클릭한 경우 실행되는 명령문 만들기
	// windowClosing() 함수 안에 넣기
	@Override
	public void windowClosing(WindowEvent we) {
		System.exit(0);
		
	}
	
}

/*
 * 위에서 만든 MyWindowClosingEventHandler 클래스 사용하려면
 * new MyWindowClosingEventHandler() 객체를 메모리에 만들어야 함
 * 
 * -> addWindowListener() 메소드 안에 위에서 만든 객체를 넣어주어야 함
 * 		-> addWindowListener( new MyWindowClosingEventHandler());
 * 
 * 또는 
 * MyWindowClosingEventHandler 참조형변수이름 = new MyWindowClosingEventHandler();
 * addWindowListener (참조형변수이름) ;
 */
// 메인(부모 윈도우)을 화면에 만들어주는 클래스 만들기

class MyParentFrame extends Frame implements ActionListener {
	
	/*
	 * 
	 * 메인창에 보여줄 컴포넌트들을 준비
	 */
	
	// 컴퓨터 주소 출력 라벨 준비
	private Label comp_ip_addr_lb = new Label("컴퓨터 주소 : ");
	
	//  실제 컴퓨터 주소를 입력 할 입력 창
	private TextField comp_ip_addr_tf = new TextField("",30);
	
	// 포트 번호 출력 라벨
	// 포트 번호 : 프로그램 아이디
	private Label comp_port_no_lb = new Label("포트 번호 : ");
	
	// 사용자가 포트 번호를 입력 할 수 있는 입력 창 만들기
	private TextField comp_port_no_tf = new TextField("", 10);
	// 아이피 번호와 포트 번호는 나중에 서버 프로그램과 동기화 되어야 함
	// 서버 프로그램에서 정하고 그 값을 읽어와서 사용
	// 프로그램에서 사용자가 접속 버튼을 클릭하는 경우에 비교 
	
	// 지금은 내 컴퓨터가 클라이언트 + 서버 
	// 아이피 주소 : localhost -> 127.0.0.1 -> 내 자신 컴퓨터를 구별해주는 아이피 번호
	// -> 외부에 있는 컴퓨터에 접속하는 경우에는 사용할 수 없는 아이피 번호 
	
	// 접속하기 버튼 만들기
	private Button connect_bt = new Button("서버 접속");
	
	// 접속취소 버튼 만들기
	private Button connect_cancel_bt = new Button("접속 취소");
	
	// 컴포넌트들의 글자 크기를 변경하기 위한 폰트 준비
	private Font font = new Font("궁서체",Font.BOLD, 20);
	{
		this.comp_ip_addr_lb.setFont(font);
		this.comp_port_no_lb.setFont(font);
		this.connect_bt.setFont(font);
		this.connect_cancel_bt.setFont(font);
		this.comp_ip_addr_tf.setFont(font);
		this.comp_port_no_tf.setFont(font);
	}
	
	//그리드 레이아웃 배치 관리자 사용
	private GridLayout grid_layout = new GridLayout(3,2,3,3);
	
	// 그리드 백 레이아웃 배치 관리자 : 컬럼(칸) 단위로 크기를 제어 가능
	
	/*
	 * 그리드 레이아웃 단독 사용
	 * 
	 * 그리드 레이아웃 + 판넬 혼합 사용
	 * 
	 * 그리드 백 레이아웃 = 그리드 레이아웃 + 판넬 혼합
	 */
	
	// 기본 생성자 만들기
	public MyParentFrame() {
		// 부모의 타이틀 정하기
		super("Haley's Chatting Window");
		
		this.setLayout(grid_layout);
		
		
		// 버튼 이름을 쉽게 재지정해서 사용하자
		// 접속 버튼은 "1"
		this.connect_bt.setActionCommand("1");
		// 접속 취소 버튼은 "0"
		this.connect_cancel_bt.setActionCommand("0");
	
		/*
		 * add 함수 이용해서 위에서 만든 컴포넌트들을 
		 * 그리드 레이아웃 에 넣기
		 */
		this.add(comp_ip_addr_lb);
		this.add(comp_ip_addr_tf);
	
		this.add(comp_port_no_lb);
		this.add(comp_port_no_tf);
		
		this.add(connect_bt);
		this.add(connect_cancel_bt);
		
		
		// 윈도우 창 종료 할 수 있게 변수 만들기
		
		// MyWindowClosingEventHandler window_closing = new MyWindowClosingEventHandler();
		// this.addWindowListener(window_closing);
		// 또는 이렇게도 가능 
		this.addWindowListener(new MyWindowClosingEventHandler());
	
		// 각각의 텍스트 필드 & 버튼을 addActionListener와 연결
		
		this.comp_ip_addr_tf.addActionListener(this);
		this.comp_port_no_tf.addActionListener(this);
		this.connect_bt.addActionListener(this);
		this.connect_cancel_bt.addActionListener(this);
		
		// 연결 제대로 됐는지 확인 하기 위해 ActionEvent로 이동 
		
		
		this.setSize(300,130);
		this.setVisible(true);
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 사용자가 접속하기 버튼을 누른 경우에는 화면에 메시지를 친구에게
		 * 입력하고 전송할 수 있는 다이얼로그 창을 출력해야함
		 * 
		 */

		// 일단 이벤트 발생한 위치의 주소를 저장하는 변수 선언
		Object event_source = e.getSource();
		
		// instanceof를 이용해서 이벤트가 버튼에서 발생했는지
		// 텍스트 필드에서 발생했는지 if문과 함께 확인
		
		if(event_source instanceof Button) {
			// 사용자가 버튼을 클릭 했을 때
	
		
			// 일단 시험 문장 출력
			System.out.println("버튼 클릭");
			
			// Button 클래스가 갖고 있는 함수들을 재 사용 하기 위해서 
			// Button 변수 선언 후, event_source를 Button 변수로 형변환 하기
			
			Button clicked_bt = (Button)event_source;
			
			// 버튼 별로 간단한 별명 부여하기
			// 접속 -> 1, 취소 -> 0으로 이름 부여!!
			// 각각의 버튼별로 새로 부여한 이름을 알아오는 함수
			String action_command = clicked_bt.getActionCommand();
			// 다른 방법! 
			/*
			 * if(clicked_bt == connect_bt) { } 
			 *	// 위에서 선언한 변수를 직접 써도 됨 
			 *
			 *또 다른 방법 : Button 클래스가 갖고 있는 getLabel() 함수 사용해서 라벨 텍스트 값을 가져 올 수 있음
			 * new Button("라벨 텍스트")
			 * 		-> setLabel() 함수를 사용해서 라벨 텍스트를 다른 텍스트로 변경 가능
			 * 			-> 버튼변수이름 .setLabel("새로운 라벨 텍스트");
			 *
			 */
			
			
			// if문을 사용해서 사용자가 클릭한 버튼이 1(접속)인지 0(취소)인지 확인
			if(action_command.equals("1") == true) {
				// 사용자가 서버 접속 버튼을 클릭했을 때 실행하는 명령문 작성
				System.out.println("사용자가 접속 버튼을 입력");
				
				/*
				 * Dialog 클래스를 사용해서 화면에 출력할 자식 창을 만들기
				 * 
				 * 1. 현재 부모 창의 주소는 this로 참조 가능
				 * 2. 다이얼로그 타이틀 문자열 지정 : 친구에게 메시지 전송 창
				 * 3. 모달 지정 여부 결정 : 모달은 true, 아니면 false
				 * 
				 * Dialog 새로운자식창주소보과변수 = new Dialog(this, "타이틀", true);
				 * 		-> 새로운 자식 창을 모달 창으로 설정
				 * 
				 * Dialog 새로운자식창주소보과변수 = new Dialog(this, "타이틀", false);
				 * 		-> 새로운 자식 창을 모달리스 창으로 설정
				 * 
				 */

				
				Dialog child_dialog_ob = new Dialog(this,"Send Message Window", true);
				
				/*
				 * Dialog가 갖고 있는 기본 배치 관리자는 BorderLayout
				 */
				// 가운데 위치에 새로운 버튼을 넣기
				Button ref_new_bt = new Button("Send Message");
				child_dialog_ob.add(BorderLayout.SOUTH, ref_new_bt);
				
				// 위에 텍스트 필드 만들기
				TextField input_ms = new TextField("", 50);
				child_dialog_ob.add(BorderLayout.CENTER,input_ms);
	
		
				// 다이얼로그 종료 이벤트 처리
				child_dialog_ob.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent we) {
					// 현재 자식창으 주소를 알아와서 변수에 저장
						Window ref_window = we.getWindow();
						
						// 현재 자식창을 화면에 사라지게 하기
						// dispose() 함수를 실행
						ref_window.dispose();
					}
				});
				
				// 사용자가 ref_new_bt를 클릭한 경우에는 화면네 메시지 출력 창을 띄우기
				// javax.swing 패키지에 있는 JOptionPane 클래스가 갖고 있는 showMessageDialog() 사용
				ref_new_bt.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent ae) {
						JOptionPane.showMessageDialog(null,"사용자가 버튼을 입력");
					}
				});
				
				// 다이얼로그의 크기 지정
				
				child_dialog_ob.setSize(300,300);
				child_dialog_ob.setVisible(true);
				
			}
			else if(action_command.equals("0") == true) {
				// 사용자가 접속 취소 버튼을 클릭했을 때 실행하는 명령문 작성 
				// 프로그램을 종료하겠습니다. 라는 팝업창 뜨고 종료
				System.out.println("사용자가 취소 버튼을 입력");
				JOptionPane.showMessageDialog(this,"프로그램을 종료하겠습니다.");
				System.exit(0);
				
			}
			
		}
		else if ( event_source instanceof TextField){
			// 이벤트가 텍스트 필드에서 발생 했을 때 
			
			// 일단 시험문장 출력
			System.out.println("텍스트 필드에 입력");
		}
		else {
			System.out.println("잘못된 접근 입니다.");
		}
		
	}
}

public class TestChattingProgramClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyParentFrame a = new MyParentFrame();

	}

}
