package march16;



/*
 * 순차 검색 알고리즘을 메소드로 만들기
 * 
 *  1) 정수 데이터 만들기 : 배열 준비 - int 배열이름 [];
 *  2) 실수 데이터 만들기 : 배열 준비 - double 배열이름 [];
 *  3) 문자열 데이터 만들기 : 배열 준비 = String 배열이름 [];
 */

import java.util.*;

public class TestSeqSearchClass {
	
	// 여러 개의 정수 데이터들을 저장할 수 있는 배열 선언
	int iarray [];
	
	// 여러 개의 실수 데이터들을 저장할 수 있는 배열 선언
	double darray [];
	
	// 여러 개의 문자열 데이터들을 저장할 수 있는 배열 선언
	String sarray [];
	
	Random random = new Random();
	
	/*
	 * 생성자 만들기 : 기본 생성자 먼저 만들기
	 */
	
	public TestSeqSearchClass() {

		// this(첫번째 배열의 크기, 두번째 배열의 크기, 세번째 배열의 크기);
		// -> 아래에 있는 두번째 생성자를 재사용
		
		this(3, 4, 5);
		
	}
	
	/*
	 * 두번째 생성자 만들기 : main() 함수로부터 위에서 선언한 3개의 배열
	 * 크기 갯수를 받아오는 생성자
	 */
	
	public TestSeqSearchClass(int size1, int size2, int size3) {
	//	System.out.println("3개의 배열 크기를 받는 생성자 함수");
		// 이 생성자 안에서 배열을 생성합니다.
		/*
		 * 변수 size1은 첫번째 배열의 크기로 사용
		 */
		this.iarray = new int[size1];
		/*
		 * 변수 size2는 두번쨰 배열의 크기로 사용
		 */
		this.darray = new double[size2];
		/*
		 * 변수 size3은 세번째 배열의 크기로 사용
		 */
		this.sarray = new String[size3];
		
		// 일반 함수 실행 가능
		// 아래에서 만든 3개의 함수들을 실행하기
		input_date();
		create_data1();
		create_data2();
		create_data3();
		
		
	}
	
	
	
	/*
	 * iarray 배열에 정수 데이터를 만들어서 저장해주는 메소드 만들기
	 */
	private void create_data1() {
		System.out.println("******************************************");
		System.out.println("여러 개의 정수 데이터를 만들기");
		
		/* 
		 * 데이터 갯수 : 배열이름.length
		 */
		int size = this.iarray.length;
		
		/*
		 * 반복문을 사용해서 정수 데이터를 size 변수가 갖고 있는 정수 만큼 
		 * 난수를 만든 후에 iarray 배열에 순차적으로 저장
		 * 첫번째 난수는 배열의 첫번째 위치에
		 */
		if(size > 0) {
			
			System.out.println(size + "개의 난수를 만들어서 정수형 배열에 저장");

			for (int i = 0; i < size ; ++i) {
				
				int value = random.nextInt(100); // 0 ~ 99 의 난수 
				this.iarray[i] = value;
				System.out.println(i + " 위치에 저장된 난수 정수는 " + this.iarray[i]);
				
			}
		}
	
	}
		
	/*
	 * darray 배열에 실수 데이터를 만들어서 저장해주는 메소드 만들기
	 */
	private void create_data2() {
		System.out.println("******************************************");
		System.out.println("여러 개의 실수 데이터를 만들기");
		
		
		int size = this.darray.length;
		
		if(size > 0) {
			
			for ( int i = 0 ; i < size; ++i ) {
				
				double value = (Math.random() * 100);
				this.darray[i] = value;
				System.out.print(i);
				System.out.printf(" 위치에 저장된 실수는 %.2f%n", value);
		
			}
			
		}
		
	/*	int size = this.darray.length;
		
		if(size > 0) {
			
			for()
		}
		*/
	

	}
	/*
	 * sarray 배열에 문자열 데이터를 만들어서 저장해주는 메소드 만들기
	 */
	private void create_data3() {
		
		System.out.println("******************************************");
		System.out.println("여러 개의 문자열 데이터를 만들기");
		
		int size = this.sarray.length;
		
		if(size > 0) {
			
			for(int i = 0; i < size ; ++i) {
				String value = random.nextInt(100) + "";
				this.sarray[i] = value;
				System.out.println(i + " 위치에 저장된 문자열은 " + value);	
			}
		}
		
	
		// "" + 정수 -> "정수"
		// nextInt( 100 ) + "" -> "99"

	
	}
	
