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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        
        if(root==null) return list;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode current=queue.poll();
                temp.add(current.val);
                
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
                
            }
            Collections.sort(temp);
            list.add(temp.get(temp.size()-1));
        }
        
        return list;
    }
}