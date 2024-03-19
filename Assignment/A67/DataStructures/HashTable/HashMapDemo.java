package A67.DataStructures.HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Keys");
        productMap.put(2, "Books");
        productMap.put(3, "Systems");
        productMap.put(4, "Mobile");

        for(Map.Entry<Integer, String> entry: productMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }

        productMap.keySet(); //all the keys
        productMap.values(); //all the values
        System.out.println(productMap.containsKey(4)); //true
        System.out.println(productMap.get(null)); //null
        System.out.println(productMap.containsValue("Books")); //true
        productMap.put(7, "Samsung");
        productMap.put(7, "Samsung");
        productMap.put(null, "Apple");
        productMap.put(null, "AppleMac");
        System.out.println(productMap); //{null=AppleMac, 1=Keys, 2=Books, 3=Systems, 4=Mobile, 7=Samsung}
    }
}