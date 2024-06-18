class Solution {
    public boolean checkRecord(String s) {
        // int late=0,absent=0;
        // for(char c:s.toCharArray()){
        //     if(c=='A') absent++;
        //     if(absent>=2) return false;
        // }
        // for(int i=0;i<s.length()-2;i++){
        //     if(s.substring(i,i+3).equals("LLL")) return false;
        // }
        // return true;

        int absent=0,late=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') absent++;
            if(s.charAt(i)=='L') {
                late++;
            }else {
                    late=0;
            }
            if(late==3 || absent>1) return false;
        }
        return true;
    }
}