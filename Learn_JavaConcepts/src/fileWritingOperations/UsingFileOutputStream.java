package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		String location="UsingFileOutputStream.txt";
 
		String content="Hi Buddy !!!";
		
		FileOutputStream outputStream=new FileOutputStream(location);
		byte[] writethis= content.getBytes();
		outputStream.write(writethis);
		outputStream.close();

	}

}
