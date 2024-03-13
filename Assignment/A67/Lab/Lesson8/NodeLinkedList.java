package A67.Lab.Lesson8;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-11-03
 */
public class LinkedList {
    public static void main(String[] args) {
        Node node = new Node();
        node.addAtHead(10);
        node.addAtHead(20);
        node.addAtHead(30);
        node.addAtHead(40);
        node.addAtTail(50);
        node.addAtIndex(2, 500);
        node.addAtIndex(3, 300);
        System.out.println(node.get(3)); //40
        node.deleteAtIndex(2); //30 3000

        //40 30 500 300 20 10 50
        node.display();
    }
}
