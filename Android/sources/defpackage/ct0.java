package defpackage;

/* renamed from: ct0  reason: default package */
public final class ct0 {
    public final int a;

    public /* synthetic */ ct0(int i) {
        this.a = i;
    }

    public static final boolean a(int i) {
        return (i & 268435456) != 0;
    }

    public static final boolean b(int i) {
        return (i & 67108864) != 0;
    }

    public static final boolean c(int i) {
        return (i & 134217728) != 0;
    }

    public static String d(int i) {
        String str = a(i) ? "First" : (536870912 & i) != 0 ? "Middle" : (1073741824 & i) != 0 ? "Last" : c(i) ? "Single" : "unknown!";
        char c = b(i) ? (char) 8595 : 8593;
        return "BubbleType(" + str + " " + c + ")";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = ((defpackage.ct0) r3).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.ct0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0010
        L_0x0006:
            ct0 r3 = (defpackage.ct0) r3
            int r3 = r3.a
            int r2 = r2.a
            if (r2 == r3) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
