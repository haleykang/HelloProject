package march27;


/*
 * 배열과 컬렉션에 있는 리스트 사용하고 비교하는 예제 작성
 */
// 컬렉션에 있는 여러 가지 자료 구조 클래스들을 사용하기 위한 import 명령문 작성
import java.util.*;

/*
 * 모든 데이터들을 보관할 수 있는 새로운 클래스 만들기
 * 
 * 무조건 정수만을 저장할 수 있는 변수 선언 : int 변수 이름 = 0;
 * 무조건 실수만을 저장할 수 있는 변수 선언 : double 변수 이름 = 0.0; 또는 float 변수 이름 = 0.0f;
 * 무조건 문자열만 저장할 수 있는 변수 선언 : String 변수 이름 = "";
 * 무조건 하나의 문자만 저장할 수 있는 변수 선언 : char 변수 이름 = ' ';
 * 
 */
class MyAllDataClass {
	
	int idata = 0;
	float fdata = 0.0f;
	double ddata = 0.0;
	String sdata = "";
	char cdata = ' ';
	// 새로운 변수 추가 : long 자료형 사용
	long ldata = 0L;
	
	// 다형성 개념을 사용해서 한꺼번에 모든 데이터들을 main() 함수로 부터 받아와서
	// 위에서 선언한 모든 변수에 일괄적으로 초기화해주는 add() 함수
	public void add(int ivalue, float fvalue, double dvalue, String svalue, char cvalue, long lvalue) {
		
		/*
		 * 매개 변수의 작성 순서는 개발자가 정함 
		 */
		idata = ivalue;
		fdata = fvalue;
		ddata = dvalue;
		sdata = svalue;
		cdata = cvalue;
		ldata = lvalue;
		System.out.println("총 6개의 변수들을 모든 다른 값으로 바꿈 ");
		
		/*
		 * 만들어 놓은 add() 함수들을 재사용하기
		 * 
		 * -> add(int value) {}  -> add(ivalue)
		 * -> add(float value) -> add(fvalue) ....
		 */
		// 이미 만들어 놓은 add(int value) 함수가 갖고 있는 명령문을 재사용하는 명령문
		add(ivalue);
		add(fvalue);
		add(dvalue);
		add(svalue);
		add(cvalue);
		add(lvalue);
		
	
		
		
	}
	
	// 다형성을 적용해 새로운 조합의 add 함수 만들기 
	
public void add(String svalue, char cvalue, int ivalue, float fvalue, double dvalue, long lvalue) {
		

		add(ivalue);
		add(fvalue);
		add(dvalue);
		add(svalue);
		add(cvalue);
		add(lvalue);
		
	
		
		
	}
	
	
	
	// 위에서 선언한 모든 변수에 독립적으로 사용되는 add() 함수 만들기
	public void add(int value) {
		System.out.println("정수만 저장하는 함수");
		idata = value;
		System.out.println("변수에 저장된 정수 " + idata);
	}
	public void add(String value) {
		System.out.println("문자열만 저장하는 함수");
		sdata = value;
		System.out.println("변수에 저장된 문자열 " + sdata);
	}
	public void add(double value) {
		System.out.println("실수만 저장하는 함수");
		ddata = value;
		System.out.println("변수에 저장된 실수 " + ddata);
	}
	public void add(float value) {
		System.out.println("float 실수 저장 함수");
		fdata = value;
		System.out.println("변수에 저장된 실수f는 " + fdata);
	}
	public void add(char value) {
		cdata = value;
		System.out.println("변수에 저장된 문자 " + cdata);
		
	}
	public void add(long value) {
		System.out.println("Long 정수 저장");
		ldata = value;
		System.out.println("변수에 저장된 long 데이터 " + ldata);
	}
	
	
	
}









/*
 * Vector 클래스를 흉내낸 새로운 클래스 만드길
 * -> 일반적인 방법을 사용해서 배열을 선언한고 사용
 * -> 배열의 자료형을 미리 지정하는 방법을 사용 : 
 * 			자료형 + 배열이름 [];
 * 		double darray [] ;
 */

