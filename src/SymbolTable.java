import java.security.Key;
import java.util.*;

public class SymbolTable {

    private Integer depth = 0;

    private HashMap<String, Sym> IdTable = new HashMap<>();

    public void put(String key, Sym value){
        IdTable.put(key, value);
    }

    public Object get(String key){
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

    public HashMap<String, Sym> getIdTable() {
        return IdTable;
    }
}
