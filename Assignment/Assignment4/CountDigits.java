package Assignment4;

public class CountDigits {
    public static void main(String[] args) {
        int num = 1234;
        int result = countDigits(num);
        System.out.println("Digit count:"+result);
    }

    private static int countDigits(int num) {
        if(num == 0)
            return 0;
        else
           return countDigits(num/10) + 1;
    }
}
