package march22;


/*
 * 그리드레이아웃 이용해 - 배열 5행 2열(그리드 레이아웃 + 판넬) 같이 쓰기
성적 입력 + 총점 구하는
화면 구성 
1번째 줄 : 국어점수 출력 라벨 + 국어점수 입력 텍스트 필드
2번째 줄 : 영어점수 출력 라벨 + 영어점수 입력 텍스트 필드
3번째 줄 : 수학점수 출력 라벨 + 수학점수 입력 텍필
4번째 줄 : 총점 구하기 버튼 
 * 5번째 줄 : 총점 결과 출력 되면 가능
 * 
 */

// 일단 필요한 클래스 import

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class MyScoreFrame extends Frame implements ActionListener {
	
	/* 
	 * 2.필요한 변수 : 입력된 국어 점수, 입력된 영어 점수, 입력된 수학 점수, 총점 저장 변수
	 * 1.필요한 라벨 & 텍스트 필드 선언
	 */
	
	// 국어 점수 입력 창
	private Label kor_label = new Label("국어 점수");
	private TextField kor_tf = new TextField("",20);
	
	// 영어 점수 입력 창
	private Label eng_label = new Label("영어 점수");
	private TextField eng_tf = new TextField("", 20);
	
	// 수학 점수 입력 창
	private Label math_label = new Label("수학 점수");
	private TextField math_tf = new TextField("",20);
	
	// 총점 구하기 버튼 선언
	
	Button total_bt = new Button("총점 구하기");
	
	// 총점이 계산되어서 나오는 창 만들기 
	// -> 어떻게???????
	// 일단 총점 라벨 & 텍스트필드
	
	private Label total_label = new Label("총점");
	private TextField total_tf = new TextField("",20);
	
	
	// 그리드 레이아웃 배치 관리자 준비(5행 2열 표를 만들고
	// 안에 들어가는 컴포넌트들 간의 간격은 2씩
	private GridLayout gridLayout = new GridLayout(5,2,2,2);
	
	// 그리드 레이아웃을 사용하는 판넬 선언
	//private Panel panel = new Panel();
	
	// 사용자가 입력한 국어 영어 수학 점수 보관 변수
	
	int kor_score = 0;	
	int eng_score = 0;
	int math_score = 0;
	
	// 총점을 구할 변수 선언
	int total_score = 0;
	
	// 폰트 바꿀수도 있으니까 폰트 일단 선언
	private Font font = new Font("굴림체", Font.BOLD,20);
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
	
	
	
	// 함수 만들기
	
public void my_score_event() {
	

	// System.out.println("버튼 클릭 이벤트 테스트");
	
	/*
	 * 구상 
	 * 1) 세 개 중 하나라도 입력 안하고 엔터  -> 다시 입력하라고 창 띄우고 입력 안된 곳으로 커서 이동
	 * 2) 세 개 다 입력 하고 엔터  -> 총점 구하기 
	 */
	
	// (1) 사용자가 입력한 국어 점수를 읽어와 임시 변수에 저장
	String temp_kor = kor_tf.getText().trim();
	
	// (2) 사용자가 입력한 영어 점수 저장
	String temp_eng = eng_tf.getText().trim();
	
	// (3) 사용자가 입력한 수학 점수 임시 저장
	String temp_math = math_tf.getText().trim();
	
			
	// 세가지 정보를 다 입력하고 버튼 클릭한 경우
	if(temp_kor.equals("") == false && temp_eng.equals("") == false &&
			temp_math.equals("") == false){
		// System.out.println("사용자가 3개의 점수를 다 입력 했습니다.");
		
		// 다 정수 입력 했을 때!
		
		// 올바르게 입력 됐으니까 
		// 국어 변수에 사용자가 입력된 문자열을 정수형으로 바꿔서 저장
		
		// try~catch 블럭을 통해 숫자 이외에 다른 문자를 입력 할 경우 오류 발생 내용 안내!
		
	try{
		kor_score = Integer.parseInt(temp_kor);

		// 영어 점수
		eng_score = Integer.parseInt(temp_eng);
		
		// 수학 점수
		math_score = Integer.parseInt(temp_math);
		} catch(Exception e) {
			
		System.out.println("오류 발생");
		System.out.println("내용은 " + e.getMessage());
			
	}
		
		
		
		// 0~100 사이의 정수를 입력해야함! 아니면 다시 입력해달라는 창을 켜기
		
		if(kor_score > 0 && kor_score <= 100 && eng_score > 0 && eng_score <= 100 &&
				math_score > 0 && math_score <= 100) {
			
			// 총점 저장
			total_score = kor_score + eng_score + math_score;
			
			// System.out.println(total_score);
			// 이 결과를 총 결과 창에 띄워야함!!! -> 어떻게...?
			// setText() 함수를 통해!!! 단, 이 함수는 문자열만 받으니까 
			// total_score + "" 이렇게 문자열로 만들어주기!!!!
			
			total_tf.setText(total_score + "");
		} else {
			// 0~100 사이의 정수를 입력 안했을 때,
			
			JOptionPane.showMessageDialog(this,"0~100점 범위의 정수를 입력하세요.");
			kor_tf.setFocusable(true);


			
			//requestFocus() 함수를 사용해서 강제로 커서의 위치를
			// TextField 컴포넌트로 이동
			kor_tf.requestFocus();
			
			return;
		}
			
		
		

	} else if (temp_kor.equals("") == true ) {
		
		
		JOptionPane.showMessageDialog(this,"국어 점수를 입력하세요.");
		kor_tf.setFocusable(true);


		
		//requestFocus() 함수를 사용해서 강제로 커서의 위치를
		// TextField 컴포넌트로 이동
		kor_tf.requestFocus();
		
		return;
		
	} 
	else if (temp_eng.equals("") == true) {
		
		JOptionPane.showMessageDialog(this,"영어 점수를 입력하세요.");
		// 커서는 영어 입력 창으로
		eng_tf.setFocusable(true);
		eng_tf.requestFocus();
	
		
		
	} 
	else if (temp_math.equals("") == true ) {
		
		JOptionPane.showMessageDialog(this,"수학 점수를 입력하세요.");
		// 커서는 수학 입력 창으로
		math_tf.setFocusable(true);
		math_tf.requestFocus();
	}
	
	else {
		// 사용자가 세 데이터 중 한가지라도 입력하지 않은 경우
		// 잘못된 입력입니다. 다시 입력해주세요. 창 오픈
		// 이것도 바꿔 볼까..?

		JOptionPane.showMessageDialog(this,"총점을 제외한 모든 점수를 입력하세요.");
		
		
		// setFocusable () 함수를 사용해서 TextField 컴포넌트에 
		// 커서가 올 수 있도록 준비
		kor_tf.setFocusable(true);
		
		//requestFocus() 함수를 사용해서 강제로 커서의 위치를
		// TextField 컴포넌트로 이동
		kor_tf.requestFocus();
		
		return;
		
	}

	
}


	
	public MyScoreFrame() {
		// 기본 생성자
		// super() 이용해서 상단바 작성
		super("Haley's Score Program");
		
		// setLayout 함수를 사용해서 Frame 클래스에서 갖고 있는 
		// 기본 배치 관리자인 BorderLayout을 GridLayout으로 바꾸기
		this.setLayout(gridLayout);
		
		
		// 첫번째 줄 국어 점수 라벨 & 텍스트 필드
		this.add(this.kor_label);
		this.add(this.kor_tf);
		
		// 두번째 줄 영어 점수 라벨 & 텍스트 필드
		this.add(this.eng_label);
		this.add(this.eng_tf);
		
		// 세번째 줄 수학 점수 라벨 & 텍스트 필드
		this.add(this.math_label);
		this.add(this.math_tf);
		
		// 네번째 줄 총점 라벨
		this.add(this.total_label);
		this.add(this.total_tf);
		
		
		// 다섯번째 총점 구하기 버튼 
		this.add(this.total_bt); 
	//	this.add(panel);
		// 이걸 길게 늘릴 순 없는지 !!!!!!!!!!!!!! -> 판넬 사용
		
		// 총점 결과 나오는 창은 어떻게??????????????????????????????????
		
		
		// 사용자가 윈도우 종료 버튼을 누르는 경우에 창이 꺼지도록
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		// 사용자가 각각의 점수를 입력하고 엔터키를 누르는 경우에 발생하는
		// ActionEvent 이벤트를 처리하기 위한 명령문 작성
		
		this.kor_tf.addActionListener(this);
		this.eng_tf.addActionListener(this);
		this.math_tf.addActionListener(this);
		
		// 사용자가 총점 구하기 버튼을 클릭 했을 경우에 발생하는 이벤트를
		// 처리하기 위한 명령문 작성
		
		this.total_bt.addActionListener(this);
	

		// 일단 창을 보이게 하는 setSize함수랑 setVisible 함수 사용
		this.setSize(300, 200);
		this.setVisible(true);
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		// 1. 먼저 getSource() 함수를 이용하여 이벤트가 발생한 객체의 주소를 가져와서
		// 변수에 저장 하기
		Object ref_event = e.getSource();
		
		// 2. instanceof 연산자로 이벤트가 버튼에서 발생했을 경우, 텍스트 필드에서 발생했을
		// 경우를 가정해 if문 만들기
		
		// 2-1.이벤트가 버튼에서 발생하는 경우
		if(ref_event instanceof Button) {
			
			my_score_event(); // 함수 처리
		/*	System.out.println("버튼 클릭 이벤트 테스트");
			
			
			 * 구상 
			 * 1) 세 개 중 하나라도 입력 안하고 엔터  -> 다시 입력하라고 창 띄우고 입력 안된 곳으로 커서 이동
			 * 2) 세 개 다 입력 하고 엔터  -> 총점 구하기 
			 
			
			// (1) 사용자가 입력한 국어 점수를 읽어와 임시 변수에 저장
			String temp_kor = kor_tf.getText().trim();
			
			// (2) 사용자가 입력한 영어 점수 저장
			String temp_eng = eng_tf.getText().trim();
			
			// (3) 사용자가 입력한 수학 점수 임시 저장
			String temp_math = math_tf.getText().trim();
			
					
			// 세가지 정보를 다 입력하고 버튼 클릭한 경우
			if(temp_kor.equals("") == false && temp_eng.equals("") == false &&
					temp_math.equals("") == false){
				System.out.println("사용자가 3개의 점수를 다 입력 했습니다.");
				
				// 올바르게 입력 됐으니까 
				// 국어 변수에 사용자가 입력된 문자열을 정수형으로 바꿔서 저장
				kor_score = Integer.parseInt(temp_kor);
				
				// 영어 점수
				eng_score = Integer.parseInt(temp_eng);
				
				// 수학 점수
				math_score = Integer.parseInt(temp_math);
				
				// 총점 저장
				total_score = kor_score + eng_score + math_score;
				
				System.out.println(total_score);
				// 이 결과를 총 결과 창에 띄워야함!!! -> 어떻게...?
				// setText() 함수를 통해!!! 단, 이 함수는 문자열만 받으니까 
				// total_score + "" 이렇게 문자열로 만들어주기!!!!
				
				total_tf.setText(total_score + "");
	
			} else {
				// 사용자가 세 데이터 중 한가지라도 입력하지 않은 경우
				// 잘못된 입력입니다. 다시 입력해주세요. 창 오픈
			
				JOptionPane.showMessageDialog(this,"총점을 제외한 모든 점수를 입력하세요.");
				
				
				// setFocusable () 함수를 사용해서 TextField 컴포넌트에 
				// 커서가 올 수 있도록 준비
				kor_tf.setFocusable(true);
				
				//requestFocus() 함수를 사용해서 강제로 커서의 위치를
				// TextField 컴포넌트로 이동
				kor_tf.requestFocus();
				
				return;
				
			}
		*/}
	
		
		// 2-2. 이벤트가 텍스트필드에서 발생하는 경우
		else if (ref_event instanceof TextField) {
		//	System.out.println("텍스트 필드에서 엔터 클릭 이벤트 테스트 ");
			
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
