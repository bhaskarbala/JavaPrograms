package stringDecesion;

public class Prograqm5 {

	public static void main(String[] args) {
	 String srt="RAnBaffsA1254@$#@ljgcFeRN";
	 int countUperCase=0;
	 int countLowerCase=0;
	 int countNumberCase=0;
	 char [] c=srt.toCharArray();                
	 for(int i=0;i<=c.length-1;i++) {
		int num=c[i];
		 if(num>=65&&num<=90) {
			 countUperCase ++;
			
		 }
		 else if(num>=97&&num<=122) {
			 countLowerCase ++;
		
		 }
		 else if(num>=49&&num<=57) {
			 countNumberCase ++;
			 
		 }
		 
	 }
	 
		System.out.println(countUperCase);
		System.out.println(countLowerCase);
		System.out.println(countNumberCase);

	}

}
