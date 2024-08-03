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
    List<List<Integer>> bigList=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        helper(root,0,list,targetSum);
        return bigList;
    }
    
    private void helper(TreeNode node,int sum,List<Integer> list,int target){
        if(node==null) return ;
        
        sum+=node.val;
        list.add(node.val);
        
        if (node.left == null && node.right == null && sum == target) {
            bigList.add(new ArrayList<>(list));  // Make a copy of the list
        } else {
            helper(node.left, sum, list, target);
            helper(node.right, sum, list, target);
        }
        
        list.remove(list.size() - 1);  
        
    }
}