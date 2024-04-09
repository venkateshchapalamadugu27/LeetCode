class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split("\\s+");
        String[] result=new String[arr.length+1];
        for(String word:arr){
           int len = Integer.parseInt(String.valueOf(word.charAt(word.length() - 1)));
            result[len]=word.substring(0,word.length()-1);
        }
        System.out.println(Arrays.toString(result));
        String res="";
        for(int i=1;i<result.length;i++){
            res+=result[i]+" ";
        }
        return res.trim();
    }
}