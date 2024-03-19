package A67.Lab.HashTable;


import java.util.*;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-15-03
 */

public class HashTableDemo {
    public static void main(String[] args) {
        /*Hashtable<String, String> table = new Hashtable();
        table.put("100", "Abc1");
        table.put("200", "Abc2");
        table.put("300", "Abc3");
        table.put("400", "Abc4");
        table.put("500", "Abc5");
        table.put("600", "Abc6");
        table.put("500", "Abc555555");

        for (Map.Entry entry: table.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("Contained 300 key: ");
        System.out.println("\n\nUsing keySet");
        for(String key : table.keySet()){
            System.out.println(key+"\t"+table.get(key));
        }
        */

        //value may be any collection
        //if key is Object then have to implement hascode and equals in the EMpl class
        Hashtable<String, Empl> emp = new Hashtable<>();
        emp.put("101", new Empl(134, "Bam", 3000));
        emp.put("105", new Empl(234, "AA", 3000));
        emp.put("103", new Empl(674, "BB", 1000));
        emp.put("104", new Empl(654, "CC", 3000));

        System.out.println("Hashable entries:");
//        Set<Integer> keys = emp.keySet();
        for(String key: emp.keySet()){
//            int hashValue = hash(key.hashCode());
            System.out.println(key+" => "+emp.get(key)+" hashcode="+key.hashCode());
        }

        for(Map.Entry entry: emp.entrySet()){
            System.out.println(entry);
        }
//
//        emp.remove(4);
//        emp.replace("5", new Empl(7, "BBC", 34543));
//        System.out.println(emp);
    }

    public static int hash(int num){
        return 31*num*31*17%5;
    }
}

    class Empl {
        private String name;
        private int salary;
        private int id;

        public Empl(int id, String name, int salary) {
            this.name = name;
            this.salary = salary;
            this.id = id;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Empl empl = (Empl) o;
//            return salary == empl.salary && id == empl.id && Objects.equals(name, empl.name);
//        }
//
//        @Override
//        public int hashCode() {
//            int res = Objects.hash(name, salary, id)%5;
//            return res;
//        }

        @Override
        public String toString() {
            return id + "," + name + ","+salary;
        }
    }
