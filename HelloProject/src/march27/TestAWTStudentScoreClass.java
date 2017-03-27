package march27;

/*
 * 학생 성적 등록과 조회를 할 수 있는 프로그램 만들기
 * 1. 학생 성적을 관리할 수 있는 클래스 만들기
 * class MyStudentScoreClass {
 * 		// 이름 보관 변수
 * 		private String m_name;
 * 		// 국어 점수 보관 변수
 * 		private int m_kor ;
 * 		// 영어 점수 보관 변수
 * 		private int m_eng ;
 *		// 수학 점수 보관 변수
 *		private int m_math;
 *		// 총점 보관 변수
 *		private int m_total;
 *		// 평균 보관 변수
 *		private double m_avg;  
 * 
 */

import java.util.*; // 컬렉션 사용
import java.awt.*; // awt 관련 클래스 사용
import java.awt.event.*; // awt 관련 이벤트 처리 클래스 사용
import javax.swing.*; // swing 관련 클래스 사용



// 화면에 성적 등록 버튼과 성적 조회 버튼 그리고 프로그램 종료 버튼을 출력해주는 클래스 만들기
class MyMainFrame extends Frame implements ActionListener {
	
	// 성적 등록 자식 창을 화면에 보여주는 버튼 만들기
	private Button show_reg_score_bt = new Button("성적 등록");
	
	// 성적 조회 자식 창을 화면에 보여주는 버튼 만들기
	private Button show_find_score_bt = new Button("성적 조회");
	
	// 프로그램 종료 버튼
	private Button exit_bt = new Button("프로그램 종료");
	
	// 모든 자식 창에서 공유하는 Vector 변수 준비 ! 꼭 !!!!!!!!!!!!!!!
	// 하나로 관리하기 위해 static으로 준비 
	private static Vector<MyStudentScoreClass> ref_student_score_ob 
							= new Vector<MyStudentScoreClass>();
	
	// 글자 크기 키울때 사용할 폰트 변수
	private static Font f = new Font("궁서체", Font.BOLD, 15); 
	
	// 기본 생성자 만들기
	
	public MyMainFrame() {
		
		this.add(BorderLayout.NORTH, show_reg_score_bt);
		this.add(BorderLayout.CENTER, show_find_score_bt);
		this.add(BorderLayout.SOUTH, exit_bt);
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});	
		
		// 버튼별 이벤트 연결
		this.show_reg_score_bt.addActionListener(this);
		this.show_find_score_bt.addActionListener(this);
		this.exit_bt.addActionListener(this);
		
		// 각각의 버튼에 폰트 적용
		this.show_reg_score_bt.setFont(f);
		this.show_find_score_bt.setFont(f);
		this.exit_bt.setFont(f);
		
		this.setSize(500,500);
		this.pack();
		this.setResizable(false);
		/*
		 * 윈도우의 크기를 사용자가 바꾸지 못하도록 하기
		 * -> setResizable() 함수 사용
		 * -> setResizable(false) : 사용자가 못 바꿈
		 */
		this.setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		

		
	}
	
	
}


// 학생 성적 관리 클래스 만들기 

class MyStudentScoreClass {
	
	
	
	// 각종 변수 선언
	// 국어 성적 보관 변수 
	private int m_kor = 0;
	// 영어 성적 보관 변수
	private int m_eng = 0;
	// 수학 성적 보관 변수
	private int m_math = 0;
	// 총점 보관 변수
	private int m_total = 0;
	// 평균 점수 보관 변수 
	private double m_avg = 0.0;
	
	// 학생 이름 보관 변수 선언
	private String m_name;
	
	// 학생 객체 별로 관리되는 번호 저장 변수 선언 : 인스턴스 변수 선언 -> non-static 변수
	private int m_no;
	
	// 학생 번호를 만들때만 사용되는 변수 : 클래스 변수 선언 -> static 변수 
	// 왜 ? 학생 번호가 일정하게 유지되어야 하며, 모든 학생 객체들은 공유(공통)
	private static int s_no = 0;
	// 0 -> 첫번째 학생의 번호를 만들려면 ++s_no;
	// private static int s_no = 1; // 바로 사용 가능 -> 그 후에는 증가 
	
	
	
	// 무조건 새로운 학생 객체가 만들어지는 시점에 새로운 학생 번호를 만들고 
	// 만든 학생 번호를 반환(실행한 함수로 전달)하는 static 함수 만들기
	public static int create_no() {
		
		++s_no; // m_no 변수 쓰면 오류(non-static 변수라서)
		System.out.println("새로 만든 학생 번호는 " + s_no);
		return s_no;
		// 현재 생성자와 연결 
		// 현재 생성자에 있는 ++s_no 삭제(중복되니까)
		
	}
	
	
	
