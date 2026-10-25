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

    int dim = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        
        findHeight(root);
        return dim;
    }

    public int findHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        dim = Math.max(dim, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}