class MyDoubleVector {
	
	
	
	
	// 실수 데이터만 저장할 수 있는 배열 선언
	double [] darray;
	
	// Object [] object_array ; 

	
	// 배열의 용량(크기)을 보관할 수 있는 변수 선언
	int capacity_darray = 0;
	
	// 배열에 저장되어있는 데이터 갯수를 보관하는 변수 선언
	int count_darray = 0;
	
	// 기본 생성ㅅ자 만들기 : 위에서 만든 배열의 크기를 10으로 무조전 지정
	public MyDoubleVector() {
		
		System.out.println("기본 생성자 실행");
		this.darray = new double [10];
		this.capacity_darray = this.darray.length;
		System.out.println("새로운 실수형 배열이 생성되었습니다.");
		System.out.println("배열의 크기는 " + this.capacity_darray);
		
	}
	
	// main() 함수에서 배열 darray의 크기를 받아오는 생성자
	public MyDoubleVector(int capacity_value) {
		System.out.println("배열의 용량(크기)를 받는 생성자 실행");
		if(capacity_value > 0) {
		System.out.println("새로 만들 배열의 크기는 " + capacity_value);
			this.darray = new double [capacity_value];
			this.capacity_darray = this.darray.length;
		}
		else {
			System.out.println("배열의 용량(크기) 오류");
		}
		
	}
	
	// add() 함수를 만들어서 다른 클래스로부터 하나의 실수 데이터를 받은 다음에
	// 배열 darray에 저장하기
	public void add(double value) {
	System.out.println("main() 함수에서 받은 실수는 " + value);
		
		/*
		 * 현재 배열의 갯수는 0 개 -> 변수 count_darray의 값을 읽어서 알 수 있음
		 */
		System.out.println("현재 배열에 저장된 데이터 갯수는 " + count_darray);
		
		/*
		 * 새로운 데이터의 저장 위치는 변수 count_darray가 갖고 있는 값을 사용
		 */
		System.out.println("새로운 데이터인 " + value + "의 배열 저장 위치는 " + count_darray);
		
		if(count_darray >=0 && count_darray < this.darray.length) {
			this.darray[count_darray] = value;
		}
		else {
			System.out.println("변수 count_darray 값 오류");
		}
		/*
		 * 배열 darray에서 특정 위치에 저장된 하나의 실수를 가져오는 함수 만들기
		 * 
		 * 위치 값은 main() 함수로부터 받아오기 -> 매개 변수가 필요 -> int index
		 * 이름은 get()
		 * get() 함수의 반환형은 실수니까 double 자료형
		 */
	}
	
	public double get(int index) {
	System.out.println("배열 darray에서 특정 위치 " + index + "에 있는 실수 반환");
		
		if(index >= 0 && index < this.darray.length) { 
			System.out.println("배열에서 하나의 실수 가져오기");
			double temp = this.darray[index];
			return temp;
			
		}
		else {
			System.out.println("배열 위치 오류");
			System.out.println("배열에서 실수를 가져올 수 없습니다.");
			return 0.0;
			
			
		}
		
	}
	
	
}

