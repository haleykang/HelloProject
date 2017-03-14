package march14;

/*
 * Object 클래스는 모든 클래스의 부모 클래스
 * 
 * -> 이유 : 현실세계에 있는 부모 역할을 하는 클래스가 필요
 * 
 * -> 새로 만드는 클래스 혼자서는 새로운 함수를 만들어야 하기 때문에
 * 부모 클래스가 갖고 있는 함수들을 자동으로 상속(물려 받음) 받기 위함
 * 
 */
// 학생 클래스 만들기
class StudentClass extends Object {
	// 부모 클래스와 자동으로 메모리 생성해주는 기본 생성자 함수 작성
	
	/*
	 * 학생 객체가 갖는 데이터를 보관할 수 있는 변수 선언과 초기화 명령문 작성
	 * 
	 * 이름 보관 변수 선언과 초기화
	 * 
	 * 접근 제한 명령어 + 자료형 + 변수이름 = 초기값;
	 * 
	 */
	// 접근 제한 명령어의 종류 : public / private / protected / default
	
	public String name = "홍길동"; // 모든 패키지에서 사용 가능
	// 다른 클래스에서 이름을 바꿀 수 있음
	// 중요한 데이터는 가급적 public 명령어는 자제
	
	public static final String MY_NAME = "홍길동";
	
	// 학생의 나이를 보관하는 변수 선언
	private int age = 20;
	// 변수 age의 사용 범위 - 하나의 클래스에서만 사용 가능  
	// 같은 패키지에 있어도 클래스가 다르면 사용할 수 없는 변수 
	
	// 학생의 키를 보관하는 변수 선언
	
	double height = 178.5;
	/*
	 * 접근 제한 명령어를 작성하지 않 으면 default 접근 제한 명령어가 자동 추가
	 * 같은 패키지에 있는 모든 클래스에서 사용 가능
	 * 패키지 이름이 다르면 사용할 수 없는 변수
	 * 부모 디렉토리가 같아야 사용 
	 */
	
	// 학생의 몸무게를 보관하는 변수 선언
	protected double weight = 76.5;
	// 사용 범위를 현재 클래스 + 자식 클래스 까지 사용 가능 
	
	
	/*
	 * 함수 만들기 : 기능별로 함수 만들기 -> 출력 기능을 갖는 함수
	 * 학생의 이름을 반환하는 함수 만들기
	 * 
	 */
	public String readName() {
		System.out.println("학생의 이름을 반환하기");
		return name;
	}
	
	// 변수 하나달 함수를 한개씩 만드는 것이 일반적
	// 나이를 반환하는 함수 만들기
	
	public int readAge() {
		System.out.println("학생의 나이를 반환하기");
		return age;
	}
	
	public double readHeight() {
		System.out.println("학생의 키를 반환하기");
		return this.height;
		/*
		 * 메모리에 생성된 학생 클래스의 주소를 this 변수가 갖고 있음
		 * this.메모리에 있는 변수/함수이름();
		 */
	}
	// 학생의 몸무게를 반환하는 함수 만들기
	public double readWeight() {
		System.out.println("학생의 몸무게를 반환");
		return this.weight;
	}
	
	/*
	 * main() 함수에서 위에서 만든 함수를 사용하려면 한번에 하나의 함수만 사용
	 * -> 학생 클래스의 주소를 저장하고 있는 변수이름.readAge();
	 * -> 학생의 나이만을 읽어오는 명령문
	 * -> 학생의 이름 읽어오기 : 변수이름.readName();
	 * -> 학생의 키를 읽어오기 : 변수이름.readHeight();
	 * -> 학생의 몸무게를 읽어오기 : 변수이름.readWeight();
	 * 
	 */
	
	public StudentClass() {
		super(); // new Object() 명령문을 간략하게 표현한 명령문
		/*
		 * 1. 먼저 Object 클래스가 메모리에 생성
		 * 2. 그 다음에 StudentClass 클래스가 메모리에 생성
		 * 
		 */
		
		
	}
	
	/*
	 * 새로운 method1() 함수 만들기
	 * -> this, super 변수 이름을 사용 -> 클래스 안에 있는 함수에서 사용 가능
	 * 
	 */
	public void method1() {
		System.out.println("새로 만든 method1() 메소드가 실행 됩니다.");
		/*
		 * Object 클래스에서 복사해준 toString() 함수를 실행해서
		 * return 값을 가져오는 명령문
		 * -> 무조건 문자열로 변환해주는 함수
		 * 
		 */
		String str = this.toString();
		// Object 클래스에서 복사해준 toString() 함수의 명령문을 그대로 사용
		System.out.println("toString() 함수가 반환한 문자열은" + str); 
	}
	
