package filewirte;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter(new File("C:\\File\\FileWriter\\file.txt"));
		fw.write("Boss is very best java done"+"\r\n");
		fw.write("selenium");
	
		fw.write(" book for selenium");
		fw.flush();
		
		
fw.close();
	}

}
