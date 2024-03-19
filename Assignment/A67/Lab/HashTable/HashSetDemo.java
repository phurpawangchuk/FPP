package A67.Lab.HashTable;

import javax.swing.text.TabSet;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet and Set: key and value are same
        //Big O(1)
        Set<String> set = new HashSet<>();
        set.add("Abc");
        set.add("Bbc");
        set.add("Dbc");
        set.add(null);
        set.add(null);
        System.out.println(set);

//        set.remove("Abc");
//        set.contains("Bbc");
        set.size();

        //for to loop
//        for(String s: set){
//            System.out.println(s+" ");
//        }

        HashSet<String> obj = new HashSet<>();
//        HashSet<String> obj = new HashSet();
        obj.add("AAA");
        set.add(null);
        set.add(null);
        set.add(null);
        obj.add("CC1");
        System.out.println(obj);

        LinkedHashSet<String> obj1 = new LinkedHashSet();
        obj1.add("111");
        obj1.add("222");
        obj1.add("333");
        obj1.add(null);
        obj1.add("333");
        System.out.println(obj1);

    }
}
