package com.scaler.dsa1.tree;

public class MaxElementIntree {

    Node root;

    MaxElementIntree(){
        root =null;
    }

    int MaxElement (Node node){
        if (node==null){
            return Integer.MIN_VALUE;
        }else {
            return Math.max(node.key,
                    Math.max(MaxElement(node.left),MaxElement(node.right)));
        }

    }


    int MaxElement (){
        return MaxElement(root);
    }

    public static void main(String[] args) {
        MaxElementIntree tree = new MaxElementIntree();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        // Function call
        System.out.println("Maximum element is "
                + tree.MaxElement(tree.root));
    }
}
