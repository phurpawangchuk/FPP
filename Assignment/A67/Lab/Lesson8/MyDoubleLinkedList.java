package A67.Lab.Lesson8;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-12-03
 */
public class MyDoubleLinkedList {
    int numberOfNodes;
    ListNode head, tail;

    class ListNode{
        int val;
        ListNode next;
        ListNode previous;

//        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
    }

    MyDoubleLinkedList() {
        numberOfNodes = 0;

        head = new ListNode(0);
        tail = new ListNode(0);

        head.next = tail;
        tail.previous = head;
    }

    public void addAtIndex(int index, int val){
        ListNode toAdd = new ListNode(val);
        ListNode pred, succ;

        pred = head;

        for(int i=0; i<index; i++)
            pred = pred.next;

        succ = pred.next;

        toAdd.next = succ;
        succ.previous = toAdd;
        toAdd.previous = pred;
        pred.next = toAdd;

        //closer to head
        /*
       if(index < numberOfNodes - index){
           pred = head;
           for(int i=0; i< index; i++)
               pred = pred.next;
           succ = pred.next;

       }else{
           succ = tail;
           for(int i=0; i<numberOfNodes; i++)
               succ = succ.previous;

           pred = succ.previous;
       }

       toAdd.next = succ;
       succ.previous = toAdd;
       toAdd.previous = pred;
       pred.next = toAdd;
       */
       numberOfNodes++;
    }

    public void addAtHead(int val){
        ListNode pred = head;
        ListNode succ = head.next;

        ListNode toAdd = new ListNode(val);

        toAdd.next = succ;
        succ.previous = toAdd;
        toAdd.previous = pred;
        pred.next = toAdd;

        numberOfNodes++;
    }

    public void addAtTail(int val){
        ListNode pred = tail.previous;
        ListNode succ = tail;

        ListNode toAdd = new ListNode(val);

        toAdd.next = succ;
        succ.previous = toAdd;
        toAdd.previous = pred;
        pred.next = toAdd;

        numberOfNodes++;
    }

    public void deleteAtHead(){
        deleteAtIndex(0);
    }

    public int get(int index){
        if(index < 0 || index >= numberOfNodes)
            return -1;

        ListNode curr = head;
        for(int i=0; i<=index; i++)
            curr = curr.next;

//        if(index + 1 < numberOfNodes - index){
//            for(int i=0; i< index; i++)
//                curr = curr.next;
//        }else{
//            curr = tail;
//            for(int i=0; i< numberOfNodes-index; i++)
//                curr = curr.previous;
//        }
        return curr.val;
    }

    public void deleteAtIndex(int index){

        ListNode pred,succ;

        if(index < 0 || index>= numberOfNodes) return;

        pred = head;
        for(int i=0; i<index; i++)
            pred = pred.next;

        succ = pred.next.next;
        pred.next = succ;
        succ.previous = pred;
        numberOfNodes--;
    }

    public void display(){
        ListNode node = head;
        while(node != null){
//            if(node.val != 0)
            System.out.print(node.val+" ");
            node = node.next;
        }
//        System.out.println("taile="+tail.previous.val);
        System.out.println("\nSize: "+numberOfNodes);
    }

    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        list.addAtHead(10);
//        list.deleteAtIndex(0);
        list.addAtHead(20);
        list.addAtTail(30);
        list.addAtTail(40);  //20 10 30 40
        list.addAtIndex(2, 50); //20 10 50 30 40
//        list.addAtIndex(1, 15); //20 15 10 50 30 40
//        list.addAtHead(5); //5 20 15 10 50 30 40
//        System.out.println("val at index 2 : "+list.get(2));//15
//        list.deleteAtHead();// 20 15 10 50 30 40
//        list.deleteAtIndex(2);// 20 15 50 30 40

        list.display();

    }

}

