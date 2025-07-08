package com.scaler.dsa1.LinkList;

public class SinglelyLinkListUtility {

    public static Node insertAtBeginning(int data,Node head){
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    
    public static Node insertAtEnd(int data,Node head){
        Node newNode =new Node(data);
        if(head==null){
            return newNode;
        }
        Node current =head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        return head;
    }

    public static Node insertAtPosition(int position, Node head, int data) {
        Node newNode = new Node(data);

        if (position < 0) {
            System.out.println("Invalid position");
            return head;
        }

        // Case 1: Insert at the beginning
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        // Case 2: Insert at position > 0
        Node current = head;
        int index = 0;

        // Traverse until one node before the desired position
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static Node removeFirstNode(Node head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }

    public static Node removeLastNode(Node head){
        if(head==null){
            return null;
        }
        if (head.next == null) {
            return null; // Only one node — after deletion, list becomes empty
        }
        Node current =head;
        while (current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return head;
    }

    public static void travelsalLinkList(Node head){
        if(head==null){
            System.out.println("LinkList is Empty");
        }
        while (head!=null){
            System.out.print("LinkList : ");
            System.out.print(head.data);
            head=head.next;
        }
    }

}
