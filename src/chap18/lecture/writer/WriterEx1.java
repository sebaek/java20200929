package chap18.lecture.writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "writer.txt";
		Writer writer = new FileWriter(path);
		
		writer.write('한');
		
		writer.close();
	}
}
