import java.util.*;

public class SymbolTable {

    private Integer depth = 0;

    private HashMap<Identifier, Sym> IdTable = new HashMap<>();

    public void put(Identifier key, Sym value){
        IdTable.put(key, value);
    }

    public Object get(Identifier key){
        return IdTable.get(key);
    }

    public String toString(){
        return IdTable.toString();
    }

    private int getDepth(){
        return depth;
    }

    // Return an array contains all of the keys

    public String[] keys() {
        Set keyValues = IdTable.entrySet();
        String[] keys = new String[IdTable.size()];
        Iterator it = keyValues.iterator();
        for (int i = 0; i < IdTable.size(); i++) {
            Map.Entry entry = (Map.Entry) it.next();
            keys[i] = (String) entry.getKey();
        }
        return keys;
    }


    // method defining what happens for each node. Long switch on each node class
    public void processNode(AbstractNode node){

        if(node instanceof FunctionDeclaration || node instanceof WhileStatement || node instanceof RepeatStatement || node instanceof FromStatement){
            openScope();
        }

        if(node instanceof IfStatement){
            openScope();
        }

        if(node instanceof INTDCL && IdTable.get(((INTDCL) node).id) == null){

            IdTable.put(((INTDCL) node).id, new Sym(node, depth));

        } else if(node instanceof FLOATDCL && IdTable.get(((FLOATDCL) node).id) == null){

            IdTable.put(((FLOATDCL) node).id, new Sym(node, depth));

        } else if(node instanceof TEXTDCL && IdTable.get(((TEXTDCL) node).id) == null){

            IdTable.put(((TEXTDCL) node).id, new Sym(node, depth));

        } else if(node instanceof TRUTHDCL && IdTable.get(((TRUTHDCL) node).id) == null){

            IdTable.put(((TRUTHDCL) node).id, new Sym(node, depth));

        } else if(node instanceof ArrayDeclaration && IdTable.get(((ArrayDeclaration) node).id) == null){

            //TODO check later if the correct object is passed into hashmap.
            IdTable.put(((ArrayDeclaration) node).id, new Sym(node, depth));

        } else if(node instanceof FunctionDeclaration && IdTable.get(((FunctionDeclaration) node).functionName) == null){

            IdTable.put(((FunctionDeclaration) node).functionName, new Sym(node, depth));

        }

        if(node instanceof StatementList) {
            for (Statement statement : ((StatementList) node).getStmts()) {
                processNode(statement);
            }
        }
    }

    private void openScope(){
        depth++;
    }

}
