package scout.exception;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/IllegalOverridesException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0})
public final class IllegalOverridesException extends ScoutException {
    public final String a;
    public final Throwable b = null;
    public final Set c;

    public IllegalOverridesException(String str, Collection collection) {
        super(0);
        this.a = str;
        this.c = CollectionsKt.toSet(collection);
    }

    public final Throwable getCause() {
        return this.b;
    }

    public final String getMessage() {
        Set set = this.c;
        int size = set.size();
        String str = this.a;
        if (size == 1) {
            StringBuilder sb = new StringBuilder("Object factory for ");
            sb.append("Object(type=" + ((Class) CollectionsKt.first(set)).getName() + ')');
            sb.append(" already exist in ");
            sb.append("Scope(name=\"" + str + "\")");
            sb.append(" and override is not allowed");
            return sb.toString();
        }
        String lineSeparator = System.lineSeparator();
        StringBuilder sb2 = new StringBuilder("Multiple object factories already exist in ");
        sb2.append("Scope(name=\"" + str + "\")");
        sb2.append(" and overrides are not allowed:");
        sb2.append(System.lineSeparator());
        return CollectionsKt___CollectionsKt.joinToString$default(this.c, lineSeparator, sb2.toString(), (CharSequence) null, 0, (CharSequence) null, m61.y, 28, (Object) null);
    }
}
