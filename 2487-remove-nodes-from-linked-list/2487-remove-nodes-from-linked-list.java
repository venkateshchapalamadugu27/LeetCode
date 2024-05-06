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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ListNode temp=head;
        
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int max=list.get(list.size()-1);
        for(int i=list.size()-1;i>=0;i--){
           if(max>list.get(i)){
            list.set(i,-1);
           }
           else{
            max=list.get(i);
           }
        }
        // System.out.println(list); 
        ListNode dummy=new ListNode();
        ListNode current=dummy;
         
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=-1){
            current.next=new ListNode(list.get(i));
            current=current.next;
            }
        }
        
        return dummy.next;
        

    }
}