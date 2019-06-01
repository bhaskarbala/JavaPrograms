package stringDecesion;

public class Programs1 {

	public static void main(String[] args) {
		String str=" ega auto generated method stub";
		int count =0;
		int fag=0;
		for(int i=0;i<=str.length()-1;i++) {
			
			char c=str.charAt(i);
			if(c=='t') {
			count ++;
			}
			if(fag<=1) {
				fag++;
				
			}
		
			
			
		}
			
		
		System.out.println(count);
		System.out.println(fag);

	}

}
