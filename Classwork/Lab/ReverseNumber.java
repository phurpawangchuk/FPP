package Lab;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=123456;
        int res = reverseNumber(num);
    }

    private static int reverseNumber(int num) {
        if(num ==0)
            return 0;
        System.out.print(num%10);
        return reverseNumber(num/10);
    }
}
