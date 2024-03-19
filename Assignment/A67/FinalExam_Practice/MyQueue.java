package A67.FinalExam_Practice;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-16-03
 */
public class MyQueue {
    private int front;
    private int rear;
    private int elements;
    private int myQueue[];
    private int MAX = 5;
    MyQueue(){
        front = 0;
        rear = 0;
        elements = 0;
        myQueue = new int[MAX];
    }

    public int size(){
        return elements;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public boolean isFull(){
        return size() == myQueue.length;
    }

    public void display(){
        for(int i=front; i<rear; i++){
            System.out.print(myQueue[i]+" ");
        }
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Q is full");
        }
        myQueue[rear++] = data;
        elements++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Q is empty");
            return 0;
        }
        int res = myQueue[front++];
        elements--;
        return res;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Q is empty");
        }else{
            return myQueue[front];
        }
        return 0;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.dequeue();

        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(11);
         //4 6 7 9 11
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
        System.out.println("Size: "+queue.size());
        queue.display();

    }
}
