package march17;

/*
 * �ζ� ��ȣ ���� �ٽ� �ѹ� �غ���
 * 
 * 1. �켱�� �Լ� ���� ����
 * 2. 1~45���� ���� �迭 �־����
 * 3. �� �� 6�� ��ȣ�� ���� -> �ߺ����� �ʵ���!
 * 
 */

// Random �Լ� ����� ����

import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class MyAnything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 1~45���� ���ڸ� �����ϴ� �迭 ����
		
		int [] no_array = new int [45];
		
		// ���� ���� ������ ���� ����
		Random random = new Random();
		
		
		// 2. ������ �迭�� 1~45���� ���ڸ� �����ϱ� ���� for �ݺ��� ���
		// �߰��� no_array�� ���̸� �����ϴ� ��������
		int size = no_array.length;
		
		for(int i = 0; i < size; ++i) {
			
			no_array[i] = i + 1;
			// ����� �����ƴ��� Ȯ��
			System.out.println("�迭��ġ " + i + "�� ����Ǿ��ִ� ���� " + no_array[i]);
			// no_array[0] = 1; .. �̷��� ���� 
			
		}
		// ������ 6���� ���ڸ� �����ϱ� ���� �迭 ����
		int [] r_array = new int [6];
		// �����ϰ� ������ ���ڸ� �����ϱ� ���� int ���� ����
		int random_no = 0;
		
		// for �ݺ����� ���� ������ 6���� ��ȣ ���� �� r_array �迭�� ����
		
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
			// ���� �迭�� ����Ǿ��ִ� �� Ȯ��
		
			System.out.println("r_array[0] ��ġ�� ����Ǿ��ִ� ���� " + r_array[0]);
			System.out.println("r_array[0] ��ġ�� ����Ǿ��ִ� ���� " + r_array[1]);
			System.out.println("r_array[0] ��ġ�� ����Ǿ��ִ� ���� " + r_array[2]);
			System.out.println("r_array[0] ��ġ�� ����Ǿ��ִ� ���� " + r_array[3]);
			System.out.println("r_array[0] ��ġ�� ����Ǿ��ִ� ���� " + r_array[4]);
			System.out.println("r_array[0] ��ġ�� ����Ǿ��ִ� ���� " + r_array[5]);
			
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
			System.out.println("�迭��ġ " + i + "�� ����Ǿ��ִ� ���� " + r_array[i]);*/
			// ������� �ϸ� ������ ���ڰ� �ڲ� ����..
			
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

	




