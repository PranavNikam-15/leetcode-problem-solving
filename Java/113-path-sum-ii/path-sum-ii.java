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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, result, path);
        return result;
    }

    public void dfs(TreeNode root, int targetSum, 
        List<List<Integer>> result, List<Integer> path) 
    {

        if(root == null) {
            return;
        }

        path.add(root.val);
        targetSum = targetSum - root.val;

        if(root.left == null && root.right == null 
            && (targetSum == 0)) 
        {
            result.add(new ArrayList<>(path));
        }

        dfs(root.left, targetSum, result, path);
        dfs(root.right, targetSum, result, path);

        path.remove(path.size() - 1);
    }
}