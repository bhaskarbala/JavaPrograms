package collections.comparator;

import java.util.Comparator;

public class EnameComp implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		 return o1.eName.compareTo(o2.eName);
		
	}

}
