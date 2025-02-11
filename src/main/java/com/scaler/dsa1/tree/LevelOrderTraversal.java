package com.scaler.dsa1.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    Node root;
    LevelOrderTraversal(){
        root=null;
    }

    static void printLevelOfOrder(Node node){
        if(node==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        queue.add(null);
        while (queue.size()>1){
            Node current =queue.poll();
            if (current==null){
                System.out.println();
                queue.add(null);
                continue;
            }
            System.out.print(current.key+" ");
            if (current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }


    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);

        printLevelOfOrder(root);
    }
}
