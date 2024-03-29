import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pat=pattern.toCharArray();
        String[] words=s.split("\\s+");
        if(pat.length!=words.length) return false;
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<pat.length;i++){
            char ch=pat[i];
            String word=words[i];
            if(map.containsKey(ch)){
               if(!map.get(ch).equals(word)){
                  return false;
            }
            }
            else{
                if(map.containsValue(word)){
                    return false;
                }
                map.put(ch,word);
            }
        }
        return true;
    }
}