package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-03-03
 */
public class BestToBuy {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,14};

        //find min
        //find max after the min pos
        // find difference

        int minPos = findMinPosition(arr);
        if(minPos == arr.length){
            System.out.println("Cannot");
        }
        int maxValue = findMaxPositionValue(arr, minPos);
        System.out.println("Profit ="+ (maxValue-arr[minPos]));

    }

    private static int findMaxPositionValue(int[] arr, int minPos) {
        int max = arr[minPos];
        for(int i=minPos+1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int findMinPosition(int[] arr) {
        int min = arr[1];
        int pos = 1;
        for(int i=2; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                pos = i;
            }
        }
        return pos;
    }
}
