package defpackage;

import java.nio.charset.CodingErrorAction;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ed9  reason: default package */
public final class ed9 implements Cloneable {
    public boolean a;
    public boolean b;
    public CodingErrorAction c;
    public CodingErrorAction o;
    public int v;
    public int w;
    public int x;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ed9] */
    public final Object clone() {
        ? obj = new Object();
        obj.a = true;
        obj.b = true;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        obj.c = codingErrorAction;
        obj.o = codingErrorAction;
        obj.v = IntCompanionObject.MAX_VALUE;
        obj.w = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj.x = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.o = this.o;
        obj.v = this.v;
        obj.w = this.w;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.ed9) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.ed9
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            ed9 r4 = (defpackage.ed9) r4
            boolean r0 = r4.a
            boolean r2 = r3.a
            if (r2 != r0) goto L_0x0033
            boolean r0 = r3.b
            boolean r2 = r4.b
            if (r0 != r2) goto L_0x0033
            java.nio.charset.CodingErrorAction r0 = r3.c
            java.nio.charset.CodingErrorAction r2 = r4.c
            if (r0 != r2) goto L_0x0033
            java.nio.charset.CodingErrorAction r0 = r3.o
            java.nio.charset.CodingErrorAction r2 = r4.o
            if (r0 != r2) goto L_0x0033
            int r0 = r3.v
            int r2 = r4.v
            if (r0 != r2) goto L_0x0033
            int r0 = r3.x
            int r2 = r4.x
            if (r0 != r2) goto L_0x0033
            int r3 = r3.w
            int r4 = r4.w
            if (r3 != r4) goto L_0x0033
            r1 = 1
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31;
        int i2 = 0;
        CodingErrorAction codingErrorAction = this.c;
        int hashCode = (i + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        CodingErrorAction codingErrorAction2 = this.o;
        if (codingErrorAction2 != null) {
            i2 = codingErrorAction2.hashCode();
        }
        return ((((((hashCode + i2) * 31) + this.v) * 31) + this.w) * 31) + this.x;
    }
}
