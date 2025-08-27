package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ahg  reason: default package */
public final class ahg extends ibf {
    public final String c;
    public final String o;

    public ahg(String str, String str2) {
        this.c = str;
        this.o = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahg)) {
            return false;
        }
        ahg ahg = (ahg) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) ahg.c) && Intrinsics.areEqual((Object) this.o, (Object) ahg.o);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.o;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(url=");
        sb.append(this.c);
        sb.append(", queryId=");
        return wj6.n(sb, this.o, ")");
    }
}
