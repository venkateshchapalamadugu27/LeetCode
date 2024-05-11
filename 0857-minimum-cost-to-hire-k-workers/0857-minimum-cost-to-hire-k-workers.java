import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] workers = new Worker[n];
        
        // Create Worker objects with wage-to-quality ratio
        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(quality[i], wage[i]);
        }
        
        // Sort workers based on wage-to-quality ratio
        Arrays.sort(workers, (a, b) -> Double.compare(a.getRatio(), b.getRatio()));
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        double totalQuality = 0;
        double minCost = Double.MAX_VALUE;

        for (Worker worker : workers) {
            totalQuality += worker.quality;
            heap.offer(worker.quality);
            
            if (heap.size() > k) {
                totalQuality -= heap.poll();
            }
            
            if (heap.size() == k) {
                minCost = Math.min(minCost, totalQuality * worker.getRatio());
            }
        }
        
        return minCost;
    }
    
    // Inner class to represent a worker
    class Worker {
        int quality;
        int wage;
        
        Worker(int quality, int wage) {
            this.quality = quality;
            this.wage = wage;
        }
        
        double getRatio() {
            return (double) wage / quality;
        }
    }
}
