package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveObjectFromLinkedHashMAp {

	public static void main(String[] args) {

		LinkedHashMap<Integer, Product> h = new LinkedHashMap<Integer, Product>();
		h.put(1, new Product(111, "Laptop", 1000.5f));
		h.put(2, new Product(222, "Pen", 10.5f));
		h.put(3, new Product(333, "Camrera", 2000.5f));

		Set<Entry<Integer, Product>> hh = h.entrySet();
		Iterator<Entry<Integer, Product>> itr = hh.iterator();
		while (itr.hasNext()) {
			Entry<Integer, Product> ee = itr.next();
			Integer e1 = ee.getKey();

			Product e2 = ee.getValue();
			if (e2.pid == 111) {
				itr.remove();
			}
			if (e2.pname.equals("Pen")) {
				itr.remove();
			}

		}

		// Print the data by using For Each loop
		for (Entry<Integer, Product> entry : h.entrySet()) {
			Product p = entry.getValue();
			System.out.println(p.pid + "--" + p.pname + "--" + p.pcst);
		}
	}

}
