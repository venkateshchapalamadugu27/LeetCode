class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=max(num);
        }
        return sum;
    }
    private static int max(int num){
        if(num<10){
            return num;
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        String s=Integer.toString(num);
        int size=s.length();
        for(int i=0;i<size;i++){
            list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        
        Collections.sort(list);
        int max=list.get(size-1);
        String maxS=Integer.toString(max);
        String res="";
        for(int i=0;i<size;i++){
            res+=maxS;
        }
        
        return Integer.parseInt(res);
        
    }
}