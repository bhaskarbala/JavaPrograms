package exceptions;

public class Test6 {

	public static void main(String[] args) {
		int a=20,b=0;
		String s="mobile";
	    int c=0;
		try {
			System.out.println(c=a/b);
		}catch(ArithmeticException e) {
			System.out.println(s.charAt(12));//StringOutBoundsException
			e.printStackTrace();
			}
			
		

	}

}
