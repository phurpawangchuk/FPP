package A67;

import java.util.*;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-03-03
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(null);
        list.add(null);

        System.out.println("List:\t"+list);

        HashSet<Integer> list1 = new HashSet<>();
        list1.add(4);
        list1.add(41);
        list1.add(4);
        list1.add(53);
        list1.add(16);
        list1.add(7);
        list1.add(6);
        list1.add(2);
        list1.add(null);
        list1.add(null);

        System.out.println("HashSet:"+list1);

        TreeSet<Integer> list2 = new TreeSet<>();
        list2.add(6);
        list2.add(4);
        list2.add(41);
        list2.add(4);
        list2.add(5);
        list2.add(4);
        list2.add(2);
        //list2.add(null); //do not allow null
        System.out.println("TreeSet: "+list2);

        LinkedHashSet<Integer> list3 = new LinkedHashSet<>();
        list3.add(4);
        list3.add(4);
        list3.add(41);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(7);
        list3.add(null);
        list3.add(null);
        System.out.println("LinkedHashSet: "+list3);

    }
}
