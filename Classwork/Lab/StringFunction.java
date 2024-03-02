package Lab;

import java.util.Arrays;

public class StringFunction {
    public static void main(String[] args) {
//        String str="This is fun.";
//        System.out.println(str.substring(1,5));

        //split string
//        String fun = "However,I was happy. This is a fun.";
//        String[] temp = fun.split(",| |\\. |\\.");
//        System.out.println(Arrays.toString(temp));

        String records =
                "523E,Paper Pad Set,109,Congdon and Chrome,2.45:"+
                "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:"+
                "176A,Romance Nove1 1,20,Barnes and Noble,3.50:"+
                "176B,Romance Nove1 2,20,Barnes and Noble,3.50:"+
                "176C,Romance Nove1 3,20,Barnes and Noble,3.50:";
        String[] temp = records.split(":");
        for(String s: temp){
            System.out.println(s.split(",")[0]);
        }
//        System.out.println(Arrays.toString(temp));

        //s.compareTo(t) => s<t === -1, s>t === 1
//        System.out.println("a".compareTo("b")); //a<b === -1
//        System.out.println("b".compareTo("a"));  // a>b == 1
    }
}
