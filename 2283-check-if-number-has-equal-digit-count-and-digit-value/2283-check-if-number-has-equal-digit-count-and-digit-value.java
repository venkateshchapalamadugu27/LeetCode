class Solution {
    public boolean digitCount(String num) {
        int[] freq=new int[10];
        for(int i=0;i<num.length();i++){
            int digit=Integer.parseInt(String.valueOf(num.charAt(i)));
            freq[digit]++;
        }
        for(int i=0;i<num.length();i++){
            int digit=Integer.parseInt(String.valueOf(num.charAt(i)));
            if(digit!=freq[i]){
                return false;
            }
        }
        return true;
    }
}