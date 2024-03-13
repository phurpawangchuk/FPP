package A67.Lab.Recursion;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class printNumber {
    public static void main(String[] args) {
        printNumbers(5,0);
    }

    private static void printNumbers(int num, int count) {
        if(count == num) return;
        {
            count = count + 1;
            System.out.print(count);
            printNumbers(num, count);
        }

    }
}
