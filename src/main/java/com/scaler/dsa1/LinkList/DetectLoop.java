package com.scaler.dsa1.LinkList;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a loop manually: 5 → 2
        head.next.next.next.next.next = head.next;

        boolean hasLoop = detectLoop(head);
        System.out.println("Loop detected using hashing " + hasLoop);  // Output: true

        System.out.println("Loop detected using Floyd’s Cycle "+detectLoopF(head));
    }

    //Time: O(n)
    //Space: O(1)
    private static boolean detectLoopF(Node head) {
        Node slow=head,fast =head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    //bruteforce
    //Time: O(n)
    //Space: O(n)
    private static boolean detectLoop(Node head) {
        Set<Node> visited =new HashSet<>();
        while (head!=null){
            if (visited.contains(head)){
                return true;
            }
            visited.add(head);
            head=head.next;
        }
        return false;
    }


}
