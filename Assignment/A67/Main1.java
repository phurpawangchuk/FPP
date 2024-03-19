package A67;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class Main1 {
    public static class ListNode<T> {
        public T data;
        public ListNode<T> next;

        // Constructor to initialize data and next pointer
        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

        public static ListNode<Integer> removeNthFromEnd(ListNode<Integer> head, int n) {
            ListNode<Integer> dummy = new ListNode<>(0);
            dummy.next = head;
            System.out.println("dduumy:"+dummy.data);
            ListNode<Integer> first = dummy;
            ListNode<Integer> second = dummy;

            // Move the first pointer n+1 steps ahead
            for (int i = 1; i <= n + 1; i++) {
                first = first.next;
            }

            // Move both pointers together until the first pointer reaches the end
            while (first != null) {
                first = first.next;
                second = second.next;
            }

            // Remove the nth node from the end
            second.next = second.next.next;

            return dummy.next;
        }

        public static void printList(ListNode<Integer> head) {
            ListNode<Integer> current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode<Integer> head = new ListNode<>(1);
            head.next = new ListNode<>(2);
            head.next.next = new ListNode<>(3);
            head.next.next.next = new ListNode<>(4);
            head.next.next.next.next = new ListNode<>(5);

            System.out.println("Original List:");
            printList(head);

            // Remove the second node from the end
            head = removeNthFromEnd(head, 3);

            System.out.println("List after removing the 2nd node from the end:");
            printList(head);
        }
}
