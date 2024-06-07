class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr=sentence.split("\\s+");
        // System.out.println(Arrays.toString(arr));
        for(String word:dictionary){
            for(int i=0;i<arr.length;i++){
                String sentenceWord=arr[i];
                if(sentenceWord.length()>=word.length() && 
                   sentenceWord.substring(0,word.length()).equals(word)){
                    arr[i]=word;
                }
            }
        }
        // System.out.println(Arrays.toString(arr));
        return String.join(" ", arr);
    }
}