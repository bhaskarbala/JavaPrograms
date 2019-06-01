package stringDecesion;

public class Programs4 {
	
	public static void main(String[] args) {
		//palindrome String
	
	String str="Java";
	String pal="";
	
	for(int i=str.length()-1;i>=0;i--) {
		pal=pal+str.charAt(i);
	}
	if(pal.equals(str)) {
		System.out.println("palindrome");
	}
		else {
			System.out.println("no palindrome");
		}
	
}
}