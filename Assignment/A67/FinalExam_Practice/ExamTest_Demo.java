package A67.FinalExam_Practice;

import java.util.*;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-17-03
 */
public class ExamTest_Demo {
    public static interface IntHolder{
        public int getValue();
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("10-10 Phurpa","10-11 Wang", "10-10 Phurpa");
        Collections.sort(list);

        List<Integer> ll = new ArrayList<>();
        List<Integer> ll1 = new LinkedList<>();

        Set<Integer> ss = new HashSet<>();
        Map mm = new HashMap();
        mm.put(1, "aa");
        mm.put(2, "aa1");
        mm.put(3, "aa2");
        mm.put(4, "aa3");

        for(Object n: mm.entrySet())
            System.out.println(n);

        //Treeset - display sorted with not duplocate
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(10);
        ts.add(30);
        ts.add(25);
        ts.add(20);
        System.out.println(ts);

        //Print in sorted order
        Queue<Integer> qs = new PriorityQueue<>();
        qs.add(25);
        qs.add(15);
        qs.add(35);
        qs.add(30);
        Iterator p = qs.iterator();
        while(p.hasNext()){
            System.out.print(qs.remove()+" ");
        }

        //Both allows null
        ArrayList arr = new ArrayList();
        arr.add(null);
        System.out.println(arr);
        LinkedList l2 = new LinkedList();
        ll.add(null);
        ll.add(null);
        System.out.println(ll);
        HashSet<Integer> a2 = new HashSet();
        a2.add(1);
        a2.add(2);
        a2.add(3);

        //Print Higest first
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(11,"JAA");
        ht.put(13,"C++");
        ht.put(23,"CO");
        ht.put(31,"JSE");

        System.out.println(ht);

        //returns -1 and 1
        Stack<String> stack = new Stack<>();
        stack.push("Aa");
        stack.search("Aa");

        for(int i=0; i< 6; i++)
            arr.add("Ele"+i);

        ArrayList<Integer> list1 = new ArrayList<>(10);

        // Add elements to the ArrayList
        for (int i = 1; i <= 10; i++) {
            list1.add(i);
        }

        /*******************************************/
//        HashMap<String, String> hh = new HashMap<>();
//        for(int i=0; i< list.size(); i++){
//            String[] str = list.get(i).split(" ");
//            hh.put(str[0], str[1]);
//        }
//        System.out.println(hh);
        /*******************************************/

//        Set<String> h = removeDuplicateList(list);

       // HashMap<String, String> h1 = removeDuplicateListH(list);
       // System.out.println(h1);

//        Test1();
        Test2();

        //System.out.println(hash.size());
    }

    private static void Test2() {
        //Remove dupliate fromt the string
        ArrayList<Object> obj = new ArrayList<>();
        obj.add('a');
        obj.add('d');
        obj.add('A');
        obj.add('0');
        obj.add("Apple");
        obj.add('a');
        obj.add('a');
        obj.add('a');
        obj.add('A');
        obj.add('a');
        obj.add('0');
        obj.add("Apple");

        for(int i=0; i<obj.size(); i++) {
            for (int j = obj.size()-1; j>i; j--) {
                if (obj.get(i).equals(obj.get(j))) {
                    obj.remove(j);
                }
            }
        }
        System.out.println(obj);
        System.out.println(obj.size());

    }

    private static void Test1() {
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(101, 201);
        hash.put(102, 202);
        hash.put(103, 203);
        hash.put(104, 204);
        hash.put(103, 203);
        hash.put(105, 205);

        for(Integer val: hash.keySet()){
            System.out.println(val);
        }
        for(Integer val: hash.values()){
            System.out.println(val);
        }
    }

    private static Set<String> removeDuplicateList(List<String> list) {
        Set<String> str = new HashSet<>();
        str.addAll(list);
        return str;
    }

    private static HashMap<String, String> removeDuplicateListH(List<String> list) {
        HashMap<String, String> str = new HashMap<>();
        for(String s: list){
            str.put(s,s);
        }
        return str;
    }
}
