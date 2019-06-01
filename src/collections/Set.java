package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		HashSet<Bus> hs=new HashSet<Bus>();
		hs.add(new Bus(222,"Rayol","KA567812"));
		hs.add(new Bus(111,"Boss","KA567813"));
		hs.add(new Bus(333,"Raj","KA567814"));
		hs.add(new Bus(444,"Krishnaveni","KA567815"));
	
		
		Iterator<Bus> it=hs.iterator();
		while (it.hasNext()) {
		 Bus b= it.next();
		
			if(b.busName.equals("Rayol")) {
				it.remove();
			}
			
			
		}
		for(Bus h:hs) {
			System.out.println(h.busID+","+h.busNo+","+h.busName);
		}
		

	}

}
