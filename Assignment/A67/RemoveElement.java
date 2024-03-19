package A67;

import java.util.Arrays;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-03-03
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[]  arr = {11,21,3,14,5,3,3,16};
        int val = 3;
        int[] expected = removeElement(arr, val);
        System.out.println(Arrays.toString(expected));
        Arrays.sort(expected);
        System.out.println(Arrays.toString(expected));
    }

    private static int[] removeElement(int[] arr, int val) {
        int length = findArrLength(arr,val);
        int[] clean = new int[length];
        int k=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                clean[k++] = arr[i];
            }
        }

        return clean;
    }

    private static int findArrLength(int[] arr,int val) {
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != val){
                count++;
            }
        }
        return count;
    }
}
