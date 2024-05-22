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
    List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> list=new ArrayList<>();
        helper(root,list,0);
        return list;
    }
    private void helper(TreeNode root,List<Integer> list,int level){
       if(root!=null && level==list.size()){
        list.add(root.val);
       }
       if(root.right!=null){
        helper(root.right,list,level+1);
       }
       if(root.left!=null){
        helper(root.left,list,level+1);
       }
    }
}

// father mother brother sister rass leaves sea hills restaurant bakery