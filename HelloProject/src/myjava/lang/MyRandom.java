package myjava.lang;

/*
 * 
 *  ����ڰ� �̸��� ������ �Է��ϸ� �ű⼭ �� ����� �����ϰ� �̾��ִ� ���α׷�
 *  
 *  1~10 ����� �Է� �� �� �ְ� -> ����ڰ� ���ϴ� ������ ����
 *  ���� ���� ����
 *  ����ڿ��� �Է¹ޱ�
 *  
 */

import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * â ����
 * 
 * ù��° �� : ����ڰ� ���ϴ� ���� ��ŭ�� ���ڸ� �Է� �� / �ؽ�Ʈ�ʵ�
 * �ι�° �� : ��
 * 
 */

class RandomFrame extends Frame implements ActionListener {

	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class MyRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0; // ����ڰ� �Է��ϴ� ����
		int user_input [ ];
		String user_input2 ="";
		
		
		// ����ڰ� �Է��� ���ڸ�ŭ ��������� �迭 ����
		
		int random = 0;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
		System.out.print("���Ͻô� ������ �Է����ּ��� : ");
		count = scanner.nextInt();
		user_input = new int[count]; // 5���� �迭 ����
		// �� ������ �迭�� ���� ��ŭ �����͸� ����ڰ� �Է��ؾ���
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� �߻�");
			e.printStackTrace();
			
		}
		
		

	}

}
