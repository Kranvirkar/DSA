package com.scaler.dsa1.LinkList;

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
    }

    private static Node reverseElement(Node head) {
        Node temp =head,rh=null;
        while (head!=null){
            temp=temp.next;
            //head.next=null;
            head.next=rh;
            rh=head;
            head=temp;
        }
        return rh;
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
