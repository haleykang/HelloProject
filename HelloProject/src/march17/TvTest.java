package march17;

/*
 * 교재 235p 예제
 */
import java.util.*;

class Tv {
	
	// Tv 속성(멤버 변수)
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널
	Scanner scanner = null;
	
	// TV의 기능(메서드)
	void power() {power = !power;} // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; } // TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; } // TV의 채널을 낮추는 기능을 하는 메서드
	void input() {
		System.out.print("원하시는 채널을 입력해주세요 : ");
		scanner = new Scanner(System.in);
		channel = scanner.nextInt();
	}
	void channelCheck() {
		System.out.println("현재 채널은 " + channel + " 입니다.");
	}
	
	public Tv() {
		
		this(0);
	}
	public Tv(int a) {
	
		this.channel = a;
	}
	
}
 
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Tv t = null; // Tv 인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv(); // t 인스턴스를 생성한다
*/		Scanner scanner = new Scanner(System.in);
		String user_input = "";
		char y_n = ' ';

		Tv t = new Tv();
		//if(t.power == false) {
			
			System.out.println("전원을 켜주세요");
			
			do{
			System.out.print("전원을 켜시려면 y를, 원치 않으시면 n을 입력해주세요 : ");
			user_input = scanner.next();
			y_n = user_input.charAt(0);
			
			if(y_n == 'y' || y_n == 'Y') {
				
				t.power = true;
				break;
				
			}else if (y_n == 'n' || y_n == 'N') {
				
				System.out.println("전원을 켜지 않았습니다.");
				break;
				
			}else {
				System.out.println("오류입니다.");
				System.out.println("y 또는 n이 아닌 문자를 입력하셨습니다.");
				continue;
			}
			} while(true);
			
			
			
	//	}
			if(t.power == true) {
			
			try {
				
				t.input();
				t.channelCheck();
				
				
			} catch (Exception e) {
				
				System.out.println("오류 발생");
				System.out.println("내용은 " + e.getMessage());
				
			}
		/*System.out.println(t.power);
		t.power();
		System.out.println(t.power);*/
	/*
		t.channel = 7; // Tv인스턴스의 멤버변수 channel1의 값을 7로 한다
		t.channelDown(); // Tv 인스턴스의 메서드 channelDown()을 호출한다
		t.channelCheck();
		t.channelUp();
		t.channelCheck();
		
		Tv t2 = new Tv(10);
		t2.channelCheck();
		
		t2.channel = 20;
		t2.channelCheck();
		
		
		t.input();
		t.channelCheck();*/
	
	
	}


	}

}
