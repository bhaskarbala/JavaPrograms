package collections;

import java.util.ArrayList;
import java.util.Collections;

/* We do sorting its should be homogeneous
 * whenever to call sort(),method internally call comparTo() method is called To check the Object4
 * it should be implement by comparable 
 * all comparable implement class are applicable such as String and All wrapper Class
 */
public class SortingData {
	public static void main(String[] args) {
		ArrayList< String > al=new ArrayList<>();
		al.add("bhaskar");
		al.add("venu");
		al.add("rama");
		al.add("books");
		System.out.println("Before sort"+al);
		Collections.sort(al);
		System.out.println("After sort"+al);
		ArrayList<Integer> a=new ArrayList<>();
		a.add(222);
		a.add(25);
		a.add(3);
		a.add(6);
		a.add(555);
		System.out.println(" Before sort"+a);
		Collections.sort(a);
		System.out.println("After sort "+a);
		// to user heterogeneous  element like as Object and one is data type
		/*ArrayList a1=new ArrayList();
		a1.add("Bhaskar");
		a1.addAll(a);
		Collections.sort(a1);
		System.out.println("We get ClassCastException");
				// we get nullpointException
		// to compare to null to any object to sorting
		ArrayList a1=new ArrayList();
		a1.add("Bhaskar");
		a1.add(null);
		Collections.sort(a1);
		*/
		
	}

}
