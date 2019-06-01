package collections;

import java.util.ArrayList;
import java.util.Collections;
/*comparable to compare to mixing class 
 * single properties
 * java.lang package
 */
public class EmpObjectSorting {

	public static void main(String[] args) {
		ArrayList<Emp1>al =new ArrayList<Emp1>();
		al.add(new Emp1(666,"Rab"));
		al.add(new Emp1(222,"Anfs"));
		al.add(new Emp1(555,"Raj"));
		al.add(new Emp1(333,"Bala"));
		al.add(new Emp1(444,"Boss"));
		al.add(new Emp1 (111,"Raj"));
		Collections.sort(al);
		for(Emp1 e:al) {
			System.out.println(e.empid+" "+e.empName);
		}

	}

}
