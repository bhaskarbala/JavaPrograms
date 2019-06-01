package arrays;

public class Test1 {
	public static int[] m1() {
		System.out.println("return type methods");
		int a[]= {20,40,10,50,};
		return a;
	}
	public static void m2(double []d) {
		System.out.println("Argument type ");
		for(double d1:d) {
			System.out.println(d1);
		}
	}
	public static void main(String[] args) {
		// how defined the method in a array 
		/* return as arrays
		 * argument as arrays
		 */
		int [] aa=Test1.m1();
		for(int a1:aa) {
			System.out.println(a1);
		}
		double d[]={10.2,25.45,12.45,78.12};
		Test1.m2(d);
		
		
	}

}
