package symbolTable;

import java.util.Objects;

public class TRUNType {
    private byte kind;
    public static final byte TRUTH = 0, INT = 1, DECIMAL = 2, TEXT = 3;

    public TRUNType(byte kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TRUNType type = (TRUNType) o;
        return kind == type.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind);
    }

    public static TRUNType truthT = new TRUNType(TRUTH);
    public static TRUNType intT = new TRUNType(INT);
    public static TRUNType decimalT = new TRUNType(DECIMAL);
    public static TRUNType textT = new TRUNType(TEXT);

}
