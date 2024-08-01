class Solution{
    public  int[][] diagonalSort(int[][] mat) {
        int row=mat.length-1,col=mat[0].length-1;
        List<List<Integer>> doubleList=new ArrayList<>();

        for(int k=col;k>=0;k--){
            int i=0,j=k;
            List<Integer> list=new ArrayList<>();
            while(i<=row && j<=col){
                list.add(mat[i][j]);
                i++;j++;
            }
            Collections.sort(list);
            doubleList.add(list);
        }

        for(int k=1;k<=row;k++){
            int j=0,i=k;
            List<Integer> list=new ArrayList<>();
            while(i<=row && j<=col){
                list.add(mat[i][j]);
                i++;j++;
            }
            Collections.sort(list);
            doubleList.add(list);
        }
        // System.out.println(doubleList);

        int cur=0;
        // int[][] result=new int[mat.length][mat[0].length];
        for(int k=col;k>=0;k--){
            int i=0,j=k;
            List<Integer> list=doubleList.get(cur++);
            int index=0;
            while(i<=row && j<=col){
                mat[i][j]=list.get(index++);
                i++;j++;
            }
        }

        for(int k=1;k<=row;k++){
            int j=0,i=k;
            int index=0;
            List<Integer> list=doubleList.get(cur++);
            while(i<=row && j<=col){
                mat[i][j]=list.get(index++);
                i++;j++;
            }
        }

        return mat;
        
    }
}