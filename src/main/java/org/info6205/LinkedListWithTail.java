package org.info6205;

public class LinkedListWithTail {
    private ListNode tail;

    public LinkedListWithTail() {
        // Initialize the tail node
        tail = new ListNode(-1); // Dummy value for tail
    }

    public void insert(int x) {
        ListNode newNode = new ListNode(x);
        tail.next = newNode;
        tail = newNode;
    }

    // Other methods...

    public static void main(String[] args) {
        LinkedListWithTail list = new LinkedListWithTail();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Print the list (excluding the tail)
        ListNode current = list.tail.next;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        // Output: 10 20 30
    }
}