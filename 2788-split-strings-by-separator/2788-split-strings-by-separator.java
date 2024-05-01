class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res=new ArrayList<>(); 
        for(int j=0;j<words.size();j++){
            String word=words.get(j);
            String str="";
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==separator){
                    if(str!=""){
                        res.add(str);
                    }
                    str="";
                }
                else{
                    str+=word.charAt(i);
                }
                if(i+1==word.length()){
                    if(str!=""){
                        res.add(str);
                    }
                    str="";
                }
            }
            
        }
        return res;
    }
}