class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(isSimilar(words[i],words[j])) count++;
            }
        }
        return count;
    }
    
    private boolean isSimilar(String first,String second){
        boolean firstChoice=check(first,second); 
        boolean secondChoice=check(second,first);
        
        return firstChoice&&secondChoice;
        
    }
    
    private boolean check(String first,String second){
        for(char c:first.toCharArray()){
            if(!second.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}