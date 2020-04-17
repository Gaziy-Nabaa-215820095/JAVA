package myUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MyLinkedHashSet<E> extends MyAbstractSet<E> {

	
	private static final int DEFAULT_CAPACITY = 10;
	
	 
	public LinkedHashMap <E, Object> map;  // non-private for testing purposes
	
	/** Dummy value to associate with an Object in the backing Map
    used as vlaues for all the keys in the backing Map
    */
    private static final Object PRESENT = new Object();
    private int[] iValues;
    private int iSize;
	
    /**
     * Constructs a new, empty set; 
     */
    public MyLinkedHashSet() {
    	map = new LinkedHashMap<>(DEFAULT_CAPACITY);
    	// COMPLETE THIS
    }
    
    /**
	 * Create an empty set of default capacity
	 * 
	 */
    public MyLinkedHashSet(int initialCapacity) {
    	 super(); // can be skipped
     	this.map = new LinkedHashMap<>(initialCapacity);
    }
    
    
	@Override
    public Iterator<E> iterator(){
		return map.keySet().iterator();
		// COMPLETE THIS
    }
       
	@Override
	public boolean contains(E o) {
		return map.containsKey(o);
		// COMPLETE THIS
	}
	
	@Override
	public boolean add(E e) {
		return map.put(e, PRESENT) == null;
		// COMPLETE THIS
	
	}
	
	@Override
	public boolean remove(E o) {
		return map.remove(o) == PRESENT;
		// COMPLETE THIS
	}

	@Override
	public void clear() {
		map.clear();
		
	    
		// COMPLETE THIS
	}
	
	public int size() {
		 return map.size();
	 }
	 
}