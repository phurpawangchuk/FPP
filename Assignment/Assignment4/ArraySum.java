package Assignment4;



public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int sum = arraySum(arr, 0);
        System.out.println("Sum of array:"+sum);
    }

    private static int arraySum(int[] arr, int index) {

        if(index == arr.length)
            return 0;
        else {
            int sum = arr[index]+ arraySum(arr, index+1);
            System.out.println(sum);
            return sum;
        }
    }
}
