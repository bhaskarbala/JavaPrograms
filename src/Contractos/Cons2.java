package Contractos;

public class Cons2 {
	Cons2(){
		System.out.println("Default constructos");
	}
	Cons2(String Name){
		System.out.println(" Argument Constructors"+Name);
		
	}

}
class Sample extends Cons2{
	Sample(){
		System.out.println(" Default construtors");
	}
	Sample( int arg){
		super("Bhaskar");// this call only one time of constructors of super class with a argument 
		System.out.println("argument constructos "+arg);
		/*Output
		 * Argument constructors Bhaskar
		 * Argument constructors ;
		 */
		
	}
}
