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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return helper(root,val,depth,1);
    }
    private TreeNode helper(TreeNode root,int val,int depth,int currDepth){
         if(depth==1){
            TreeNode newNode=new TreeNode(val);
            newNode.left=root;
            return newNode;
         }
        if(root==null){
            return root;
        }
        if(currDepth==depth-1){
            TreeNode leftmate= root.left ;
            TreeNode rightmate= root.right;

            root.left=new TreeNode(val);
            root.right=new TreeNode(val);

            root.left.left=leftmate;
            root.right.right=rightmate;

            return root;
        }

        helper(root.left,val,depth,currDepth+1);
        helper(root.right,val,depth,currDepth+1);
         return root;
    }
}