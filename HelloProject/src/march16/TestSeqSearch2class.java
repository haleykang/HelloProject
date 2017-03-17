package march16;

public class TestSeqSearch2class {

	/*
	 * 순차 검색 예제 만들기
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 정수 데이터를 보관하는 배열 선언 과 초기화
		int [] iarray = new int [] {1,2,3,4,5};
		int [] iarray2 = {1,2,3,4,5};
		int [] iarray3 = null;
		
		iarray3 = new int [5];
		
		iarray3[0] = 1;
		iarray3[1] = 2;
		iarray3[2] = 3;
		iarray3[3] = 4;
		iarray3[4] = 5;
		
		System.out.println("**첫번째 배열이 갖고 있는 모든 값들을 출력**");
		// 1. 반복문 + 배열 + 출력 함수를 함께 사용
		// 2. toString() 함수 사용
		
		int size = iarray.length;
		
		for(int i = 0; i < size; ++ i) {
			System.out.println(i + " 위치에 저장되어있는 정수는 " + iarray[i]);
		}
		System.out.println("***********************************************");
		
		// 향상된 for 반복문을 출력 함수와 사용
		System.out.println("**두번째 배열이 갖고 있는 모든 값들을 출력**");
		
		for(int value : iarray2) {
			System.out.println("배열에 저장되어 있는 정수는 " + value);
		}
		
		System.out.println("***********************************************");
		
		// 2. toString() 함수를 사용
		// -> java.util 패키지에 있는 Arrays 클래스가 갖고 있는 static 함수
		// -> 사용 방법은 String result = "";
		String result = "";
		String result2 = "";
		
		/*
		 * 배열 iarray가 갖고 있는 모든 정수 값들을 읽어와서 하나의 문자열
		 * 데이터로 변환하고 변수 result에 저장하는 명령문
		 * -> [첫번째 정수, 두번째 정수, 세번째 정수...]
		 */
		result = java.util.Arrays.toString(iarray);
		result2 =  java.util.Arrays.toString(iarray2);
		System.out.println("첫번째 배열 iarray를 문자열로 변환하면 " + result);
		System.out.println("두번째 배열 iarray2를 문자열로 변환하면 " + result2);
		
		System.out.println("***********************************************");
		
		// 세번째 배열 iarray3이 갖고 있는 모든 정수 값들을 화면에 출력하기
		
		for(int value : iarray3) {
			System.out.println("배열 iarray3에 저장되어 있는 정수는 " + value);
		}
	
		
		System.out.println("***********************************************");
		
		/*
		 * 배열의 위치 번호를 변화시키는 반복문 작성
		 * 1) 첫번째 위치부터 시작 : 0 -> 1->2 ...-> 배열이름.length -1
		 * 2) 마지막번째 위치부터 시작 : 배열이름.length-1 -> ... -> 2->1->0
		 * 
		 */
		
		System.out.println("***정방향으로 배열의 위치 번호를 변화시키기***");
		for(int i = 0; i < iarray.length; ++i) {
			System.out.println("현재 배열의 위치 번호는 " + i);
		}
		
		System.out.println("***역방향으로 배열의 위치 번호를 변화시키기***");
		for(int i = size -1; i>=0; --i) {
			System.out.println("현재 배열의 위치 번호는 " + i);
		}
		
		/*
		 * 순차 검색 알고리즘을 구현해서 배열에서 원하는 데이터를 찾아보기
		 * 1) 찾을 데이터는 사용자로부터 입력 받기 : 정수 입력 : int 변수이름 ;
		 * 
		 */
		
		int find_data = 0;
		
		// 사용자가 키보드를 사용하는 경우에 꼭 필요한 Scanner 클래스를
		// 사용한 변수 선언과 메모리 생성 명령문 작성
		// -> 예외상황을 고려해서 try~catch 블럭은 먼저 작성하고
		// 안에 메모리 생성하기
		
		// 변수 선언 -> new 연산자에 의해서 메모리가 만들어지는데
		// 메모리에 접근할때 사용하는 변수로 메모리의 주소가 저장될 예정
		java.util.Scanner scanner = null;
		
		// 현재 프로그램 실행시간을 구해서 변수에 저장
		long start_time = System.nanoTime();
		System.out.println("현재 시간을 정수로 출력 하면 " + start_time);
		
