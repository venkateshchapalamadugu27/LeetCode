class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left=new ArrayList<>();
        List<Integer> mid=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) left.add(nums[i]);
            if(nums[i]==pivot) mid.add(nums[i]);
            if(nums[i]>pivot) right.add(nums[i]);
        }
        for(int num:mid){
            left.add(num);
        }
        for(int num:right){
            left.add(num);
        }
        System.out.println(left);
        for(int i=0;i<nums.length;i++){
            nums[i]=left.get(i);
        }
        return nums;
    }
}