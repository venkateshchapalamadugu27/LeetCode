class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for (int i = 1 ; i < arr.length ; i++) arr[i] ^= arr[i-1];
        int idx = 0;
        int [] res = new int[queries.length];
        for(int [] sub : queries) {
            int l = sub[0];
            int r = sub[1];
            res[idx++] = (l == 0) ? arr[r] : arr[r] ^ arr[l - 1];
        }
        return res;
    }
}