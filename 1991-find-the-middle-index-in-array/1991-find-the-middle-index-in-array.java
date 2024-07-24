class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] front=new int[nums.length];
        int[] rear=new int[nums.length];
        front[0]=nums[0];
        rear[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            front[i]=nums[i]+front[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
           rear[i]=nums[i]+rear[i+1];
        }

        // System.out.println(Arrays.toString(front));
        // System.out.println(Arrays.toString(rear));
        
        for(int i=0;i<front.length;i++){
            if(front[i]==rear[i]) return i;
        }
        return -1;
    }
}

// [ 2 ,5, 4,12,16]
// [18,16,13,12,4]