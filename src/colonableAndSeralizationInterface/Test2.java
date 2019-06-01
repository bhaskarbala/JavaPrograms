package colonableAndSeralizationInterface;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Ram");
		al.add("bule");
		al.add("venka");
		System.out.println(al);
	ArrayList<String>all=(ArrayList)al.clone();
	System.out.println(all);
	}

}
