// class MyStack {
//     private ArrayList<Integer> list;
//     int size;
//     int end;
//     public MyStack() {
//         list=new ArrayList<>();
//         size=0;end=0;
//     }
    
//     public void push(int x) {
//         list.add(x);
//         end++;
//         size++;
//     }
    
//     public int pop() {
//         if (empty()) {
//             throw new IllegalStateException("Stack is empty");
//         }
//         int removed=list.get(end-1);
//         size--;
//         end--;
//         return removed;
//     }
    
//     public int top() {
//         if (empty()) {
//             throw new IllegalStateException("Stack is empty");
//         }
//         int removed=list.get(end-1);
//         return removed;
//     }
    
//     public boolean empty() {
//         return size==0;
//     }
// }

// /**
//  * Your MyStack object will be instantiated and called as such:
//  * MyStack obj = new MyStack();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.top();
//  * boolean param_4 = obj.empty();
//  */

import java.util.ArrayList;

class MyStack {
    private ArrayList<Integer> list;
    private int size;
    private int end; // Keeps track of the index of the last element

    public MyStack() {
        list = new ArrayList<>();
        size = 0;
        end = 0;
    }

    public void push(int x) {
        list.add(x);
        end++;
        size++;
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int removed = list.remove(end - 1);
        end--;
        size--;
        return removed;
    }

    public int top() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(end - 1);
    }

    public boolean empty() {
        return size == 0;
    }
}
