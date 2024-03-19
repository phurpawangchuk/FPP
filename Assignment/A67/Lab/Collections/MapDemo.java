package A67.Lab.Collections;

import java.util.*;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-10-03
 */
public class MapDemo {
    public static void main(String[] args) {

        //Map is a Interface and implemented by class HashMap, Hashtable, TreeMap, LinkedHashMap,
        Map<String, String> contact = new HashMap<>();
        contact.put("1002","1002");
        contact.put("1003","1003");
        contact.put("1001","1001");
        contact.put("1004","1004");

        Set<Map.Entry<String,String>> entry = contact.entrySet();
        System.out.println(entry);
        for(Map.Entry<String,String> e: entry){
            System.out.println(e.getKey()+" - "+e.getValue());
        }

//        System.out.println(contact.entrySet());
    }
}
