/*
 * ��� �ۼ� Ŭ���� �����
 */
public class ControlClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if���� ���ǿ� ����� ���� ����� �ʱ�ȭ
		boolean condition = true;
		
		// if ���� �ۼ��ؼ� ������ ���̸� ȭ�鿡 �ȳ��ϼ��並 ���
		if(condition)
			System.out.println("�ȳ��ϼ���?");
		
		// ���� condition�� ���� �������� �ٲٱ�
		condition = false;
		
		if(condition) // if(false) -> ���� �ƴϹǷ� ������ ���� 
			System.out.println("������� �ʴ� ��ɹ�");
		
		/*
		 * ���ǿ��� �� �����ڸ� ��� �� �� ����
		 * 
		 * ��, ���ǿ� ��� �����ڴ� ��� �� �� ���� -> ����� ����(true �Ǵ� false)�� �ƴ�!
		 * 
		 * ������ ��(true) �Ǵ� ����(false)
		 * 
		 * 1) == �� ������ : ������ ��, ���ʰ� �������� ���� ���ٸ�
		 * if ( condition == true )
		 * if ( false == true ) // �ٸ��Ƿ� ����� ����
		 * if ( true == true ) // �����Ƿ� ����� ��
		 * if ( false == false ) // ���� �� �����Ͱ� 2�� �̹Ƿ� �� 
		 * 
		 */
		if(condition == false)
			System.out.println("condition==false�� ���̱� ������ ����");
		
		if(condition == true)
			System.out.println("condition==true�� �����̱� ������ ������� ����");
		
		/*
		 * 2) != �� ������ : 2���� ���� �ٸ� �� ���� �� ������
		 * 
		 * if(condition != true) -> if(false != true) -> ��
		 * 
		 */
		
		if(condition != true)
			System.out.println("condition != true�� ���̱� ������ ����");
		
		/*
		 * 
		 * 3) > : ���� �����Ͱ� ������ ������ ���� ū ��� ��
		 * 
		 * int a = 10;
		 * int b = 20;
		 * 
		 * if(a>b) -> if(10>20) -> ����
		 * if(b>a) -> if(20>10) -> ��
		 * 
		 */
		
		/*
		 * 
		 * 4) < : ���� �����Ͱ� ���� ��� ��
		 * 
		 * 
		 */
		
		int a = 10;
		int b = 20;
		
		if(a<b)
			System.out.println("10<20 ���̱� ������ ����");
		else
			System.out.println("10<20 ���̱� ������ ���� �ȵ�");
		
	}

}
