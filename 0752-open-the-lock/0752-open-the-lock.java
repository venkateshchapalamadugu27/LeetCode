class Solution {
    private final static int N = 10000; 
    private boolean[] visited;
    private int target;
    
    public int openLock(String[] deadends, String target) {
        visited = new boolean[N];
        this.target = Integer.parseInt(target);
        if (this.target == 0) return 0;
        
        for (String end : deadends) {
            int index = Integer.parseInt(end);
            visited[index] = true;
        }
        
        int count = 0;
        List<Integer> current = new ArrayList<>();
        if (visited[0]) return -1;
        current.add(0);
        visited[0] = true; 
        while (!current.isEmpty()) {
            current = bfsStep(current);
            ++count;
        }
        
        return visited[this.target] ? count : -1;
    }
    
    private List<Integer> bfsStep(List<Integer> current) {
        List<Integer> next = new ArrayList<>();
        for (Integer v : current) {
            List<Integer> neigbours = getNeigbours(v);
            for (Integer u : neigbours) {
                if (u.intValue() == target) {
                    visited[u] = true;
                    next.clear();
                    return next;
                }
                
                if (!visited[u]) {
                    visited[u] = true;
                    next.add(u);
                }
            }
        }
        
        return next;
    }
    
    
    private List<Integer> getNeigbours(final int v) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < N; i = i*10) {
            int d = (v/i)%10;
            int next = (d == 9) ? 0 : d + 1;
            int prev = (d == 0) ? 9 : d - 1;
            list.add(v - d*i + next*i);
            list.add(v - d*i + prev*i); 
        }    
        
        return list;
    }
}