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

    public void setDepth(Integer depth) {
        this.depth = depth;
    }


    // Return an array contains all of the keys
    // Currently not used but useful for testing later.
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
}