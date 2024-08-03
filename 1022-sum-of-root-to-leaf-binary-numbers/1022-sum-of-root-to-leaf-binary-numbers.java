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
    int res=0;
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
        // System.out.println(list);
        
        // for(int i=0;i<list.size();i++){
        //     res+=Integer.parseInt(String.valueOf(list.get(i)),2);
        // }
        // return res;
    }
     private void ddfs(TreeNode root,int path){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            // list.add(path*10+root.val);
            res+=Integer.parseInt(String.valueOf(path*10+root.val),2);
            return ;
        }
        dfs(root.left,path*10+root.val);
        dfs(root.right,path*10+root.val);
    }
        private int dfs(TreeNode node, int path) {
        if (node == null) {
            return 0;
        }
        // Shift the path left by 1 (multiply by 2) and add the current node's value
        path = (path << 1) | node.val;

        // If it's a leaf node, return the path value
        if (node.left == null && node.right == null) {
            return path;
        }

        // Recursively calculate the sum for the left and right subtrees
        return dfs(node.left, path) + dfs(node.right, path);
    }

}