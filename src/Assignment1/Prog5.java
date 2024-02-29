import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] arr1 = {5,6,-4,3,1};
        int[] arr2 = {3,8,9,11};
        int[] temp = new int[arr1.length+arr2.length];

        System.arraycopy(arr1,0,temp,0,arr1.length);
        System.arraycopy(arr2,0, temp,arr1.length,arr2.length);
        System.out.println(Arrays.toString(temp));
    }
}
