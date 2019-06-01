package exceptions;

public class Test3 {

	public static void main(String[] args) {
		
		String s="Bhaskar";
		try {
			System.out.println(s);
		}catch(NullPointerException e){ 
			System.out.println("no Excuted ");
		}
		System.out.println("Rama");

	}

}
