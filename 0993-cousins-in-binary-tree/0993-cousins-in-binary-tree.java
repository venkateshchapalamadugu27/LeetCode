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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);

        return (
            (level(root,xx,0)==level(root,yy,0)) && !isSiblings(root,xx,yy)
        );
    }

    private static TreeNode findNode(TreeNode node,int value){
        if(node==null){
            return null;
        }
        if(node.val==value) return node;

        TreeNode temp=findNode(node.left,value);
        if(temp!=null){
            return temp;
        }
        return findNode(node.right,value);
    }

    private static boolean isSiblings(TreeNode node,TreeNode x,TreeNode y){
       if(node==null) return false;

       return (node.left==x && node.right==y) || (node.left==y && node.right==x) 
              ||  (isSiblings(node.left,x,y)) ||  isSiblings(node.right,x,y) ;
    }

    private static int level(TreeNode node,TreeNode x,int levl){
        if(node==null){
            return 0;
        }
        if(node==x){
            return levl;
        }
        int l=level(node.left,x,levl+1);
        if(l!=0){
            return l;
        }
        return level(node.right,x,levl+1);
    }
}