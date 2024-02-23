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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        
        ListNode temp=head  ;
        
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        
        int start=k-1;
        int end=list.size()-k;
        
        Collections.swap(list,start,end);
        
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        
        for(int i=0;i<list.size();i++){
            current.next=new ListNode(list.get(i));
            current=current.next;
        }
        
        return dummy.next;
        
    }
}