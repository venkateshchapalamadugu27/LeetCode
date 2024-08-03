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
    int max=Integer.MIN_VALUE,count=0;
    public int goodNodes(TreeNode root) {
        return goodNodes(root,max);
    }
    public int goodNodes(TreeNode root,int max) {
        
        if(root==null) return 0;

        if(root.val>=max){
           count=1;
           max=Math.max(root.val,max);
        }
        else{
            count=0;
        }

        count+=goodNodes(root.left,max);
        count+=goodNodes(root.right,max);

        return count;
    }
}