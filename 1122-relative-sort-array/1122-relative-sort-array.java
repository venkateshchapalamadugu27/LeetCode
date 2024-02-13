class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res=new int[arr1.length];
        List<Integer> list=new ArrayList<>();
        for(int num:arr2){ list.add(num);}
        int start=0;
        int size=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
               if(arr1[j]==arr2[i]){
               res[size++]=arr1[j];
              }
            }
           
        }
        List<Integer> left=new ArrayList<>();
        for(int num:arr1){
            if(!list.contains(num)){
                left.add(num);
            }
        }
        Collections.sort(left);
        for(int num:left){
            res[size++]=num;
        }

        return res;
    }
}