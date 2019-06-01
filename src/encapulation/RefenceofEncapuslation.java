package encapulation;

public class RefenceofEncapuslation {
	
		private int emp;
	
		private double empsalary;
		private String ename;
		/**
		 * @param i
		 * @param b
		 * @param d
		 * @param c
		 */
		public RefenceofEncapuslation(int emp, double empsalary, String ename) {
			super();
			this.emp = emp;
			this.empsalary = empsalary;
			this.ename = ename;
		}
		 public int getempid() {
			 return emp;
		 }
		 public double getEmpsalary() {
			 return empsalary;
		 }
		 public String getEname() {
			 return ename;
		 }
		
		 
		 public void setEsalary(double salary) {
			 this.empsalary=salary;
			 
		 }
		 public void setEname(String name) {
			 this.ename=name;
		 }
	

}
