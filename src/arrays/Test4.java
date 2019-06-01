package arrays;

import java.util.ArrayList;

public class Test4 {
	// without generic 
	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(Integer.valueOf(100));
	a.add(Double.valueOf(1254));
	a.add(Character.valueOf('d'));
	a.add(Long.valueOf(12345845l));
	for(Object aa:a) {
		System.out.println(aa);
	}
	}
	
	

}
