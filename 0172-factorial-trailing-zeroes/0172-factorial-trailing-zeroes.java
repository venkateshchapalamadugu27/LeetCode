import java.util.*;
import java.math.BigInteger;
class Solution {
    public int trailingZeroes(int n) {
        // // BigInteger res=fact(n);
        // String r=res.toString();
        // int count=0;
        // for(int i=r.length()-1;i>=0;i--){
        //     if(r.charAt(i)=='0'){
        //         count++;
        //     }
        //     else{
        //         return count;
        //     }
        // }

        // return count;

        int count=0;

        while(n>0){
            n=n/5;
            count+=n;
        }

        return count;
    }
}

//     public BigInteger fact(int num){
//         BigInteger res=new BigInteger("1");

//         for (int i = 2; i <= num ; i++) {
//             res=res.multiply(BigInteger.valueOf(i));
//         }

//         return res;
//     }
// }

// 5 1
//   1