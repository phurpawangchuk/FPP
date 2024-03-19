package A67.Leecode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 *
 * @year 2024-14-03
 */
public class SimplifedPath {
    public static void main(String[] args) {
        String result = simplifyPath("../home//some/.");
        System.out.println(result);
    }

    static public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String arr[]= path.split("/");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        // .. home some

        for(int i=0;i<arr.length;i++)
        {
//            if(!stack.isEmpty() && arr[i].equals("..") )
//                stack.pop();
//
//            else
            if(!arr[i].equals("") && !arr[i].equals(".") && !arr[i].equals(".."))
                stack.push(arr[i]);
        }

        String ans="";

        if(stack.isEmpty()) return "/";

        while(!stack.isEmpty())
        {
            ans ="/"+stack.pop()+ans;
        }
        return ans;
    }
}
