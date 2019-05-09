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

    String stringCompare(){
        return "#include <stdio.h>\n" +
                "#include <string.h>\n" +
                "#include <stdlib.h>\n" +
                "\n" +
                "int stringEquals(char *a, char *b){\n" +
                "  int retVal = strcmp(a, b);\n" +
                "  if (retVal == 0){\n" +
                "    return 1;\n" +
                "  }\n" +
                "  else {\n" +
                "    return 0;\n" +
                "  }\n" +
                "}\n";

    }
}
