package com.scaler.dsa1.LinkList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedList {

    public static void main(String[] args) {
        // List 1: 1 → 2 → 3 → 4 → 5 → 6 → 7
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next = new Node(7);

        // List 2: 10 → 9 → 8 → 4 → 5 → 6 → 7 (intersects at node with value 4)
        Node n2 = new Node(10);
        n2.next = new Node(9);
        n2.next.next = new Node(8);
        n2.next.next.next = n1.next.next.next;  // Intersect at node with value 4

        System.out.print("List 1: ");
        printList(n1);

        System.out.print("List 2: ");
        printList(n2);

        // Brute Force Method
        Node bruteForce = findIntersectionBruteForce(n1, n2);
        if (bruteForce != null) {
            System.out.println("Brute Force → Intersection at node: " + bruteForce.data);
        } else {
            System.out.println("Brute Force → No intersection found.");
        }

        // Optimized Method
        Node optimized = findIntersectionOptimized(n1, n2);
        if (optimized != null) {
            System.out.println("Optimized → Intersection at node: " + optimized.data);
        } else {
            System.out.println("Optimized → No intersection found.");
        }
    }

    // ✅ Brute Force Method using HashSet
    private static Node findIntersectionBruteForce(Node n1, Node n2) {
        Set<Node> set = new HashSet<>();
        while (n1 != null) {
            set.add(n1);
            n1 = n1.next;
        }

        while (n2 != null) {
            if (set.contains(n2)) {
                return n2; // First common node
            }
            n2 = n2.next;
        }

        return null;
    }

    // ✅ Optimized Method using Length Difference
    private static Node findIntersectionOptimized(Node head1, Node head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);

        // Advance longer list by the length difference
        if (len1 > len2) {
            head1 = advanceByK(head1, len1 - len2);
        } else {
            head2 = advanceByK(head2, len2 - len1);
        }

        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }

    // 🔧 Utility: Get length of a linked list
    private static int getLength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // 🔧 Utility: Advance pointer by k steps
    private static Node advanceByK(Node node, int k) {
        while (k-- > 0 && node != null) {
            node = node.next;
        }
        return node;
    }

    // 🔧 Utility: Print linked list
    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
