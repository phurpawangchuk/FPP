package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */

public class ListNode {
    int data;
    ListNode head;
    ListNode next;

    ListNode(){}

    ListNode(int data){
        this.data = data;
        this.next = null;
        this.head = null;
    }

    void add(int data){
        ListNode newNode = new ListNode(data);
        if(head == null)
            head = newNode;
        else{
            ListNode n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = newNode;
            newNode.next = null;
        }
    }

    void displayNode(){
        ListNode n = head;
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    private void removeFromLastAtPos(int pos) {
        ListNode first = head;

        int count = getNodeCount();
        for(int i=1; i<count-pos; i++){
            first = first.next;
        }

        if(count-pos-1 < 0){
            head = head.next;
        }
        else if(count > 1)
            first.next = first.next.next;
        else
            {
                first.next = null;
                first.data = 0;
            }
    }

    private int getNodeCount() {
        ListNode node = head;
        int count = 0;
        while(node != null){
            node = node.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.add(2);
        node.add(5);
        node.add(7);
        node.add(9);
        node.add(1);
        node.add(53);
        node.add(17);
        System.out.println("Before deletion:");
        node.displayNode();

        System.out.println("\nAfter deletion:");
        node.removeFromLastAtPos(6);
        node.displayNode();

    }


}
