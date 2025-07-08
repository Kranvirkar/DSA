package com.scaler.dsa1.LinkList;

public class SearchIndex {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println(search(head, 20)); // true
        System.out.println(search(head, 40)); // false
    }

    private static boolean search(Node head, int data) {
        Node current = head;
        while (head!=null){
            if (current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
    }
}
