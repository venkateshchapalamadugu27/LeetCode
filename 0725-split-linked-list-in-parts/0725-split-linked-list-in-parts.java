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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=size(head);
        ListNode[] newl=new ListNode[k];

        //if k>length of list
        while(k>=len){
            for(int i=0;i<len;i++)
            {
                ListNode temp=head.next;
                head.next=null;
                newl[i]=head;
                head=temp;
            }
            for(int i=len;i<k;i++)
            {
                newl[i]=null;
            }
            return newl;
        }

        //if k<length of list
        ListNode h1=head;
        int e=len%k;
        for(int i=0;i<k;i++)
        {
            ListNode temp=h1;
            for(int j=1;j<(len/k);j++)
            {
                h1=h1.next;
            }
            if(e>0)
            {
                h1=h1.next;
                e--;
            }

            ListNode newNode=h1.next;
            h1.next=null;
            h1=newNode;
            newl[i]=temp;
        }
        return newl;
    }

    private int size(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}