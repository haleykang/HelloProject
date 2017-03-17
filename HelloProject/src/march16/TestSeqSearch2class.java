package march16;

public class TestSeqSearch2class {

	/*
	 * ���� �˻� ���� �����
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ���� �����͸� �����ϴ� �迭 ���� �� �ʱ�ȭ
		int [] iarray = new int [] {1,2,3,4,5};
		int [] iarray2 = {1,2,3,4,5};
		int [] iarray3 = null;
		
		iarray3 = new int [5];
		
		iarray3[0] = 1;
		iarray3[1] = 2;
		iarray3[2] = 3;
		iarray3[3] = 4;
		iarray3[4] = 5;
		
		System.out.println("**ù��° �迭�� ���� �ִ� ��� ������ ���**");
		// 1. �ݺ��� + �迭 + ��� �Լ��� �Բ� ���
		// 2. toString() �Լ� ���
		
		int size = iarray.length;
		
		for(int i = 0; i < size; ++ i) {
			System.out.println(i + " ��ġ�� ����Ǿ��ִ� ������ " + iarray[i]);
		}
		System.out.println("***********************************************");
		
		// ���� for �ݺ����� ��� �Լ��� ���
		System.out.println("**�ι�° �迭�� ���� �ִ� ��� ������ ���**");
		
		for(int value : iarray2) {
			System.out.println("�迭�� ����Ǿ� �ִ� ������ " + value);
		}
		
		System.out.println("***********************************************");
		
		// 2. toString() �Լ��� ���
		// -> java.util ��Ű���� �ִ� Arrays Ŭ������ ���� �ִ� static �Լ�
		// -> ��� ����� String result = "";
		String result = "";
		String result2 = "";
		
		/*
		 * �迭 iarray�� ���� �ִ� ��� ���� ������ �о�ͼ� �ϳ��� ���ڿ�
		 * �����ͷ� ��ȯ�ϰ� ���� result�� �����ϴ� ��ɹ�
		 * -> [ù��° ����, �ι�° ����, ����° ����...]
		 */
		result = java.util.Arrays.toString(iarray);
		result2 =  java.util.Arrays.toString(iarray2);
		System.out.println("ù��° �迭 iarray�� ���ڿ��� ��ȯ�ϸ� " + result);
		System.out.println("�ι�° �迭 iarray2�� ���ڿ��� ��ȯ�ϸ� " + result2);
		
		System.out.println("***********************************************");
		
		// ����° �迭 iarray3�� ���� �ִ� ��� ���� ������ ȭ�鿡 ����ϱ�
		
		for(int value : iarray3) {
			System.out.println("�迭 iarray3�� ����Ǿ� �ִ� ������ " + value);
		}
	
		
		System.out.println("***********************************************");
		
		/*
		 * �迭�� ��ġ ��ȣ�� ��ȭ��Ű�� �ݺ��� �ۼ�
		 * 1) ù��° ��ġ���� ���� : 0 -> 1->2 ...-> �迭�̸�.length -1
		 * 2) ��������° ��ġ���� ���� : �迭�̸�.length-1 -> ... -> 2->1->0
		 * 
		 */
		
		System.out.println("***���������� �迭�� ��ġ ��ȣ�� ��ȭ��Ű��***");
		for(int i = 0; i < iarray.length; ++i) {
			System.out.println("���� �迭�� ��ġ ��ȣ�� " + i);
		}
		
		System.out.println("***���������� �迭�� ��ġ ��ȣ�� ��ȭ��Ű��***");
		for(int i = size -1; i>=0; --i) {
			System.out.println("���� �迭�� ��ġ ��ȣ�� " + i);
		}
		
		/*
		 * ���� �˻� �˰����� �����ؼ� �迭���� ���ϴ� �����͸� ã�ƺ���
		 * 1) ã�� �����ʹ� ����ڷκ��� �Է� �ޱ� : ���� �Է� : int �����̸� ;
		 * 
		 */
		
		int find_data = 0;
		
		// ����ڰ� Ű���带 ����ϴ� ��쿡 �� �ʿ��� Scanner Ŭ������
		// ����� ���� ����� �޸� ���� ��ɹ� �ۼ�
		// -> ���ܻ�Ȳ�� ����ؼ� try~catch ���� ���� �ۼ��ϰ�
		// �ȿ� �޸� �����ϱ�
		
		// ���� ���� -> new �����ڿ� ���ؼ� �޸𸮰� ��������µ�
		// �޸𸮿� �����Ҷ� ����ϴ� ������ �޸��� �ּҰ� ����� ����
		java.util.Scanner scanner = null;
		
		// ���� ���α׷� ����ð��� ���ؼ� ������ ����
		long start_time = System.nanoTime();
		System.out.println("���� �ð��� ������ ��� �ϸ� " + start_time);
		
