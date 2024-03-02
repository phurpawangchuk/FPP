package Lab;

public class NumOfDigits {
    public static void main(String[] args) {
        int num = 12345678;
        int result = findNumberOfDigit(num);
        System.out.println(result);
    }

    private static int findNumberOfDigit(int num) {
        if(num ==0)
            return 0;
        return 1+findNumberOfDigit(num/10);
    }

}