	// 3개의 정수를 한꺼번에 입력 받아서 각각 변수에 저장하는 함수
	
	static void input_date() {
		
		int size1 = 0;
		int size2 = 0;
		int size3 = 0;
		String user_input = "";
		String [] str_input = null;
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.print("3개의 정수를 입력해주세요(예 : 3 4 5) : ");
			user_input = scanner.nextLine();
			str_input = user_input.split(" ");
			
			size1 = Integer.parseInt(str_input[0]);
			size2 = Integer.parseInt(str_input[1]);
			size3 = Integer.parseInt(str_input[2]);
			
	

	}
	
	
/*	static String input_int() {
		Scanner scanner = new Scanner(System.in);
		String input_data = "";
		String [] data_array = null;
		
		System.out.print("3개의 정수를 입력해주세요 : ");
		input_data = scanner.nextLine();
		data_array = input_data.split(" ");
		*/
		
	/*	a = Integer.parseInt(data_array[0]);
		b = Integer.parseInt(data_array[1]);
		c = Integer.parseInt(data_array[2]);*/
		
		// return a, b, c;
		
	/*	int size = data_array.length;
		
		if(size > 0) {
		for(int i = 0; i < size ; ++i ) {
			
			data_array[i] = 
		}
	}*/
	
	/*
	 * 사용자에게 계속 여부를 물어보기
	 * 1) y 또는 n 한글자 입력을 요청 char y_n = ' ';
	 * 2) yes 또는 no 문자열 입력을 요청 String yes_no = "";
	 * 
	 * -> 이걸 함수로 
	 */
/*	
	static void choice() {
		
		char y_n = ' ';
		String str_yn = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계속 진행하시려면 y를 그만 하시려면 n을 입력해주세요 : ");
		str_yn = scanner.next();
		y_n = str_yn.charAt(0);
	
	}
	*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSeqSearchClass ref_ob = null;	
		
		/*int size1 = 0;
		int size2 = 0;
		int size3 = 0;
		String user_input = "";
		String [] str_input = null;
		
		Scanner scanner = null;*/
		
		try {
			
			/*scanner = new Scanner(System.in);
			System.out.print("3개의 정수를 입력해주세요(예 : 3 4 5) : ");
			user_input = scanner.nextLine();
			str_input = user_input.split(" ");
			
			size1 = Integer.parseInt(str_input[0]);
			size2 = Integer.parseInt(str_input[1]);
			size3 = Integer.parseInt(str_input[2]);
			*/
			// size1 = scanner.nextInt();
		
			/*
			 * 3개의 정수 데이터를 사용자로 부터 입력 받기
			 */
			// ref_ob = new TestSeqSearchClass(10,20,30);
		// 무한 반복문으로 프로그램 전체 구조를 바꾸기
			Loop1 :
			while(true) {
			ref_ob = new TestSeqSearchClass();
			
			/*
			 * 사용자에게 계속 여부를 물어보기
			 * 1) y 또는 n 한글자 입력을 요청 char y_n = ' ';
			 * 2) yes 또는 no 문자열 입력을 요청 String yes_no = "";
			 * 
			 * -> 이걸 함수로 
			 */
			
			char y_n = ' ';
			String str_yn = "";
			
			Scanner scanner = new Scanner(System.in);
			
			Loop2 :
			do{
			System.out.print("계속 진행하시려면 y를 그만 하시려면 n을 입력해주세요 : ");
			str_yn = scanner.next();
			y_n = str_yn.charAt(0);
			
			if(y_n == 'y' || y_n == 'Y')
				break Loop2;
			else if (y_n == 'n' || y_n == 'N')
				break Loop1;
			else {
				
				System.out.println("y나 n이 아닌 문자를 입력하셨습니다.");
				continue;
				
			}
			} while(true);
			
		} // end of while
			
		} catch (Exception e) {
			System.out.println("예외 발생");
			System.out.println("내용은 " + e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("랜덤 데이터 생성 종료");
		
	

	}

}
