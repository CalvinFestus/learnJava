package maps;

import java.util.HashMap;

public class IterateAMap2 {
	
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
	    
	    for (String string : hashmap.values()) {
			System.out.println(string);
		}
	    for (Integer string : hashmap.keySet()) {
			System.out.println(string);
		}
		
		
	}

}
