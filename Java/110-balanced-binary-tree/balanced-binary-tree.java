/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    public boolean isBalanced(TreeNode root) {
        return calculateHeight(root) != -1;
    }

    public int calculateHeight(TreeNode node) {

        if(node == null) {
            return 0;
        }

        int leftSubtreeHeight = calculateHeight(node.left);

        if(leftSubtreeHeight == -1) {
            return -1;
        }

        int rightSubtreeHeight = calculateHeight(node.right);

        if(rightSubtreeHeight == -1) {
            return -1;
        }

        if(Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftSubtreeHeight, rightSubtreeHeight);
    }
}