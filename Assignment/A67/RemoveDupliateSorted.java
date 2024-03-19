package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-03-03
 */
public class RemoveDupliateSorted {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3};
        int[] expected = new int[4];
//        int count=0;
//        count = countRepeatedNum(arr);
//        System.out.println(" = " + count);
//        System.out.println(count);

        int[] nums = {0, 0, 0,1, 1, 1, 1, 2,2, 3, 3,3,4,5};
        int length = removeDuplicates(nums);

        // Print the modified array up to the length with duplicates removed
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
    public static int removeDuplicates(int[] nums) {
//        {0, 0, 0,1, 1, 1, 1, 2,2, 3, 3,3,4,5};
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int idx = 2;
        for (int i = 2; i < n; i++) {
            // Check if the current element is a duplicate
            if (nums[i] != nums[idx - 2]) {
                // If not a duplicate, move it to the correct position
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }

    private static int countRepeatedNum(int[] arr) {
        int count = 2;
        if(arr.length < 2)
            return arr.length;

        //1,1,1,2,2,2,3
        for(int i=2; i<arr.length; i++){
            if(arr[i] == arr[count-2]) {
            }else{
                count++;
                //arr[count] = arr[i];
            }
        }
        return count;
    }
}
