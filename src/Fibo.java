import java.util.Scanner;

public class Fibo {
	public static boolean isperfectSqure(int num) {
		double sq=Math.sqrt(num);
		int x=(int)sq;
		return Math.pow(sq, 2)==Math.pow(x, 2);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the starting value");
	int  n1=s.nextInt();
	System.out.println("Enter the ending value");
	int n2=s.nextInt();
	int res=0;
	if(n1%2==0) {
	
		System.out.println(n1+=1);
		//
		//System.exit(0);
	for(int i=n1;i<=n2;i++) {
	  	if(isperfectSqure(5*i*i+4)||isperfectSqure(5*i*i-4)) {
	  		res=i;
	  		System.out.println(res);
	  	}
	 
	}
	
	}
	
	
	
	
	
	
	/*for(int i=frist;i<=end;i++) {
		next=frist+end;
		System.out.print(","+next);
		frist=end;
		end=next;
		
	}
	int i=100;
	while(i<end) {
		next=frist+end;
		System.out.print(","+next);
		frist=end;
		end=next;
		i++;
		
	}
	*/
	}

}
