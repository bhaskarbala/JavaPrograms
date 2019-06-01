package stringDecesion;

import java.util.Date;
import java.util.concurrent.SynchronousQueue;

public class Test8 {

	public static void main(String[] args) {
	
     String str="Java is soure of Software";
      System.out.println(str.length());
      System.out.println(str.lastIndexOf('s'));
      System.out.println(str.replace(" ", "   "));
       System.out.println(str.charAt(5));
       System.out.println(str.substring(5, 13));
       Date d=new Date();
       System.out.println(d);
       String d1=d.toString();
       System.out.println(d1.lastIndexOf('2'));
       System.out.println(d1.substring(24, d1.length()));
       System.out.println(d1.startsWith("Sun"));
       
       System.out.println(d1.indexOf("A"));
       System.out.println(d1.substring(d1.indexOf("A"), d1.indexOf("2")));
       
    String up=str.toUpperCase();
    System.out.println(up);
    System.out.println(str.compareTo(up));
    System.out.println(str.equals(up));
    
    System.out.println(str.indexOf('a', 2));
   
    
       
       
       
     
	}

}
