package march15;

// 새로운 클래스를 더 만들기 

class MyNewClass2 {
	
	// 1차원 배열 선언 명령문 작성
	// -> 나중에 만들어지는 배열의 시작 주소를 저장하는 변수(참조 변수)
	int [ ] iarray; // int [] iarray = null;
	// String 이름; 
	// 클래스이름 이름;
	// int a; // 지역 변수로 선언 -> 값이 없는 상태
	// int [] iarray ; // 지역 변수로 선언 -> 컴파일러가 자동으로 0을 채워줌
	// 배열은 객체로 처리하기 때문 
	
	// 배열 선언 + 메모리 생성을 함께 하는 명령문
	int [ ] iarray2 = new int [ 5 ];
	//  메모리의 5개의 정수형 변수를 생성 + 컴파일러가 0으로 모든 값을 채워줌
	// + 배열의 주소를 iarray2 변수가 저장하고 있음!
	
	int a ; // int a = 0;
	
	int iarray3 [ ] = null;
	
	{
		/*
		 * 블럭을 생성 -> 초기화 블럭 -> 여러 개의 생성자 보다 먼저 실행
		 * 여러 개의 생성자에서 공통 분모들을 잘라내기 해서 먼저 작성
		 */
		System.out.println("생성자 함수보다 먼저 실행되는 명령문");
		
		/*
		 * 생성자 함수가 여러 개인 경우
		 * public 클래스이름() {
		 * 		명령문1;
		 * }
		 * public 클래스이름 (입력 변수 선언) {
		 * 		명령문2;
		 * }
		 * 
		 *  -> 명령문 1, 2에서 중복되는 명령문을 { } 블럭 안으로 작성
		 *  명령문을 한번만 작성하면 실행되는 구조
		 *  
		 *  System.out.println("메시지를 출력");
		 *  
		 *  = 기호를 사용하는 부분은 각가의 생성자 안에서 작성
		 *  
		 *  int iarray [ ]  = new int [ 5 ];
		 *  
		 *  iarray[0] = 0;
		 *  iarray[1] = 0;
		 *  iarray[2] = 0;
		 *  iarray[3] = 0;
		 *  iarray[4] = 0;
		 *  
		 *  for ( int i = 0; i<5 ; ++i)
		 *  iarray[i] = i+1;
		 *  
		 */
		
		iarray = new int [ 100 ];
		iarray3 = new int [ 50 ];
		
		for(int i = 0; i < iarray.length; ++i) {
			iarray[i] = i+1;
			System.out.println("배열 iarray["+i+"] 위치에 저장된 정수는 " +
				iarray[i]);
			/*
			 * 배열에 저장된 변수에 접근하려면 배열이름[위치 번호]
			 * 위치 번호의 범위는 0 ~ 배열이름.length -1 까지
			 * 위치 번호가 틀리면 예외상활 발생!
			 */
		}
		/*
		 * 배열이름.length : 자동 변수 : 컴파일러가 만들어주는 변수
		 * -> 배열의 크기를 갖고 있는 변수
		 */
		
	}
	
	public void method1() {
		
		int a; // 지역 변수 - 컴파일러가 0을 저장하지 않음! 지역변수
		int a2 = 0; // 지역변수는 사용하기 전에 꼭 값을 저장하는 습관!
		a = 0;
		System.out.println("변수 a는 지역 변수입니다.");
	}
	
}


// 새로운 클래스를 더 만들기
// public class 새로운클래스이름 {} -> 오류

class MyNewClass1 {
	
	// 사람 이름 보관 변수 선언과 초기화 (시작 이름을 지정)
	String name = "홍길동";
	String name2; // 컴파일러가 자동으로 null 값을 지정
	// String name2 = null; -> 전역 변수  -> 컴파일러가 관심을 갖고 책임을 짐
	// 지역 변수 : 개발자가 책임을 져야함 -> 무조건 사용하기 전에 값을 저장
	// -> 예외 상황 발생 가능 -> NullPointerException
	String name3 = "";  // 빈 문자열 -> 문자열(데이터)이 없는 것을 표현 
	
	/*
	 * 생성자 함수를 여러 개 만들 수 있습니다 -> 함수 중복(함수 이름 중복 :
	 * Function Overloading 또는 Function Name Overloading) -> 함수 이름 재사용
	 * -> 함수이름 + 입력 변수들을 합쳐서 키(Key)로 처리
	 * -> 함수이름 ( int a ) { }
	 * -> 함수이름 ( int b ) { } // 오류 -> 매개변수(parameter : 다리 역할 변수)
	 * -> 함수이름( char a ) { } // 정상
	 * -> 함수이름 ( double a ) { } // 정상
	 * -> 함수이름 ( String a ) { } // 정상
	 * -> 함수이름 ( float a ) { } // 정상
	 * 
	 * -> 이름 보다 자료형이 더 중요 
	 */
	
	
	// 첫번째 생성자 함수 만들기
	public MyNewClass1() {
		// 다른 함수로부터 값을 받지 않는 생성자
		
		// this. 선택(변수들을 선택)
		this.name = "강진주";
		this.name2 = "강진주";
		this.name3 = "강진주";
		
	/*	System.out.println("변수 name의 값은 " + this.name);
		System.out.println("변수 name2의 값은 " + this.name2);
		System.out.println("변수 name3의 값은 " + this.name3);
		*/
		
		this.println(); // this.함수() -> 현재 클래스에서 만든(this.) println() 함수를 쓰겠다!
	}
	
