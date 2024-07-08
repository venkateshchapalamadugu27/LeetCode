class Solution {
    public int secondsToRemoveOccurrences(String s) {
        return secondsToRemoveOccurrences(s,0);
    }
    
    public int secondsToRemoveOccurrences(String s,int res) {
        if (!s.contains("01")) return res;
        
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0' && arr[i + 1] == '1') {
                arr[i] = '1';
                arr[i + 1] = '0';
                i++; 
            }
        }
        
        res++;
        String str = new String(arr);

        return secondsToRemoveOccurrences(str, res);
    }

}