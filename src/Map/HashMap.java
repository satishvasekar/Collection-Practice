package Map;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
	
		java.util.HashMap<Integer, String> h = new java.util.HashMap<Integer,String>();
		h.put(111, "satish");
		h.put(222, "sagar");
		h.put(333, "chiatan");
		h.put(444, "ganesh");
		h.put(555, "Ram");
		h.put(11, "sham");
		System.out.println(h);
		
	// To get only keys we have keySet method whose return type is set
		Set<Integer> keys = h.keySet();
        System.out.println(keys);
        
    // To get the only values we have values method whose return type is collection
        Collection<String> c = h.values();
        System.out.println(c);
      
      /*To get the data by using entry set and the return type is the set. and it returns the entry type data
        and again entry contains data of integer and String*/ 
       Set<Entry<Integer, String>> s1 =  h.entrySet();
       for (Entry<Integer, String> entry : s1) {
		System.out.println(entry.getKey()+"----"+entry.getValue());
	}       
		
		
	}
}
