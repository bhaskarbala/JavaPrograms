package inheritance;

public class Test extends sample{
	 final public void m1() {
		System.out.println("main class");
	}
	 int i=3000;
	 int d=3000;
	public static void main(String[] args) {
	Test t=new Test();
	t.m4();
	t.m3();
	t.m2();
	t.m1();
	sample s=new sample();
	s.m2();
	s.m3();
	s.m4();
	sample1 s1=new sample1();
	s1.m4();

	}
}
class sample extends sample1{
	public void m2() {
	System.out.println("m2 Methods it coming for sample");	
	}
	public void m3() {
		System.out.println("m3 methods coming from sample");
	}
}
class sample1{
	public void m4() {
		System.out.println("m4 methods it coming from sample1");
	}
}
