package com.scaler.dsa1.LinkList;

public class RemoveElementOnPosition {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("==============Before===============");
        displayList(head); // Use a method to display the list

        head = removeElement(head,2); // Insert element at position 1
        // 0 based

        System.out.println("==============After===============");
        displayList(head); // Display the list again after insertion
    }

    private static Node removeElement(Node head, int position) {
        Node temp=head;
        if (head==null){
            return head;
        }
        if (position==0){
            head=head.next;
            return head;
        }

        /*
        removing last element
        * while (temp.next.next != null) {
            temp = temp.next;
        }
        * */
        for (int i = 1; i <=position-1 ; i++) {
            if (temp == null || temp.next == null) {
                // If position is greater than the number of nodes, return original head
                return head;
            }
            temp=temp.next;
        }
        // Check if the next node exists (i.e., if we can perform the removal)
        if (temp.next != null) {
            temp.next = temp.next.next; // Remove the node by skipping it
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
