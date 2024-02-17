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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
       ArrayList<Integer> Arr=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
           Arr.add(temp.val);
           temp=temp.next;
       }
       ArrayList<Integer> arr=reverse(Arr,left,right);
       System.out.println(arr);
   
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (int i = 0; i < arr.size(); i++) {
            current.next = new ListNode(arr.get(i));
            current = current.next;
        }
        return dummy.next;
    }
    public ArrayList<Integer> reverse(ArrayList<Integer> arr,int left,int right){
       ArrayList<Integer> Arr=new ArrayList<>();
       for(int i=left-1;i<right;i++){
           Arr.add(arr.get(i));
       }
       Collections.reverse(Arr);
       int index=left-1;
       for(int i=0;i<Arr.size();i++){
          arr.set(index, Arr.get(i));
           index++;
       }
       return arr;
    }
}