package apr.c6.example.excepciones;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RethrowingException {

	public static void main(String[] args) {

	}

	public void doStuff() throws IOException {
		try {
			// risky IO things
			RandomAccessFile raf = new RandomAccessFile("myfile.txt", "r");
			byte b[] = new byte[1000];
			raf.readFully(b, 0, 1000);
		} catch (IOException ex) {
			// can't handle it
			throw ex; // Can't throw it unless you declare it
		}
	}
}
