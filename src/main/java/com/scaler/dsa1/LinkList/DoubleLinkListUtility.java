package com.scaler.dsa1.LinkList;

public class DoubleLinkListUtility {

    public static DoubleNode insertAtBeginning(int data,DoubleNode head){
        DoubleNode newNode =new DoubleNode(data);
        newNode.next=head;
        newNode.prev=null;
        if (head!=null) {
            head.prev = newNode;
        }
       return newNode;
    }

    public static DoubleNode insertAtEnding(int data,DoubleNode head){
        DoubleNode newNode=new DoubleNode(data);
        newNode.next=null;
        if (head == null) {
            newNode.prev = null;
            return newNode;
        }
        DoubleNode current=head;
        while (current.next!=null){
            current=current.next;
        }
        newNode.prev=current;
        current.next=newNode;
        return head;
    }

    public static DoubleNode insertAtPosition(int position, DoubleNode head, int data) {
        DoubleNode newNode = new DoubleNode(data);

        if (position < 0) {
            System.out.println("Invalid position");
            return head;
        }

        // Insert at beginning
        if (position == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            return newNode;
        }

        if (head == null && position > 0) {
            System.out.println("Position out of bounds");
            return null;
        }

        DoubleNode current = head;
        for (int i = 1; i < position; i++) {
            if (current.next == null) {
                System.out.println("Position out of bounds");
                return head;
            }
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;

        return head;
    }

    public static DoubleNode removeAtBegnning(DoubleNode head){
        if (head==null){
            return null;
        }
        head=head.next;
        if (head!=null){
            head.prev=null;
        }
        return head;
    }

    public static DoubleNode removeAtEnd(DoubleNode head){
        if (head==null){
            return null;
        }
        if (head.next == null) {
            return null; // Only one element in list, return null after removing it
        }
        DoubleNode current =head;
        while (current.next!=null){
        current=current.next;
        }
        current.prev.next=null;
        return head;
    }

    // Traverse forward
    public void traverseForward(DoubleNode head) {
        DoubleNode current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Traverse backward
    public void traverseBackward(DoubleNode head) {
        if (head == null) {
            System.out.println("Backward: null");
            return;
        }

        DoubleNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
