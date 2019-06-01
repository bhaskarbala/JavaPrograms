package exceptions;

public class TestCat2 {
	// Method usage
	void m1() {
		try {
			m2(); 
			}
		    catch(StringIndexOutOfBoundsException e) 
		    {
		    	System.out.println(e.getMessage());
			e.printStackTrace();
		    }
	     }
     void m2() {
	   m3();
    }
       void m3() {
	   System.out.println("Selenium and java".charAt(20));
    }
	  public static void main(String[] args) {
		TestCat2 t=new TestCat2();
		t.m1();
	
		

	}

}
