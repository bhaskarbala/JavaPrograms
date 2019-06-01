package collections.comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* we can separated sorting logics and business in logical
 * multiple properties
 * java util package 
 * 
 */
public class Comparatorc {
	public static void main(String[] args) {
		ArrayList<Emp>a1= new ArrayList<>();
		a1.add(new Emp(222,"boss"));
		a1.add(new Emp(444,"doss"));
		a1.add(new Emp(111,"aoss"));
		a1.add(new Emp(333,"coss"));
		Collections.sort(a1,new EdiCom());
		for(Emp aa:a1) {
			System.out.println(aa.eid +" "+aa.eName);
		}
		Collections.sort(a1,new EnameComp());
		
	System.out.println("-----------------------");
	for(Emp aa:a1) {
		System.out.println(aa.eid +" "+aa.eName);
	}
}
}
