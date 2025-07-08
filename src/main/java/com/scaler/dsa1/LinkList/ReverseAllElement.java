package com.scaler.dsa1.LinkList;

import java.util.ArrayList;

public class ReverseAllElement {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("==============Before===============");
        displayList(head); // Use a method to display the list

        head = reverseElement(head); // Insert element at position 1
        // 0 based

        System.out.println("==============After===============");

        displayList(head); // Display the list again after insertion
        displayList(revList(head));
    }
    //optimised Time complexity: O(n)
    //          Space complexity: O(1)
    private static Node reverseElement(Node head) {
        Node prev = null,next=null,current=head;

        while (current != null) {
            next = current.next; // Save next node
            current.next = prev;        // Reverse the link
            prev = current;             // Move rh to current node
            current = next;           // Move head to next node
        }
        return prev; // rh is the new head of the reversed list
    }

    //brute force
    static Node revList(Node head)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Node curr = head; curr != null;
             curr = curr.next) {
            arr.add(curr.data);
        }
        for (Node curr = head; curr != null;
             curr = curr.next) {
            curr.data = arr.remove(arr.size() - 1);
        }
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
