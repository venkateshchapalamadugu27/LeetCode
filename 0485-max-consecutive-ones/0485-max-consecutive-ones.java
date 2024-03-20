class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int num:nums){
            if(num==1){
                count++;
            }
            else{
                list.add(count);
                count=0;
            }
        }
        list.add(count);
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}