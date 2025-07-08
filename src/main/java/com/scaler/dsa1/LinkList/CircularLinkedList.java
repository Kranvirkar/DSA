package com.scaler.dsa1.LinkList;

public class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // Insert at a specific position
    public void insertAtPosition(int position, int data) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < position && current.next != head; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        // Update tail if inserted at end
        if (current == tail) {
            tail = newNode;
        }
    }

    // Delete from beginning
    public void deleteFromBeginning() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        current.next = head;
        tail = current;
    }

    // Delete at a specific position
    public void deleteAtPosition(int position) {
        if (head == null || position < 0) return;

        if (position == 0) {
            deleteFromBeginning();
            return;
        }

        Node current = head;
        for (int i = 1; i < position && current.next != head; i++) {
            current = current.next;
        }

        if (current.next == head) {
            System.out.println("Position out of bounds");
            return;
        }

        Node nodeToDelete = current.next;
        current.next = nodeToDelete.next;

        if (nodeToDelete == tail) {
            tail = current;
        }
    }

    // Traverse the list
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    // Search a value
    public boolean search(int value) {
        if (head == null) return false;

        Node current = head;
        do {
            if (current.data == value) return true;
            current = current.next;
        } while (current != head);
        return false;
    }

    // Get size of the list
    public int size() {
        if (head == null) return 0;

        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtBeginning(5);
        cll.insertAtPosition(2, 15); // 5 -> 10 -> 15 -> 20

        cll.traverse();  // Output: 5 -> 10 -> 15 -> 20 -> (head)

        cll.deleteAtPosition(2); // delete 15
        cll.deleteFromBeginning(); // delete 5
        cll.deleteFromEnd(); // delete 20

        cll.traverse();  // Output: 10 -> (head)

        System.out.println("Search 10: " + cll.search(10)); // true
        System.out.println("Search 99: " + cll.search(99)); // false
        System.out.println("Size: " + cll.size());           // 1
    }
}
