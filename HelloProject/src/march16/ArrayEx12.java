package march16;

import java.util.*;

public class ArrayEx12 {
	
	// ���� ���� ���ڿ��� ������ �� �ִ� ���ڿ� �迭 ����
	String [] str_array1 = null;
	
	// ���ο� ���� ���� ���ڿ��� ���� �� �� �ִ� �迭 ����� ������ ���ڿ� ����
	String [] str_array2 = {"��浿", "���浿","�ٱ浿","��浿","���浿"};
	
	// ������ ���� str_array2 �迭�� ���� �̾��� ��� �̸����� ����� �迭 �غ�
	
	String [] str_copy_array2 = new String[str_array2.length];
	
		
	/*
	 * ���ο� �Լ��� copy()�� ���� ������ �̸��� ���� �ִ� �迭 str_array2�� ����
	 * �о�ͼ� ���ο� �迭�� str_copy_array2�� �����ϱ�
	 */
	public void copy() {
		
		System.out.println("����� �̸��� �о�ͼ� �ٸ� �迭�� �����ϱ�");
		
		for(int i = 0; i<this.str_array2.length; ++i) {
			this.str_copy_array2[i] = this.str_array2[i];
			System.out.println(i + " ��ġ�� ����� �̸��� " +
				this.str_copy_array2[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayEx12 ref_ob = new ArrayEx12();
		ref_ob.copy();
		
/*		
		// ���� ���� ���ڿ��� ������ �� �ִ� ���ڿ� �迭 ����
		String [] str_array1 = null;
		
		// ���ο� ���� ���� ���ڿ��� ���� �� �� �ִ� �迭 ����� ������ ���ڿ� ����
		String [] str_array2 = {"��浿", "���浿","�ٱ浿","��浿","���浿"};
		
		// ������ ���� str_array2 �迭�� ���� �̾��� ��� �̸����� ����� �迭 �غ�
		
		String [] str_copy_array2 = new String[str_array2.length];
		
		
			 
		
		 * ���ο� �Լ��� copy()�� ���� ������ �̸��� ���� �ִ� �迭 str_array2�� ����
		 * �о�ͼ� ���ο� �迭�� str_copy_array2�� �����ϱ�
		 
		public void copy() {
			
			System.out.println("����� �̸��� �о�ͼ� �ٸ� �迭�� �����ϱ�");
			
		}*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		String [] name = new String [3];
		name[0] = "Kim";
		name[1] = "Park";
		name[2] = "Yi";
		
		String [] name1 = new String[] {"Kim", "Park", "Yi"};
		
		String [] names = {"Kim", "Park", "Yi"};
		
		///////////////////////// ���� �Ѱ� /////////////////////////////
		// �����ϴ� ������ ����ڷκ��� �Է� �ް� �迭�� ���� �� ���
		
		String [] fruit = null;
		
		try{
		System.out.println("�����ϴ� ������ ����� �Բ� �Է����ּ���"
				+ "(�� : ��� ����)");
		String input_fruits = scanner.nextLine();
		fruit = input_fruits.split(" ");
		
		System.out.print("�Է��Ͻ� ������");
		
		// for(int i = 0; i < fruit.length; ++i ) {
		
		for(String upfor : fruit) { // ���� for�� ���
			
			System.out.print(" " + upfor);
		}
		
		System.out.println(" �Դϴ�.");
		
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
			
		}
		
		System.out.println("*************������ ���� �Ѱ�***************");
		
		for(int i = 0; i <names.length; ++i) {
			System.out.println("names["+i+"] : " + names[i]);
		}
		
		String tmp = names[2]; // �迭 names�� �� ��° ��Ҹ� tmp�� ����
		System.out.println("tmp : " + tmp);
		
		names[0] = "Yu"; // �迭 names�� ù ���� ��Ҹ� "Yu"�� ����
	
		for(String str : names) // ����  for��
			System.out.println(str);

	} // out of main

}
