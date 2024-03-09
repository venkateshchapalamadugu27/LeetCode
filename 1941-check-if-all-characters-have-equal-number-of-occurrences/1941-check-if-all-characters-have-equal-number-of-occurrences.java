class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            int n=c-'a';
            arr[n]++;
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            if(num!=0){
                list.add(num);
            }
        }
        int c=list.get(0);
        for(int i=0;i<list.size();i++){
            if(c!=list.get(i)){
                return false;
            }
        }
        return true;

    }
}