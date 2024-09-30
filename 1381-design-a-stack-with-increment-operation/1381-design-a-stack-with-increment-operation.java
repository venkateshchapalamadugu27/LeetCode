class CustomStack {
    private int[] arr;
    private int ptr=-1;
    public CustomStack(int maxSize) {
        this.arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(isFull()){
            return ;
        }
        ptr++;
        arr[ptr]=x;
        return ;
    }
    
    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int remove=arr[ptr];
        ptr--;
        return remove;
    }
    
    public void increment(int k, int val) {
        if(ptr!=-1){
            if(k>ptr){
                for(int i=0;i<ptr+1;i++){
                    arr[i]+=val;
                }
            }
            else{
                for(int i=0;i<k;i++){
                    arr[i]+=val;
                }
            }
        }
    }

    private boolean isEmpty(){
        return ptr==-1;
    }
    private boolean isFull(){
        return ptr==arr.length -1;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */