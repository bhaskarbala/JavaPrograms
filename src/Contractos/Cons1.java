package Contractos;

public class Cons1 {
	Cons1(){
		System.out.println("Default constructors");
	}
	Cons1(String name){
		System.out.println("Argument Constructors"+name);
	}

}
class Rama extends Cons1{
	Rama(){
		System.out.println(" Default constructor Rama");
		/*Output 
		 * Default constructors
		 * Default Constructors Rama
		 * 
		 */
	}
}
