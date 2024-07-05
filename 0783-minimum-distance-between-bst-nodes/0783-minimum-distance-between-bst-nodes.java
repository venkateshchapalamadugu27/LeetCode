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
    public int minDiffInBST(TreeNode root) {
        // List<Integer> list=new ArrayList<>();
        // list=toList(root);
        // System.out.println(list);
        return toList(root);
    }
    private static int toList(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int level=queue.size();
            for(int i=0;i<level;i++){
                TreeNode current=queue.poll();
                list.add(current.val);
                
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null) queue.offer(current.right);
                
            }
        }
        return minDist(list);
        
    }
    
    private static int minDist(List<Integer> list){
        int s=0,e=list.size()-1;
        int min=Integer.MAX_VALUE;
        for(int i=s;i<e;i++){
            for(int j=i+1;j<=e;j++){
                min=Math.min(min,Math.abs(list.get(i)-list.get(j)));
            }
        }
        return min;
    }
}