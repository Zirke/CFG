package symbolTable;

import java.util.*;

public class SymbolTable {

    private Integer depth = 0;

    private HashMap<String, Symbol> IdTable = new HashMap<>();

    public void put(String key, Symbol value) {
        IdTable.put(key, value);
    }

    public Object get(String key) {
        return IdTable.get(key);
    }

    public String toString() {
        return IdTable.toString();
    }

    public int getDepth() {
        return depth;
    }

    public void openScope() {
        depth++;
    }

    public void closeScope() {

        List<String> remove = new ArrayList<>();
        for (String id : IdTable.keySet()) {
            Symbol node = IdTable.get(id);

            if (depth == (node.getDepth())) {
                remove.add(id);
            }
        }

        for (String s : remove) {
            IdTable.remove(s);
        }

        depth--;
    }

    public HashMap<String, Symbol> getIdTable() {
        return IdTable;
    }
}
