package stringDecesion;

public class Programs2 {

	public static void main(String[] args) {
		// Convert to Char[]
		String str="TODO Auto-generated method stub";
		char [] c= str.toCharArray();
		for(int i=0;i<=c.length-1;i++) {
			System.out.print(c[i]);
		}
		System.out.println(" ");
	// Reveres order
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		System.out.println(" ");
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			
		}
		System.out.println("");
		StringBuffer buff=new StringBuffer(str);
		System.out.println(buff.reverse());
	}
}