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
    private ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head){
        if(head==null){
        return head;
    }
       ListNode prev = null;
       ListNode present = head;
       ListNode Next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = Next;
            if (Next != null) {
                Next = Next.next;
            }
        }

        return prev;
      }
    

    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }

        ListNode mid=middle(head);
        ListNode hs=reverse(mid);
        ListNode hf=head;

        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }

        if(hf!=null){
            hf.next=null;
        }
    }
}