/*    Using  two arrays I had extracted values in the kth column and  sorted one array.
Then using sorted array,I maintained the indices to be taken first.Then created a new 2-D array.
Just assign the values.

 */
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[] arr=new int[score.length];
        int[] scoreIndices=new int[score.length];
        for(int i=0;i<score.length;i++){
            arr[i]=score[i][k];
            scoreIndices[i]=score[i][k];
        }
        int len=0;
        Arrays.sort(scoreIndices);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(scoreIndices));
        int[] correctIndices=new int[score.length];
        for(int i=scoreIndices.length-1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                if(scoreIndices[i]==arr[j]){
                    correctIndices[i]=j;
                }
            }
        }
        // System.out.println(Arrays.toString(correctIndices));
        int[][] res=new int[score.length][score[0].length];
        int x=0;
         for(int i=correctIndices.length-1;i>=0;i--){
             for(int j=0;j<score[0].length;j++){
                 res[x][j]=score[correctIndices[i]][j];
             }
             x++;
         }


        return res;
    }
}