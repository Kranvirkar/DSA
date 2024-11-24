package com.scaler.dsa1.LinkList;

public class InsertElementOnPosition {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("==============Before===============");
        displayList(head); // Use a method to display the list

        head = insertElement(head, 12, 0); // Insert element at position 1
                                                        // 0 based

        System.out.println("==============After===============");
        displayList(head); // Display the list again after insertion
    }

    // Method to insert an element at a specific position
    private static Node insertElement(Node head, int data, int position) {
        Node newNode = new Node(data);

        // If the position is 0, insert at the beginning
        if (position == 0 || head == null) {
            newNode.next = head;
            return newNode;
        }

        // Traverse to the node before the desired position
        Node temp = head;
        for (int i = 1; i <=position-1; i++) {
            if (temp.next == null) {
                break; // If position is beyond the last node
            }
            temp = temp.next;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Method to display the linked list
    private static void displayList(Node head) {
        Node temp = head; // Use a temporary node for traversing
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
