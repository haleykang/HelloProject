package march15;

import java.util.*;

/*
 * 45개의 로또 번호를 보관 할 수 있는 배열을 준비하고 사용하는 예제
 */
 
// 45개의 로또 번호 관리 클래스 만들기
class LottoNoClass {
	
	// 45개의 정수를 보관하는 배열 선언
	int lotto_array [];
	
	// 45개의 논리값(참 또는 거짓)을 보관하는 배열 선언
	/*
	 *  현재 lotto_array 배열에 저장되어 있는 로또 번호를 뽑아 왔는지 여부를
	 *  보관하는 배역 
	 *  
	 *  true  -> 해당 위치(난수)에 있는 로또 번호를 뽑아온 경우
	 *  false -> 해당 위치(난수)에 있는 로또 번호를 아직 안 뽑아옴
	 */
	
	///////////////////////////////////여기서 부터 내가 한거 /////////////////////////////////////////////////////
	
	static final Random random = new Random();
	
	int my_random = random.nextInt(45);
	
	
	// 0~44 하나의 난수를 만들고 반환하는 함수
	public int random_one() {
		
		int random_no = random.nextInt(45);
		
		return random_no;
	}
	
	// 새로운 클래스를 만들어서 하기 TestMyLottoNoClass
	
	/*
	 * 45개의 로또 번호를 자동으로 만든 다음에 lotto_array 배열에 순차적으로
	 * 첫번째 위치에는 1을 두번째 위치에는 2을...저장하는 함수 만들기 
	 */
	public void creat_no() {
		
		System.out.println("***45개의 로또 번호를 만듭니다.***");
		/*
		 * for() 반복문의 작성 : 배열의 위치를 제어하는 변수 i를 선언하고
		 * 첫번째 위치인 0부터 시작하고 첫번째 위치에 저장하는 로또 번호는
		 * 현재 변수 i 값에 1을 더함 i+1
		 */
		for(int i = 0; i <= (this.lotto_array.length - 1); ++i) {
			System.out.println(i + " 위치에 저장할 로또 번호 만들기");
			this.lotto_array[i] = i+1;
			System.out.println("저장 완료");
		}
		
	}
	
	// 생성자 함수를 만들어 함수 안에서 로또 배열 생성하기
	// new int [45] 또는 new int [변수이름]
	
	// 1. 기본 생성자에서는 무조건 45개의 정수형 변수 생성
	public LottoNoClass() {
		System.out.println("무조건 45개의 정수형 변수를 생성하는 생성자 함수");
		if(lotto_array == null) {
			this.lotto_array = new int [45];
			System.out.println("배열 만들기 완료");
		}
		else {
			System.out.println("이미 배열이 생성되어 있습니다.");
		}
	}
	
	// 2. main() 함수로부터 배열의 크기를 받는 2번째 생성자
	public LottoNoClass(int size) { 
		System.out.println("main() 함수로부터 배열의 크기를 받는 생성자 함수");
		// main() 함수로 부터 받은 배열의 크기가 45개 인 경우에만 배열 생성
		if(size == 45){
			if(this.lotto_array == null) {
				System.out.println("새로운 배열을 만듭니다.");
				this.lotto_array = new int [size];
				System.out.println(size + " 크기를 갖는 배열 생성 완료");
			}
		}	
	}
	
	/*
	 * 45개의 로또 번호를 화면에 출력하는 함수
	 */
	public void show_no() {
		
		System.out.println("***45개의 로또 번호를 화면에 출력하기***");
		
		/*
		 * 45개의 로또 번호가 보관되어 있는 배열 lotto_array를 첫번째 위치 부터
		 * 방문하여 순서대로 위치를 증가하면서 번호를 읽어와서 화면에 출력
		 * 
		 * 변수 i를 선언해서 위치 번호를 보관하기 : int 1 = 0;
		 * 종류 조건은 lotto_array 배열의 크기 -1 까지 
		 * i<=(lotto_array.length -1)
		 * 배열의 위치 번호는 1씩 증가하기 : ++i
		 */
		for(int i = 0; i <= (lotto_array.length -1); ++i) {
			System.out.println(i + " 위치에 저장된 로또 번호는 " + this.lotto_array[i]);
		}
			
	}
	
}

public class TestLottoNoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. 위에서 만든 다른 클래스인 LottoNoClass를 사용하기 위한 변수 선언
		 */
		LottoNoClass ref_lotto_object = null;
		// ref : reference(참조) = 메모리의 주소
		
		/*
		 * 2. new 연산자를 사용해서 LottoNoClass 클래스를 메모리에 만들기
		 */
		
		try{
		ref_lotto_object = new LottoNoClass();
		/*
		 * new LottoNoClass() -> 기본 생성자를 실행 
		 */
		
		/*
		 *  3. 배열 크기를 받는 2번째 생성자를 실행하기
		 */
		/*
		 *  4. 새로 만들 메모리의 주소를 보관할 변수 선언
		 */
		LottoNoClass ref_lotto2_object = null;
		// 5. new 연산자를 사용해서 배열의 크기를 받는 생성자를 실행
		ref_lotto2_object = new LottoNoClass(45);
		
		/*
		 * show_no() 함수를 실행해서 지금까지 만들어진 로또번호(45)를
		 * 화면에 출력하기
		 */
		
		System.out.println("*****************************************************");
		
		System.out.println("첫번째 로또 배열 변수 사용");
		
		ref_lotto_object.show_no();
		
		System.out.println("*****************************************************");
		
		System.out.println("%두 번째 로또 배열 변수 사용");
		
		ref_lotto2_object.show_no();
		
		System.out.println("*****************************************************");
		
		/*
		 *  방금 만든 creat_no() 함수를 실행해서 45개의 로또 번호를 만든 다음에
		 *  배열 lotto_array에 저장하기
		 */
		
		ref_lotto_object.creat_no();
		
		System.out.println("-------------------------------------------------------");
		
		ref_lotto2_object.creat_no();
		
		System.out.println("-------------------------------------------------------");
		
		ref_lotto_object.show_no();
		
		System.out.println("-------------------------------------------------------");
		
		ref_lotto2_object.show_no();
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println(ref_lotto2_object.random_one());
		
		} catch (Exception e) {
			
			System.out.println("문제발생");
			e.printStackTrace();
		}
		
	}

}