	// 기본 생성자 만들기
	public MyStudentScoreClass() {
		
		
		System.out.println("기본 생성자 실행");
		System.out.println("학생 번호 만들기");
		// ++s_no;
		// System.out.println("만들어진 학생 번호는 " + s_no + "번"); // 0 -> 1
		
		m_no = create_no();
		System.out.println("저장된 학생 번호는 " + m_no + "번");
		m_name = "무명학생";
		System.out.println("학생의 이름은 " + m_name);
		
		
		
	
	
	}
	// 다른 클래스들로 부터 이름을 받는 생성자 함수 만들기
	public MyStudentScoreClass(String name) {
		System.out.println("이름을 받는 생성자 함수 실행");
		this.m_name = name;
		System.out.println("이름이 전역 변수에 저장됨");
		// ++s_no;
		this.m_no = create_no();
		System.out.println(this.m_name + " 학생의 번호는 " + this.m_no + "번 입니다.");
		
		
	}
	// 새로운 함수를 추가해서 기본 생성자를 사용하는 다른 클래스에서 학생 이름을 바꿀 수 있도록
	// 해주는 함수 만들기 main() 함수로 부터 바꿀 학생 이름을 받는 일반 함수 
	public void change_name(String value) {
		System.out.println("main() 함수에서 새로운 바꿀 이름을 입력 받기");
		System.out.println("현재 이름은 " + m_name);
		System.out.println("바꿀 이름은 " + value);
		System.out.println("전역 변수에 저장합니다.");
		m_name = value;
	}
	
	/*
	 * 새로 추가한 변수 한개달 get(), set() 함수 만들기
	 */
	// private 변수인 m_kor에서 사용할 get() 함수 만들기
	public int get_kor() {
		System.out.println("현재 국어 점수를 읽어오는 함수");
		return m_kor;
	}
	// private 변수인 m_kor 에서 사용할 set(새로운 국어 점수) 함수 만들기
	public void set_kor(int new_score) {
		System.out.println("현재 국어 점수를 바꿉니다.");
		m_kor = new_score;
	}
	
	// m_eng 변수에 대한 get(), set() 함수 만들기
	public int get_eng() {
		return m_eng;
	}
	public void set_eng(int new_score) {
		m_eng = new_score;
	}
	
	// m_math 변수에 대한 get(), set() 함수 만들기
	public int get_math() {
		return m_math;
	}
	public void set_math(int new_score) {
		m_math = new_score;
	}
	
	// private 변수인 m_total에 대한 get(), set() 함수 만들기
	// total은 굳이 set() 함수 안필요할 듯
	public int get_total() {
		
		this.m_total = get_kor() + get_eng() + get_math();
		// 만든 함수를 재사용해서 총점을 구하고 난 뒤 반환
		return this.m_total;
	}
	/*public void set_total(int new_score) {
		
		m_total = new_score;
	}
	*/ 
	// private 변수인 m_avg에 대한 get(), set() 함수 만들기
	public double get_avg() {
		
		this.m_avg = get_total()/3.0; // 평균 구하고 반환 
		return this.m_avg;
	}
	/*public void set_avg(double new_score) {
		m_avg = new_score;
	}*/
	// 아까 change_name() 함수 만든거는 set()함수!
	// private 변수인 m_name에 대한 get 함수 만들기
	public String get_name() {
		return m_name;
	}
	
	
	
	// 아래 함수는 그냥 내가 만든거
	public void input_name(String name) {
		
		this.m_name = name;
		++s_no;
		this.m_no = s_no;
		System.out.println(m_name + " 학생의 번호는 " + m_no + "번 입니다.");
		
	}
	
	
	
	
	
}

public class TestAWTStudentScoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMainFrame ref_frame = new MyMainFrame();
		
		// 첫 번째 학생 객체 만들기 
		MyStudentScoreClass ref_child_student1 = new MyStudentScoreClass();

		ref_child_student1.change_name("강웅구");
		
	//	System.out.println("**********************************************");
		// 두 번째 학생 객체 만들기
		MyStudentScoreClass ref_child_student2 = new MyStudentScoreClass();
	//	System.out.println("**********************************************");
		ref_child_student2.change_name("김진주");
		
	//	System.out.println("**********************************************");
		MyStudentScoreClass ref_child_student3 = new MyStudentScoreClass("이진주");
	//	ref_child_student1.input_name("강진주");
	// ref_child_student2.input_name("강진영");
	//	System.out.println("**********************************************");
		ref_child_student1.create_no();
	//	System.out.println("**********************************************");
		
		MyStudentScoreClass ref_child_student4 = new MyStudentScoreClass("배은화");
	//	System.out.println("**********************************************");
		
		// 강진주 학생의 국어 점수는 70
		ref_child_student3.set_kor(70);
		// 영어 점수는 100
		ref_child_student3.set_eng(100);
		
		// 수학 점수는 50;
		ref_child_student3.set_math(50);
		
		// 총점은 
		int total = ref_child_student3.get_total();
		System.out.println("총점은 " + total);
		
		// 평균
		double avg = ref_child_student3.get_avg();
		System.out.printf("평균은 %.2f \n",avg);
		
		/*
		 *  String 클래스의 format이라는 함수를 사용해서 소숫점 자리 조정 가능
		 *  -> String.format("소숫점 아래 자릿수 지정형식 문자 작성", 실수);
		 *  -> String.fotmat("%.2f", avg);
		 *  -> avg에 보관되어있는 실수를 문자열로 바꾼후에 문자열로 반환 
		 */
		
		String str_value = String.format("%.3f",avg);
		System.out.println("평균을 소숫점 3자리까지 표현하면 " + str_value);
		
		
	
		

	}

}
