package exceptions;

public class TestThrows {
	public void studentDetials() throws InterruptedException {
		System.out.println("Sleeping mode");
		Thread.sleep(5000);
		System.out.println("Boss");
	}
	public void headOfDept() throws InterruptedException{
		studentDetials();
	}
	public void principal() {
		try {
			headOfDept();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
	public void officeBoy()  {
		principal();
	}
	public static void main(String[] args)  {
		//Ex:1
		TestThrows tt=new TestThrows();
		tt.officeBoy();
	}
	
	
	
	
	
	
}
