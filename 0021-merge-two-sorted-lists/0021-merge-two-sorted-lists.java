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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp1=list1;
        while(temp1!=null){
            list.add(temp1.val);
            temp1=temp1.next;
        }
        ListNode temp2=list2;
        while(temp2!=null){
            list.add(temp2.val);
            temp2=temp2.next;
        }
        Collections.sort(list);
        
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (int i = 0; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return dummy.next;
        
    }
}