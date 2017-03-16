package march15;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		/*
		 * 예제 1. 배열의 모든 요소를 더해서 총합과 평균을 구하기(p196)
		 */
		
		int sum = 0;
		float avg = 0f;
		int [] score = { 100, 88, 100, 100, 90 };
		
		for(int i = 0 ; i < score.length ; ++i ) {
			sum += score[i];
		}
		avg = sum / (float)score.length ; // 계산 결과를 float로 얻기
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(score.length); // 총 배열의 갯수를 나타냄. 
		
		/*
		 * 예제 2. 배열의 요소 중 제일 큰 값과 제일 작은 값을 찾기
		 */
		
		int [] score2 = { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score2[0]; // 배열의 첫 번째 값으로 최대값을 초기화
		int min = score2[0]; // 배열의 첫 번쨰 값으로 최소값을 초기화
		
		for(int i = 1; i < score2.length; ++i) {
			if (score2[i] > max) {
				max = score2[i];
			} else if (score2[i] < min) {
				min = score2[i];
			}
		} // end of for
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	
		
		/*
		 * 예제 3. 배열의 요소의 순서를 반복해서 바꾼다
		 */
		int [] numArr = new int [10];
		
		for(int i = 0; i < numArr.length; ++i) {
			numArr[i] = i; // 배열을 숫자 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < 100; ++i) {
			int n = (int)(Math.random() * 10); // 0~9 중의 한 값을 임의로 얻는다
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for ( int i =0; i < numArr.length; ++i) 
			System.out.print(numArr[i]);

	} // end of main
} // end of class 
