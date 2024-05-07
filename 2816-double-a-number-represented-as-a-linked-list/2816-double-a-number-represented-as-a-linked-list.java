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
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> stack=new Stack();
        Stack<Integer> dstack=new Stack();
        ListNode temp=head;

        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        int carry=0,val=0;
        while(!stack.isEmpty()){
           val=stack.pop();
           val=val*2+carry;
           dstack.push(val%10);
           carry=val/10;
        }
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        while(!dstack.isEmpty()){
            current.next=new ListNode(dstack.pop());
            current=current.next;
        }
        if(carry>0){
            dummy.val=carry;
            return dummy;
        }

        return dummy.next;
    }
}