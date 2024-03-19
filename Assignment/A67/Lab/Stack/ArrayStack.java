package A67.Lab.Stack;

import java.util.Objects;
import java.util.Stack;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
public class ArrayStack {
    private Object arr[];
    int top;
    int MAX_SIZE = 5;

    ArrayStack(){
        arr = new Object[MAX_SIZE];
        top = -1;
    }

    public void push(Object item){
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = item;
    }

    private boolean isFull() {
        return top == arr.length-1;
    }

    public Object pop(){
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return null;
        }
        return arr[top--];
    }

    private int size(){
        return top+1;
    }

    private boolean isEmpty(){
        return top == -1;
    }

    public Object peep(){
        if(isEmpty()) return null;
        return arr[top];
    }

    public void display(){
        if(!isEmpty()) {
            for (int i = 0; i <= top; i++)
                System.out.print(arr[i] + " ");
            System.out.println("\nSize: " + size());
        }else{
            System.out.println("Empty stack.");
        }
    }

    public static void main(String[] args) {
       /* ArrayStack stack = new ArrayStack();
        stack.push('A');
        stack.push('C');
        stack.push('D'); //A C D
        System.out.println("Peep: "+stack.peep()); //D

        stack.push('F'); //ACDF
        System.out.println("Popped: "+stack.pop()); //F

        stack.push('G'); //ACDG
        stack.push('K'); //ACDGK
        stack.push('G'); //Stack is full
        stack.push('G'); //Stack is full

        stack.display();
        */

        Stack<Integer> stdStack = new Stack<>();
        stdStack.push(2);
        stdStack.push(4);
        stdStack.push(5);
        stdStack.push(8);
        stdStack.pop();

       stdStack.forEach(n -> System.out.print(n+" "));


    }
}
