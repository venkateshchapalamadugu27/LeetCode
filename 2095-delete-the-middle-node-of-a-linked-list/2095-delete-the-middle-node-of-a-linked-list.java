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
    public ListNode deleteMiddle(ListNode head) {
        // ArrayList<Integer> list=new ArrayList<>();

        // ListNode temp=head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // int mid=list.size()/2;

        // ListNode dummy=new ListNode();
        // ListNode current=dummy;

        // for(int i=0;i<list.size();i++ ){
        //     if(i!=mid){
        //         current.next=new ListNode(list.get(i));
        //         current=current.next;
        //     }
        // }

        // return dummy.next;

        if(head==null || head.next==null){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head.next.next;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}