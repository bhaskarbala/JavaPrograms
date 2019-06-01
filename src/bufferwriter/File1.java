package bufferwriter;


import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream(new File("C:\\File\\BufferReader\\abc.txt"));
		
		
		
		
		
		fos.close();
	}

}
