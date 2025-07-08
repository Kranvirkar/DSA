package com.scaler.dsa1.tree;

public class PostOrderTraversal {
        Node root;

    PostOrderTraversal(){
            root =null;
        }

        void printPostOrder(Node node){
            if (node==null){
                return;
            }
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.println(node.key);
        }

        void printPostOrder(){
            printPostOrder(root);
        }

        public static void main(String[] args) {
            PostOrderTraversal tree =new PostOrderTraversal();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            // Function call
            System.out.println(
                    "Preorder traversal of binary tree is ");
            tree.printPostOrder();
        }
    }


