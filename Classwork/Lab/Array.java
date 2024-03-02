package Lab;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {9,8,7,6,5,4};
        int[] result = new int[arr1.length+arr2.length];

        System.arraycopy(arr1,0,result, 0, arr1.length);
        System.arraycopy(arr2,0,result, arr1.length, arr2.length);
        System.out.println(Arrays.toString(result));
    }
}
