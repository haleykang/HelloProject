package march16;

public class TestBookch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 논리형 변수 선언
		boolean power = true;
		boolean checked = false;
		
		char ch =  'A';
		int a = (int)ch;
		char ca = 65;
		
		System.out.println(a); // 65
		System.out.println(ca); // A 출력
		System.out.println(ch); // A 출력
		
		System.out.printf("%c=%d(%#X)%n", ch,a,a); // %#X -> 16진수로 표현!
		char hch = '가';
		System.out.printf("%c=%d(%#x)%n", hch,(int)hch,(int)hch);
		
		hch = 0xac00;
		System.out.println(hch); // 가
		
		char tap = '\t';
		System.out.println(tap + "메롱");
		
		System.out.println('\'');
		System.out.println("abc\t123\b456");
		System.out.println('\n');
		System.out.println("\"hello\"");
		System.out.println("c:\\");
		
		
				
		
	}

}
