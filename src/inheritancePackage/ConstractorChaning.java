package inheritancePackage;

import java.util.concurrent.SynchronousQueue;

/*1. super() which use to call to constructors superClass,which defined with the constructors in a first Statement 
 *2.if programmer is not defined super(),compiler is defined the super().
 *3.if programmer is defined the super(),there are two type non argument constructors other one is argument constructors
 *	non argument constructors like default constructors
 *4.super Statement argument is call Argument constructors it only one time
 *5. very class have one super() ,and which is call to Constructors of Object class
 */
public class ConstractorChaning {
	int num,num2;
	ConstractorChaning()
	{      // hear as super();
		
		System.out.println("Default constructors");
	}
	ConstractorChaning(String name){
		System.out.println("Argumented constructors"+ name);
	}ConstractorChaning(int num,int num2){
		
		super();
		System.out.println(num);
		System.out.println(num2);
	
		
	}
	public static void main(String[] args) {
		ConstractorChaning ref=new ConstractorChaning(22,35);
		System.out.println(ref.num);
		System.out.println(ref.num2);
	}

}
