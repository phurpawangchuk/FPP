package A67.FinalExam_Practice;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-16-03
 */
public class MyDoubleLinkedList {
    static Node head;
    Node tail;
    int size;

    MyDoubleLinkedList(){
        size = 0;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.previous = head;
    }

    class Node {
        int data;
        Node next;
        Node previous;

        Node(){}
        Node(int d){
            data = d;
        }
    }

    public void addAtIndex(int index, int data){
        Node prevd, succ;
        Node newNode = new Node(data);
        int count=0;
        if(head == null && tail == null){
            head=tail=newNode;
        }else {
            if(index > size - index){ //insert from tail
                succ = tail;
                for(int i=0; i< size-index; i++) {
                    count++;
                    succ = tail.previous;
                }
                prevd = succ.previous;

                prevd.next = newNode;
                newNode.previous = prevd;
                newNode.next = succ;
                succ.previous = newNode;

            }else {
                prevd = head;
                for (int i = 0; i < index; i++) {
                    count++;
                    prevd = prevd.next;
                }
                succ = prevd.next;
                newNode.next = succ;
                succ.previous = newNode;
                newNode.previous = prevd;
                prevd.next = newNode;
            }
//            newNode.next = succ;
//            succ.previous = newNode;
//            newNode.previous = prevd;
//            prevd.next = newNode;
            size++;
        }
//        System.out.print("count -"+count);

    }

    public boolean findRec(Node head, int val){
        if(head.data == val)
            return true;

        if(head.next == null)
            return false;
        else
            return findRec(head.next, val);
    }

    public boolean find(int val){
        Node node = head;
        while(node != null){
            if(node.data == val)
                return true;
            node = node.next;
        }
        return false;
    }
    public void addAtHead(int data){
        addAtIndex(0,data);
    }

    public void addAtTail(int data){
        addAtIndex(size, data);
    }

    public void deleteAtIndex(int index){
        Node pred, succ;
        pred = head;

        for(int i=0; i<index; i++)
            pred = pred.next;

        succ = pred.next.next;
        pred.next = succ;
        succ.previous = pred;

        size--;
    }

    public void display(){
        Node n = head;
        while( n != null){
            if(n.data !=0)
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println("\nSize:"+size);
    }

    public static void main(String[] args) {
        MyDoubleLinkedList dl = new MyDoubleLinkedList();
        dl.addAtIndex(0,1);
        dl.addAtIndex(1,2);
        dl.addAtIndex(2,3);
        dl.addAtIndex(3,11);

        dl.addAtHead(22);
        dl.addAtTail(15);

        dl.addAtIndex(4,55);
        dl.addAtIndex(6,66);
        dl.addAtIndex(7,45);
//        dl.deleteAtIndex(2);

        System.out.println("find 22: "+dl.find(22));
        System.out.println("find 222: "+dl.find(222));

        System.out.println("find 22: "+dl.findRec(head,22));
        System.out.println("find 222: "+dl.findRec(head, 222));

        dl.display();

    }
}
