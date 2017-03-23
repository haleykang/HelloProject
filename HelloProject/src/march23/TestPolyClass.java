package march23;
/*
 * 다형성 기초 예제 만들기
 * 
 * 1. 다형성을 적용해서 새로운 클래스 만들기
 * 
 * 2. 다형성을 적용하지 않은 새로운 클래스 만들기
 */
/*
 * 모든 클래스에서 사용할 수 있는 부모 클래스 만들기
 * 
 * 1. class 클래스이름 {} // 부모 자격이 있는 클래스
 * 2. final class 클래스이름 {} // 부모 자격이 없는 클래스 
 * 		-> final : 마지막 또는 최종(자신의 클래스 위치가 제일 아래 있게 만듦)
 * 
 * 예) final class 클래스이름 {}
 * 		class 클래스이름2 extends final_클래스이름{} // 오류
 */
// 모든 제품 객체에서 공통적으로 사용할 수 있는 부모 클래스 만들기
class ProductBaseClass {
	// 제품의 이름을 보관할 수 있는 변수 선언
	protected String name;
	// 제품의 가격을 보관할 수 있는 변수 선언
	protected int price;

}

// 위에서 만든 부모 클래스를 상속 받는 새로운 자식 클래스 만들기 : 시계 객체가 사용
class Watch1Class extends ProductBaseClass {
	// String name;
	// int price;
	
}

// 위에서 만든 부모 클래스를 상속 받는 새로운 자식 클래스 만들기 : 가방 객체 사용
class Bag1Class extends ProductBaseClass {
	// String name;
	// int price;
}

//위에서 만든 부모 클래스를 상속 받는 새로운 자식 클래스 만들기 : 컴퓨터 객체 사용
class Computer1Class extends ProductBaseClass {
	// String name;
	// int price;
	
}

// 다형성 개념을 적용한 소비자 클래스 만들기
class PolyConsumerClass {
	// 모든 제품에 사용할 수 있는 다형성 메소드 만들기
	// -> 매개 변수로 선언되는 변수의 클래스는 ProductBaseClass 클래스가 되어야 함
	// -> 모든 제품의 클래스의 부모 클래스
	public void buy_product(ProductBaseClass ref_product_ob){
		//  instanceof 연산자를 사용해 메모리에 접근할 수 있는 객체의 클래스를 판단(구분)
		if(ref_product_ob instanceof Watch1Class) {
			// 소비자가 시계를 구입한 경우에 실행되는 명령문들을 작성
			System.out.println("시계를 구입하셨습니다.");
		}
		else if(ref_product_ob instanceof Bag1Class) {
			// 소비자가 가방을 구입하는 경우에 실행되는 명령문들
			System.out.println("가방을 구입하셨습니다.");
		}
		else if(ref_product_ob instanceof Computer1Class) {
			// 소비자가 컴퓨터를 구입하는 경우 실행되는 명령문들
			System.out.println("컴퓨터를 구입하셨습니다.");
		}
		else {
			// 아직 쇼핑몰에서 취급되지 않는 제품 처리
			System.out.println("아직 등록되지 않는 제품입니다.");
		}
	}
	
	
}
// 다형성 개념을 적용하지 않은 소비자 클래스 만들기
class ConsumerClass {
	
	/*
	 * 제품 종류 별로 메소드를 만듭니다.
	 * 
	 * 1. 소비자가 시계제품을 구입한 경우에만 실행되는 메소드 만들기
	 * -> public void buy_product (Watch1Class 참조) { }
	 * 
	 * 2. 소비자가 가방 구입한 경우 실행 메소드
	 * -> public void buy_product ( Bag1Class 참조 변수) { }
	 * 
	 * 3. 소비자가 컴퓨터 구입한 경우 실행 메소드
	 * -> public void buy_product(Computer1Class 참조 변수) { }
	 */
	public void buy_product (Watch1Class ref_watch_product) {
		
		System.out.println("소비자가 시계를 구입했습니다.");
	}
	
