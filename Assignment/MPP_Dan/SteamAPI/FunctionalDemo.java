package MPP_Dan.SteamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */

public class FunctionalDemo {
    public static void main(String[] args) {

        String s1 = "sdadbutsad";
        String s2 = "dd";
        System.out.println(s1.indexOf(s2));

        char[] charArray = {'a','b','c','d'};
        System.out.println(new String(charArray));

        Function<char[], String> ss = c -> new String(c);
        Function<char[], String> r = String::new;

        System.out.println(ss.apply(charArray));
        System.out.println(r.apply(charArray));

        int arr[] = new int[5];
        Function<int[], Integer> aa = new Function<int[], Integer>() {
            @Override
            public Integer apply(int[] ints) {
                return ints.length;
            }
        };

        Function<int[], Integer> a1 = (a) -> a.length;
        System.out.println("Length ="+aa.apply(new int[4]));

        List<String> str = Arrays.asList("Today","is","Friday");
        System.out.println(str);

        String[] strArray = str.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(strArray));
        System.out.println(str.toArray());
    }
}
