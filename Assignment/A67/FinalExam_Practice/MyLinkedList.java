package A67.FinalExam_Practice;

import java.util.LinkedList;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-16-03
 */
public class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            this.next = null;
        }
    }

    public void addFirst(int data){
        insertAtIndex(0,data);
    }
    public void addLast(int data){
        insertAtIndex(size, data);
    }

    public int get(int index){
        Node node = head;
        for(int i=0; i <=index; i++){
            node = node.next;
        }
        return node.data;
    }

    public void insertAtIndex(int index, int data){

        Node newNode = new Node(data);
        if(index < 0 ) return;

        if(head == null ){
            head = newNode;
        }
        Node pre = head;

        for (int i = 0; i < index; i++)
            pre = pre.next;

        newNode.next = pre.next;
        pre.next = newNode;

        size++;
    }

    public void display(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println("\nSize: "+size);
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index > size) return;
        Node pre, temp;
        pre = head;
        for(int i=0; i<index; i++)
            pre = pre.next;

        temp = pre.next.next;
        pre.next = temp;
    }

    public static void main(String[] args) {
        MyLinkedList link = new MyLinkedList();
        link.addFirst(5);
        link.addLast(8);
        link.insertAtIndex(0,11);
        link.insertAtIndex(1,22);
        link.addLast(33);
        link.deleteAtIndex(2);// 11 22 8 33

        System.out.println(link.get(3));
        link.display();
    }
}
