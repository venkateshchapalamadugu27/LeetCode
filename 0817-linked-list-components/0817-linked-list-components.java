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
    public int numComponents(ListNode head, int[] nums) {
        // ArrayList<Integer> list=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // int count=0;
        // int m=list.size();
        // int n=nums.length;

        // // for(int i=0;i<n-1;i++){
        // //    if(nums[i]==list.get(i) && nums[i+1]==list.get(i+1)){
        // //     count++;
        // //    }
        // // }
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //        for(int k=0;k<n-1;k++){
        //            if(nums[i]==list.get(k) && nums[j]==list.get(k+1)){
        //                  count++;
        //         }
        //       }
        //     }
        // }
        
        // return count+1;
   
        int count=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp=head;
        while(temp!=null){
           if(set.contains(temp.val) && 
           (temp.next==null || !set.contains(temp.next.val))){
            count++;
           }
           temp=temp.next;
        }
         
         return count;
    }
}