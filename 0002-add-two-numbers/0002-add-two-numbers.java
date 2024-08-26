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
 import java.util.*;
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1,temp2=l2;
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        while(temp1!=null){
            s1.append(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            s2.append(temp2.val);
            temp2=temp2.next;
        }
        
        s1.reverse(); s2.reverse();
        BigInteger b1=new BigInteger(s1.toString());  
        BigInteger b2=new BigInteger(s2.toString());
        BigInteger b3=b1.add(b2);
        String s3=b3.toString();

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for(int i=s3.length()-1;i>=0;i--) {
            current.next = new ListNode(Integer.parseInt(String.valueOf(s3.charAt(i))));
            current = current.next;
        }

        return dummy.next;
    }
}
