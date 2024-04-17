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
    public String res=null;
    public String smallestFromLeaf(TreeNode root) {
        helper(root,new StringBuilder());
        return res;
    }
    private void helper(TreeNode root,StringBuilder sb){
        if(root==null){
            return ;
        }
        sb.insert(0,(char)(root.val + 'a'));
        if(root.left==null && root.right==null){
            if(res==null || res.compareTo(sb.toString())>0){
               res=sb.toString();
            }
        }
        helper(root.left,sb);
        helper(root.right,sb);
        sb.deleteCharAt(0);
    }
}