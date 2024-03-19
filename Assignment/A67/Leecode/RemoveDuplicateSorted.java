package A67.Leecode;

import java.util.Arrays;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-10-03
 */
public class RemoveDuplicateSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,1,1,1,1,2,2,3,3,3,4,4,4,5,5,5,6,6,8,8,9};
        int k = removeDuplicatesNum(arr);
//        System.out.println(k);
    }

    private static int removeDuplicatesNum(int[] arr) {
        int[] num = new int[arr.length];
        int count = 0;
        int j=0,i=0;
        int  k = 0;
//        {0-0, 1-0, 2-0,3-1, 4-1, 5-1, 6-1, 7-2,8-2, 9-3, 10-3,11-3,12-4,13-5};
        for(i=j; i<arr.length; i++){
            for(j=i+1; j<arr.length; j++){
                if(arr[i] != arr[j]){
               // }else{
                    num[k++] = arr[i];
                    break;
                }
            }
            count = 0;
            i = j-1;
//            System.out.println("j = "+j);
        }
        if(arr[i-1] != arr[i-2]){
            num[k] = arr[i-1];
        }
        for( i= 0; i<num.length; i++){
            System.out.print(num[i]+" ");

        }
        return num.length;
    }
}
