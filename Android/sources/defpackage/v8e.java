package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: v8e  reason: default package */
public final class v8e {
    public static final v8e c = new v8e(u8e.a, CollectionsKt.emptyList());
    public final u8e a;
    public final List b;

    public v8e(u8e u8e, List list) {
        this.a = u8e;
        this.b = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.v8e) r5;
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
            boolean r1 = r5 instanceof defpackage.v8e
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            v8e r5 = (defpackage.v8e) r5
            u8e r1 = r5.a
            u8e r3 = r4.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowcaseState(state=");
        sb.append(this.a);
        sb.append(", content=");
        return tr1.l(sb, this.b, ")");
    }
}
