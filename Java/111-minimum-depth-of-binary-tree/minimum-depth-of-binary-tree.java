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
    public int minDepth(TreeNode root) {
        
        if(root == null) {
            return 0;
        }

        int level = 1;
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.offer(root);

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i=0; i < size; i++) {

                TreeNode node = q.poll();

                if(node.left == null && node.right == null) {
                    return level;
                }

                if(node.left != null) {
                    q.offer(node.left);
                }

                if(node.right != null) {
                    q.offer(node.right);
                }
            }

            level++;
        }
        
        return level;
    }
}


/*

class Solution {
    public int minDepth(TreeNode root) {
        
        if(root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        return 
            (leftDepth == 0 || rightDepth == 0) ?
            (leftDepth + rightDepth + 1) :
            Math.min(leftDepth, rightDepth) + 1;        
    }
}

*/