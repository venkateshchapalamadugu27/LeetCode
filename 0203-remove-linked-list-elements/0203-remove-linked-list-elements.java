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
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> list=new ArrayList<>();

        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=val){
                list.add(temp.val);
            }
            temp=temp.next;
        }
       
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        for(int i=0;i<list.size();i++){
            current.next=new ListNode(list.get(i));
            current=current.next;
        }

        return dummy.next;

    }
}