	public void buy_product (Bag1Class ref_bag_product) {
		System.out.println("소비자가 가방을 구입했습니다.");
		
	}
	
	public void buy_product (Computer1Class ref_computer_product) {
		System.out.println("소비자가 컴퓨터를 구입했습니다.");
	
	}
	
	// 함수 이름의 재사용 -> 함수 이름 중복(Function Name Overloading) 객체 지향 개념 사용
	/*
	 * -> 새로 만들고자 하는 함수의 기능이 현재 사용하고 있는 함수와 동일한 경우에 사용
	 * -> 함수 이름을 재사용할 수 있어서 다른 부분에 시간을 더 할애할 수 있음
	 * 
	 * 		-> 매개 변수의 선언 부분(다른 함수와의 접점 만들기)
	 * 		-> 함수의 반환형 부분(함수 이름 중복을 사용해서 재사용) 
	 * 		-> 명령문만 새롭게 구상해서 작성하면 됨
	 * 			-> 명령문 : 알고리즘 작성에 시간을 더 쏙을 수 있는 개념
	 * 
	 *  예) 현재 사용하고 있는 메소드의 원형(함수의 머리 부분)
	 *  public void buy_product ( 시계클래스 참조변수이름) {}
	 *  public void buy_product ( 시계클래스 참조변수이름) {} // 중복
	 *  
	 *  public void buy_product ( 시계클래스 참조변수이름, 변수 선언 추가) {} // 이렇게는 사용 가능
	 * public void buy_product ( 시계클래스 참조변수이름, int dummy) {}
	 * 		int dummy_variable : 더미 변수 , 사용할 수도 있고 사용하지 않을 수도 있는 -> 선택 할 수 있는 벼누
	 * 		int temp_variable : 임시 변수 
	 *  
	 *  
	 */
	
}


public class TestPolyClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Watch1Class 클래스를 메모리에 만들기
		
		Watch1Class watch_ref = null;
		watch_ref = new Watch1Class();
		
		// 2. Bag1Class 클래스 만들기
		
		Bag1Class bag_ref = null;
		bag_ref = new Bag1Class();
		
		// 3. Computer1Class 메모리에 만들기
		Computer1Class computer_ref = null;
		computer_ref = new Computer1Class();
		
		/*
		 * 반복 구조를 사용해서 실제 소비자가 현실 세계에서 쇼핑하는 것처럼 
		 * -> while( true ) 또는 thile(논리형 변수이름 == true)
		 */
		
		// 5. 소비자 객체를 메모리에 생성하고 메모리에 만들어진 객체의 주소를 변수에 저장
		
		PolyConsumerClass consumer_ref = new PolyConsumerClass();
		
		// 6. 점(.) 연산자를 사용해서 메모리에 만들어진 buy_product() 함수 실행
		consumer_ref.buy_product(watch_ref);
		
		// 소비자가 가방을 구입한 경우
		consumer_ref.buy_product(bag_ref);
		
		// 소비자가 컴퓨터를 구입한 경우
		consumer_ref.buy_product(computer_ref);
		
		// 다형성을 적용하지 않은 소비자 클래스를 사용해서 메모리에 객체를 만들고
		// 메모리에 만들어진 객체의 주소를 참조형 변수에 저장하기
		ConsumerClass consumer_ref2 = new ConsumerClass();
		
		// 다형성 개념을 적용하지 않은 클래스를 이용해 buy_product 함수 실행
		consumer_ref2.buy_product(watch_ref);
		consumer_ref2.buy_product(bag_ref);
		consumer_ref2.buy_product(computer_ref);
		
		//buy_product() 메소드를 실행하는 시점에 new Watch1Class 명령어를 작성해서
		// 임시 객체(일회용 객체)를 메모리에 만든 다음에 buy_product() 함수에 전달하는 방법도 가능
		consumer_ref2.buy_product(new Watch1Class());
		

	}

}
