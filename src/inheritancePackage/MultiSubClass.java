package inheritancePackage;

public class MultiSubClass extends MultiSuperClass {
	String name="Linkon";
	public void SonOfRamaRao() {
		System.out.println(" The compeny Ceo is "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubM
		MultiSubClass msc=new MultiSubClass();
		String n=msc.name1;
	/*	
		
		msc.SonOfRamaRao();
	
		msc.RamagopalRao();
	
		msc.Grandfather();
		*/
		System.out.println(n);
		System.out.println("i value is ="+msc.i+" D value is ="+msc.d1);

	}

}
