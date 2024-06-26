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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

    private TreeNode merge(TreeNode node1, TreeNode node2) {
        // If both nodes are null, return null
        if (node1 == null && node2 == null) {
            return null;
        }
        // If either node is null, return the non-null node
        if (node1 == null || node2 == null) {
            return (node1 != null) ? node1 : node2;
        }

        // Create a new node with the sum of both node values
        TreeNode mergedNode = new TreeNode(node1.val + node2.val);
        // Recursively merge the left children
        mergedNode.left = merge(node1.left, node2.left);
        // Recursively merge the right children
        mergedNode.right = merge(node1.right, node2.right);

        return mergedNode;
    }
}
