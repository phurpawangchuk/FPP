package A67.FinalExam_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-16-03
 */
public class MyStack {
    private int top;
    private int[] myarray;
    private final static int MAX_SIZE = 5;

    MyStack(){
        top = -1;
        myarray = new int[MAX_SIZE];
    }

    public int size(){
        return myarray.length;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == myarray.length-1;
    }

    public void resize(){
        int length = 2*myarray.length;
        int temp[] = new int[length];
        System.arraycopy(myarray, 0, temp, 0,myarray.length);
        myarray = temp;
    }

    public void push(int data){
        try {
            if(isFull()){
              //  resize();
            throw new ArrayIndexOutOfBoundsException("Stack is full");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error:"+e.getMessage());
            dispaly();
            System.exit(1);
        }finally {
            myarray[++top] = data;
        }
    }

    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
         if(!isEmpty()) {
            return myarray[top--];
        }
         return -1;
    }

    public int peek(){
        if(isEmpty()) return -1;
       return myarray[top];
    }

    public void dispaly(){
        for(int i =0; i<= top; i++){
            System.out.print(myarray[i]+" ");
        }
        System.out.println("\nSize: "+ size());
    }
    @Override
    public String toString() {
        return "MyStack{" +
                "top=" + top +
                ", myarray=" + Arrays.toString(myarray) +
                '}';
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(4);
        stack.push(7);
        stack.push(11);
        stack.push(34);
        stack.push(43);

        stack.pop();
        System.out.println("Poped:"+stack.pop());
        System.out.println("Peek:"+stack.peek());

        stack.dispaly();

        System.out.println(Arrays.asList(stack.toString()));
    }
}
