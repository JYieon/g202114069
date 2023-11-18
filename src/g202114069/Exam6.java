/*package g202114069;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam6 {

    static class TestRunnable implements Runnable {
        Reader reader; 
        char[] buffer;

        public TestRunnable(Reader reader, char[] buffer) {
        	this.reader = reader;
        	this.buffer = buffer;
        }

        @Override
        public void run() {
        	while (true) {
                int count = reader.read(buffer);
                if (count < 0) break;
    	            for (int i = 0; i < count; ++i)
    	                System.out.print(buffer[i]);
            }
        }
    }

     public static void main(String[] args) throws IOException{   	 
    	 
    	 Reader reader = new FileReader("a.txt");
         char[] buffer = new char[100];
         reader.close();
    	 
    	 
         Thread threadA = new Thread(new TestRunnable(reader, buffer));
         threadA.start();

         Thread threadB = new Thread(new TestRunnable(reader, buffer));
         threadB.start();

         new Thread(new TestRunnable(reader, buffer)).start();
     }
}
*/

