package inheritance;

public class TestSinle extends sample2{
	 int a=20;
	 
	
	public static void main(String[] args) {
		 double d=200.2;
		 TestSinle ts=new TestSinle();
		 System.out.println(ts.d);
		 ts.san();
		System.out.println(ts.a);
		System.out.println(ts.d);
		System.out.println(d);
	}

}
class sample2{
	double d=100;
	public void san() {
		System.out.println("sample");
	}
}
