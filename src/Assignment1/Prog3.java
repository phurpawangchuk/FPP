package Assignment1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog3 {
    public static void main(String[] args) {
        String[] names = { "horse", "dog", "cat", "horse", "dog"};
        System.out.println("Original list: "+ Arrays.toString(names));

        String[] removedList = removeDuplicate(names);

        System.out.println(Arrays.toString(removedList));
    }

    private static String[] removeDuplicate(String[] names) {
        String[] temp = new String[names.length];
        int k=0;
        boolean foundDuplicate;

        for(int i=0; i<names.length; i++){
            String findName = names[i];
            foundDuplicate=false;
            for(int j=i+1; j<names.length; j++){
                if(names[j].equals(findName)){
                   foundDuplicate = true;
                   break;
                }
            }
            if(!foundDuplicate) {
                temp[k++]= names[i];
            }
        }

        String[] removedList = new String[k];
        for(int i=0; i<k; i++){
            removedList[i] = temp[i];
        }
        return removedList;
    }
}
