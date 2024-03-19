package A67.Lab.Lesson8;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-11-03
 */
public class NodeLinkedList {

    int size = 0;
    Node head;

    public int get(int index){
        if(index < 0 || index > size ) return -1;

        if(isEmpty()) return -1;

        Node node = head;
        for(int i=0; i<index; i++)
            node = node.next;
        return node.data;
    }

    public void addAtHead(int data){
        addAtIndex(0, data);
    }

    public void addAtTail(int data){
        addAtIndex(size, data);
    }

    public void addAtIndex(int index, int data){

        if(index < 0 || index > size) return;

        Node newNode = new Node(data);
        newNode.next = null;

        Node temp = head;
        if(index == 0){
            newNode.next = temp;
            head = newNode;
        }else{

            for(int i=0; i<index-1; i++)
                temp = temp.next;

            Node n = temp.next;

            temp.next = newNode;
            newNode.next = n;

        }
        size++;
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index > size) return;

        if(isEmpty()) return;

        Node n = head;
        for(int i=0; i<index-1; i++)
            n = n.next;
        n.next = n.next.next;
        size--;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public void display(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println("Size="+size);
    }

    public static void main(String[] args) {
        NodeLinkedList node = new NodeLinkedList();
        node.deleteAtIndex(0);
        node.addAtHead(10);
        node.addAtHead(20);
        node.addAtHead(30);
        node.deleteAtIndex(2);
        node.addAtHead(40);
        node.addAtTail(50);
        node.addAtIndex(2, 500);
        node.addAtIndex(3, 300);
        System.out.println(node.get(3)); //40
        node.deleteAtIndex(2); //30 3000
        node.display();
    }
}
