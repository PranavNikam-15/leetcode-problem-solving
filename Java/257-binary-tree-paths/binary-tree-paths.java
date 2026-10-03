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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        collectPaths(root, "", result);
        return result;
    }

    public void collectPaths(TreeNode root, String path, List<String> result) {

        // Add current node to path
        path = path + root.val;

        // If leaf node, store complete path
        if(root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        // Left sub-tree
        if(root.left != null) {
            collectPaths(root.left, path + "->", result);
        }

        // Right sub-tree
        if(root.right != null) {
            collectPaths(root.right, path + "->", result);
        }
    }
}