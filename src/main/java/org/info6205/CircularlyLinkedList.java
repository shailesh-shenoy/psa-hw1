package org.info6205;

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }
}

public class CircularlyLinkedList<E> {
    private Node<E> head;
    private int size;

    // Other methods and constructors...

    @SuppressWarnings("unchecked")
    public CircularlyLinkedList<E> clone() {
        try {
            CircularlyLinkedList<E> other = (CircularlyLinkedList<E>) super.clone();
            if (size > 0) {
                // Create a new head node with the same element
                other.head = new Node<>(head.element, null);
                Node<E> walk = head.next; // Traverse the original list
                Node<E> otherTail = other.head; // Track the last node in the new list

                while (walk != null) {
                    // Create a new node with the same element
                    Node<E> newest = new Node<>(walk.element, null);
                    otherTail.next = newest; // Link previous node to this one
                    otherTail = newest; // Move the tail pointer
                    walk = walk.next; // Move to the next node in the original list
                }
                // Close the circular link
                otherTail.next = other.head;
            }
            return other;
        } catch (CloneNotSupportedException e) {
            // Handle the exception (should not occur for CircularlyLinkedList)
            e.printStackTrace();
            return null;
        }
    }

    // Other methods...
}
