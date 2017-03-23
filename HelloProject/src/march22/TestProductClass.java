package march22;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 * 다형성 이해 예제 만들기
 * 
 */
// 모든 제품에서 갖고 있는 공통된 속성과 행동들을 추출해낸 부모 클래스 만들기
class ProductBaseClass {
	// 제품 이름을 보관할 수 있는 변수 선언
	protected String name; // m_(접두사) : member 예) m_name;
	// m_name -> 함수에서 선언된 지역 변수 이름과 충돌되는 부분을 최소화
	// 지역 변수 -> 임시 변수 -> 해당 함수가 실행될 동안만 사용 가능
	// 제품 가격을 보관할 수 있는 변수 선언
	protected int price;
}
// 시계 클래스 만들기 : 위에서 만든 ProductBaseClass 클래스를 부모 클래스로 설정
// class WatchClass(자식 클래스이름) extends 부모 클래스 이름

class WatchClass extends ProductBaseClass {
	// 부모 클래스에 있던 name, price 변수가 상속됨 - > 바로 사용 가능
	/*
	 * 1. 선언 명령문 : 자료형 또는 클래스이름 + 변수이름/배열이름/상수이름 ;
	 * 2. 사용 명령문 : 자료형이 없고 이름만 작성 
	 * 예) a (사용) // 메모리 사용(접근)
	 */
	// 이 위치에서 선언은 가능
	// int a; // 정상 (ok)
	// 변수이름이 바로 오는 경우에는 오류
	// 상속받은 변수 이름 name 또는 price를 먼저 사용하는 경우
	// name 또는 price = 값; // 오류 
	// 사용은 중괄호 { } 블럭 안에 있거나 생성자 함수 또는 일반 함수안에 있어야함!
	
	// 중괄호 블럭 
	{
		
		// 상속 받은 변수 name을 사용
		name = "시계1";
		// 상속받은 변수 price를 사용
		price = 5000;
		
		// 함수 실행문 작성 가능
		System.out.println("상속 받은 변수 name에 저장한 값은 " + name);
		System.out.println("상속 받은 변수 price에 저장한 값은 " + price);
		
		// 반복문도 작성 가능
		// -> 배열의 초기화 명령문 작성 가능
		
		// if 문도 작성 가능 
		
		// 생성자 함수가 많아지는 경우에 중복된 명령문을 블럭에 작성해서
		// 모든 생성자 함수에서 같이 사용 (공유 또는 공통)
		
		
	}
	
	// 생성자 함수 
	public WatchClass() {
		
		System.out.println("생성자 함수가 실행 되었습니다[WatchClass] ");
		
	}
	// 일반 함수 
	public void use_method() {
		System.out.println("새로 추가한 use_method() 함수가 실행 되었습니다[WatchClass]");
		
	}
	
	// 중괄호 블럭 -> 생성자 함수 -> 일반 함수 순서로 실행 (위치는 중요하지 않음)
	
}

// 가방 클래스 만들기
class BagClass extends ProductBaseClass {
	
	{
		name = "마몬트백";
		price = 1300000;
		
		System.out.println("선택 하신 제품은 " + name + "입니다.");
		System.out.println("가격은 " + price + "원 입니다.");
	}
	
	public BagClass() {
		
		System.out.println("생성자 함수가 실행 되었습니다[BagClass]");
	}
	
	public void use_method() {
		
		System.out.println("새로 추가한 use_method() 함수가 실행 되었습니다[BagClass]");
	}
	
}

// 컴퓨터 클래스 만들기
class ComputerClass extends ProductBaseClass {
	
	{
		name = "맥북";
		price = 2500000;
		
	}
	
	public ComputerClass() {
		System.out.println("선택 하신 제품은 " + name + "입니다.");
		System.out.println("가격은 " + price + "원 입니다.");
	}
	
	public void use_method() {
		
		System.out.println("원하시는 결제 방법을 선택해주세요. ");
	}
	
}

public class TestProductClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 위에서 만든 WatchClass 클래스를 사용해서 객체의 주소를 저장하는 참조형
		// 변수 선언
		WatchClass ref_watch_ob = null;
		BagClass ref_bag_ob = null;
		ComputerClass ref_computer_ob = null;
		
		ref_computer_ob = new ComputerClass();
		ref_computer_ob.use_method();
		
		
		System.out.println("********************************");
		
		ref_bag_ob = new BagClass();
		ref_bag_ob.use_method();
		
		System.out.println("********************************");
		
		// new 연산자를 사용해서 메모리에 WatchClass 생성
		// 순서는 먼저 부모 클래스가 메모리에 생성 -> super() 명령문에 의해
		// -> 그 다음에 자식 클래스인 WatchClass가 메모리에 생성
		// public WatchClass() {
		// super(); // 컴파일러에 의해서 무조건 삽입되는 명령문
		// 	// 부모 클래스에 있는 기본 생성자 함수를 실행하는 명령문
		// // 눈에 보이지 않는 명령문
		// }
		
		ref_watch_ob = new WatchClass();
		
		// WatchClass 클래스에 새로 추가한 use_method() 함수를 실행
		// WatchClass이 메모리 주소를 갖고 있는 참조형 변수인 ref_watch_ob를
		// 사용해야 메모리에 접근 가능 -> 참고변수이름.use_method();
		ref_watch_ob.use_method();
		
		
		

	}

}
