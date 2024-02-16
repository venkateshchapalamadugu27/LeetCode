class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            for(int j=1;j<heights.length-i;j++) {
                if (heights[j] > heights[j - 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j - 1];
                    heights[j - 1] = temp;

                    String temp1=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp1;
                }
            }
        }
        // int start=0,end=names.length-1;
        // while(start<end){
        //     String temp=names[start];
        //     names[start]=names[end];
        //     names[end]=temp;
        //     start++;end--;
        // }

        return names;
    }
}