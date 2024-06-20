class Solution {
    public String freqAlphabets(String s) {
        List<String> list=new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--){
            if(String.valueOf(s.charAt(i)).equals("#")){
               if(i>=2){
                 list.add(s.substring(i-2,i));
                 i-=2;
               }
            }else{
                list.add(String.valueOf(s.charAt(i)));
            }
        }
        // System.out.println(list);
        String r="";
        for(int i=0;i<list.size();i++){
            int num=Integer.parseInt(list.get(i));
            r=r+(char)(num+'a'-1);
        }
        StringBuilder sb=new StringBuilder(r);
        sb.reverse();
        return sb.toString();
    }
}