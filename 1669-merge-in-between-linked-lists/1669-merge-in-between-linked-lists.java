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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ArrayList<Integer> arr1=getArr(list1);
        ArrayList<Integer> arr2=getArr(list2);
        
        int start=a;
        int end=b;

        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0;i<start;i++){
            result.add(arr1.get(i));
        }
        
        for(int i=0;i<arr2.size();i++){
            result.add(arr2.get(i));
        }

        for(int i=end+1;i<arr1.size();i++){
            result.add(arr1.get(i));
        }
      
       ListNode dummy=new ListNode();
       ListNode current=dummy;

       for(int i=0;i<result.size();i++){
           current.next=new ListNode(result.get(i));
           current=current.next;
       }

        return dummy.next;
    }

    private int getIndex(ArrayList<Integer> arr1,int a){
          for(int i=0;i<arr1.size();i++){
              if(arr1.get(i)==a){
                  return i;
              }
          }
          return 0;
    }
    private ArrayList<Integer> getArr(ListNode list){
        ArrayList<Integer> arr=new ArrayList<>();
           ListNode temp=list;
           while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        return arr;
    }
}