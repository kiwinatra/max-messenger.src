package androidx.constraintlayout.core.parser;

public class CLParsingException extends Exception {
    public final String toString() {
        return "CLParsingException (" + hashCode() + ") : null (null at line 0)";
    }
}
