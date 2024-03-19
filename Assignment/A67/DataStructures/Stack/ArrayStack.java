package A67.DataStructures.Stack;

import java.util.Stack;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */
public class ArrayStack {
    private Object[] a;
    private int top;

    public ArrayStack(int n){
        a = new Object[n];
        top = -1;
    }

    public void push(Object o){
        if(top == a.length-1)
        {
            System.out.println("Stack is full");
            return;
        }
        ++top;
        a[top] = o;
    }
    public Object pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        top--;
        return a[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public Object peek(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return a[top];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <= top; i++){
            sb.append(a[i] + " -> ");
        }
        sb.append("\b\b\b");

        return sb.toString();
    }

    public static void main(String[] args) {
            ArrayStack as = new ArrayStack(4);
            as.push(1);
            as.push(2);
            as.push(4);
            as.push(3);
            as.push(3);

//            as.pop();
//            as.pop();
            System.out.println(as);

//            System.out.println("Java stack");
//            Stack<Integer> s = new Stack<>();
//            s.push(42);
//            s.push(-3);
//            s.push(17); // [42, -3, 17]
//            System.out.println(s.pop()); // 17
    }
}
