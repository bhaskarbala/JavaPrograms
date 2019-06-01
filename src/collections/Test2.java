package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
	 ArrayList<String> a=new ArrayList<>();
	 a.add("Sai");
	 a.add("Ram");
	 a.add("Nani");
	 a.add("Karan");
	 ArrayList<String>b=new ArrayList<>(a);
	 b.add("Boss");
	 b.add("Bhaskar");
	 b.add("Hari");
	 b.add("Vishun");
	 
	 for(String ss:b) {
		 System.out.println(ss);
	 }
	 
	 // containsAll
	 System.out.println("-------------containsAll------");
	 System.out.println(b.containsAll(a));
	 /*b.remove(3);
	 System.out.println(b.containsAll());
	 */
	 //
	/* System.out.println("------------RemoveAll-------");
	 System.out.println(b.removeAll(a));
	 System.out.println(a);
	 System.out.println(b);
	*/ 
	 /*System.out.println("-------");
	 System.out.println(b.retainAll(a));
	 System.out.println(a);
	 System.out.println(b);
	*/// subList 
	List lt=b.subList(4, b.size());
	System.out.println(lt);
	
	System.out.println("Before swap:"+b);
	Collections.swap(b, 1, 7);
	Collections.swap(b, 0, 4);
	Collections.swap(b,2,6);
	Collections.swap(b,3,5);
	
	System.out.println("After swap :"+b);
	
	// enumartion causer
	/*public interface java.util.Enumeration<E> {
		  public abstract boolean hasMoreElements();
		  public abstract E nextElement();
	*/	
	Vector<Integer> v=new Vector<>() ;
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(1, 100);
	v.add(3, 300);
	for(int i=0;i<v.size()-1;i++)
		System.out.println(v);
	Enumeration <Integer>e=v.elements();
	while (e.hasMoreElements())
		System.out.println(e.nextElement());
	// 
	System.out.println("---------------------------------");
	ArrayList<Integer>l=new ArrayList<>(v);
	l.add(100);
	l.add(200);
	l.add(300);
	l.add(400);
	l.add(1, 10);
	l.add(3,20);
	l.add(20);
	l.add(20);
	System.out.println("Size of the arayList "+l.size());
	for(Object o:l) {
		System.out.println(o);
	}
	//Iterator 
	System.out.println("-------Iterator--------");
	int count =1;
		Iterator <Integer>it=l.iterator();
		while(it.hasNext()) {
			
			if(it.next()==20) { 
				it.remove();
				count++;
			}
			System.out.println(it.next());
		}
		System.out.println("-------ListIterator---------");
			ListIterator<Integer>li=l.listIterator();
			li.add(1000);
			li.add(2000);
			
			/*while(li.hasPrevious()) {
				System.out.println(li.previous());
			
			}*/
			while(li.hasNext()) {
				if(li.next()==10) {
					li.set(35000);
				}
				System.out.println(li.next());
				System.out.println(li.nextIndex());
			}
			System.out.println("-------Previous----------");
			while(li.hasPrevious()) {
				if(li.previous()==200) {
					li.remove();
				}
				System.out.println(li.previousIndex());
			}
		
		
		

	}

}
