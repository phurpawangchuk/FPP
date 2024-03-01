package Lab;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> number = new HashMap<>();
        number.put(102, 222);
        number.put(103, 333);
        number.put(105, 555);
        number.put(104, 444);
        number.put(106, 666);
        number.put(null,  null);
        System.out.println(number);

    }
}
