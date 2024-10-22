class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row=grid.length,col=grid[0].length,s=0;
        int[] nums=new int[row*col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                nums[s++]=grid[i][j];
            }
        }

        k=k%(row*col);

        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        
        // System.out.println(Arrays.toString(nums));
        
        List<List<Integer>> result=new ArrayList<>();
        int[][] newGrid=new int[row][col];
        s=0;

         for(int i=0;i<row;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<col;j++){
                newGrid[i][j]=nums[s++];
            }
        }
        
         for(int i=0;i<row;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<col;j++){
                temp.add(newGrid[i][j]);
            }
            result.add(temp);
        }

        // System.out.println(Arrays.deepToString(newGrid));
        return result;

    }

     private void swap(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }
}