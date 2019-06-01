package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Programs {
public static void main(String[] args) {
	int count=0 ;
	ArrayList<Integer> a=new ArrayList<>();
	a.add(22);
	a.add(25);
	a.add(22);
	a.add(23);
	a.add(22);
	a.add(27);
	a.add(22);
	/*	ListIterator <Integer>lt=a.listIterator();
		while(lt.hasNext()) {
			if(lt.next()==22) {
				count ++;
			}
			
		}
		*/
		for(int i=0;i<=a.size()-1;i++) {
			if(a.get(i)==22) {
				count++;
			}
		}
		System.out.println(count);
}
}
