package defpackage;

import androidx.work.WorkRequest;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: xpg  reason: default package */
public final class xpg {
    public static final String u = h88.V("WorkSpec");
    public static final es1 v = new es1(17);
    public final String a;
    public xog b;
    public final String c;
    public String d;
    public t64 e;
    public final t64 f;
    public long g;
    public long h;
    public long i;
    public wj3 j;
    public int k;
    public ag0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public t5b r;
    public final int s;
    public final int t;

    public xpg(String str, xog xog, String str2, String str3, t64 t64, t64 t642, long j2, long j3, long j4, wj3 wj3, int i2, ag0 ag0, long j5, long j6, long j7, long j8, boolean z, t5b t5b, int i3, int i4) {
        this.a = str;
        this.b = xog;
        this.c = str2;
        this.d = str3;
        this.e = t64;
        this.f = t642;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = wj3;
        this.k = i2;
        this.l = ag0;
        this.m = j5;
        this.n = j6;
        this.o = j7;
        this.p = j8;
        this.q = z;
        this.r = t5b;
        this.s = i3;
        this.t = i4;
    }

    public static xpg b(xpg xpg, String str, xog xog, String str2, t64 t64, int i2, long j2, int i3, int i4) {
        xpg xpg2 = xpg;
        int i5 = i4;
        String str3 = (i5 & 1) != 0 ? xpg2.a : str;
        xog xog2 = (i5 & 2) != 0 ? xpg2.b : xog;
        String str4 = (i5 & 4) != 0 ? xpg2.c : str2;
        String str5 = xpg2.d;
        t64 t642 = (i5 & 16) != 0 ? xpg2.e : t64;
        t64 t643 = xpg2.f;
        long j3 = xpg2.g;
        long j4 = xpg2.h;
        long j5 = xpg2.i;
        wj3 wj3 = xpg2.j;
        int i6 = (i5 & 1024) != 0 ? xpg2.k : i2;
        long j6 = j5;
        ag0 ag0 = xpg2.l;
        long j7 = xpg2.m;
        long j8 = (i5 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? xpg2.n : j2;
        long j9 = xpg2.o;
        long j10 = xpg2.p;
        boolean z = xpg2.q;
        wj3 wj32 = wj3;
        t5b t5b = xpg2.r;
        int i7 = xpg2.s;
        int i8 = (i5 & 524288) != 0 ? xpg2.t : i3;
        xpg.getClass();
        return new xpg(str3, xog2, str4, str5, t642, t643, j3, j4, j6, wj32, i6, ag0, j7, j8, j9, j10, z, t5b, i7, i8);
    }

    public final long a() {
        int i2;
        if (this.b != xog.a || (i2 = this.k) <= 0) {
            long j2 = 0;
            if (d()) {
                int i3 = this.s;
                long j3 = this.n;
                if (i3 == 0) {
                    j3 += this.g;
                }
                long j4 = this.i;
                long j5 = this.h;
                if (j4 != j5) {
                    if (i3 == 0) {
                        j2 = ((long) -1) * j4;
                    }
                    j3 += j5;
                } else if (i3 != 0) {
                    j2 = j5;
                }
                return j3 + j2;
            }
            long j6 = this.n;
            if (j6 == 0) {
                j6 = System.currentTimeMillis();
            }
            return this.g + j6;
        }
        return RangesKt.coerceAtMost(this.l == ag0.b ? this.m * ((long) i2) : (long) Math.scalb((float) this.m, i2 - 1), (long) WorkRequest.MAX_BACKOFF_MILLIS) + this.n;
    }

    public final boolean c() {
        return !Intrinsics.areEqual((Object) wj3.i, (Object) this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final void e(long j2) {
        int i2 = (j2 > WorkRequest.MAX_BACKOFF_MILLIS ? 1 : (j2 == WorkRequest.MAX_BACKOFF_MILLIS ? 0 : -1));
        String str = u;
        if (i2 > 0) {
            h88.x().Z(str, "Backoff delay duration exceeds maximum value");
        }
        if (j2 < WorkRequest.MIN_BACKOFF_MILLIS) {
            h88.x().Z(str, "Backoff delay duration less than minimum value");
        }
        this.m = RangesKt.coerceIn(j2, (long) WorkRequest.MIN_BACKOFF_MILLIS, (long) WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpg)) {
            return false;
        }
        xpg xpg = (xpg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xpg.a) && this.b == xpg.b && Intrinsics.areEqual((Object) this.c, (Object) xpg.c) && Intrinsics.areEqual((Object) this.d, (Object) xpg.d) && Intrinsics.areEqual((Object) this.e, (Object) xpg.e) && Intrinsics.areEqual((Object) this.f, (Object) xpg.f) && this.g == xpg.g && this.h == xpg.h && this.i == xpg.i && Intrinsics.areEqual((Object) this.j, (Object) xpg.j) && this.k == xpg.k && this.l == xpg.l && this.m == xpg.m && this.n == xpg.n && this.o == xpg.o && this.p == xpg.p && this.q == xpg.q && this.r == xpg.r && this.s == xpg.s && this.t == xpg.t;
    }

    public final int hashCode() {
        int d2 = g63.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = str == null ? 0 : str.hashCode();
        int i2 = wzf.i(wzf.i(wzf.i(wzf.i((this.l.hashCode() + rae.h(this.k, (this.j.hashCode() + wzf.i(wzf.i(wzf.i((this.f.hashCode() + ((this.e.hashCode() + ((d2 + hashCode) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        if (z) {
            z = true;
        }
        return Integer.hashCode(this.t) + rae.h(this.s, (this.r.hashCode() + ((i2 + (z ? 1 : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return g63.l(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ xpg(java.lang.String r31, defpackage.xog r32, java.lang.String r33, java.lang.String r34, defpackage.t64 r35, defpackage.t64 r36, long r37, long r39, long r41, defpackage.wj3 r43, int r44, defpackage.ag0 r45, long r46, long r48, long r50, long r52, boolean r54, defpackage.t5b r55, int r56, int r57, int r58) {
        /*
            r30 = this;
            r0 = r57
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            xog r1 = defpackage.xog.a
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r32
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r6 = r1
            goto L_0x0015
        L_0x0013:
            r6 = r34
        L_0x0015:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001d
            t64 r1 = defpackage.t64.b
            r7 = r1
            goto L_0x001f
        L_0x001d:
            r7 = r35
        L_0x001f:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0027
            t64 r1 = defpackage.t64.b
            r8 = r1
            goto L_0x0029
        L_0x0027:
            r8 = r36
        L_0x0029:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r37
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r39
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r41
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004b
            wj3 r1 = defpackage.wj3.i
            r15 = r1
            goto L_0x004d
        L_0x004b:
            r15 = r43
        L_0x004d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x0055
            r16 = r5
            goto L_0x0057
        L_0x0055:
            r16 = r44
        L_0x0057:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0060
            ag0 r1 = defpackage.ag0.a
            r17 = r1
            goto L_0x0062
        L_0x0060:
            r17 = r45
        L_0x0062:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0069
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x006b
        L_0x0069:
            r18 = r46
        L_0x006b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0072
            r20 = r2
            goto L_0x0074
        L_0x0072:
            r20 = r48
        L_0x0074:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x007b
            r22 = r2
            goto L_0x007d
        L_0x007b:
            r22 = r50
        L_0x007d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0088
            r1 = -1
            r24 = r1
            goto L_0x008a
        L_0x0088:
            r24 = r52
        L_0x008a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0092
            r26 = r5
            goto L_0x0094
        L_0x0092:
            r26 = r54
        L_0x0094:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009e
            t5b r1 = defpackage.t5b.a
            r27 = r1
            goto L_0x00a0
        L_0x009e:
            r27 = r55
        L_0x00a0:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a8
            r28 = r5
            goto L_0x00aa
        L_0x00a8:
            r28 = r56
        L_0x00aa:
            r29 = 0
            r2 = r30
            r3 = r31
            r5 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpg.<init>(java.lang.String, xog, java.lang.String, java.lang.String, t64, t64, long, long, long, wj3, int, ag0, long, long, long, long, boolean, t5b, int, int, int):void");
    }
}
