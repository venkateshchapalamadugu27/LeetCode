class Solution {
    public String[] findWords(String[] words) {
        List<String> res=new ArrayList<>();
        for(String word:words){
            if(isFound(word)){
                res.add(word);
            }
        }
        String[] result=new String[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
    
    private boolean isFound(String word){
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        boolean first=check(word,s1);
        boolean second=check(word,s2);
        boolean third=check(word,s3);
        
        return first||second||third ;
        
    }
    
    private boolean check(String word,String s){
        word=word.toLowerCase();
        for(char c:word.toCharArray()){
            if(!s.contains(String.valueOf(c))) return false;
        }
        return true;
    }
}