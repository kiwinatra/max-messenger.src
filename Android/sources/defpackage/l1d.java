package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l1d  reason: default package */
public final class l1d extends ibf {
    public final Long c;

    public l1d(Long l) {
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1d) && Intrinsics.areEqual((Object) this.c, (Object) ((l1d) obj).c);
    }

    public final int hashCode() {
        Long l = this.c;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return StringsKt__IndentKt.trimMargin$default("Response(\n                    |timestampRemoveProfile=" + this.c + "\n                    |)", (String) null, 1, (Object) null);
    }
}
