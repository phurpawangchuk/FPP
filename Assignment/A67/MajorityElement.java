package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 *
 * @year 2024-03-03
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3,3,3,2,2,2,3,3};
        int res = findMajority(arr);
        System.out.println("Max count = "+res);

    }

    private static int findMajority(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int c = findCount(arr, i);
            if(c>count){
                count = c;
            }
        }
        return count;
    }

    private static int findCount(int[] arr, int i) {
        int count = 0;
        for(int j=i; j<arr.length; j++){
            if(arr[j] == arr[i]){
                count++;
            }
        }
        return count;
    }
}
