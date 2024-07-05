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
    public int maxLevelSum(TreeNode root) {
        return listoflists(root);
    }
    private int listoflists(TreeNode root){
        List<Integer> list=new ArrayList<>();

        if(root==null) return 0;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
           int levelSize=queue.size();
           List<Integer> inList=new ArrayList<>(levelSize);
           
           for(int i=0;i<levelSize;i++){
              TreeNode current=queue.poll();
              inList.add(current.val);
              if(current.left!=null){
                queue.offer(current.left);
              }
              if(current.right!=null){
                queue.offer(current.right);
              }
           }
           list.add(sum(inList));
        }
        return max(list);
    }

    private static int sum(List<Integer> inList){
        int sum=0;
        for(int i=0;i<inList.size();i++){
            sum+=inList.get(i);
        }
        return sum;
    }
    private static int max(List<Integer> list){
        int maxSum=Integer.MIN_VALUE;
        int maxLevel=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>maxSum){
                maxLevel=i;
                maxSum=list.get(i);
            }
        }
        return maxLevel+1;
    } 
}