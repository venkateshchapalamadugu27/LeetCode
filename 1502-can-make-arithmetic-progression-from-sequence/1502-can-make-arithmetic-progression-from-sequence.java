class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif=arr[1]-arr[0];
        if(arr.length==2) return true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=dif){
                return false;
            }
        }
        return true;
    }
}