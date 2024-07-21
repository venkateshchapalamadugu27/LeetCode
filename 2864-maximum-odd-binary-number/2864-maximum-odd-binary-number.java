class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oneCount=0,zeroCount=0;

        for(char c:s.toCharArray()){
            if(c=='1') oneCount++;
            else zeroCount++;
        }
        StringBuilder sb=new StringBuilder();
        if(oneCount==1){
           for(int i=0;i<s.length()-1;i++){
            sb.append(0);
           }
           sb.append(1);
           return sb.toString();
        }

        else{
            while(oneCount>1){
                sb.append(1);
                oneCount--;
            }
            while(zeroCount>0){
                sb.append(0);
                zeroCount--;
            }

        }
        sb.append(1);
        return sb.toString();

    }
}