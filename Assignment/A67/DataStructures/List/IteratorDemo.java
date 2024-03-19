package A67.DataStructures.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */
public class IteratorDemo {
        public static void main(String[] args) {
            List<String> javaList = new ArrayList<>();
            javaList.add("Bob");
            javaList.add("Carol");
            javaList.add("Steve");

            System.out.println("ForEach: ");
            javaList.forEach(name -> System.out.println(name.toUpperCase()));

            System.out.println("Iterator: ");
            Iterator it = javaList.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString().toUpperCase());
            }
        }
}
