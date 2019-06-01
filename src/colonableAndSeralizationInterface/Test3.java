package colonableAndSeralizationInterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String >al=new ArrayList<>();
		System.out.println(al instanceof List);
		System.out.println(al instanceof RandomAccess);
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println("------------------");
		LinkedList<String >ll=new LinkedList<>();
		System.out.println(ll instanceof List);
		System.out.println(ll instanceof RandomAccess);
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
System.out.println("------------------------");
		HashSet<String >hs=new HashSet<>();
		System.out.println(hs instanceof Set);
		System.out.println(hs instanceof RandomAccess);
		System.out.println(hs instanceof Serializable);
		System.out.println(hs instanceof Cloneable);



	}

}
