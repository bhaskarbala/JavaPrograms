import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonicci {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number");
		int fristnum=Integer.parseInt(br.readLine());
		System.out.println("enter the seconds number");
		int secondsnum=Integer.parseInt(br.readLine());
		int nextnum =0;
		System.out.print(fristnum+","+secondsnum);
		
		for(int i=fristnum;i<=secondsnum;i++) {
			nextnum=fristnum+secondsnum;
			System.out.print(","+nextnum);
			fristnum=secondsnum;
			secondsnum=nextnum;
		}
		br.close();
		

	}
	

}
