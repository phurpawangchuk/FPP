package Lab.Interface;

public class IntImp implements IntSequence {
    int number;

    IntImp(){

    }

    public int getNumber() {
        return number;
    }

    public static int computeSum(IntSequence o, int num){
        int sum = 0;
        int count = 0;
        while (o.hasNext() && count < num){
            sum += o.next();
            count++;
        }
        return sum;
    }

    @Override
    public boolean hasNext() {
//        return getNumber() != 0;
        return true;
    }

    @Override
    public int next() {
        return number++;
    }
}
