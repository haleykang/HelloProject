package march10;

/*
 * �ݺ����� �̸�(�� �̸�)�� ����� ���� �ۼ�
 */

import java.util.*;


public class TestLabelCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2���� �ݺ����� ��ø�ǰ� �����
		 * -> �ݺ��� �ȿ� �ݺ��� ����� 
		 */
		
		// ù��° �ݺ������� ����ϴ� ���� ����
		int i; // �迭�� ��ġ�� ����Ҷ� ���� ����ϴ� ���� -> index�� i
		
		// �ι�° �ݺ������� ����ϴ� ���� ����
		int j;
	
		try {
			
			// õ��° �ݺ����� �ۼ��ϱ� ���� ��ġ �̸� �ۼ�
			Loop1 :
				for(i = 1; 1 <= 10; ++i) {
					
					// �ι�° �ݺ����� �ۼ��ϱ� ���� ��ġ �̸��� �ۼ�
					Loop2 :
						for(j = 1; 1 <= 20; ++j){
							
							// ������ �����ϴ� ��쿡  break ��ɹ� �ۼ��ϱ�
							
							if(j == 10) {
								System.out.println("���� j�� ���� 10�̵�");
								System.out.println("break�� ����ؼ� ���� �ݺ����� Ż��");
								// break; // Loop2 �ݺ����� ����� Loop1 �ݺ������� ��
								break Loop1;
							}
							else {
								// ȭ�鿡 ���� i�� j�� ���� ���
								System.out.println("���� ���� i�� ���� " + i + ", ���� j�� ���� "+ j);
		
							} // end of else
							
						} // end of for(j=0...)
		
/*System.out.println("break; ��ɹ��� �������ϴ�.");
System.out.println("�ι�° �ݺ����� ������ϴ�.");*/

				}
		
System.out.println("ù��° �ݺ����� ������ϴ�.");
// �ڹٿ��� �ڷ� ���� 
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� �߻�");
			System.out.println("������ " + e.getMessage()); 
			e.printStackTrace(); // �� �ڼ��� ��������
		}

	}

}
