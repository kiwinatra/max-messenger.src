package scout.exception;

import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/MappingCreationFailedException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0})
public final class MappingCreationFailedException extends ScoutException {
    public final Pair a;
    public final cgd b;
    public final Throwable c;

    public MappingCreationFailedException(Pair pair, cgd cgd, Exception exc) {
        super(0);
        this.a = pair;
        this.b = cgd;
        this.c = exc;
    }

    public final Throwable getCause() {
        return this.c;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder("An error occurred during mapping creation of ");
        StringBuilder sb2 = new StringBuilder("Association(keyType=");
        Pair pair = this.a;
        sb2.append(((Class) pair.getFirst()).getName());
        sb2.append(",valueType=");
        sb2.append(((Class) pair.getSecond()).getName());
        sb2.append(')');
        sb.append(sb2.toString());
        sb.append(' ');
        sb.append(this.b);
        return sb.toString();
    }
}
