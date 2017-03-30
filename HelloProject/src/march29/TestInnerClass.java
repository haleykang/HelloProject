package march29;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 먼저 독립적인 클래스 만들기
class MyOuterFrameClass extends Frame {
	
	Button bt1 = new Button("1");
	
	
	// 하나의 버튼 클릭 이벤트 전용 처리 함수를 갖는 내부 클래스 만들기
	private class MyInnerClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ae) {
			// 어떤 버튼인지 구별할 필요 없음
			
			System.out.println("버튼 1에서만 사용하는 명령문");
		}
	}
	
	// 내부 클래스응 사용하기 위해서는 new를 사용해서 새로운 객체를 만든다음
	// 버튼에 연결
	// 버튼 참조 변수.addActionListener(new 클래스이름() 명령어의 주소를 받는 변수);
	// 1. MyInnerClass 변수이름1 = new MyInnerClass();
	// 2. Button 버튼변수이름1 = new Button("안녕");
	// 3. 버튼변수이름1.addActionListener(변수이름1);
	
	// 다른 객체에서도 사용할 수 있는 내부 클래스 객체
	MyInnerClass ref_inner_ob = new MyInnerClass();
	//  사용하는 명령문이기때문에 생성자 함수 또는 함수 또는 중괄호 안으로 들어가야함 
	// 우선 여기서는 중괄호 안으로!
	{
		bt1.addActionListener(ref_inner_ob);
	}
	
	Button bt2 = new Button ("2");
	{
		bt2.addActionListener(new MyInnerClass());
		// 버튼2에서만!!! 여기서만 사용 할 수 있게 만들기
	}
	
}

// 지금까지 주로 작성했던 클래스 구조

class MyChildFrame extends Frame implements ActionListener {
	
	// 모든 버튼 객체에서 사용할 수 있는 actionPerformed() 전역 함수
	@Override
	public void actionPerformed (ActionEvent ae) {
		// 아래에 있는 여러 개의 버튼들을 구변하는 조건문이 꼭 필요
		
		Object ref_event = ae.getSource();
		if(ref_event instanceof Button) {
			Button ref_clicked = (Button)ref_event;
			
			if(ref_clicked == bt1) {
				System.out.println("첫 번째 버튼 클릭");
			} 
			else if (ref_clicked == bt2) {
				System.out.println("두 번째 버튼 클릭");
			}
			else if (ref_clicked == bt3) {
				System.out.println("세 번째 버튼 클릭");
			}
			else if (ref_clicked == bt4) {
				System.out.println("네 번째 버튼 클릭");
			}
			else {
				System.out.println("잘못된 접근");
			}
		}
		
	}
	
	Button bt1 = new Button("1");
	Button bt2 = new Button("2");
	Button bt3 = new Button("3");
	Button bt4 = new Button("4");
}

public class TestInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
