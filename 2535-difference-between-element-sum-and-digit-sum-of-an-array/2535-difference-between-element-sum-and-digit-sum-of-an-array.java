class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0,digitSum=0;
        for(int num:nums){
            elementSum+=num;
            digitSum+=check(num);
        }
        // for(int num:nums){
        //     digitSum+=check(num);
        // }
        return Math.abs(elementSum-digitSum);

    }

    private static int check(int n){
        if(n<10){
            return n;
        }
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
}