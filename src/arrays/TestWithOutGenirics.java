package arrays;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class TestWithOutGenirics {
	

	public static void main(String[] args) {
		// without generic we check the type checking and Type casting 
		ArrayList ar=new ArrayList();
		ar.add(new Emp(25,"Boss"));// Warper class
		ar.add(new Student(10,"Bhaskar"));
		ar.add(new Emp(25,"Sai"));
		
		ArrayList arr=new ArrayList();
		arr.add("String Rama");
		arr.add(25);
		arr.add(25.15);
		arr.add(125.25f);
		arr.add('B');
		arr.addAll(ar);
		System.out.println(ar.get(0));
		
		for(Object a:arr) {
			if(a instanceof Student) {
				Student s=(Student)a;
				System.out.println(s.sId+" "+s.sName);
			}
			else if(a instanceof Emp) {
				Emp e=(Emp)a;
				System.out.println(e.eId+","+e.eName);
			}
			else if(a instanceof Integer) {
				System.out.println(a);
			}
			else if(a instanceof String)
			{
				System.out.println(a);
			}
			else if(a instanceof Double)
				System.out.println(a);
			
			
		}
		
		// what happen internal in warper class
		
	ArrayList a1=new ArrayList();
	
					
		
		
		
			
	}
}
