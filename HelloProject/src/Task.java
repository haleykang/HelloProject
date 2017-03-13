
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***간단한 계산기 만들기***");
		System.out.println("1. 정수 덧셈하기");
		System.out.println("2. 정수 뺄셈하기");
		System.out.println("3. 정수 곱셈하기");
		System.out.println("4. 정수 나눗셈 몫 구하기");
		System.out.println("5. 정수 나눗셈 나머지 구하기");
		System.out.print("위에 있는 메뉴의 번호를 입력하세요 : ");
		
		// 메뉴의 번호(1~5)를 문자로 보관할 수 있는 변수 선언
		
		char menu_no = ' ';
		
		try{
			menu_no = (char)System.in.read();
			System.out.println("사용자가 입력한 메뉴 번호는 " + menu_no); 
		} catch(Exception exception) {
			
			System.out.println("잘못된 번호를 입력 하셨습니다.");
			System.out.println("내용은" + exception.getMessage());
			
		}
		
	}

}
