class Solution {
    public int heightChecker(int[] heights) {
        int[] correctHeight=new int[heights.length];
        for(int i=0;i<correctHeight.length;i++){
            correctHeight[i]=heights[i];
        }
        Arrays.sort(correctHeight);
        int wrongHeight=0;
        for(int i=0;i<correctHeight.length;i++){
            if(correctHeight[i]!=heights[i]) wrongHeight++;
        }
        return wrongHeight;
    }
}