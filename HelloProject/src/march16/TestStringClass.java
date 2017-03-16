package march16;


/*
 * 여러 개의 문자열 데이터들을 배열에 저장하고 사용하는 예제 작성
 */

public class TestStringClass {
	
	/*
	 * 여러 개의 문자열을 저장 할 수 있는 문자열 배열 선언
	 */
	String [] str_array1 = null;
	/*
	 * 위에서 선언한 배열을 사용하는 생성자 함수 만들기
	 */
	// 기본 생성자 함수 -> 컴파일러에 의해서 자동으로 만들어지는 함수
	public TestStringClass() {
		
		this(5);  // 생성자 함수 중 정수를 입력받는 함수가 실행, 정수 값은 5가 됨
		/*
		 * this + 점(.) + 변수 또는 배열 또는 함수이름
		 */
		/*
		 * this + 소괄호 연산자 : 생성자 함수를 실행하는 명령문 
		 * this(); // 자신의 생성자 함수를 실행 -> 예외 상황이 발행 
		 * -> 자신의 생성자 함수에서 다시 자신을 호출 (재귀 호출 방식 recursive call)
		 * 		-> if문을 사용해서 종료(자신의 함수를 탈출하기) 부분을 작성해야 함
		 * 			-> if (조건) return;
		 * 
		 * 예) int add(int a, int b) {
		 * 		add(10,20) ; // 도돌이표 만들기 -> 빠져나오지 못하는 구조
		 * 		if(조건) return;
		 * }
		 */
		
	}
	
	// 개발자가 새로 만든 생성자 함수
	public TestStringClass(int size) {
		System.out.println("this(5) 명령문에 의해서도 실행되는 생성자 함수");
		System.out.println("기본 생성자에서 호출하였습니다.");
		System.out.println("변수 size가 받은 값은 " + size ); // this(5) -> 5
		// main() 함수에서 new TestStringClass(10) -> 변수 size는 10을 받음
		// 위에서 선언한 배열을 메모리에 만들기 -> 배열의 크기는 변수 size가 받은 값으로 사용하기
		this.str_array1 = new String[size];
		System.out.println("자동으로 만들어지는 변수 length 값을 출력");
		System.out.println("배열 str_array1의 크기는 " + this.str_array1.length);
		
		// 여기서는 아직 각각의 배열에 특정 값이 저장되어 있지 않음
		// str_array1[0] = null;
		// str_array1[1] = null;
		// str_array1[2] = null;
	
		
		for(int i = 0; i < this.str_array1.length; ++i) {
			
			this.str_array1[i] = ""+(i+1); // 각각 배열 위치에 1->2->3->4->5를 저장
			// str_array1[0] = "0 + 1"; -> 1
			// str_array1[1] = "1 + 1"; -> 2
			// str_array1[2] = "2 + 1"; -> 3
			
			System.out.println("배열 str_array1["+i+"] 위치에 저장된 문자열은" +
					this.str_array1[i]);
			
		}
			
	}
	public TestStringClass(String [] args) {
		
		
	}
	
	/*
	 * 2개의 이름을 비교하는 함수
	 * 
	 * 같으면 참을 반환
	 * 다르면 거짓을 반환 -> 반환형이 논리 자료형
	 * 
	 */
	
