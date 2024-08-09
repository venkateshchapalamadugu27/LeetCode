class Solution {
    public int maxPower(String s) {
        int count=1,maxCount=1;
        for(int i=1;i<s.length();i++){
           if(s.charAt(i)==(s.charAt(i-1))){
            count++;
            maxCount=Math.max(count,maxCount);
           }
           else{
            count=1;
           }
        }

        return maxCount;
    }
}