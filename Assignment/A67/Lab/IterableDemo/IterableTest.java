package A67.Lab.IterableDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
public class IterableTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aaa11","bb22","cc33","dd44"));

        //1. forEach
        //list.forEach(name -> System.out.println(name.toUpperCase()));

        //2. Iterator
        Iterator it = list.iterator();
        while(it.hasNext()){
            String nextItem = (String) it.next();
           // System.out.println(nextItem);
        }

        //3. for loop
        for(int i=0; i<list.size(); i++){
           // System.out.println(list.get(i).toUpperCase());
        }

    }
}
