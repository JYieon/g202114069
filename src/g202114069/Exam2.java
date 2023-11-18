package g202114069;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam2 {

    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("a.txt");
        char[] buffer = new char[100];
        while (true) {
            int count = reader.read(buffer);
            if (count < 0) break;
            int j = 0;
            while(j<3) {
	            for (int i = 0; i < count; ++i)
	                System.out.print(buffer[i]);
	            j++;
            }
        }
        reader.close();
    }
}

