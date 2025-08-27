package defpackage;

/* renamed from: yh7  reason: default package */
public final class yh7 {
    public static final yh7 c = new yh7((jdb) null, (nr0) null, 3);
    public static final yh7 d;
    public final jdb a;
    public final nr0 b;

    static {
        jdb jdb = jdb.b;
        jdb jdb2 = anf.a;
        d = new yh7(jdb, new nr0(jdb, mr0.c, false));
    }

    public yh7(jdb jdb, nr0 nr0) {
        this.a = jdb;
        this.b = nr0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r3 == r1) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.yh7
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            yh7 r6 = (defpackage.yh7) r6
            jdb r1 = r6.a
            jdb r3 = r5.a
            if (r3 != 0) goto L_0x0015
            if (r1 != 0) goto L_0x0028
            goto L_0x001c
        L_0x0015:
            if (r1 != 0) goto L_0x0018
            goto L_0x0028
        L_0x0018:
            jdb r4 = defpackage.anf.a
            if (r3 != r1) goto L_0x0028
        L_0x001c:
            nr0 r5 = r5.b
            nr0 r6 = r6.b
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 != 0) goto L_0x0027
            return r2
        L_0x0027:
            return r0
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        jdb jdb = this.a;
        if (jdb == null) {
            i = 0;
        } else {
            jdb jdb2 = anf.a;
            i = jdb.hashCode();
        }
        int i3 = i * 31;
        nr0 nr0 = this.b;
        if (nr0 != null) {
            i2 = nr0.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        String str;
        jdb jdb = this.a;
        if (jdb == null) {
            str = "null";
        } else {
            jdb jdb2 = anf.a;
            str = "TopInsetConfig(persistentType=" + jdb + ")";
        }
        return "InsetsConfig(topConfig=" + str + ", bottomConfig=" + this.b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh7(jdb jdb, nr0 nr0, int i) {
        this((i & 1) != 0 ? null : jdb, (i & 2) != 0 ? null : nr0);
    }
}
