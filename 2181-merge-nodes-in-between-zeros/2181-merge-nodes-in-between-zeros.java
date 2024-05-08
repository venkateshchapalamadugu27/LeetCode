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
    public ListNode mergeNodes(ListNode head) {
        // List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        int sum=0;
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        while(temp!=null){
            if(temp.val==0){
                // list.add(sum);
                current.next=new ListNode(sum);
                current=current.next;
                sum=0;
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        // System.out.println(list);
        // ListNode dummy=new ListNode();
        // ListNode current=dummy;
        // for(int i=1;i<list.size();i++){
        //     current.next=new ListNode(list.get(i));
        //     current=current.next;
        // }
        return dummy.next.next;
    }
}