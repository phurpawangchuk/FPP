package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-03-03
 */
public class MissingFirstNumber {
    public static void main(String[] args) {
        int[] arr  = {1,2,4,7};
        int res = firstMissingPositive(arr);
        System.out.println(res);
    }

    public static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int i = 0;
        while(i < length){
            int sahi = nums[i]-1;
            System.out.println(sahi+ " = "+nums[sahi]);
            if (nums[i] > 0 && nums[i] < length && nums[i] != nums[sahi]) {
                swap(nums, i, sahi);
            }else{
                i++;
            }
        }
        for(int idx = 0; idx < length; idx++){
            if(nums[idx] != idx + 1){
                return idx+1;
            }
        }
        return length + 1;
    }
    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