	public static boolean compare(String first_name, String second_name) {
		// 2개의 이름 비교 결과를 보관할 변수 선언
		boolean result;
		
		if(first_name.equals(second_name) == true) {
		 result = true;
		} else {
		result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result2 = compare("강진주", "강진주");
		
		String test_name = " 강진주 ";
		
		System.out.println(test_name.trim());
		
	
		if(result2 == true) {
			System.out.println("강진주 이름과 강진주 이름은 같습니다.");
		} else {
			System.out.println("강진주 이름과 강진주 이름은 다릅니다.");
		}
		
		result2 = compare("강진주", "이진주");
		if(result2 == true) {
			System.out.println("강진주 이름과 이진주 이름은 같습니다.");
		} else {
			System.out.println("강진주 이름과 이진주 이름은 다릅니다.");
		}
		
		
		// "김길동"과 "다길동"이 이름이 같은지를 equals() 함수를 사용해서 비교
		boolean result = "김길동".equals("다길동");
		
		if(result == true) {
			System.out.println("김길동과 다길동은 같은 이름");
		} else {
			System.out.println("김길동과 다길동은 다른 이름");
		}
		
		String first_name = "김길동";
		String sec_name = "강길동";
		
		result = first_name.equals(sec_name);
		
		if(result == true) {
			System.out.println(first_name + " 이름과 " + sec_name + " 이름은 같은 이름");
		} else {
			System.out.println(first_name + " 이름과 " + sec_name + " 이름은 다른 이름");
			
		}
		// 방금 클래스에서 만든 기본 생성자를 실행하는 명령문 작성
		TestStringClass ref_object1 = new TestStringClass();
		
		System.out.println("******************************************");
		
		// 방금 클래스에서 만든 배열의 크기를 받는 생성자를 실행하는 명령문
		TestStringClass ref_object2 = new TestStringClass(3);
		
		System.out.println("******************************************");
		 
		// 5개의 문자열을 보관할 수 있는 String 배열을 클래스에 있는
		// 전역 배열에 만들고 문자열 "1", "2", "3", "4", "5"를 각가의 배열에 저장
		TestStringClass ref_object3 = new TestStringClass(5);
		
		System.out.println("******************************************");
		
	
		// 하나의 문자열만을 보관할 수 있는 변수 선언과 초기화
		String name = "강진주";
		
		// 여러 개의 문자열(이름)들을 보관하는 변수 선언과 초기화
		String name2 = "강진주 김진주 홍진주";
		// 띄어쓰기 문자를 사용해서 여러 개의 이름들을 분리(떨어뜨림)
		
		// 첫번째 변수인 name을 사용해서 메모리에 저장되어 있는 이름을 읽어오기
		// 모니터 화면에 이름을 출력하기 위해 출력 함수인 println()을 사용
		System.out.println("문자열 변수 name이 갖고 있는 이름은 " + name);
		
		// 변수 name2를 사용하면 3명 사람의 이름 전체를 한꺼번에 읽어와서
		// 화면에 출력
		System.out.println("문자열 변수 name2가 갖고 있는 이름들은 " + name2);
		
		/*
		 *  String 클래스가 갖고 있는 split() 함수를 사용하면
		 *  문자열 배열로 각각의 이름들을 하나씩 분리해서 가져올 수 있음!
		 *  -> 추출(Extraction)
		 *  
		 *  name2 = "강진주 김진주 홍진주";
		 *  
		 *  3개씩 이름들을 문자열 배열에 저장하기 위한 배열 선언
		 *  
		 *  String [] 배열이름 = null; 
		 *  String [] 배열이름 = new String[3]; 
		 *  -> 고정 방식 
		 *  
		 */
		String [] name_array = null;
		name_array = name2.split(" ");
		// String [] name_array = name2.split(" "); 
		// 위처럼 축약도 가능
		// split("구분자 문자열") -> 구문자 문자열은 위에서 변수 name2가 
		// 갖고 있는 구분자와 동일해야함! -> 틀리면 예외상황이 발생
		// String name2 ="강진주,김진주,홍진주"; -> 쉼표로 구분했다면 구분자는 split(",");
		
		// 배열을 선언하면 메모리에 배열이 만들어지는 시점에 컴파일러가
		// 자동으로 int length 변수를 만들고 배열의 크기를 저장해 줌
		// 3명의 이름 -> int length = 3;
		
		if (name_array.length == 3) {
			System.out.println("문자열 변수 name2에서 추출한 이름들을 출력");
			
			System.out.println("첫번째 이름은 " + name_array[0]);
			System.out.println("두번째 이름은 " + name_array[1]);
			System.out.println("세번째 이름은 " + name_array[2]);
			
		}
		
	////////// 아래는 내가 한거 ////////////////////
		
		for(int i = 0; i < name_array.length; ++i) {
			
			System.out.println(name_array[i]);
			// 이렇게 하면 내가 name2 배열에 몇개를 써도 자동으로 출력됨
			
		}
		
		

	}

}
