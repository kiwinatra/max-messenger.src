package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: w79  reason: default package */
public final class w79 implements mt8, kt8 {
    public final mt8[] a;
    public final IdentityHashMap b;
    public final p9a c;
    public final ArrayList o = new ArrayList();
    public final HashMap v = new HashMap();
    public kt8 w;
    public upf x;
    public mt8[] y;
    public vc3 z;

    public w79(p9a p9a, long[] jArr, mt8... mt8Arr) {
        this.c = p9a;
        this.a = mt8Arr;
        p9a.getClass();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        this.z = new vc3(k0d, k0d);
        this.b = new IdentityHashMap();
        this.y = new mt8[0];
        for (int i = 0; i < mt8Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new kjf(mt8Arr[i], j);
            }
        }
    }

    public final void A(long j) {
        this.z.A(j);
    }

    public final void b(mt8 mt8) {
        ArrayList arrayList = this.o;
        arrayList.remove(mt8);
        if (arrayList.isEmpty()) {
            mt8[] mt8Arr = this.a;
            int i = 0;
            for (mt8 x2 : mt8Arr) {
                i += x2.x().a;
            }
            spf[] spfArr = new spf[i];
            int i2 = 0;
            for (int i3 = 0; i3 < mt8Arr.length; i3++) {
                upf x3 = mt8Arr[i3].x();
                int i4 = x3.a;
                int i5 = 0;
                while (i5 < i4) {
                    spf a2 = x3.a(i5);
                    ea6[] ea6Arr = new ea6[a2.a];
                    for (int i6 = 0; i6 < a2.a; i6++) {
                        ea6 ea6 = a2.d[i6];
                        ba6 a3 = ea6.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = ea6.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a3.a = sb.toString();
                        ea6Arr[i6] = a3.a();
                    }
                    spf spf = new spf(i3 + ":" + a2.b, ea6Arr);
                    this.v.put(spf, a2);
                    spfArr[i2] = spf;
                    i5++;
                    i2++;
                }
            }
            this.x = new upf(spfArr);
            kt8 kt8 = this.w;
            kt8.getClass();
            kt8.b(this);
        }
    }

    public final void c(qsd qsd) {
        mt8 mt8 = (mt8) qsd;
        kt8 kt8 = this.w;
        kt8.getClass();
        kt8.c(this);
    }

    public final boolean d() {
        return this.z.d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.md5[] r23, boolean[] r24, defpackage.lcd[] r25, boolean[] r26, long r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r5 = 0
            r6 = r5
        L_0x000e:
            int r7 = r1.length
            java.util.IdentityHashMap r8 = r0.b
            if (r6 >= r7) goto L_0x004b
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0019
            r9 = 0
            goto L_0x0020
        L_0x0019:
            java.lang.Object r7 = r8.get(r7)
            r9 = r7
            java.lang.Integer r9 = (java.lang.Integer) r9
        L_0x0020:
            r7 = -1
            if (r9 != 0) goto L_0x0025
            r8 = r7
            goto L_0x0029
        L_0x0025:
            int r8 = r9.intValue()
        L_0x0029:
            r3[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L_0x0046
            spf r7 = r8.a()
            java.lang.String r7 = r7.b
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r4[r6] = r7
            goto L_0x0048
        L_0x0046:
            r4[r6] = r7
        L_0x0048:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x004b:
            r8.clear()
            int r6 = r1.length
            lcd[] r7 = new defpackage.lcd[r6]
            int r10 = r1.length
            lcd[] r10 = new defpackage.lcd[r10]
            int r11 = r1.length
            md5[] r15 = new defpackage.md5[r11]
            java.util.ArrayList r14 = new java.util.ArrayList
            mt8[] r13 = r0.a
            int r11 = r13.length
            r14.<init>(r11)
            r18 = r27
            r12 = r5
        L_0x0062:
            int r11 = r13.length
            if (r12 >= r11) goto L_0x0106
            r11 = r5
        L_0x0066:
            int r5 = r1.length
            if (r11 >= r5) goto L_0x00a0
            r5 = r3[r11]
            if (r5 != r12) goto L_0x0070
            r5 = r2[r11]
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            r10[r11] = r5
            r5 = r4[r11]
            if (r5 != r12) goto L_0x0096
            r5 = r1[r11]
            r5.getClass()
            spf r9 = r5.a()
            r16 = r14
            java.util.HashMap r14 = r0.v
            java.lang.Object r9 = r14.get(r9)
            spf r9 = (defpackage.spf) r9
            r9.getClass()
            s79 r14 = new s79
            r14.<init>(r5, r9)
            r15[r11] = r14
            r5 = 0
            goto L_0x009b
        L_0x0096:
            r16 = r14
            r5 = 0
            r15[r11] = r5
        L_0x009b:
            int r11 = r11 + 1
            r14 = r16
            goto L_0x0066
        L_0x00a0:
            r16 = r14
            r5 = 0
            r11 = r13[r12]
            r9 = r12
            r12 = r15
            r20 = r13
            r13 = r24
            r5 = r16
            r14 = r10
            r21 = r15
            r15 = r26
            r16 = r18
            long r11 = r11.g(r12, r13, r14, r15, r16)
            if (r9 != 0) goto L_0x00bd
            r18 = r11
            goto L_0x00c1
        L_0x00bd:
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 != 0) goto L_0x00fe
        L_0x00c1:
            r11 = 0
            r12 = 0
        L_0x00c3:
            int r13 = r1.length
            if (r11 >= r13) goto L_0x00ed
            r13 = r4[r11]
            r14 = 1
            if (r13 != r9) goto L_0x00dd
            r12 = r10[r11]
            r12.getClass()
            r13 = r10[r11]
            r7[r11] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r8.put(r12, r13)
            r12 = r14
            goto L_0x00ea
        L_0x00dd:
            r13 = r3[r11]
            if (r13 != r9) goto L_0x00ea
            r13 = r10[r11]
            if (r13 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r14 = 0
        L_0x00e7:
            defpackage.n79.n(r14)
        L_0x00ea:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00ed:
            if (r12 == 0) goto L_0x00f4
            r11 = r20[r9]
            r5.add(r11)
        L_0x00f4:
            int r12 = r9 + 1
            r14 = r5
            r13 = r20
            r15 = r21
            r5 = 0
            goto L_0x0062
        L_0x00fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Children enabled at different positions."
            r0.<init>(r1)
            throw r0
        L_0x0106:
            r1 = r5
            r5 = r14
            java.lang.System.arraycopy(r7, r1, r2, r1, r6)
            mt8[] r1 = new defpackage.mt8[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            mt8[] r1 = (defpackage.mt8[]) r1
            r0.y = r1
            p79 r1 = new p79
            r2 = 1
            r1.<init>(r2)
            java.util.AbstractList r1 = defpackage.gsg.H(r1, r5)
            p9a r2 = r0.c
            r2.getClass()
            vc3 r2 = new vc3
            r2.<init>(r5, r1)
            r0.z = r2
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w79.g(md5[], boolean[], lcd[], boolean[], long):long");
    }

    public final long h(long j, und und) {
        mt8[] mt8Arr = this.y;
        return (mt8Arr.length > 0 ? mt8Arr[0] : this.a[0]).h(j, und);
    }

    public final long i() {
        return this.z.i();
    }

    public final void j(kt8 kt8, long j) {
        this.w = kt8;
        ArrayList arrayList = this.o;
        mt8[] mt8Arr = this.a;
        Collections.addAll(arrayList, mt8Arr);
        for (mt8 j2 : mt8Arr) {
            j2.j(this, j);
        }
    }

    public final boolean k(d38 d38) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.z.k(d38);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mt8) arrayList.get(i)).k(d38);
        }
        return false;
    }

    public final void r() {
        for (mt8 r : this.a) {
            r.r();
        }
    }

    public final long s(long j) {
        long s = this.y[0].s(j);
        int i = 1;
        while (true) {
            mt8[] mt8Arr = this.y;
            if (i >= mt8Arr.length) {
                return s;
            }
            if (mt8Arr[i].s(s) == s) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long w() {
        long j = -9223372036854775807L;
        for (mt8 mt8 : this.y) {
            long w2 = mt8.w();
            if (w2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    mt8[] mt8Arr = this.y;
                    int length = mt8Arr.length;
                    int i = 0;
                    while (i < length) {
                        mt8 mt82 = mt8Arr[i];
                        if (mt82 == mt8) {
                            break;
                        } else if (mt82.s(w2) == w2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = w2;
                } else if (w2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || mt8.s(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final upf x() {
        upf upf = this.x;
        upf.getClass();
        return upf;
    }

    public final long y() {
        return this.z.y();
    }

    public final void z(long j, boolean z2) {
        for (mt8 z3 : this.y) {
            z3.z(j, z2);
        }
    }
}
