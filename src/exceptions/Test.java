package exceptions;

public class Test {

	public static void main(String[] args) {
		//Ex: With out try catch Block;
		/*
		 *  abnormal Termination 
		 *  rest of statement will not executed 
		 *
		int num=20;
		int num2=0;
		int a =0;
			 a=num/num2;
			System.out.println(a);
		System.out.println("Bhaskar to pratice ");
		*
		 *  java.lang.ArithmeticException
		 */
		System.out.println("-------------------------------------------");
		// Ex with using try Catch Block
		/*
		 *  normal termination 
		 *  rest of Statement will executed
		 *  
		 *int num=20;
			int num2=0;
			int a =0;
			try {
				 a=num/num2;
			}
			catch(ArithmeticException e) {
				System.out.println(a);
			}
			System.out.println("Bhaskar to pratice ");
			*/
		//

	}

}
