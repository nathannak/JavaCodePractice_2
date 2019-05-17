package findNonRepeatedElements;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	
	
	public static void main(String[] args) {
	
		int[] arr = new int[] {1,1,4,6,2,2,3,2,3,3,4,5};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		// count
		for(int element : arr) {
			
			if (!map.containsKey(element)) {
				map.put(element,1);
			}else{
				map.put(element,map.get(element)+1);
			}
			
		}
		
		// iterate -> 1
		for( int element : arr ) {
			if( map.get(element) == 1) {
				System.out.println(element);
			}
		}
		
		// iterate -> 2
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
        {  
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue()); 
    	} 
		
	}
}
