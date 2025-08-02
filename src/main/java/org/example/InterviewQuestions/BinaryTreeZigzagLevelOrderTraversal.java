package org.example.InterviewQuestions;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    class TreeNode1 {
        int val;
        TreeNode1 left;
        TreeNode1 right;

        TreeNode1() {
        }

        TreeNode1(int val) {
            this.val = val;
        }

        TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode1 root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode1> queue = new LinkedList<>();
        queue.offerFirst(root);
        boolean reverse = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentList = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode1 currentNode = queue.pollFirst();

                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                    currentList.add(currentNode.val);
                } else {
                    TreeNode1 currentNode = queue.pollLast();
                    if(currentNode.right != null){
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        queue.addFirst(currentNode.left);
                    }
                    currentList.add(currentNode.val);

                }
                result.add(currentList);
                reverse = !reverse;

            }

        }


        return result;
    }
}
