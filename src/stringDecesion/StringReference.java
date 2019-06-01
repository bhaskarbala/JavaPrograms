package stringDecesion;

public class StringReference {
/*
 * StringReference is Group of Character as know as StringReference 
 */
	public static void main(java.lang.String[] args) {
		// CASE=1;
		/* String is final class it means can't override
		  * who to check String is final class are not we have a javap Command
		  *  public final class java.lang.String implements java.io.Serializable,
		  * java.lang.Comparable<java.lang.String>, java.lang.C
		  * */
		 // Case=2;
		  /* String create object two ways 
		   * By using new Keyword,and Without new keyword
		   */
		// Case =3
		/*
		 * String is immutable means whenever create new object always check the previous if
		 *  previous there it should be reference variable should be point to Same Object
		 *  if not there is created new object 
		 *  it not allowed duplicates
		 */
		//case =4;
		/*
		 * String override method such as HashCode(),toString(),equals();
		 * we can cancat(),method add object in the String class only it will always returns as 
		 * new String type
		 */		
		//Case-5
		/* toString() whenever print represented object of class 
		 * to string method internal called to returns representation if not override to String
		 * it returns fully qualify class name @address
		 * if override it will returns as component of class (Like of States of object)
		 *
		 *String ,StringBuffer,All wrapper class always override 
		 */
		//Case-6
		/* conversion process 
		 * String Conversion to StringBuffer
		 * StringBuffer to Convert String
		 */
		//Case 8: BaseMethods
		/* charAt();
		 * inexOf();
		 * 
		 */

	}

}
