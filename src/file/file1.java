package file;

import java.io.File;

public class file1 {

	public static void main(String[] args) {
		File f=new File("C:\\File\\Boss");
		//f.mkdir(); it only folder creating 
		// how to check whether file is created are not we go to thies file
		if(f.exists()) {
			System.out.println("Exsiting the folder");
		}
		else {
			f.mkdirs();
			System.out.println("File folder is created");
		}
	
		
	
		
	}
	

}
