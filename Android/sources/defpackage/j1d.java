package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j1d  reason: default package */
public final class j1d extends ibf {
    public final Long c;

    public j1d(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1d) && Intrinsics.areEqual((Object) this.c, (Object) ((j1d) obj).c);
    }

    public final int hashCode() {
        Long l = this.c;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return StringsKt__IndentKt.trimMargin$default("Response(\n            |timestampRemoveProfile=" + this.c + "\n            |)", (String) null, 1, (Object) null);
    }
}
