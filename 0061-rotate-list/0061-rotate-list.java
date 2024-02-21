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
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        if(k==0 || head==null){
            return head;
        }
        int[] nums=new int[list.size()];
        int j=0;
        for(int i=0;i<list.size();i++){
            nums[j++]=list.get(i);
        }
        System.out.println(Arrays.toString(nums));

        k=k%nums.length;
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        ListNode dummy=new ListNode();
        ListNode current=dummy;

        for(int i=0;i<nums.length;i++){
            current.next=new ListNode(nums[i]);
            current=current.next;
        }

        return dummy.next;

    }

    private static void reverse(int[] nums,int start,int end){
         while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
      }
    }
}