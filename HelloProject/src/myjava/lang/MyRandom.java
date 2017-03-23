package myjava.lang;

/*
 * 
 *  사용자가 이름을 여러개 입력하면 거기서 한 사람을 랜덤하게 뽑아주는 프로그램
 *  
 *  1~10 명까지 입력 할 수 있게 -> 사용자가 원하는 갯수를 선택
 *  랜덤 숫자 생성
 *  사용자에게 입력받기
 *  
 */

import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * 창 구상
 * 
 * 첫번째 줄 : 사용자가 원하는 갯수 만큼의 숫자를 입력 라벨 / 텍스트필드
 * 두번째 줄 : 랜
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
		
		int count = 0; // 사용자가 입력하는 숫자
		int user_input [ ];
		String user_input2 ="";
		
		
		// 사용자가 입력한 숫자만큼 만들어지는 배열 선언
		
		int random = 0;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
		System.out.print("원하시는 갯수를 입력해주세요 : ");
		count = scanner.nextInt();
		user_input = new int[count]; // 5개의 배열 생성
		// 이 생성된 배열의 갯수 만큼 데이터를 사용자가 입력해야함
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류 발생");
			e.printStackTrace();
			
		}
		
		

	}

}
