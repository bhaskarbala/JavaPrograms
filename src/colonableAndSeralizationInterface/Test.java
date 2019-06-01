package colonableAndSeralizationInterface;

public class Test implements Cloneable{
	int a=20;
	int b=30;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Test t=new Test();
		
		System.out.println(t.a);
		System.out.println(t.b);
		Test t2=(Test)t.clone();

		System.out.println(t2.a);
		System.out.println(t2.b);
		
	}

}
