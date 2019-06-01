package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet123 {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		int i=0;
		while(i<=10) {
			ts.add(i);
			i++;
		}
		System.out.println(ts);
		SortedSet<Integer>st=ts.subSet(3, 7);
		System.out.println(ts.tailSet(5));
		System.out.println(ts.tailSet(5, false));
		System.out.println(ts.headSet(5));
		
	}

}
