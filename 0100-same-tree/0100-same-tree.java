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
 if p is None and q is None:
            return True
        if p is None or q is None:
            return False
        return (p.val == q.val) and self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right)
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
         if(p==null && q==null) return true;
         if(p==null || q==null) return false;
         return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}