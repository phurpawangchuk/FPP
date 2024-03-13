package Assignment9.Prob2;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */

public class StackLinkedList {
    Node head;
    int size = 0;

    class Node {
        int data;
        Node next;
        Node(int val){
            data = val;
        }
    }

    public void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = newNode;
        }
        size++;
    }

    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }

        Node current = head;
        Node previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }
        size--;

        if(!isEmpty())
        previous.next = null;

        return current.data;

    }

    public int peep(){
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        return node.data;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        return size;
    }

    public void display(){
        int start = 0;
        Node node = head;
        while(start < size){
            System.out.print(node.data+" ");
            node = node.next;
            start++;
        }

        System.out.println("\nSize of element: "+size());
    }
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); //1 2 3 4

        System.out.println("Peep: "+stack.peep()); //4

        System.out.println("Popped : "+stack.pop()); //4
        System.out.println("Popped : "+stack.pop()); //3

        stack.push(2); //1 2 2
        stack.push(3); //1 2 2 3
        stack.push(4); //1 2 2 3 4
        stack.push(5); //1 2 2 3 4 5
        stack.push(6); //1 2 2 3 4 5 6

        System.out.println("Peep: "+stack.peep()); //6

        System.out.println("Popped : "+stack.pop()); //6
        System.out.println("Popped : "+stack.pop()); //5

        stack.display();
    }
}
