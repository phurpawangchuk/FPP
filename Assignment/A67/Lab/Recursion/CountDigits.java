package A67.Lab.Recursion;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class CountDigits {

    public static void main(String[] args) {
        int res = countDigit(987653234);
        System.out.println(res);
    }

    private static int countDigit(int num) {
        if(num <=9 ){
            System.out.println("Base Case");
            return 1;
        }
        else{
            int res = countDigit(num/10);
            int sum = 1+ res;
            System.out.println("N:"+num+" SUm:"+sum);
            return sum;
        }
    }

}
