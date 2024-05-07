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
    public void flatten(TreeNode root) {
        if (root == null) return;
        
        List<TreeNode> nodeList = new ArrayList<>();
        preOrder(nodeList, root); 
        
        
        for (int i = 0; i < nodeList.size() - 1; i++) {
            TreeNode current = nodeList.get(i);
            current.left = null;
            current.right = nodeList.get(i + 1);
        }
    }
    
    private void preOrder(List<TreeNode> nodeList, TreeNode root) {
        if (root == null) return;
        
        nodeList.add(root);
        preOrder(nodeList, root.left);
        preOrder(nodeList, root.right);
    }
}