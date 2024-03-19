package A67.DataStructures.HashTable;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */
public class HashTableDemo {
    public static void main(String[] args) {
        // Value may any collection
        Hashtable<Integer, Empl> tm = new Hashtable<>();
        tm.put(11, new Empl(134, "Ramu", 3000));
        tm.put(5, new Empl(235, "Jony", 6000));
        tm.put(3, new Empl(876, "Crish", 2000));
        tm.put(4, new Empl(512, "Tom", 2400));
        System.out.println("HashTable entries:");

        Set<Integer> keys = tm.keySet();
        for(Integer key: keys){
            System.out.println(key+" ==> " + tm.get(key));
        }
        tm.remove(4);
        tm.replace(5, new Empl(235, "Jony", 3200));
        System.out.println(tm);//{5=Jony,3200,235, 3=Crish,2000,876, 11=Ramu,3000,134}

        Queue<Integer> me = new LinkedList<>();

    }

    static class Empl{
        private String name;
        private int salary;
        private int id;
        public Empl(int id, String n, int s){
            this.id = id;
            this.name = n;
            this.salary = s;
        }

        @Override
        public String toString() {
            return name + ',' + salary + ','+ id;
        }
    }
}
