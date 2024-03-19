package A67.Leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
public class ValidParentheses {
    public static void main(String[] args) {

        String input = "[a+b] {c+b)(z*n)";
        boolean result = checkValidParentheses(input);
        System.out.println("Result = "+result);

    }

    private static boolean checkValidParentheses(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i =0; i< input.length(); i++){
            char ch = input.charAt(i);
            if( ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }else if ( ch == '}' || ch == ')' || ch == ']'){
                char ch1 = stack.peek();
                if( (ch1 == '{' && ch == '}') || (ch1 == '[' && ch == ']') || (ch1 == '(' && ch == ')')){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
