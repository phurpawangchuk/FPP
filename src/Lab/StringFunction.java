package Lab;

import java.util.Arrays;

public class StringFunction {
    public static void main(String[] args) {
        String str="This is fun.";
        System.out.println(str.substring(1,5));

        //split string
        String fun = "However,I was happy. This is a fun.";
        String[] temp = fun.split(",| |\\. |\\.");
        System.out.println(Arrays.toString(temp));

        //s.compareTo(t) => s<t === -1, s>t === 1
        System.out.println("a".compareTo("b")); //a<b === -1
        System.out.println("b".compareTo("a"));  // a>b == 1
    }
}
