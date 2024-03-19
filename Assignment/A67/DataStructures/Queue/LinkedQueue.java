package A67.DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */

public class LinkedQueue {
    class Node {
        Object data;
        Node next;

        Node(Object item) {
            data = item;
        }
    }

    Node front, rear;
    int count;

    public void enqueue(Object item) {

        Node p = new Node(item);

        if (front == null) {
            front = rear = p;
            rear.next = null;
        } else {
            rear.next = p;
            rear = p;
            rear.next = null;
        }
        count++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
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

    public Object peek() {
        return front.data;
    }

    public int size() {
        return count;
    }

    public void display() {
        Node p = front;
        System.out.println("Linked Queue");
        if (p == null) System.out.println("empty");
        while (p != null) {
            System.out.println(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
            System.out.println("My Queue queue:");
            LinkedQueue lq = new LinkedQueue();
            lq.enqueue(1);
            lq.enqueue(2);
            lq.enqueue(3);
            lq.dequeue();
            lq.display();

            System.out.println("Normal queue:");

            Queue<Integer> mq = new LinkedList<>();
            mq.add(42);
            mq.add(-3);
            mq.add(17); // front [42, -3, 17] back
            System.out.println(mq.remove()); // 42
        }
    }
