package march27;

/*
 * 컬렉션의 이해
 */
// 컬렉션에 있는 모든 클래스와 인터페이스들을 사용하기 위한 명령문
import java.util.*;


/*
 * 모든 데이터를 저장할 수 있는 클래스 만들기
 * 
 */
class MyObjectClass extends Object {
	
	// 데이터를 저장하는 변수의 자료형은 부모 클래스로
	Object ref_parent_ob = null;
	/*
	 * null : 아직 메모리를 만들지 않은 상태
	 * -> 생성자 함수 또는 초기화 블럭에서 new 클래스이름() 명령어를 사용해서
	 * 		메모리를 만든 다음에 사용 가능 
	 */
	// 기본 생성자 만들기
	public MyObjectClass() {
		ref_parent_ob = new Object();
		
		
	}
	// main() 함수에서 Integer 클래스를 받는 생성자 만들기
	public MyObjectClass(Integer ref_int_ob) {
		
		ref_parent_ob = ref_int_ob;
		/*
		 * 내부적으로는 형변환 연산이 일어남
		 * ref_parent_ob = (Object)ref_int_object;
		 */
		System.out.println("MyObjectClass(Integer ref_int_ob) 생성자 함수 실행");
	}
	
	// main() 함수에서 하나의 정수를 받는 생성자 만들기
	public MyObjectClass(int value) {
		System.out.println("MyObjectClass(int value) 생성자 함수 실행");
		ref_parent_ob = new Integer(value);
		/*
		 * public Integer(int value) {
		 *  Integer 클래스가 갖고 있는 정수형 변수 이름 = value;
		 * }
		 * 생성자를 실행하는 명령문 
		 */
		
	}
	
	// main() 함수에서 하나의 문자열을 받는 생성자 함수 만들디
	// -> public 클래스이름(String 변수이름) { }
	public MyObjectClass(String value) {
		System.out.println("main() 함수로부터 하나의 문자열만 받는 생성자 함수");
		ref_parent_ob = value;
		// 내부적으로 형번환 연산이 일어남
		// ref_parent_ob = (Object)value;
	}
	
	/*
	 * main() 함수에서 하나의 실수를 받는 새로운 생성자 함수 만들기
	 * -> 실수 : float 자료형 실수 또는 double 자료형 실수 또는 Wrapper 클래스
	 * -> Float 또는 Double Wrapper
	 */
	public MyObjectClass(float value) {
		System.out.println("main() 함수로부터 하나의 float 자료형 실수를 받는 생성자 함수");
		ref_parent_ob = value;
	}
	public MyObjectClass(double value) {
		System.out.println("main() 함수로부터 하나의 double 자료형 실수를 받는 생성자 함수");
		ref_parent_ob = value;
	}
	
	/*
	 * main() 함수에서 Float Wrapper 클래스 자료형의 객체 주소를 받는 새로운 생성자 함수 
	 */
	
	public MyObjectClass(Float value) {
		System.out.println("main() 함수로부터 하나의 Float Wrapper 클래스 자료형의 객체");
		System.out.println("주소를 받는 생성자 함수");
		ref_parent_ob = value;
	}
	
	public MyObjectClass(Double value) {
		System.out.println("Double Wrapper 클래스 생성자 함수");
		ref_parent_ob = value;
	}
	
	public MyObjectClass(char value) {
		System.out.println("main() 함수로부터 하나의 char 문자를 받는 생성자 함수");
		ref_parent_ob = value;
	}
	
}




public class TestCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// 방금 만든 MyObjectClass 클래스를 사용하는 명령문 잗성
		
		// 기본 생성자를 실행하는 명령문
		MyObjectClass ref_ob = new MyObjectClass();
		
		// 두번째 생성자를 실행하는 명령문
		MyObjectClass ref_ob2 = new MyObjectClass(100);
		
		// 세번째 생성자를 실행하는 명령문 
		MyObjectClass ref_ob3 = new MyObjectClass(new Integer(100));
		
		MyObjectClass ref_ob4 = new MyObjectClass("100");
		
		MyObjectClass ref_ob5 = new MyObjectClass(3.14f);
		
		MyObjectClass ref_ob6 = new MyObjectClass(4.14);
		
		// Float Wrapper 생성자 사용
		MyObjectClass ref_ob7 = new MyObjectClass(new Float(6.14f));
		
		// Double Wrapper 생성자 사용
		MyObjectClass ref_ob8 = new MyObjectClass(new Double(7.14));
		
		// 문자열 정수인 "100"을 MyObjectClass 클래스에 전달하기
		// new MyObjectClass("100") -> 하나의 문자열을 받는 생성자 함수가 있어야 가능!
		// public MyObjectClass(String value) { } 
		
		System.out.println("*********************************************");
		
		// 정수 100을 Integer 클래스에 저장하기 위한 명령문 작성
		// -> 정수 100을 외부 클래스로부터 보호
		// -> 정수 100을 객체화
		java.lang.Integer ref_int_ob = new java.lang.Integer(100);
		
		// 문자열 100을 Integer클래스에 저장
		java.lang.Integer ref_int_ob2 = new java.lang.Integer("100");
		
		/*
		 * 정수 + 문자열("") -> 정수 문자열 
		 * 실수 + 문자열("") -> 실수 문자열 
		 */
		
		String str_value = 100 + "";
		java.lang.Integer ref_int_ob3 = new java.lang.Integer(str_value);
		
		String str_value2 = 3.14 + "";
		Double ref_double_ob = new Double(str_value2);
		System.out.println("ref_int_ob 참조 변수로 가져올 수 있는 정수는 " + ref_int_ob.intValue());
		System.out.println("ref_int_ob2 참조 변수로 가져올 수 있는 정수는 " + ref_int_ob2.intValue());
		
		// toString() 함수를 사용하면 Integer 클래스가 보호하고 있는 정수값을 문자열로 반환
		
		String str_int_value1 = ref_int_ob.toString();
		System.out.println("ref_int_ob 참조 변수로 가져온 정수 문자열은 " + str_int_value1);
	
		// Double 클래스에 보관중인 실수 값을 읽어오는 함수 : doubleValue()
		// double 실수 값을 보관할 변수 이름 = 참조변수이름.doubleValue();
		double dvalue = ref_double_ob.doubleValue();
		
		System.out.println("ref_double_ob 참조 변수가 갖고 있는 실수 값은 " + dvalue);
		
		// Double 클래스에 보관중인 실수값을 문자열로 읽어오는 함수 : toString()
		String str_dvalue = ref_double_ob.toString();
		System.out.println("ref_double_ob 참조 변수로 가져온 문자열 실수 값은 " + str_dvalue);

	}

}
