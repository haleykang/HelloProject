package march27;


/*
 * �迭�� �÷��ǿ� �ִ� ����Ʈ ����ϰ� ���ϴ� ���� �ۼ�
 */
// �÷��ǿ� �ִ� ���� ���� �ڷ� ���� Ŭ�������� ����ϱ� ���� import ��ɹ� �ۼ�
import java.util.*;

/*
 * ��� �����͵��� ������ �� �ִ� ���ο� Ŭ���� �����
 * 
 * ������ �������� ������ �� �ִ� ���� ���� : int ���� �̸� = 0;
 * ������ �Ǽ����� ������ �� �ִ� ���� ���� : double ���� �̸� = 0.0; �Ǵ� float ���� �̸� = 0.0f;
 * ������ ���ڿ��� ������ �� �ִ� ���� ���� : String ���� �̸� = "";
 * ������ �ϳ��� ���ڸ� ������ �� �ִ� ���� ���� : char ���� �̸� = ' ';
 * 
 */
class MyAllDataClass {
	
	int idata = 0;
	float fdata = 0.0f;
	double ddata = 0.0;
	String sdata = "";
	char cdata = ' ';
	// ���ο� ���� �߰� : long �ڷ��� ���
	long ldata = 0L;
	
	// ������ ������ ����ؼ� �Ѳ����� ��� �����͵��� main() �Լ��� ���� �޾ƿͼ�
	// ������ ������ ��� ������ �ϰ������� �ʱ�ȭ���ִ� add() �Լ�
	public void add(int ivalue, float fvalue, double dvalue, String svalue, char cvalue, long lvalue) {
		
		/*
		 * �Ű� ������ �ۼ� ������ �����ڰ� ���� 
		 */
		idata = ivalue;
		fdata = fvalue;
		ddata = dvalue;
		sdata = svalue;
		cdata = cvalue;
		ldata = lvalue;
		System.out.println("�� 6���� �������� ��� �ٸ� ������ �ٲ� ");
		
		/*
		 * ����� ���� add() �Լ����� �����ϱ�
		 * 
		 * -> add(int value) {}  -> add(ivalue)
		 * -> add(float value) -> add(fvalue) ....
		 */
		// �̹� ����� ���� add(int value) �Լ��� ���� �ִ� ��ɹ��� �����ϴ� ��ɹ�
		add(ivalue);
		add(fvalue);
		add(dvalue);
		add(svalue);
		add(cvalue);
		add(lvalue);
		
	
		
		
	}
	
	// �������� ������ ���ο� ������ add �Լ� ����� 
	
public void add(String svalue, char cvalue, int ivalue, float fvalue, double dvalue, long lvalue) {
		

		add(ivalue);
		add(fvalue);
		add(dvalue);
		add(svalue);
		add(cvalue);
		add(lvalue);
		
	
		
		
	}
	
	
	
	// ������ ������ ��� ������ ���������� ���Ǵ� add() �Լ� �����
	public void add(int value) {
		System.out.println("������ �����ϴ� �Լ�");
		idata = value;
		System.out.println("������ ����� ���� " + idata);
	}
	public void add(String value) {
		System.out.println("���ڿ��� �����ϴ� �Լ�");
		sdata = value;
		System.out.println("������ ����� ���ڿ� " + sdata);
	}
	public void add(double value) {
		System.out.println("�Ǽ��� �����ϴ� �Լ�");
		ddata = value;
		System.out.println("������ ����� �Ǽ� " + ddata);
	}
	public void add(float value) {
		System.out.println("float �Ǽ� ���� �Լ�");
		fdata = value;
		System.out.println("������ ����� �Ǽ�f�� " + fdata);
	}
	public void add(char value) {
		cdata = value;
		System.out.println("������ ����� ���� " + cdata);
		
	}
	public void add(long value) {
		System.out.println("Long ���� ����");
		ldata = value;
		System.out.println("������ ����� long ������ " + ldata);
	}
	
	
	
}









/*
 * Vector Ŭ������ �䳻�� ���ο� Ŭ���� �����
 * -> �Ϲ����� ����� ����ؼ� �迭�� �����Ѱ� ���
 * -> �迭�� �ڷ����� �̸� �����ϴ� ����� ��� : 
 * 			�ڷ��� + �迭�̸� [];
 * 		double darray [] ;
 */

