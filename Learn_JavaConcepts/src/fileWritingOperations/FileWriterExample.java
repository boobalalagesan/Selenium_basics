package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		
	String location="FileWriterExample.txt";
	
	String content="Learn java";
	
	FileWriter fileWriter=new FileWriter(location);
	
	fileWriter.write(content);
	
	fileWriter.close();
		

	}

}
