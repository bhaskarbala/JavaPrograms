package colonableAndSeralizationInterface;

import java.io.Serializable;

public class Emp implements Serializable {
	int eid;
	String ename;
	transient double salary;
	/**
	 * @param eid
	 * @param ename
	 */
	public Emp(int eid, String ename,double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary=salary;
	}
	

}
