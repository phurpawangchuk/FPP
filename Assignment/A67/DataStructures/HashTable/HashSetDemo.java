package A67.DataStructures.HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Swing");
        set.add("Java Spring");
        set.add("Banana");
        System.out.println(set); //[Java, Swing, Java Swing, Banana]
        System.out.println("Removed Java from the set " + set.remove("Java")); //true
        System.out.println("Set contains Swing : " + set.contains("Swing")); //true
        System.out.println("Size of the set : " + set.size()); //3

        HashSet<String> obj = new HashSet<>();
        for(String s: set){
            System.out.println(s);
        }
        obj.add("Java");
        if(obj.add("Java")){
            System.out.println(true);
        }else{
            System.out.println(false); //false
        }
    }
}
