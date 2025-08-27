package scout.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/ScopeInitializationException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0})
public final class ScopeInitializationException extends ScoutException {
    public final String a;
    public final Throwable b;

    public ScopeInitializationException(String str, Exception exc) {
        super(0);
        this.a = str;
        this.b = exc;
    }

    public final Throwable getCause() {
        return this.b;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Initialization of scope ");
        sb.append("Scope(name=\"" + this.a + "\")");
        sb.append(" failed.");
        return sb.toString();
    }
}
