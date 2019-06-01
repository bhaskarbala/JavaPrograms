package exceptions;

public class Test7 {

	public static void main(String[] args) {
		try {
			System.out.println(20/0);
			System.out.println("Boss");// Reaming statement statement not executed	
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
