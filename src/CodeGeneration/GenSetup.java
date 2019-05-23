package CodeGeneration;

public class GenSetup {

    public GenSetup() {
    }

    String getConsts(){
        return "const int leftMotor = 12;\n" +
                "const int rightMotor = 13;\n";
    }

    String getInitialCodeForSetup(){
        return  "\n" +
                "void setup() {\n" +
                "  pinMode(leftMotor, OUTPUT);\n" +
                "  pinMode(rightMotor, OUTPUT);\n";

    }

    String getInitialCodeForLoop(){
        return  "\n" +
                "void setup() {\n" +
                "  pinMode(leftMotor, OUTPUT);\n" +
                "  pinMode(rightMotor, OUTPUT);\n" +
                "}\n" +
                "void loop() {\n";
    }



    String stringConcat(){
        return "char* stringConcat(char* str1, char* str2){\n" +
                "\tchar* tempstr = (char*) calloc(128, sizeof(char));\n" +
                "\tstrcpy(tempstr, str1);\n" +
                "\tstrcat(tempstr, str2);\n" +
                "\treturn tempstr;\n" +
                "}\n";
    }

/*    String stringCompare(){
        return  "int stringEquals(char *a, char *b){\n" +
                "  int retVal = strcmp(a, b);\n" +
                "  if (retVal == 0){\n" +
                "    return 1;\n" +
                "  }\n" +
                "  else {\n" +
                "    return 0;\n" +
                "  }\n" +
                "}\n";

    }*/
}
