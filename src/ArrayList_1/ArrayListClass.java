package ArrayList_1;

import java.util.ArrayList;

public class ArrayListClass {

public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add(new Emp(111,"satish"));
	al.add(new Student(222, "sagar"));
	al.add(10);
	al.add("sham");
	System.out.println(al);
}
}
