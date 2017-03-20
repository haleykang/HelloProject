package march20;

/*
 * ȭ�鿡 ���ο� â�� ����ϴ� ���� + ��� ���� ����
 * 
 */

import java.awt.*;
import java.awt.event.*;


// ������ ���� �̺�Ʈ�� ó�����ִ� ��ɹ�(System.exit(���� ���� ��))�� ����
// Ŭ���� �����
// �ڹ� ���� �ӽ��� �˰� �ִ� �Լ� �̸��� windowClosing()
// �Լ� ������ ��ҹ��� �����ؼ� �ۼ� �� �� : windowClosing
// ���ο� ��ɹ��� ���� �θ� Ŭ���� �����

class MySecondWindowClosing extends WindowAdapter {
	// ��� ����� ����ؼ� ���ο� �ڽ� Ŭ������ ����
	// �ڹ� ���� �ӽ��� ã�� Ŭ���� �̸��� WindowAdapter
	// Ŭ������ ���� �ִ� ���� ���� �Լ� �� windowClosing�� ã��
	// 1. ���� Ŭ���� ã�� WindowAdapter
	// 2. �� ������ �Լ� ã�� windowClosing
	public void windowClosing(WindowEvent windowEvent) {
		System.exit(0); // ���� 0�� ���������� ���α׷��� ����Ǿ��ٴ� �����
		// �ý��ۿ� �˷��� 
	}
	
	
}

/*
 * class ���ο� Ŭ���� �̸� {
 *	// �� Ŭ������ �ڹ� ���� �ӽ��� �������� �ʴ� Ŭ����  
 *
 * }
 */

class MyParentClass {
	public void method() {
		System.out.println("method() �Լ� [�θ� Ŭ����]");
	}
}

class MyChildClass extends MyParentClass {
	
	// �ƹ��� ������ �ۼ����� ������ ���� Ŭ�������� ������ ��ɹ��� �״�� ���
	// System.out.println("method() �Լ�[�θ� Ŭ����]"); ��ɹ��� ��� 
}

// 2���� ��ǥ�� �����ϴ� Ŭ����
class PointClass {
	
	private int x = 10;
	private int y = 20;
	
	public void show() {
		System.out.println("���� x ��ǥ�� " + x + ", y ��ǥ�� " + y);
	}
}

// 3���� ��ǥ�� �����ϴ� Ŭ����
class Point3Class {
	
	private int x = 10;
	private int y = 20;
	private int z = 30;
	public void show() {
		System.out.println("���� x ��ǥ�� " + x + ", y ��ǥ�� " + y + ", z ��ǥ�� " + z);
	}
}

// ��� ����� ����ؼ� ���ο� �ڽ� Ŭ���� �����
class Point32Class extends PointClass {
	
	private int z = 30;
	
	/*
	 * ���� Ŭ�������� ���� z�� show() �Լ��� ����
	 * 
	 * �θ� Ŭ������ PointClass���� x,y,show() �Լ��� ���� 
	 * 
	 */
	public void show() {
		// super.show() �θ� Ŭ������ ���� �ִ� show() �Լ��� ����
		super.show();
		// this.show(); // �ڽ��� show() �Լ��� ���� -> ���ȣ�� ���
		// -> ���� �ݺ����� ���� -> ���� �޸𸮰� ������ ���ܻ�Ȳ�� �߻�
		// -> �ٸ� �Լ��̸�();
		
		System.out.println("���� �߰��� ���� z�� ���� " + z);
		
		
	}
}

public class TestMySecondWindowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �θ� Ŭ������ �޸𸮿� �����ϰ� method() �Լ� ���
		MyParentClass ref_parent_ob = new MyParentClass();
		ref_parent_ob.method();
		
		// �ڽ� Ŭ������ �޸𸮿� �����ϰ� ��ӹ��� method() �Լ� ���
		MyChildClass ref_child_ob = new MyChildClass();
		ref_child_ob.method();

	}

}
