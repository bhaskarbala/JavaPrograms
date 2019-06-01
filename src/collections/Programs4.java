package collections;

import java.util.ArrayList;

public class Programs4 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Pen(25,"Q","Red","Bul"));
		al.add(new Bus(30,"Royal","12545"));
		al.add(new Emp(40,"Rama"));
		al.add(new Pen(26,"Q","Red1","Bule"));

		al.add(new Bus(31,"Royal1","12546"));
		al.add(new Emp(41,"Rama"));
		
		for(Object a:al)
		{
	
			Bus b=(Bus)a;
			
			System.out.println(b.busID+" "+b.busName+" "+b.busNo);
		}


	}

}
