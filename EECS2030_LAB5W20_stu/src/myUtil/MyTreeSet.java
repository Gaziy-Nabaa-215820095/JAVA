package myUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MyTreeSet<E> extends MyAbstractSet<E> {

	
	 
	protected TreeMap <E, Object> map;   // non-private for testing purposes
	
	// Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();
	
	
    /**
     * Constructs a new, empty set;  
     */
    public MyTreeSet() {
    	map = new TreeMap();
    }
    
    
    // addAll
	
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