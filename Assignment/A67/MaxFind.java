package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class MaxFind {
    public static void main(String[] args) {
        int max = findMaxValue(10);
        System.out.println("Max: "+max);
    }

    private static int findMaxValue(int n) {
        if (n == 2)
            return 1;
        else if (n == 3)
            return 2;

        int result = 1;
        while (n > 4) {
            result *= 3;
            n -= 3;
            System.out.println("result: "+result);
            System.out.println("n: "+n);
        }

        return result * n;
    }
}
