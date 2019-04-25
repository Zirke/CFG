import java.util.*;

public class SymbolTable {

    private Integer depth = 0;

    private HashMap<String, Sym> IdTable = new HashMap<>();

    public void put(String key, Sym value) {
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
            Sym node = IdTable.get(id);

            if (depth == (node.getDepth())) {
                remove.add(id);
            }
        }

        for (String s : remove) {
            IdTable.remove(s);
        }

        depth--;
    }

    public HashMap<String, Sym> getIdTable() {
        return IdTable;
    }
}
