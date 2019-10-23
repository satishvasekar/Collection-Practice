package Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap {

	public static void main(String[] args) {

		java.util.LinkedHashMap<Emp, Student> hmap = new java.util.LinkedHashMap<Emp, Student>();
		hmap.put(new Emp(111, "satish"), new Student(123, "durga"));
		hmap.put(new Emp(222, "sagar"), new Student(234, "ratan"));
		hmap.put(new Emp(333, "sham"), new Student(456, "srawya"));
		hmap.put(new Emp(444, "chaitan"), new Student(678, "anu"));

		// To get the keys we have to take by key set, it will give us Emp data
		Set<Emp> e = hmap.keySet();
		for (Emp emp : e) {
			System.out.println(emp.eid + "--" + emp.ename);
		}

		// To gate the values we have to take by values, it will give us Student data
		Collection<Student> s = hmap.values();
		for (Student student : s) {
			System.out.println(student.sid + "---" + student.sname);
		}
		
		/* To take the all entries we will take by entry set and we can iterate
		   them with the help of the iterator*/ 
		Set<Entry<Emp, Student>> es = hmap.entrySet();
		Iterator<Entry<Emp, Student>> itr = es.iterator();
		while(itr.hasNext()){
			Entry<Emp, Student> e1 = itr.next();
			Emp ee = e1.getKey();
			System.out.println(ee.eid+"--"+ee.ename);
			
			Student ss = e1.getValue();
			System.out.println(ss.sid+"--"+ss.sname);
		}
						
	}

}
