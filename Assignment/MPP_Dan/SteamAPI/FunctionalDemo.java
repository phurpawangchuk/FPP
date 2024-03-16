package MPP_Dan.SteamAPI;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */
public class Function {
    public static void main(String[] args) {

        char[] charArray = {'a','b','c','d'};
        System.out.println(new String(charArray));
        java.util.function.Function<char[], String> ss = c -> new String(c);
        java.util.function.Function<char[], String> r = String::new;

        System.out.println(ss.apply(charArray));
        System.out.println(r.apply(charArray));
    }
}
