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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> list1=new ArrayList<>();
         ArrayList<Integer> list2=new ArrayList<>();
        while(temp!=null){
           list1.add(temp.val);
           list2.add(temp.val);
            temp=temp.next;
        }
        System.out.println(list1);
        Collections.reverse(list2);
        System.out.println(list2);
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i)){
                return false; 
            }
        }
        return true;
    }
}