class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start=0,end=arr.length-1;
        while(end-start >= k){
          if(Math.abs(arr[start]-x)>Math.abs(arr[end]-x)){
              start++;
          }
          else{
              end--;
          }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=start;i<=end;i++){
            list.add(arr[i]);
        }
        return list;
    }
}