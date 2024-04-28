class Solution {
    private int[] ct;
    private int n;
    private int[] res;
    private List<HashSet<Integer>> tree;
    
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        // if (n == 1) 
        // return new int[]{0};
        tree=new ArrayList<HashSet<Integer>>();
        res=new int[n];
        ct=new int[n];
        for(int i=0;i<n;i++)
            tree.add(new HashSet<Integer>()); 
        
        for(int[] e: edges)
            {
                {tree.get(e[0]).add(e[1]);
                 tree.get(e[1]).add(e[0]);}

            } //to avoid cycles in adj matrix
            postOrder(0, -1);
            preOrder(0, -1);
            return res;
        }
    
    
    // updating res, ct for each node by post-order traversal
    private void postOrder( int root,int pre) {
        for (int i : tree.get(root)) {
            if (i == pre) continue;
            
            postOrder(i, root); 
            res[root] += (res[i] + ct[i]);
            ct[root] += ct[i];
        }
       ct[root]++;
    }

    // calculate final result for each ode by pre-Order traversal
    private void preOrder( int root,int pre) {
       
        for (int i : tree.get(root)) {
            if (i == pre) continue;
            
        res[i] =  (res[root]  - ct[i]) + (ct.length - ct[i]);
      
            //dont forget to mention this case
            if (i != root) 
            preOrder(i, root);
        }
    }
}