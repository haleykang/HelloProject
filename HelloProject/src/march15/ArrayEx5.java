package march15;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		/*
		 * ���� 1. �迭�� ��� ��Ҹ� ���ؼ� ���հ� ����� ���ϱ�(p196)
		 */
		
		int sum = 0;
		float avg = 0f;
		int [] score = { 100, 88, 100, 100, 90 };
		
		for(int i = 0 ; i < score.length ; ++i ) {
			sum += score[i];
		}
		avg = sum / (float)score.length ; // ��� ����� float�� ���
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println(score.length); // �� �迭�� ������ ��Ÿ��. 
		
		/*
		 * ���� 2. �迭�� ��� �� ���� ū ���� ���� ���� ���� ã��
		 */
		
		int [] score2 = { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score2[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ
		int min = score2[0]; // �迭�� ù ���� ������ �ּҰ��� �ʱ�ȭ
		
		for(int i = 1; i < score2.length; ++i) {
			if (score2[i] > max) {
				max = score2[i];
			} else if (score2[i] < min) {
				min = score2[i];
			}
		} // end of for
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	
		
		/*
		 * ���� 3. �迭�� ����� ������ �ݺ��ؼ� �ٲ۴�
		 */
		int [] numArr = new int [10];
		
		for(int i = 0; i < numArr.length; ++i) {
			numArr[i] = i; // �迭�� ���� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < 100; ++i) {
			int n = (int)(Math.random() * 10); // 0~9 ���� �� ���� ���Ƿ� ��´�
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for ( int i =0; i < numArr.length; ++i) 
			System.out.print(numArr[i]);

	} // end of main
} // end of class 
