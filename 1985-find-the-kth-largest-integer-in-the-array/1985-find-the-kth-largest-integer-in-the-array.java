import java.util.*;
import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        List<BigInteger> list=new ArrayList<>();
        for(String s:nums){
            list.add(new BigInteger(s));
        }
        Collections.sort(list);
        return list.get(list.size()-k).toString();
    }
}