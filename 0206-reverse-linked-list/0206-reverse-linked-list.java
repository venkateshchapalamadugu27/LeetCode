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
    public ListNode reverseList(ListNode head) {

    //    ArrayList<Integer> arr=new ArrayList<>();
    //    ListNode temp=head;
    //    while(temp!=null){
    //        arr.add(temp.val);
    //        temp=temp.next;
    //    }
    //    Collections.reverse(arr);
    //    System.out.println(arr);
   
    //     ListNode dummy = new ListNode();
    //     ListNode current = dummy;

    //     for (int i = 0; i < arr.size(); i++) {
    //         current.next = new ListNode(arr.get(i));
    //         current = current.next;
    //     }
    //     return dummy.next;

    if(head==null){
        return head;
    }
       ListNode prev = null;
       ListNode present = head;
       ListNode Next = present.next;

        while (present != null) {
            // Next = present.next;
            present.next = prev;
            prev = present;
            present = Next;
            if (Next != null) {
                Next = Next.next;
            }
        }

        return prev;
    }
    
}