package inheritance;

public class Test3 extends sample3{
	public void m1() {
		System.out.println("Test3");
		super.m1();
	
	}
	public static void main(String[] args) {
		Test3 t=new Test3();
		t.m1();
		
	}
	
}
class sample3{
	public void m1() {
		 
			System.out.println("sample");
	}
	}