
public class MyTest {

		 public static String str;
		 public static int count;
		 public boolean result;
	
	public class Demo15 {
		
		 public static void main(String[] args) {
			 MyTest d2 =new MyTest();
			 d2.str = "Hello";
			 d2.count = 20;
			 d2.result = false;
			 MyTest d1 = new MyTest();
			 d1.str = "Hi";
			 d1.count = 15;
			 d1.result = true;
			 System.out.println(d1.str); //Hi
			 System.out.println(d2.str); //Hello
			 System.out.println(d1.count); //15
			 System.out.println(d2.count); //20
			 System.out.println(d1.result);//true
			 System.out.println(d2.result); //false
		 }	
		}
		
}
