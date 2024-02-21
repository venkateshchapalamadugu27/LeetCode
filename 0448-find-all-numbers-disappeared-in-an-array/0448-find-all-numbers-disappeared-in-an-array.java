class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> list=new ArrayList<Integer>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1!=j){
                list.add(j+1);
            }
        }
        return list;
    }
}