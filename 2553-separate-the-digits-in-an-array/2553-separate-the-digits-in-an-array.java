class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            if(num<10){
                list.add(num);
            }
            else{
                String s=Integer.toString(num);
                int size=s.length();
                for(int i=0;i<size;i++){
                    list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
                }
            }
        }



        int[] array = new int[list.size()];
        int size=0;
        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
        return array;
    }
}