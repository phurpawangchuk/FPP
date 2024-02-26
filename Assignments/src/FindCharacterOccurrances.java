import java.util.Scanner;

public class FindCharacterOccurrances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		int count = 0;
		char c = 'p';
//		
//		for(int i=0; i<name.length(); i++) {
//			if(name.charAt(i) == c) {
//				count++;
//			}
//		}
		while (!name.equals("exit")) {
		char[] nametochar = name.toCharArray();
		count = 0;
		for(char ch: nametochar) {
			if(ch == c) {
				count++;
			}
		}

		System.out.printf("\n%c = %d character",c,count);
		System.out.println("Enter your name (exit to end):");
		 name = input.nextLine();
		}
		
		//System.out.printf("\nName : %s has %c = %d character",name,c,count);

	}

}
