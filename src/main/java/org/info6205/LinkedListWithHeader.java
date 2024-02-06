package org.info6205;

public class LinkedListWithHeader {
    private ListNode head;

    public LinkedListWithHeader() {
        // Initialize the header node
        head = new ListNode(-1); // Dummy value for header
    }

    public void insert(int x) {
        ListNode newNode = new ListNode(x);
        newNode.next = head.next;
        head.next = newNode;
    }

    // Other methods...

    public static void main(String[] args) {
        LinkedListWithHeader list = new LinkedListWithHeader();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Print the list (excluding the header)
        ListNode current = list.head.next;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        // Output: 30 20 10
    }
}
