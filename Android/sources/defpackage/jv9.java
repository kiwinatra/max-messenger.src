package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jv9  reason: default package */
public final class jv9 extends ibf {
    public final long c;
    public final Set o;

    public jv9(long j, LinkedHashSet linkedHashSet) {
        this.c = j;
        this.o = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv9)) {
            return false;
        }
        jv9 jv9 = (jv9) obj;
        return this.c == jv9.c && Intrinsics.areEqual((Object) this.o, (Object) jv9.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "Response(chatId=" + this.c + ", messageIds=" + this.o + ")";
    }
}
