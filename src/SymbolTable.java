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

    public void openScope(){
        depth++;
    }

    public void closeScope(){
        Set keySet = IdTable.keySet();
        for(Object id : keySet){
            Object node = IdTable.get(id);
            if(depth == ((Sym) node).getDepth()){
                IdTable.remove(id);
            }
        }
        depth--;
    }

    public HashMap<Identifier, Sym> getIdTable() {
        return IdTable;
    }
}
