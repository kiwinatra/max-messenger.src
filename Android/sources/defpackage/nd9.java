package defpackage;

import java.io.Serializable;

/* renamed from: nd9  reason: default package */
public final class nd9 implements Serializable {
    public final vd9 a;
    public final String b;

    public nd9(vd9 vd9, String str) {
        this.a = vd9;
        this.b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.nd9) r5;
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
            boolean r1 = r5 instanceof defpackage.nd9
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            nd9 r5 = (defpackage.nd9) r5
            vd9 r1 = r5.a
            vd9 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageReaction(reactionType=");
        sb.append(this.a);
        sb.append(", id=");
        return wj6.n(sb, this.b, ")");
    }
}
