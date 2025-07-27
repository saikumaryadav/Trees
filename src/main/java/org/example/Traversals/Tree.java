package org.example.Traversals;

public class Tree {
    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }
    Node root;
    Tree(){

    }



    private void insert(int i) {
        root = insert(root, i);
    }

    private Node insert(Node node, int value) {
        if(node == null){
            return  new Node(value);
        }
        if(node.value > value){
            node.left = insert(node.left, value);
        }
        else if(node.value < value){
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(12);
        tree.insert(8);
        tree.insert(20);
        tree.insert(16);
        tree.insert(4);
        System.out.println("-----Pre order traverasal-----");
        tree.display();

        System.out.println("-----In order Traversal -------");
        tree.inorder();

        System.out.println("------Post order Traversal--------");
        tree.postOrder();

    }

    private void postOrder() {
        if(root == null){
            return ;
        }
        postOrder(root, "");
    }

    private void postOrder(Node node, String s) {
        if(node == null){
            return;
        }
        postOrder(node.left, "the right node of "+node.value+" is : ");
        postOrder(node.right, "the left node is : "+node.value+" is : ");
        System.out.print(node.value+", ");
    }

    private void inorder() {
        if(root == null){
            return;
        }
        inorder(root, "");

    }

    private void inorder(Node node, String s) {
        if(node == null){
            return;
        }
        inorder(node.left, "left node is : ");
        System.out.print(node.value+", ");
        inorder(node.right, "right node is : ");
    }

    private void display() {
        if(root == null){
            return;
        }
        display(root, "root node is : ");
    }

    private void display(Node node, String s) {
        if(node == null){
            return;
        }
        System.out.println(s+node.value);
        display(node.left, "the left child of "+node.value+" is : ");
        display(node.right, "the right child of "+node.value+" is : ");
    }


}
