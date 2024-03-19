package A67.Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */
public class IsSubsequence {
    public static void main(String[] args) {
        String seq1 = "axc";
        String seq2 = "ahbgdc";
        //checkSequence(seq1,seq2);
        //twoSum(new int[]{2, 3,4,5,1}, 6);
        ThreeSumZero(new int[]{-1,0,1,2,-1,-4});

    }

    private static void ThreeSumZero(int[] numbers) {
        List<List<Integer>> num = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = j; k < numbers.length; k++) {
                    if(numbers[i]+numbers[j]+numbers[k] ==0 && i != j && i !=k && j != k){
//                        System.out.println(i+ " "+j+" "+k);
//                        list.add(numbers[i]);
//                        list.add(numbers[j]);
//                        list.add(numbers[k]);
                        num.add(Arrays.asList(numbers[i], numbers[j], numbers[k]));
                    }
                }
            }
        }
        System.out.println(Arrays.asList(num));
//        System.out.println(num.get(0));
    }

    static public void checkSequence(String seq1, String seq2) {
        int count = 0;
        for(int i=0; i<seq1.length(); i++){
            for(int j=i; j<seq2.length(); j++){
                if(seq1.charAt(i) == seq2.charAt(j)){
                    count++;
                    break;
                }
            }
        }

        if(count == seq1.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static public void twoSum(int[] numbers, int target) {
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            for (int j=i+1; j< numbers.length; j++){
                sum = numbers[i]+numbers[j];
                if(sum==target){
                    System.out.println("["+(i+1)+","+(j+1)+"]");
                    i=numbers.length;
                    break;
                }
            }
        }
    }
}
