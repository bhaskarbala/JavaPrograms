package exceptions;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		try {
			System.out.println(s);
		}
	//System.out.println("Boss");// tha satament is not allowed
		catch(NullPointerException e) {
			System.out.println("Ramula");
		}

	}

}
