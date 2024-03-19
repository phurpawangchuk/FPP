package A67.FinalExam_Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-17-03
 */
public class StackTest {
    public static void main(String[] args) {
        boolean check = checkPalandonUsingS();
        System.out.println("\nres="+check);

        boolean check1 = checkPalandonUsingQ();
        System.out.println("\nres="+check1);
    }

    private static boolean checkPalandonUsingQ() {
        Queue queue = new LinkedList();

        return false;
    }
    private static boolean checkPalandonUsingS() {
        Stack stack = new Stack();
        String string = "BABANANABAB";

        for(int i=0; i<string.length(); i++)
            stack.push(string.charAt(i));

        int len = string.length()-1;
        for(int i=0; i<string.length(); i++){
            char ch = (char) stack.peek();
            if(ch == string.charAt(i)){
                System.out.print(" "+stack.pop());
            }
        }
        //BANANABA
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
