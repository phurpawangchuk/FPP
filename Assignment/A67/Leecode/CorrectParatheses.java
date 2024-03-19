package A67.Leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-10-03
 */
public class CorrectParatheses {
    public static void main(String[] args) {
        boolean res = checkParanthesis("[(]");
        System.out.println(res);
    }

    private static boolean checkParanthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i< s.length(); i++){
           char ch = s.charAt(i);
           if( (ch == '{') || (ch == '[') || (ch == '(')){
               stack.push(ch);
           }
           else {
                   char pop = stack.pop();
                   if ((ch == '}' && pop != '{') || (ch == ']' && pop != '[') || (ch == ')' && pop != '(')) {
                       return false;
                   }
               }
        }

        if(stack.isEmpty())
            return true;
        else
        return false;
    }
}
