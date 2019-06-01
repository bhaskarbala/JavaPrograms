package inheritance;

public class Test4 extends demo {
	// Constructor
	public Test4() {
		this(10);
		System.out.println("default");
	}
	public Test4(int a) {
		this(20,40);
		System.out.println(a);
	}
	public Test4(int a,int b) {
		super(20);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Test4 t=new Test4();
	}
	
}
class demo{
	public demo() {
		// TODO Auto-generated constructor stub
		System.out.println("demo");
	}
	public demo(int a) {
		this();
		System.out.println("demo="+a);
	}
}
