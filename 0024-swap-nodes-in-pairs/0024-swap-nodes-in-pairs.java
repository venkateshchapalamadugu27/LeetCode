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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        
        ListNode temp=head;
        
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        
        for(int i=0;i<list.size()-1;i=i+2){
            Collections.swap(list,i,i+1);
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