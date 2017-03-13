package march13;

/*
 * [실습] 2개의 정수 중에서 작은 정수를 반환하는 min() 함수 만들기
 * 1. 무조건 2개의 정수만을 받는 함수 min (int a, int b)
 * 2. 무조건 2개의 실수만을 받는 함수 min (float a, float b) / min(double a, double b)
 * 3. 모든 숫자 데이터를 받는 함수 min (String a, String b)		
 * → 함수 오버로딩
 */


import java.util.*;

public class SelfTest {
	
/*	// 1. 2개의 정수만을 받는 min() 함수
	static int min(int a, int b) {
		
		if(a<b)
			return a;
		else if(a>b)
			return b;
		else return 0;
	}
	// 2. 2개의 실수만을 받는 min() 함수
	static float min(float a, float b) {
		
		if(a<b)
			return a;
		else if(a>b)
			return b;
		else return 0;
	}
	
	static double min(double a, double b) {
		
		if(a<b)
			return a;
		else if(a>b)
			return b;
		else return 0;
	}*/
	// 모든 숫자 데이터를 받는 min() 함수
	//
	static String min(String a, String b) {
		
		double ia = Double.parseDouble(a);
		double ib = Double.parseDouble(b);
		// pareInt로 할 경우 정수 처리!
		// 더 큰 값인 parseDouble로 변환 해야 실수, 정수 둘 다 비교 가능 
		
		if(ia<ib)
			return a;
		else if(ia>ib)
			return b;
		else return null;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
/*		int da = 0;
		int db = 0;
		
		float fa = 0.0f;
		float fb = 0.0f;
		
		double lfa = 0.0;
		double lfb = 0.0;
		*/
		String stra;
		String strb;
		
		try {
			
			System.out.print("첫번째 데이터를 입력하세요 : ");
			stra = scanner.next();
			
			System.out.print("두번째 데이터를 입력하세요 : ");
			strb = scanner.next();
			
			System.out.println("입력된 데이터 중 작은 값은 " + min(stra, strb));
			
		} catch (Exception e) {
			
			System.out.println("오류 발생");
			System.out.println("내용은 " + e.getMessage());
			e.printStackTrace();
			
		}
	
	}

}
