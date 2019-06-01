package collections;

public class Emp implements Comparable {
	int empid;
	String empName;
	/**
	 * @param eid
	 * @param eName
	 */
	public Emp(int empid, String empName) {
		this.empid = empid;
		this.empName = empName;
	}
	
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		if(empid==e.empid) {
			return 0;// no change
		}
		else if(empid>e.empid) {
			return 1;// change
		}else
			return -1;// no change
		
	}
	
	

}
