package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: h0f  reason: default package */
public final class h0f {
    public final g0f a;
    public final List b;

    public h0f(g0f g0f, ArrayList arrayList) {
        this.a = g0f;
        this.b = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.h0f) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.h0f
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            h0f r5 = (defpackage.h0f) r5
            g0f r1 = r5.a
            g0f r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r4 = r4.b
            java.util.List r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestionSearchResult(state=");
        sb.append(this.a);
        sb.append(", mentions=");
        return tr1.l(sb, this.b, ")");
    }
}
