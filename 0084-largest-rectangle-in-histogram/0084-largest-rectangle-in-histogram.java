class Solution {
    // public int largestRectangleArea(int[] heights) {
    //     ArrayList<Integer> list=new ArrayList<>();
    //     for(int num:heights){
    //         list.add(num);
    //     }
    //     for(int i=0;i<heights.length-1;i++){
    //         for(int j=i+1;j<heights.length;j++){
    //             list.add(minNum(Arrays.copyOfRange(heights,i,j+1))*(j-i+1));
    //         }
    //     }
    //     Collections.sort(list);
    //     return list.get(list.size()-1);
    // }

    // private int minNum(int[] arr){
    //     Arrays.sort(arr);
    //     return arr[0];
    // }
    public int largestRectangleArea(int[] heights) {
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