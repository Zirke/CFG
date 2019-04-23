import java.util.*;

public class SymbolTable {

    private Integer depth = 0;
    private ArrayList<Integer> scopeDisplay;

    private HashMap<Identifier, Object> IdTable = new HashMap<>();

    public void put(Identifier key, Object value){
        IdTable.put(key, value);
    }

    public Object get(Identifier key){
        return IdTable.get(key);
    }

    public String toString(){
        return IdTable.toString();
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

        if(node instanceof StatementList){

            for(Statement statement : ((StatementList) node).getStmts()){
                processNode(statement);
            }

        } else if(node instanceof IntDeclaration){
            IdTable.put(((IntDeclaration) node).id, new INTDCL());
        } else if(node instanceof FloatDeclaration){
            IdTable.put(((FloatDeclaration) node).id, new FLOATDCL());
        } else if(node instanceof TextDeclaration){
            IdTable.put(((TextDeclaration) node).id, new TEXTDCL());
        } else if(node instanceof TruthDeclaration){
            IdTable.put(((TruthDeclaration) node).id, new TRUTHDCL());
        } else if(node instanceof ArrayDeclaration){
            IdTable.put(((ArrayDeclaration) node).id, )
        }

    }

    public void openScope(){
        depth++;
        scopeDisplay.set(depth, null);
    }

    public void closeScope(){
        for(Integer i: scopeDisplay){

        }
    }
}
