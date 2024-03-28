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
    public ListNode mergeKLists(ListNode[] lists) {
         List<Integer> result = new ArrayList<>();
        for (ListNode list : lists) {
            ListNode head = list;
            while (head != null) {
                result.add(head.val);
                head = head.next;
            }
        }
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        Collections.sort(result);
        for(int i=0;i<result.size();i++){
            current.next=new ListNode(result.get(i));
            current=current.next;
        }
        return dummy.next;
    }
}