package A67.Leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-10-03
 */
public class ConvertRoman2Integer {
    public static void main(String[] args) {
        int res = convertToInteger("XXVII");
        System.out.println(res);
    }

    private static int convertToInteger(String str) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int res = 0;
        int pre = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            int currentValue = roman.get(c);

            if(currentValue > pre ){
                res += currentValue - 2*pre;
            }else {
                res += currentValue;
            }
            pre = res;
        }
        return res;

    }
}
