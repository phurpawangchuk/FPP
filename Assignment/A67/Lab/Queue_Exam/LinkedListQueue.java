package A67.Lab.Queue_Exam;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
//Asked in exam

class LinkedQueue {
    class Node {
        Object data;
        Node next;

        Node(Object item) {
            data = item;
        }
    }

    int count;
    Node front, rear;

    //front....rear
    //2  5
    public void enqueue(Object item) {
        Node p = new Node(item);

        if (front == null) {
            front = rear = p;
        } else {
            rear.next = p;
            rear = p;
        }
       // rear.next = null;
        count++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Q emoty");
            return null;
        }
        Object item = front.data;
        front = front.next;
        count--;
        return item;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return count;
    }

    public void display() {
        Node p = front;
        System.out.println("Linked :");
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public Object peek() {
        return front.data;
    }
}

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        q.dequeue();
        q.display();

        //build in
//        Queue<Integer> q = new LinkedList<>();
//        q.add(4);
//        q.add(5);
//        q.add(7);
//        System.out.println(q);

    }
}
