
public class DataConversion {

	public static void main(String[] args) {
		int x = 123456789;
		long y = x;
		double z = x;

		System.out.println("Intger:"+x);
		System.out.println("long:"+y);
		System.out.println("double:"+z);

		byte b1 = 1;
		byte b2 = 2;

//		byte sum = b1 + b2; // Type mismatch: cannot convert from int to byte
		byte sum = (byte) (b1 + b2);
		System.out.println(sum);
		
		int isum = b1 + b2;
		System.out.println(isum);
	}
}