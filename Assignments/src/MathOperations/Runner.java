package MathOperations;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		Operation ob = new Addition();
		 
		 byte b1 = 127;
		 byte b2 = 100;
		 int b3 = 234;
		 byte res3 = (byte)(b1 + b2);
		 
		 int num = 10;
		 System.out.println("res1="+(num >> 1)); //5
		
		 
		 do{
		 System.out.println("cc="+num--);
		 }while(num >> 1 >= 5);
		 
		 //System.out.println("num >> 1 ="+(num >> 1));
		 
		 String str = null;
		 System.out.println("String is empty or null==");
		 
		 if(str == null | str.equals("")){
			 System.out.println("String is empty or null");
		 }
		 
		 
		 int a = 3;
		 int b = 6;
		 int res1 = a << 1;
		 int res2 = b >> 2;
		 
//		 System.out.println("a="+Integer.toBinaryString(a)); //11
//		 System.out.println("b="+Integer.toBinaryString(b)); //110
//		 
//		 System.out.println("res1="+Integer.toBinaryString(res1)); //110
//		 System.out.println("res2="+Integer.toBinaryString(res2)); //1
////		 
		 System.out.println("res1="+res1); //6
		 System.out.println("res2="+res2); //1
		 
		 
		 
//		 
//		 
//		 System.out.println("res1="+a);
//		 System.out.println("res2="+b);
		
//		char uCase = Character.toUpperCase(ch);
//		
//		Character.toUpperCase(uCase);
//		
//		int iCase = (int)uCase;
//		
//		System.out.println(iCase);
		
//		String str = "ABCDEFGH";
//		System.out.println(str.substring(5));
		
		
	
	}

	

}
