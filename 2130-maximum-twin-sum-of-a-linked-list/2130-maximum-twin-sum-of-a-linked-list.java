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
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>(); 
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int len=list.size();
        int maxSum=0;
        for(int i=0;i<=(len/2)-1;i++){
            int currSum=list.get(i)+list.get(len-1-i);
            maxSum=Math.max(maxSum,currSum);
        }
       
        return maxSum;
    }
}