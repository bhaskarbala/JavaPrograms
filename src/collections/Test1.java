package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
	// Collection to array format	// with generic
		
		ArrayList<String > a=new ArrayList<>();
		a.add("String");
		a.add("Sai");
		a.add("Ram");
		a.add("null");
		
		String ss []=new String [a.size()];
		a.toArray(ss);
		System.out.println(ss.length);
		System.out.println(ss);
		for(String sss:ss)
			System.out.println(sss);
	// without generic
		ArrayList al=new ArrayList();
		al.add(25);
		al.add(30);
		al.add(40);
		al.add(95);
		
		Object[] i=new Object[al.size()];
		al.toArray(i);
		System.out.println(i);
		for(Object b:i) {
			System.out.println(b);
		}
		// array to collection 
		String s[]= {"abc","cde","ra","Ram"};

		ArrayList<String> ar=new ArrayList<String >(Arrays.asList(s));
		System.out.println(ar);
		
		
		
		

	}

}
