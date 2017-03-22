package march21;

/*
 * 다중 상속 예제 만들기
 * 
 * 1. 부모 클래스
 * 2. 부모 인터페이스
 * 3. 상속 방법을 사용해서 위에서 만든 부모 클래스와 인터페이스를 상속
 * 
 * 4. 구조
 * 
 * class 새로 만드는 자식 클래스 이름 extends 명령어 부모 클래스 이름
 * 				implements 부모 인터페이스 이름 {
 * 
 *  }
 * 
 */

// 부모 클래스 만들기
class MyParentClass1 {
	// 부모 클래스에서 메소드 만들기
	public void method() {
		System.out.println("method() in MyParentClass1");
	}
	// 새로운 메소드 추가하기 -> 연결되어 있는 자식 클래스에서도 상속
	public void method2() {
		System.out.println("method2() in MyParentClass1");
	}
	
}

// 부모 인터페이스 만들기

interface MyParentInterface1 {
	
	// 상속받은 자식 클래스에서 무조건 재정의되어야 하는 메소드
	// 재정의 -> Overriding -> 인터페이스에 있는 메소드의 머리 부분과
	// 몸체 부분을 자식 클래스에서 작성하는 것
	// 인터페이스에 있는 메소드의 머리부분과 동일하게 작성
	public void pub_interface() ;
	
}

// 새로운 자식 클래스 만들기 : 위에서 만든 클래스와 인터페이스를 재사용(상속)
class MyFirstChildClass extends MyParentClass1 implements MyParentInterface1 {
	
	// MyParentInterface1 인터페이스에서 새로 추가한 메소드의 머리 부분과
	// 몸체 부분을 작성
	@Override // 어노테이션(annotation) : 안써도 되지만 컴파일러에게 오버라이드 했다고 알려주는 거 
	public void pub_interface() {
		System.out.println("자식 클래스에서 재정의한 pub_interface()");
	}
	
	// 상속 방법을 사용했기 때문에 부모 클래스에 있던 method() 메소드가 복사됨
	// method() 메소드를 바로 사용 가능
	public void use_method() {
		// 상속 받은 method() 메소드를 이름으로 바로 사용 가능
		method(); // this.method(); // this : new 연산자에 의해서 메모리에 생성된
		// MyFirstChildClass 클래스의 주소 저장 변수 
		System.out.println("use_method() in MyFirstChildClass");
	}
	
	// 새로운 메소드 method3() 만들기
	public void method3() {
		System.out.println("method3() in MyFirstChildClass");
	}
	
}

public class TestInhClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 프로그램이 시작되는 클래스에 있는 main() 메소드
		System.out.println("프로그램이 시작되었습니다.");
		
		// 명령문 추가
		/*
		 * 1. 부모 클래스 이름을 사용
		 * 
		 * 2. 자식 클래스 이름을 사용
		 * 
		 * 3. 부모 인터페이스 이름을 사용
		 * 
		 */
		// 부모 클래스 이름을 사용해서 변수를 선언(메모리의 주소를 저장하는
		// 참조형 변수
		MyParentClass1 ref_parent_ob = null;
		
		// 2. 자식 클래스 이름을 사용해서 참조형 변수 선언
		MyFirstChildClass ref_child_ob = null;
		
		// 3. 부모 인터페이스 이름을 사용해서 참조형 변수 선언
		MyParentInterface1 ref_ob = null;
		
		// = 기호를 중심으로 해서 왼쪽 부분은 클래스 이름 + 인터페이스 이름 
		
		// 4. 부모 클래스를 메모리에 생성(new 클래스이름() )
		
		// 5. 메모리에 생성된 부모 클래스(객체)
		// -> 참조형 변수 이름 = new 부모클래스이름();
		// -> new 부모클래스이름(); // 일회용 객체 또는 임시 객체 또는 미아 객체 
		
		/*
		 * 객체를 한번만 사용하는 경우
		 * -> AWT에서 사용자 윈도우 종료 이벤트 처리 명령문 작성
		 * -> new WindowAdapter()
		 * 
		 * -> new WindowAdaper()
		 */
		
		ref_parent_ob = new MyParentClass1();
		
		
		// 점(.) 연산자를 사용해서 메모리에 있는 method() 메소드를 실행
		
		ref_parent_ob.method();
		
		// 자식 클래스를 메모리에 생성(new 자식클래스이름()) 하고
		// 참조형 변수에 저장하기
		ref_child_ob = new MyFirstChildClass();
		
		// 메모리에는 method() 메소드. use_method() 메소드가 만들어져 있는 상태
		// 둘중에 사용하고 싶은 메소드를 결정
		ref_child_ob.use_method();
		
		// 상속 받은 method()를 실행
		ref_child_ob.method();
		
		// 부모 클래스에서 방금 추가한 method2()를 실행
		ref_child_ob.method2(); // 상속은 눈에 보이지 않습니다.
		
		ref_parent_ob.method2();
		
		// 새로 재정의한 pub_interface() 메소드 실행
		ref_child_ob.pub_interface();
	

		System.out.println("프로그램이 종료됩니다.");

	}

}
