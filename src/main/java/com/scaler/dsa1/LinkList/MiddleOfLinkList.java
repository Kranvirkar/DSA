package com.scaler.dsa1.LinkList;

public class MiddleOfLinkList {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("============== Before ==============");
        displayList(head);
        System.out.println("============== After ==============");
        System.out.println("Brute force way: " + middleLinkedListBruteForce(head));
        System.out.println("Optimized way  : " + middleLinkedList(head));
    }

    // Brute force approach
    private static int middleLinkedListBruteForce(Node head) {
        int length = getLength(head);
        int mid = length / 2;
        Node current = head;

        while (mid-- > 0) {
            current = current.next;
        }

        return current.data;
    }

    private static int getLength(Node current) {
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Optimized approach using slow and fast pointers
    private static int middleLinkedList(Node head) {
        if (head == null) {
            throw new IllegalArgumentException("Linked list is empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // Display the linked list
    private static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
