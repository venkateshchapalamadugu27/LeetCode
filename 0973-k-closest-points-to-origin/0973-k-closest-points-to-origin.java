class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<List<Integer>> bigList = new ArrayList<>();
        
        for(int i=0;i<points.length;i++){
            List<Integer> innerList=new ArrayList<>();
            int dist=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            innerList.add(dist);
            innerList.add(i);
            bigList.add(innerList);
        }

        Collections.sort(bigList, Comparator.comparingInt(a -> a.get(0)));

        // for (List<Integer> innerList : bigList) {
        //     System.out.println(innerList);
        // }

        int[][] result=new int[k][2];

        for(int i=0;i<k;i++){
            List<Integer> innerList=bigList.get(i);
            int index=innerList.get(1);
            result[i][0]= points[index][0] ;
            result[i][1]= points[index][1];
        }

        return result;
    }
}