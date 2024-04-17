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
    public int findSecondMinimumValue(TreeNode root) {
        return kthSmallest(root,2);
    }
    List<Integer> list=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        Collections.sort(list);
        if(list.size()<=1){
            return -1;
        }
        return list.get(k-1);
    }
    private void helper(TreeNode root){
        if(root==null){
            return ;
        }
        helper(root.left);
        if(!list.contains(root.val)){
            list.add(root.val);
        }
        helper(root.right);
    }
}