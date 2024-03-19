package A67.Lab;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class FindSumInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,3,7,2,6,4};
        int sumToFind = 9;
        findSumInArray(arr, sumToFind);

    }

    private static void findSumInArray(int[] arr, int sumToFind) {
       for(int i=0; i< arr.length; i++){
           for(int j=i+1; j< arr.length; j++){
               if(arr[i]+arr[j] == sumToFind){
                   System.out.println(i+" and "+j+"  "+arr[i]+"+"+arr[j]);
                   //i = arr.length;
               }
           }
       }

    }
}
