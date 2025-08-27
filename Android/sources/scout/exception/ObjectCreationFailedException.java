package scout.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/ObjectCreationFailedException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0})
public final class ObjectCreationFailedException extends ScoutException {
    public final Class a;
    public final cgd b;
    public final Throwable c;

    public ObjectCreationFailedException(Class cls, cgd cgd, Exception exc) {
        super(0);
        this.a = cls;
        this.b = cgd;
        this.c = exc;
    }

    public final Throwable getCause() {
        return this.c;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder("An error occurred during instance creation of ");
        sb.append("Object(type=" + this.a.getName() + ')');
        sb.append(' ');
        sb.append(this.b);
        return sb.toString();
    }
}
