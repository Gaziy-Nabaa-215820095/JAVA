package myUtil;

import java.util.HashMap;
import java.util.Iterator;

public class MyHashSet<E> extends MyAbstractSet<E> {

	
	protected HashMap <E, Object> map;   // non-private for testing purposes
	
	/** Dummy value to associate with an Object in the backing Map
	    used as vlaues for all the keys in the backing Map
	*/
    private static final Object PRESENT = new Object();
	
	
    /**
     * Constructs a new, empty set; 
     */
    public MyHashSet() {
        map = new HashMap<>();
    }
    
    /**
	 * Create an empty set of default capacity
	 * 
	 */
    public MyHashSet(int initialCapacity) {
        super(); // can be skipped
    	this.map = new HashMap<>(initialCapacity);
    }
    
     
	@Override
    public Iterator<E> iterator(){
    	return map.keySet().iterator();
    }
       
	@Override
	public boolean contains(E o) { 
		return map.containsKey(o);/// finish
	}
	
	@Override
	// Hint. add e into map as key, with the Dummy object PRESENT as value.
	// Hint. look Map API for the return type of put
	public boolean add(E e) { 
		return map.put(e, PRESENT) == null;
	
	}
	
	@Override
	public boolean remove(E o) {
		return map.remove(o) == PRESENT;
	}

	@Override
	public void clear() {
		map.clear();
	}
	
	//Other methods, such as the following size(), isEmpty(), addAll(), toString()  are inherited from MyAbstractSet
     
	 public int size() {
		 return map.size();
	 }
	 


}