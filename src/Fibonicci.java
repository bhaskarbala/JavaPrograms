import java.util.Scanner;

public class Fibonicci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int fristnum=s.nextInt();
		System.out.println("enter the seconds number");
		int secondsnum=s.nextInt();

		System.out.println("Enter the End number");
		int num =s.nextInt();
		int nextnum =0;
		System.out.print(fristnum+","+secondsnum);
		int i=0;
		while(i<=num) {
			nextnum=fristnum+secondsnum;
			System.out.print(","+nextnum);
			fristnum=secondsnum;
			secondsnum=nextnum;
			i++;
		}
		

	}

}
