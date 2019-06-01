package stringDecesion;

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		// String convert to StirngBuffer
		String DoorNo="25-4";
		String Street="Devasandra";
		String ZipCod="560036";
		ArrayList<String>str=new ArrayList<>();
		str.add(DoorNo);
		str.add(ZipCod);
		str.add(Street);
		StringBuffer buff=new StringBuffer();
		System.out.println(buff.append(DoorNo).append(","+Street).append(","+ZipCod));
		System.out.println("-------------");
		// convert To StringBuffer to String;
		String s=buff.toString();
		String s1=buff.toString();
		System.out.println(s);
		System.out.println(buff.reverse());
		
	}

}
