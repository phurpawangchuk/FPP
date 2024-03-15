package A67.Lab.HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */

public class HashTable {
    public static void main(String[] args) {
        HashMap<String, String> table = new HashMap<>(5);
        table.put("100", "Abc1");
        table.put("200", "Abc2");
        table.put("300", "Abc3");
        table.put("400", "Abc4");
        table.put("500", "Abc5");
        table.put("600", "Abc6");
        table.put("500", "Abc555555");

        System.out.println("\n\nUsing entrySet");
        for(Map.Entry<String, String> entry: table.entrySet()){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        System.out.println("\n\nUsing keySet");
        for(String key : table.keySet()){
            System.out.println(key+"\t"+table.get(key));
        }






    }
}
