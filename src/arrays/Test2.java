package arrays;

import java.util.Arrays;

public class Test2 {
	/* we have to 100 object in store into the Array 
	 * in a 100 object of 5 object are null value 
	 * i want the particular index value 
	 * 
	 */

	public static void main(String[] args) {
		Object arr[] =new Object[10];
		Emp e=new Emp(333,"Boss");
		Emp e1=new Emp(222,"Raj");
		Emp e2=new Emp(111,"Chand");
		arr[0]=e;
		arr[5]=e1;
		arr[7]=e2;
		arr[3]=new Student(11,"Ramula");
		arr[9]=new Student(10,"Kokila");
		//for(Emp ar:arr) {
		//	System.out.println(ar.eId+" "+ar.eName); //we have to get NullPointer Exception
		//	}
		 // to overcome to  that object store in ObjectClass and to take help of instanceof
		int count=-1;
		for(Object ob:arr) {
			if(ob instanceof Emp) {
				count ++;
				Emp ee=(Emp)ob;
				System.out.println(ee.eId+","+ee.eName);
			}
			else if(ob ==null) {
				count ++;
				System.out.println("the particuler index is nullvalue "+count);
			}
			else if(ob instanceof Student) {
				count++;
				Student st=(Student)ob;
				System.out.println(st.sId+","+st.sName);
			}	
			
		
		}
		// one more approach index
						System.out.println(count);
						for(int i=0;i<arr.length-1;i++) {
							if(arr[i]==null) {
								System.out.println("NullValue Index "+i);
							}
		
						}

	}


}
