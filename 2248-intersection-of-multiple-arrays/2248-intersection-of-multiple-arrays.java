class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] arr=new int[1001];
        for(int[] a:nums){
            for(int b:a){
                arr[b]++;
            }
        }
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==nums.length){
                result.add(i);
            }
        }
        return result;
    }
}