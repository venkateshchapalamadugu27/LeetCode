import java.util.*;
class MyCircularDeque {

    public LinkedList<Integer> q;
    public int K;
    public MyCircularDeque(int k) {
        q=new LinkedList<Integer>();
        K=k;
    }
    
    public boolean insertFront(int value) {
        if(q.size()<K){
            q.addFirst(value);
            return true;
        }
       return false;
    }
    
    public boolean insertLast(int value) {
       if(q.size()<K){
            q.addLast(value);
            return true;
        }
       return false;
    }
    
    public boolean deleteFront() {
       if(!q.isEmpty()) {
        q.removeFirst();
        return true;
       }
        return false;
    }
    
    public boolean deleteLast() {
       if(!q.isEmpty()) {
        q.removeLast();
        return true;
       }
        return false;
    }
    
    public int getFront() {
       if(!q.isEmpty()) return q.getFirst();
        return -1;
    }
    
    public int getRear() {
        if(!q.isEmpty()) return q.getLast();
        return -1;
    }
    
    public boolean isEmpty() {
       return q.isEmpty();
    }
    
    public boolean isFull() {
        return q.size()==K;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */