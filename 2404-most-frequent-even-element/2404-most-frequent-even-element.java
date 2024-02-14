import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        
        if (nums.length == 1) {
            return nums[0] % 2 == 0 ? nums[0] : -1;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                list.add(nums[i]);
            }
        }
        
        if (list.size() == 0) {
            return -1;
        }
        
        int currcount = 1;
        int nextcount = 1;
        int max = list.get(0);
        
        Collections.sort(list);
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                nextcount++;
            } else {
                if (nextcount > currcount) {
                    max = list.get(i - 1);
                    currcount = nextcount;
                }
                nextcount = 1;
            }
        }
        if (nextcount > currcount) {
            max = list.get(list.size() - 1);
        }
        
        return max;
    }
}
