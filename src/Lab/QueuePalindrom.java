package Lab;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrom {
    public static void main(String[] args) {
        String str = "ABCCBA";
        isPalindrom(str);
    }

    private static void isPalindrom(String str) {
        char[] ch = str.toCharArray();
        Queue queue = new LinkedList();

        for(int i=0; i<ch.length; i++) {
            queue.add(ch[i]);
        }

        String queElement = "";
        while(!queue.isEmpty()){
            queElement += queue.remove();
        }

        if(queElement.equals(str)){
            System.out.println("Palindom");
        }else{
            System.out.println("Not Palindom");
        }
        System.out.println(queElement);
    }
}
