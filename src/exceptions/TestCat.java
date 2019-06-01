package exceptions;

import java.io.FileInputStream;

public class TestCat {

	public static void main(String[] args) {
		int a=32,b=0;
		String s="Java Developer ";
		int c=0;
		/*
		try{
			System.out.println(s.charAt(15));
			c=a/b;
		}catch(ArithmeticException e) {
	  e.printStackTrace();
	  System.out.println("if raised the Exception  in arithmetic Exception only excuted");
		}
		catch (NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
		}
		catch (StringIndexOutOfBoundsException e){
			System.out.println(" String like exception");
		}
		System.out.println(" Rest of statement will be executed");
 */
		
		// Case-2 Exception
		/*
		try{
			System.out.println(s.charAt(15));
			c=a/b;
		}catch(Exception e) {
	  e.printStackTrace();
	  System.out.println(" All type exception handle ");
		}
		System.out.println("Rest of application will Excuted");
		*/
		
		// Case - child to Parent 
		try{
			FileInputStream fis=new FileInputStream("abs.txt");
			System.out.println(s.charAt(15));
			c=a/b;
		}catch(ArithmeticException e) {
	     e.printStackTrace();
	  System.out.println("only handdle by Arithmetic");
		}
		catch (NullPointerException e) {
			System.out.println("Stirng ");
		}
		catch (StringIndexOutOfBoundsException e){
			System.out.println(" String Index like exception");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(" Rest of statement will be executed");

	}

}
