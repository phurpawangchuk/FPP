package A67.Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElement(nums, val);
      //  System.out.println(k);
    }

    private static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                nums[count]=nums[i];
                count++;
            }
        }

        for(int i=0; i< count; i++){
            System.out.print(nums[i]+" ");
        }
        return count;
    }
}