		try {
			
			scanner = new java.util.Scanner(System.in);
			
			// ����ڿ��� ���� �Է��� ��û�ϴ� ��ɹ�(��� ��ɹ�) �ۼ�
			
			Loop1 :
			do{
			System.out.print("�迭���� ã�� ������ �Է��ϼ��� : ");
			
			// scanner ������ ���� �ִ� nextInt() �Լ��� ����ؼ� 
			// ����ڰ� ������ �Է��� �� �ֵ��� ��
			find_data = scanner.nextInt();
			
			// ����ڰ� �Է��� ������ Ȯ���ϱ�
			System.out.println("�Է��Ͻ� ������ " + find_data + " �Դϴ�.");
			
			/*
			 * �迭�� ����� �����͵�� ����ڰ� �Է��� �����͸� 1��1�� ���ʴ��
			 * ���ϴ� �ݺ��� �ۼ�
			 * -> if(�迭�� �ִ� ������ == ����ڰ� �Է��� ������) �� ��쿡��
			 * ȭ�鿡 �Է��� �����͸� �迭���� ã�ҽ��ϴ�, �޽��� ���
			 * 
			 */
			int count = 0;
			

			
			
			for(int i = 0; i<size ; ++i) {
				if(iarray[i] == find_data) {
					System.out.println("����ڰ� �Է��� ������ " + find_data + " �� �迭�� "
							+ i + " ��ġ���� ã�ҽ��ϴ�.");
					//	++count;
					//System.out.println("������� �迭���� ã�� �������� ������ " + count);
					break Loop1;
				} 
			} 
			System.out.println("����ڰ� �Է��� " + find_data + "�� ã�� ���߽��ϴ�.");
			
			} while(true);
			
			/*
			 * �̺� �˻� �˰����� ����ؼ� �迭���� ���ϴ� �����͸� ã��
			 * 1) int left = 0;
			 * 2) int right = �迭�̸�.length -1;
			 * 3) int middle;
			 * 
			 */
			
			System.out.println("***���� �˻� �˰��� ����***");
			int left = 0;
			int right = size -1;
			int middle = 0;
			
		/*	// ���� ���α׷� ����ð��� ���ؼ� ������ ����
			long start_time = System.nanoTime();
			System.out.println("���� �ð��� ������ ��� �ϸ� " + start_time);*/
			
			while(left <=right) {
				// ���� ���� �κа� ������ �κ��� ��� ��ġ ���ϱ�
				middle = (left + right) / 2 ;
				
				// ��� ��ġ Ȯ��
				System.out.println("���� ��� ��ġ�� " + middle);
				
				if(iarray[middle] == find_data) {
					System.out.println("�迭�� " + middle + "�� ��ġ���� " + find_data + "�� ã�ҽ��ϴ�.");
					break;
				}
				else if(iarray[middle] > find_data) {
					System.out.println("�߰� ��ġ�� �ִ� ������ ���� ã������ �����Ͱ� ����");
					right = middle -1;
					
				}
				else if(iarray[middle] < find_data) {
					System.out.println("�߰� ��ġ ������ ã������ �����Ͱ� ŭ");
					left = middle + 1;
				} else {
					System.out.println("����");
					break;
				}
				
			}
			long end_time =System.nanoTime();
			System.out.println("���� �ð��� " + end_time);
			System.out.println("ó�� �ð��� " + (end_time - start_time) / 1000000000. + "��");
			
			/*
			 * java.util ��Ű���� �ִ� Arrays Ŭ������ ���� �ִ� binarySearch() �Լ��� ���
			 * 
			 * -> binarySearch() �Լ��� ��ȯ�� �迭�� ��ġ ���� ������ ����
			 * int index_found;
			 * index_found = java.util.Arrays.binarySearch(iarray,find_data);
			 * 
			 * if(index_found >=0 && index_found < size) {
			 *  // ����ڰ� �Է��� �����Ͱ� �迭�� �ִ� ���
			 *  } else {
			 *    // ����ڰ� �Է��� �����Ͱ� �迭�� ���� ��� 
			 *  }
			 *  
			 */
			int index_found;
			index_found = java.util.Arrays.binarySearch(iarray, find_data);
			if(index_found >=0 && index_found < iarray.length) {
				System.out.println("�̺� �˻� ����� ����ؼ� �迭���� "
						+ "����ڰ� �Է��� " + find_data + " �� ã�ҽ��ϴ�.");
				System.out.println("�迭������ ��ġ�� " + index_found);
			} else {
				System.out.println("�迭���� ����ڰ� �Է��� "
						+ find_data + "�� ã�� ���߽��ϴ�.");
			}
			System.out.println("��� ���� ���½��ϴ�.");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ܻ�Ȳ �߻�");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
