class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int row=0;row<matrix.length;row++){
            for(int j=0;j<matrix[row].length;j++){
                list.add(matrix[row][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}