class NumArray {
    public int[] nums;
    int sum=0;
    public NumArray(int[] nums) {
        this.nums=nums;
        for(int num:nums){
            sum+=num;
        }      
    }
    
    public void update(int index, int val) {
        sum=sum-nums[index]+val;
        nums[index]=val;
    }
    
    public int sumRange(int left, int right) {
        int i=0,j=nums.length-1;
        int temp=sum;
        while(i<left){
            temp=temp-nums[i];
            i++;
        }
        while(j>right){
            temp=temp-nums[j];
            j--;
        }
        return temp;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */