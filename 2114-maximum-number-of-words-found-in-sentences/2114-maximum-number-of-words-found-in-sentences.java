class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] arr=new int[sentences.length];
        int i=0;
        for(String sentence:sentences){
            String[] Sarr=sentence.split("\\s+");
            arr[i++]=Sarr.length;
        }
        Arrays.sort(arr);
        return arr[sentences.length-1];
    }
}