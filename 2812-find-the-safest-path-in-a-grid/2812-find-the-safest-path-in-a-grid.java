class Solution {
    int n, dir[]={-1, 0, 1, 0, -1};
    private void fillWeights(List<List<Integer>> grid) {
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++) 
            for(int j=0;j<n;j++) 
                if(grid.get(i).get(j)==1) 
                    q.add(new int[]{i, j});

        while(!q.isEmpty()) {
            int[] p=q.poll();
            for(int i=0;i<4;i++) {
                int x=p[0]+dir[i], y=p[1]+dir[i+1];
                if(x>=0 && x<n && y>=0 && y<n && grid.get(x).get(y)==0) {
                    grid.get(x).set(y, grid.get(p[0]).get(p[1])+1);
                    q.add(new int[]{x, y});
                }
            }
        }
    }
    private int dijk(List<List<Integer>> grid) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[2]-a[2]);
        HashSet<Integer> vis=new HashSet<>();
        pq.add(new int[]{0, 0, grid.get(0).get(0)});
        int res=Integer.MAX_VALUE;
        while(!pq.isEmpty()) {
            int[] p=pq.poll();
            res=Math.min(res, p[2]);
            if(p[0]==n-1 && p[1]==n-1) break;
            for(int i=0;i<4;i++) {
                int x=p[0]+dir[i], y=p[1]+dir[i+1], pair=x*1000+y;
                if(x>=0 && x<n && y>=0 && y<n && !vis.contains(pair)) {
                    pq.add(new int[]{x, y, grid.get(x).get(y)});
                    vis.add(pair);
                }
            }
        }
        return res-1;
    }
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        n=grid.size();
        fillWeights(grid);
        return dijk(grid);
    }
}