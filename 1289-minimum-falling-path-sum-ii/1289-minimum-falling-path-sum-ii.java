import java.util.*;
class Solution {
    //    public int minFallingPathSum(int[][] grid){
    //     sortMatrixRows(grid);
    //     int sum=0;
    //     int odd=1,even=0;
    //     for(int i=0;i<grid.length;i++){
    //         if(i%2==0) sum+=grid[i][even];
    //         else sum+=grid[i][odd];
    //     }
    //     return sum;
    // }
    // public static void sortMatrixRows(int[][] matrix) {
    //     for (int[] row : matrix) {
    //         Arrays.sort(row);
    //     }
    // }

    public int minFallingPathSum(int[][] grid) {
        int N=grid.length;
        int[] DP = Arrays.copyOf(grid[0], N);

        for (int i = 1; i < N; i++) {
            int a = findMinIndex(DP);
            int b = secondMinIndex(DP, a);
            for (int j = 0; j < N; j++) {
                if (j != a) {
                    grid[i][j] += DP[a];
                } else {
                    grid[i][j] += DP[b];
                }
            }
            DP = Arrays.copyOf(grid[i], N);
        }

        return findMin(DP);
    }

    private int findMin(int[] grid){
        int min=grid[0];
        for(int num:grid){
            if(num<min){
                min=num;
            }
        }
        return min;
    }

    private int findMinIndex(int[] arr){
         int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private int secondMinIndex(int[] arr,int num){
        int minIndex = (num == 0) ? 1 : 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != num && arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}