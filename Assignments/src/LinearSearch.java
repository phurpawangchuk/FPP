
public class LinearSearch {

	public static void main(String[] args) {
		Object[] arr = { 1, 3, 25, 6, 7, 8, 12, 34 };

		Object[] obj = { "Abc", "Bab", "asa", "avv", "xyx" };

		int pos = linearSearch(arr, 0, 25);
//		int pos = linearSearch(obj, 0, "avv");
		

		if (pos == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("position ==" + pos);
		}
	}

	private static int linearSearch(Object[] arr, int i, Object value) {
		if (i == arr.length)
			return -1;
		else if (value.equals(arr[i]))
			return i;
		else
			return linearSearch(arr, i+1 , value);
	}

}