	/*
	 * 학생 객체가 갖고 있는 모든 데이터들을 하나의 문자열로 반환하는 함수
	 * public String toString() { }
	 */
	
	public String toString() {
		
		String result = "";
		
		result = this.readName() + "," + this.readAge() + "," + this.readHeight()
					+ "," + this.readWeight();
		
		return result;
		
		
	}
	
}

public class TestStudentClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 위에서 만든 StudentClass(학생 클래스)를 사용하기 위한 변수 선언
		// new 연산자에 의해 메모리에 새로 만들어지는 StudentClass 클래스의 
		// 주소를 저장하기 위한 변수
		StudentClass student1 = null;
		
		// StudentClass 클래스를 메모리에 생성
		// -> 컴파일러가 알아서 기본 생성자를 실행
		// -> public StudentClass() {
		// 			super();
		// 		}
		// -> 기본 생성자 안에 있는 super() 명령문이 실행되고
		// -> Object 클래스가 갖고 있는 기본 생성자가 실행됨
		// -> Object 클래스가 생성
		// -> StudentClass 클래스의 기본 생성자로 돌아와서 
		// -> StudentClass 클래스를 메모리에 만듦
		student1 = new StudentClass();
		// new 클래스이름(); -> 소괄호 안에 데이터가 없으면 기본 생성자가 실행
		
		// 메모리에 만들어진 StudentClass 클래스가 갖고 있는 Object 클래스로부터
		// 상속 받은 hashCode() 함수를 사용해서 자식 클래스의 메모리 주소를
		// 알 수 있음
		
		System.out.println("자식 클래스의 주소는 " + student1.hashCode());
		
		/*
		 * super 명령어는 Object 클래스(부모 클래스)의 메모리 주소를 저장하고 있는 변수
		 * -> super = new Object();
		 * -> super.함수이름() -> Object 클래스(부모 클래스)의 함수
		 * -> 컴파일러가 자식 클래스 안에 부모 클래스와의 연결 고리를 만들어서
		 * -> 부모 클래스가 메모리에 만들어지면 메모리의 주소를 super 변수에 저장
		 * 
		 * this 변수 : 현재 클래스에 메모리 주소를 보관하는 변수 
		 * -> this = new 현재 클래스이름();
		 * -> this = new StudentClass();
		 * -> this : 변수 생성도 자동(컴파일러가 알아서 제공)
		 * -> new StudentClass() -> 컴파일러가 알아서 기본 생성자를 호출 
		 * 
		 * super 변수가 먼저 생성
		 * 그 다음에 this 변수가 생성 -> 컴파일러가 부모와 자식 관계를 맺어주기 위해
		 * 클래스에 추가해주는 변수
		 * 
		 * super : 부모 클래스의 메모리 주소 저장 변수 -> 컴파일러가 생성해주는 자동 변수
		 * this : 자식 클래스의 메모리 주소 저장 변수  -> 컴파일러가 생성해주는 자동 변수
		 * 
		 */
		student1.method1();
		
		// println() 함수와 위에서 만든 read~함수를 함께 사용해서 학생의 이름을 화면에 출력하기
		
		System.out.println(student1.readAge());
		System.out.println(student1.readHeight());
		System.out.println(student1.readName());
		System.out.println(student1.readWeight());
		
		// 재정의한 toString() 함수 출력해보기
		
		String str_result = student1.toString();
		System.out.println(str_result);
		
		// 각각의 toString() 함수의 데이터를 split(",")로 나눠서 배열에 저장
		String [] result_array = str_result.split(",");
		
		// 배열 확인
		/*
		 * 배열은 객체로 처리 -> 컴파일러가 자동 변수인 length응 추가해줍니다.
		 * 총 데이터 갯수를 넣어줌  -> 이름. 나이. 
		 */
		if(result_array.length > 0) {
			
			if(result_array.length == 4) {
				
				System.out.println("학생의 이름은 " + result_array[0]);
				System.out.println("학생의 나이는 " + result_array[1]);
				System.out.println("학생의 키는 " + result_array[2]);
				System.out.println("학생의 몸무게는 " + result_array[3]); 
		
			}
		
		}
		 
		

	}

}
