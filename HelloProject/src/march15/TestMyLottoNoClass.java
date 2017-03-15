package march15;

/* 
 * 45개의 로또 번호 생성
 * -> 6개의 번호 선택 후 출력
 * -> 1개의 번호 선택
 */

import java.util.*;



class HelloMyLotto {
	
	// 정수 난수 생성 변수
	static final Random random = new Random();
	
	// 1~45까지 숫자 저장할 배열 선언
	int [] my_array = null;
	
	int random_no1 = 0;
	
	// 6개 배열 선언
	int [] isix_array = new int [6];
	
	// 6개 배열 출력 테스트
	public void show_test() {
		
		for(int i = 0; i <=(isix_array.length-1); ++i) {
			System.out.println(i + " 위치에 저장된 로또 번호는 " + this.isix_array[i]);
		}
	}
	// 6개 값을 45개의 값 중 하나를 선택에서 isix_array에 저장하기
	public void choice_no() {
		
		for(int i = 0; i <=(isix_array.length-1); ++i) {
			
			isix_array[i] = my_array[create_random_no()];
			// System.out.println(isix_array[i]); // 중복되는 값이 나옴
			
			
			for(int j = 0; j <= i; ++j) {
			
				if (isix_array[i] ==isix_array[j]) {
					System.out.println(isix_array[i]);
					--j;
					break;
				} // 아 모르게따..
			}
			
			
		}
		
/*		isix_array[0] = my_array[i];
		i = create_random_no();
		isix_array[1] = my_array[i];
		i = create_random_no();
		isix_array[2] = my_array[i];
		i = create_random_no();
		isix_array[3] = my_array[i];
		i = create_random_no();
		isix_array[4] = my_array[i];
		i = create_random_no();
		isix_array[5] = my_array[i];
		
	
		System.out.println(isix_array[0] + " " + isix_array[1]+ " " +isix_array[2]+ " "
		+ isix_array[3] + " " + isix_array[4] + " " + isix_array[5]);*/
		
		
	}
	
	
	
	// 배열에 1~45까지 숫자 저장해주는 함수
	 public void create_no() {
		
		for(int i = 0; i <= (this.my_array.length-1); ++i ) {
			
			this.my_array[i] = i + 1;
		}
	}
	
	// 저장된 로또 번호를 출력해주는 함수
	
	public void show_no() {
		
		for(int i = 0; i <= (my_array.length -1); ++i) {
			System.out.println(i + " 위치에 저장된 로또 번호는 " + this.my_array[i]);
		}
			
	}
	
	// 난수 0~44 숫자 중  1개 생성하는 함수
	public int create_random_no() {
		
		random_no1 = random.nextInt(45);
		return random_no1;
	}
	
	

	public HelloMyLotto() {
		
		if (my_array == null) {
			this.my_array = new int [45];
		}
		else {
			System.out.println("배열이 이미 생성되어 있습니다.");
		}
	}

	public HelloMyLotto(int size) {
		
		if(size == 45) {
			if(this.my_array == null) {
				
				this.my_array = new int [size];
			}
		}
		
	}
		
}

public class TestMyLottoNoClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloMyLotto ref_lotto  = new HelloMyLotto();
		
		
		try {
			
			// 배열에 저장 전
			ref_lotto.show_no();
			
			// 배열에 저장 선언
			ref_lotto.create_no();
			
			// 배열에 저장 후 
			ref_lotto.show_no();
			
			// 생성된 랜덤 정수 확인
			System.out.println(ref_lotto.create_random_no());
			
			ref_lotto.show_test();
			
			ref_lotto.choice_no();
			
			
			
	
	
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}

	}

}
