import java.security.Key;
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

    public int getDepth(){
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

    public void openScope(){
        depth++;
    }

    public void closeScope(){
        for(String id : keys()){
            Object node = IdTable.get(id);
            if(depth == ((Sym) node).getDepth()){
                IdTable.remove(id);
            }
        }
        depth--;
    }

}
