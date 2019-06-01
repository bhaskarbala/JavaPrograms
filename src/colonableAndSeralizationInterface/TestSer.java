package colonableAndSeralizationInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*  the process of write the object know as serializaton
 * the process of reading the object know as de _serialization
 * 
 */
public class TestSer {
	static ArrayList<Emp> al;
	public void serilazitionDemo() throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter emp id");
        int empid=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter emp Name");
        String empName=scan.nextLine();
        System.out.println("Enter salary data");
        double empsalary=scan.nextDouble();
		Emp e=new Emp(empid,empName,empsalary);
	al=new ArrayList<>();
		al.add(e);
		FileOutputStream fos=new FileOutputStream("aab.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
	}
	public void deserilazitionDemo() throws Exception {
		FileInputStream fis=new FileInputStream("aab.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e1=(Emp)ois.readObject();
		System.out.println(e1.eid+" "+e1.ename);
		ois.close();
	}

	public static void main(String[] args) throws Exception {
		TestSer ts=new TestSer();
		

	

	}

}
