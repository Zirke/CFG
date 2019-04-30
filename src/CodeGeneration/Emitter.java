package CodeGeneration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Emitter {

    private BufferedWriter writer;

    {
        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\Teodor\\Dropbox\\AAU\\4.Semester\\P4\\CFG\\src\\genFile.c"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Emitter() {

    }

    void emit (String emitString){
        try {
            writer.write(emitString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void closeFile() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
