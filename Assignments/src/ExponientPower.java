
public class ExponientPower {

	public static void main(String[] args) {
		double result = power(2.0,5);
		System.out.println(result);
		

	}

	public static double power(double x, int n) {
		if(n==1)
		 return x;
		return x * power(x, n-1);
	}

}
