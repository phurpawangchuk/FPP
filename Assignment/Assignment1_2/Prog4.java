package Assignment1_2;

public class Prog4 {
    public static void main(String[] args) {
        float f1 = 1.27f;
        float f2 = 3.881f;
        float f3 = 9.6f;

        int sum = (int)(f1+f2+f3);
        int sum1 = Math.round(f1+f2+f3);

        System.out.println("First sum: "+sum);
        System.out.println("Second sum: "+sum1);
    }
}
