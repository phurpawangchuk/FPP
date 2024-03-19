package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class SquareArraySort {
    public static void main(String[] args) {
        int[] arr = {3,4,-2,-1,0,6,5};
        for(int i=0; i< arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }

        sortArray(arr);
        printResult(arr);
    }

    private static void printResult(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void sortArray(int[] arr) {
        for(int i=0; i< arr.length; i++){
            int min = findMinPos(arr, i);
            swap(arr,i,min);
        }
    }

    private static int findMinPos(int[] arr, int j) {
        int min = arr[j];
        int pos = j;
        for(int i=j+1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                pos = i;
            }
        }
        return pos;
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min]= temp;
    }
}