public class TestArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// MyAllDataClass 클래스를 사용해서 한꺼번에 6개의 데이터를 
		// MyAllDataClass에 있는 add() 함수에 전달 하기
		
		MyAllDataClass ref_all_data2 = new MyAllDataClass();
		ref_all_data2.add(100,3.14f, 3.14,"강진주", 'a', 2020L);
		

		
		System.out.println("********************************************");
		
		
		// 두번째 조함
		
		ref_all_data2.add("문자열", 'a', 10, 4.2f, 3.14,10L);
		
		
		System.out.println("********************************************");
		
		MyAllDataClass ref_all_data = new MyAllDataClass();
		
		// 하나의 정수 100을 저장하기 위한 명령문 
		ref_all_data.add(100); // add(int value) {} 함수가 실행
		
		ref_all_data.add('a');
		
		ref_all_data.add("문자열");
		
		ref_all_data.add(4.2);
		ref_all_data.add(3.14f);
		

		// add(long value) -> add(정수 + L(알파벳 대문자 엘) 또는 정수 + l (소문자 엘))
		
		ref_all_data.add(20202L);
		
		
		
		System.out.println("********************************************");
		
		
		// 새로 만든 MyDoubleVector 사용
		MyDoubleVector ref_my_double_vector = new MyDoubleVector();
		// 최대 10개의 실수 데이터 저장
		
		MyDoubleVector ref_my_double_vector2 = new MyDoubleVector(20);
		// 최대 20개의 실수 데이터를 저장할 수 있는 두번째 생성자
		
		// add() 함수를 사용해서 새로운 실수를 배열에 저장
		ref_my_double_vector.add(4.2);		
		
		// get(0) 함수를 사용해서 배열에 저장된 실수 중 첫번쨰 위치의 실수 읽어오기
		double first_double = ref_my_double_vector.get(0);
		System.out.println("MyDoubleVector의 첫번째 배열의 데이터 " + first_double);
		
		
		
		// 3개의 실수 데이터를 ref_my_double_vector2에 저장
		ref_my_double_vector2.add(4.2);
		ref_my_double_vector2.add(9.6);
		ref_my_double_vector2.add(11.07);
		// ref_my_double_vector2.add(12.16);
		

		System.out.println("***********************************************************");
		
		first_double = ref_my_double_vector2.get(0);
		System.out.println("ref_my_double_vector2의 첫번째 실수 " + first_double);
		

		System.out.println("***********************************************************");
		
		double sec_double = ref_my_double_vector2.get(1);
		System.out.println("ref_my_double_vector2의 두번째 실수 " + sec_double);

		System.out.println("***********************************************************");
		
		double third_double = ref_my_double_vector2.get(2);
		System.out.println("ref_my_double_vector2의 세번째 실수 " + third_double);
		
		
		System.out.println("***********************************************************");
		
		
		// 1차원 배열 만들기 : 최대 10개의 정수를 보관할 수 있는 배열 선언과 메모리 생성
		int [] iarray = new int [ 10 ];
		// 데이터의 총 갯수가 10개를 초과하면 데이터를 보관할 수 없는 배열
		
		// for 반복문을 사용해서 10개의 정수를 만든 다음에 위에서 만든 iarray의
		// 각각의 위치 번호
		for(int i = 0 ; i < iarray.length; ++i ) {
			System.out.println("배열 iarray의 " + i + " 위치에 저장될 정수 만들기");
			
			// 덧셈 계산식을 만들어서 정수 만들기 : 현수 변수 i의 값 + 1
			iarray[i] = i + 1;
			
			System.out.println("배열 iarray [" + i + "]의 값은 " + iarray[i]);
			
		}
		
	
		/*
		 * 자바 컬렉션에서 제공해주는 ArrayList 클래스를 사용해서 10개의 정수 데이터를
		 * 메모리에 저장 -> ArrayList 클래스는 안에서 배열을 사용 
		 */
		ArrayList<Integer> ref_array_list = new ArrayList<Integer>();
		/*
		 * < > : 안에 저장할 데이터릐 자료형을 클래스 이름으로 작성
		 * 예)<Integer> : 정수를 저장할 수 있는 자료형
		 * 
		 */
		
		// ArrayList 클래스가 갖고 있는 add() 함수를 사용해서 메모리에 새로운 정수 100을 저장
		// add(새로운 데이터) -> add(100) -> add() 함수는 100을 ArrayList 클래스가 내부에 갖ㄱ ㅗ 있는
		 // 정수형 배열의 마지막에 추가
		ref_array_list.add(100);
		
		// ArrayList의 size() 함수 사용해 현재 메모리에 저장되어있는 데이터 갯수 확인
		int size_ref_array_list = ref_array_list.size();
		
		// 크기 출력
		System.out.println("ArrayList가 지금 갖고 있는 데이터의 갯수는 " + size_ref_array_list);
		
		// ArrayList의 용량 확인
		// ArrayList의 용량 (capacity) : 해당 클래스에 저장할수 있는 데이터의 최대 크기 
	// 	System.out.println("ArrayList의 용량은 " + ref_array_list);
		// ArrayList 클래스 내부에서 용량은 private 멤버 상수로 정의되어있어서 
		// 다른 클래스에서는 사용할 수 없음(capacity) 안됨
		
		// Vector 클래스를 사용하면 현재 Vector 클래스에서 갖고 있는 배열의 크기(배열에
		// 저장할 수 있는 데이터의 최대 갯수)를 가져올 수 있음
		//Vector<Vector 클래스 내부에 갖고 있는 배열에 저장할 데이터 자료형 작성 : 클래스 이름으로 >
		Vector<Integer> ref_vector = new Vector<Integer>();
		
		// add() 함수를 사용해서  새로만든 Vector에 100 저장
		ref_vector.add(100);
		
		// size() 함수를 사용해서 크기 출력
		
		int size = ref_vector.size();
		System.out.println("Vector가 갖고 있는 데이터 갯 수" + size);
		
		// Vector 배열의 용량(capacity)
		int capacity = ref_vector.capacity();
		System.out.println("Vector의 배열의 용량 " + capacity);
		
		//  문자열을 보관할 수 있는 Vector<String> 클래스 선언과 메모리 생성
		Vector<String> ref_string_vector = new Vector<String>();
	
		// 문자열 저장
		ref_string_vector.add("강진주");
		
		// size() 함수 사용
		int size_s = ref_string_vector.size();
		System.out.println("Vector<String>이 갖고 있는 이름 갯수 " + size_s);
		
		// capacity()
		int capacity_s = ref_string_vector.capacity();
		System.out.println("Vector<String>의 용량" + capacity_s);
		
		/*
		 * Vector<Vector 클래스에 저장할 데이터의 클래스 이름 작성 >
		 * 
		 * -> 정수를 저장하려면 Vector<Integer> - Integer는 java.lang 패키지에 있는 클래스 이름
		 * -> 문자열 Vector<String>
		 * -> 실수 Vector<Double> 또는 Vector<Float>
		 * -> 문자 Vector<Char>
		 * 
		 * 개발자가 새로 만든 클래스 이름을 작성할 수도 있음
		 * Vector<개발자가 새로 만든 클래스 이름>
		 */
		// 실수형 Vector
		Vector<Double> ref_double = null;
		
		ref_double = new Vector<Double>();
		
		// add() 함수 사용해 실수 저장
		ref_double.add(4.2);
		ref_double.add(9.6);
		ref_double.add(11.07);
		ref_double.add(12.16);
		
		ref_double.add(0.1);
		ref_double.add(0.2);
		ref_double.add(0.3);
		ref_double.add(0.4);
		ref_double.add(0.5);
		ref_double.add(0.6);
		ref_double.add(0.7);
		
		
		// size() 사용
		int size_d = ref_double.size();
		System.out.println("Vector<Double>의 크기 " + size_d);
		
		// capacity() 사용
		int capacity_d = ref_double.capacity();
		System.out.println("Vector<Double>의 크기 " + capacity_d);
		
		/*
		 * capacity = 10으로 고정
		 * 데이터의 갯수가 11개가 되면 capacity = 20으로 증가
		 * 
		 * -> 기존에 저장된 데이터는 보존
		 * -> Vector<Integer> 클래스에 저장된 데이터를 가져오는 방법 : get(배열의 위치번호 작성)
		 * 
		 * get (0); -> 첫번째 정수값 가져옴
		 */
		
		double double_value = ref_double.get(0);
		System.out.println("첫번째 실수는 " + double_value); // Vector<Double>의 배열 첫번째 위치에 저장된 데이터 가져오기
		
		/*
		 * get() 함수는 Vector<Double> 클래스가 갖고 있는 내부 실수 배열에서 하나의 실수 데이터를 0 위치에서 가져옴
		 * 
		 * 주의
		 * -> 위치 번호의 범위는 0 ~ size -1 까지만 사용
		 * get(size () ) 예외 상황 발생 
		 */
		for(int i = 0; i < size_d; ++i) {
			
			double_value = ref_double.get(i);
			System.out.println(i + " 위치에 있는 실수는 " + double_value);
			
		}
		
		// Vector<Double> 클래스를 흉내내는 MyVector 클래스 만들기 
		/*
		 * class MyVector {
		 * 
		 * Double [] 배열이름 = new double [ 10 ] ;
		 * int capacity = 배열이름.length;
		 * int count = 0 ;
		 * 
		 *  /// 위에서 만든 배열에 새로운 실수를 하나만 저장해주는 add() 함수 만들기
		 *  public void add(double value) {
		 *  배열이름[위치 번호 ] = value;
		 *  }
		 *  
		 *  // 현재 배열에 저장되어 있는 여러 개의 실수 중에서 특정 위치에 저장된 실수를 반환하는
		 *  // get() 함수 만들기
		 *  
		 *  public double get(int index) {
		 *  	// 변수 index에 저장된 배열의 위치 번호를 검사 : 변수 count 값 만큼의
		 *  	// 위치 번호를 검사 -> 0 ~ (count -1) 
		 * 		if (index >= 0 && index(count - 1)) {
		 * 
		 * 		return 배열이름[index]; // 변수 index 위치에 저장된 하나의 실수를 반환
		 * 
		 * 		} else {
		 * 		System.out.println("배열의 위치 번호 오류");
		 * 		return 0.0;
		 * 		// 또는 throw 명령어를 사용해서 강제로 새로운 예외상황을 받는 객체 만들기 
		 * 		// throw new 예외상황을 받는 클래스이름 () ;
		 * 		// throw new Exception("배열의 위치 번호 범위 오류");
		 * 	
		 *  	
		 *  
		 *  }
		 *  
		 * 
		 *  클래스이름<Double> : 제네릭스(Generics) : 클래스 일반화 : C++ 언어에서는 템플릿
		 *   -> 클래스에서 사용할 자료형을 다른 클래스에서 나중에 정해주는 방법
		 *   -> new 연산자를 사용해서 메모리에 새로운 객체를 만드는 시점에 클래스에 자료형을 전달
		 *   	-> new 클래스이름< 클래스에 전달할 자료형 이름을 클래스 이름으로 작성 > ();
		 *   	-> new MyClass1<Integer>() : // MyClass1  클래스에 Integer 클래스 이름을 전달
		 *   		-> 동적 자료형 결정 방식
		 *   class MyClass {
		 *   Integer 배열이름 [] = new Integer [10]; 
		 *   } // -> 원래 우리가 하던 방식
		 *   
		 *   class MyClass<E> {
		 *    // E : new 클래스이름<Integer>() 에서 < Integer> 전체를 받는 이름
		 *    // E아니라 다른 이름 써도 됨
		 *    }
		 *    
		 *    class MyClass<A> { // new MyClass1<Integer>() 명령어에서 <Integer> 전체를 <A>가 받음 
		 *    
		 *    A -> Integer -> 메모리에 정수형 배열을 생성
		 *    A -> Double -> 메모리에 실수형 배열을 생성
		 *    A -> String -> 메모리에 문자열 배열을 생성
		 *    A -> Float -> 메모리에 실수형 배열을 생성
		 *   }
		 *   
		 *  변수의 타입(자료형)은 선언하는 시점에 정함
		 *  -> 변수의 자료형 + 변수이름 ;
		 *  -> Integer int_v1;
		 *  
		 *  -> <> 를 사용하는 방식의 경우 
		 *  new 클래스이름<Integer> () -> 힙 메모리에 새로운 객체가 만들어지는 시점에 클래스에서 사용할 
		 *  배열의 자료형을 Integer로 결정 가능 
		 *  
		 *  A 배열이름 [] ;
		 *  
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
	}

}
