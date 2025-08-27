package defpackage;

import java.util.Arrays;

/* renamed from: bm  reason: default package */
public final class bm {
    public final int a;
    public final ox0 b;
    public final pl c;
    public final String d;

    public bm(ox0 ox0, pl plVar, String str) {
        this.b = ox0;
        this.c = plVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{ox0, plVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return kne.o(this.b, bmVar.b) && kne.o(this.c, bmVar.c) && kne.o(this.d, bmVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
