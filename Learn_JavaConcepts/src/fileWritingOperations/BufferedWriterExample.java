package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		String location="BufferedWriterExample.txt";
		
		String content="BufferedWriterExample";
		
		FileWriter fileWriter=new FileWriter(location);
		BufferedWriter bufferedwriter=new BufferedWriter(fileWriter);
		
		bufferedwriter.write(content);
		bufferedwriter.close();

	}

}
