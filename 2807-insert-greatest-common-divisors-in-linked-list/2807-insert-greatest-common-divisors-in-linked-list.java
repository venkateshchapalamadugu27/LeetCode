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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();

        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        System.out.println(list);

        ArrayList<Integer> result=Change(list);
        System.out.println(result);

        ListNode dummy=new ListNode();
        ListNode current=dummy;

        for(int i=0;i<result.size();i++){
            current.next=new ListNode(result.get(i));
            current=current.next;
        }
        return dummy.next;

    }

    private ArrayList<Integer> Change(ArrayList<Integer> list){

      ArrayList<Integer> gcdList=new ArrayList<>();

      for(int i=0;i<list.size()-1;i++){
          gcdList.add(gcd(list.get(i),list.get(i+1)));
      }

      ArrayList<Integer> resultList=new ArrayList<>();

      for(int i=0;i<gcdList.size();i++){
            resultList.add(list.get(i));
            resultList.add(gcdList.get(i));
      }

      resultList.add(list.get(list.size()-1));

      return resultList;
    }

    private int gcd(int a,int b){
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}