class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            String s=Integer.toString(nums[i]);
            int d=Integer.parseInt(String.valueOf(s.charAt(0)));
          for(int j=i+1;j<nums.length;j++){
              if(gcd(d,nums[j]%10)==1)  count++;
           }
        }
        return count;
    }
    private int gcd(int a,int b){
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}