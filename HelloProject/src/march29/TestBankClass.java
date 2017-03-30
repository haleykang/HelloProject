package march29;


/*
 * 은행에서 하나의 통장을 개설 후 ATM 기계를 통해 5만원 입금하기 예제
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 통장을 관리해주는 클래스 만들기
/*
 * 1. 통장을 개설할 때 필요한 정보를 저장
 * 2. 통장을 사용해서 할 수 있는 입금, 출금, 잔액 조회 기능 구현
 * 
 */
class MyBankClass {
	
	// 이름을 보관하는 변수 선언
	private String m_name ;
	
	// 계좌 번호를 보관하는 변수 선언
	private String account_no ;
	
	// 계좌 비밀번호를 보관하는 변수 선언
	private String m_password ;
	
	// 통장의 잔액 정보를 보관하는 변수 선언
	private int m_balance;
	
	// 통장 개설에 사용할 생성자 함수 만들기
	
	public MyBankClass(String name_value, String acct_no_value, 
			String pw_value, int balance_value) { 
		System.out.println(name_value + " 고객님의 새로운 통장을 개설합니다.");
		System.out.println("계좌 번호는 " + acct_no_value + " 입니다.");
		System.out.println("초기 예금액은 " + balance_value + "원 입니다.");
		
		// main() 함수로 부터 받은 정보들을 전역 변수에 저장하기
		this.m_name = name_value;
		this.account_no = acct_no_value;
		this.m_password = pw_value;
		this.m_balance = balance_value;
		System.out.println("통장이 개설되었습니다.");

	}
	
	/*
	 * 여러 개의 쓰레드 객체들이 전역 변수에 저장된 정보들을 사용하려고 하는 경우에
	 * 전역 변수에 저장된 정보들을 보호하기 위해서는 동기화 명령어를 작성해서 함수를 만들어야 함
	 * 
	 * 동기화 명령어를 사용하면 한번에 하나의 쓰레드만이 번역 변수에 저장된 정보를 사용 가능 
	 * 
	 * -> 여러 개의 쓰레드 객체들이 동시에 전역 변수에 저장된 정보들을 사용하는 경우에는
	 * 데이터의 일관성이 유지되기 힘들기 때문
	 * 
	 * -> 동기화 명령어 : synchronized 예약어 사용
	 */
	
	// 홍길동 고객이 통장에 입금하는 경우에 동작하는 동기화 함수
	public synchronized int withdraw(int deposit_value) throws Exception {
		
		
		/*
		 * 입금액의 유효성 검사하기(양수일것)
		 */
		if(deposit_value <=0) {
			
			System.out.println("입금액이 0원 이하입니다.");
			throw new Exception("입금액이 0원 이하입니다. 입금 진행 불가");
		}
		/*
		 * 입금액의 범위 검사 : -21억 ~ 21억 검사
		 */
	/*	if(deposit_value < Integer.MIN_VALUE ) {
			System.out.println("입금액이 정수의 최소값보다 더 작습니다.");
			throw new Exception("입금액 언더플로우");
		}*/
		if(deposit_value > 0 && deposit_value <= Integer.MAX_VALUE) {
			System.out.println("입금액 정상");
		} else {
			
		}
		
		// 입금액이 반영된 잔액 정보를 main() 함수로 반영
		return this.m_balance;
	}
	
	
}


public class TestBankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
