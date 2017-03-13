package march13;

/*
 * [�ǽ�] ����� �ַ� ����ϴ� ���Ƚ� ǥ����� ���� �״�� �޴� ���ο� �Լ� �����
 * 
 * ���� : ù��° ���� ���� ����, ������ ���� ����, �ι�° ���� ���� ����
 * 
 * ��) 10 '+' 20
 * 
 */

import java.util.*;

public class TestMethodClass {
	
	static int control_calc_method(int a, char op, int b) {
		
		int res = 0;
		
		/*
		 * ���� if���� ����ؼ� ������ ���ڸ� �޴� ���� op�� �˻�
		 * ���� op�� ������ ���ڸ� main() �Լ��� ���� ���� ����
		 * char op = '+'; // main() �Լ����� '+' �����ڸ� ������ ���
		 */
		
		System.out.println("main() �Լ��� ���� ���� �����͵��� ���");
		System.out.println("ù��° ������ " + a);
		System.out.println("�����ڴ� " + op);
		System.out.println("�ι�° ������ " + b);
		
		// �������� �Է��� ���� �׽�Ʈ
		/*
		 * ���� if ���� �ۼ� �ϱ� : main() �Լ��� ���� ���� �����ڰ� + �� ��� ���� ����� 
		 * res�� ���� -> ������� ��ȯ
		 * 
		 */
		
		
		if( op == '+') {
			System.out.println("�ΰ��� ������ ���մϴ�.");
			res = a + b;
		}
		else if ( op == '-') {
			System.out.println("�ΰ��� ������ ���ϴ�");
			res = a - b;
		}
		else if ( op == '*') {
			System.out.println("�ΰ��� ������ ���մϴ�.");
			res = a * b;
		}
		else if ( op == '/' || op == '%') {
			
			if(b == 0) {
				System.out.println("� ���� 0���� ���� �� �����ϴ�.");
			}
			else {
				System.out.println("�ΰ��� ������ �����ϴ�.");
				
				if( op == '/'){
					System.out.println("���� ���մϴ�.");
					res = a / b;
				}
				else {
					System.out.println("�������� ���մϴ�.");
					res = a % b;
				}
			}
			
			
			
		}
		return res;
		
	}
	
	static int control_calc_method(char op, int a, int b) {
		
		int res =0;
		
		
		
		return res;
	}
	
