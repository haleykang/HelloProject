package march21;
/*
 * 쇼핑몰에서 사용하는 물건 구매 함수(메소드) 만들기
 */
// 쇼핑몰에서 취급하는 물건의 종류 별로 클래스 만들기

class ShoesClass {
	// 신발 이름을 보관하는 변수 선언
	private String name;
	// 신발 가격을 보관하는 변수 선언
	private int price;
	// 생성자 함수를 만든 다음에 위에서 만든 변수에 특정 값을 저장하기
	// 기본 생성자 함수 먼저 만들기
	public ShoesClass() {
		// this() : 명령문을 작성해서 아래에 있는 생성자 함수를 실행
		this("",0);
		
	}
	// 다른 메소드로부터 신발 이름과 가격을 받는 생성자 함수
	public ShoesClass(String name_value, int price_value) {
		// 실제 명령문을 작성해서 다른 메소드로부터 받은 신발 이름과 가격을
		// 위에서 선언한 전역 변수인 name과 price에 저장
		this.name = name_value;
		this.price = price_value;
	}
	// 소비자가 구매한 신발 이름과 가격을 화면에 출력하는 함수
	public void show() {
		// System.out.println("소비자가 구매한 신발 정보를 출력");
		System.out.println("신발 이름은 " + this.name);
		System.out.println("신발 가격은 " + this.price);
	}
}

class BagClass {
	// 가방 이름을 보관하는 변수 선언
	private String name;
	// 가방 가격을 보관하는 변수 선언
	private int price;
	// 생성자 함수를 만든 다음에 위에서 만든 변수에 특정 값을 저장하기
	// 기본 생성자 함수 먼저 만들기
	public BagClass() {
		
		this("",0);
	}
	// 다른 메소드로부터 가방 이름과 가격을 받는 생성자 함수
	public BagClass(String name_value, int price_value) {
		
		this.name = name_value;
		this.price = price_value;
	}
	public void show() {
		System.out.println("가방 이름은 " + this.name);
		System.out.println("가방 가격은 " + this.price);
	}
	
	
}

class WatchClass {
	
}

class ComputerClass {
	
}


public class TestShopClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 위에서 만든 ShoesClass 클래스를 사용하기 
		// 소비자가 3개의 신발을 구매한 경우
		
		ShoesClass ref_shoes1_ob = new ShoesClass("신발1", 30000);
		ShoesClass ref_shoes2_ob = new ShoesClass("신발2", 40000);
		ShoesClass ref_shoes3_ob = new ShoesClass("신발3", 20000);
		
		BagClass ref_bag1 = new BagClass("가방1", 200000);
		BagClass ref_bag2 = new BagClass("가방2", 100000);
		BagClass ref_bag3 = new BagClass("가방3", 150000);
		
		// 소비자가 구매한 신발 목록을 화면에 출력
		System.out.println("***소비자가 구매한 신발 목록 출력***");
		ref_shoes1_ob.show();
		ref_shoes2_ob.show();
		ref_shoes3_ob.show();
		
		System.out.println("***소비자가 구매한 가방 목록 출력***");
		ref_bag1.show();
		ref_bag2.show();
		ref_bag3.show();
		
		System.out.println("모든 쇼핑을 마쳤습니다.");
		System.out.println("안녕히가십시오");

	}

}
