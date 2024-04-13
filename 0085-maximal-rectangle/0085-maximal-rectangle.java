class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
        int[] dp=new int[col+1];
        int maxArea=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               dp[j] = matrix[i][j] == '1' ? dp[j]+1 : 0;
            }
            maxArea=Math.max(maxArea,largestArea(dp));
        }

        return maxArea;
    }
    public int largestArea(int[] heights) {
        if(heights == null || heights.length == 0)
			return 0;
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(0);
        for(int i=1;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max=getMax(heights,stack,max,i);
            }
            stack.push(i);
        }

        int i=heights.length;
        while(!stack.isEmpty()){
            max=getMax(heights,stack,max,i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack,int max,int i){
       int area;
       int popped=stack.pop();
       if(stack.isEmpty()){
        area=arr[popped]*i;
       }
       else{
        area=arr[popped]*(i-1-stack.peek());
       }
       return Math.max(max,area); 
    }
}