package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    class TreeNode2 {
        int val;
        TreeNode2 left;
        TreeNode2 right;
        TreeNode2() {}
        TreeNode2(int val) { this.val = val; }
        TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    public static List<Integer> rightSideView(TreeNode2 root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode2> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i=0;i<levelSize;i++) {

                TreeNode2 currentNode = queue.poll();
                if(i== levelSize-1){
                    result.add(currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

        }

        return result;
    }
}
