package filewirte;

import java.io.File;

import java.io.FileReader;

public class Filer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\\\File\\\\FileWriter\\\\file.txt");
		FileReader fr=new FileReader(f);
		long size=f.length();
		char c[] =new char[(int)size];
		fr.read(c);
		
		for(char cc:c) {
			System.out.print(cc);
		}
		fr.close();

	}

}
