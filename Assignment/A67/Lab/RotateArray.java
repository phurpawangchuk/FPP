package A67.Lab;

import java.util.Arrays;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6};
        int len = arr.length - 1;
        rotateNum(arr, 4);
    }


    private static void rotateNum(int[] arr, int k) {
        k %= arr.length;
        reverseNum(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        reverseNum(arr,0,k-1);
        System.out.println(Arrays.toString(arr));

        reverseNum(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseNum(int[] arr, int i, int length) {
        while(i<length) {
            int temp = arr[i];
            arr[i] = arr[length];
            arr[length] = temp;
            i++;
            length--;
        }
    }
}
