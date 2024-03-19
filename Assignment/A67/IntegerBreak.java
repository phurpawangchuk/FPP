package A67;

import static java.lang.Math.pow;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-03-03
 */
public class IntegerBreak {
    public static void main(String[] args) {
        double res = findMaxProduct(12);
        System.out.println("\nMax = "+res);
    }

    private static double findMaxProduct(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int quotient = n / 3;
        int remainder = n % 3;
        if (remainder == 0) {
            for (int i=0; i<quotient; i++){
                System.out.print("3*");
            }
            return pow(3, quotient);
        } else if (remainder == 1) {
            for (int i=1; i<quotient; i++){
                System.out.print("3*");
            }
            System.out.print("4");
            return pow(3, quotient - 1) * 4;
        } else {
            for (int i=0; i<quotient; i++){
                System.out.print("3*");
            } System.out.print("2");
            return pow(3, quotient) * 2;
        }
    }
}
