package march17;

/*
 * 로또 번호 예제 다시 한번 해보자
 * 
 * 1. 우선은 함수 생성 없이
 * 2. 1~45까지 숫자 배열 있어야함
 * 3. 그 중 6개 번호를 선택 -> 중복되지 않도록!
 * 
 */

// Random 함수 사용을 위해

import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class MyAnything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 1~45까지 숫자를 저장하는 배열 선언
		
		int [] no_array = new int [45];
		
		// 랜덤 정수 생성을 위핸 선언
		Random random = new Random();
		
		
		// 2. 각각의 배열에 1~45까지 숫자를 저장하기 위해 for 반복문 사용
		// 추가로 no_array의 길이를 저장하는 변수선언
		int size = no_array.length;
		
		for(int i = 0; i < size; ++i) {
			
			no_array[i] = i + 1;
			// 제대로 생성됐는지 확인
			System.out.println("배열위치 " + i + "에 저장되어있는 값은 " + no_array[i]);
			// no_array[0] = 1; .. 이렇게 저장 
			
		}
		// 랜덤한 6개의 숫자를 저장하기 위한 배열 선언
		int [] r_array = new int [6];
		// 랜덤하게 생성된 숫자를 저장하기 위한 int 변수 생성
		int random_no = 0;
		
		// for 반복문을 통해 랜덤한 6개의 번호 생성 후 r_array 배열에 저장
		
		//for ( int i = 0; i < r_array.length; ++i) {
			
		
			random_no = random.nextInt(45);
			r_array[0] = no_array[random_no];
			random_no = random.nextInt(45);
			r_array[1] = no_array[random_no];
			random_no = random.nextInt(45);
			r_array[2] = no_array[random_no];
			random_no = random.nextInt(45);
			r_array[3] = no_array[random_no];
			random_no = random.nextInt(45);
			r_array[4] = no_array[random_no];
			random_no = random.nextInt(45);
			r_array[5] = no_array[random_no];
			// 각각 배열에 저장되어있는 값 확인
		
			System.out.println("r_array[0] 위치에 저장되어있는 값은 " + r_array[0]);
			System.out.println("r_array[0] 위치에 저장되어있는 값은 " + r_array[1]);
			System.out.println("r_array[0] 위치에 저장되어있는 값은 " + r_array[2]);
			System.out.println("r_array[0] 위치에 저장되어있는 값은 " + r_array[3]);
			System.out.println("r_array[0] 위치에 저장되어있는 값은 " + r_array[4]);
			System.out.println("r_array[0] 위치에 저장되어있는 값은 " + r_array[5]);
			
			for(int i = 0; i < r_array.length; ++i) {
			
				random_no = random.nextInt(45);
				r_array[i] = no_array[random_no];
				
			/*	for ( int j = 0; j < i; ++j ) {
					
					r_array[j] =no_array[random_no];
					
					if(r_array[i] == r_array[j]) {
						
						++random_no;
						break;
					}
				}*/
				System.out.println(r_array[i]);
			}
		
			
				
		//	}
/*			r_array[i] = no_array[random_no];
			System.out.println("배열위치 " + i + "에 저장되어있는 값은 " + r_array[i]);*/
			// 여기까지 하면 동일한 숫자가 자꾸 나옴..
			
		/*	  for (int j = 0; j < i; j++) {
	                if (r_array[i] == r_array[j]) {
	                    i--;
	                    break;
	                }
	                
	        r_array[i] = no_array[random_no];
        	System.out.println(r_array[i]);*/
			
			}
			  
			  
		/*	r_array[i] = no_array[random_no];
			System.out.println(r_array[i]);*/
		}

	




