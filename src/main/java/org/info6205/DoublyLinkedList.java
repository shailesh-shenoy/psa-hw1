package org.info6205;

class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;

    // Initialize the list with header and trailer sentinels
    public DoublyLinkedList() {
        head = new DoublyLinkedListNode(-1); // Header sentinel
        tail = new DoublyLinkedListNode(-1); // Trailer sentinel
        head.next = tail;
        tail.prev = head;
    }

    public void addNode(int data) {
        // Add a new node to the end of the list
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    public DoublyLinkedListNode findMiddleNode() {
        DoublyLinkedListNode slow = head.next;
        DoublyLinkedListNode fast = head.next;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.addNode(60);
        DoublyLinkedListNode middleNode = list.findMiddleNode();
        if (middleNode != null) {
            System.out.println("Middle node value: " + middleNode.data);
        } else {
            System.out.println("Empty list or no middle node.");
        }
    }
}