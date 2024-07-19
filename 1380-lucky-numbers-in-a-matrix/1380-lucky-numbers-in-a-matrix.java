class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> rowWise=new ArrayList<>();
        for(int[] arr:matrix){
            int min=Integer.MAX_VALUE;
            for(int num:arr){
                min=Math.min(min,num);
            }
            rowWise.add(min);
        }

        List<Integer> colWise=new ArrayList<>();
        for(int i=0;i<matrix[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                max=Math.max(max,matrix[j][i]);
            }
            colWise.add(max);
        }
        
        List<Integer> result=new ArrayList<>();
        for(Integer num:colWise){
            if(rowWise.contains(num)) result.add(num);
        }

        return result;
    }
}