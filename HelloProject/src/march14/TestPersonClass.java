package march14;

/*
 * 현실 세계에 존재하는 사람을 표현할 수 있는 클래스 만들기
 * 
 * 사람을 분석해서 속성과 행위(행동)으로 분리
 * 
 */

// 새로운 사람 클래스 만들기 

class PersonClass { // public class 새로운이름 {} // 오류 발생
	// public class 이름은 파일 이름과 같이 때문 -> 파일 이름은 유일(한개)
		// 프로그램의 식별자
	
	// 1. 속성(Attribute) : 데이터를 보관하는 변수/상수/배열 부분
	
	//non-static : 관리가 힘들다! 사람 객체가 새로 만들어지는 시점에
	// 또 메모리에 생성되는 변수 
	// 예) 클래스 이름 새로운사람변수(객체) 이름 ; 
	// 새로운사람변수(객체)이름 = new 클래스 이름();
	// 메모리에 클래스가 생성 + non-static 변수도 또 생성
	// PersonClass kim = new PersonClass (); // String name = "홍길동";
	// PersonClass lee = new PersonClass (); // String name = "홍길동";
	// PersonClass choi = new PersonClass (); // String name = "홍길동";
	// 이런식으로 new를 할 때 마다 힙 메모리에 새로운 클래스가 생성, 같은 데이터여도
	// -> 독립 변수 또는 개별 변수
	
	String name = "홍길동";
	
	// static : 관리가 용이 -> 한개만 메모리에 생성
	// 자바 가상 머신에 의해서 한번만 메모리에 생성 -> 주소가 변하지 않음
	// -> 공유 변수 또는 공통 변수 : final은 상수 명령어
	// 일반적으로 상수는 static을 붙임
	static final String MY_NAME = "홍길동";
	
	// 공유 변수 또는 공통 변수
	
	static String name2 = "홍길동";
	
	
	
	// 2. 행위 또는 행동(Action 또는 Function 또는 Method) : 데이터를 사용하는 메소드
	
	// 모든 변수, 상수를 사용하는 새로운 메소드 만들기 -> non-static 함수
	public void show_name_method() {
		// 다른 부모 디렉토리(패키지)에서도 보이는 메소드
		
		// 인스턴스 변수인 name을 사용해서 현재 메모리에 저장된 이름을 
		// 읽어오고 화면에 출력하는 명령문
		System.out.println("인스턴스 변수 name이 갖고 있는 이름은 " + name);
		
		// 클래스 변수도 사용 가능
		// -> name2 변수 이름을 사용
		System.out.println("클래스 변수 name2가 갖고 있는 이름은 " + name2);
		
		// 클래스 변수는 클래스이름.이름
		// -> 다른 클래스에서는 항상 클래스이름.이름
		System.out.println("클래스 변수 name2를 클래스이름.name2로 접근 하면 "
				 + PersonClass.name2);
		
	}
	void show_name2_method() {
		// 같은 부모 디렉토리(패키지)에서만 보이는 메소드
		// 1) non-static 멤버 변수/ 함수 이름
		// 2) static 멤버 변수/ 상수/ 함수이름
	
	}
	
	static void show_name3_method() {
		// static 변수, 상수, 함수 이름만 사용 가능한 메소드
		// non-static 변수, 함수이름은 사용 불가능
		
		System.out.println("클래스 변수인 name2를 사용해서 이름을 출력하면 " + name2);
		
	}
	
}

public class TestPersonClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
