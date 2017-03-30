package march30;

/*
 * 프린트 기능을 갖는 프린터 서버 모델을 구현한 새로운 클래스 만들기
 * 
 * 이름 : MySharedPrinterServer
 * 
 * 기능 : 문자열 데이터들을 모니터 화면에 출력하는 기능
 * 
 * -> 이름 : print
 * -> 입력 데이터 : 여러 개의 문자열 데이터들을 받을 수 있는 문자열 배열 :
 * 			String [] 배열 변수 이름;
 * 
 * -> 여러 사람들이 순서대로 사용할 수 있도록 synchronized 명령어를 사용
 * -> 출력 : 없음 void
 * 
 * public synchronized void print ( String [] ref_data_array) {
 * 
 * }
 */
// 프린터 서버 클래스 만들기
class MySharedPrinterServer {
	

	
	
	
	// 동기화 명령어를 사용하지 않은 print2() 함수 만들기
	public void print2(int ivalue) {
		System.out.println("동기화 명령어를 사용하지 않은 함수");
		System.out.println("정수 하나만 화면에 출력");
		for(int count = 1; count <= 100; ++count) {
			// 화면에 정수 데이터 100번 출력
			System.out.println(count + " 번째 출력되는 정수 " + ivalue);
		}
		
		System.out.println("모든 정수 출력");
	}
	
		public synchronized void print_main() {
		System.out.println("print_main() 시작");
		print("Hello");
		System.out.println("print_main() 종료");
	}
	
	// print() 함수 : 하나의 문자열 만을 받는 함수
	// -> 현재 만들어져 있는 함수의 이름을 재사용
	public synchronized void print(String ref_string) {
		
		System.out.println("하나의 문자열만들 출력하는 함수");
		
		// 한꺼번에 모든 문자열들을 출력
		System.out.println(ref_string);
		
		// 문자열 안에 저장된 문자 하나씩 읽어와서 화면에 출력하는 반복문
		for(int i = 0 ; i < ref_string.length(); ++i) {
			System.out.print(ref_string.charAt(i));
		}
		System.out.println("출력완료");
	}
	
	// print() 함수 : 하나의 정수만들 출력
	public synchronized void print(int idata) {
		
		System.out.println("하나의 정수만 출력");
		System.out.println(idata);
		System.out.println("출력 완료");
	}
	// print() 함수 : 여러 개의 정수 데이터들을 출력
	public synchronized void print(int [] ref_idata_array) {
		
		System.out.println("여러 개의 정 수 데이터들을 출력");
		
		int size = ref_idata_array.length;
		if(size == 0) {
			System.out.println("출력할 데이터가 없습니다.");
			return;
		}
		for(int i = 0; i< size ; ++i) {
			System.out.println(ref_idata_array);
			
		}
		System.out.println("출력 완료");
	}
	// print() 함수 : 하나의 실수만 출력
	public synchronized void print(double ddata) {
		System.out.println("하나의 실수만 출력");
		System.out.println(ddata);
		System.out.println("출력 완료");
	}
	
	// 여러 개의 실수 출력
	public synchronized void print(double [] ref_ddata_array) {
		System.out.println("여러 개의 실수 출력");
		
		int size = ref_ddata_array.length;
		if(size == 0) {
			System.out.println("출력할 데이터가 없습니다.");
			return;
		}
		for(int i = 0; i < size; ++i) {
		System.out.println(ref_ddata_array);
		}
		
		System.out.println("출력 완료");
	}
	
	
	// 여러 사람들이 함께 사용할 수 있는 print() 함수 만들기
	public synchronized void print(String [] ref_data_array) {
		
		// for() 반복문을 작성해서 문자열 배열에 저장된 문자들을 하나씩 읽어와서
		// 모니터 화면에 출력
		int size = ref_data_array.length;
		
		if(size == 0) {
			// 데이터가 없는 경우
			System.out.println("출력된 데이터가 없습니다.");
			return;
		}
		
		for(int i = 0 ; i < size ; ++i) {
			
			// 문자열 배열에서 하나의 글자를 읽어와서 문자형 임시 변수에 저장
			char temp_ch = ref_data_array[i].charAt(i);
			
			System.out.print(temp_ch);
			
		}
		
	}
	
}


/*
 * 여러 사람들 객체를 만들어주는 새로운 클래스 만들기
 */
class MyPersonThread extends Thread {
	
	// 위에서 선언한 프린터 서버 클래스를 사용하는 참조형 변수 선언
	private MySharedPrinterServer ref_shared_printer_server ;
	
	// 프린터 서버에 보낼 데이터를 갖는 변 수들을 선언
	// 정수 데이터
	private int idata = 100;
	
	// 실수 데이터
	private double ddata = 3.14;
	
	// 하나의 문자열 데이터
	private String sdata = "강진주";
	
	// 여러 개의 문자열 데이터들을 보관하는 배열
	private String [] ref_sdata_array = {"안녕?","반가워","이름이 뭐야?","힘내"};
			
