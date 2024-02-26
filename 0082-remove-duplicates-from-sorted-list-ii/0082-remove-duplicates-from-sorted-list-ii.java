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
    public ListNode deleteDuplicates(ListNode head) {
       ArrayList<Integer> list=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
           list.add(temp.val);
           temp=temp.next;
       }
       
       ListNode dummy=new ListNode();
       ListNode current=dummy;

       for(int i=0;i<list.size();i++){
           if(isSingle(list,list.get(i))){
               current.next=new ListNode(list.get(i));
               current=current.next;
           }
       } 

       return dummy.next;
    }

    private boolean isSingle(ArrayList<Integer> list,int num){
        int count=0;
        for(int i=0;i<list.size();i++){
              if(num==list.get(i)){
                  count++;
              }
              if(count>1){
                  return false;
              }
        }
        return true;
    }
}