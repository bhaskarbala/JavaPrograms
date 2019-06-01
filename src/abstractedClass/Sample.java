package abstractedClass;

public class Sample {
	
	void demo() {
		System.out.println("demo in Sample");
		
	}

}
abstract class Sample1 extends Sample {
	abstract void disp();
}
 class Sample2 extends Sample1{

	@Override
	void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp");
	}
	public static void main(String[] args) {
	Sample s=new Sample2();
	s.demo();
	s.demo();
	}
	 
 }
