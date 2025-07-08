package com.scaler.dsa1.LinkList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLinkList {

    public static void main(String[] args) {
        int[] data = {40, 20, 10, 30, 50};
        Node head = createList(data);

        System.out.print("Original List: ");
        printList(head);

        // Brute Force Sort
        head = sortLinkedListBruteForce(head);
        System.out.print("Brute Force Sorted: ");
        printList(head);

        // Re-create unsorted list again
        head = createList(data);

        // Optimized Merge Sort
        head = sortList(head);
        System.out.print("Optimized Merge Sorted: ");
        printList(head);
    }

    //optimised T.C -O(n log n)
    private static Node sortList(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = getMiddle(head);
        Node rightHalf = mid.next;
        mid.next = null;

        Node left = sortList(head);
        Node right = sortList(rightHalf);

        return merge(left, right);
    }

    private static Node getMiddle(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data < b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;

        return dummy.next;
    }


    //brute force: T.C - O(nlogn) S.C - O(n)
    private static Node sortLinkedListBruteForce(Node head) {
        Node current =head;
        List<Integer> list=new ArrayList<>();
        if (head==null || head.next==null){
            return head;
        }
        while (current!=null){
            list.add(current.data);
            current=current.next;
        }

        Collections.sort(list);
        current=head;
        int index=0;
        while (current!=null){
            current.data= list.get(index++);
            current=current.next;
        }
        return head;
    }

    // ---------- Utility Methods ----------
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node createList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }
}
