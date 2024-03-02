package Lab.Interface;

public class DigitSequence implements IntSequence{

    int num;

    DigitSequence(){}
    DigitSequence(int i)
    {
        num = i;
    }

    public static void reverse(IntSequence seq){
        int result=0;
        while(seq.hasNext()){
            System.out.print(seq.next());
        }
    }

    @Override
    public boolean hasNext() {
        return num != 0;
    }

    @Override
    public int next() {
        int r = num % 10;
        num /= 10;
        return r;
    }

}
