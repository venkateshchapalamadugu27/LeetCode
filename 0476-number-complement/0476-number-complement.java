class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        System.out.println(s);
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='1') res.append("0");
            else res.append("1");
        }
        System.out.println(res.toString());
        
        return Integer.parseInt(res.toString(),2);
    }
}