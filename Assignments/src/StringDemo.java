import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Phurpa";
		String str2 = "Phurpa";
		String str3;
		

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		boolean str12 = str1 == str2;
		System.out.printf("\n%s = %s is %b",str1,str2,str12);
		
		str3 = str1;
		boolean b1 = str3 == str1;
		System.out.printf("\n%s = %s is %b",str3,str1,b1);
		
		String str4 =  new String(str1);
		boolean b2 = str4 == str1;
		System.out.printf("\n%s = %s is %b",str3,str4,b2);
		
		String str5 =  new String(str1);
		boolean b3 = str4 == str5;
		System.out.printf("\n%s = %s is %b",str5,str4,b3);
		
		String str6 =  str1;
		boolean b4 = str1 == str6;
		System.out.printf("\n%s = %s is %b",str1,str6,b4);
		
		
		System.out.printf("\n%s + %s is %s",str1,str2,str1.concat(str2));
		
		String commaseperator = str1+","+str1+","+str2;
		
		String[] words = commaseperator.split(",");
		
		for(String w: words) {
			System.out.printf("%s ",w);
		}
		System.out.println(Arrays.toString(words));
		
	}

}
