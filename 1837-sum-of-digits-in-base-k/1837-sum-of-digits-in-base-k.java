class Solution {
    public int sumBase(int num, int k) {
        // StringBuilder sb=new StringBuilder();
        int result=0;
        while(num>0){
            int digit = num % k;
            // sb.append(digit);
            result+=digit;
            num /= k;
        }
        // int result=0;
        // String s=sb.toString();
        // for(int i=0;i<s.length();i++){
        //     result = result + (Integer.parseInt(String.valueOf(s.charAt(i))));
        // }
        return result;
    }
}