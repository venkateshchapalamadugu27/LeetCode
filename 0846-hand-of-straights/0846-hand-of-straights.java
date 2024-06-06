class Solution {
    public boolean isNStraightHand(int[] arr, int groupSize) {
        if (arr.length % groupSize != 0) {
            return false; 
        }

        Arrays.sort(arr);
        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr) {
            queue.offer(num);
        }

        while (!queue.isEmpty()) {
            int first = queue.poll();
            for (int i = 1; i < groupSize; i++) {
                if (!queue.remove(first + i)) {
                    return false;
                }
            }
        }
        return true;   
     }
}