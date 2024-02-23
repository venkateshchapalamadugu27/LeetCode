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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> list=new ArrayList<>(); 
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int len=list.size();
        int remove=len-n;

        ListNode dummy=new ListNode();
        ListNode current=dummy;

        for(int i=0;i<len;i++){
            if(i!=remove){
                current.next=new ListNode(list.get(i));
                current=current.next;
            }
        } 

        return dummy.next;
    }
}