class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] res=new int[1001];
        Arrays.fill(res,0);
        for(int[] arr:nums){
            for(int a:arr){
                res[a]++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<res.length;i++){
            if(res[i]==nums.length){
                list.add(i);
            }
        }

        return list;
    }
}