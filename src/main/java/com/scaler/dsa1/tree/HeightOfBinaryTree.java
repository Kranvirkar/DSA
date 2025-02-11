package com.scaler.dsa1.tree;

public class HeightOfBinaryTree {
    Node root;

    HeightOfBinaryTree(){
        root=null;
    }

    int printMaxHeight(Node node){
        if (node==null){
            return 0;
        }

        int lDepth =printMaxHeight(node.left);
        int rDepth =printMaxHeight(node.right);

        return Math.max(lDepth,rDepth)+1;
    }

    public static void main(String[] args) {
        HeightOfBinaryTree tree =new HeightOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is "
                + tree.printMaxHeight(tree.root));
    }
    }

