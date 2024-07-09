/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        return helperdf(root,head);
    }
    
    private boolean helperdf(TreeNode root,ListNode head){
        if(root==null) return false;
        if(match(root,head)) return true;
        return helperdf(root.left,head) || helperdf(root.right,head);
    }
    private boolean match(TreeNode root,ListNode head){
        if(head==null) return true;
        else if(root==null) return false;
        else if(root.val!=head.val) return false;
        return match(root.left,head.next) || match(root.right,head.next);


    }
}