
public class MinCharInAString {

	public static void main(String[] args) {
		char result = findMinChar("XSBzxrdrbf");
		System.out.println(result);

	}

	private static char findMinChar(String string) {
		if(string.length() ==1)
			return string.charAt(0);
		else {
			char first = string.charAt(0);
			char second = findMinChar(string.substring(1));
		
			return first < second ? first: second;
		}
	}

}
