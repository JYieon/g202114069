package g202114069;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam1 {

    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("a.txt");
        writer.write("IT융합자율학부\n");
        writer.write("202114069\n");
        writer.write("최지연\n");
        writer.close();
    }
}

