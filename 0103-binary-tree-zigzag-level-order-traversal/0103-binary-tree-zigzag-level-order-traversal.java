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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();

        if(root==null) return list;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int k=0;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentList=new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
               TreeNode current=queue.poll();
               currentList.add(current.val);
               if(current.left!=null){
                   queue.offer(current.left);
               }
               if(current.right!=null){
                   queue.offer(current.right);
               }
            }
            if(k%2==0) list.add(currentList);
            else list.add(currentList.reversed());
            k++;
            
        }
         
        return list;
    }
}