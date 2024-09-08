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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> evenlist=new ArrayList<>(),
                      oddlist=new ArrayList<>(); 
        int size=0;
        ListNode temp=head;

        while(temp!=null){
            if(size%2==0) oddlist.add(temp.val);
            else          evenlist.add(temp.val);
            size++;
            temp=temp.next;
        }

        // System.out.println(oddlist);
        // System.out.println(evenlist);
        
        int[] arr=new int[size];
        int nxt=0;
        for(int i=0;i<oddlist.size();i++){
            arr[i]=oddlist.get(i);
            nxt++;
        }
        for(int i=0;i<evenlist.size();i++){
            arr[nxt++]=evenlist.get(i);
        }

        // System.out.println(Arrays.toString(arr));

        ListNode dummy=new ListNode();
        ListNode current=dummy;

        for(int i=0;i<arr.length;i++){
            current.next=new ListNode(arr[i]);
            current=current.next;
        }
        return dummy.next;
    }
}