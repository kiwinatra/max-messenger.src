package androidx.core.os;

public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        super("The operation has been canceled.");
    }
}
