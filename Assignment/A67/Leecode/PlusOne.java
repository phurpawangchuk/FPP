package A67.Leecode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
public class PlusOne {
    public static void main(String[] args) {
        int arr[] = new int[]{9};
        plusOne(arr);
    }
    public static void plusOne(int[] digits) {
        int num = 0;
        int len = digits.length;
        for (int i = 1; i<=len ; i++) {
            num += digits[i-1] * (int)Math.pow(10,len-i);
        }
        num = num+1;

        String str = String.valueOf(num);

        for (int i = 0; i<str.length() ; i++) {
            //digits[i] = Character.getNumericValue(str.charAt(i));
        }

        System.out.println(Arrays.toString(digits));
    }
}
