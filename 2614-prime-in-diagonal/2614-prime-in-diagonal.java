class Solution {
    public int diagonalPrime(int[][] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int row=nums.length;
        int maxPrime=0;
        for(int i=0;i<row;i++){
            if(isPrime(nums[i][i])){
                maxPrime=Math.max(nums[i][i],maxPrime);
            }
        }
        for(int i=0;i<row;i++){
            if(isPrime(nums[i][row-i-1])){
                maxPrime=Math.max(nums[i][row-i-1],maxPrime);
            }
        }
        
        return maxPrime;
    }

    private static boolean isPrime(int a){
        if(a<2) return false;
      for(int i=2;i<=Math.sqrt(a);i++){
              if(a%i==0){
                  return false;
              }
        }
      return true;
    }
}