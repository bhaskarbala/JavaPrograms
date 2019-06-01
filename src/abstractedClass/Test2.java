package abstractedClass;

public abstract class Test2 {
	int a=20;
	int b=30;
Test2(int a) {
	System.out.println("Test 2 "+a);
}
Test2(int a,int b){
	System.out.println(a+b);
}
abstract void Test2();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	{
		System.out.println("instance of Block");
	}
	static {
		System.out.println("Static ");
	}

}
