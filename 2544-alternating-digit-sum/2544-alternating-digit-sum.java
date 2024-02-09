// class Solution {
//     public int alternateDigitSum(int n) {
//         int odd=0,even=0,N=0;
//         while(n>0){
//             int rem=n%10;
//             N=N*10+rem;
//             n=n/10;
//         }
//         ArrayList<Integer> list=new ArrayList<>();
//         while(N>0){
//             int rem=N%10;
//             list.add(rem);
//             N=N/10;
//         }
//         for(int i=0;i<list.size();i++){
//             if(i%2==0) {
//                even+=list.get(i);
//             }
//             else{
//                 odd+=list.get(i);
//             }
//         }
//         return even-odd;
//     }
// }

class Solution {
    public int alternateDigitSum(int n) {
        int odd=0,even=0;
        String  s= Integer.toString(n);
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                even+=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            else{
                odd+=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        
        return even-odd;
    }
}