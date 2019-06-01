package colonableAndSeralizationInterface;

import java.util.ArrayList;

public class ArraylistColoneableSupported {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		int i=10;
		do {
			al.add(i);
			i+=10;
		}while(i<=100);
		for(Integer a:al) {
			System.out.println(a);
			
		}
		ArrayList<Integer> al1=(ArrayList)al.clone();
		
		for(Integer a1:al1) {
			System.out.println(a1);
		}
		
	}

}
