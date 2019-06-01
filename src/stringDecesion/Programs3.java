package stringDecesion;

public class Programs3 {

	public static void main(String[] args) {
		//StringBuffer Methods
		StringBuffer buff=new StringBuffer("ToDO Auto-generated method stub");
		System.out.println(buff.capacity());
		StringBuffer buff1=buff.append(" alread");
		System.out.println(buff1);
		System.out.println(buff.capacity());
		System.out.println(buff.length());
		StringBuffer ins=buff.insert(4, " Bhaskar1");
		System.out.println(ins.capacity());
		System.out.println(ins.length());
		System.out.println(buff);
	
		
		StringBuffer st=new StringBuffer("Bhaskar is clover");
		System.out.println(st);
		System.out.println(st.replace(0,7, "Royal "));
		System.out.println(st.delete(0, 5));
		String s="bhaskr is r";
		
	
		

	}

}
