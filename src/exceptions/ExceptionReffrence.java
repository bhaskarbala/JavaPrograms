package exceptions;

public class ExceptionReffrence {

		/* whenever exception is raised abnormal termination it will stopping execution and rest of statement is not executed
		 * we need to handle exception by using try and catch block 
		 * whenever using try and catch block has normal execution 
		 * There are 3 type exception is
		 * UnChecked exception
		 * Checked Exception
		 * Error
		 */
		// Unchecked Exception
		 /* unchecked Exception as those are exception which are not check by compiler is Unchecked	
		  * unchecked exception which are child class of runtime exception those are called to unchecked exception	 
		  */
			// Checked Exception
		/*Exception are which are checked by compiler those exception is Checked Exception
		 *  Checked Exception child of Exception
		 *
		 *  Checked Exception,Safe Exception
		/* SqlException
		 * FileNotfoundException
		 * InterruptedException
		 * 
		 */
		 // Error
		/* Error cause due to lack of system resource
		 * stackOverflow
		 * OutOfMemoryError
		 *it unCheckedException
		 */
		// We need two ways try catch blocks throws
		/*try{ try block which may get exception statement will write }
		 * catch{ exception is raised in try block catch block handle}
		 * 1. with out using try and Catch blocks
		 * 2. with using try and catch blocks
		 * 3.no exception in try catch blocks not executed 
		 * 4. only try block are not allowed
		 * 5. in between two block statement declaration is invalid
		 * 6.Exception raised other than try  abnormal termination
		 * 7.once exception try block reaming Statement not executed
		 */
		// Category-1
		
		/* case 1 : one try block multiple catch blocks
		 * case 2 : all exception class
		 * case 3 : try() -> catch(AME)-> catch(NPE)-> catch(Exception) ------------child to parent 
		 * case 4 : Parent to Child we get error Exception
		 */
		// Category -2
		/* how to print the Exception message ,whenever print the Exception internal  called to toString
		 * if want description we go to getMassage
		 * printStackTrace()- it read the completed stack information
		 * 
		 */
		// Category -2 
		/*
		 *  Progation means which has responseblitily of  Called methods 
		 *  ex: TestCat2
		 *  PrintStactTrace() method given all the  information of stack along 
		 *  with the exception and Deception of the Exception
		 *  getMessage() is return type is displayed the  of exception deception
		 */
		// Finally Block
		/* Finally block will Executed the Ireresponsablitly of try and catch block 
		 *  finally block will not executed by the Two case such as
		 *  Control will not enter the try block , and programmer are using system.exit().
		 * 
		 */
		// Throws Keywords
		 /*
		  * throws keyword not handle to exception but it delegated reposonbulility of handling  
		  *  the calling methods
		  * method 
		  * throws keyword are defined the method 
		  *  it work with Propagation like most of time checked exception
		  *  propagation automatically handle by unchecked exception
		  */
		// Throw KeyWords
		/* ArithmeticException,NullpointExepetion,SIOBE,AIOBE those are decide by JVM 
		 * Create the Object as Programmer that object hand over the JVM by help of  throw keyword
		 * User defined Exception
		 * Checked Exception we have to extends to Exception
		 * Unchecked Exception we have to extend RuntimeException
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


