package Lab;

import java.util.Stack;

public class StackPalindrom {
    public static void main(String[] args) {
       String str = "AMALAYALAMA";
       boolean result = isPalindrm(str);
       if(result){
           System.out.println("Palidndrom");
       }else{
           System.out.println("Not a Palidndrom");
       }
    }

    private static boolean isPalindrm(String str) {
        Stack stack = new Stack();

        for(int i=0; i<str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed  = "";
        while(stack.size() !=0){
            reversed+=stack.pop();
        }

        return (str.equals(reversed.toString()));

    }
}
