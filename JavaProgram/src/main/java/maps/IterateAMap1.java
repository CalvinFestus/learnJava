package maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class IterateAMap1 {
	
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
		
	    TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
	    
	    for (Entry<Integer, String> map : hashmap.entrySet()) {
	    	
	    	treeMap.put(map.getKey(), map.getValue());
			
		}
	    
	    for (Entry<Integer, String> mp : treeMap.entrySet()) {
			
	    	System.out.println(mp.getKey() + "  " + mp.getValue());
	    	
		}
	    
	}

}
