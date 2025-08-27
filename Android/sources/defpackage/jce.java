package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: jce  reason: default package */
public final class jce extends ikf {
    public static final Object w0 = new Object();
    public final boolean X;
    public final Object Y;
    public final gr8 Z;
    public final long b;
    public final long c;
    public final long o;
    public final long v;
    public final vq8 v0;
    public final long w;
    public final long x;
    public final boolean y;
    public final boolean z;

    static {
        oq8 oq8 = new oq8();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        List emptyList = Collections.emptyList();
        k0d k0d2 = k0d.v;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new zq8(uri, (cvg) null, emptyList, k0d2);
        }
        oq8.b();
        ts8 ts8 = ts8.Q0;
    }

    public jce(long j, long j2, long j3, long j4, long j5, long j6, boolean z2, boolean z3, boolean z4, ejd ejd, gr8 gr8, vq8 vq8) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.v = j4;
        this.w = j5;
        this.x = j6;
        this.y = z2;
        this.z = z3;
        this.X = z4;
        this.Y = ejd;
        gr8.getClass();
        this.Z = gr8;
        this.v0 = vq8;
    }

    public final int b(Object obj) {
        return w0.equals(obj) ? 0 : -1;
    }

    public final dkf g(int i, dkf dkf, boolean z2) {
        y64.i(i, 1);
        Object obj = z2 ? w0 : null;
        long j = -this.w;
        dkf.getClass();
        dkf.h((Object) null, obj, 0, this.o, j, p9.w, false);
        return dkf;
    }

    public final int i() {
        return 1;
    }

    public final Object m(int i) {
        y64.i(i, 1);
        return w0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 > r3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gkf n(int r25, defpackage.gkf r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.y64.i(r2, r1)
            long r1 = r0.x
            boolean r14 = r0.z
            if (r14 == 0) goto L_0x002d
            boolean r3 = r0.X
            if (r3 != 0) goto L_0x002d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002d
            long r3 = r0.v
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0026
        L_0x0023:
            r16 = r5
            goto L_0x002f
        L_0x0026:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x002d
            goto L_0x0023
        L_0x002d:
            r16 = r1
        L_0x002f:
            java.lang.Object r4 = defpackage.gkf.A0
            long r1 = r0.v
            r18 = r1
            r20 = 0
            gr8 r5 = r0.Z
            java.lang.Object r6 = r0.Y
            long r7 = r0.b
            long r9 = r0.c
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.y
            vq8 r15 = r0.v0
            r21 = 0
            long r0 = r0.w
            r22 = r0
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jce.n(int, gkf, long):gkf");
    }

    public final int p() {
        return 1;
    }
}
