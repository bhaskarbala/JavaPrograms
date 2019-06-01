package staticMember;

public class NonStaticMember {
	int ram=789321;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Sum().SumofNumber(new NonStaticMember().ram));
		
	}

}

class Sum{
	public int SumofNumber(int num) {
		int sum=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}

	
}