package A67.Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-14-03
 */
public class PosfixExpress {
    public static void main(String[] args) {
        Stack<Integer> stack  = new Stack<>();

        String[] expression = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
//        String[] expression = {"2","1","+","3","*"}; //9
        int result = 0;
        for(String st: expression){

            String ch = st;
            if(!ch.equals("+") && !ch.equals("*") &&
                !ch.equals("-") && !ch.equals("/")){
                stack.push(Integer.parseInt(st));
            }else{
                result = solve(stack.pop(), stack.pop(), ch);
                stack.push(result);
            }
        }
        System.out.println("Result: "+stack.peek());

        //
       solveProblem2();

    }

    private static void solveProblem2() {
        String s = "1+1";
        String s2 = "";
        List<String> str = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c != ' ') {
                if (Character.isDigit(c)) {
                    s2 = s2 + c;
                } else {
                    str.add(s2);
                    str.add(String.valueOf(c));
                    s2 = "";
                }
            }
        }

        System.out.println(str.size());
        String s3 = null;
//        for(String s3: str){
            for(int i=0; i<str.size(); i++){
               s3 = str.get(i);
                System.out.println(s3);
//            if(s3.equals("+") ){
//                int result = solve(stack.pop(), stack.pop(), s3);
//                stack.push(result);
//            }else{
//                stack.push(Integer.parseInt(s3));
//            }
        }

        //System.out.println(stack.peek());

    }

    public static int solve(int x, int y, String  op){
        int res = 0;
        switch (op){
            case "+": res = y + x; break;
            case "-": res =  y - x; break;
            case "*": res =  y * x; break;
            case "/": res =  y / x; break;
        }
        return res;
    }
}
