package march20;

import java.awt.*;
import java.awt.event.*;

/*
 * �������̽� ���� ����� : ���� ����� ���� - ��� + �޼ҵ��� ����(�Ӹ� �κ�)
 * -> ��ɹ��� ��� �޴� ���� �ƴ� 
 * 
 */

class MyClass10 {
	
	// �Ϲ� ����
	int a = 10;
	// ���
	static final int b = 20;
	// �Լ�
	public void method() {
		//�Ϲ����� �޼ҵ忡���� ��ɹ��� ���� ����
		System.out.println("method() in MyClass10");
	}
	
}

class MyChildClass10 extends MyClass10 {
	
	// ��� ���� ���� a, ��� b, �޼ҵ� method() �� ��� ����
	public void new_method() {
		System.out.println("��� ���� ���� a�� ���� " + a);
		System.out.println("��� ���� ��� b�� ���� " + b);
		System.out.println("��� ���� method() �� ����");
		this.method();
	}
	
}


/*
 * �������̽��� ��Ģ : ����� �߻� �޼ҵ�(��ɹ��� ���� �޼ҵ�)�� �ۼ� 
 * �߻� �޼ҵ� :�޼ҵ��� �Ӹ� �κи� �ִ� �޼ҵ�(���� ��ɹ��� ���� �޼ҵ�)
 * ��) �Ϲ� �޼ҵ� : �Ӹ��� ��ü
 * public void method() // �Ӹ�
 * {// ��ü�� ����
 *   // ��ɹ� �ۼ�
 *   } // ��ü�� ����
 *
 *
 * �߻� �޼ҵ� : abstract ��ɾ ����ؼ� �޼ҵ带 ����
 * -> public abstract ��ɾ� + ��ȯ�� + �̸�(�Է� ���� ����);
 * 
 * ��) public abstract void abs_method1();
 *  // �߻� �޼ҵ�� �߰�ȣ ��ȣ�� ���� ����
 *  	// �� ���������� ��ɹ��� ���� �޼ҵ�
 *  
 *  
 *   public abstract void abs_method2();
 *   public abstract int abs_add(int a, int b);
 *   public int add(int a, int b) {
 *    // �Ϲ� �޼ҵ�� �߰�ȣ�� ������ �� 
 *    
 *    
 *    new �������̽��̸�() -> ����
 *    new �Ϲ�Ŭ�����̸�() -> ����
 *    
 *    �޸��� �ּҸ� �����ϴµ� ����� �� ���� 
 *    -> �������̽��̸� �����̸� = new �Ϲ�Ŭ�����̸�(); // ����
 *    -> �������̽��̸� �����̸� = new �������̽��̸�(); // ����
 *    
 *   }
 */

/*
 * ���� ���� ���� + �Ǽ� ���� ����
 * 2���� �������̽��� ���� ��꿡 ����� �޼ҵ��� ǥ���� ���ϱ�
 * 
 * �޼ҵ��� ��ȯ�� + �̸� + �Է� ���� 
 * 
 * int iadd_method( int a, int b) ; // ���� ���� �Լ�
 * double dadd_method(double a , double b) ; // �Ǽ� ���� �Լ�
 * double idadd_method(double a , int b); // �̼� + ���� ����
 */
// ���� ���� ��꿡 ����� �޼ҵ���� �߻� �޼ҵ�� ����
interface I1 {
	// 2���� ���� ������ ����� �޼ҵ��� �Ӹ� �κи� ����
	public abstract int iadd_method(int a, int b);
	
	// 2���� ���� ������ ����� �޼ҵ� �Ӹ� ����
	public abstract int isub_method(int a, int b);
	
	// 2���� ���� ����
	public abstract int imul_method(int a, int b);
	

	
}

// �Ǽ� ���� ��꿡 ����� �޼ҵ���� �߻� �޼ҵ�� ����
interface I2{
	// �Ǽ� ���� �޼ҵ� ���� ����
	public abstract double dadd_method(double a, double b);
	// �Ǽ� �E��
	public abstract double dsub_method(double a, double b);
	// �Ǽ� ����
	public abstract double dmul_method(double a, double b);

	
}

// ���ο� ���� Ŭ������ ����µ� ���� ����� ����� ������ ����
// 2���� �������̽����� ���� �޼ҵ��� ���� �κе��� �״�� ���� �ޱ�

class MyMultiCalcClass implements I1,I2 {
	
	// ���� ���̽��� �ִ� �޼ҵ��� �Ӹ� �κа� ��ü �κ��� �� �ۼ�
	// -> abstract ��ɾ�� ����
	public int iadd_method(int a, int b) {
		System.out.println("���� ���� �Լ�");
		return a+b;
	}
	public int isub_method(int a, int b) {
		System.out.println("���� ���� �Լ�");
		return a-b;
	}
	public int imul_method(int a, int b) {
		System.out.println("���� ���� �Լ�");
		return a*b;
	}
	
	
	public double dadd_method(double a, double b) {
		System.out.println("�Ǽ� ���� �Լ�");
		return a+b;
	}
	public double dsub_method(double a, double b) {
		System.out.println("�Ǽ� ���� �Լ�");
		return a-b;
	}
	public double dmul_method(double a, double b) {
		System.out.println("�Ǽ� ���� �Լ�");
		return a*b;
	}
	
	
}
/*

 * ���α׷� ����(������ �ݱ� ����)�� ���ִ� Ŭ���� �����
 
class MyMultiCalcWindowClosing extends WindowAdapter {
	
	// �ڹ� ���� �ӽ��� �����ϴ� windowClosing(�̺�Ʈ ������ �޴� ���� ����)
	// �Լ��� ������
	public void windowClosing(WindowEvent windowEvent) {
		System.exit(0);
	}
}*/

class MyButton extends Frame {
	
	
	Button button1 = new Button ("1");
	Button button2 = new Button ("2");
	Button button3 = new Button ("3");
	Button button4 = new Button ("4");
	Button button5 = new Button ("5"); 
	
	public MyButton(){
	
	this.add(BorderLayout.CENTER, this.button1);
	this.add(BorderLayout.WEST, this.button2);
	this.add(BorderLayout.EAST, this.button3);
	this.add(BorderLayout.NORTH, this.button4);
	this.add(BorderLayout.SOUTH, this.button5);
	
	}
	
}

class MyButton2 extends Frame {
	
	// Button [] mybutton = new Button [5];
	

	/*for(int i = 0; i < 5; ++i) {
		
		String res = "button" + (i +1);
		
		mybutton[i] = new Button(res);*/
		
		
	//}
	
	
}



/*class MyButton extends Frame {
	
	String [] array = new String [5];
	Button [] button = new Button [];
	
	
	
	// Button [] button = new Button [5]
	
	for(int i = 0; i < this.array.length; ++i) {
	
		array[i] = "button" + (i+1);
		
		
	}

	
	this.add(BorderLayout.CENTER, button[0]);
	this.add(BorderLayout.WEST, button[1]);
	this.add(BorderLayout.EAST, this.button[2]);
	this.add(BorderLayout.NORTH, this.button[3]);
	this.add(BorderLayout.SOUTH, this.button[4]);
	
}
*/



public class TestInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyButton ref_button = new MyButton();
		ref_button.setSize(100,100);
		ref_button.addWindowListener(new MyWindowClosingClass());
		
		ref_button.pack(); // �ڵ����� ũ�� ���ڰ�
		ref_button.setVisible(true);
		
		
		MyMultiCalcClass ref_calc = new MyMultiCalcClass();
		
		double res = 0;
		res = ref_calc.iadd_method(10, 20);
		System.out.println(res);
		
		
		
	
	}

}
