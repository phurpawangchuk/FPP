package A67.Lab.Recursion;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-08-03
 */
public class ReverseString {
    public static void main(String[] args) {
        String res = reverseString("APPLE");
        int[] arr = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr.clone()));

       // System.out.println("Stre==="+res);
    }

    private static String reverseString(String str) {
        if(str.equals(""))
            return str;
        return reverseString(str.substring(1))+str.charAt(0);

    }

}
