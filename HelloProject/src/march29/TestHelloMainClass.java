package march29;

/*
 * Thread 클래스를 상속받는 자식 클래스 만들기
 * -> Thread 클래스는 java.lang 패키지에 있음
 */
class MyChildThreadClass extends Thread {
	
	// 얘는 run() 함수를 재정의 안해도 오류 안남
	@Override
	public void run() {
		System.out.println("MyChildThreadClass 클래스에서 재정의한 run()함수");
	}
	
}

/*
 * Runnable 인터페이스를 구현한 새로운 자식 클래스 만들기
 */
class MyChildRunnableClass implements Runnable {
	// 얘는 인터페이스를 상속 받기 때문에 run() 함수를 꼭 재정의 해야함
	// 꼭!!!!!!!!!!!!!!! run() 함수 재정의해야함 -> Runnable 인터페이스 이므로
	// (추상 메소드를 갖고 있는 클래스)
	@Override
	public void run() {
		System.out.println("MyChildRunnableClass 클래스에서 재정의한 run()함수");
		
	}
	
}


public class TestHelloMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 위에서 만든 스레드 클래스를 사용하기 위해 참조현 변수 선언
		MyChildThreadClass ref_thread_ob;
		
		// new 명령어 사용해서 메모리에 생성
		ref_thread_ob = new MyChildThreadClass();
		
		// start() 함수를 실행해야 자바 가상 머신에 의해서 run() 함수가 실행됨!
		// 개발자가 제어 x
		
		ref_thread_ob.start();
		
		/*
		 * 위에서 만든 Runnable 인터페이스를 구현한 새로운 자식 클래스를 사용하려면
		 * 
		 * 1. 객체 참조형 변수를 선언 : 클래스 이름 참조변수이름;
		 * 
		 */
		MyChildRunnableClass ref_runnable_ob ;
		//2. new 클래스이름() 명령어로 메모리에 클래스 만들기
		ref_runnable_ob = new MyChildRunnableClass();
		
		// 3. Thread 클래스를 사용한 새로운 참조형 변수를 선언하고 생성한 후에
		// 위에서 만든 ref_runnable_ob를 Thread 클래스에 전달 해야함
		Thread ref_another_thread_ob = new Thread(ref_runnable_ob);
		
		// 4. Thread 클래스가 갖고 있는 start() 함수를 실행해서
		// 자바 가상 머신이 MyChildRunnableClass 클래스가 갖고 있는 run() 함수를 실행 할 수 있도록 함
		ref_another_thread_ob.start();
		
		
		// 화면에 Hello 메시지를 100번만 출력하는 예제 작성
		
		// nanoTime() 함수를 사용해서 현재 시간(프로그램이 시작된 후의 시간)
		long start_time = System.nanoTime();
		// 시작 시간을 변수에 저장하기 : 어떤 일을(명령문) 처리하기 전의 시간 보존
		
		
		for(int i = 0 ; i < 100 ; ++i) {
			System.out.println((i+1) + " Hello");
		}
		
		
		
		// 어떤일(명령문)을 다 처리한 후의 시간을 변수에 보관
		long end_time = System.nanoTime();
		
		// 총 걸린 시간 저장
		// (end_time - start_time) / 10억.0 
		double elapsed_time = (end_time - start_time)/1000000000.0;
		System.out.println("총 소요 시간은 " + elapsed_time + "초 입니다.");
		

	}
	
	
	

}
