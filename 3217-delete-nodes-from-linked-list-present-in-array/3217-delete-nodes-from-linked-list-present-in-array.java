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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
              numSet.add(num);
        }

        List<Integer> headList=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            headList.add(temp.val);
            temp=temp.next;
        }

        for (int i = 0; i < headList.size(); i++) {
             if (numSet.contains(headList.get(i))) {
                   headList.set(i, -1);
            }
        }

        ListNode dummy=new ListNode();
        ListNode current=dummy;

        for(int i=0;i<headList.size();i++){
            if(headList.get(i)!=-1){
                current.next=new ListNode(headList.get(i));
                current=current.next;
            }
        } 

        return dummy.next;
    }
}