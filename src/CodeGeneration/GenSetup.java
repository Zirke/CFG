package CodeGeneration;

public class GenSetup {

    public GenSetup() {
    }

    String getInitialCode(){
        return "const int leftMotor = 12;\n" +
                "const int rightMotor = 13;\n" +
                "\n" +
                "void setup() {\n" +
                "  pinMode(pin12, OUTPUT);\n" +
                "  pinMode(pin13, OUTPUT);\n" +
                "}\n" +
                "\n" +
                "void loop() {\n";
    }
}
