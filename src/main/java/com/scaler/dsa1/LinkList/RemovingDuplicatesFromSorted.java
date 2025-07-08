package com.scaler.dsa1.LinkList;

public class RemovingDuplicatesFromSorted {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);

        System.out.print("Before: ");
        printList(head);

        head = removeDuplicates(head);

        System.out.print("After: ");
        printList(head);
    }

    //Time Complexity: O(n) where n is the number of nodes in the given linked list.
    //Space Complexity: O(1) , as there is no extra space used.
    static Node removeDuplicates(Node head) {
        if (head ==null || head.next==null){
            return head;
        }
        Node current =head;
        while (current!=null && current.next!=null){
            if (current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
