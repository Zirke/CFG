package CodeGeneration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Emitter {

    private Writer writer;


    public Emitter(String filepath) {
        try {
            writer = new FileWriter(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void emit(String emitString) {
        try {
            writer.write(emitString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile() {
        emit("}");
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
