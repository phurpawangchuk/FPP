package Assignment1_2;

public class Prog6 {
    public static void main(String[] args) {
        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int min = min(arr);

        System.out.println("Min:"+min);
    }
    static int min(int[] arrayOfInts){
        int min = arrayOfInts[0];
        for(int i=1; i< arrayOfInts.length; i++){
            if(arrayOfInts[i] < min)
                min = arrayOfInts[i];
        }

        return min;
    }
}
