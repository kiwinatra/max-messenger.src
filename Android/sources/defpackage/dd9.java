package defpackage;

import kotlin.io.ConstantsKt;

/* renamed from: dd9  reason: default package */
public final class dd9 implements Cloneable {
    public int a;
    public int b;
    public int c;
    public boolean o;

    /* JADX WARNING: type inference failed for: r0v0, types: [dd9, java.lang.Object] */
    public final Object clone() {
        ? obj = new Object();
        obj.a = ConstantsKt.MINIMUM_BLOCK_SIZE;
        obj.b = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj.c = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj.o = true;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.o = this.o;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.dd9) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.dd9
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            dd9 r4 = (defpackage.dd9) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 != r0) goto L_0x0021
            int r0 = r3.b
            int r2 = r4.b
            if (r0 != r2) goto L_0x0021
            int r0 = r3.c
            int r2 = r4.c
            if (r0 != r2) goto L_0x0021
            boolean r3 = r3.o
            boolean r4 = r4.o
            if (r3 != r4) goto L_0x0021
            r1 = 1
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + (this.o ? 1 : 0);
    }
}
