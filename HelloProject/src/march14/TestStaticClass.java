package march14;

import java.util.*;


public class TestStaticClass {
	
	// static 변수 선언
	// 예) static int s_no = 0;
	
	static Scanner scanner = new Scanner(System.in);
	static int s_age = 0;
	static final String s_name = "강진주";
	static final int birth_year = 1990;
	static int now_year = 0;
	int y_birth_year = 0;
	String y_name = "";
	final int n_year = 2017;
	
	
	public static void s_my_info() {
		
		System.out.print("현재 년도를 입력해주세요 (예 : 2001) : ");
		now_year = scanner.nextInt();
		
		System.out.println("저의 이름은 " + s_name + "입니다.");
		System.out.println("저는 " + birth_year + "년에 태어났습니다.");
		
		s_age = (now_year - birth_year)+1 ;
		System.out.println("저의 나이는 " + s_age + "살 입니다.");
		
	}
	
	public void n_your_info() {
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		y_name = scanner.next();
		
		System.out.print("당신이 태어난 년도를 입력해주세요(예 : 1990) : ");
		y_birth_year = scanner.nextInt();
		
		System.out.println("현재 년도는 " + n_year + "년 입니다.");
		System.out.println("당신의 이름은 " + y_name + "입니다.");
		
		s_age = (n_year - y_birth_year) +1;
		
		System.out.println("당신은 " + s_age + "살 입니다.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestStaticClass your_info = new TestStaticClass();
		your_info.n_your_info();
		s_my_info();
	
	}

}
