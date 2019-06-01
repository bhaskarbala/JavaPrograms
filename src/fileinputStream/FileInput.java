package fileinputStream;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;


public class FileInput {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\File\\Boss\\abc.txt");
	
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos=new FileOutputStream(new File("C:\\File\\Boss\\book.txt"));
			int read;
			System.out.println(f.length());
			 while((read=fis.read())!=-1)
			{				
				//fos.write(read);
				 char c=(char)read;
				 System.out.println(c);
			}
			 fis.close();
			 fos.close();

	}

}
