class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                // System.out.println(i);
            count++;
            }
        }
        return count==3;
    }
}