package org.example.BST;

public class BST {
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    private Node root ;
    BST() {

    }



    public void insert(int value) {
       // System.out.println("vau" +value);
        root =insert(root, value);
       // System.out.println("root is :: "+root.getValue());

    }

    private Node insert(Node node, int value){
       // System.out.println(node == null);
        if(node == null){
            return new Node(value);
        }
        if(node.getValue() > value){
            node.left = insert(node.left, value);
        }else if(node.getValue() < value)
        {
            node.right = insert(node.right, value);
        }

        return node;
    }
    public void display(){
        display(root, "root node is : ");
    }

    private void display(Node node, String s) {
        if(node == null){
            return;
        }
        System.out.println(s+node.getValue());
      //  System.out.println(node.left.getValue());
        display(node.left, "left child of "+node.getValue()+" is :: ");
        display(node.right, "right child of "+node.getValue()+" is :: ");
    }


    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(10);
        bst.insert(6);
        bst.insert(2);
        bst.insert(11);
        bst.insert(3);
        bst.insert(22);
        bst.display();
    }
}
