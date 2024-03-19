package A67.Lab.HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> table = new HashMap<>(5);
        table.put("100", "Abc1");
        table.put("200", "Abc2");
        table.put(null, "ApplceMac");
        table.put(null, "ApplceMac1"); //Allow only one null

        System.out.println("\n\n");
        for(Map.Entry<String, String> entry: table.entrySet()){
            System.out.println("Key:"+entry.getKey()+",Value:"+entry.getValue());
        }

        System.out.println(table.keySet()); //all the table keys [null,100,200]
        System.out.println(table.values()); //all the table values [Abc1, Abc2, AppleMac1
        System.out.println(table.containsKey("200")); // true
        System.out.println(table.containsValue("Abc2")); // true
        System.out.println(table.get(null)); //ApplceMac1

        for (Map.Entry entry: table.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
