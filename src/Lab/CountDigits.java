package Lab;

public class CountDigits {
    public static int countNumberOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println((n / 10));
        return 1 + countNumberOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345789;
        int digitCount = countNumberOfDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}