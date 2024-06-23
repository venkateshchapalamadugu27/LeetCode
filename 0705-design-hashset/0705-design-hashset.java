class MyHashSet {
    Set<Integer> list; 
    public MyHashSet() {
        list=new HashSet<>();
    }
    
    public void add(int key) {
        list.add(key);
    }
    
    public void remove(int key) {
        list.remove(key);
    }
    
    public boolean contains(int key) {
        return list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */