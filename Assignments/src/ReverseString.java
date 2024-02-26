
public class ReverseString {

	public static void main(String[] args) {
		ReverserString("Java");

	}

	private static void ReverserString(String string) {
		if(string.length() ==0 || string.equals("")) {
			return;
		}
		
		ReverserString(string.substring(1));
		System.out.print(string.charAt(0));
		
	}

}
