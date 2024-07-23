class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            if(i%2==1) list.add(i);
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            int k=list.get(i);
            sum+=helper(arr,k);
        }
        return sum;
    }

    private int helper(int[] arr,int k){
       int sum = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
        }
        return sum;
    }
}