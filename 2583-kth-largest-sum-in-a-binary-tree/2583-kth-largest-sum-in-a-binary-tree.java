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
    public long kthLargestLevelSum(TreeNode root, int k) {
        return listoflists(root,k);
    }
    private long listoflists(TreeNode root,int k){
        List<Long> list=new ArrayList<>();

        if(root==null) return 0;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
           long levelSize=queue.size();
           List<Long> inList=new ArrayList<>();
           
           for(long i=0;i<levelSize;i++){
              TreeNode current=queue.poll();
              inList.add((long)current.val);
              if(current.left!=null){
                queue.offer(current.left);
              }
              if(current.right!=null){
                queue.offer(current.right);
              }
           }
           list.add(sum(inList));
        }
     
        Collections.sort(list);
        
        if(list.size()<k) return -1;
        return list.get(list.size()-k);
    }

    private static long sum(List<Long> inList){
        long sum=0;
        for(int i=0;i<inList.size();i++){
            sum+=inList.get(i);
        }
        return sum;
    }
}