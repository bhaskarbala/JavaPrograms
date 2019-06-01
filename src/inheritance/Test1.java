package inheritance;

public class Test1 extends Test{
	int i=300;
	int d=300;
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.sum(30,30);
			}
	public void sum(int i,int d) {
		System.out.println(i+d);
		System.out.println(this.i+this.d);
		System.out.println(super.i+super.d);
	}

}
