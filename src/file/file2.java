package file;

import java.io.File;
import java.io.IOException;

public class file2 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\File\\Boss\\abc.txt");
		
	
		if(f.exists()) {
		long f1=f.length();
		System.out.println(f1);
	
			System.out.println("Exsiting the file");
			
		}else {
			f.createNewFile();
			System.out.println("File is created");
		}

	}

}
