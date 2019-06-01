package staticMember;

public class Staticmember {
	static int ram=124578;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( Remote.ReversNum(ram));
		

	}
	

}
class Remote
{
	public static int  ReversNum(int num){
		int rev=0;
		int rem=0;
		while(num>0){
			rem=num%10;
			rev=rem+(10*rev);
			num=num/10;
		}
		return rev;
		
	}
	}
