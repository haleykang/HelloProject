package march21;


/*
 * 다형성 기초 예제
 */
class MyParentClass {
	public void method() {
		System.out.println("method() in MyParentClass");
	}
	
}

class MyChildClass extends MyParentClass {
	// 상속 받은 method() 함수를 꼭 재정의 해야함
	@Override
	public void method() {
		System.out.println("method() in MyChildClass");
		System.out.println("재정의된 메소드");
	}
	
}

class MyChild2Class extends MyParentClass {
	// 상속 받은 method() 함수를 재정의 하기
	@Override
	public void method() {
		System.out.println("method() in MyChild2Class");
		System.out.println("재정의된 메소드");
	}
	
}


public class TestPolyClass {
	
	/*
	 * 위에서 만든 클래스 별로 메소드를 만들기
	 * 
	 * 1. 부모 클래스의 주소만을 받을 수 있는 새로운 메소드 만들기
	 * 
	 */
	public void method1(MyParentClass red_parent_ob) {
		System.out.println("method1() 함수가 실행 되었습니다.");
		System.out.println("main() 함수에서 부모 클래스의 주소를 받음");
	
	}
	
	/*
	 * 2. 자식 클래스인 MyChildClass의 주소만을 받을 수 있는 새로운 메소드
	 */
	public void method2(MyChildClass ref_child_ob) {
		System.out.println("method2() 함수가 실행 되었습니다.");
		System.out.println("main() 함수에서 MyChildClass의 주소를 받음");
		
	}
	
	/*
	 * 3. 자식 클래스인 MyChild2Class의 주소만을 받을 수 있는 새로운 메소드
	 */
	public void method3(MyChild2Class ref_child2_ob) {
		System.out.println("method3() 함수가 실행 되었습니다.");
		System.out.println("main() 함수에서 MyChild2Class의 주소를 받음");
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyChildClass ref_ob1 = new MyChildClass();
		MyChild2Class ref_ob2 = new MyChild2Class();
		
		ref_ob1.method();
		ref_ob2.method();
		
		
		MyParentClass ref_ob = new MyParentClass();
		ref_ob.method();
		
		/*
		 * MyChildClass 클래스(자식 클래스)의 주소를 가져 와서 변수에 저장
		 */
		ref_ob = new MyChildClass();
		
		/*
		 * ref_ob = 현재 메모리에 생성된 자식 클래스의 시작 주소;
		 */
		ref_ob.method(); // MyChildClass
		
		ref_ob = new MyChild2Class();
		/*
		 * MyChild2Class 클래스에서 재정의한 method() 메소드를 실행 
		 */
		ref_ob.method(); // MyChild2Class
		
		

	}

}
