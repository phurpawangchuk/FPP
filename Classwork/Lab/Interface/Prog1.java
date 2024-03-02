package Lab.Interface;

public class Prog1 extends DigitSequence {
    public static void main(String[] args) {
//        IntSequence obj = new IntImp();
//        System.out.println("sum==="+computeSum(obj, 10));

        IntSequence obj = new DigitSequence(12345);
        reverse(obj);

    }
}
