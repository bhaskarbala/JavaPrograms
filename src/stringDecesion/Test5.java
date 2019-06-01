package stringDecesion;

public class Test5 {

	public static void main(String[] args) {
	// Not Override
		Test5 t5=new Test5();
		System.out.println(t5);// internal called to toString();
		System.out.println(t5.toString());//it explicitly called to toString();
		
// always toString method override
		String s="Bhakar";
		String s1="Royal";
		StringBuffer buff=new StringBuffer(s);
		System.out.println(s);
		System.out.println(buff);
	
		
	}

}
