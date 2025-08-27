package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: oe5  reason: default package */
public final class oe5 extends ibf {
    public final Long c;
    public final String o;

    public oe5(String str, Long l) {
        this.c = l;
        this.o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe5)) {
            return false;
        }
        oe5 oe5 = (oe5) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) oe5.c) && Intrinsics.areEqual((Object) this.o, (Object) oe5.o);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.c;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.o;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Response(botId=" + this.c + ", startParams=" + this.o + ")";
    }
}