	static int control_calc_method(int a, int b, char op) {
		
		int res = 0;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ �ۼ��� control_calc_method() �Լ��� �����ϱ�
		// �������� ������ ����, �ϳ��� ����, ����
		
		/*control_calc_method(10,'+',20);
		control_calc_method(10,'-',20);
		control_calc_method(10,'*',20);
		control_calc_method(10,'/',20); // ������ ��
		control_calc_method(10,'%',20); // ������ ������
		control_calc_method(10,'>',20); // �� ���� ��û
		 */		
		
		// ������ �ۼ��� ��� ��ɹ��鿡���� ������ 10, 20�� ��� -> ���� ���

		// 2���� ������ ����ڷκ��� �Է� �ް� �����ϴ� ���� ����
		int a = 0, b = 0;
		
		// ��� ����� ������ �ӽ� ���� ����
		int res = 0;
		
		// ������ ���� ����
		char op = ' ';
		
		//Ű���� �Է¿� ����� Scanner ���� ����� �޸� ����
		Scanner scanner = new Scanner(System.in);
		
		// ����ڰ� �Է��� ������ ���ڿ��� �����ϴ� ���� ����� �ʱ�ȭ
		String input = "";
		
		// ���� ó�� try~catch
		try {
		
			/*
			 * ����ڷ� ���� ������ ���ٷ� �Է� �ޱ�
			 * ��) 10 ���� ������ ���� 20
			 * ��) 10 ��ǥ ������ ��ǥ 20
			 */
			
			System.out.print("���ٷ� ������ �Է��ϼ���(�� : 3 + 4) : " );
			input = scanner.nextLine();
			
			// split() �Լ��� ����ؼ� ����ڰ� �Է��� 2���� ������ �ϳ��� ������ ���ڸ�
			// String [] �迭�� ����
			// ù ��°�� �Է��� ������ String[0] ù ��° ��ġ�� ����
			// �� ��°�� �Է��� ���ڴ� String[1] �� ��° ��ġ�� ����
			// �� ��°�� �Է��� ������ String[2] �� ��° ��ġ�� ����
			
			String str_split [] = input.split(" ");
			
			// �迭�� ����� ���� �ƴ��� Ȯ��
			
			System.out.println("�迭�� ù��° ��ġ�� " + str_split[0]);
			System.out.println("�迭�� �ι�° ��ġ�� " + str_split[1]);
			System.out.println("�迭�� ����° ��ġ�� " + str_split[2]);
			
			/*
			 * �츮�� ���α׷����� ������� ���� �����ڸ� �ɷ�����(���� ��� �߰�)
			 * -> ��Ģ �����ڸ� ����� ����
			 * 
			 * ������ ���ڴ�  str_split[1] ��ġ�� ���ڿ� ���·� ����Ǿ� ���� -> ��) "+"
			 * 
			 * ��� 1) ���ڿ� ���·� ���ϱ� : equals() �Լ��� ��� : equals("���� ���ڿ�")
			 *  ->  if(str_split[1].equals("+") == true) -> ������ ���� ��쿡�� ����ڰ� + �����ڸ� �Է��� ���
			 *  -> �ݺ�
			 *  
			 * ��� 2) charAt() �Լ� ���
			 *  "+" ���ڿ� �����͸� �ϳ��� ���ڷ� �ٲ� �Ŀ� ���ϱ� 
			 * �����ڸ� �ϳ��� ���ڸ� ������ �� �ִ� ������ ������ ������ ���� op�� ���
			 * op = �ϳ��� ������ ���ڸ� ����;
			 * charAt() -> ���ڿ����� Ư�� ��ġ�� �ִ� �ϳ��� ���ڸ� ���� �� �� ����
			 * 
			 * str_split[1] -> "+"
			 * ������ ù��° ������ +�� �������� ��ɹ� �ۼ� : ù��° ������ ��ġ�� 0(��)
			 * -> �迭�� ����Ǿ� �ֱ� ����
			 * 
			 * op = str_split_array[1].charAt(0);
			 * 
			 * -> if( op == '+') -> �̷��� ���ǽ��� �����ϰ� ���� ����
			 * �Ǵ� || �� �����ڸ� ����ؼ� �ϳ��� ���ǽ����� �ۼ� ����
			 * 
			 * if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
			 * -> �ϳ��� ��ġ�ϴ� ��� ���� 
			 * 
			 */
			
			op = str_split[1].charAt(0);
			
			// ���α׷����� ����� �� �ִ� ������������ �˻��ϱ�
			// ��Ģ �����ڴ� ���, �׿��� �����ڴ� ������� ����
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.println("����� �� �ִ� ��Ģ ���� �Դϴ�.");
				System.out.println("������ ���� �Լ��� ����");
				
				/*
				 * 1. ����ڰ� �Է��� ù��° ���� ���ڿ��� ������ ��ȯ�� �Ŀ� ���� a�� ����
				 * -> parseInt() ���
				 * 2. ����ڰ� �Է��� �ι�° ���� ���ڿ��� ������ ��ȯ�� �Ŀ� ���� b�� ����
				 * 
				 */
				a = Integer.parseInt(str_split[0]);
				b = Integer.parseInt(str_split[2]);
				
				// 3. ���Ƚ� ǥ����� �޴� �Լ��� �����ؼ� ��Ģ ���� �ϱ�
				
				res = control_calc_method(a, op, b);
				
				// 4. ��� ����� ���� �ִ� ���� result�� ���� ȭ�鿡 ����ϱ�
				System.out.println(a + " " + op + " " + b + " " + "=" + " " + res);
				
			}
				
			else {
				System.out.println("����� �� ���� ������ �Դϴ�.");
				}
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� �߻�");
			System.out.println("������ " + e.getMessage());
			e.printStackTrace();
		}

	}

}
