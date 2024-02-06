package org.info6205;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public void insert(int x) {
        ListNode newNode = new ListNode(x);
        newNode.next = head;
        head = newNode;
    }

    public ListNode find(int x) {
        ListNode lastOccurrence = null;
        ListNode current = head;

        while (current != null) {
            if (current.val == x) {
                lastOccurrence = current;
            }
            current = current.next;
        }

        return lastOccurrence;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(20);
        list.insert(40);

        int target = 20;
        ListNode lastOccurrence = list.find(target);
        if (lastOccurrence != null) {
            System.out.println("Last occurrence of " + target + " is at value: " + lastOccurrence.val);
        } else {
            System.out.println(target + " not found in the list.");
        }
    }
}