	// 새로운 생성자 함수를 만들어서 main() 함수 또는 다른 클래스로부터 프린터 서버
	// 객체의 주소와 모니터 화면에 출력할 데이터들을 받아오기
	// 매개 변수로 MySharedPrinterServer 클래스 이름을 사용한 경우
	// MySharedPrinterServer 클래스를 사용하는 클래스에서 꼭 new 클래스이름()을 한 후에
	// 새로 만들어지 메모리의 주소를 전달 해야함
	// 예) new MyPersonThread(10,3.14,"Hello", new String [] {"","",""})
	
	public MyPersonThread(int ivalue, 
			double dvalue, 
			String svalue, 
			String [] ref_svalue_array, 
			MySharedPrinterServer ref_shared_print_server_value) {
		// ref_shared_print_server_value = new MySharedPrinterServer(); 
		// 이건 항상 메모리에 가지고 있는 상태 
		
		// 다른 클래스로부터 받은 정수, 실수, 문자열, 문자열 배열들, 그리고
		// 메모리에 생성된 프린터 서버 객체의 주소를 전역 변수에 저장해야 나중에
		// 다른 함수에서도 사용 가능
		// this.전역 변수 이름 = 지역 변수 이름;
		System.out.println("사람 객체를 만들기");
		this.idata = ivalue;
		this.ddata = dvalue;
		this.sdata = svalue;
		this.ref_sdata_array = ref_svalue_array;
		this.ref_shared_printer_server = ref_shared_print_server_value;
		
		System.out.println("완료");
		
	}
	
	// 꼭 run() 함수는 작성해야 쓰레드 객체들을 움직이게 할 수 있음
	@Override
	public void run() {
		
		System.out.println("****run() 함수를 사람 객체들이 실행****");
		
		// getName() 함수를 사용하면 현재 run() 함수를 사용하고 있는 스레드 객체의 이름을
		// 알 수 있습니다.
		String name_thread = this.getName();
		System.out.println("현재 프린터 서버를 사용하고 있는 사람은 " + name_thread);
		
		// 모니터에 정수를 출력하기 위해서 print(정수) 함수를 실행
		this.ref_shared_printer_server.print(1030);
		
		// 모니터에 실수 출력
		this.ref_shared_printer_server.print(3.1334);
		
		// 모니터에 문자열 출력
		this.ref_shared_printer_server.print("Hello");
		
		// 전역 변수에 저장된 정수 값을 사용해서 모니터 화면에 출력
		this.ref_shared_printer_server.print(this.idata);
		
		// 전역 변수에 저장된 실수 갓ㅂ
		this.ref_shared_printer_server.print(this.ddata);
		
		// 전역 변수 문자열
		this.ref_shared_printer_server.print(this.sdata);
		
		// 문자열 배열에 저장된 문자열들은 배열을 사용해서 출력
		for(int i = 0 ; i < this.ref_sdata_array.length; ++i ) {
			System.out.println(i + " 위치에 저장된 문자열은 " + this.ref_sdata_array[i]);
			// 문자열 배열에 저장된 문자열을 프린터 서버에 있는 print() 함 수에 전달
			this.ref_shared_printer_server.print(this.ref_sdata_array[i]);
			
		}
		
		// 동기화 하지 않은 print2() 함수 실행하기
		this.ref_shared_printer_server.print2(28);
		
		
		
		System.out.println("****run() 함수를 사람 객체들이 실행 완료****");
		this.ref_shared_printer_server.print_main();
	}
	
}


public class TestPrinterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 모든 사람들이 함께 사용할 수 있는 프린터 서버 객체를 생성하고
		// 생성된 메모리의 주소를 변수에 저장
		
		MySharedPrinterServer ref_shared_print_server = new MySharedPrinterServer();
		// 사람 객체를 만들어서 참조형 변수에 저장
		MyPersonThread ref_person_thread = 
				new MyPersonThread(28, 163.2,"강진주", 
						new String[] {"안녕","반가워","뭐해?"}, ref_shared_print_server );
		
		// 두번째 사람 객체를 만들어서 저장
		MyPersonThread ref_person_thread2 =
				new MyPersonThread(27, 168.7, "강진영", new String[] {"메롱", "바보","뿅뿅"}, ref_shared_print_server);
		
		// 세번째 사람 객체
		MyPersonThread ref_person_thread3 = 
				new MyPersonThread(21, 160.2, "강강강", new String [] {"마마", "바바", "파파"}, ref_shared_print_server);
		
		// 위에서 만든 각각의 쓰레드 객체들에 새로운 이름 지정
		// 참조 변수 이름.setName("이름");
		
		ref_person_thread.setName("강진주");
		ref_person_thread2.setName("강진영");
		ref_person_thread3.setName("강강강");
		
		// start() 함수를 실행해서 만든 각가의 쓰레드 객체들이 run() 함수를 실행 할 수 있도록 하ㅣㄱ
		
		ref_person_thread.start();
	
		ref_person_thread2.start();
		
		ref_person_thread3.start();
		
		
		
		

	}

}
