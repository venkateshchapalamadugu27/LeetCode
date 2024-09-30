class CustomStack {
    int[] arr;
    int currIndex=0;

    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        Arrays.fill(arr,-1);
        
    }
    
    public void push(int x) {
        if(currIndex==arr.length)
        return;
        arr[currIndex]=x;
        currIndex++;
    }
    
    public int pop() {
        if(count(arr)==0)
        return -1;

        int temp = arr[currIndex-1];
        arr[currIndex-1]=-1;
        if(currIndex!=0)
        currIndex--;

        return temp;

        
    }
    
    public void increment(int k, int val) {
        int c = count(arr);
        if(k>=c)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=-1)
                arr[i]=arr[i]+val;
            }
        }
        else
        {
            for(int i =0;i<k;i++)
            {
                arr[i]=arr[i]+val;
            }
        }
        
    }
    public int count(int[] arr)
    {
        int count=0;
        for(int ele : arr)
        {
            if(ele!=-1)
            count++;
        }
        return count;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */