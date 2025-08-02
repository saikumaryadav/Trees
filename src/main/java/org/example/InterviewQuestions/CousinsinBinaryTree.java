package org.example.InterviewQuestions;

public class CousinsinBinaryTree {
    class TreeNode3 {
        int val;
        TreeNode3 left;
        TreeNode3 right;

        TreeNode3() {
        }

        TreeNode3(int val) {
            this.val = val;
        }

        TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    public boolean isCousins(TreeNode3 root, int x, int y) {
        TreeNode3 xx = findNode(root, x);
        TreeNode3 yy = findNode(root, y);

        return (level(root, xx, 0) == level(root, yy ,0) && !isSibling(root, xx, yy));
    }

    private boolean isSibling(TreeNode3 node, TreeNode3 xx, TreeNode3 yy) {
        if(node == null){
            return false;
        }
        return (node.left == xx && node.right ==yy) || (node.right == xx && node.left ==yy) || isSibling(node.left, xx,yy) || isSibling(node.right, xx, yy);


    }

    private int level(TreeNode3 node, TreeNode3 xx, int level) {
        if(node == null){
            return 0;
        }
        if(node == xx){
            return level;
        }
        int l = level(node.left, xx, level+1);
        if(l != 0 ){
            return l;
        }
        return level(node.right, xx, level+1);
    }

    private TreeNode3 findNode(TreeNode3 node, int x) {
        if(node == null){
            return null;
        }
        if(node.val == x){
            return node;
        }
        TreeNode3 n = findNode(node.left, x);
        if(n != null){
            return n;
        }

        return findNode(node.right, x);
    }
}
