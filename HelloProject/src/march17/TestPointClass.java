package march17;

/*
 * 새로운 자식 클래스인 Point 클래스 만들기
 * 
 * 1. 클래스 설계하기
 * 
 * 1) 필요한 데이터 정하기 : x 좌표를 저장할 수 있는 변수 필요 int x;
 * y 좌표를 저장할 수 있는 변수 필요 int y;
 * 
 */
class Point {
	
	int x; // 접근 제한자를 작성하지 않으면 default 접근 제한 권한을 갖는 변수
	int y; // 같은 패키지에 있는 모든 클래스에서 사용 가능
	
	private int x2 = 0 ; // 현재 클래스(Point)에서만 사용 
	private int y2 = 0 ;  // 다른 클래스에서 사용할 수 없는 변수
	
	// main() 함수로부터 2개의 정수를 받는 생성자 만들기
	// -> 2개의 정수를 저장하는 변수가 필요 -> 선언 -> 첫번째 정수를 저장하는 변수 선언
	// int 변수이름1
	// 두 번째 정수를 저장하는 변수 선언 -> int 변수이름2
	
	public Point (int a, int b) {
		// 반환형을 작성하면 오류 -> 일반 함수가 됨
		// 생성자 함수는 특수한 함수 -> 반환형을 작성하면 안됨!!
		// public void Point (int a, int b) {} // 오류
		// public void method1(int a , int b) {} // 정상
		// 생성자 함수의 이름은 클래스 이름과 같아야함
		// 일반 함수는 클래스 이름과 같으면 안됨
		
		// 아래에 있는 생성자로부터 받은 2개의 정수를 멤버 변수인 x와 y에
		// 저장 해야함
		this.x = a;
		this.y = b;
		
		System.out.println("전역 변수 x에 저장된 값은 " + this.x);
		System.out.println("전역 변수 y에 저장된 값은 " + this.y);
			
	} // 이렇게 생성자 함수를 만들어주면 기본 생성자 함수는 없어짐
	// 따라서 기본 생성자 함수를 만들어줘야함
	
	/*
	 * 기본 생성자 함수 만들기 : 클래스 이름()  {}
	 * -> 다른 클래스에서는 new 클래스이름() 명령어를 사용 할 수 없음 
	 * 
	 *  또는
	 *  
	 *  public 클래스이름() {} 
	 *  -> 다른 패키지에 있는 클래스에서도 객체를 만들 수 있음 
	 *  -> new 클래스이름() 명령어를 사용 가능
	 */
	public Point() {
		
		this(10,20); // 다른 생성자 함수를 실행하는 명령문
		// 메모리 생성 명령문 !
		// 가장 첫번째로 작성되어야함
		// println() 함수랑 바뀌어서 쓰면 안됨 -> 오류!
		// this + 점(.) + 변수이름 -> 변수 이름과 동일
		// this + 점(.) + 함수이름() -> 함수이름()과 동일
		// 함수 실행 명령문;
		/*
		 * this 변수는 new 클래스이름() 명령어가 실행된 후에 자바 가상머신으로 부터
		 * 새로 만들어진 메모리의 시작 주소를 넘겨 받음
		 * 
		 * this = new 연산자에 의해서 새로 만들어진 메모리의 주소; 
		 */
		
		System.out.println("새로운 기본 생성자 함수를 만들었습니다.");
		
	}
	
}


 
public class TestPointClass {
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Point 클래스를 다른 클래스에서 사용하기
		// 메모리의 주소를 저장할 수 있는 참조형 변수 선언
		
		// new 연산자를 사용해서 메모리에 Point 클래스 만들고
		Point ref_ob1 = null;
		// 변수 x, y도 만들기 -> 자동으로 변수에는 0이 저장
		// -> 새로만든 메모리의 주소가 반환(생성)
		ref_ob1 = new Point();
		
		/*
		 * 메모리에는 Point 클래스가 생성된 상태
		 * 변수 x,y도 생성(x2,y2 도)
		 * 기본 생성자도 생성
		 */
		// 메모리에 있는 변수 x,y,x2,y2를 사용(접근)
		// x,y : 다른 클래스에서 사용 가능 -> default 접근 제한자
		// x2,y2 : 다른 클래스에서 사용 불가능 -> private 접근 제한자
		// ref_ob1 + 점(.)  메모리에 있는 변수 또는 메소드 이름();
		ref_ob1.x = 100;
		ref_ob1.y = 200;
		
		System.out.println("현재 x의 좌표는 " + ref_ob1.x);
		System.out.println("현재 y의 좌표는 " + ref_ob1.y);

		// private 변수들은 다른 클래스에서 접근 불가능
		// ref_ob1.x2 = 200;
		
		// 새로운 참조형 변수 선언
		Point ref_ob2 = null;
		
		/*
		 * Point 클래스에 있는 변수 x,y 값을 읽어와서 화면에 출력
		 */
		
		ref_ob2 = new Point();
		
		/*
		 * 참조형 변수이름. 변수이름 -> 변수의 현재 값을 읽어오기
		 */
		
		System.out.println("참조형 변수 ref_ob2의 변수 x값은 " + ref_ob2.x);
		System.out.println("참조형 변수 ref_ob2의 변수 y값은 " + ref_ob2.y);
		
		/*
		 * 세 번째 참조형 변수를 선언 + 메모리 만들기
		 */
		
		//	Point ref_ob3 = new Point(10,20); // 지금은 기본 생성자만 있기 때문에 오류
		
		
		
		
	}

}