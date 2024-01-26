class Solution {
    public boolean isHappy(int n) {
        List<Integer> list=new ArrayList<>();
        boolean result=check(n,list);
        return result;
    }
    private static boolean check(int n,List<Integer> list){
        if(n==1){
            return true;
        }
         if(list.contains(n)){
            return false;
        }
       
        list.add(n);
        int num=0;
        
        while(n>0){
            int rem=n%10;
            num+=(rem*rem);
            n/=10;
        }
        
        return check(num,list);
    }
}