	// 두번째 생성자 함수 만들기
	public MyNewClass1(String name_value) {
		// 다른 함수로부터 문자열 값을 받는 생성자
		// main() 함수로부터 새로운 이름을 변수 name_value로 받아옴
		// this.변수이름(전역 변수 : 클래스에서 선언한 변수 이름)
		// = name_value(지역 변수 : 생성자 함수에서 선언한 변수)
		this.name = name_value;
		this.name2 = name_value;
		this.name3 = name_value;
		
		this.println();
		
/*		System.out.println("변수 name의 값은 " + this.name);
		System.out.println("변수 name2의 값은 " + this.name2);
		System.out.println("변수 name3의 값은 " + this.name3);	
		*/
		
	}
	// 무조건 3개의 변수들이 갖고 있는 이름을 화면에 출력하는 새로운 함수
	
	public void println() {
		
	System.out.println("변수 name의 값은 " + this.name);
	System.out.println("변수 name2의 값은 " + this.name2);
	System.out.println("변수 name3의 값은 " + this.name3);
	
	}
	// 3번째 생성자 함수 만들기
	
	public MyNewClass1(String name1_value, String name2_value) {
		
		System.out.println("2개의 이름을 받아오는 생성자 함수");
		System.out.println("받아온 이름들을 전역 변수에 저장");
		this.name = name1_value;
		this.name2 = name2_value;
		this.name3 = "강남이";
		
		this.println();
		
	}
	
	// 4번째 생성자 함수 만들기
	public MyNewClass1(String name1_value, String name2_value, String name3_value) {
		
		System.out.println("3개의 이름을 받아오는 생성자 함수");
		System.out.println("받아온 이름들을 전역 변수에 저장");
		this.name = name1_value;
		this.name2 = name2_value;
		this.name3 = name3_value;
		
		this.println();
		
	}
	
	// 5번째 생성자 함수 만들기
	public MyNewClass1(String [] str_array) {
		
		System.out.println("배열을 받아오는 생성자 함수");
		 if(str_array.length == 3) {
			 System.out.println("받은 3개의 이름을 사용");
			 // 배열의 첫번째 이름을 전역 변수인 name에 저장
			 this.name = str_array[0];
			 // 배열의 두번째 이름을 전역 변수인 name2에 저장
			 this.name2 = str_array[1];
			 // 배열의 세번째 이름을 전역 변수인 name3에 저장
			 this.name3 = str_array[2];
			 
			this.println();
		 }
		 else {
			 System.out.println("배열을 사용하지 않음");
		 }
	
	}
	
	
}

// 다른 클래스를 사용하는 클래스(제어 클래스)
public class TestMyNewClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***main() 함수가 시작되었습니다!!***");	
		
		// 명령문을 작성하는 위치
		// 위에서 만든 생성자 함수들을 자동 실행하기 위한 명령문을 작성
		// new 클래스이름() -> 기본 생성자를 호출
		// new 클래스이름( 값 목록 ) -> 값 목록에 맞는 생성자 함수가 호출
		new MyNewClass1(); 
		// 힙 메모리 생성 -> 일회용 객체를 메모리에 생성
		// 아래 위치에서는 사용할 수 없는 메모리 -> 주소를 보관하지 않았기 때문
		// -> 다시는 사용 할 수 없는 객체(미아 객체)
		
		
		// 클래스 이름 변수이름 = new 클래스이름();
		// -> 변수가 메모리의 주소를 저장 -> 다른 명령문에서 사용할 수 있는 객체 생성
		// -> 객체의 재사용 -> 클래스의 재사용(클래스가 갖고 있는 변수 / 함수)
		// -> non-static 멤버 변수/함수들
		
		// static 멤버 변수 / 함수들은 클래스이름.이름 으로 사용 가능 
		// 상수 -> static final 자료형 상수이름 = 데이터;
		
		new MyNewClass1("새로운 이름");
		
		String [] str_array = {"강진주", "김진주", "최진주"};
		
		// 배열을 받는 생성자를 실행
		new MyNewClass1(str_array);
		
		// 3개의 이름을 받는 생성자를 실행
		new MyNewClass1("강진주","강진영","강웅구");
		
		// 2개의 이름을 받는 생성자를 실행
		
		new MyNewClass1("김길동", "나길동");
		
		
		
		
		System.out.println("***main() 함수가 종료되었습니다!!***");

	} // 닫는 중괄호 기호를 만나면 프로그램 전체가 종료
	// 또는 return 명령문을 만나면 프로그램 전체가 종료

}
