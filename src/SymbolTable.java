import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SymbolTable {

    private HashMap IdTable = new HashMap();

    public void put(String key, Object value){
        IdTable.put(key, value);
    }

    public Object get(String key){
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



    }

}
