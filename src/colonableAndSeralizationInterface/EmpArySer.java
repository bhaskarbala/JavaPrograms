package colonableAndSeralizationInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpArySer {
	public static void deserilazitionDemo() throws Exception {
		FileInputStream fis=new FileInputStream("aab.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	    ArrayList<Emp> e1=(ArrayList<Emp>)ois.readObject();
		for(Emp em:e1) {
			System.out.println(em.eid+" "+em.ename+" "+em.salary);
			
		}
		ois.close();
	}

	static ArrayList<Emp> ale=null;
	static int tag=1;
	public static void main(String[] args) throws Exception {
		while(true) {
			
			if(tag<=3) {
		tag++;
		ArrayList<Emp> al=new ArrayList<>();
		
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Enter emp id");
	        int empid=scan.nextInt();
	        scan.nextLine();
	        System.out.println("Enter emp Name");
	        String empName=scan.nextLine();
	        System.out.println("Enter salary data");
	        double empsalary=scan.nextDouble();
		al.add(new Emp(empid,empName,empsalary));
		
		
		//serilazation
		FileOutputStream fos=new FileOutputStream("aab.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		}
			else if(tag==3){
				break;
			}
		}
		
		EmpArySer.deserilazitionDemo();
	}

}
