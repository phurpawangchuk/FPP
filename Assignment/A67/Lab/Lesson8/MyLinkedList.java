package A67.Lab.Lesson8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-11-03
 */
public class MyLinkedList {
    int size;
    ListNode head;

    MyLinkedList(){
        size = 0;
        head = new ListNode(0);
    }

     class ListNode {
         int val;
         ListNode next;

         ListNode(int val) {
             this.val = val;
         }
     }

    public void addAtIndex(int index, int val) {

        if(index > size ) return;

        if(index < 0) index = 0;

        ListNode newNode = new ListNode(val);

        ListNode predNode  = head;

        for (int i=0; i< index; i++)
            predNode = predNode.next;

        newNode.next = predNode.next;
        predNode.next = newNode;

        size++;
    }

    public int get(int index){
        if(index < 0 || index >= size) return -1;

        ListNode current = head;

        for(int i=0; i<index+1; i++)
            current = current.next;

        return current.val;
    }

    public void addAtHead (int val){
     addAtIndex(0, val);
    }

    public void addAtTail(int val){
        addAtIndex(size, val);
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index >= size) return;

        ListNode pred = head;

        for(int i=0; i<index+1; i++)
            pred = pred.next;

        pred.next = pred.next.next;
        size--;
    }

    public void display(){
        ListNode n = head.next;
        while(n != null){
            System.out.print(n.val+" ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.addAtIndex(0, 100);
    list.addAtIndex(1, 200);
    list.addAtIndex(2, 300);
    list.addAtIndex(0,1001);
    list.addAtIndex(3, 400);
    list.addAtIndex(4, 500);  //1 2 3 4 5
   // list.addAtHead(50); //5 1 2 3 4 5 6
    list.addAtTail(600);
   // list.deleteAtIndex(3);

    list.display();
//
//        List myList  = new ArrayList();
//        myList.add(1);
//        myList.add("A");
//        myList.add('B');
//
//        System.out.println(myList);

    }
}
