package com.scaler.dsa1.LinkList;

public class MergeTwoSortedLinkedList {


    public static void main(String[] args) {
        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = new Node(30);
        Node b = new Node(5);
        b.next = new Node(35);
        printlist(sortedMerge(a, b));
    }

    public static Node sortedMerge(Node a,Node b){

        if (a==null){
            return b;
        }

        if(b==null){
            return a;
        }
        Node head =null,tail=null;
        if(a.data<=b.data){
            head=tail=a;
            a=a.next;
        }else{
            head=tail=b;
            b=b.next;
        }

        while (a!=null && b!=null){
            if (a.data<=b.data){
                tail.next=a;
                tail=a;
                a=a.next;
            }else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null){
            tail.next=b;
        }
        if (b==null){
            tail.next=a;
        }
        return head;
    }


    public static Node sortedMerge1(Node a, Node b) {
        // Dummy node to form the base of merged list
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes
        tail.next = (a != null) ? a : b;

        return dummy.next;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }


}
