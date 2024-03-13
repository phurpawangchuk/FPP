package Assignment9.Prob1;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
public class ArrayQueueImp {
    private int[] arr = new int[5];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        //implement
        if(isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        return arr[front+1];
    }

    public void enqueue(int obj){
    //implement
        if(rear == arr.length)
            resize();

        arr[rear++] = obj;
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        return arr[++front];
    //implement
    }

    public boolean isEmpty(){
    //implement
        return size() == 0;
    }

    public int size(){
    //implement
        return rear - front - 1;
    }

    private void resize(){
    //implement
        int temp[] = new int[2*arr.length];
        System.arraycopy(arr,0, temp,0,arr.length);
        arr = temp;
    }

    public void display(){
        for(int i = front+1; i < rear; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        ArrayQueueImp queue = new ArrayQueueImp();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Dequeued: "+queue.dequeue()); //2 3 4 5 6
        System.out.println("Dequeued: "+queue.dequeue()); //3 4 5 6
        System.out.println("Dequeued: "+queue.dequeue()); //4 5 6

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Peep: "+queue.peek()); //4
        System.out.println("Dequeued: "+queue.dequeue()); //5 6 1 2 3 4 5 6
        System.out.println("Dequeued: "+queue.dequeue()); //6 1 2 3 4 5 6

        queue.display();

        System.out.println("\nSize = "+ queue.size()); //7
    }
}
