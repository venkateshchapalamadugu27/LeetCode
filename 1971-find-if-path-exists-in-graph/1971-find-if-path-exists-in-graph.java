class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int v1=edge[0];
            int v2=edge[1];
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        boolean[] visited=new boolean[n];
        return getPath(graph,source,destination,visited);
    }

    private boolean getPath(ArrayList<Integer>[] graph,int src,int des,boolean[] visited){
        if(src==des) return true;
        visited[src]=true;
        for(int nbr:graph[src]){
            if(visited[nbr]==false){
                if(getPath(graph,nbr,des,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}