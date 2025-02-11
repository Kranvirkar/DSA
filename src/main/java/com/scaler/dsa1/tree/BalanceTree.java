package com.scaler.dsa1.tree;

public class BalanceTree {

    static int isBalanced(Node node){
        if(node ==null){
            return 0;
        }
        int ltree =isBalanced(node.left);
        if (ltree==-1){
            return -1;
        }
        int rtree =isBalanced(node.right);
        if (rtree==-1){
            return -1;
        }
        if (Math.abs(ltree-rtree)>1){
            return -1;
        }else {
            return Math.max(ltree,rtree)+1;
        }

    }

    public static void main(String[] args) {

            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(30);
            root.right.left = new Node(15);
            root.right.right = new Node(20);

            if (isBalanced(root) > 0)
                System.out.print("Balanced");
            else
                System.out.print("Not Balanced");
        }

}
