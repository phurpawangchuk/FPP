package Lab;

import java.util.ArrayList;

public class ArrayListRemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Object> alist = new ArrayList<>();
        alist.add("java");
        alist.add('a');
        alist.add("abc");
        alist.add('b');
        alist.add(10);
        alist.add('a');
        alist.add("java");
        alist.add(10);
        alist.add("java");
        alist.add('a');
        alist.add("java");
        alist.add(12);

        System.out.println(alist);
        for(int i=0; i< alist.size(); i++){
            for(int j=i+1; j<alist.size(); j++){
                if(alist.get(i).equals(alist.get(j))){
                    alist.remove(j);
                }
            }
        }

        System.out.println(alist);
    }
}
