class Solution {
    public String freqAlphabets(String s) {
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            if(String.valueOf(s.charAt(i)).equals("#")){
               if(i>=2){
                String temp=s.substring(i-2,i);
                r=r+(char)(Integer.parseInt(temp)+'a'-1);
                i-=2;
               }
            }else{
                r=r+(char)(Integer.parseInt(String.valueOf(s.charAt(i)))+'a'-1);
            }
        }
        return new StringBuilder(r).reverse().toString();
    }
    
}