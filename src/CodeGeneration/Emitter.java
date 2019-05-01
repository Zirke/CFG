package CodeGeneration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Emitter {

    private BufferedWriter writer;


    public Emitter() {
        try {
            writer = new BufferedWriter(new FileWriter("src/genFile.c"));
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
