class Solution {
    public String convertDateToBinary(String date) {
        String[] arr=date.split("-");
        System.out.println(Arrays.toString(arr));
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            int num=Integer.parseInt(s);
            sb.append(Integer.toBinaryString(num));
            sb.append("-");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}