package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedsReader {

	public static void main(String[] args) throws IOException {
		
		String location="BufferedWriterExample.txt";
		FileReader fileReader=new FileReader(location);
		
		BufferedReader reader=new BufferedReader(fileReader);
		String readedText;
		
		while ((readedText=reader.readLine())!=null) {
			System.out.println(readedText);
			
		}
		
		

	}

}
