package com.scaler.dsa1.LinkList;

public class MiddleOfLinkList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("==============Before===============");
        displayList(head); // Use a method to display the list
        System.out.println(middeleLinkList(head));
    }

    private static int middeleLinkList(Node head) {
        Node slow=head,fast=head;
        while (fast.next !=null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
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
