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
    private int diameter = 0;
    private int height(TreeNode root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight + 1);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);

        return diameter-1;
    }
}