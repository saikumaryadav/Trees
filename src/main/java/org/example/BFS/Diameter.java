package org.example.BFS;

import org.example.InterviewQuestions.BinaryTreeLevelOrderTraversal;

public class Diameter {
    class TreeNode4 {
        int val;
        TreeNode4 left;
        TreeNode4 right;
        TreeNode4() {}
        TreeNode4(int val) { this.val = val; }
        TreeNode4(int val,TreeNode4 left,TreeNode4 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode4 root) {
        int height = height(root);
        return diameter;
    }

    private int height(TreeNode4 node) {
        if(node == null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        int dia = left + right;
        diameter = Math.max(diameter, dia);
        return Math.max(left , right)+1;

    }
}
