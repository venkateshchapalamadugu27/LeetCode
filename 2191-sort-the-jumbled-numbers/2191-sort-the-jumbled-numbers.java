class Solution                                                             {
    public int[] sortJumbled(int[] mapping, int[] nums)                    {
        int[] corrected=new int[nums.length];
        for(int i=0;i<nums.length;i++)                                     {
            corrected[i]=helper(mapping,nums[i]);
                                                                           }
        Integer[] indices = new Integer[corrected.length];
        for (int i = 0; i < corrected.length; i++)                         {
            indices[i] = i;
                                                                           }

        Arrays.sort(indices, new Comparator<Integer>()                     {
            @Override
            public int compare(Integer i1, Integer i2)                     {
                return Integer.compare(corrected[i1], corrected[i2]);
                                                                           }
                                                                           }
                                                                           )
                                                                           ;

        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < indices.length; i++)                           {
            sortedNums[i] = nums[indices[i]];
                                                                           }

        return sortedNums;
                                                                           }

    private static int helper(int[] mapping, int num)                      {
       int res=0;
       String s=Integer.toString(num);
       for(int i=0;i<s.length();i++)                                       {
        res=res*10+mapping[Integer.parseInt(String.valueOf(s.charAt(i)))];
                                                                           }
       return res;
                                                                           }
                                                                           }


/*

[991,338,38]

[8,9,4,0,2,1,3,5,7,6]
[0,1,2,3,4,5,6,7,8,9]

[669,007,07]

*/