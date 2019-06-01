package abstractedClass;

public class Test3 extends Test2 {

	Test3(int a) {
		super(a,a);
		System.out.println(a);
	}
	Test3(int a,int b){
		this (a);
		System.out.println(a+b);
		
	}
	{
		System.out.println("instace of Test3 Block");
	}
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test2 t=new Test3(20,50);
      Test2 t1=new Test3(30);
	}

	@Override
	void Test2() {
		// TODO Auto-generated method stub
		System.out.println("Test2");
		
	}

}
