class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        ArrayList<Float> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                float resultFloat = (float) arr[i] / arr[j];
                list.add(resultFloat);
            }
        }
        Collections.sort(list);
        // System.out.println(list);
        float result=list.get(k-1);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                float resultFloat = (float) arr[i] / arr[j];
                if(result==resultFloat){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return null;
    }
}