		try {
			
			scanner = new java.util.Scanner(System.in);
			
			// 사용자에게 정수 입력을 요청하는 명령문(출력 명령문) 작성
			
			Loop1 :
			do{
			System.out.print("배열에서 찾을 정수를 입력하세요 : ");
			
			// scanner 변수가 갖고 있는 nextInt() 함수를 사용해서 
			// 사용자가 정수를 입력할 수 있도록 함
			find_data = scanner.nextInt();
			
			// 사용자가 입력한 정수를 확인하기
			System.out.println("입력하신 정수는 " + find_data + " 입니다.");
			
			/*
			 * 배열에 저장된 데이터들과 사용자가 입력한 데이터를 1대1로 차례대로
			 * 비교하는 반복문 작성
			 * -> if(배열에 있는 데이터 == 사용자가 입력한 데이터) 인 경우에만
			 * 화면에 입력한 데이터를 배열에서 찾았습니다, 메시지 출력
			 * 
			 */
			int count = 0;
			

			
			
			for(int i = 0; i<size ; ++i) {
				if(iarray[i] == find_data) {
					System.out.println("사용자가 입력한 정수인 " + find_data + " 를 배열의 "
							+ i + " 위치에서 찾았습니다.");
					//	++count;
					//System.out.println("현재까지 배열에서 찾은 데이터의 갯수는 " + count);
					break Loop1;
				} 
			} 
			System.out.println("사용자가 입력한 " + find_data + "를 찾지 못했습니다.");
			
			} while(true);
			
			/*
			 * 이분 검색 알고리즘을 사용해서 배열에서 원하는 데이터를 찾기
			 * 1) int left = 0;
			 * 2) int right = 배열이름.length -1;
			 * 3) int middle;
			 * 
			 */
			
			System.out.println("***이진 검색 알고리즘 예제***");
			int left = 0;
			int right = size -1;
			int middle = 0;
			
		/*	// 현재 프로그램 실행시간을 구해서 변수에 저장
			long start_time = System.nanoTime();
			System.out.println("현재 시간을 정수로 출력 하면 " + start_time);*/
			
			while(left <=right) {
				// 먼저 왼쪽 부분과 오른쪽 부분의 가운데 위치 구하기
				middle = (left + right) / 2 ;
				
				// 가운데 위치 확인
				System.out.println("현재 가운데 위치는 " + middle);
				
				if(iarray[middle] == find_data) {
					System.out.println("배열의 " + middle + "의 위치에서 " + find_data + "를 찾았습니다.");
					break;
				}
				else if(iarray[middle] > find_data) {
					System.out.println("중간 위치에 있는 데이터 보다 찾으려는 데이터가 작음");
					right = middle -1;
					
				}
				else if(iarray[middle] < find_data) {
					System.out.println("중간 위치 값보다 찾으려는 데이터가 큼");
					left = middle + 1;
				} else {
					System.out.println("오류");
					break;
				}
				
			}
			long end_time =System.nanoTime();
			System.out.println("종료 시간은 " + end_time);
			System.out.println("처리 시간은 " + (end_time - start_time) / 1000000000. + "초");
			
			/*
			 * java.util 패키지에 있는 Arrays 클래스가 갖고 있는 binarySearch() 함수를 사용
			 * 
			 * -> binarySearch() 함수가 반환할 배열의 위치 값을 저장할 변수
			 * int index_found;
			 * index_found = java.util.Arrays.binarySearch(iarray,find_data);
			 * 
			 * if(index_found >=0 && index_found < size) {
			 *  // 사용자가 입력한 데이터가 배열에 있는 경우
			 *  } else {
			 *    // 사용자가 입력한 데이터가 배열에 없는 경우 
			 *  }
			 *  
			 */
			int index_found;
			index_found = java.util.Arrays.binarySearch(iarray, find_data);
			if(index_found >=0 && index_found < iarray.length) {
				System.out.println("이분 검색 방법을 사용해서 배열에서 "
						+ "사용자가 입력한 " + find_data + " 를 찾았습니다.");
				System.out.println("배열에서의 위치는 " + index_found);
			} else {
				System.out.println("배열에서 사용자가 입력한 "
						+ find_data + "를 찾지 못했습니다.");
			}
			System.out.println("모든 일을 끝냈습니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외상황 발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
