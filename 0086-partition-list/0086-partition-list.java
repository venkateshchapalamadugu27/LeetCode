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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                list1.add(temp.val);
            }
            else{
                list2.add(temp.val);
            }
            temp=temp.next;
        }
       list1.addAll(list2);

       ListNode dummy=new ListNode();
       ListNode current=dummy;

       for(int i=0;i<list1.size();i++){
           current.next=new ListNode(list1.get(i));
           current=current.next;
       }

       return dummy.next;
    }
}