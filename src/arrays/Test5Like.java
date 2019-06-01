package arrays;

public class Test5Like{
public static void main(String[] args) {
	int i=100;
	Integer i1=new Integer(i);
	System.out.println(i1);
	
	int i3=i1;//un boxing
	System.out.println(i3);
	
	Integer i4=20;//Auto Boxing
	System.out.println(i4);
	int i5=i4;
	
Integer a=Integer.valueOf(i5);
System.out.println(a);
	String s="125484";
	System.out.println(s);
	Integer i6=Integer.parseInt(s);
	System.out.println(i6);
	Double d1=Double.parseDouble(s);
	System.out.println(d1);
}
}
