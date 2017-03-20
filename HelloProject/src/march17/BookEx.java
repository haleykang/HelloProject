package march17;

public class BookEx {
	public static void main(String [] args) {
		
		short sMin = - 32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1));
		
		System.out.println("cMin =" + (int)cMin);	
		System.out.println("cMin-1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)++cMax);
				
		float f = 9.12345678901234567890f ;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		 System.out.printf("	123456789012345678901234%n");
		 System.out.printf("f		: %f%n", f); //소수점 이하 6째자리까지 출력
		 System.out.printf("f 	: %24.20f%n", f);
		 System.out.printf("f2 	: %24.20f%n", f2);
		 System.out.printf("d  	: %24.20f%n", d);
		
		 f = 9.1234567f;
		 int i = Float.floatToIntBits(f);
		 
		 System.out.printf("%f%n", f);
		 System.out.printf("%X%n", i); // 16진수로 출력
		 
		 d = 85.4;
		 int score = (int)d;
		 System.out.println("d="+d);
		 System.out.println("score="+score);
		 
		 i = 10;
		 byte b = (byte)i;
		 System.out.println(i);
		 System.out.println(b);
		 
		 i = 300;
		 b = (byte)i;
		 System.out.println(i);
		 System.out.println(b);
		 
		 i = -2;
		 System.out.println(Integer.toBinaryString(i)); // 10진 정수를 2진 정수로 변환
		 
		  f = 9.1234567f;
		  d = 9.1234567;
		  double d2 = (double)f;
		  
		  System.out.printf("%20.18f\n", f);
		  System.out.printf("%20.18f\n", d);
		  System.out.printf("%20.18f\n", d2);
		  
		 
	}

}
