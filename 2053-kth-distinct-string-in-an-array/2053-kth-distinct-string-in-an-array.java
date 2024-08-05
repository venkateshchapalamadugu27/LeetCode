class Solution {
    public String kthDistinct(String[] arr, int k) {
        // List<String> list=new ArrayList<>();
        // for(int i=0;i<arr.length-1;i++){
        //     String cur=arr[i];
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]!=null && arr[j]!=null && cur.equals(arr[j])){
        //             arr[i]=null;
        //             arr[j]=null;
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=null){
        //         list.add(arr[i]);
        //     }
        // }

        // if(list.size()<k){
        //     return "";
        // }

        // System.out.println(Arrays.toString(arr));
        // System.out.println(list);
        
        // return list.get(k-1);

        Map<String, Integer> countMap = new HashMap<>();

        // Count occurrences of each string
        for (String str : arr) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        // Collect distinct elements
        List<String> distinctList = new ArrayList<>();
        for (String str : arr) {
            if (countMap.get(str) == 1) {
                distinctList.add(str);
            }
        }

        // Check if we have enough distinct elements
        if (distinctList.size() < k) {
            return "";
        }

        // Return the k-th distinct element
        return distinctList.get(k - 1);

    }
}