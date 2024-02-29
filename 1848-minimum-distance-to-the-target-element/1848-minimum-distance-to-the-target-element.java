class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(Math.abs(i-start));
            }
        }
        Collections.sort(list);
        return list.get(0);
    }
}