class Solution {
    public int findLucky(int[] arr) {
        int[] array=new int[501];
        for(int num:arr){
            array[num]++;
        }
        int max=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                  if(array[i]==i){
                max=i;
            }
            }
           
        }
        return max;
    }
}