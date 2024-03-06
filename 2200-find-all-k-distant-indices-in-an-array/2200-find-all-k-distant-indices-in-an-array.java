class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list=new ArrayList<>();
        // List<Integer> list1=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //    if(nums[i]==key){
        //        list1.add(i);
        //    }
        // }
   
        // for(int i=0;i<list1.size();i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(Math.abs(list1.get(i)-j)<=k){
        //             list.add(j);
        //         }
        //     }
        // }
        // Set<Integer> set = list.stream().collect(Collectors.toSet());
        // List<Integer> aList= set.stream().collect(Collectors.toList());

        // return aList;


        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(i-j)<=k && nums[j]==key){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}