package Lab;

public class ComputeArraySum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = computeArraySum(array, 0);
        System.out.println("Sum: " + sum);
    }

    private static int computeArraySum(int[] arr, int i) {
        if(i == arr.length)
            return 0;
        return arr[i]+computeArraySum(arr, i+1);
    }
}
