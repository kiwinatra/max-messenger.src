package defpackage;

import java.io.Serializable;

/* renamed from: g2d  reason: default package */
public final class g2d implements Serializable {
    public final e2d a;
    public final c2d b;
    public final String c;
    public final web o;
    public final v5b v;

    public g2d(e2d e2d, c2d c2d, String str, web web, v5b v5b) {
        this.a = e2d;
        this.b = c2d;
        this.c = str;
        this.o = web;
        this.v = v5b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.g2d) r5;
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
            boolean r1 = r5 instanceof defpackage.g2d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            g2d r5 = (defpackage.g2d) r5
            e2d r1 = r5.a
            e2d r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            c2d r1 = r4.b
            c2d r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            web r1 = r4.o
            web r3 = r5.o
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            v5b r4 = r4.v
            v5b r5 = r5.v
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d = g63.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        int i = 0;
        web web = this.o;
        int hashCode = (d + (web == null ? 0 : web.hashCode())) * 31;
        v5b v5b = this.v;
        if (v5b != null) {
            i = v5b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ReplyButton(type=" + this.a + ", intent=" + this.b + ", text=" + this.c + ", image=" + this.o + ", outgoingMessage=" + this.v + ")";
    }
}
