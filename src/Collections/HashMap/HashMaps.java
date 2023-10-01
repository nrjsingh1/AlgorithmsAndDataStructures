package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	
	public static void main(String[] args) {
		
		 // Creating an empty HashMap
        Map<Integer, Boolean> hash_map = new HashMap<Integer, Boolean>();
  
        // Mapping string values to int keys
        hash_map.put(10, true);
        hash_map.put(25, true);
        hash_map.put(30, true);

        hash_map.put(15, true);
        hash_map.put(20, true);
  
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
  
        // Using entrySet() to get the set view
        System.out.println("The set is: " + hash_map.entrySet());
        
        for(Map.Entry<Integer, Boolean> me:hash_map.entrySet()) {
        	System.out.println("The key is: " + me.getKey());
        }
        
	}

}
