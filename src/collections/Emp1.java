package collections;

public class Emp1 implements Comparable<Emp1> {
	int empid;
	String empName;
	/**
	 * @param eid
	 * @param eName
	 */
	public Emp1(int empid, String empName) {
		this.empid = empid;
		this.empName = empName;
	}
	
	@Override
	public int compareTo(Emp1 o) {
		
		return empName.compareTo(o.empName);	}

}
