// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {

    List<Integer> list=new ArrayList<>();
    int i=-1;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    while(iterator.hasNext()){
            list.add(iterator.next());
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.get(i+1);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    i++;
        return list.get(i);
	}
	
	@Override
	public boolean hasNext() {
	    return i+1<list.size() ? true : false ;
	}
}