/*
 * 제어문 작성 클래스 만들기
 */
public class ControlClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if문의 조건에 사용할 변수 선언과 초기화
		boolean condition = true;
		
		// if 문을 작성해서 조건이 참이면 화면에 안녕하세요를 출력
		if(condition)
			System.out.println("안녕하세요?");
		
		// 변수 condition의 값을 거짓으로 바꾸기
		condition = false;
		
		if(condition) // if(false) -> 참이 아니므로 조건은 거짓 
			System.out.println("실행되지 않는 명령문");
		
		/*
		 * 조건에는 비교 연산자를 사용 할 수 있음
		 * 
		 * 단, 조건에 산술 연산자는 사용 할 수 없음 -> 결과가 논리값(true 또는 false)이 아님!
		 * 
		 * 논리값은 참(true) 또는 거짓(false)
		 * 
		 * 1) == 비교 연산자 : 같은지 비교, 왼쪽과 오른쪽이 같은 같다면
		 * if ( condition == true )
		 * if ( false == true ) // 다르므로 결과는 거짓
		 * if ( true == true ) // 같으므로 결과는 참
		 * if ( false == false ) // 같은 논리 데이터가 2개 이므로 참 
		 * 
		 */
		if(condition == false)
			System.out.println("condition==false가 참이기 때문에 실행");
		
		if(condition == true)
			System.out.println("condition==true는 거짓이기 때문에 실행되지 않음");
		
		/*
		 * 2) != 비교 연산자 : 2개의 값이 다를 때 참인 비교 연산자
		 * 
		 * if(condition != true) -> if(false != true) -> 참
		 * 
		 */
		
		if(condition != true)
			System.out.println("condition != true가 참이기 때문에 실행");
		
		/*
		 * 
		 * 3) > : 왼쪽 데이터가 오른쪽 데이터 보다 큰 경우 참
		 * 
		 * int a = 10;
		 * int b = 20;
		 * 
		 * if(a>b) -> if(10>20) -> 거짓
		 * if(b>a) -> if(20>10) -> 참
		 * 
		 */
		
		/*
		 * 
		 * 4) < : 왼쪽 데이터가 작은 경우 참
		 * 
		 * 
		 */
		
		int a = 10;
		int b = 20;
		
		if(a<b)
			System.out.println("10<20 참이기 때문에 실행");
		else
			System.out.println("10<20 참이기 때문에 실행 안됨");
		
	}

}
