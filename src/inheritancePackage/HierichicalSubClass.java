package inheritancePackage;

public class HierichicalSubClass extends HierarichicalSuperClass{
	String name1="Rama";
	public void rama() {
		System.out.println("one millones views is updata by the today");
	}
	public static void main(String[] args) {
		HierichicalSubClass hc=new HierichicalSubClass();
		String name=hc.sita;
		System.out.println(name+hc.name1);
		hc.Sita();
		hc.rama();
		
	}
}