class MyDoubleVector {
	
	
	
	
	// �Ǽ� �����͸� ������ �� �ִ� �迭 ����
	double [] darray;
	
	// Object [] object_array ; 

	
	// �迭�� �뷮(ũ��)�� ������ �� �ִ� ���� ����
	int capacity_darray = 0;
	
	// �迭�� ����Ǿ��ִ� ������ ������ �����ϴ� ���� ����
	int count_darray = 0;
	
	// �⺻ �������� ����� : ������ ���� �迭�� ũ�⸦ 10���� ������ ����
	public MyDoubleVector() {
		
		System.out.println("�⺻ ������ ����");
		this.darray = new double [10];
		this.capacity_darray = this.darray.length;
		System.out.println("���ο� �Ǽ��� �迭�� �����Ǿ����ϴ�.");
		System.out.println("�迭�� ũ��� " + this.capacity_darray);
		
	}
	
	// main() �Լ����� �迭 darray�� ũ�⸦ �޾ƿ��� ������
	public MyDoubleVector(int capacity_value) {
		System.out.println("�迭�� �뷮(ũ��)�� �޴� ������ ����");
		if(capacity_value > 0) {
		System.out.println("���� ���� �迭�� ũ��� " + capacity_value);
			this.darray = new double [capacity_value];
			this.capacity_darray = this.darray.length;
		}
		else {
			System.out.println("�迭�� �뷮(ũ��) ����");
		}
		
	}
	
	// add() �Լ��� ���� �ٸ� Ŭ�����κ��� �ϳ��� �Ǽ� �����͸� ���� ������
	// �迭 darray�� �����ϱ�
	public void add(double value) {
	System.out.println("main() �Լ����� ���� �Ǽ��� " + value);
		
		/*
		 * ���� �迭�� ������ 0 �� -> ���� count_darray�� ���� �о �� �� ����
		 */
		System.out.println("���� �迭�� ����� ������ ������ " + count_darray);
		
		/*
		 * ���ο� �������� ���� ��ġ�� ���� count_darray�� ���� �ִ� ���� ���
		 */
		System.out.println("���ο� �������� " + value + "�� �迭 ���� ��ġ�� " + count_darray);
		
		if(count_darray >=0 && count_darray < this.darray.length) {
			this.darray[count_darray] = value;
		}
		else {
			System.out.println("���� count_darray �� ����");
		}
		/*
		 * �迭 darray���� Ư�� ��ġ�� ����� �ϳ��� �Ǽ��� �������� �Լ� �����
		 * 
		 * ��ġ ���� main() �Լ��κ��� �޾ƿ��� -> �Ű� ������ �ʿ� -> int index
		 * �̸��� get()
		 * get() �Լ��� ��ȯ���� �Ǽ��ϱ� double �ڷ���
		 */
	}
	
	public double get(int index) {
	System.out.println("�迭 darray���� Ư�� ��ġ " + index + "�� �ִ� �Ǽ� ��ȯ");
		
		if(index >= 0 && index < this.darray.length) { 
			System.out.println("�迭���� �ϳ��� �Ǽ� ��������");
			double temp = this.darray[index];
			return temp;
			
		}
		else {
			System.out.println("�迭 ��ġ ����");
			System.out.println("�迭���� �Ǽ��� ������ �� �����ϴ�.");
			return 0.0;
			
			
		}
		
	}
	
	
}

