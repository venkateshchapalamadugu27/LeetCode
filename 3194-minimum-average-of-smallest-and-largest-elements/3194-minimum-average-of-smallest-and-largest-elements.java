class Solution {
    public double minimumAverage(int[] nums) {
        double resMin=Double.MAX_VALUE,currMin=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            currMin=(nums[i]+nums[nums.length-i-1])/2.0;
            // System.out.println(currMin);
            if(currMin<resMin) resMin=currMin;
        }
        // System.out.println(resMin);
        // DecimalFormat df=new DecimalFormat("0.0");
        // return Double.parseDouble(df.format(resMin));
        return resMin;
    }
}