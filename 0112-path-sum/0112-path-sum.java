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
    public List<Integer> list=new ArrayList<>();
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root,0);
        return list.contains(targetSum);
    }
    private void helper(TreeNode node,int sum){
        if(node==null) return ;
        
        sum+=node.val;
        
        if(node.left==null && node.right==null){
            list.add(sum);
        }
        else{
            helper(node.left,sum);
            helper(node.right,sum);
        }
        
    }
}