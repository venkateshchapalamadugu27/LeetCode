import java.util.*;
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
      int[] arr=new int[101];
      for(int n:nums){
          arr[n]++;
      }
      for(int i=0;i<101;i++){
          if(arr[i]>2){
              return false;
          }
      }
      return true;
    }
}