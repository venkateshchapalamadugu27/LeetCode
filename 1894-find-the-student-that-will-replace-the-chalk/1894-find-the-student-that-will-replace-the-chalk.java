class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        // int x=0,sum=0;
        
        // while(sum<=k){
        //    sum=sum+chalk[x];
        //    if(sum>k) return x;
        //    x++;
        //    if(x==chalk.length){
        //     x=0;
        //    }
        // }

        // return x;

        int sum=0;

        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
            if(sum>k) return i;
        }

        k=k%sum;

        for(int i=0;i<chalk.length;i++){
            if(chalk[i]>k) return i;
            k=k-chalk[i];
        }

        return 0;
    }
}


// 3 7 8 10 13 17 18 20 23 27