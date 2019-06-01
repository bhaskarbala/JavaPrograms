package encapulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefenceofEncapuslation r=new RefenceofEncapuslation(20, 50000.22, "Bhaskar");
		int a=r.getempid();
		System.out.println(a);
		System.out.println(r.getEmpsalary());
		System.out.println(r.getEname());
		//r.setEmpid(222);
		r.setEname("Boss");
		r.setEsalary(550000);
		System.out.println(r.getempid());
		System.out.println(r.getEmpsalary());
		System.out.println(r.getEname());
		//r.setEmpid(4444);
		System.out.println(r.getempid());
		System.out.println(r.getEmpsalary());
		System.out.println(r.getEname());
		
		
	}

}
