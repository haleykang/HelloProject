package march20;

import java.awt.*;
import java.awt.event.*;

/*
 * FlowLayout 배치 관리자를 사용하는 예제
 * BorderLayout 배치 관리자를 FlowLayout 배치 관리자로 바꾸기
 * 
 * -> Frame 클래스가 갖고 있는 setLayout() 함수를 사용해야 배치 관리자를 변경 가능
 * 
 * 예) 
 * 1. Frame ref_frame = new Frame("윈도우 타이틀");
 * 2. ref_frame.setLayout(새로운 FlowLayout() 객체 생성);
 * -> 기본적으로 Frame 클래스가 갖고 있는 BorderLayout 배치 관리자가
 * FlowLayout 배치 관리자로 변경 됨 
 * 
 * -> ref_frame.setLayout(null); // 버튼의 위치와 크기를 지정해야함
 * 
 * 
 */

// 프로그램 종료를 처리해주는 클래스 만들기
/*
class MyWindowClosingClass777 extends java.awt.event.WindowAdapter {
	public void windowClosing(java.awt.event.WindowEvent we) {
		System.exit(0);
	}
}*/
/*
 * 위처럼 하면 항상 부모 클래스 지정 + 실행하는 함수 + 명령문 작성
 */
/*
 * 더 간단하게 하는 방법 : new 클래스이름() -> 일회용 객체를 만들 다음에
 * 새로 만든 객체의 주소를 특정 메소드에 전달하는 방법
 * 
 * thi.addWindowListener(new WindowAdapter() {
 * public void windowClosing(WindowEvent we) {
 * System.exit(0);
 * }
 * });
 * 
 * 1. new WindowAdapter() 명령어 실행 -> 메모리에 WindowAdapter 클래스가 생성
 * 2. 메모리에 들어갈 명령문을 갖는 메소드를 재정의 ->public void 메소드이름(입력 변수 선언) {}
 * 3. {} 중괄호 안에 명령문 작성 
 * -> extends 명령어와 부모 클래스가 없는 문법 
 */

import java.awt.*;
import java.awt.event.*;

public class TestFlowLayoutClass extends Frame {
	// 여러 개의 버튼들을 넣을 수 있는 FlowLayout 배치 관리자 만들기
	FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT, 5, 5);
	
	// 5개의 버튼들을 보관할 수 있는 배열 선언과 5개의 주소를 저장할 수 있는 변수 만들기
	Button [] button_array = new Button [5];
	
	// 생성자를 만든 다음에 5개의 버튼들을 생성
	public TestFlowLayoutClass() {
		for(int i = 0 ; i < button_array.length; ++i) {
			button_array[i] = new Button((i+1) + ""); // "1","2"...
		}
		
		
		// setLayout() 함수를 실행해서 BorderLayout -> FlowLayout으로 변경
		this.setLayout(flowLayout);
		// 이제는 5개의 방향을 사용할 수 없음
		// 이제는 한줄의 배치 관리자를 사용
		
		// 한줄의 배치 관리자에 5개의 버튼들을 넣기
		for(int i = 0; i < button_array.length; ++i) {
			this.add(button_array[i]);
			
		}
		
		// 윈도우 종료 이벤트
		// new 클래스이름() 명령어를 직접 사용 
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		// 각각의 버튼에서 발생하는 클릭 이벤트를 받기 위한 명령문 작성
		for(int i = 0; i < button_array.length; ++i) {
			button_array[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent ae) {
					// TODO Auto-generated method stub
					System.out.println("사용자가 버튼을 클릭했습니다.");
					
				}
			});
		}
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestFlowLayoutClass ref_frame = new TestFlowLayoutClass(); 

	}

}
