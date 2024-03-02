package Assignment4;

public class DigitsReverse {
    public static void main(String[] args) {
        int digits = 1234;
        reverseNumber(digits);
    }

    private static void reverseNumber(int num) {
        if(num == 0)
            return;
        else{
            System.out.print(num%10);
            reverseNumber(num/10);
        }
    }
}
