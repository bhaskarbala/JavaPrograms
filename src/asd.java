import java.util.Scanner;

public class asd {
	public static void main(String [] arg){
	    Scanner s=new Scanner(System.in);

	    System.out.println("Enter the starting number please");
	    int frist=s.nextInt();

	    System.out.println("Enter the seconds number please");
	    int seconds=s.nextInt();

	    System.out.println("Enter the Eeding number please");
	    int end=s.nextInt();

	    int i=0;
	    int next=0;
	    System.out.print(frist+","+seconds);
	while(i<=end){
		    next=frist+seconds;
		    System.out.print(","+next);
		    frist=seconds;
		    seconds=next;
	            i++;
	            }
	}
}
	
	