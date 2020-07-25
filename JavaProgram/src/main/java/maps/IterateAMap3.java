package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateAMap3 {
	
	public static void main(String[] args) {
		
		// Creating a HashMap of int keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
	    
	    Iterator<Entry<Integer, String>> it = hashmap.entrySet().iterator();
	    
	    while(it.hasNext()) {
	    	
	    	Entry<Integer, String> ent = it.next();
	    	
	    	System.out.println(ent.getKey() + "  " + ent.getValue());
	    	
	    }
		
	}

}
