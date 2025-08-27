package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vv9  reason: default package */
public final class vv9 extends ibf {
    public final Map c;

    public vv9(ts tsVar) {
        this.c = tsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vv9) && Intrinsics.areEqual((Object) this.c, (Object) ((vv9) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Response(messagesReactions=" + this.c + ")";
    }
}
