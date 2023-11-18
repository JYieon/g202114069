/*package g202114069;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam5 {

    static class TestThread extends Thread {
        String path;
        
        

        public TestThread(String path) {
            this.path = path;
        }

        @Override
        public void run(){
        	Reader reader = new FileReader(path);
            char[] buffer = new char[100];
            while (true) {
                int count = reader.read(buffer);
                if (count < 0) break;
    	            for (int i = 0; i < count; ++i)
    	                System.out.print(buffer[i]);
                }
            } 
        }

     public static void main(String[] args) {
    	 
         Thread threadA = new TestThread("a.txt");
         threadA.start();

         Thread threadB = new TestThread("a.txt");
         threadB.start();

         new TestThread("a.txt").start();
     } reader.close();
}
*/