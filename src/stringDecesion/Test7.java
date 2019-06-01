package stringDecesion;

public class Test7 {

	public static void main(String[] args) {
	// comparison compare to()
		String s="anu";
		String s1="charan";
		String s3="ega";
System.out.println(s.compareTo(s1));// -ve because comparison basded on unioq value 97Compareto99=-2
System.out.println(s.compareTo(s3));//97to101=-4
System.out.println(s3.compareTo(s1));//+ve 2
System.out.println(s1.compareTo(s));// 2
// equals()
System.out.println(s.equals(s1));//f
System.out.println(s.equals(s3));//f

StringBuffer buu=new StringBuffer("Anu");
StringBuffer buu1=new StringBuffer("cnu");
StringBuffer b=buu.append(s);


		
		
		
		
	}

}
