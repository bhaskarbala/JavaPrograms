package Contractos;

public class Con3 {
	Con3(){
		System.out.println("Default Constructors of This stastment");
	}
	Con3(int a)
	{
		System.out.println(" Argument constructors This ()"+a);
	}

}
class Books extends Con3{
	int num,num2;
	Books(){
		
		System.out.println(" Default constructors");
	}
	Books(String name){
		super(100);// if not declared super(100),it will executed to Default constructors
		System.out.println("Argument constructos "+name);
		
	}Books(int num,int num2){
		this("John");
		this.num=num;
		this.num2=num;
		/*output
		 * Argument constructors this() 100
		 * Argument constructors Name
		 * 
		 */
		
	}
	
}