public class TestArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// MyAllDataClass Ŭ������ ����ؼ� �Ѳ����� 6���� �����͸� 
		// MyAllDataClass�� �ִ� add() �Լ��� ���� �ϱ�
		
		MyAllDataClass ref_all_data2 = new MyAllDataClass();
		ref_all_data2.add(100,3.14f, 3.14,"������", 'a', 2020L);
		

		
		System.out.println("********************************************");
		
		
		// �ι�° ����
		
		ref_all_data2.add("���ڿ�", 'a', 10, 4.2f, 3.14,10L);
		
		
		System.out.println("********************************************");
		
		MyAllDataClass ref_all_data = new MyAllDataClass();
		
		// �ϳ��� ���� 100�� �����ϱ� ���� ��ɹ� 
		ref_all_data.add(100); // add(int value) {} �Լ��� ����
		
		ref_all_data.add('a');
		
		ref_all_data.add("���ڿ�");
		
		ref_all_data.add(4.2);
		ref_all_data.add(3.14f);
		

		// add(long value) -> add(���� + L(���ĺ� �빮�� ��) �Ǵ� ���� + l (�ҹ��� ��))
		
		ref_all_data.add(20202L);
		
		
		
		System.out.println("********************************************");
		
		
		// ���� ���� MyDoubleVector ���
		MyDoubleVector ref_my_double_vector = new MyDoubleVector();
		// �ִ� 10���� �Ǽ� ������ ����
		
		MyDoubleVector ref_my_double_vector2 = new MyDoubleVector(20);
		// �ִ� 20���� �Ǽ� �����͸� ������ �� �ִ� �ι�° ������
		
		// add() �Լ��� ����ؼ� ���ο� �Ǽ��� �迭�� ����
		ref_my_double_vector.add(4.2);		
		
		// get(0) �Լ��� ����ؼ� �迭�� ����� �Ǽ� �� ù���� ��ġ�� �Ǽ� �о����
		double first_double = ref_my_double_vector.get(0);
		System.out.println("MyDoubleVector�� ù��° �迭�� ������ " + first_double);
		
		
		
		// 3���� �Ǽ� �����͸� ref_my_double_vector2�� ����
		ref_my_double_vector2.add(4.2);
		ref_my_double_vector2.add(9.6);
		ref_my_double_vector2.add(11.07);
		// ref_my_double_vector2.add(12.16);
		

		System.out.println("***********************************************************");
		
		first_double = ref_my_double_vector2.get(0);
		System.out.println("ref_my_double_vector2�� ù��° �Ǽ� " + first_double);
		

		System.out.println("***********************************************************");
		
		double sec_double = ref_my_double_vector2.get(1);
		System.out.println("ref_my_double_vector2�� �ι�° �Ǽ� " + sec_double);

		System.out.println("***********************************************************");
		
		double third_double = ref_my_double_vector2.get(2);
		System.out.println("ref_my_double_vector2�� ����° �Ǽ� " + third_double);
		
		
		System.out.println("***********************************************************");
		
		
		// 1���� �迭 ����� : �ִ� 10���� ������ ������ �� �ִ� �迭 ����� �޸� ����
		int [] iarray = new int [ 10 ];
		// �������� �� ������ 10���� �ʰ��ϸ� �����͸� ������ �� ���� �迭
		
		// for �ݺ����� ����ؼ� 10���� ������ ���� ������ ������ ���� iarray��
		// ������ ��ġ ��ȣ
		for(int i = 0 ; i < iarray.length; ++i ) {
			System.out.println("�迭 iarray�� " + i + " ��ġ�� ����� ���� �����");
			
			// ���� ������ ���� ���� ����� : ���� ���� i�� �� + 1
			iarray[i] = i + 1;
			
			System.out.println("�迭 iarray [" + i + "]�� ���� " + iarray[i]);
			
		}
		
	
		/*
		 * �ڹ� �÷��ǿ��� �������ִ� ArrayList Ŭ������ ����ؼ� 10���� ���� �����͸�
		 * �޸𸮿� ���� -> ArrayList Ŭ������ �ȿ��� �迭�� ��� 
		 */
		ArrayList<Integer> ref_array_list = new ArrayList<Integer>();
		/*
		 * < > : �ȿ� ������ �����͐l �ڷ����� Ŭ���� �̸����� �ۼ�
		 * ��)<Integer> : ������ ������ �� �ִ� �ڷ���
		 * 
		 */
		
		// ArrayList Ŭ������ ���� �ִ� add() �Լ��� ����ؼ� �޸𸮿� ���ο� ���� 100�� ����
		// add(���ο� ������) -> add(100) -> add() �Լ��� 100�� ArrayList Ŭ������ ���ο� ���� �� �ִ�
		 // ������ �迭�� �������� �߰�
		ref_array_list.add(100);
		
		// ArrayList�� size() �Լ� ����� ���� �޸𸮿� ����Ǿ��ִ� ������ ���� Ȯ��
		int size_ref_array_list = ref_array_list.size();
		
		// ũ�� ���
		System.out.println("ArrayList�� ���� ���� �ִ� �������� ������ " + size_ref_array_list);
		
		// ArrayList�� �뷮 Ȯ��
		// ArrayList�� �뷮 (capacity) : �ش� Ŭ������ �����Ҽ� �ִ� �������� �ִ� ũ�� 
	// 	System.out.println("ArrayList�� �뷮�� " + ref_array_list);
		// ArrayList Ŭ���� ���ο��� �뷮�� private ��� ����� ���ǵǾ��־ 
		// �ٸ� Ŭ���������� ����� �� ����(capacity) �ȵ�
		
		// Vector Ŭ������ ����ϸ� ���� Vector Ŭ�������� ���� �ִ� �迭�� ũ��(�迭��
		// ������ �� �ִ� �������� �ִ� ����)�� ������ �� ����
		//Vector<Vector Ŭ���� ���ο� ���� �ִ� �迭�� ������ ������ �ڷ��� �ۼ� : Ŭ���� �̸����� >
		Vector<Integer> ref_vector = new Vector<Integer>();
		
		// add() �Լ��� ����ؼ�  ���θ��� Vector�� 100 ����
		ref_vector.add(100);
		
		// size() �Լ��� ����ؼ� ũ�� ���
		
		int size = ref_vector.size();
		System.out.println("Vector�� ���� �ִ� ������ �� ��" + size);
		
		// Vector �迭�� �뷮(capacity)
		int capacity = ref_vector.capacity();
		System.out.println("Vector�� �迭�� �뷮 " + capacity);
		
		//  ���ڿ��� ������ �� �ִ� Vector<String> Ŭ���� ����� �޸� ����
		Vector<String> ref_string_vector = new Vector<String>();
	
		// ���ڿ� ����
		ref_string_vector.add("������");
		
		// size() �Լ� ���
		int size_s = ref_string_vector.size();
		System.out.println("Vector<String>�� ���� �ִ� �̸� ���� " + size_s);
		
		// capacity()
		int capacity_s = ref_string_vector.capacity();
		System.out.println("Vector<String>�� �뷮" + capacity_s);
		
		/*
		 * Vector<Vector Ŭ������ ������ �������� Ŭ���� �̸� �ۼ� >
		 * 
		 * -> ������ �����Ϸ��� Vector<Integer> - Integer�� java.lang ��Ű���� �ִ� Ŭ���� �̸�
		 * -> ���ڿ� Vector<String>
		 * -> �Ǽ� Vector<Double> �Ǵ� Vector<Float>
		 * -> ���� Vector<Char>
		 * 
		 * �����ڰ� ���� ���� Ŭ���� �̸��� �ۼ��� ���� ����
		 * Vector<�����ڰ� ���� ���� Ŭ���� �̸�>
		 */
		// �Ǽ��� Vector
		Vector<Double> ref_double = null;
		
		ref_double = new Vector<Double>();
		
		// add() �Լ� ����� �Ǽ� ����
		ref_double.add(4.2);
		ref_double.add(9.6);
		ref_double.add(11.07);
		ref_double.add(12.16);
		
		ref_double.add(0.1);
		ref_double.add(0.2);
		ref_double.add(0.3);
		ref_double.add(0.4);
		ref_double.add(0.5);
		ref_double.add(0.6);
		ref_double.add(0.7);
		
		
		// size() ���
		int size_d = ref_double.size();
		System.out.println("Vector<Double>�� ũ�� " + size_d);
		
		// capacity() ���
		int capacity_d = ref_double.capacity();
		System.out.println("Vector<Double>�� ũ�� " + capacity_d);
		
		/*
		 * capacity = 10���� ����
		 * �������� ������ 11���� �Ǹ� capacity = 20���� ����
		 * 
		 * -> ������ ����� �����ʹ� ����
		 * -> Vector<Integer> Ŭ������ ����� �����͸� �������� ��� : get(�迭�� ��ġ��ȣ �ۼ�)
		 * 
		 * get (0); -> ù��° ������ ������
		 */
		
		double double_value = ref_double.get(0);
		System.out.println("ù��° �Ǽ��� " + double_value); // Vector<Double>�� �迭 ù��° ��ġ�� ����� ������ ��������
		
		/*
		 * get() �Լ��� Vector<Double> Ŭ������ ���� �ִ� ���� �Ǽ� �迭���� �ϳ��� �Ǽ� �����͸� 0 ��ġ���� ������
		 * 
		 * ����
		 * -> ��ġ ��ȣ�� ������ 0 ~ size -1 ������ ���
		 * get(size () ) ���� ��Ȳ �߻� 
		 */
		for(int i = 0; i < size_d; ++i) {
			
			double_value = ref_double.get(i);
			System.out.println(i + " ��ġ�� �ִ� �Ǽ��� " + double_value);
			
		}
		
		// Vector<Double> Ŭ������ �䳻���� MyVector Ŭ���� ����� 
		/*
		 * class MyVector {
		 * 
		 * Double [] �迭�̸� = new double [ 10 ] ;
		 * int capacity = �迭�̸�.length;
		 * int count = 0 ;
		 * 
		 *  /// ������ ���� �迭�� ���ο� �Ǽ��� �ϳ��� �������ִ� add() �Լ� �����
		 *  public void add(double value) {
		 *  �迭�̸�[��ġ ��ȣ ] = value;
		 *  }
		 *  
		 *  // ���� �迭�� ����Ǿ� �ִ� ���� ���� �Ǽ� �߿��� Ư�� ��ġ�� ����� �Ǽ��� ��ȯ�ϴ�
		 *  // get() �Լ� �����
		 *  
		 *  public double get(int index) {
		 *  	// ���� index�� ����� �迭�� ��ġ ��ȣ�� �˻� : ���� count �� ��ŭ��
		 *  	// ��ġ ��ȣ�� �˻� -> 0 ~ (count -1) 
		 * 		if (index >= 0 && index(count - 1)) {
		 * 
		 * 		return �迭�̸�[index]; // ���� index ��ġ�� ����� �ϳ��� �Ǽ��� ��ȯ
		 * 
		 * 		} else {
		 * 		System.out.println("�迭�� ��ġ ��ȣ ����");
		 * 		return 0.0;
		 * 		// �Ǵ� throw ��ɾ ����ؼ� ������ ���ο� ���ܻ�Ȳ�� �޴� ��ü ����� 
		 * 		// throw new ���ܻ�Ȳ�� �޴� Ŭ�����̸� () ;
		 * 		// throw new Exception("�迭�� ��ġ ��ȣ ���� ����");
		 * 	
		 *  	
		 *  
		 *  }
		 *  
		 * 
		 *  Ŭ�����̸�<Double> : ���׸���(Generics) : Ŭ���� �Ϲ�ȭ : C++ ������ ���ø�
		 *   -> Ŭ�������� ����� �ڷ����� �ٸ� Ŭ�������� ���߿� �����ִ� ���
		 *   -> new �����ڸ� ����ؼ� �޸𸮿� ���ο� ��ü�� ����� ������ Ŭ������ �ڷ����� ����
		 *   	-> new Ŭ�����̸�< Ŭ������ ������ �ڷ��� �̸��� Ŭ���� �̸����� �ۼ� > ();
		 *   	-> new MyClass1<Integer>() : // MyClass1  Ŭ������ Integer Ŭ���� �̸��� ����
		 *   		-> ���� �ڷ��� ���� ���
		 *   class MyClass {
		 *   Integer �迭�̸� [] = new Integer [10]; 
		 *   } // -> ���� �츮�� �ϴ� ���
		 *   
		 *   class MyClass<E> {
		 *    // E : new Ŭ�����̸�<Integer>() ���� < Integer> ��ü�� �޴� �̸�
		 *    // E�ƴ϶� �ٸ� �̸� �ᵵ ��
		 *    }
		 *    
		 *    class MyClass<A> { // new MyClass1<Integer>() ��ɾ�� <Integer> ��ü�� <A>�� ���� 
		 *    
		 *    A -> Integer -> �޸𸮿� ������ �迭�� ����
		 *    A -> Double -> �޸𸮿� �Ǽ��� �迭�� ����
		 *    A -> String -> �޸𸮿� ���ڿ� �迭�� ����
		 *    A -> Float -> �޸𸮿� �Ǽ��� �迭�� ����
		 *   }
		 *   
		 *  ������ Ÿ��(�ڷ���)�� �����ϴ� ������ ����
		 *  -> ������ �ڷ��� + �����̸� ;
		 *  -> Integer int_v1;
		 *  
		 *  -> <> �� ����ϴ� ����� ��� 
		 *  new Ŭ�����̸�<Integer> () -> �� �޸𸮿� ���ο� ��ü�� ��������� ������ Ŭ�������� ����� 
		 *  �迭�� �ڷ����� Integer�� ���� ���� 
		 *  
		 *  A �迭�̸� [] ;
		 *  
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
	}

}
