package A67.Lab.Recursion;

public class SumofGivenNumber {
    public static void main(String[] args) {
        int num = 5;
        int sum = findSumofNum(num);
        System.out.println("Sum: "+sum);
    }

    private static int findSumofNum(int num) {
        // TODO Auto-generated method stub
       if( num ==0 ) return 0;
       return findSumofNum(num-1)+num;

    }
    
}
