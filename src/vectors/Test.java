/**
 * 
 */
package vectors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author NBhaskar
 *
 */
public class Test {
	public static void main(String[] args) {
			
		Vector <Products>v=new Vector<>();
		v.add(new Products(111, "Mobile", 500));
		v.add(new Products(222,"Pounds powder",200));
		v.add(new Products(333, "charge wire", 100));
		v.add(new Products(444, "chrome browser", 400));
		v.add(new Products(555, "firefox", 600));
		// Enumeration causer
		Enumeration<Products>e=v.elements();
		while(e.hasMoreElements()) {
			Products pp=e.nextElement();
			System.out.println(pp.productid+" "+pp.productName +" "+pp.productCost);
		}
		System.out.println("---------------------------------");
		// Iterator 
		Iterator <Products >it=v.iterator();
		while(it.hasNext()) {
			Products p=it.next();
			String s=p.productName;
			if(s.equals("chrome browser")) {
				it.remove();
			}	
	} 
		// ListIterator
		ListIterator <Products>li=v.listIterator();
		li.add(new Products(666, "Laptop", 25000));
		li.add(new Products(45, "notebook",12045));
		while(li.hasNext()) {
			Products p=li.next();
		if(p.productid==222) {
			li.set(new Products(2222, "Boss", 124578));	
			li.set(new Products(5555, "Megha", 1254));
		}			
		}
		for(Products p:v) {
		System.out.println(p.productName+" "+p.productid+" "+p.productCost);
		
	}

}
}