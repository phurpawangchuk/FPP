package A67.Lab.Exception;

import Assignment1_2.RandomNumbers;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-16-03
 */
public class MyClass {
        public static void main(String[] args) {
            new MyClass();
        }
        MyClass() {
            recurse("Hellow");
        }
        String recurse(String s) {

            int n = s.length();
            System.out.println(n);

            if (n == 1){
                return null;
            }
            if (n % 2 == 0)
                return recurse(s.substring(0, n / 2));
            else {
                return recurse(s.substring(n / 2, n));
            }

    }
}
