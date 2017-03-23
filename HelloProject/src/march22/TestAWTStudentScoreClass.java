package march22;


/*
 * 그리드레이아웃 이용해 - 배열 5행 2열
성적 입력 + 총점 구하는
화면 구성 
1번째 줄 : 국어점수 출력 라벨 + 국어점수 입력 텍스트 필드
2번째 줄 : 영어점수 출력 라벨 + 영어점수 입력 텍스트 필드
3번째 줄 : 수학점수 출력 라벨 + 수학점수 입력 텍필
4번째 줄 : 총점 구하기 버튼만 있음
 * 5번째 줄 : 총점 결과 출력 되면 가능
 * 
 */

// 일단 필요한 클래스 import

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyScoreFrame extends Frame implements ActionListener {
	
	/* 
	 * 2.필요한 변수 : 입력된 국어 점수, 입력된 영어 점수, 입력된 수학 점수, 총점 저장 변수
	 * 1.필요한 라벨 & 텍스트 필드 선언
	 */
	
	// 국어 점수 입력 창
	private Label kor_label = new Label("국어 점수 : ");
	private TextField kor_tf = new TextField("",20);
	
	// 영어 점수 입력 창
	
	
	
	
	
	
	public MyScoreFrame() {
		// 기본 생성자
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class TestAWTStudentScoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
