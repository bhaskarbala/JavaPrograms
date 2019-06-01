package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestUnChecked {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// UnChecked Exception
		
		//RuntimeException
		System.out.println("Bhaskar");
		//System.out.println(10/0);//Arithmetic exception java.lang.ArithmeticException
		
		System.out.println("Boss");

		int i[]= {20,25,45};
		//System.out.println(i[12]);// java.lang.ArrayIndexOutOfBoundsException
		
		String s="Boss";
		//System.out.println(s.charAt(20));//java.lang.StringIndexOutOfBoundsException
		Integer i1=Integer.valueOf(10);
		System.out.println(i1);// java.lang.NumberFormatException:
		
		// Checked Exception,Safe Exception
		/* SqlException
		 * FileNotfoundException
		 * InterruptedException
		 * 
		 */
		Thread.sleep(1000);//InterruptedException
		
		FileInputStream fis=new FileInputStream("abs.txt");// FileNotFoundException
		 // Error
		/* Error cause due to lack of system resource
		 * stackOverflow
		 * OutOfMemoryError
		 *it unCheckedException
		 */
		int [] ch=new int[1000000000];
		//
	
		
		
	}

}
