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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list=new ArrayList<>();
        list=listForm(head);
        return locMaxMin(list);
    }
    private static List<Integer> listForm(ListNode head){
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        return list;
    }

    private static int[] locMaxMin(List<Integer> list){
        List<Integer> locminmax=new ArrayList<>();
        int s=1,e=list.size()-1;
        for(int i=s;i<e;i++){
            if( (list.get(i-1)>list.get(i)&&list.get(i)<list.get(i+1)) ||
                (list.get(i-1)<list.get(i)&&list.get(i)>list.get(i+1))
              ){
                locminmax.add(i+1);
            }
        }
        int[] arr={-1,-1};
        if(locminmax.size()<2){
            return arr;
        }
        arr[1]=locminmax.get(locminmax.size()-1)-locminmax.get(0);
        arr[0]=findMin(locminmax);
        return arr;
    }
    private static int findMin(List<Integer> locminmax){
        int min=Integer.MAX_VALUE;
        for(int i=1;i<locminmax.size();i++){
            min=Math.min(min,locminmax.get(i)-locminmax.get(i-1));
        }
        return min;
    }
}




/*
{3,5,6}
{2,5}

*/