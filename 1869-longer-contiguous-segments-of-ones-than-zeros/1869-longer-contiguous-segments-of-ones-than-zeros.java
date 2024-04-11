class Solution {
    public boolean checkZeroOnes(String s) {
        int maxOne=Seq(s,'1');
        int maxZero=Seq(s,'0');
        return maxOne>maxZero;
    }
    private int Seq(String s,char seg){
         int max=0,count=0;
        for(char c:s.toCharArray()){
            if(c==seg){
                count++;
                 if(count>max){
                         max=count;
                  }
            }
            else{
                count=0;
            }
        }
        return max;
    }
}